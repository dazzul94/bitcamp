package java100.app.beans;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class ApplicationContext {
    public HashMap<String, Object> pool = new HashMap<>();

    public ApplicationContext() {
    }

    public ApplicationContext(String proPath) {
        Properties props = new Properties();

        try (FileReader in = new FileReader(proPath)) {
            props.load(in);

            Set<Object> keySet = props.keySet();
            for (Object key : keySet) {
                String name = (String) key;

                Class<?> clazz = Class.forName(props.getProperty(name));

                Object obj = clazz.newInstance();

                pool.put(name, obj);
            }
            
            injectDependency();
        } catch (Exception e) {
            throw new BeansException("프로퍼티 파일 로딩중 오류 발생!",e);
        }
    }

    public Object getBean(String name) { // 왜 스태틱으로 만들었나? Dao에서 호출하려고
        Object bean = pool.get(name);
        if (bean == null)
            throw new BeansException("빈을 찾을 수 없습니다");
        return bean;
    }

    public void addBean(String name, Object bean) {
        pool.put(name, bean);
    }

    public String[] getBeanDefinitionNames() {
        Set<String> keySet = pool.keySet();

        String[] names = new String[keySet.size()];

        keySet.toArray(names);

        return names;// keySet에 담긴 이름들을 names를 준비해서 names에 저장함
    }

    private void injectDependency() {
        Collection<Object> objs = pool.values();

        for (Object obj : objs) {
            // System.out.println(obj.getClass().getName());
            invokeSetter(obj);
        }
    }

    private void invokeSetter(Object obj) {
        Method[] methods = obj.getClass().getDeclaredMethods();

        for (Method method : methods) {

            if (!method.getName().startsWith("set"))
                continue;
            // System.out.println("=> " + method.getName());
            Object dependency = findObject(getFirstParameterType(method));

            if (dependency == null)
                continue;
            try {
                method.invoke(obj, dependency);
                System.out.printf("%s.%s 호출됨!", obj.getClass().getName());
            } catch (Exception e) {
                throw new BeansException(obj.getClass().getName() + " 클래스의 " + method.getName() + " 메서드 호출 오류");

            }

        }

    }

    private Class<?> getFirstParameterType(Method method) {
        return method.getParameterTypes()[0];
    }

    private Object findObject(Class<?> type) {
        Collection<Object> objs = pool.values();
        for (Object obj : objs) {
            if (type.isInstance(obj))
                return obj;
        }
        return null;
    }
    public void refreshBeanFactory() {
        injectDependency();
    }
}

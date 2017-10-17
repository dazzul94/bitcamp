package bitcamp.java100;
public class Test18_6 {
    //String-정규식을 이용하여 문자열을 검사하기
    public static void main(String[] args) {
        String email = "hong@test.com";
        //정규표현식 - regular Expression
        System.out.println(email.matches("1hong@test.com"));
        System.out.println(email.matches(".+@.+\\..+")); //자바는 \\써줘야함 // +: 한자이상!
        System.out.println(email.matches("^\\D.+@.+\\..+")); 
        
        String str = "홍길동(hong@test.com),임꺽정(leem@test.com)," +
        "유관순(yoo@test.com),안중근(ahn@test.com),윤봉길(yoon@test.com)";
        
        java.util.regex.Pattern pattern = 
                java.util.regex.Pattern.compile("\\w+@\\w+\\.\\w+");
        java.util.regex.Matcher matcher = pattern.matcher(str);
        
        int startIndex = 0;
        while (matcher.find(startIndex)) {
            System.out.println(startIndex);
            String matchString = matcher.group();
            startIndex = matcher.end();
        
            System.out.println(matchString);
        }
    }      
}

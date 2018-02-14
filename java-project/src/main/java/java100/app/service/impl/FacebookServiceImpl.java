package java100.app.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java100.app.service.FacebookService;

@Service
public class FacebookServiceImpl implements FacebookService {

    @Override
    public <T> T me(String accessToken, Class<T> type) {
        RestTemplate restTemplate = new RestTemplate(); // 페이스북 서버한테 요청
        try {
            return restTemplate.getForObject(
                    // Map에 담는다면 v1, v2를 찾아가고 배열이라면 그냥 순서대로 넣어준다
                    "https://graph.facebook.com/v2.12/me?access_token={v1}&fields={v2}", 
                    type, // return type
                    accessToken, "id,name,email,gender,devices");
            
        } catch (Exception e) {
            throw new RuntimeException("페이스북 Graph API 실행 오류!", e);
        }
    
    }

}

package com.detroitlabs.golfrankapp.service;

import com.detroitlabs.golfrankapp.model.Courses;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Component
public class GolfCourseService {

    public Courses fetchCourseInfo(){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("Content-Type", "application/x-www-form-urlencoded");
        headers.add("host", "api.golfbert.com");
        headers.add("X-Amz-Date", "20190311T132954Z");
        headers.add("Authorization", "AWS4-HMAC-SHA256 Credential=AKIAIS764CPHT6C4KR7Q/20190311/us-east-1/execute-api/aws4_request, SignedHeaders=cache-control;content-type;host;postman-token;x-amz-date;x-api-key, Signature=fd5c8680c555ca0dc5bbac873e2afe93d0532633ebdad11366f57d85717453f1");
        headers.add("x-api-key", "vXOi67jCzW7VORJuPD3hx1282d3Exjqc7BuIsmK8");
        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        restTemplate.exchange("https://api.golfbert.com/v1/courses", HttpMethod.GET, entity, String.class);
        return restTemplate.getForObject("https://api.golfbert.com/v1/courses", Courses.class);
    }


}

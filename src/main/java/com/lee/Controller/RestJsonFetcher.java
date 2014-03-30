package com.lee.Controller;

import com.lee.Model.Broadcast;
import com.lee.Model.ResponseData;
import org.springframework.web.client.RestTemplate;

import java.util.List;


public class RestJsonFetcher {

    public ResponseData getSchduleModel(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseData scheduleModel = restTemplate.getForObject("http://www.bbc.co.uk/bbcfour/programmes/schedules/today.json", ResponseData.class);
        return scheduleModel;
    }

    public List<Broadcast> getBroadCastModelList(){
        return getSchduleModel().getSchedule().getDay().getBroadcasts();
    }
}

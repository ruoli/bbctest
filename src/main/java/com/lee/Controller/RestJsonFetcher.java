package com.lee.Controller;

import com.lee.Model.Broadcast;
import com.lee.Model.ResponseData;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
* Created with IntelliJ IDEA.
* User: apple
* Date: 27/03/2014
* Time: 22:56
* To change this template use File | Settings | File Templates.
*/
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

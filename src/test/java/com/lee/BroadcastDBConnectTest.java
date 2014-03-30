package com.lee;


import com.lee.DAO.BroadcastDAO;
import com.lee.Model.Broadcast;
import com.lee.Model.Programme;
import com.lee.Service.BroadcastService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static junit.framework.Assert.assertNotNull;

public class BroadcastDBConnectTest {
    private static Log LOG = LogFactory.getLog(BroadcastDBConnectTest.class);
    private Broadcast broadcast;
    private BroadcastService broadcastService;
    @Autowired
    private BroadcastDAO broadcastDAO;

    @Before
    public void setup(){
        broadcast = new Broadcast();
        broadcast.setPid("1523236");
        broadcast.setDuration("dtest");
        broadcast.setEnd("endtest");
        broadcast.setIs_blanked(false);
        broadcast.setIs_repeat(true);
        broadcast.setStart("starttest");

        Programme programme = new Programme();
        programme.setPid("pid");
        programme.setActual_start("333");
        programme.setAvailable_until("34566");
        programme.setDuration(211);
        programme.setFirst_broadcast_date("fsff");
        programme.setIs_legacy_media(true);
        programme.setIs_available_mediaset_pc_sd(false);
        programme.setPosition(34);
        programme.setType("tye");
        programme.setTitle("333");
        programme.setMedia_type("tmt");
        programme.setShort_synopsis("shirt");

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        broadcastService = (BroadcastService) context.getBean("broadcastService");
    }

    @Test
    public void testPersistBroadCast(){
        broadcastService.persistBroadCast(broadcast);
        assertNotNull(broadcast.getPid());
    }

    @Test
    public void testFindByPId(){
        String pid = "1523236";
        assertNotNull(broadcastService.findBroadcastByPid(pid).getStart());
    }

}

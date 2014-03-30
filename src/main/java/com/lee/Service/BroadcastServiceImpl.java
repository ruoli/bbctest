package com.lee.Service;

import com.lee.DAO.BroadcastDAO;
import com.lee.Model.Broadcast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("broadcastService")
public class BroadcastServiceImpl implements BroadcastService {
    @Autowired
    BroadcastDAO broadcastDAO;

    @Override
    @Transactional
    public void persistBroadCast(Broadcast broadcast) {
        broadcastDAO.persistBroadCast(broadcast);
    }

    @Override
    @Transactional
    public Broadcast findBroadcastById(String pid) {
        return broadcastDAO.findBroadcastById(pid);
    }
}

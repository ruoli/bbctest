package com.lee.Service;

import com.lee.DAO.BroadcastDAO;
import com.lee.Model.Broadcast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: apple
 * Date: 28/03/2014
 * Time: 18:08
 * To change this template use File | Settings | File Templates.
 */
@Service("broadcastService")
public class BroadcastServiceImpl implements BroadcastService {
    @Autowired
    BroadcastDAO broadcastDAO;

    @Override
    @Transactional
    public void persistBroadCast(Broadcast broadcast) {
        broadcastDAO.persistBroadCast(broadcast);
    }
}

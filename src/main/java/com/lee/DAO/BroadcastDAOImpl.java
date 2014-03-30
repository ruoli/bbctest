package com.lee.DAO;

import com.lee.Model.Broadcast;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: apple
 * Date: 28/03/2014
 * Time: 18:00
 * To change this template use File | Settings | File Templates.
 */
@Repository("broadcastDAO")
public class BroadcastDAOImpl implements BroadcastDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void persistBroadCast(Broadcast broadcast) {
        sessionFactory.getCurrentSession().persist(broadcast);
    }
}

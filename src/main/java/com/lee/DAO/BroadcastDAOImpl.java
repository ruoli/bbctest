package com.lee.DAO;

import com.lee.Model.Broadcast;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("broadcastDAO")
public class BroadcastDAOImpl implements BroadcastDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void persistBroadCast(Broadcast broadcast) {
        sessionFactory.getCurrentSession().persist(broadcast);
    }

    @Override
    public Broadcast findBroadcastByPid(String pid) {
        return (Broadcast)sessionFactory.getCurrentSession().get(Broadcast.class, pid);
    }
}

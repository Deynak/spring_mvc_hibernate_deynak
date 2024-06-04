package com.deynak.spring.mvc.dao;

import com.deynak.spring.mvc.tasks.Tasks;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TasksDAOImpl implements TasksDAO {

    int i;

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Tasks> getAllTasks() {
        Session session = sessionFactory.getCurrentSession();
        List<Tasks> allTasks = session.createQuery("from Tasks", Tasks.class).getResultList();
        return allTasks;
    }

    @Override
    public void saveTask(Tasks task) {
        Session session = sessionFactory.getCurrentSession();
        session.save(task);
    }



    @Override
    public Tasks getTaskById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Tasks task = session.get(Tasks.class, id);
        return task;
    }

    @Override
    public void deleteTask(int id) {
        Session session = sessionFactory.getCurrentSession();
        Tasks task = session.get(Tasks.class, id);
        session.delete(task);
    }
}

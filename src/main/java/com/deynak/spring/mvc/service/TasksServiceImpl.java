package com.deynak.spring.mvc.service;

import com.deynak.spring.mvc.dao.TasksDAO;
import com.deynak.spring.mvc.tasks.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TasksServiceImpl implements TasksService {

    @Autowired
    private TasksDAO tasksDAO;

    @Override
    @Transactional
    public List<Tasks> getAllTasks() {
        return tasksDAO.getAllTasks();
    }

    @Override
    @Transactional
    public void saveTask(Tasks task) {
        tasksDAO.saveTask(task);
    }

    @Override
    @Transactional
    public Tasks getTaskById(int id) {
        return tasksDAO.getTaskById(id);
    }

    @Override
    @Transactional
    public void deleteTask(int id) {
        tasksDAO.deleteTask(id);

    }
}

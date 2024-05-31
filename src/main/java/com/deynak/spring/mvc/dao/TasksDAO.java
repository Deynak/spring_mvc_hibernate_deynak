package com.deynak.spring.mvc.dao;

import com.deynak.spring.mvc.tasks.Tasks;

import java.util.List;

public interface TasksDAO {
    public List<Tasks> getAllTasks();

    public void saveTask(Tasks task);

    public Tasks getTaskById(int id);

    public void deleteTask(int id);
}

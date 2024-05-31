package com.deynak.spring.mvc.service;



import com.deynak.spring.mvc.tasks.Tasks;

import java.util.List;

public interface TasksService {
    public List<Tasks> getAllTasks();

    public void saveTask(Tasks task);

    public Tasks getTaskById(int id);

    public void deleteTask(int id);
}

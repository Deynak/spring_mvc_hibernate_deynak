package com.deynak.spring.mvc.controller;


import com.deynak.spring.mvc.service.TasksService;
import com.deynak.spring.mvc.tasks.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;


@Controller
public class MyController {

    @Autowired
    private TasksService tasksService;

    @RequestMapping("/show-view")
    public String showDetails(Model model){
        List<Tasks> allTasks = tasksService.getAllTasks();
        model.addAttribute("allTasks", allTasks);
        return "show-view";
    }

    @RequestMapping("/createNewTask-view")
    public String createNewTask( Model model){

        Tasks newTask = new Tasks();
        model.addAttribute("newTask", newTask);
        return "createNewTask-view";
    }

    @RequestMapping("/saveTask")
    public String saveTask(@Valid @ModelAttribute("newTask") Tasks newTask, BindingResult result){
        if (result.hasErrors()) {
            return "createNewTask-view";
        }
        else {
            tasksService.saveTask(newTask);
            return "redirect:/show-view";
        }
    }

    @RequestMapping("/moreInfo")
    public String moreInfo(@RequestParam("taskId") int taskId, Model model) {
        Tasks task = tasksService.getTaskById(taskId);
        model.addAttribute("task", task);
        return "moreInfo-view";
    }

    @RequestMapping("/deleteTask")
    public String deleteTask(@RequestParam("taskId") int taskId) {
        tasksService.deleteTask(taskId);
        return "redirect:/show-view";
    }
}

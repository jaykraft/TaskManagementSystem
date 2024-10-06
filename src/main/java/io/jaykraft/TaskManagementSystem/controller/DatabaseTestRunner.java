package io.jaykraft.TaskManagementSystem.controller;

import io.jaykraft.TaskManagementSystem.entity.Task;
import io.jaykraft.TaskManagementSystem.repository.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class DatabaseTestRunner  implements CommandLineRunner {

    private final TaskRepository taskRepository;

    public DatabaseTestRunner(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        //Test inserting a task
        Task task = new Task("Test Database Connection");
        taskRepository.save(task);

        //Test fetching all tasks
        System.out.println("All tasks in the database:");
        taskRepository.findAll().forEach(t -> System.out.println(t.getName()));
    }
}

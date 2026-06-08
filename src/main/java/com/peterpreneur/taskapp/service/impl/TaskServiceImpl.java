/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.peterpreneur.taskapp.service.impl;

import java.time.Instant;

import org.springframework.stereotype.Service;

import com.peterpreneur.taskapp.domain.CreateTaskRequest;
import com.peterpreneur.taskapp.domain.entity.Task;
import com.peterpreneur.taskapp.domain.entity.TaskStatus;
import com.peterpreneur.taskapp.repository.TaskRepository;
import com.peterpreneur.taskapp.service.TaskService;

/**
 *
 * @author peter
 */
@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(CreateTaskRequest request) {
        Instant now = Instant.now();

        Task task = new Task(
                null,
                request.title(),
                request.description(),
                request.dueDate(),
                TaskStatus.OPEN,
                request.priority(),
                now,
                now);

        return taskRepository.save(task);
    }

}

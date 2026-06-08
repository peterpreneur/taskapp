/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package com.peterpreneur.taskapp.domain;

import java.time.LocalDate;

import com.peterpreneur.taskapp.domain.entity.TaskPriority;

/**
 *
 * @author peter
 */
public record CreateTaskRequest(
        String title,
        String description,
        LocalDate dueDate,
        TaskPriority priority
        ) {

}

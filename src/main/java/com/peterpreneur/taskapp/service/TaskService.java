/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.peterpreneur.taskapp.service;

import com.peterpreneur.taskapp.domain.CreateTaskRequest;
import com.peterpreneur.taskapp.domain.entity.Task;

/**
 *
 * @author peter
 */
public interface TaskService {

    Task createTask(CreateTaskRequest task); 


       

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.peterpreneur.taskapp.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.peterpreneur.taskapp.domain.entity.Task;

/**
 *
 * @author peter
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, UUID> {

    

}

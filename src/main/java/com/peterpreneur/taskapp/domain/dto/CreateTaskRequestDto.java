/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package com.peterpreneur.taskapp.domain.dto;

import java.time.LocalDate;

import org.hibernate.validator.constraints.Length;

import com.peterpreneur.taskapp.domain.entity.TaskPriority;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 *
 * @author peter
 */
public record CreateTaskRequestDto(
        @NotBlank(message = ERROR_MESSAGE_TITLE_LENGTH)
        @Length(max = 255)
        String title,
        @Length(max = 1000, message = ERROR_MESSAGE_DESCRIPTION_LENGTH)
        @Nullable
        String description,
        @FutureOrPresent(message = ERROR_MESSAGE_DUE_DATE_FUTURE)
        @Nullable
        LocalDate dueDate,
        @NotNull(message = ERROR_MESSAGE_PRIORITY)
        TaskPriority priority
        ) {

    private static final String ERROR_MESSAGE_TITLE_LENGTH = "Title must be at most 255 characters long";

    private static final String ERROR_MESSAGE_DESCRIPTION_LENGTH = "Description must be at most 255 characters long";

    private static final String ERROR_MESSAGE_DUE_DATE_FUTURE = "Due date must be in the present or future";

    private static final String ERROR_MESSAGE_PRIORITY = "Priority must not be null";

}

package com.kanban.kanbanapi.entity;

import com.kanban.kanbanapi.entity.enums.TaskStatus;
import com.kanban.kanbanapi.entity.enums.TaskType;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Task {
    private int id;
    private String title;
    private String description;
    private TaskStatus taskStatus;
    private TaskType type;
    private LocalDateTime startTime;
    private int duration;
}

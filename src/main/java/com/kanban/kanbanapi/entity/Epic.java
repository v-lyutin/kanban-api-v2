package com.kanban.kanbanapi.entity;

import com.kanban.kanbanapi.entity.enums.TaskStatus;
import com.kanban.kanbanapi.entity.enums.TaskType;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class Epic {
    private int id;
    private String title;
    private String description;
    private TaskStatus taskStatus;
    private TaskType type;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int duration;
    private final List<Subtask> subtasks;

    public void addSubtask(Subtask subtask) {
        subtasks.add(subtask);
    }

    public void removeSubtask(Subtask subtask) {
        subtasks.remove(subtask);
    }

    public void removeEpicsSubTasks() {
        subtasks.clear();
    }
}

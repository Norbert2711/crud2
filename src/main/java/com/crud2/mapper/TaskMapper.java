package com.crud2.mapper;

import com.crud2.domain.Task;
import com.crud2.domain.TaskDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TaskMapper {
    public Task mapToTask(final TaskDto taskDto) {
        return new Task(
                taskDto.getId(),
                taskDto.getTitle(),
                taskDto.getContent(),
                taskDto.getTest());
    }

    public TaskDto mapToTaskDto(final Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getContent(),
                task.getTest());
    }

    public List<TaskDto> mapTaskDtoList(final List<Task> taskList) {
        return taskList.stream()
                .map(t -> new TaskDto(t.getId(), t.getTitle(), t.getContent(), t.getTest()))
                .collect(Collectors.toList());
    }
}

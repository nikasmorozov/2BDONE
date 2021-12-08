package lt.nikas.tobedone.mapper;

import lt.nikas.tobedone.dto.TaskDTO;
import lt.nikas.tobedone.dto.TasksDTO;
import lt.nikas.tobedone.entity.Task;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class TasksMapper implements Mapper<List<Task>, TasksDTO> {

    public TasksDTO mapToDomain(List<Task> data) {
        return TasksDTO.builder()
                .tasks(data.stream()
                        .map(s -> new TaskMapper().mapToDomain(s))
                        .collect((Collectors.toList()))
                ).build();
    }
}

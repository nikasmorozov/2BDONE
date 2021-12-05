package lt.nikas.tobedone.service;

import lombok.RequiredArgsConstructor;
import lt.nikas.tobedone.dto.TasksDTO;
import lt.nikas.tobedone.mapper.TasksMapper;
import lt.nikas.tobedone.repository.TaskRepository;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;
    private final TasksMapper tasksMapper;

    public TasksDTO getAllTasks() {
        return tasksMapper.mapToDomain(taskRepository.findAll());
    }
}

package lt.nikas.tobedone.service;

import lombok.RequiredArgsConstructor;
import lt.nikas.tobedone.dto.TaskDTO;
import lt.nikas.tobedone.dto.TasksDTO;
import lt.nikas.tobedone.entity.Task;
import lt.nikas.tobedone.mapper.TaskMapper;
import lt.nikas.tobedone.mapper.TasksMapper;
import lt.nikas.tobedone.repository.TaskRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;
    private final TasksMapper tasksMapper;

    public TasksDTO getAllTasks() {
        return tasksMapper.mapToDomain(taskRepository.findAll());
    }

    public TasksDTO getTask(UUID uuid) {
        Task task = taskRepository.findByUuid(uuid);
        return TasksDTO.builder()
                .tasks(List.of(new TaskMapper().mapToDomain(task)))
                .build();
    }

    public void addTask(TaskDTO taskDTO) {
        if(taskDTO == null) {
            return;
        }

        var taskEntity = Task.builder()
                .createdAt(LocalDateTime.now())
                .description(taskDTO.getDescription())
                .isCompleted(false)
                .build();

        taskRepository.save(taskEntity);
    }

    @Transactional
    public void deleteTask(UUID uuid) {
        taskRepository.deleteById(uuid);
    }


    @Transactional
    public void updateTask(UUID uuid) {

        Task tempTask = taskRepository.findByUuid(uuid);

        tempTask.setIsCompleted(!tempTask.getIsCompleted());
        taskRepository.save(tempTask);


    }

    public void deleteCompletedTasks(List<UUID> completedTasksUuids) {
        for (UUID uuid : completedTasksUuids) {
            taskRepository.deleteById(uuid);
        }
    };
}

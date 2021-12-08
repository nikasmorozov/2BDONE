package lt.nikas.tobedone.controller;

import lombok.RequiredArgsConstructor;
import lt.nikas.tobedone.Endpoint;
import lt.nikas.tobedone.dto.TaskDTO;
import lt.nikas.tobedone.dto.TasksDTO;
import lt.nikas.tobedone.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin
@RestController
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @GetMapping(value = Endpoint.TASKS, produces = {MediaType.APPLICATION_JSON_VALUE})
    public TasksDTO getTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping(value = Endpoint.TASK, produces = {MediaType.APPLICATION_JSON_VALUE})
    public TasksDTO getTask(@PathVariable("UUID") UUID uuid) {
        return taskService.getTask(uuid);
    }

    @PostMapping(Endpoint.TASKS)
    public ResponseEntity createTask(@RequestBody TaskDTO taskDTO) {
        taskService.addTask(taskDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping(value = Endpoint.TASK)
    public ResponseEntity updateTask(@PathVariable("UUID") UUID uuid) {
        taskService.updateTask(uuid);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping(Endpoint.DELETE_TASK)
    public void deleteTask(@PathVariable("UUID") UUID uuid){
        taskService.deleteTask(uuid);
    }

    @PostMapping(Endpoint.DELETE_COMPLETED)
    public void deleteCompletedTasks(@RequestBody List<UUID> completedTasksUuids){
        taskService.deleteCompletedTasks(completedTasksUuids);
        System.out.println(completedTasksUuids);
    }
}

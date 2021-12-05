package lt.nikas.tobedone.controller;

import lombok.RequiredArgsConstructor;
import lt.nikas.tobedone.Endpoint;
import lt.nikas.tobedone.dto.TasksDTO;
import lt.nikas.tobedone.service.TaskService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @CrossOrigin
    @GetMapping(value = Endpoint.TASKS, produces = {MediaType.APPLICATION_JSON_VALUE})
    public TasksDTO getAllTasks() {
        return taskService.getAllTasks();
    }

}

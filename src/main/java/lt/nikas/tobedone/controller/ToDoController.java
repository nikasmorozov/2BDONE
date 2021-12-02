package lt.nikas.tobedone.controller;

import lombok.RequiredArgsConstructor;
import lt.nikas.tobedone.dto.ToDosDTO;
import lt.nikas.tobedone.service.ToDoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ToDoController {
    private final ToDoService toDoService;

    @GetMapping
    public ToDosDTO getAllTodos() {
        return toDoService.getAllToDos();
    }

}

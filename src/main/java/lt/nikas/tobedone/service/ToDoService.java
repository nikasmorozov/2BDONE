package lt.nikas.tobedone.service;

import lombok.RequiredArgsConstructor;
import lt.nikas.tobedone.dto.ToDosDTO;
import lt.nikas.tobedone.mapper.ToDosMapper;
import lt.nikas.tobedone.repository.ToDoRepository;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ToDoService {

    private final ToDoRepository toDoRepository;
    private final ToDosMapper toDosMapper;

    public ToDosDTO getAllToDos () {
        return toDosMapper.mapToDomain(toDoRepository.findAll());
    }
}

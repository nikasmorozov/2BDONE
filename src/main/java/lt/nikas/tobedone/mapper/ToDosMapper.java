package lt.nikas.tobedone.mapper;

import lt.nikas.tobedone.dto.ToDosDTO;
import lt.nikas.tobedone.entity.ToDo;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ToDosMapper implements Mapper<List<ToDo>, ToDosDTO> {

    public ToDosDTO mapToDomain(List<ToDo> data) {
        return ToDosDTO.builder()
                .todos(data.stream()
                        .map(s -> new TodoMapper().mapToDomain(s))
                        .collect((Collectors.toList()))
                ).build();
    }
}

package lt.nikas.tobedone.mapper;

import lt.nikas.tobedone.dto.ToDoDTO;
import lt.nikas.tobedone.entity.ToDo;

public class TodoMapper implements Mapper<ToDo, ToDoDTO> {

    public ToDoDTO mapToDomain(ToDo data) {
        return ToDoDTO.builder()
                .uuid(data.getUuid())
                .dateTime(data.getDateTime())
                .description(data.getDescription())
                .isDone(data.getIsDone())
                .build();
    }
}

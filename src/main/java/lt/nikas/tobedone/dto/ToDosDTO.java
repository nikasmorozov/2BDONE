package lt.nikas.tobedone.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class ToDosDTO {
    private List<ToDoDTO> todos;
}

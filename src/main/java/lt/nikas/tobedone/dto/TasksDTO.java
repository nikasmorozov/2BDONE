package lt.nikas.tobedone.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class TasksDTO {
    private List<TaskDTO> tasks;
}

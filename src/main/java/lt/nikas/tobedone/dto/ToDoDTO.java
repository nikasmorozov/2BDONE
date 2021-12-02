package lt.nikas.tobedone.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Getter
public class ToDoDTO {
    private UUID uuid;

    private LocalDateTime dateTime;

    private String description;

    private Boolean isDone;
}

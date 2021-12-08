package lt.nikas.tobedone.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Getter
public class TaskDTO {
    private UUID uuid;

    private LocalDateTime createdAt;

    private String description;

    private Boolean isCompleted;
}

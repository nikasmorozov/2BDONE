package lt.nikas.tobedone.mapper;

import lt.nikas.tobedone.dto.TaskDTO;
import lt.nikas.tobedone.entity.Task;

public class TaskMapper implements Mapper<Task, TaskDTO> {

    @Override
    public TaskDTO mapToDomain(Task data) {
        return TaskDTO.builder()
                .uuid(data.getUuid())
                .createdAt(data.getCreatedAt())
                .description(data.getDescription())
                .isDone(data.getIsDone())
                .build();
    }
}

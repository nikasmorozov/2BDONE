package lt.nikas.tobedone.repository;

import lt.nikas.tobedone.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TaskRepository extends JpaRepository<Task, UUID> {

    Task findByUuid (UUID uuid);
}

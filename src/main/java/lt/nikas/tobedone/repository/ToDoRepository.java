package lt.nikas.tobedone.repository;

import lt.nikas.tobedone.entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, UUID> {

    Optional<ToDo> findByUuid (UUID uuid);

}

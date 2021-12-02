package lt.nikas.tobedone.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "todo")
@Entity
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID uuid;

    @NotNull
    private LocalDateTime dateTime;

    @NotNull
    private String description;

    @NotNull
    @Column(columnDefinition = "boolean default false")
    private Boolean isDone;
}

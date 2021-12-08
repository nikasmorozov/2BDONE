package lt.nikas.tobedone.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "task")
@Entity
public class Task {

    @Id
    @GeneratedValue( generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator" )
    @Column(name = "uuid", updatable = false, nullable = false)
    private UUID uuid;

    @NotNull
    private LocalDateTime createdAt;

    @NotNull
    private String description;

    @NotNull
    @Column(columnDefinition = "boolean default false")
    private Boolean isCompleted;
}

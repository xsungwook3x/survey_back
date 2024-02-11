package ugi.survey.survey.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Workspace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="workspaceId",updatable = false)
    private Long workspaceId;

    @Column(nullable = false)
    private Long userId;
    @Column(nullable = false)
    private String title;

    private Long teamId;
    @Column(nullable = false)
    private boolean teamYN;
    @Column(nullable = false)
    private Date addTime;
    @Column(nullable = false)
    private Date updTime;
}

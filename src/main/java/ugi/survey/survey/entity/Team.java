package ugi.survey.survey.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="teamId",updatable = false)
    private Long teamId;

    @Column(nullable = false)
    private Long userId;
    @Column(nullable = false)
    private Date addTime;
    @Column(nullable = false)
    private Date updTime;
}

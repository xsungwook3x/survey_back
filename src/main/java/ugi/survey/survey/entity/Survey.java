package ugi.survey.survey.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="surveyId",updatable = false)
    private Long surveyId;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private Long workspaceId;

    @Column(nullable = false)
    private String title;

    private String description;

    @Column(nullable = false)
    private boolean effectYN;

    @Column(nullable = false)
    private boolean deleteYN;

    @Column(nullable = false)
    private boolean publishYN;

    @Column(nullable = false)
    private Date startDate;

    @Column(nullable = false)
    private Date endDate;

    @Column(nullable = false)
    private Date addTime;

    @Column(nullable = false)
    private Long addUser;

    @Column(nullable = false)
    private Date updTime;

    @Column(nullable = false)
    private Long updUser;
}

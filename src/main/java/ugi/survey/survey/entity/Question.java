package ugi.survey.survey.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="questionId",updatable = false)
    private Long questionId;

    @Column(nullable = false)
    private Long surveyId;

    @Column(nullable = false)
    private Long kindId;

    @Column(nullable = false)
    private int seq;

    @Column(nullable = false)
    private String title;

    private String options;

    @Column(nullable = false)
    private Date addTime;

    @Column(nullable = false)
    private Long addUser;

    @Column(nullable = false)
    private Date updTime;

    @Column(nullable = false)
    private Long updUser;
}

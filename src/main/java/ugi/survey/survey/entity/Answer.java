package ugi.survey.survey.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="answerId",updatable = false)
    private Long answerId;

    @Column(nullable = false)
    private Long questionId;

    @Column(nullable = false)
    private Long targetId;

    @Column(nullable = false)
    private Long kindId;

    private String content;

    @Column(nullable = false)
    private Date addTime;

    @Column(nullable = false)
    private Long addUser;

    @Column(nullable = false)
    private Date updTime;

    @Column(nullable = false)
    private Long updUser;

}

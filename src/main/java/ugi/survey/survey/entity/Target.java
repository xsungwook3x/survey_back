package ugi.survey.survey.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
public class Target {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="targetId",updatable = false)
    private Long targetId;

    @Column(nullable = false)
    private Long surveyId;

    @Column(nullable = false)
    private boolean mailYN;

    @Column(nullable = false)
    private boolean snsYN;

    @Column(nullable = false)
    private boolean linkYN;

    @Column(nullable = false)
    private String Content;

}

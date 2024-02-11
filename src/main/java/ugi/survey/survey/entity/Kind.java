package ugi.survey.survey.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Kind {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="kindId",updatable = false)
    private Long kindId;

    @Column(nullable = false)
    private String name;

}

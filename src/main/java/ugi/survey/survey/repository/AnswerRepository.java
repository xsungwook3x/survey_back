package ugi.survey.survey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ugi.survey.survey.entity.Answer;

@Repository
public interface AnswerRepository extends JpaRepository<Answer,Long> {
}

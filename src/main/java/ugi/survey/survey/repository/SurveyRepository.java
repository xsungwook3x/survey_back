package ugi.survey.survey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ugi.survey.survey.entity.Survey;

@Repository
public interface SurveyRepository extends JpaRepository<Survey,Long> {
}

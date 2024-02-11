package ugi.survey.survey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ugi.survey.survey.entity.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team,Long> {
}

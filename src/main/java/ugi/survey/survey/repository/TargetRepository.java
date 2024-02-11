package ugi.survey.survey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ugi.survey.survey.entity.Target;

@Repository
public interface TargetRepository extends JpaRepository<Target,Long> {
}

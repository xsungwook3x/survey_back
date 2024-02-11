package ugi.survey.survey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ugi.survey.survey.entity.Kind;

@Repository
public interface KindRepository extends JpaRepository<Kind,Long> {
}

package ugi.survey.survey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ugi.survey.survey.entity.Workspace;

@Repository
public interface WorkspaceRepository extends JpaRepository<Workspace,Long> {
}

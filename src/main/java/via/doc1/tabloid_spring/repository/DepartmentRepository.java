package via.doc1.tabloid_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import via.doc1.tabloid_spring.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, String> {
}

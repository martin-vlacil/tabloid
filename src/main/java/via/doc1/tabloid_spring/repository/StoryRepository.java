package via.doc1.tabloid_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import via.doc1.tabloid_spring.model.Story;

public interface StoryRepository extends JpaRepository<Story, String> {
}
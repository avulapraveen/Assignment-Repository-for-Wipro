package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Feedback;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}

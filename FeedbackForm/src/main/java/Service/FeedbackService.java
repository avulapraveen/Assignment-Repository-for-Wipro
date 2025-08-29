package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.FeedbackRepository;
import model.Feedback;

import java.util.List;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository repository;

    public Feedback saveFeedback(Feedback feedback) {
        return repository.save(feedback);
    }

    public List<Feedback> getAllFeedback() {
        return repository.findAll();
    }

    public void deleteFeedback(Long id) {
        repository.deleteById(id);
    }
}

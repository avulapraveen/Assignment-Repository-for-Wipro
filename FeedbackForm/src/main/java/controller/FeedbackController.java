package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import model.Feedback;

import java.util.List;

@RestController
@RequestMapping("/api/feedback")
@CrossOrigin(origins = "*")  // allow frontend to connect
public class FeedbackController {

    @Autowired
    private Feedback service;

    @PostMapping
    public Feedback submitFeedback(@RequestBody Feedback feedback) {
        return service.saveFeedback(feedback);
    }

    @GetMapping
    public List<Feedback> getFeedbackList() {
        return service.getAllFeedback();
    }

    @DeleteMapping("/{id}")
    public void deleteFeedback(@PathVariable Feedback id) {
        service.saveFeedback(id);
    }
}

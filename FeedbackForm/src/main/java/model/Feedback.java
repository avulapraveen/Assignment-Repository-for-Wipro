package model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "feedback")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    private String message;
    private int rating; // 1 to 5

    public Feedback() {}

    public Feedback(String username, String email, String message, int rating) {
        this.username = username;
        this.email = email;
        this.message = message;
        this.rating = rating;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }

	public Feedback saveFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Feedback> getAllFeedback() {
		// TODO Auto-generated method stub
		return null;
	}
}

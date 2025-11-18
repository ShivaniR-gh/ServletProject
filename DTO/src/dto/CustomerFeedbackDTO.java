package dto;

import java.io.Serializable;
import java.util.Objects;

public class CustomerFeedbackDTO implements Serializable {

    private String name;
    private String email;
    private String comments;
    private int rating; // assuming rating is numeric

    public CustomerFeedbackDTO() {
        System.out.println("CustomerFeedbackDTO object created");
    }

    public CustomerFeedbackDTO(String name, String email, String comments, int rating) {
        this.name = name;
        this.email = email;
        this.comments = comments;
        this.rating = rating;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getComments() { return comments; }
    public void setComments(String comments) { this.comments = comments; }

    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }

    @Override
    public String toString() {
        return "CustomerFeedbackDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", comments='" + comments + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerFeedbackDTO)) return false;
        CustomerFeedbackDTO that = (CustomerFeedbackDTO) o;
        return rating == that.rating &&
                Objects.equals(name, that.name) &&
                Objects.equals(email, that.email) &&
                Objects.equals(comments, that.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, comments, rating);
    }
}

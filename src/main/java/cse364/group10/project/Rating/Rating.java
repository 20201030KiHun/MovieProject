package cse364.group10.project.Rating;

import cse364.group10.project.User.User;
import jakarta.persistence.*;

@Entity
public class Rating {
    private @Id @GeneratedValue Long id;
    @OneToOne
    private User user;
    private double rating;

    Rating() {}

    Rating(double rating) {
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public double getRating() {
        return rating;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

}

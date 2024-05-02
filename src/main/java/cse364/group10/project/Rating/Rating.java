package cse364.group10.project.Rating;

import cse364.group10.project.User.User;
import jakarta.persistence.*;

@Entity
public class Rating {
    private @Id @GeneratedValue Long id;
    @OneToOne
    private User user;
    private String username;
    private String moviename;
    private String genrename[5];
    private int genreNum;
    private double rating;
    private double ratingGenre[5];

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
    
    public String getUsername() {
        return username;
    }

    public String getMoviename() {
        return moviename;
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

    public void setUsername(String username) {
        this.username = username;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }
}

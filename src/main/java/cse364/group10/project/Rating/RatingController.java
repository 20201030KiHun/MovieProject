package cse364.group10.project.Rating;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies/{id}")
public class RatingController {
    private final RatingRepository repository;

    RatingController(RatingRepository repository) {
        this.repository = repository;
    }

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/ratings")
    List<Rating> all() {
        return  repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/ratings")
    Rating newRating(@RequestBody Rating newRating) {
        return repository.save(newRating);
    }

    @GetMapping("/ratings/{ratingId}")
    Rating one(@PathVariable Long ratingId) {
        return repository.findById(ratingId)
                .orElseThrow(() -> new RatingNotFoundException(ratingId));
    }

    @PutMapping("/ratings/{ratingId}")
    Rating replaceRating(@RequestBody Rating newRating, @PathVariable Long ratingId) {
        return repository.findById(ratingId)
                .map(rating -> {
                    review.setUsername(newReview.getUsername());
                    review.setMoviename(newReview.getMoviename());
                    rating.setRating(newRating.getRating());
                    return repository.save(rating);
                })
                .orElseGet(() -> {
                    newRating.setId(ratingId);
                    return  repository.save(newRating);
                });
    }

    @DeleteMapping("/ratings/{ratingId}")
    void deleteRating(@PathVariable Long ratingId) {
        repository.deleteById(ratingId);
    }
}

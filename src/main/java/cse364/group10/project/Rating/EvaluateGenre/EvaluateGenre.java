package cse364.group10.project.Rating.EvaluateGenre;

import cse364.group10.project.Rating.Rating;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class EvaluateGenre {
    public List<String> genreEvaluate(List<Rating> ratings, String genre) {
        List<Integer> ratingsForGenre = new ArrayList<>();
        for (Rating rating : ratings) {
            List<Integer> score = rating.get;
            ratingsForGenre.addAll(score);
        }

        return ratingsForGenre;
    }
}

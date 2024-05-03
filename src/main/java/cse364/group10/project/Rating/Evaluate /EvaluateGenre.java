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
        List<Int> ratingGenre = new ArrayList<>();
        for (Rating rating : ratings) {
            List<Int> score = rating.get;
            ratingGenre.addAll(score);
        }

        return keywords;
    }
}

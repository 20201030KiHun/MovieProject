package cse364.group10.project.Movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MovieRepository extends  JpaRepository<Movie, Long> {
    List<Movie> findByGenre(String genre);
}

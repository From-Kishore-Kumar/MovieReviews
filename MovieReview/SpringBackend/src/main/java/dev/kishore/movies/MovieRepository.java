package dev.kishore.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    //to search using imdbId and not ObjectID;
    Optional<Movie> findMovieByImdbId(String imdbId);
}

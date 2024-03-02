package org.theatremanagement.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.theatremanagement.movie.constant.ApplicationConstant;
import org.theatremanagement.movie.model.Movie;
import org.theatremanagement.movie.model.domain.CustomResponse;
import org.theatremanagement.movie.service.MovieService;

import java.util.List;

@RestController
@RequestMapping(value = ApplicationConstant.REST_V1_MAPPING_MOVIE)
public class MovieController extends BaseController {

    @Autowired
    MovieService movieService;

    @GetMapping(ApplicationConstant.STRING_ALL)
    ResponseEntity<CustomResponse<List<Movie>>> getAllMovie(){
        return getResponseEntityOK(movieService.getAllMovie());
    }

    @GetMapping
    ResponseEntity<CustomResponse<Movie>> getMovie(@RequestParam(required = true) Long id) {
        Movie Movie = movieService.getMovie(id);
        return getResponseEntityOK(Movie);
    }

    @PostMapping
    ResponseEntity<CustomResponse<Boolean>> createMovie(@RequestBody Movie Movie) {
        boolean createResponse = movieService.createMovie(Movie);
        return getResponseEntityOK(createResponse);
    }

    @PutMapping
    ResponseEntity<CustomResponse<Movie>> updateMovie(@RequestBody Movie movie) {
        Movie updatedMovie = movieService.updateMovie(movie);
        return getResponseEntityOK(updatedMovie);
    }

}

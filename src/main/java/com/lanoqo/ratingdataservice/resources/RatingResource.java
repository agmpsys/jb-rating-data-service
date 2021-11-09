package com.lanoqo.ratingdataservice.resources;

import com.lanoqo.ratingdataservice.models.Rating;
import com.lanoqo.ratingdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

    @RequestMapping("{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }

    @RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId) {
         List<Rating> ratings= Arrays.asList(
                new Rating("1", 3),
                new Rating("2", 4)
         );
        UserRating userRating = new UserRating();
        userRating.setRatingLst(ratings);
        return userRating;
    }
}

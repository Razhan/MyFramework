package com.example.ranzhan.model.rest;

import com.example.ranzhan.model.entities.ConfigurationResponse;
import com.example.ranzhan.model.entities.ImagesWrapper;
import com.example.ranzhan.model.entities.MovieDetail;
import com.example.ranzhan.model.entities.MoviesWrapper;
import com.example.ranzhan.model.entities.ReviewsWrapper;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Interface representing the MovieDatabaseAPI endpoints
 * used by retrofit
 */
public interface MovieDatabaseAPI {

    @GET("/movie/popular")
    void getPopularMovies(
            @Query("api_key") String apiKey,
            Callback<MoviesWrapper> callback
    );

    @GET("/movie/{id}")
    void getMovieDetail(
            @Query("api_key") String apiKey,
            @Path("id") String id,
            Callback<MovieDetail> callback
    );

    @GET("/movie/popular")
    void getPopularMoviesByPage(
            @Query("api_key") String apiKey,
            @Query("page") String page,
            Callback<MoviesWrapper> callback
    );

    @GET("/configuration")
    void getConfiguration(
            @Query("api_key") String apiKey,
            Callback<ConfigurationResponse> response
    );

    @GET("/movie/{id}/reviews")
    void getReviews(
            @Query("api_key") String apiKey,
            @Path("id") String id,
            Callback<ReviewsWrapper> response
    );

    @GET("/movie/{id}/images")
    void getImages(
            @Query("api_key") String apiKey,
            @Path("id") String movieId,
            Callback<ImagesWrapper> response
    );
}

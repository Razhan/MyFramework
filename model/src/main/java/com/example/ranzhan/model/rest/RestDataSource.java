package com.example.ranzhan.model.rest;

/**
 * Created by saulmm on 25/02/15.
 */
public interface RestDataSource extends MediaDataSource {

    public void getMoviesByPage(int page);
}

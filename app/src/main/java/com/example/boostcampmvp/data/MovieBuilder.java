package com.example.boostcampmvp.data;

/*
* MovieBuilder
* Builder Pattern 을 이용하여 Movie 객체를 생성함
* this 를 반환해주는 방식을 사용한다
 */
public class MovieBuilder {

    private String imageURL;
    private String link;
    private String title;
    private String actors;
    private String pubDate;
    private String director;
    private double userRating;

    public MovieBuilder setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }

    public MovieBuilder setLink(String link) {
        this.link = link;
        return this;
    }

    public MovieBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public MovieBuilder setActors(String actors) {
        this.actors = actors;
        return this;
    }

    public MovieBuilder setPubDate(String pubDate) {
        this.pubDate = pubDate;
        return this;
    }

    public MovieBuilder setDirector(String director) {
        this.director = director;
        return this;
    }

    public MovieBuilder setUserRating(double userRating) {
        this.userRating = userRating;
        return this;
    }

    public Movie build() {
        return new Movie(imageURL, link, title, pubDate, director, actors, userRating);
    }
}

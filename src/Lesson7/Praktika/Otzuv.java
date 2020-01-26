package Lesson7.Praktika;

import java.util.Date;

public class Otzuv {

    private int id;
    private User user;
    private Date datePublish;
    private int rating;
    private int like;
    private int dislike;
    private String plusText;
    private String minusText;
    private String comment;

    public Otzuv() {
    }

    public Otzuv(int id, User user, Date datePublish, int rating, int like, int dislike, String plusText, String minusText, String comment) {
        this.id = id;
        this.user = user;
        this.datePublish = datePublish;
        this.rating = rating;
        this.like = like;
        this.dislike = dislike;
        this.plusText = plusText;
        this.minusText = minusText;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDatePublish() {
        return datePublish;
    }

    public void setDatePublish(Date datePublish) {
        this.datePublish = datePublish;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    public String getPlusText() {
        return plusText;
    }

    public void setPlusText(String plusText) {
        this.plusText = plusText;
    }

    public String getMinusText() {
        return minusText;
    }

    public void setMinusText(String minusText) {
        this.minusText = minusText;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

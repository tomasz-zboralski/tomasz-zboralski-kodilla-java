package com.kodilla.testing.forum.statistics;


public class CalculateStatistics {

    private int users;
    private int posts;
    private int comments;
    private double userPostsAverage;
    private double userCommentsAverage;
    private double postCommentsAverage;


    private Statistics statistics;

    public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics){
        users = statistics.usersNames().size();
        posts = statistics.postsCount();
        comments = statistics.commentsCount();
        if (posts != 0 && users !=0){
            userPostsAverage = (posts * 1.0) / users;
        }
        if (users != 0){
            userCommentsAverage = (comments * 1.0)/ users;
        }

        if (posts != 0){
            postCommentsAverage = (comments * 1.0) / posts ;
        }

    }

    public String showStatistics(){
        String stats = "Number of users: " + users + "\n"
                + "Number of posts: " + posts + ",Average per user: " + userPostsAverage + "\n"
                + "Number of comments: " + comments + ",Average per user: " + userCommentsAverage + "\n"
                + "Average comments per post: " + postCommentsAverage;
        return stats;
    }

    public int getUsers() {
        return users;
    }

    public int getPosts() {
        return posts;
    }

    public int getComments() {
        return comments;
    }

    public double getUserPostsAverage() {
        return userPostsAverage;
    }

    public double getUserCommentsAverage() {
        return userCommentsAverage;
    }

    public double getPostCommentsAverage() {
        return postCommentsAverage;
    }

}

package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CalculateAdvStatisticsTestSuite {

    private List<String> generateListOfNUsers(int usersQuantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= usersQuantity; n++) {
            String theUser = "User" + n;
            resultList.add(theUser);
        }
        return resultList;
    }

    static int counter = 0;

    @Mock
    private Statistics statisticsMock;


    @BeforeEach
    void beforeEveryTest(){
        counter ++;
        System.out.println("Test #" + counter);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2000);
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsers(2000));

    }

    @Test
    void testCalculateAdvStatistics0posts(){
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        when(statisticsMock.postsCount()).thenReturn(0);

        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int users = calculateStatistics.getUsers();
        int posts = calculateStatistics.getPosts();
        int comments = calculateStatistics.getComments();
        double userPostsAverage = calculateStatistics.getUserPostsAverage();
        double userCommentsAverage = calculateStatistics.getUserCommentsAverage();
        double postCommentsAverage = calculateStatistics.getPostCommentsAverage();

        // Then
        assertEquals(2000, users);
        assertEquals(0, posts);
        assertEquals(2000, comments);
        assertEquals(0, userPostsAverage);
        assertEquals(1.0, userCommentsAverage);
        assertEquals(0, postCommentsAverage);
    }

    @Test
    void testCalculateAdvStatistics1000posts(){
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);

        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int users = calculateStatistics.getUsers();
        int posts = calculateStatistics.getPosts();
        int comments = calculateStatistics.getComments();
        double userPostsAverage = calculateStatistics.getUserPostsAverage();
        double userCommentsAverage = calculateStatistics.getUserCommentsAverage();
        double postCommentsAverage = calculateStatistics.getPostCommentsAverage();

        // Then
        assertEquals(2000, users);
        assertEquals(1000, posts);
        assertEquals(2000, comments);
        assertEquals(0.5, userPostsAverage);
        assertEquals(1.0, userCommentsAverage);
        assertEquals(2.0, postCommentsAverage);
    }

    @Test
    void testCalculateAdvStatistics0comments(){
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        when(statisticsMock.commentsCount()).thenReturn(0);

        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int users = calculateStatistics.getUsers();
        int posts = calculateStatistics.getPosts();
        int comments = calculateStatistics.getComments();
        double userPostsAverage = calculateStatistics.getUserPostsAverage();
        double userCommentsAverage = calculateStatistics.getUserCommentsAverage();
        double postCommentsAverage = calculateStatistics.getPostCommentsAverage();

        // Then
        assertEquals(2000, users);
        assertEquals(1000, posts);
        assertEquals(0, comments);
        assertEquals(0.5, userPostsAverage);
        assertEquals(0, userCommentsAverage);
        assertEquals(0, postCommentsAverage);
    }

    @Test
    void testCalculateAdvStatisticsCommentsLessThanPosts(){
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int users = calculateStatistics.getUsers();
        int posts = calculateStatistics.getPosts();
        int comments = calculateStatistics.getComments();
        double userPostsAverage = calculateStatistics.getUserPostsAverage();
        double userCommentsAverage = calculateStatistics.getUserCommentsAverage();
        double postCommentsAverage = calculateStatistics.getPostCommentsAverage();

        // Then
        assertEquals(2000, users);
        assertEquals(1000, posts);
        assertEquals(100, comments);
        assertEquals(0.5, userPostsAverage);
        assertEquals(0.05, userCommentsAverage);
        assertEquals(0.1, postCommentsAverage);
    }

    @Test
    void testCalculateAdvStatisticsCommentsMoreThanPosts(){
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2000);

        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int users = calculateStatistics.getUsers();
        int posts = calculateStatistics.getPosts();
        int comments = calculateStatistics.getComments();
        double userPostsAverage = calculateStatistics.getUserPostsAverage();
        double userCommentsAverage = calculateStatistics.getUserCommentsAverage();
        double postCommentsAverage = calculateStatistics.getPostCommentsAverage();

        // Then
        assertEquals(2000, users);
        assertEquals(1000, posts);
        assertEquals(2000, comments);
        assertEquals(0.5, userPostsAverage);
        assertEquals(1.0, userCommentsAverage);
        assertEquals(2.0, postCommentsAverage);
    }

    @Test
    void testCalculateAdvStatistics0users(){
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsers(0));

        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int users = calculateStatistics.getUsers();
        int posts = calculateStatistics.getPosts();
        int comments = calculateStatistics.getComments();
        double userPostsAverage = calculateStatistics.getUserPostsAverage();
        double userCommentsAverage = calculateStatistics.getUserCommentsAverage();
        double postCommentsAverage = calculateStatistics.getPostCommentsAverage();

        // Then
        assertEquals(0, users);
        assertEquals(1000, posts);
        assertEquals(2000, comments);
        assertEquals(0, userPostsAverage);
        assertEquals(0, userCommentsAverage);
        assertEquals(2.0, postCommentsAverage);
    }

    @Test
    void testCalculateAdvStatistics100users(){
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsers(100));


        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int users = calculateStatistics.getUsers();
        int posts = calculateStatistics.getPosts();
        int comments = calculateStatistics.getComments();
        double userPostsAverage = calculateStatistics.getUserPostsAverage();
        double userCommentsAverage = calculateStatistics.getUserCommentsAverage();
        double postCommentsAverage = calculateStatistics.getPostCommentsAverage();

        // Then
        assertEquals(100, users);
        assertEquals(1000, posts);
        assertEquals(2000, comments);
        assertEquals(10, userPostsAverage);
        assertEquals(20, userCommentsAverage);
        assertEquals(2.0, postCommentsAverage);
    }
}

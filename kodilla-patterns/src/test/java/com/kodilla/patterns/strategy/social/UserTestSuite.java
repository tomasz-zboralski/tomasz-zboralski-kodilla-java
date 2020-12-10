package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    Millenials millenials = new Millenials("M");
    YGeneration yGeneration = new YGeneration("Y");
    ZGeneration zGeneration = new ZGeneration("Z");

    @Test
    void testDefaultSharingStrategies() {
        //Given
        //When
        String millenialsPost = millenials.sharePost();
        String yGenerationPost = yGeneration.sharePost();
        String zGenerationPost = zGeneration.sharePost();

        //Then
        Assertions.assertAll(
                () -> Assertions.assertEquals("I use Facebook", millenialsPost),
                () -> Assertions.assertEquals("I use Twitter", yGenerationPost),
                () -> Assertions.assertEquals("I use Snapchat", zGenerationPost)
        );

    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        //When
        millenials.setSocialPublisher(new SnapchatPublisher());
        yGeneration.setSocialPublisher(new FacebookPublisher());
        zGeneration.setSocialPublisher(new TwitterPublisher());

        String millenialsPostChanged = millenials.sharePost();
        String yGenerationPostChanged = yGeneration.sharePost();
        String zGenerationPostChanged = zGeneration.sharePost();

        //Then
        Assertions.assertAll(
                () -> Assertions.assertEquals("I use Snapchat", millenialsPostChanged),
                () -> Assertions.assertEquals("I use Facebook", yGenerationPostChanged),
                () -> Assertions.assertEquals("I use Twitter", zGenerationPostChanged)
        );
    }
}

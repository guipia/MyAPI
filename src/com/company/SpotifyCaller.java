package com.company;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

import java.util.HashMap;

public class SpotifyCaller {
    private static String token = "BQDMG8nFmJWIsGj7dSPkJVEJrX6V9lqPisfsLq36vJAj7Q5g7m1l99zkhUl_aNk31pMivs_VrqCwr2ukg8iPXkooOaG4KhzRT6FosZ9Wb-6vaf3eDCsGFfZEhhMIMdwKJlmYv2mb4yJH0MqA";

    public static void findArtistID(String artist){
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Authorization", "Bearer" + token);

        HttpResponse<String> result = Unirest.get("https://api.spotify.com/v1/search")
                .header("Authorization", "Bearer " + token)
                .queryString("q",artist)
                .queryString("type", "artist")
                .asString();

        System.out.println(result.getBody());
    }

    public static void findSongID(String track) {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Authorization", "Bearer" + token);

        HttpResponse<String> result = Unirest.get("https://api.spotify.com/v1/search")
                .header("Authorization", "Bearer" + token)
                .queryString("q", track)
                .queryString("type", "track")
                .asString();
        System.out.println(result.getBody());
    }

    public static void findAlbumID(String album) {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Authorization", "Bearer" + token);

        HttpResponse<String> result = Unirest.get("https://api.spotify.com/v1/search")
                .header("Authorization", "Bearer" + token)
                .queryString("q", album)
                .queryString("type", "Album")
                .asString();
        System.out.println(result.getBody());
    }
    public static void findRecommendationsID(String recommendation) {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Authorization", "Bearer" + token);

        HttpResponse<String> result = Unirest.get("https://api.spotify.com/v1/search")
                .header("Authorization", "Bearer" + token)
                .queryString("q", recommendation)
                .queryString("type", "Recommendation")
                .asString();
        System.out.println(result.getBody());
    }
    public static void browseCategories(String categories) {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Authorization", "Bearer" + token);

        HttpResponse<String> result = Unirest.get("https://api.spotify.com/v1/search")
                .header("Authorization", "Bearer" + token)
                .queryString("q", categories)
                .queryString("type", "categories")
                .asString();
        System.out.println(result.getBody());
    }

        /*

    public static void findArtistIDput(String artist){
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Authorization", "Bearer" + token);

        HttpResponse<String> result = Unirest.put("https://api.spotify.com/v1/search")
                .header("Authorization", "Bearer" + token)
                .field("q","Pitbull")
                .field("type", "artist")
                .asString();
    }

     */
}

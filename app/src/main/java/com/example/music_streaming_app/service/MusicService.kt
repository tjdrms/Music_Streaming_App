package com.example.music_streaming_app.service

import retrofit2.Call
import retrofit2.http.GET

interface MusicService {

    @GET("/v3/9fbe267d-3cee-4d3f-bbe7-7baeaca074b6")
    fun listMusics(): Call<MusicDto>
}

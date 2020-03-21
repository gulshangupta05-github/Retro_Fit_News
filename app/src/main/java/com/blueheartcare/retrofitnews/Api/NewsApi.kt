package com.blueheartcare.retrofitnews.Api

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET

interface NewsApi {

      @GET ("top-headlines?country=in&apiKey=ff7ccc5641604540b6246007b5cd7378")
     fun getTopHeighLigths(): Call<ResponseBody>

        @GET("top-headlines?country=in&category=sports&apiKey=ff7ccc5641604540b6246007b5cd7378")
        fun getSportsnews(): Call<ResponseBody>

    @GET("top-headlines?country=in&category=business&apiKey=ff7ccc5641604540b6246007b5cd7378")
    fun getBusinessnews(): Call<ResponseBody>
}
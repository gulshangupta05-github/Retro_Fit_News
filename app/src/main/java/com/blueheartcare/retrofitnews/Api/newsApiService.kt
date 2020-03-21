package com.blueheartcare.retrofitnews.Api

import retrofit2.Retrofit

object newsApiService {
  fun  create(): NewsApi{
      val retrofit = Retrofit.Builder()
          .baseUrl("http://newsapi.org/v2/")
          .build();
      val service =retrofit.create(NewsApi::class.java)
      return service
  }
}
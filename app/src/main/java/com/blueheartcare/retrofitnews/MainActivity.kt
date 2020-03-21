package com.blueheartcare.retrofitnews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.blueheartcare.retrofitnews.Api.NewsApi
import com.blueheartcare.retrofitnews.Api.newsApiService
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(), Callback<ResponseBody> {

    override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        Log.e("Fail",t?.localizedMessage)
    }


    override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        Log.i("response",response?.body()?.string())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var newsData = newsApiService.create()
        newsData.getTopHeighLigths().enqueue(this)
    }
}

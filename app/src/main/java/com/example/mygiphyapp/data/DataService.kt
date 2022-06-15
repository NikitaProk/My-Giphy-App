package com.example.mygiphyapp.data

import retrofit2.http.GET

interface DataService {

    @GET("gifs/trending?api_key=nxXlu5tISjz9x4EcolqGU097adZrdGSV")
    fun getGifs(): retrofit2.Call<DataResult>
}
package com.example.konekin.network

import retrofit2.Call
import com.example.konekin.model.Users
import retrofit2.http.GET

interface ApiService {
    @GET("employees")
    fun getAllUsers(): Call<Users>
}
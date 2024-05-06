package com.example.notlify.api

import com.example.notlify.models.data.UserRequest
import com.example.notlify.models.data.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface UserApi {
    @POST("/user/signup")
    suspend fun signup(@Body userRequest: UserRequest):Response<UserResponse>

    @POST("/user/signin")
    suspend fun signin(@Body userRequest: UserRequest):Response<UserResponse>
}
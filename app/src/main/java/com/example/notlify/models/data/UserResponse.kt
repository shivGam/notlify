package com.example.notlify.models.data


import com.google.gson.annotations.SerializedName

data class UserResponse(
    @SerializedName("token")
    val token: String,
    @SerializedName("user")
    val user: User
)
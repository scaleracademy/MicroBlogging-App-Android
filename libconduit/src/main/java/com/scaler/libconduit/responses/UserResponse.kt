package com.scaler.libconduit.responses


import com.scaler.libconduit.models.User
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserResponse(
    @Json(name = "user") val user: User?
)
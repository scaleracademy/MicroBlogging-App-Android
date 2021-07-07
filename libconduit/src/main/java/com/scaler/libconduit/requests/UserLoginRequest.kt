package com.scaler.libconduit.requests


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserLoginRequest(
    @Json(name = "user") val user: UserLoginData?
)
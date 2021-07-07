package com.scaler.libconduit.requests


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserLoginData(
    @Json(name = "email") val email: String?,
    @Json(name = "password") val password: String?
)
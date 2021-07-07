package com.scaler.libconduit.responses


import com.scaler.libconduit.models.Profile
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProfileResponse(
    @Json(name = "profile") val profile: Profile?
)
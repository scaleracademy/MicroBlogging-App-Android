package com.scaler.libconduit.responses


import com.scaler.libconduit.models.Errors
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ErrorResponse(
    @Json(name = "errors") val errors: Errors?
)
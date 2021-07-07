package com.scaler.libconduit.responses


import com.scaler.libconduit.models.Comment
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SingleCommentResponse(
    @Json(name = "comments") val comment: Comment?
)
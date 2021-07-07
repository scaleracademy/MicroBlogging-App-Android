package com.scaler.libconduit.responses


import com.scaler.libconduit.models.Comment
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MultipleCommentResponse(
    @Json(name = "comments") val comments: List<Comment>?
)
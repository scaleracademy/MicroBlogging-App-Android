package com.scaler.libconduit.requests


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ArticleData(
    @Json(name = "body") val body: String?,
    @Json(name = "description") val description: String?,
    @Json(name = "tagList") val tagList: List<String>?,
    @Json(name = "title") val title: String?
)
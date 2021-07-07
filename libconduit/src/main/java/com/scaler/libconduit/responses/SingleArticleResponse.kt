package com.scaler.libconduit.responses


import com.scaler.libconduit.models.Article
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SingleArticleResponse(
    @Json(name = "article") val article: Article?
)
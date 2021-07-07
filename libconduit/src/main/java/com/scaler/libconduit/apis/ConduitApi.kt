package com.scaler.libconduit.apis

import com.scaler.libconduit.requests.CreateArticleRequest
import com.scaler.libconduit.requests.UserLoginRequest
import com.scaler.libconduit.requests.UserSignupRequest
import com.scaler.libconduit.requests.UserUpdateRequest
import com.scaler.libconduit.responses.*
import retrofit2.http.*

interface ConduitApi {

    @POST("users/login")
    suspend fun loginUser(@Body userLoginRequest: UserLoginRequest ): UserResponse

    @POST("users")
    suspend fun registerUser(@Body userSignupRequest: UserSignupRequest): UserResponse

    @GET("user")
    suspend fun getCurrentUser(): UserResponse

    @PUT("user")
    suspend fun updateUserDetails(@Body userUpdateRequest: UserUpdateRequest): UserResponse

    @GET("profiles/{username}")
    suspend fun getProfileByUsername(@Path("username") username: String): ProfileResponse

    @POST("profiles/{username}/follow")
    suspend fun followUser(@Path("username") username: String): ProfileResponse

    @DELETE("profiles/{username}/follow")
    suspend fun unfollowUser(@Path("username") username: String): ProfileResponse

    @GET("articles")
    suspend fun getArticles(): MultipleArticleResponse

    @GET("articles/feed")
    suspend fun getFeedArticles(): MultipleArticleResponse

    @GET("articles/{slug}")
    suspend fun getArticleBySlug(
        @Path("slug") slug: String
    ): SingleArticleResponse

    @POST("articles")
    suspend fun createArticle(
        @Body createArticleRequest: CreateArticleRequest
    ): SingleArticleResponse

    @PUT("articles/{slug}")
    suspend fun updateArticle(
        @Path("slug") slug: String,
        @Body createArticleRequest: CreateArticleRequest
    ): SingleArticleResponse

    @DELETE("articles/{slug}")
    suspend fun deleteArticle(
        @Path("slug") slug: String,
    ): Void

    @GET("tags")
    suspend fun getTags(): TagsResponse


}
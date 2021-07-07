package com.scaler.libconduit

import com.scaler.libconduit.apis.ConduitApi
import com.scaler.libconduit.models.User
import com.scaler.libconduit.requests.UserSignupData
import com.scaler.libconduit.requests.UserSignupRequest
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import kotlin.random.Random

class ConduitClientTests {

    private val api: ConduitApi = ConduitClient().api
    private val testUsername = "testUser${Random.nextInt(100, 1000)}"
    private val testPassword = "testPass${Random.nextInt(100, 1000)}"
    private val testEmail = "$testUsername@scaler.com"
    private lateinit var token: String

    @Test
    @Before
    fun registerUser() = runBlocking {
        val response = api.registerUser(UserSignupRequest(
            UserSignupData(testEmail, testPassword, testUsername)
        ))
        assertEquals(testUsername, response.user!!.username)
        token = response.user!!.token!!
    }

    @Test
    fun `GET articles`() = runBlocking {
        val response = api.getArticles()
        assertEquals(500, response.articlesCount)
    }

    @Test
    fun `GET articles_jalabhar-xho-yk5bun`() = runBlocking {
        val response = api.getArticleBySlug("jalabhar-xho-yk5bun")
        assertEquals("Jalabhar Xho", response.article!!.title)
    }

    @Test
    fun `GET tags`() = runBlocking {
        val response = api.getTags()
        assertNotNull(response)
    }
}
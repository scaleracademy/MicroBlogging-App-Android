package com.scaler.libconduit

import com.scaler.libconduit.apis.ConduitApi
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertNotNull
import org.junit.Test

class ConduitClientTests {

    private val api: ConduitApi = ConduitClient().api

    @Test
    fun getTags() = runBlocking {
        val response = api.getTags()
        assertNotNull(response)
    }
}
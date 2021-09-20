package com.anton111111.template.data.source.remote.model

import com.squareup.moshi.Json

data class BaseResponseData(
    /**
     * Status of the request
     */
    @field:Json(name = "status") val status: String,
)
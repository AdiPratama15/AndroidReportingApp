package com.domikado.bit.data.remote.pojo

data class JSONCheckIn(
    val `data`: List<JSONSite>?,
    val message: String?,
    val status: Int
)
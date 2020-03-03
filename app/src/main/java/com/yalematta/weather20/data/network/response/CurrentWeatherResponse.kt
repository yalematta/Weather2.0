package com.yalematta.weather20.data.network.response


import com.yalematta.weather20.data.db.Weather
import com.yalematta.weather20.data.db.entity.*

data class CurrentWeatherResponse(
    val base: String,
    val clouds: Clouds,
    val cod: Int,
    val coord: Coord,
    val dt: Int,
    val id: Int,
    val main: Main,
    val name: String,
    val sys: Sys,
    val visibility: Int,
    val weather: List<Weather>,
    val wind: Wind
)
package com.foxycode.geolocationip_api.model


import com.google.gson.annotations.SerializedName

data class IpApiModel(
    @SerializedName("as")
    val autonomousSystem: String,
    @SerializedName("city")
    val city: String,
    @SerializedName("country")
    val country: String,
    @SerializedName("countryCode")
    val countryCode: String,
    @SerializedName("isp")
    val internetServiceProvider: String,
    @SerializedName("lat")
    val lat: Double,
    @SerializedName("lon")
    val lon: Double,
    @SerializedName("org")
    val org: String,
    @SerializedName("query")
    val ipQuery: String,
    @SerializedName("region")
    val region: String,
    @SerializedName("regionName")
    val regionName: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("timezone")
    val timezone: String,
    @SerializedName("zip")
    val postalCode: String
)
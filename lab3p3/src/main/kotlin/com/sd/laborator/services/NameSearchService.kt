package com.sd.laborator.services

import com.sd.laborator.interfaces.NameSearchInterface
import org.springframework.stereotype.Service
import java.net.URL
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

@Service
class NameSearchService : NameSearchInterface {
    override fun getNameId(name: String) : Int{
        val encodedName=URLEncoder.encode(name, StandardCharsets.UTF_8.toString())
        val nameSearchURL= URL("https://www.metaweather.com/api/location/search/?query=$encodedLocationName")
    }
}
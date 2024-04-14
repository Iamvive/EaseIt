package com.appwork.easeit

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
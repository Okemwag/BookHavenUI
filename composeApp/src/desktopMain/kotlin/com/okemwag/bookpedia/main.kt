package com.okemwag.bookpedia

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.okemwag.bookpedia.app.App
import com.okemwag.bookpedia.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "CMP-Bookpedia",
        ) {
            App()
        }
    }
}
package com.okemwag.bookpedia

import androidx.compose.ui.window.ComposeUIViewController
import com.okemwag.bookpedia.app.App
import com.okemwag.bookpedia.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) { App() }
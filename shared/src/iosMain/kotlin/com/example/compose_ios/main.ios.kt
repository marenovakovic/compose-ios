package com.example.compose_ios

import androidx.compose.ui.window.Application
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController =
    Application("Example Application") {
        ExampleApplication()
    }

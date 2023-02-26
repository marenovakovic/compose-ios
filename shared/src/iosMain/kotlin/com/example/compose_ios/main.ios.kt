package com.example.compose_ios

import androidx.compose.ui.window.Application
import platform.UIKit.UIViewController

public fun MainViewController(): UIViewController =
    Application("Example Application") {
        ExampleApplication()
    }

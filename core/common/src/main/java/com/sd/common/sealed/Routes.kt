package com.sd.common.sealed

sealed class Routes(val route: String) {
    data object MainScreen : Routes("mainScreen")
}
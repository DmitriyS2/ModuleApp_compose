package com.sd.plusone.presentation

sealed class Routes(val route: String) {
    data object MainScreen : Routes("mainScreen")
}
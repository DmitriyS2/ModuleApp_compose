package com.sd.moduleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sd.plusone.presentation.Routes
import com.sd.moduleapp.ui.theme.ModuleAppTheme
import com.sd.plusone.presentation.MainScreen
import com.sd.plusone.presentation.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            val vm: MainViewModel = viewModel()
            ModuleAppTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    NavHost(
                        navController = navController,
                        startDestination = Routes.MainScreen.route
                    ) {
                        composable(Routes.MainScreen.route) {
                            MainScreen(vm)
                        }
                    }
                }
            }
        }
    }
}


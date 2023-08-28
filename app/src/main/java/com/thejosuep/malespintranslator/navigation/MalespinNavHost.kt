package com.thejosuep.malespintranslator.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost

@Composable
fun MalespinNavHost(
    appState: MalespinAppState,
    startDestination: String = translatorRoute,
){
    val navController = appState.navController

    NavHost(
        navController = navController,
        startDestination = startDestination
    ){
        translatorScreen()

        favoritesScreen()
    }
}
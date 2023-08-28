package com.thejosuep.malespintranslator.ui.screens

import com.thejosuep.malespintranslator.R

enum class TopLevelDestinations(
    val selectedIconId: Int,
    val unselectedIconId: Int,
    val titleTextId: Int,
    val iconTextId: Int
) {
    TRANSLATOR(
        selectedIconId = R.drawable.ic_translate,
        unselectedIconId = R.drawable.ic_translate,
        titleTextId = R.string.app_name,
        iconTextId = R.string.app_name
    ),
    FAVORITES(
        selectedIconId = R.drawable.ic_star,
        unselectedIconId = R.drawable.ic_star_outline,
        titleTextId = R.string.app_name,
        iconTextId = R.string.app_name
    )
}
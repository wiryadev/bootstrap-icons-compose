package com.wiryadev.bootstrapiconscompose

import androidx.compose.ui.graphics.vector.ImageVector
import icons.bootstrapicons.AllAssets
import icons.bootstrapicons.Filled
import icons.bootstrapicons.Normal
import kotlin.collections.List as ____KtList

public object BootstrapIcons

private var __AllAssets: ____KtList<ImageVector>? = null

public val BootstrapIcons.AllAssets: ____KtList<ImageVector>
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets = Filled.AllAssets + Normal.AllAssets + listOf()
    return __AllAssets!!
  }
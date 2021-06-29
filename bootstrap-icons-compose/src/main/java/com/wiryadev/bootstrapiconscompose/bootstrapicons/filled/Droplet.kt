package com.wiryadev.bootstrapiconscompose.bootstrapicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wiryadev.bootstrapiconscompose.bootstrapicons.FilledGroup

public val FilledGroup.Droplet: ImageVector
    get() {
        if (_droplet != null) {
            return _droplet!!
        }
        _droplet = Builder(name = "Droplet", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                curveToRelative(0.0f, -1.655f, -1.122f, -2.904f, -2.432f, -4.362f)
                curveTo(10.254f, 4.176f, 8.75f, 2.503f, 8.0f, 0.0f)
                curveToRelative(0.0f, 0.0f, -6.0f, 5.686f, -6.0f, 10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                close()
                moveTo(6.646f, 4.646f)
                curveToRelative(-0.376f, 0.377f, -1.272f, 1.489f, -2.093f, 3.13f)
                lineToRelative(0.894f, 0.448f)
                curveToRelative(0.78f, -1.559f, 1.616f, -2.58f, 1.907f, -2.87f)
                lineToRelative(-0.708f, -0.708f)
                close()
            }
        }
        .build()
        return _droplet!!
    }

private var _droplet: ImageVector? = null

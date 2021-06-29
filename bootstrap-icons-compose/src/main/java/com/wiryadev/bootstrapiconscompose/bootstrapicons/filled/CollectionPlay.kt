package com.wiryadev.bootstrapiconscompose.bootstrapicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val CollectionPlay: ImageVector
    get() {
        if (_collectionPlay != null) {
            return _collectionPlay!!
        }
        _collectionPlay = Builder(name = "CollectionPlay", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-11.0f)
                close()
                moveTo(4.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(0.0f, 13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.0f, 13.0f)
                lineTo(16.0f, 6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                horizontalLineToRelative(-13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.0f, 6.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(6.258f, 6.563f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.507f, 0.013f)
                lineToRelative(4.0f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.848f)
                lineToRelative(-4.0f, 2.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 12.0f)
                lineTo(6.0f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.258f, -0.437f)
                close()
            }
        }
        .build()
        return _collectionPlay!!
    }

private var _collectionPlay: ImageVector? = null

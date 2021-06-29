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
import com.wiryadev.bootstrapiconscompose.bootstrapicons.FilledGroup

public val FilledGroup.NodePlus: ImageVector
    get() {
        if (_nodePlus != null) {
            return _nodePlus!!
        }
        _nodePlus = Builder(name = "NodePlus", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 13.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, -4.975f, -5.5f)
                lineTo(4.0f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 2.5f, 6.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.0f, 7.5f)
                verticalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.5f, 10.0f)
                horizontalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.0f, 8.5f)
                horizontalLineToRelative(2.025f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 11.0f, 13.0f)
                close()
                moveTo(11.5f, 5.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                close()
            }
        }
        .build()
        return _nodePlus!!
    }

private var _nodePlus: ImageVector? = null

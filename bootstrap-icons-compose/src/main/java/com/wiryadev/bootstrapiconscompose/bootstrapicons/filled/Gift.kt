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

public val FilledGroup.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = Builder(name = "Gift", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 2.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                verticalLineToRelative(0.006f)
                curveToRelative(0.0f, 0.07f, 0.0f, 0.27f, -0.038f, 0.494f)
                lineTo(15.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(1.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(0.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(2.038f)
                arcTo(2.968f, 2.968f, 0.0f, false, true, 3.0f, 2.506f)
                lineTo(3.0f, 2.5f)
                close()
                moveTo(4.068f, 3.0f)
                lineTo(7.0f, 3.0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, 0.0f)
                curveToRelative(0.0f, 0.085f, 0.002f, 0.274f, 0.045f, 0.43f)
                arcToRelative(0.522f, 0.522f, 0.0f, false, false, 0.023f, 0.07f)
                close()
                moveTo(9.0f, 3.0f)
                horizontalLineToRelative(2.932f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, false, 0.023f, -0.07f)
                curveToRelative(0.043f, -0.156f, 0.045f, -0.345f, 0.045f, -0.43f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                lineTo(9.0f, 3.0f)
                close()
                moveTo(15.0f, 7.0f)
                verticalLineToRelative(7.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                lineTo(9.0f, 16.0f)
                lineTo(9.0f, 7.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(2.5f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.0f, 14.5f)
                lineTo(1.0f, 7.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(9.0f)
                lineTo(2.5f, 16.0f)
                close()
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null

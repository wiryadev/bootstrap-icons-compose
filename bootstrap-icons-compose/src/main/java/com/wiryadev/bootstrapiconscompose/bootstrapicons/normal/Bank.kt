package com.wiryadev.bootstrapiconscompose.bootstrapicons.normal

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wiryadev.bootstrapiconscompose.bootstrapicons.NormalGroup

public val NormalGroup.Bank: ImageVector
    get() {
        if (_bank != null) {
            return _bank!!
        }
        _bank = Builder(name = "Bank", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.95f)
                lineTo(14.61f, 4.0f)
                horizontalLineToRelative(0.89f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(15.0f, 7.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.485f, 0.379f)
                lineToRelative(0.5f, 2.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 15.5f, 17.0f)
                lineTo(0.5f, 17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.485f, -0.621f)
                lineToRelative(0.5f, -2.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 1.0f, 14.0f)
                lineTo(1.0f, 7.0f)
                lineTo(0.5f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-2.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 0.5f, 4.0f)
                horizontalLineToRelative(0.89f)
                lineTo(8.0f, 0.95f)
                close()
                moveTo(3.776f, 4.0f)
                horizontalLineToRelative(8.447f)
                lineTo(8.0f, 2.05f)
                lineTo(3.776f, 4.0f)
                close()
                moveTo(2.0f, 7.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(1.0f)
                lineTo(3.0f, 7.0f)
                lineTo(2.0f, 7.0f)
                close()
                moveTo(4.0f, 7.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.5f)
                lineTo(6.5f, 7.0f)
                lineTo(4.0f, 7.0f)
                close()
                moveTo(7.5f, 7.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(1.0f)
                lineTo(8.5f, 7.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(9.5f, 7.0f)
                verticalLineToRelative(7.0f)
                lineTo(12.0f, 14.0f)
                lineTo(12.0f, 7.0f)
                lineTo(9.5f, 7.0f)
                close()
                moveTo(13.0f, 7.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(1.0f)
                lineTo(14.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(15.0f, 6.0f)
                lineTo(15.0f, 5.0f)
                lineTo(1.0f, 5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(14.0f)
                close()
                moveTo(14.61f, 15.0f)
                lineTo(1.39f, 15.0f)
                lineToRelative(-0.25f, 1.0f)
                horizontalLineToRelative(13.72f)
                lineToRelative(-0.25f, -1.0f)
                close()
            }
        }
        .build()
        return _bank!!
    }

private var _bank: ImageVector? = null

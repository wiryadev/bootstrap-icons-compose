package com.wiryadev.bootstrapiconscompose.bootstrapicons.normal

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wiryadev.bootstrapiconscompose.bootstrapicons.NormalGroup

public val NormalGroup.MicMute: ImageVector
    get() {
        if (_micMute != null) {
            return _micMute!!
        }
        _micMute = Builder(name = "MicMute", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 8.0f)
                curveToRelative(0.0f, 0.564f, -0.094f, 1.107f, -0.266f, 1.613f)
                lineToRelative(-0.814f, -0.814f)
                arcTo(4.02f, 4.02f, 0.0f, false, false, 12.0f, 8.0f)
                lineTo(12.0f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(8.0f, 12.0f)
                curveToRelative(0.818f, 0.0f, 1.578f, -0.245f, 2.212f, -0.667f)
                lineToRelative(0.718f, 0.719f)
                arcToRelative(4.973f, 4.973f, 0.0f, false, true, -2.43f, 0.923f)
                lineTo(8.5f, 15.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.025f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 3.0f, 8.0f)
                lineTo(3.0f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                close()
                moveTo(11.0f, 3.0f)
                verticalLineToRelative(4.879f)
                lineToRelative(-1.0f, -1.0f)
                lineTo(10.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.997f, -0.118f)
                lineToRelative(-0.845f, -0.845f)
                arcTo(3.001f, 3.001f, 0.0f, false, true, 11.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.486f, 10.607f)
                lineToRelative(-0.748f, -0.748f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 8.0f)
                verticalLineToRelative(-0.878f)
                lineToRelative(-1.0f, -1.0f)
                lineTo(5.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.486f, 2.607f)
                close()
                moveTo(1.646f, 1.354f)
                lineTo(13.646f, 13.354f)
                lineTo(14.354f, 12.646f)
                lineTo(2.354f, 0.646f)
                lineTo(1.646f, 1.354f)
                close()
            }
        }
        .build()
        return _micMute!!
    }

private var _micMute: ImageVector? = null

package icons.bootstrapicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.bootstrapicons.FilledGroup

public val FilledGroup.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) {
            return _shieldSlash!!
        }
        _shieldSlash = Builder(name = "ShieldSlash", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.093f, 3.093f)
                curveToRelative(-0.465f, 4.275f, 0.885f, 7.46f, 2.513f, 9.589f)
                arcToRelative(11.777f, 11.777f, 0.0f, false, false, 2.517f, 2.453f)
                curveToRelative(0.386f, 0.273f, 0.744f, 0.482f, 1.048f, 0.625f)
                curveToRelative(0.28f, 0.132f, 0.581f, 0.24f, 0.829f, 0.24f)
                reflectiveCurveToRelative(0.548f, -0.108f, 0.829f, -0.24f)
                arcToRelative(7.159f, 7.159f, 0.0f, false, false, 1.048f, -0.625f)
                arcToRelative(11.32f, 11.32f, 0.0f, false, false, 1.733f, -1.525f)
                lineTo(1.093f, 3.093f)
                close()
                moveTo(13.308f, 11.308f)
                lineTo(3.128f, 1.128f)
                arcTo(61.369f, 61.369f, 0.0f, false, true, 5.073f, 0.56f)
                curveTo(6.157f, 0.265f, 7.31f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveToRelative(1.843f, 0.265f, 2.928f, 0.56f)
                curveToRelative(1.11f, 0.3f, 2.229f, 0.655f, 2.887f, 0.87f)
                arcToRelative(1.54f, 1.54f, 0.0f, false, true, 1.044f, 1.262f)
                curveToRelative(0.483f, 3.626f, -0.332f, 6.491f, -1.551f, 8.616f)
                close()
                moveTo(13.646f, 14.354f)
                lineTo(0.646f, 1.354f)
                lineTo(1.354f, 0.646f)
                lineTo(14.354f, 13.646f)
                lineTo(13.647f, 14.353f)
                close()
            }
        }
        .build()
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null

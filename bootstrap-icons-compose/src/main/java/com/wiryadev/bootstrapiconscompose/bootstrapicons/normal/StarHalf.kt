package icons.bootstrapicons.normal

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.bootstrapicons.NormalGroup

public val NormalGroup.StarHalf: ImageVector
    get() {
        if (_starHalf != null) {
            return _starHalf!!
        }
        _starHalf = Builder(name = "StarHalf", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.354f, 5.119f)
                lineTo(7.538f, 0.792f)
                arcTo(0.516f, 0.516f, 0.0f, false, true, 8.0f, 0.5f)
                curveToRelative(0.183f, 0.0f, 0.366f, 0.097f, 0.465f, 0.292f)
                lineToRelative(2.184f, 4.327f)
                lineToRelative(4.898f, 0.696f)
                arcTo(0.537f, 0.537f, 0.0f, false, true, 16.0f, 6.32f)
                arcToRelative(0.548f, 0.548f, 0.0f, false, true, -0.17f, 0.445f)
                lineToRelative(-3.523f, 3.356f)
                lineToRelative(0.83f, 4.73f)
                curveToRelative(0.078f, 0.443f, -0.36f, 0.79f, -0.746f, 0.592f)
                lineTo(8.0f, 13.187f)
                lineToRelative(-4.389f, 2.256f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, true, -0.146f, 0.05f)
                curveToRelative(-0.342f, 0.06f, -0.668f, -0.254f, -0.6f, -0.642f)
                lineToRelative(0.83f, -4.73f)
                lineTo(0.173f, 6.765f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -0.172f, -0.403f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, true, 0.085f, -0.302f)
                arcToRelative(0.513f, 0.513f, 0.0f, false, true, 0.37f, -0.245f)
                lineToRelative(4.898f, -0.696f)
                close()
                moveTo(8.0f, 12.027f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.232f, 0.056f)
                lineToRelative(3.686f, 1.894f)
                lineToRelative(-0.694f, -3.957f)
                arcToRelative(0.565f, 0.565f, 0.0f, false, true, 0.162f, -0.505f)
                lineToRelative(2.907f, -2.77f)
                lineToRelative(-4.052f, -0.576f)
                arcToRelative(0.525f, 0.525f, 0.0f, false, true, -0.393f, -0.288f)
                lineTo(8.001f, 2.223f)
                lineTo(8.0f, 2.226f)
                verticalLineToRelative(9.8f)
                close()
            }
        }
        .build()
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null

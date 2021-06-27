package icons.bootstrapicons.filled

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
import icons.bootstrapicons.FilledGroup

public val FilledGroup.Safe2: ImageVector
    get() {
        if (_safe2 != null) {
            return _safe2!!
        }
        _safe2 = Builder(name = "Safe2", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.563f, 8.0f)
                lineTo(5.035f, 8.0f)
                arcToRelative(3.482f, 3.482f, 0.0f, false, true, 0.662f, -1.596f)
                lineToRelative(1.08f, 1.08f)
                curveToRelative(-0.094f, 0.16f, -0.167f, 0.332f, -0.214f, 0.516f)
                close()
                moveTo(7.484f, 6.777f)
                lineTo(6.404f, 5.697f)
                arcTo(3.482f, 3.482f, 0.0f, false, true, 8.0f, 5.035f)
                verticalLineToRelative(1.528f)
                curveToRelative(-0.184f, 0.047f, -0.357f, 0.12f, -0.516f, 0.214f)
                close()
                moveTo(9.0f, 6.563f)
                lineTo(9.0f, 5.035f)
                arcToRelative(3.482f, 3.482f, 0.0f, false, true, 1.596f, 0.662f)
                lineToRelative(-1.08f, 1.08f)
                arcTo(1.988f, 1.988f, 0.0f, false, false, 9.0f, 6.563f)
                close()
                moveTo(10.223f, 7.484f)
                lineTo(11.303f, 6.404f)
                curveToRelative(0.343f, 0.458f, 0.577f, 1.003f, 0.662f, 1.596f)
                horizontalLineToRelative(-1.528f)
                arcToRelative(1.989f, 1.989f, 0.0f, false, false, -0.214f, -0.516f)
                close()
                moveTo(10.437f, 9.0f)
                horizontalLineToRelative(1.528f)
                arcToRelative(3.483f, 3.483f, 0.0f, false, true, -0.662f, 1.596f)
                lineToRelative(-1.08f, -1.08f)
                curveToRelative(0.094f, -0.16f, 0.167f, -0.332f, 0.214f, -0.516f)
                close()
                moveTo(9.516f, 10.223f)
                lineTo(10.596f, 11.303f)
                arcTo(3.483f, 3.483f, 0.0f, false, true, 9.0f, 11.965f)
                verticalLineToRelative(-1.528f)
                curveToRelative(0.184f, -0.047f, 0.357f, -0.12f, 0.516f, -0.214f)
                close()
                moveTo(8.0f, 10.437f)
                verticalLineToRelative(1.528f)
                arcToRelative(3.483f, 3.483f, 0.0f, false, true, -1.596f, -0.662f)
                lineToRelative(1.08f, -1.08f)
                curveToRelative(0.16f, 0.094f, 0.332f, 0.167f, 0.516f, 0.214f)
                close()
                moveTo(6.777f, 9.516f)
                lineTo(5.697f, 10.596f)
                arcTo(3.482f, 3.482f, 0.0f, false, true, 5.035f, 9.0f)
                horizontalLineToRelative(1.528f)
                curveToRelative(0.047f, 0.184f, 0.12f, 0.357f, 0.214f, 0.516f)
                close()
                moveTo(7.5f, 8.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.0f, 2.5f)
                lineTo(1.0f, 3.0f)
                lineTo(0.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                lineTo(1.0f, 4.0f)
                verticalLineToRelative(4.0f)
                lineTo(0.5f, 8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                lineTo(1.0f, 9.0f)
                verticalLineToRelative(4.0f)
                lineTo(0.5f, 13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                lineTo(1.0f, 14.0f)
                verticalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 2.5f, 16.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 1.0f)
                horizontalLineToRelative(-12.0f)
                close()
                moveTo(8.5f, 4.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 0.0f, 9.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 0.0f, -9.0f)
                close()
            }
        }
        .build()
        return _safe2!!
    }

private var _safe2: ImageVector? = null

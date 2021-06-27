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

public val NormalGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 2.748f)
                lineToRelative(-0.717f, -0.737f)
                curveTo(5.6f, 0.281f, 2.514f, 0.878f, 1.4f, 3.053f)
                curveToRelative(-0.523f, 1.023f, -0.641f, 2.5f, 0.314f, 4.385f)
                curveToRelative(0.92f, 1.815f, 2.834f, 3.989f, 6.286f, 6.357f)
                curveToRelative(3.452f, -2.368f, 5.365f, -4.542f, 6.286f, -6.357f)
                curveToRelative(0.955f, -1.886f, 0.838f, -3.362f, 0.314f, -4.385f)
                curveTo(13.486f, 0.878f, 10.4f, 0.28f, 8.717f, 2.01f)
                lineTo(8.0f, 2.748f)
                close()
                moveTo(8.0f, 15.0f)
                curveTo(-7.333f, 4.868f, 3.279f, -3.04f, 7.824f, 1.143f)
                curveToRelative(0.06f, 0.055f, 0.119f, 0.112f, 0.176f, 0.171f)
                arcToRelative(3.12f, 3.12f, 0.0f, false, true, 0.176f, -0.17f)
                curveTo(12.72f, -3.042f, 23.333f, 4.867f, 8.0f, 15.0f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null

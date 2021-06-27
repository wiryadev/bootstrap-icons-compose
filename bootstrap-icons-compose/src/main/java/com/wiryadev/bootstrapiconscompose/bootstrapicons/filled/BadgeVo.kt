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

public val FilledGroup.BadgeVo: ImageVector
    get() {
        if (_badgeVo != null) {
            return _badgeVo!!
        }
        _badgeVo = Builder(name = "BadgeVo", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.296f, 8.394f)
                verticalLineToRelative(-0.782f)
                curveToRelative(0.0f, -1.156f, -0.571f, -1.736f, -1.362f, -1.736f)
                curveToRelative(-0.796f, 0.0f, -1.363f, 0.58f, -1.363f, 1.736f)
                verticalLineToRelative(0.782f)
                curveToRelative(0.0f, 1.156f, 0.567f, 1.732f, 1.363f, 1.732f)
                curveToRelative(0.79f, 0.0f, 1.362f, -0.576f, 1.362f, -1.732f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(16.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(2.0f, 2.0f)
                close()
                moveTo(13.5f, 7.62f)
                verticalLineToRelative(0.77f)
                curveToRelative(0.0f, 1.691f, -0.962f, 2.724f, -2.566f, 2.724f)
                curveToRelative(-1.604f, 0.0f, -2.571f, -1.033f, -2.571f, -2.724f)
                verticalLineToRelative(-0.77f)
                curveToRelative(0.0f, -1.704f, 0.967f, -2.733f, 2.57f, -2.733f)
                curveToRelative(1.605f, 0.0f, 2.567f, 1.037f, 2.567f, 2.734f)
                close()
                moveTo(5.937f, 11.0f)
                lineTo(4.508f, 11.0f)
                lineTo(2.5f, 5.001f)
                horizontalLineToRelative(1.375f)
                lineTo(5.22f, 9.708f)
                horizontalLineToRelative(0.057f)
                lineTo(6.61f, 5.001f)
                horizontalLineToRelative(1.318f)
                lineTo(5.937f, 11.0f)
                close()
            }
        }
        .build()
        return _badgeVo!!
    }

private var _badgeVo: ImageVector? = null

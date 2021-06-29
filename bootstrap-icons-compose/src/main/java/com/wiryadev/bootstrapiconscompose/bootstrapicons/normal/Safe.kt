package icons.bootstrapicons.normal

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

public val NormalGroup.Safe: ImageVector
    get() {
        if (_safe != null) {
            return _safe!!
        }
        _safe = Builder(name = "Safe", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.5f, 0.0f)
                horizontalLineToRelative(12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 1.5f)
                verticalLineToRelative(13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.0f, 14.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(1.5f)
                close()
                moveTo(2.5f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                close()
                moveTo(4.828f, 4.464f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.0f)
                lineToRelative(1.09f, 1.09f)
                arcToRelative(3.003f, 3.003f, 0.0f, false, true, 3.476f, 0.0f)
                lineToRelative(1.09f, -1.09f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.707f, 0.708f)
                lineToRelative(-1.09f, 1.09f)
                curveToRelative(0.74f, 1.037f, 0.74f, 2.44f, 0.0f, 3.476f)
                lineToRelative(1.09f, 1.09f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.707f, 0.708f)
                lineToRelative(-1.09f, -1.09f)
                arcToRelative(3.002f, 3.002f, 0.0f, false, true, -3.476f, 0.0f)
                lineToRelative(-1.09f, 1.09f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.708f, -0.708f)
                lineToRelative(1.09f, -1.09f)
                arcToRelative(3.003f, 3.003f, 0.0f, false, true, 0.0f, -3.476f)
                lineToRelative(-1.09f, -1.09f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.708f)
                close()
                moveTo(6.95f, 6.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 2.828f, 2.828f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.95f, 6.586f)
                close()
            }
        }
        .build()
        return _safe!!
    }

private var _safe: ImageVector? = null

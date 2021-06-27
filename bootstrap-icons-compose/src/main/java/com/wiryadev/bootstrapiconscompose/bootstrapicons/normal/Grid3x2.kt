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

public val NormalGroup.Grid3x2: ImageVector
    get() {
        if (_grid3x2 != null) {
            return _grid3x2!!
        }
        _grid3x2 = Builder(name = "Grid3x2", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.5f, 2.0f)
                horizontalLineToRelative(13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 3.5f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 0.0f, 11.5f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(1.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                lineTo(1.0f, 7.0f)
                horizontalLineToRelative(4.0f)
                lineTo(5.0f, 3.0f)
                lineTo(1.5f, 3.0f)
                close()
                moveTo(5.0f, 8.0f)
                lineTo(1.0f, 8.0f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                lineTo(5.0f, 12.0f)
                lineTo(5.0f, 8.0f)
                close()
                moveTo(6.0f, 8.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                lineTo(10.0f, 8.0f)
                lineTo(6.0f, 8.0f)
                close()
                moveTo(10.0f, 7.0f)
                lineTo(10.0f, 3.0f)
                lineTo(6.0f, 3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(11.0f, 8.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                lineTo(15.0f, 8.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(11.0f, 7.0f)
                horizontalLineToRelative(4.0f)
                lineTo(15.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                lineTo(11.0f, 3.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _grid3x2!!
    }

private var _grid3x2: ImageVector? = null

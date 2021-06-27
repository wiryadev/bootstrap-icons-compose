package icons.bootstrapicons.normal

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.bootstrapicons.NormalGroup

public val NormalGroup.ArrowsCollapse: ImageVector
    get() {
        if (_arrowsCollapse != null) {
            return _arrowsCollapse!!
        }
        _arrowsCollapse = Builder(name = "ArrowsCollapse", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.0f, 8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-13.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 1.0f, 8.0f)
                close()
                moveTo(8.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3.793f)
                lineToRelative(1.146f, -1.147f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.708f)
                lineToRelative(-2.0f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, 0.0f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.708f, -0.708f)
                lineTo(7.5f, 4.293f)
                lineTo(7.5f, 0.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(7.5f, 11.707f)
                lineTo(6.354f, 12.854f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, -0.708f)
                lineToRelative(2.0f, -2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.0f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, 0.708f)
                lineTo(8.5f, 11.707f)
                lineTo(8.5f, 15.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-3.793f)
                close()
            }
        }
        .build()
        return _arrowsCollapse!!
    }

private var _arrowsCollapse: ImageVector? = null

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

public val NormalGroup.ArrowLeftSquare: ImageVector
    get() {
        if (_arrowLeftSquare != null) {
            return _arrowLeftSquare!!
        }
        _arrowLeftSquare = Builder(name = "ArrowLeftSquare", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(2.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(15.0f, 2.0f)
                close()
                moveTo(0.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(2.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(0.0f, 2.0f)
                close()
                moveTo(11.5f, 7.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(5.707f, 8.5f)
                lineToRelative(2.147f, 2.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, 0.708f)
                lineToRelative(-3.0f, -3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.708f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.708f, 0.708f)
                lineTo(5.707f, 7.5f)
                lineTo(11.5f, 7.5f)
                close()
            }
        }
        .build()
        return _arrowLeftSquare!!
    }

private var _arrowLeftSquare: ImageVector? = null

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

public val NormalGroup.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) {
            return _arrowLeft!!
        }
        _arrowLeft = Builder(name = "ArrowLeft", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineTo(2.707f)
                lineToRelative(3.147f, -3.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.708f, -0.708f)
                lineToRelative(-4.0f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.708f)
                lineToRelative(4.0f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, -0.708f)
                lineTo(2.707f, 8.5f)
                horizontalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 15.0f, 8.0f)
                close()
            }
        }
        .build()
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null

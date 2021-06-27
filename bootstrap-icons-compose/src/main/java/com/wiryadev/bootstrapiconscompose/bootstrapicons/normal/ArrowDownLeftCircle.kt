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

public val NormalGroup.ArrowDownLeftCircle: ImageVector
    get() {
        if (_arrowDownLeftCircle != null) {
            return _arrowDownLeftCircle!!
        }
        _arrowDownLeftCircle = Builder(name = "ArrowDownLeftCircle", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.0f, 8.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 14.0f, 0.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 1.0f, 8.0f)
                close()
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(10.096f, 5.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.707f, 0.708f)
                lineTo(6.707f, 9.95f)
                horizontalLineToRelative(2.768f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                lineTo(5.5f, 10.95f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                lineTo(5.0f, 6.475f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                verticalLineToRelative(2.768f)
                lineToRelative(4.096f, -4.097f)
                close()
            }
        }
        .build()
        return _arrowDownLeftCircle!!
    }

private var _arrowDownLeftCircle: ImageVector? = null

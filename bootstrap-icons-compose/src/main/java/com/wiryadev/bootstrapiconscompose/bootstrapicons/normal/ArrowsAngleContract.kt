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

public val NormalGroup.ArrowsAngleContract: ImageVector
    get() {
        if (_arrowsAngleContract != null) {
            return _arrowsAngleContract!!
        }
        _arrowsAngleContract = Builder(name = "ArrowsAngleContract", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(0.172f, 15.828f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, 0.0f)
                lineToRelative(4.096f, -4.096f)
                verticalLineTo(14.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 1.0f, 0.0f)
                verticalLineToRelative(-3.975f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(2.768f)
                lineTo(0.172f, 15.121f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.707f)
                close()
                moveTo(15.828f, 0.172f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.707f, 0.0f)
                lineToRelative(-4.096f, 4.096f)
                verticalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -1.0f, 0.0f)
                verticalLineToRelative(3.975f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineTo(14.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                horizontalLineToRelative(-2.768f)
                lineTo(15.828f, 0.879f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.707f)
                close()
            }
        }
        .build()
        return _arrowsAngleContract!!
    }

private var _arrowsAngleContract: ImageVector? = null

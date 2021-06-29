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
import com.wiryadev.bootstrapiconscompose.bootstrapicons.NormalGroup

public val NormalGroup.ArrowsAngleExpand: ImageVector
    get() {
        if (_arrowsAngleExpand != null) {
            return _arrowsAngleExpand!!
        }
        _arrowsAngleExpand = Builder(name = "ArrowsAngleExpand", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.828f, 10.172f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.707f, 0.0f)
                lineToRelative(-4.096f, 4.096f)
                lineTo(1.025f, 11.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(3.975f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                lineTo(4.5f, 15.975f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                lineTo(1.732f, 14.975f)
                lineToRelative(4.096f, -4.096f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.707f)
                close()
                moveTo(10.172f, 5.828f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, 0.0f)
                lineToRelative(4.096f, -4.096f)
                lineTo(14.975f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 1.0f, 0.0f)
                lineTo(15.975f, 0.525f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                lineTo(11.5f, 0.025f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(2.768f)
                lineToRelative(-4.096f, 4.096f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.707f)
                close()
            }
        }
        .build()
        return _arrowsAngleExpand!!
    }

private var _arrowsAngleExpand: ImageVector? = null

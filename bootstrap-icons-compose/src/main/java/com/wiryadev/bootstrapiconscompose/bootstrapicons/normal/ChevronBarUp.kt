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

public val NormalGroup.ChevronBarUp: ImageVector
    get() {
        if (_chevronBarUp != null) {
            return _chevronBarUp!!
        }
        _chevronBarUp = Builder(name = "ChevronBarUp", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.646f, 11.854f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, 0.0f)
                lineTo(8.0f, 8.207f)
                lineToRelative(3.646f, 3.647f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, -0.708f)
                lineToRelative(-4.0f, -4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.708f, 0.0f)
                lineToRelative(-4.0f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.708f)
                close()
                moveTo(2.4f, 5.2f)
                curveToRelative(0.0f, 0.22f, 0.18f, 0.4f, 0.4f, 0.4f)
                horizontalLineToRelative(10.4f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.0f, -0.8f)
                horizontalLineTo(2.8f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.4f, 0.4f)
                close()
            }
        }
        .build()
        return _chevronBarUp!!
    }

private var _chevronBarUp: ImageVector? = null

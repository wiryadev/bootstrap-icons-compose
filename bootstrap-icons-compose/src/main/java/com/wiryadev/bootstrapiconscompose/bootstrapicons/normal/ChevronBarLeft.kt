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

public val NormalGroup.ChevronBarLeft: ImageVector
    get() {
        if (_chevronBarLeft != null) {
            return _chevronBarLeft!!
        }
        _chevronBarLeft = Builder(name = "ChevronBarLeft", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.854f, 3.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.708f)
                lineTo(8.207f, 8.0f)
                lineToRelative(3.647f, 3.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, 0.708f)
                lineToRelative(-4.0f, -4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.708f)
                lineToRelative(4.0f, -4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.0f)
                close()
                moveTo(4.5f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineToRelative(-13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
            }
        }
        .build()
        return _chevronBarLeft!!
    }

private var _chevronBarLeft: ImageVector? = null

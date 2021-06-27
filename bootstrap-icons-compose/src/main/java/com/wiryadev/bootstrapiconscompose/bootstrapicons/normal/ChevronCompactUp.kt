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

public val NormalGroup.ChevronCompactUp: ImageVector
    get() {
        if (_chevronCompactUp != null) {
            return _chevronCompactUp!!
        }
        _chevronCompactUp = Builder(name = "ChevronCompactUp", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.776f, 5.553f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.448f, 0.0f)
                lineToRelative(6.0f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.448f, 0.894f)
                lineTo(8.0f, 6.56f)
                lineTo(2.224f, 9.447f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.448f, -0.894f)
                lineToRelative(6.0f, -3.0f)
                close()
            }
        }
        .build()
        return _chevronCompactUp!!
    }

private var _chevronCompactUp: ImageVector? = null

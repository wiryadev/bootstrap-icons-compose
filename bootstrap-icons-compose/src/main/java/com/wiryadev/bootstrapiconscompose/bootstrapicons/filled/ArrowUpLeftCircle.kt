package icons.bootstrapicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.bootstrapicons.FilledGroup

public val FilledGroup.ArrowUpLeftCircle: ImageVector
    get() {
        if (_arrowUpLeftCircle != null) {
            return _arrowUpLeftCircle!!
        }
        _arrowUpLeftCircle = Builder(name = "ArrowUpLeftCircle", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(10.096f, 10.803f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.707f, -0.707f)
                lineTo(6.707f, 6.0f)
                horizontalLineToRelative(2.768f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, -1.0f)
                lineTo(5.5f, 5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(3.975f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                lineTo(6.0f, 6.707f)
                lineToRelative(4.096f, 4.096f)
                close()
            }
        }
        .build()
        return _arrowUpLeftCircle!!
    }

private var _arrowUpLeftCircle: ImageVector? = null

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
import com.wiryadev.bootstrapiconscompose.bootstrapicons.FilledGroup

public val FilledGroup.Envelope: ImageVector
    get() {
        if (_envelope != null) {
            return _envelope!!
        }
        _envelope = Builder(name = "Envelope", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.05f, 3.555f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.95f, 1.555f)
                lineTo(8.0f, 8.414f)
                lineTo(0.05f, 3.555f)
                close()
                moveTo(0.0f, 4.697f)
                verticalLineToRelative(7.104f)
                lineToRelative(5.803f, -3.558f)
                lineTo(0.0f, 4.697f)
                close()
                moveTo(6.761f, 8.83f)
                lineToRelative(-6.57f, 4.027f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 14.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.808f, -1.144f)
                lineToRelative(-6.57f, -4.027f)
                lineTo(8.0f, 9.586f)
                lineToRelative(-1.239f, -0.757f)
                close()
                moveTo(10.197f, 8.244f)
                lineTo(16.0f, 11.801f)
                lineTo(16.0f, 4.697f)
                lineToRelative(-5.803f, 3.546f)
                close()
            }
        }
        .build()
        return _envelope!!
    }

private var _envelope: ImageVector? = null

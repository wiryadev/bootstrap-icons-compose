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

public val FilledGroup.Peace: ImageVector
    get() {
        if (_peace != null) {
            return _peace!!
        }
        _peace = Builder(name = "Peace", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 13.292f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 8.5f, 0.015f)
                verticalLineToRelative(7.778f)
                lineToRelative(5.5f, 5.5f)
                close()
                moveTo(13.292f, 14.0f)
                lineTo(8.5f, 9.206f)
                verticalLineToRelative(6.778f)
                arcToRelative(7.967f, 7.967f, 0.0f, false, false, 4.792f, -1.986f)
                close()
                moveTo(7.5f, 15.985f)
                lineTo(7.5f, 9.207f)
                lineTo(2.708f, 14.0f)
                arcTo(7.967f, 7.967f, 0.0f, false, false, 7.5f, 15.985f)
                close()
                moveTo(2.0f, 13.292f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 7.5f, 0.015f)
                verticalLineToRelative(7.778f)
                lineToRelative(-5.5f, 5.5f)
                close()
            }
        }
        .build()
        return _peace!!
    }

private var _peace: ImageVector? = null

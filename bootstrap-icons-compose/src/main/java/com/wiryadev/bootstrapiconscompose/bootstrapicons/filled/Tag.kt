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

public val FilledGroup.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = Builder(name = "Tag", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth
                = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(4.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.293f, 0.707f)
                lineToRelative(7.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                lineToRelative(4.586f, -4.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.414f)
                lineToRelative(-7.0f, -7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.586f, 1.0f)
                lineTo(2.0f, 1.0f)
                close()
                moveTo(6.0f, 4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _tag!!
    }

private var _tag: ImageVector? = null

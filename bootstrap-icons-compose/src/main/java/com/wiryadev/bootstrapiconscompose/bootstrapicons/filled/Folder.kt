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

public val FilledGroup.Folder: ImageVector
    get() {
        if (_folder != null) {
            return _folder!!
        }
        _folder = Builder(name = "Folder", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.828f, 3.0f)
                horizontalLineToRelative(3.982f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.992f, 2.181f)
                lineToRelative(-0.637f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.174f, 14.0f)
                lineTo(2.825f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.991f, -1.819f)
                lineToRelative(-0.637f, -7.0f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, true, 0.342f, -1.31f)
                lineTo(0.5f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(3.672f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.414f, 0.586f)
                lineToRelative(0.828f, 0.828f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.828f, 3.0f)
                close()
                moveTo(1.506f, 3.12f)
                curveTo(1.72f, 3.042f, 1.95f, 3.0f, 2.19f, 3.0f)
                horizontalLineToRelative(5.396f)
                lineToRelative(-0.707f, -0.707f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.172f, 2.0f)
                lineTo(2.5f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 0.981f)
                lineToRelative(0.006f, 0.139f)
                close()
            }
        }
        .build()
        return _folder!!
    }

private var _folder: ImageVector? = null

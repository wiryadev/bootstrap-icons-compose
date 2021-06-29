package icons.bootstrapicons.normal

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wiryadev.bootstrapiconscompose.bootstrapicons.NormalGroup

public val NormalGroup.CursorText: ImageVector
    get() {
        if (_cursorText != null) {
            return _cursorText!!
        }
        _cursorText = Builder(name = "CursorText", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                curveToRelative(0.862f, 0.0f, 1.573f, 0.287f, 2.06f, 0.566f)
                curveToRelative(0.174f, 0.099f, 0.321f, 0.198f, 0.44f, 0.286f)
                curveToRelative(0.119f, -0.088f, 0.266f, -0.187f, 0.44f, -0.286f)
                arcTo(4.165f, 4.165f, 0.0f, false, true, 10.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                curveToRelative(-0.638f, 0.0f, -1.177f, 0.213f, -1.564f, 0.434f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, false, -0.436f, 0.294f)
                lineTo(8.5f, 7.5f)
                lineTo(9.0f, 7.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(4.272f)
                curveToRelative(0.1f, 0.08f, 0.248f, 0.187f, 0.436f, 0.294f)
                curveToRelative(0.387f, 0.221f, 0.926f, 0.434f, 1.564f, 0.434f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                arcToRelative(4.165f, 4.165f, 0.0f, false, true, -2.06f, -0.566f)
                arcTo(4.561f, 4.561f, 0.0f, false, true, 8.0f, 13.65f)
                arcToRelative(4.561f, 4.561f, 0.0f, false, true, -0.44f, 0.285f)
                arcToRelative(4.165f, 4.165f, 0.0f, false, true, -2.06f, 0.566f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                curveToRelative(0.638f, 0.0f, 1.177f, -0.213f, 1.564f, -0.434f)
                curveToRelative(0.188f, -0.107f, 0.335f, -0.214f, 0.436f, -0.294f)
                lineTo(7.5f, 8.5f)
                lineTo(7.0f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(0.5f)
                lineTo(7.5f, 3.228f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, false, -0.436f, -0.294f)
                arcTo(3.166f, 3.166f, 0.0f, false, false, 5.5f, 2.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 5.0f, 2.0f)
                close()
                moveTo(8.352f, 3.355f)
                close()
                moveTo(7.648f, 12.645f)
                close()
            }
        }
        .build()
        return _cursorText!!
    }

private var _cursorText: ImageVector? = null

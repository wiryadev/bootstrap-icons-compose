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
import icons.bootstrapicons.NormalGroup

public val NormalGroup.TextareaResize: ImageVector
    get() {
        if (_textareaResize != null) {
            return _textareaResize!!
        }
        _textareaResize = Builder(name = "TextareaResize", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.5f, 4.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 1.5f)
                horizontalLineToRelative(12.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.5f, 4.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                lineTo(3.0f, 14.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 0.5f, 12.0f)
                lineTo(0.5f, 4.0f)
                close()
                moveTo(3.0f, 2.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.5f, 4.0f)
                verticalLineToRelative(8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.0f, 13.5f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                lineTo(16.5f, 4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.0f, 2.5f)
                lineTo(3.0f, 2.5f)
                close()
                moveTo(14.854f, 8.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.708f)
                lineToRelative(-3.0f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, -0.708f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.0f)
                close()
                moveTo(14.854f, 10.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.708f)
                lineToRelative(-0.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, -0.708f)
                lineToRelative(0.5f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.0f)
                close()
            }
        }
        .build()
        return _textareaResize!!
    }

private var _textareaResize: ImageVector? = null

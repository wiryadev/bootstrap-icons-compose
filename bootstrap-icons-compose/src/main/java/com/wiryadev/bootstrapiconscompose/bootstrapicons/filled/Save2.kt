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

public val FilledGroup.Save2: ImageVector
    get() {
        if (_save2 != null) {
            return _save2!!
        }
        _save2 = Builder(name = "Save2", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.0f, 0.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(-0.314f, 0.418f, -0.5f, 0.937f, -0.5f, 1.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.354f, 0.854f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, 0.0f)
                lineToRelative(2.5f, -2.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 10.5f, 7.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _save2!!
    }

private var _save2: ImageVector? = null

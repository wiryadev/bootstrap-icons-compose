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

public val FilledGroup.CaretDown: ImageVector
    get() {
        if (_caretDown != null) {
            return _caretDown!!
        }
        _caretDown = Builder(name = "CaretDown", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.247f, 11.14f)
                lineTo(2.451f, 5.658f)
                curveTo(1.885f, 5.013f, 2.345f, 4.0f, 3.204f, 4.0f)
                horizontalLineToRelative(9.592f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.753f, 1.659f)
                lineToRelative(-4.796f, 5.48f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.506f, 0.0f)
                close()
            }
        }
        .build()
        return _caretDown!!
    }

private var _caretDown: ImageVector? = null

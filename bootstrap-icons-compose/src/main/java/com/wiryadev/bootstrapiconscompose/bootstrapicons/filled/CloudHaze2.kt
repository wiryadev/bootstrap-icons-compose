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

public val FilledGroup.CloudHaze2: ImageVector
    get() {
        if (_cloudHaze2 != null) {
            return _cloudHaze2!!
        }
        _cloudHaze2 = Builder(name = "CloudHaze2", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 2.0f)
                arcToRelative(5.001f, 5.001f, 0.0f, false, true, 4.905f, 4.027f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 13.0f, 12.0f)
                lineTo(3.5f, 12.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 0.035f, 9.0f)
                lineTo(5.5f, 9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                lineTo(0.035f, 8.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.871f, -2.977f)
                arcTo(5.001f, 5.001f, 0.0f, false, true, 8.5f, 2.0f)
                close()
                moveTo(2.5f, 10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(0.0f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
            }
        }
        .build()
        return _cloudHaze2!!
    }

private var _cloudHaze2: ImageVector? = null

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

public val FilledGroup.SuitDiamond: ImageVector
    get() {
        if (_suitDiamond != null) {
            return _suitDiamond!!
        }
        _suitDiamond = Builder(name = "SuitDiamond", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.45f, 7.4f)
                lineTo(7.2f, 1.067f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.6f, 0.0f)
                lineTo(13.55f, 7.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.2f)
                lineTo(8.8f, 14.933f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.6f, 0.0f)
                lineTo(2.45f, 8.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.2f)
                close()
            }
        }
        .build()
        return _suitDiamond!!
    }

private var _suitDiamond: ImageVector? = null

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

public val FilledGroup.EnvelopeOpen: ImageVector
    get() {
        if (_envelopeOpen != null) {
            return _envelopeOpen!!
        }
        _envelopeOpen = Builder(name = "EnvelopeOpen", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.941f, 0.435f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.882f, 0.0f)
                lineToRelative(-6.0f, 3.2f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 0.0f, 5.4f)
                verticalLineToRelative(0.313f)
                lineToRelative(6.709f, 3.933f)
                lineTo(8.0f, 8.928f)
                lineToRelative(1.291f, 0.717f)
                lineTo(16.0f, 5.715f)
                lineTo(16.0f, 5.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.059f, -1.765f)
                lineToRelative(-6.0f, -3.2f)
                close()
                moveTo(16.0f, 6.873f)
                lineToRelative(-5.693f, 3.337f)
                lineTo(16.0f, 13.372f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(15.941f, 14.484f)
                lineTo(8.0f, 10.072f)
                lineTo(0.059f, 14.484f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 16.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.941f, -1.516f)
                close()
                moveTo(0.0f, 13.373f)
                lineToRelative(5.693f, -3.163f)
                lineTo(0.0f, 6.873f)
                verticalLineToRelative(6.5f)
                close()
            }
        }
        .build()
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null

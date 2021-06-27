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

public val NormalGroup.EnvelopeOpen: ImageVector
    get() {
        if (_envelopeOpen != null) {
            return _envelopeOpen!!
        }
        _envelopeOpen = Builder(name = "EnvelopeOpen", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.47f, 1.318f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.94f, 0.0f)
                lineToRelative(-6.0f, 3.2f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.0f, 5.4f)
                verticalLineToRelative(0.818f)
                lineToRelative(5.724f, 3.465f)
                lineTo(8.0f, 8.917f)
                lineToRelative(1.276f, 0.766f)
                lineTo(15.0f, 6.218f)
                lineTo(15.0f, 5.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.53f, -0.882f)
                lineToRelative(-6.0f, -3.2f)
                close()
                moveTo(15.0f, 7.388f)
                lineToRelative(-4.754f, 2.877f)
                lineTo(15.0f, 13.117f)
                verticalLineToRelative(-5.73f)
                close()
                moveTo(14.965f, 14.262f)
                lineTo(8.0f, 10.083f)
                lineToRelative(-6.965f, 4.18f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 15.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.965f, -0.738f)
                close()
                moveTo(1.0f, 13.117f)
                lineToRelative(4.754f, -2.852f)
                lineTo(1.0f, 7.387f)
                verticalLineToRelative(5.73f)
                close()
                moveTo(7.059f, 0.435f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.882f, 0.0f)
                lineToRelative(6.0f, 3.2f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 5.4f)
                lineTo(16.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(2.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(0.0f, 5.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.059f, -1.765f)
                lineToRelative(6.0f, -3.2f)
                close()
            }
        }
        .build()
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null

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

public val NormalGroup.Globe: ImageVector
    get() {
        if (_globe != null) {
            return _globe!!
        }
        _globe = Builder(name = "Globe", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
                moveTo(7.5f, 1.077f)
                curveToRelative(-0.67f, 0.204f, -1.335f, 0.82f, -1.887f, 1.855f)
                arcTo(7.97f, 7.97f, 0.0f, false, false, 5.145f, 4.0f)
                lineTo(7.5f, 4.0f)
                lineTo(7.5f, 1.077f)
                close()
                moveTo(4.09f, 4.0f)
                arcToRelative(9.267f, 9.267f, 0.0f, false, true, 0.64f, -1.539f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, true, 0.597f, -0.933f)
                arcTo(7.025f, 7.025f, 0.0f, false, false, 2.255f, 4.0f)
                lineTo(4.09f, 4.0f)
                close()
                moveTo(3.508f, 7.5f)
                curveToRelative(0.03f, -0.877f, 0.138f, -1.718f, 0.312f, -2.5f)
                lineTo(1.674f, 5.0f)
                arcToRelative(6.958f, 6.958f, 0.0f, false, false, -0.656f, 2.5f)
                horizontalLineToRelative(2.49f)
                close()
                moveTo(4.847f, 5.0f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, false, -0.338f, 2.5f)
                lineTo(7.5f, 7.5f)
                lineTo(7.5f, 5.0f)
                lineTo(4.847f, 5.0f)
                close()
                moveTo(8.5f, 5.0f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(2.99f)
                arcToRelative(12.495f, 12.495f, 0.0f, false, false, -0.337f, -2.5f)
                lineTo(8.5f, 5.0f)
                close()
                moveTo(4.51f, 8.5f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, false, 0.337f, 2.5f)
                lineTo(7.5f, 11.0f)
                lineTo(7.5f, 8.5f)
                lineTo(4.51f, 8.5f)
                close()
                moveTo(8.5f, 8.5f)
                lineTo(8.5f, 11.0f)
                horizontalLineToRelative(2.653f)
                curveToRelative(0.187f, -0.765f, 0.306f, -1.608f, 0.338f, -2.5f)
                lineTo(8.5f, 8.5f)
                close()
                moveTo(5.145f, 12.0f)
                curveToRelative(0.138f, 0.386f, 0.295f, 0.744f, 0.468f, 1.068f)
                curveToRelative(0.552f, 1.035f, 1.218f, 1.65f, 1.887f, 1.855f)
                lineTo(7.5f, 12.0f)
                lineTo(5.145f, 12.0f)
                close()
                moveTo(5.327f, 14.472f)
                arcToRelative(6.696f, 6.696f, 0.0f, false, true, -0.597f, -0.933f)
                arcTo(9.268f, 9.268f, 0.0f, false, true, 4.09f, 12.0f)
                lineTo(2.255f, 12.0f)
                arcToRelative(7.024f, 7.024f, 0.0f, false, false, 3.072f, 2.472f)
                close()
                moveTo(3.82f, 11.0f)
                arcToRelative(13.652f, 13.652f, 0.0f, false, true, -0.312f, -2.5f)
                horizontalLineToRelative(-2.49f)
                curveToRelative(0.062f, 0.89f, 0.291f, 1.733f, 0.656f, 2.5f)
                lineTo(3.82f, 11.0f)
                close()
                moveTo(10.673f, 14.472f)
                arcTo(7.024f, 7.024f, 0.0f, false, false, 13.745f, 12.0f)
                lineTo(11.91f, 12.0f)
                arcToRelative(9.27f, 9.27f, 0.0f, false, true, -0.64f, 1.539f)
                arcToRelative(6.688f, 6.688f, 0.0f, false, true, -0.597f, 0.933f)
                close()
                moveTo(8.5f, 12.0f)
                verticalLineToRelative(2.923f)
                curveToRelative(0.67f, -0.204f, 1.335f, -0.82f, 1.887f, -1.855f)
                curveToRelative(0.173f, -0.324f, 0.33f, -0.682f, 0.468f, -1.068f)
                lineTo(8.5f, 12.0f)
                close()
                moveTo(12.18f, 11.0f)
                horizontalLineToRelative(2.146f)
                curveToRelative(0.365f, -0.767f, 0.594f, -1.61f, 0.656f, -2.5f)
                horizontalLineToRelative(-2.49f)
                arcToRelative(13.65f, 13.65f, 0.0f, false, true, -0.312f, 2.5f)
                close()
                moveTo(14.982f, 7.5f)
                arcToRelative(6.959f, 6.959f, 0.0f, false, false, -0.656f, -2.5f)
                lineTo(12.18f, 5.0f)
                curveToRelative(0.174f, 0.782f, 0.282f, 1.623f, 0.312f, 2.5f)
                horizontalLineToRelative(2.49f)
                close()
                moveTo(11.27f, 2.461f)
                curveToRelative(0.247f, 0.464f, 0.462f, 0.98f, 0.64f, 1.539f)
                horizontalLineToRelative(1.835f)
                arcToRelative(7.024f, 7.024f, 0.0f, false, false, -3.072f, -2.472f)
                curveToRelative(0.218f, 0.284f, 0.418f, 0.598f, 0.597f, 0.933f)
                close()
                moveTo(10.855f, 4.0f)
                arcToRelative(7.966f, 7.966f, 0.0f, false, false, -0.468f, -1.068f)
                curveTo(9.835f, 1.897f, 9.17f, 1.282f, 8.5f, 1.077f)
                lineTo(8.5f, 4.0f)
                horizontalLineToRelative(2.355f)
                close()
            }
        }
        .build()
        return _globe!!
    }

private var _globe: ImageVector? = null

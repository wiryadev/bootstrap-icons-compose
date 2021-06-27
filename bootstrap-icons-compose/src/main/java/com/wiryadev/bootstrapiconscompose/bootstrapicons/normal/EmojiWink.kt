package icons.bootstrapicons.normal

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.bootstrapicons.NormalGroup

public val NormalGroup.EmojiWink: ImageVector
    get() {
        if (_emojiWink != null) {
            return _emojiWink!!
        }
        _emojiWink = Builder(name = "EmojiWink", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 15.0f)
                arcTo(7.0f, 7.0f, 0.0f, true, true, 8.0f, 1.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 0.0f, 14.0f)
                close()
                moveTo(8.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.285f, 9.567f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.683f, 0.183f)
                arcTo(3.498f, 3.498f, 0.0f, false, false, 8.0f, 11.5f)
                arcToRelative(3.498f, 3.498f, 0.0f, false, false, 3.032f, -1.75f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.866f, 0.5f)
                arcTo(4.498f, 4.498f, 0.0f, false, true, 8.0f, 12.5f)
                arcToRelative(4.498f, 4.498f, 0.0f, false, true, -3.898f, -2.25f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.183f, -0.683f)
                close()
                moveTo(7.0f, 6.5f)
                curveTo(7.0f, 7.328f, 6.552f, 8.0f, 6.0f, 8.0f)
                reflectiveCurveToRelative(-1.0f, -0.672f, -1.0f, -1.5f)
                reflectiveCurveTo(5.448f, 5.0f, 6.0f, 5.0f)
                reflectiveCurveToRelative(1.0f, 0.672f, 1.0f, 1.5f)
                close()
                moveTo(8.757f, 6.063f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.68f, 0.194f)
                arcToRelative(0.934f, 0.934f, 0.0f, false, false, 0.813f, 0.493f)
                curveToRelative(0.339f, 0.0f, 0.645f, -0.19f, 0.813f, -0.493f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.874f, 0.486f)
                arcTo(1.934f, 1.934f, 0.0f, false, true, 10.25f, 7.75f)
                curveToRelative(-0.73f, 0.0f, -1.356f, -0.412f, -1.687f, -1.007f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.194f, -0.68f)
                close()
            }
        }
        .build()
        return _emojiWink!!
    }

private var _emojiWink: ImageVector? = null

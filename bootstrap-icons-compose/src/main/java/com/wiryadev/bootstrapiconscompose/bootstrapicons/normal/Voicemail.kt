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

public val NormalGroup.Voicemail: ImageVector
    get() {
        if (_voicemail != null) {
            return _voicemail!!
        }
        _voicemail = Builder(name = "Voicemail", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 8.5f)
                arcTo(3.49f, 3.49f, 0.0f, false, true, 5.95f, 11.0f)
                horizontalLineToRelative(4.1f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 2.45f, 1.0f)
                horizontalLineToRelative(-9.0f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 7.0f, 8.5f)
                close()
                moveTo(1.0f, 8.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -5.0f, 0.0f)
                close()
                moveTo(15.0f, 8.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                close()
            }
        }
        .build()
        return _voicemail!!
    }

private var _voicemail: ImageVector? = null

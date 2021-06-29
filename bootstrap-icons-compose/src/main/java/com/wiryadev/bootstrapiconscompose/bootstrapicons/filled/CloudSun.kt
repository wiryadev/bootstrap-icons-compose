package icons.bootstrapicons.filled

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
import com.wiryadev.bootstrapiconscompose.bootstrapicons.FilledGroup

public val FilledGroup.CloudSun: ImageVector
    get() {
        if (_cloudSun != null) {
            return _cloudSun!!
        }
        _cloudSun = Builder(name = "CloudSun", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.473f, 11.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -8.72f, -0.99f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.0f, 16.0f)
                horizontalLineToRelative(8.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                horizontalLineToRelative(-0.027f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(14.243f, 3.464f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.707f, -0.707f)
                lineToRelative(-0.708f, 0.707f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, 0.708f)
                lineToRelative(0.707f, -0.708f)
                close()
                moveTo(6.464f, 2.757f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.707f, 0.707f)
                lineToRelative(0.707f, 0.708f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.708f, -0.708f)
                lineToRelative(-0.708f, -0.707f)
                close()
                moveTo(8.198f, 6.131f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 3.296f, 2.198f)
                curveToRelative(0.199f, 0.281f, 0.372f, 0.582f, 0.516f, 0.898f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -4.84f, -3.225f)
                curveToRelative(0.352f, 0.011f, 0.696f, 0.055f, 1.028f, 0.129f)
                close()
                moveTo(12.682f, 10.205f)
                curveToRelative(0.6f, 0.215f, 1.125f, 0.59f, 1.522f, 1.072f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.039f, -0.742f)
                lineToRelative(-0.707f, -0.707f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.854f, 0.377f)
                close()
                moveTo(14.5f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _cloudSun!!
    }

private var _cloudSun: ImageVector? = null

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

public val FilledGroup.Wallet: ImageVector
    get() {
        if (_wallet != null) {
            return _wallet!!
        }
        _wallet = Builder(name = "Wallet", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                curveToRelative(0.0f, 0.253f, 0.08f, 0.644f, 0.306f, 0.958f)
                curveToRelative(0.207f, 0.288f, 0.557f, 0.542f, 1.194f, 0.542f)
                curveToRelative(0.637f, 0.0f, 0.987f, -0.254f, 1.194f, -0.542f)
                curveToRelative(0.226f, -0.314f, 0.306f, -0.705f, 0.306f, -0.958f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 2.0f)
                horizontalLineToRelative(-13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 6.5f)
                horizontalLineToRelative(-5.551f)
                arcToRelative(2.678f, 2.678f, 0.0f, false, true, -0.443f, 1.042f)
                curveTo(9.613f, 8.088f, 8.963f, 8.5f, 8.0f, 8.5f)
                curveToRelative(-0.963f, 0.0f, -1.613f, -0.412f, -2.006f, -0.958f)
                arcTo(2.679f, 2.679f, 0.0f, false, true, 5.551f, 6.5f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.5f, 14.0f)
                horizontalLineToRelative(13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _wallet!!
    }

private var _wallet: ImageVector? = null

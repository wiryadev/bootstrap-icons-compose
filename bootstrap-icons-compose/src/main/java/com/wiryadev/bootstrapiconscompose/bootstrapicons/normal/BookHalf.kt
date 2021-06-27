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

public val NormalGroup.BookHalf: ImageVector
    get() {
        if (_bookHalf != null) {
            return _bookHalf!!
        }
        _bookHalf = Builder(name = "BookHalf", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 2.687f)
                curveToRelative(0.654f, -0.689f, 1.782f, -0.886f, 3.112f, -0.752f)
                curveToRelative(1.234f, 0.124f, 2.503f, 0.523f, 3.388f, 0.893f)
                verticalLineToRelative(9.923f)
                curveToRelative(-0.918f, -0.35f, -2.107f, -0.692f, -3.287f, -0.81f)
                curveToRelative(-1.094f, -0.111f, -2.278f, -0.039f, -3.213f, 0.492f)
                verticalLineTo(2.687f)
                close()
                moveTo(8.0f, 1.783f)
                curveTo(7.015f, 0.936f, 5.587f, 0.81f, 4.287f, 0.94f)
                curveToRelative(-1.514f, 0.153f, -3.042f, 0.672f, -3.994f, 1.105f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 0.0f, 2.5f)
                verticalLineToRelative(11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, 0.455f)
                curveToRelative(0.882f, -0.4f, 2.303f, -0.881f, 3.68f, -1.02f)
                curveToRelative(1.409f, -0.142f, 2.59f, 0.087f, 3.223f, 0.877f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.78f, 0.0f)
                curveToRelative(0.633f, -0.79f, 1.814f, -1.019f, 3.222f, -0.877f)
                curveToRelative(1.378f, 0.139f, 2.8f, 0.62f, 3.681f, 1.02f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 16.0f, 13.5f)
                verticalLineToRelative(-11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.293f, -0.455f)
                curveToRelative(-0.952f, -0.433f, -2.48f, -0.952f, -3.994f, -1.105f)
                curveTo(10.413f, 0.809f, 8.985f, 0.936f, 8.0f, 1.783f)
                close()
            }
        }
        .build()
        return _bookHalf!!
    }

private var _bookHalf: ImageVector? = null

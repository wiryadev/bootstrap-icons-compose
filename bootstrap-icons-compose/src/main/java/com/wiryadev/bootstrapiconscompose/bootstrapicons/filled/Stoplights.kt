package icons.bootstrapicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.bootstrapicons.FilledGroup

public val FilledGroup.Stoplights: ImageVector
    get() {
        if (_stoplights != null) {
            return _stoplights!!
        }
        _stoplights = Builder(name = "Stoplights", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(2.0f, 2.0f)
                curveToRelative(0.167f, 0.5f, 0.8f, 1.6f, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 6.0f)
                curveToRelative(0.167f, 0.5f, 0.8f, 1.6f, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 10.0f)
                curveToRelative(0.167f, 0.5f, 0.8f, 1.6f, 2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(1.2f, -0.4f, 1.833f, -1.5f, 2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(12.0f, 8.0f)
                curveToRelative(1.2f, -0.4f, 1.833f, -1.5f, 2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(12.0f, 4.0f)
                curveToRelative(1.2f, -0.4f, 1.833f, -1.5f, 2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(6.0f, 0.0f)
                close()
                moveTo(9.5f, 3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                close()
                moveTo(9.5f, 7.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                close()
                moveTo(8.0f, 13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
            }
        }
        .build()
        return _stoplights!!
    }

private var _stoplights: ImageVector? = null
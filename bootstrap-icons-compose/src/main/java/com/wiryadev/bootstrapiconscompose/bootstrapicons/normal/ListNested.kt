package icons.bootstrapicons.normal

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.bootstrapicons.NormalGroup

public val NormalGroup.ListNested: ImageVector
    get() {
        if (_listNested != null) {
            return _listNested!!
        }
        _listNested = Builder(name = "ListNested", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.5f, 11.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 5.0f, 11.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(5.0f, 12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
                moveTo(2.5f, 7.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.0f, 7.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(3.0f, 8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
                moveTo(0.5f, 3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 1.0f, 3.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(1.0f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
            }
        }
        .build()
        return _listNested!!
    }

private var _listNested: ImageVector? = null

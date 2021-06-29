package icons.bootstrapicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val FilledGroup.House: ImageVector
    get() {
        if (_house != null) {
            return _house!!
        }
        _house = Builder(name = "House", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(8.0f, 3.293f)
                lineToRelative(6.0f, 6.0f)
                lineTo(14.0f, 13.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.0f, 13.5f)
                lineTo(2.0f, 9.293f)
                lineToRelative(6.0f, -6.0f)
                close()
                moveTo(13.0f, 2.5f)
                lineTo(13.0f, 6.0f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(11.0f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.293f, 1.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                lineToRelative(6.647f, 6.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, 0.708f)
                lineTo(8.0f, 2.207f)
                lineTo(1.354f, 8.854f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.708f, -0.708f)
                lineTo(7.293f, 1.5f)
                close()
            }
        }
        .build()
        return _house!!
    }

private var _house: ImageVector? = null

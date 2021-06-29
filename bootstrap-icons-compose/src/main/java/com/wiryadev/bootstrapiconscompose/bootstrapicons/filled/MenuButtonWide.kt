package icons.bootstrapicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wiryadev.bootstrapiconscompose.bootstrapicons.FilledGroup

public val FilledGroup.MenuButtonWide: ImageVector
    get() {
        if (_menuButtonWide != null) {
            return _menuButtonWide!!
        }
        _menuButtonWide = Builder(name = "MenuButtonWide", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.0f, 1.5f)
                verticalLineToRelative(2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.5f, 5.0f)
                horizontalLineToRelative(13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.0f, 3.5f)
                verticalLineToRelative(-2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 0.0f)
                horizontalLineToRelative(-13.0f)
                close()
                moveTo(2.5f, 2.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                close()
                moveTo(12.427f, 2.427f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 12.604f, 2.0f)
                horizontalLineToRelative(0.792f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.177f, 0.427f)
                lineToRelative(-0.396f, 0.396f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.354f, 0.0f)
                lineToRelative(-0.396f, -0.396f)
                close()
                moveTo(0.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(2.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(0.0f, 8.0f)
                close()
                moveTo(1.0f, 11.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                lineTo(1.0f, 11.0f)
                close()
                moveTo(15.0f, 10.0f)
                lineTo(15.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(2.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(14.0f)
                close()
                moveTo(2.0f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
                moveTo(2.0f, 12.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
            }
        }
        .build()
        return _menuButtonWide!!
    }

private var _menuButtonWide: ImageVector? = null

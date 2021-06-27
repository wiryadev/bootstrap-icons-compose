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
import icons.bootstrapicons.FilledGroup

public val FilledGroup.FileEarmarkPpt: ImageVector
    get() {
        if (_fileEarmarkPpt != null) {
            return _fileEarmarkPpt!!
        }
        _fileEarmarkPpt = Builder(name = "FileEarmarkPpt", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.188f, 10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.5f)
                horizontalLineToRelative(1.188f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 0.0f, 3.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 0.0f)
                horizontalLineToRelative(5.293f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 0.293f)
                lineTo(13.707f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.293f, 0.707f)
                lineTo(14.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(4.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                close()
                moveTo(9.5f, 1.5f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-3.0f, -3.0f)
                close()
                moveTo(7.0f, 5.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                lineTo(6.0f, 13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.188f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 0.0f, -5.5f)
                lineTo(7.0f, 5.5f)
                close()
            }
        }
        .build()
        return _fileEarmarkPpt!!
    }

private var _fileEarmarkPpt: ImageVector? = null

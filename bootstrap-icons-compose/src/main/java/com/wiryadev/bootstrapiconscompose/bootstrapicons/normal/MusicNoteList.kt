package icons.bootstrapicons.normal

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val NormalGroup.MusicNoteList: ImageVector
    get() {
        if (_musicNoteList != null) {
            return _musicNoteList!!
        }
        _musicNoteList = Builder(name = "MusicNoteList", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                curveToRelative(0.0f, 1.105f, -1.12f, 2.0f, -2.5f, 2.0f)
                reflectiveCurveTo(7.0f, 14.105f, 7.0f, 13.0f)
                reflectiveCurveToRelative(1.12f, -2.0f, 2.5f, -2.0f)
                reflectiveCurveToRelative(2.5f, 0.895f, 2.5f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 3.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.82f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.804f, -0.98f)
                lineToRelative(3.0f, -0.6f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 2.22f)
                verticalLineTo(4.0f)
                lineToRelative(-5.0f, 1.0f)
                verticalLineTo(2.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(0.0f, 11.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                lineTo(4.0f, 11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(0.5f, 12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
                moveTo(0.0f, 7.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 0.5f, 7.0f)
                lineTo(8.0f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(0.5f, 8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
                moveTo(0.0f, 3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 0.5f, 3.0f)
                lineTo(8.0f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(0.5f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
            }
        }
        .build()
        return _musicNoteList!!
    }

private var _musicNoteList: ImageVector? = null

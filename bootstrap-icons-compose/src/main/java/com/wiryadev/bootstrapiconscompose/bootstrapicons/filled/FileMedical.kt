package com.wiryadev.bootstrapiconscompose.bootstrapicons.filled

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

public val FilledGroup.FileMedical: ImageVector
    get() {
        if (_fileMedical != null) {
            return _fileMedical!!
        }
        _fileMedical = Builder(name = "FileMedical", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(14.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(8.5f, 4.5f)
                verticalLineToRelative(0.634f)
                lineToRelative(0.549f, -0.317f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.5f, 0.866f)
                lineTo(9.0f, 6.0f)
                lineToRelative(0.549f, 0.317f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.5f, 0.866f)
                lineTo(8.5f, 6.866f)
                lineTo(8.5f, 7.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-0.634f)
                lineToRelative(-0.549f, 0.317f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.5f, -0.866f)
                lineTo(7.0f, 6.0f)
                lineToRelative(-0.549f, -0.317f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.866f)
                lineToRelative(0.549f, 0.317f)
                lineTo(7.5f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                close()
                moveTo(5.5f, 9.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                close()
                moveTo(5.5f, 11.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                close()
            }
        }
        .build()
        return _fileMedical!!
    }

private var _fileMedical: ImageVector? = null

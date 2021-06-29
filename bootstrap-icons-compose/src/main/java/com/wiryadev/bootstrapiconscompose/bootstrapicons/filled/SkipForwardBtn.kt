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

public val FilledGroup.SkipForwardBtn: ImageVector
    get() {
        if (_skipForwardBtn != null) {
            return _skipForwardBtn!!
        }
        _skipForwardBtn = Builder(name = "SkipForwardBtn", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 10.0f)
                lineTo(0.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(2.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(4.79f, 3.093f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 4.0f, 3.5f)
                verticalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.79f, 0.407f)
                lineTo(7.5f, 6.972f)
                lineTo(7.5f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.79f, 0.407f)
                lineTo(11.0f, 6.972f)
                lineTo(11.0f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(1.528f)
                lineTo(8.29f, 3.093f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.79f, 0.407f)
                verticalLineToRelative(1.528f)
                lineTo(4.79f, 3.093f)
                close()
            }
        }
        .build()
        return _skipForwardBtn!!
    }

private var _skipForwardBtn: ImageVector? = null

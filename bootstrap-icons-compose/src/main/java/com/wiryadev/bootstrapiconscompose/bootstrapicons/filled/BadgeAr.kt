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

public val BadgeAr: ImageVector
    get() {
        if (_badgeAr != null) {
            return _badgeAr!!
        }
        _badgeAr = Builder(name = "BadgeAr", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.031f, 8.574f)
                lineToRelative(-0.734f, -2.426f)
                horizontalLineToRelative(-0.052f)
                lineTo(4.51f, 8.574f)
                horizontalLineToRelative(1.52f)
                close()
                moveTo(9.673f, 5.933f)
                verticalLineToRelative(1.938f)
                horizontalLineToRelative(1.033f)
                curveToRelative(0.66f, 0.0f, 1.068f, -0.316f, 1.068f, -0.95f)
                curveToRelative(0.0f, -0.64f, -0.422f, -0.988f, -1.05f, -0.988f)
                horizontalLineToRelative(-1.05f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(2.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(0.0f, 4.0f)
                close()
                moveTo(4.265f, 9.458f)
                horizontalLineToRelative(2.004f)
                lineTo(6.739f, 11.0f)
                lineTo(8.0f, 11.0f)
                lineTo(5.996f, 5.001f)
                lineTo(4.607f, 5.001f)
                lineTo(2.595f, 11.0f)
                horizontalLineToRelative(1.2f)
                lineToRelative(0.47f, -1.542f)
                close()
                moveTo(8.5f, 5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.173f)
                lineTo(9.673f, 8.763f)
                horizontalLineToRelative(1.064f)
                lineTo(11.787f, 11.0f)
                horizontalLineToRelative(1.327f)
                lineTo(11.91f, 8.583f)
                curveTo(12.455f, 8.373f, 13.0f, 7.779f, 13.0f, 6.9f)
                curveToRelative(0.0f, -1.147f, -0.773f, -1.9f, -2.105f, -1.9f)
                lineTo(8.5f, 5.0f)
                close()
            }
        }
        .build()
        return _badgeAr!!
    }

private var _badgeAr: ImageVector? = null

package com.wiryadev.bootstrapiconscompose.bootstrapicons.normal

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wiryadev.bootstrapiconscompose.bootstrapicons.NormalGroup

public val NormalGroup.LifePreserver: ImageVector
    get() {
        if (_lifePreserver != null) {
            return _lifePreserver!!
        }
        _lifePreserver = Builder(name = "LifePreserver", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(14.43f, 10.772f)
                arcToRelative(7.025f, 7.025f, 0.0f, false, true, -3.658f, 3.658f)
                lineToRelative(-1.115f, -2.788f)
                arcToRelative(4.015f, 4.015f, 0.0f, false, false, 1.985f, -1.985f)
                lineToRelative(2.788f, 1.115f)
                close()
                moveTo(5.228f, 14.43f)
                arcToRelative(7.025f, 7.025f, 0.0f, false, true, -3.658f, -3.658f)
                lineToRelative(2.788f, -1.115f)
                arcToRelative(4.015f, 4.015f, 0.0f, false, false, 1.985f, 1.985f)
                lineTo(5.228f, 14.43f)
                close()
                moveTo(14.43f, 5.228f)
                lineTo(11.642f, 6.343f)
                arcToRelative(4.015f, 4.015f, 0.0f, false, false, -1.985f, -1.985f)
                lineToRelative(1.115f, -2.788f)
                arcToRelative(7.025f, 7.025f, 0.0f, false, true, 3.658f, 3.658f)
                close()
                moveTo(6.343f, 4.358f)
                arcToRelative(4.015f, 4.015f, 0.0f, false, false, -1.985f, 1.985f)
                lineTo(1.57f, 5.228f)
                arcTo(7.025f, 7.025f, 0.0f, false, true, 5.228f, 1.57f)
                lineToRelative(1.115f, 2.788f)
                close()
                moveTo(8.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 6.0f)
                close()
            }
        }
        .build()
        return _lifePreserver!!
    }

private var _lifePreserver: ImageVector? = null

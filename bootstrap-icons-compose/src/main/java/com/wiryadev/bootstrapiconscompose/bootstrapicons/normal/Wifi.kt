package com.wiryadev.bootstrapiconscompose.bootstrapicons.normal

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
import com.wiryadev.bootstrapiconscompose.bootstrapicons.NormalGroup

public val NormalGroup.Wifi: ImageVector
    get() {
        if (_wifi != null) {
            return _wifi!!
        }
        _wifi = Builder(name = "Wifi", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.384f, 6.115f)
                arcToRelative(0.485f, 0.485f, 0.0f, false, false, -0.047f, -0.736f)
                arcTo(12.444f, 12.444f, 0.0f, false, false, 8.0f, 3.0f)
                curveTo(5.259f, 3.0f, 2.723f, 3.882f, 0.663f, 5.379f)
                arcToRelative(0.485f, 0.485f, 0.0f, false, false, -0.048f, 0.736f)
                arcToRelative(0.518f, 0.518f, 0.0f, false, false, 0.668f, 0.05f)
                arcTo(11.448f, 11.448f, 0.0f, false, true, 8.0f, 4.0f)
                curveToRelative(2.507f, 0.0f, 4.827f, 0.802f, 6.716f, 2.164f)
                curveToRelative(0.205f, 0.148f, 0.49f, 0.13f, 0.668f, -0.049f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.229f, 8.271f)
                arcToRelative(0.482f, 0.482f, 0.0f, false, false, -0.063f, -0.745f)
                arcTo(9.455f, 9.455f, 0.0f, false, false, 8.0f, 6.0f)
                curveToRelative(-1.905f, 0.0f, -3.68f, 0.56f, -5.166f, 1.526f)
                arcToRelative(0.48f, 0.48f, 0.0f, false, false, -0.063f, 0.745f)
                arcToRelative(0.525f, 0.525f, 0.0f, false, false, 0.652f, 0.065f)
                arcTo(8.46f, 8.46f, 0.0f, false, true, 8.0f, 7.0f)
                arcToRelative(8.46f, 8.46f, 0.0f, false, true, 4.576f, 1.336f)
                curveToRelative(0.206f, 0.132f, 0.48f, 0.108f, 0.653f, -0.065f)
                close()
                moveTo(11.046f, 10.454f)
                curveToRelative(0.226f, -0.226f, 0.185f, -0.605f, -0.1f, -0.75f)
                arcTo(6.473f, 6.473f, 0.0f, false, false, 8.0f, 9.0f)
                curveToRelative(-1.06f, 0.0f, -2.062f, 0.254f, -2.946f, 0.704f)
                curveToRelative(-0.285f, 0.145f, -0.326f, 0.524f, -0.1f, 0.75f)
                lineToRelative(0.015f, 0.015f)
                curveToRelative(0.16f, 0.16f, 0.407f, 0.19f, 0.611f, 0.09f)
                arcTo(5.478f, 5.478f, 0.0f, false, true, 8.0f, 10.0f)
                curveToRelative(0.868f, 0.0f, 1.69f, 0.201f, 2.42f, 0.56f)
                curveToRelative(0.203f, 0.1f, 0.45f, 0.07f, 0.61f, -0.091f)
                lineToRelative(0.016f, -0.015f)
                close()
                moveTo(9.06f, 12.44f)
                curveToRelative(0.196f, -0.196f, 0.198f, -0.52f, -0.04f, -0.66f)
                arcTo(1.99f, 1.99f, 0.0f, false, false, 8.0f, 11.5f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, false, -1.02f, 0.28f)
                curveToRelative(-0.238f, 0.14f, -0.236f, 0.464f, -0.04f, 0.66f)
                lineToRelative(0.706f, 0.706f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, 0.0f)
                lineToRelative(0.707f, -0.707f)
                close()
            }
        }
        .build()
        return _wifi!!
    }

private var _wifi: ImageVector? = null

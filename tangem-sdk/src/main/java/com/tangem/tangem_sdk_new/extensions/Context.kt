package com.tangem.tangem_sdk_new.extensions

import android.content.Context

/**
 * Created by Anton Zhilenkov on 03/08/2020.
 */
fun Context.dpToPx(dp: Float): Float = dp * resources.displayMetrics.density
fun Context.pxToDp(px: Float): Float = Math.round(px / resources.displayMetrics.density).toFloat()
package com.tangem.tangem_sdk_new.extensions

import com.tangem.tangem_sdk_new.ui.NfcLocation

/**
 * Created by Anton Zhilenkov on 13/10/2020.
 */
fun NfcLocation.getX(): Float = this.x / 100f
fun NfcLocation.getY(): Float = this.y / 100f
fun NfcLocation.isHorizontal(): Boolean = orientation == 0
fun NfcLocation.isOnTheBack(): Boolean = z == 0
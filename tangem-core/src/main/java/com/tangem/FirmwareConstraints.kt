package com.tangem

import com.tangem.commands.common.card.FirmwareVersion

/**
 * Created by Anton Zhilenkov on 23/11/2020.
 */
class FirmwareConstraints {
    object AvailabilityVersions {
        val walletData = FirmwareVersion(4, 0)
        val pin2IsDefault = FirmwareVersion(4, 0)
        val files = FirmwareVersion(3, 29)
    }

    object DeprecationVersions {
        val walletRemainingSignatures = FirmwareVersion(4, 0)
    }
}
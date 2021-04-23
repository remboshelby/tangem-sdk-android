package com.tangem.common

/**
 * Created by Anton Zhilenkov on 01/04/2021.
 */
class TangemSdkConstants {
    companion object {
        /**
         * This index used by `CardDeserializer` for cards with COS lower than 4.0 when creating `CardWallet` entity.
         */
        val oldCardDefaultWalletIndex = 0
    }
}
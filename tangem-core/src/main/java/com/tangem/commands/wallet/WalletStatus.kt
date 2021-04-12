package com.tangem.commands.wallet

import com.tangem.commands.common.card.CardStatus

/**
 * Created by Anton Zhilenkov on 26/03/2021.
 */
enum class WalletStatus(val code: Int) {
    Empty(1),
    Loaded(2),
    Purged(3);

    companion object {
        private val values = WalletStatus.values()

        fun byValue(value: Int): WalletStatus? {
            return values.find { it.code == value }
        }

        fun from(cardStatus: CardStatus): WalletStatus = when (cardStatus) {
            CardStatus.NotPersonalized, CardStatus.Empty -> Empty
            CardStatus.Loaded -> Loaded
            CardStatus.Purged -> Purged
        }
    }
}
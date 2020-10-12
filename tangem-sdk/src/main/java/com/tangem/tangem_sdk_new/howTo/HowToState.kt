package com.tangem.tangem_sdk_new.howTo

/**
 * Created by Anton Zhilenkov on 11/10/2020.
 */
sealed class HowToState {
    sealed class Known : HowToState() {
        object Prepare : Known()
        object ShowNfcPosition : Known()
        object TapToKnownPosition : Known()
    }

    sealed class Unknown : HowToState() {
        object FindAntenna : Unknown()
        object AntennaFound : Unknown()
        object Cancel : Unknown()
    }
}
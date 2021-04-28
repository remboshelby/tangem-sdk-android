package com.tangem.json

import com.tangem.TangemError

/**
 * Created by Anton Zhilenkov on 28/04/2021.
 */
sealed class JsonError(final override val code: Int) : Exception(), TangemError {
    override var customMessage: String = code.toString()
    override val messageResId: Int? = null

    class NoSuchParamsError(override var customMessage: String) : JsonError(123123)
    class ParamsCastError(override var customMessage: String) : JsonError(321321)
}
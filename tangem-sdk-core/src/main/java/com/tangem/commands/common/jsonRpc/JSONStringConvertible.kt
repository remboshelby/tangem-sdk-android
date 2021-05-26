package com.tangem.commands.common.jsonRpc

import com.tangem.commands.common.jsonConverter.MoshiJsonConverter

/**
 * Created by Anton Zhilenkov on 26/05/2021.
 */
interface JSONStringConvertible {
    fun toJson(): String = MoshiJsonConverter.INSTANCE.toJson(this)
}
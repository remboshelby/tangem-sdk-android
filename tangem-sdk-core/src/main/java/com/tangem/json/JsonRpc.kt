package com.tangem.json

import com.squareup.moshi.JsonClass

/**
 * Created by Anton Zhilenkov on 05/05/2021.
 */
abstract class JsonRpc(
    val id: String?,
    val jsonrpc: String = "2.0"
)

@JsonClass(generateAdapter = true)
class JsonRpcIn(
    val method: String,
    val parameters: MutableMap<String, Any?>,
    id: String? = null
) : JsonRpc(id)

@JsonClass(generateAdapter = true)
class JsonRpcOut(
    val result: Any? = null,
    val error: Any? = null,
    id: String? = null
) : JsonRpc(id)


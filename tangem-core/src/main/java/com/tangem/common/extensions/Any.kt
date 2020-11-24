package com.tangem.common.extensions

/**
 * Created by Anton Zhilenkov on 23/11/2020.
 */
inline fun<T> T?.guard(nullClause: () -> Nothing): T {
    return this ?: nullClause()
}
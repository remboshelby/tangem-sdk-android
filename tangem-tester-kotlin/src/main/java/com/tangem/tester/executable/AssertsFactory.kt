package com.tangem.tester.executable

import com.tangem.tester.executable.asserts.Assert
import com.tangem.tester.executable.asserts.EqualsAssert

/**
 * Created by Anton Zhilenkov on 23/04/2021.
 */
class AssertsFactory {

    private val asserts = mutableMapOf<String, Assert>()

    fun registerAssert(assert: Assert) {
        asserts[assert.getMethod()] = assert
    }

    fun getAssert(method: String): Assert? = asserts[method]

    companion object {
        fun default(): AssertsFactory = AssertsFactory().apply {
            registerAssert(EqualsAssert())
        }
    }
}
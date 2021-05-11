package com.tangem.tester.executable.asserts

import com.tangem.tester.common.OnComplete
import com.tangem.tester.common.TestResult
import java.util.*

/**
 * Created by Anton Zhilenkov on 11/05/2021.
 */
class AssertsLauncher(
    private val assertsQueue: Queue<Assert>
) {

    fun run(callback: OnComplete) {
        if (assertsQueue.isEmpty()) {
            callback(TestResult.Success())
            return
        }
        executeAssert(assertsQueue.poll(), callback)
    }

    private fun executeAssert(assert: Assert, callback: OnComplete) {
        assert.run { result ->
            when (result) {
                is TestResult.Success -> {
                    if (assertsQueue.isEmpty()) {
                        callback(TestResult.Success())
                    } else {
                        executeAssert(assertsQueue.poll(), callback)
                    }
                }
                is TestResult.Failure -> callback(result)
            }
        }
    }
}
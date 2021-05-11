package com.tangem.tester.common

/**
 * Created by Anton Zhilenkov on 19/04/2021.
 */
sealed class TestResult {
    class Success(val name: String? = null) : TestResult()
    class Failure(val error: TestFrameworkError) : TestResult()
}
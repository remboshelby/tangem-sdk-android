package com.tangem.tester.common

/**
 * Created by Anton Zhilenkov on 19/04/2021.
 */
sealed class TestResult {
    class Success : TestResult()
    class Failure(val error: TestFrameworkError) : TestResult()
}

sealed class StepResult : TestResult() {
    class Success(val name: String) : StepResult()
    class Failure(val error: TestFrameworkError) : StepResult()
}
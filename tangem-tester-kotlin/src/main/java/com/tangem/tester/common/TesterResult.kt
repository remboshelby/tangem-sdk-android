package com.tangem.tester.common

/**
 * Created by Anton Zhilenkov on 19/04/2021.
 */
sealed class TesterResult {
    class Success : TesterResult()
    class Failure(val error: TesterError) : TesterResult()
}

interface TesterError {
    val errorMessage: String
}
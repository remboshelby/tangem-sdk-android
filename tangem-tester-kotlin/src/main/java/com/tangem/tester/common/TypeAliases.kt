package com.tangem.tester.common

import com.tangem.CardSession

/**
 * Created by Anton Zhilenkov on 11/05/2021.
 */
typealias SourceMap = Map<String, Any?>
typealias OnComplete = (TestResult) -> Unit
typealias OnTestSequenceComplete = (TestFrameworkError?) -> Unit
typealias OnStepSequenceComplete = (CardSession, TestResult) -> Unit
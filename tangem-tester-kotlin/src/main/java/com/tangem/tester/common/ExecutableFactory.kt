package com.tangem.tester.common

import com.tangem.tester.executable.asserts.Assert
import com.tangem.tester.executable.steps.Step

/**
 * Created by Anton Zhilenkov on 23/04/2021.
 */
interface ExecutableFactory : StepHolder, AssertHolder

interface AssertHolder {
    fun getAssert(name: String): Assert?
}

interface StepHolder {
    fun getStep(name: String): Step<*>?
}
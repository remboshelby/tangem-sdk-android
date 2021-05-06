package com.tangem.tester.executable

import com.tangem.CardSession
import com.tangem.tester.common.StepResult
import com.tangem.tester.common.VariableHolder

/**
 * Created by Anton Zhilenkov on 18/04/2021.
 */
interface Executable : VariableHolder {
    fun getName(): String
    fun run(session: CardSession, callback: (StepResult) -> Unit)
}
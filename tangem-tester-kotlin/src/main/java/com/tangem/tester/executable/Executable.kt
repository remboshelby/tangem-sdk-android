package com.tangem.tester.executable

import com.tangem.tester.common.ExecutableError

/**
 * Created by Anton Zhilenkov on 18/04/2021.
 */
interface Executable {
    fun getName(): String
    fun fetchVariables(name: String): ExecutableError?
}
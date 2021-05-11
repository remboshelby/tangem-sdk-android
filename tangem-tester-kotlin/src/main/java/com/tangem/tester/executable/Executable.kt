package com.tangem.tester.executable

import com.tangem.tester.common.OnComplete

/**
 * Created by Anton Zhilenkov on 18/04/2021.
 */
interface Executable {
    fun getMethod(): String
    fun run(callback: OnComplete)
}
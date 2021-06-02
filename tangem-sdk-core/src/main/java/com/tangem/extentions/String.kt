package com.tangem.extentions

/**
 * Created by Anton Zhilenkov on 05/05/2021.
 */
fun String.toSnakeCase(): String = replace("(?<=.)(?=\\p{Upper})".toRegex(), "_")

fun String.toCamelCase(): String = split('_').joinToString("", transform = String::capitalize)
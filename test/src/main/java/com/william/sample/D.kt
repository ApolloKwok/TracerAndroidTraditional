package com.william.sample

import pers.apollokwok.tracer.common.annotations.Tracer
import pers.apollokwok.tracer.common.generated.DTracer
import pers.apollokwok.tracer.common.generated.`_MutableListâ€¹Intâ€º_D_list`

@Tracer.Root
class D : DTracer {
    override val _D: D get() = this


    init {
        `_MutableListâ€¹Intâ€º_D_list`
    }
    val list = mutableListOf(1)
//    val arrayList = arrayListOf(1)
//    val map = mutableMapOf<Int, Int>()
}
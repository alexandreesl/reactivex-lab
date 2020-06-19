package com.alexandreesl.examples.flowables

import io.reactivex.Flowable
import io.reactivex.schedulers.Schedulers

fun flowableSubscribeOnExample() {

    Flowable.fromIterable((1..5000000))
        .map { println("emitting $it")
            it }
        .subscribeOn(Schedulers.computation())
        .subscribe({
            Thread.sleep(5L)
            println(" receiving $it")
        })
    Thread.sleep(60000L)

}
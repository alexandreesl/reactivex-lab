package com.alexandreesl.examples.schedulers

import io.reactivex.Flowable
import io.reactivex.schedulers.Schedulers

fun schedulersExample() {

    Flowable.fromIterable((1..10))
        .map { println("emitting $it on ${Thread.currentThread().getName()}")
            it }
        .observeOn(Schedulers.io())
        .map { println("first receiving $it on ${Thread.currentThread().getName()}")
            it }
        .observeOn(Schedulers.single())
        .map { println("secondly receiving $it on ${Thread.currentThread().getName()}")
            it }
        .subscribeOn(Schedulers.computation())
        .subscribe {
            println("finally receiving $it on ${Thread.currentThread().getName()}")
        }
    Thread.sleep(300L)

}
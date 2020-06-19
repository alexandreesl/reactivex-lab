package com.alexandreesl.examples.operators

import io.reactivex.Observable

fun firstExample() {
    Observable.just("I",
        "Love",
        "Ana",
        "Carolina")
        .map(String::length)
        .subscribe(
            {println("length $it")},
            { println("error $it")},
            { println("stream ended!")}
        )
}
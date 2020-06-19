package com.alexandreesl.examples.operators

import io.reactivex.Observable

fun distinctSumExample() {

    val numbers = listOf(1,2,3,4,5,5,6,12,14,18,22,25,25)

    Observable.fromIterable(numbers)
        .distinct()
        .reduce(0) { total,next -> total + next }
        .subscribe(
            {println("$it")},
            {println("error $it")}
        )

}
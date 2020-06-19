package com.alexandreesl.examples.operators

import io.reactivex.Observable
import java.lang.RuntimeException

fun distinctSumWithDefaultExample() {

    val numbers = listOf(1,2,3,4,5,5,6,12,14,18,22,25,25)

    var counter = 0

    Observable.fromIterable(numbers)
        .distinct()
        .reduce(0) { total,next ->
            counter++
            if (counter == 5)  throw RuntimeException("BOOOM!!!!")
            total + next }
        .onErrorReturn { 0 }
        .subscribe(
            {println("$it")},
            {println("error $it")}
        )

}
package com.alexandreesl.examples.operators

import io.reactivex.Observable
import java.util.*

fun evenNumbersWithprintlnExample() {

    Observable.fromIterable((1..50).map { Random().nextInt() })
        .doOnNext { println("item: $it") }
        .filter { it % 2 == 0 }
        .subscribe(
            {println("$it")},
            { println("error $it")}
        )

}
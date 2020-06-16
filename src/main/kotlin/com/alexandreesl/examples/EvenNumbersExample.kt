package com.alexandreesl.examples

import io.reactivex.Observable
import java.util.*

fun evenNumbersExample() {

    Observable.fromIterable((1..50).map { Random().nextInt() })
        .filter { it % 2 == 0 }
        .subscribe(
            {println("$it")},
            { println("error $it")}
        )

}
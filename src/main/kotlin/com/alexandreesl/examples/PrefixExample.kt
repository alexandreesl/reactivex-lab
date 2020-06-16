package com.alexandreesl.examples

import io.reactivex.Single

fun prefixExample() {
    Single.just("Alexandre")
        .map { "I am $it" }
        .subscribe(
            {println("$it")},
            { println("error $it")}
        )


}
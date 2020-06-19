package com.alexandreesl.examples.operators

import io.reactivex.Observable

fun divisionWithResumeNextExample() {

    Observable.just(1,2,3,4,0,8,2)
        .map {item -> 10 / item}
        .onErrorResumeNext(Observable.just(10).repeat(3))
        .subscribe(
            {println("item  $it")},
            {println("error $it")}
        )
}



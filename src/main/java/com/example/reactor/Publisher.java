package com.example.reactor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class Publisher {

    public Flux<Integer> startFlux(){
        Flux.just(1,2,3,4,5); // 1,2,3,4,5 를 Pub
        Flux.range(1,10); // 1 ~ 10 까지 연속적인 숫자 Pub
        Flux.fromIterable(List.of("a","b","c","d","e")); // Iterable 값을 Pub 가능

        return Flux.range(1,10).log();
    }

    public Mono<Integer> startMono(){
        return Mono.just(11).log();
    }
}

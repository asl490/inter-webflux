package com.asl.model.api.gateways;

import com.asl.model.api.Api;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ApiRepository {

    Mono<Api> findById(String id);

    Mono<Api> save(Api api);

    Mono<Void> deleteById(String id);

    Mono<Api> update(Api api);

    Mono<Api> findByName(String name);

    Flux<Api> findAll();
}

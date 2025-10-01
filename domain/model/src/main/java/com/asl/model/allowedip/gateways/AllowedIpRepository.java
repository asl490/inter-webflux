package com.asl.model.allowedip.gateways;

import com.asl.model.allowedip.AllowedIp;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AllowedIpRepository {
    Mono<AllowedIp> findById(String id);

    Mono<AllowedIp> save(AllowedIp allowedIp);

    Mono<Void> deleteById(String id);

    Mono<AllowedIp> update(AllowedIp allowedIp);

    Mono<AllowedIp> findByIp(String ipAddress);

    Flux<AllowedIp> findAll();
}

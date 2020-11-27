package io.github.hapjava.services.impl;


import java.util.concurrent.CompletableFuture;

public interface ResourceService {
    String getResourceType();
    CompletableFuture<byte[]> handle(String json);
}
package io.github.hapjava.characteristics.impl.bridge;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

import io.github.hapjava.characteristics.impl.base.StaticStringCharacteristic;

/** This characteristic describes HAP version. */
public class BridgeVersionCharacteristic extends StaticStringCharacteristic {

  public BridgeVersionCharacteristic(Supplier<CompletableFuture<String>> getter) {
    super(
        "00000037-0000-1000-8000-0026BB765291",
        "HAP version",
        Optional.of(getter),
        Optional.empty(),
        Optional.empty());
  }
}

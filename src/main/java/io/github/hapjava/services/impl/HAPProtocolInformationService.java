package io.github.hapjava.services.impl;

import io.github.hapjava.characteristics.impl.bridge.BridgeVersionCharacteristic;

/** This service HAP version. */
public class HAPProtocolInformationService extends AbstractServiceImpl {

  public HAPProtocolInformationService(BridgeVersionCharacteristic versionCharacteristic) {
    super("000000A2-0000-1000-8000-0026BB765291");
    addCharacteristic(versionCharacteristic);
  }
}

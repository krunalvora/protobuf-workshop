package com.github.krunalvora.protobuf;

import example.complex.Complex.ComplexMessage;
import example.complex.Complex.DummyMessage;

import java.util.Arrays;

public class ComplexMain {

  public static void main(String[] args) {

    DummyMessage oneDummy = newDummyMessage(1, "one dummy");

    ComplexMessage.Builder builder = ComplexMessage.newBuilder();
    builder.setOneDummy(oneDummy)
          .addMultipleDummy(newDummyMessage(2, "two dummy"))
          .addAllMultipleDummy(Arrays.asList(
                newDummyMessage(3, "three dummy"),
                newDummyMessage(4, "four dummy")
          ));

    ComplexMessage message = builder.build();

    System.out.println(message);
  }

  public static DummyMessage newDummyMessage(Integer id, String name) {
    DummyMessage message = DummyMessage.newBuilder().setName(name)
          .setId(id)
          .build();

    return message;
  }
}

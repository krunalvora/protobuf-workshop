package com.github.krunalvora.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.NullValue;
import example.test_string_value.TestStringValue.TestStringValueMessage;

public class TestStringValueMain {
  public static void main(String[] args) throws InvalidProtocolBufferException {
    TestStringValueMessage.Builder builder = TestStringValueMessage.newBuilder();
    builder.setId(1)
          .setName(com.google.protobuf.StringValue.of("myname"));

    TestStringValueMessage message = builder.build();

    // store to byte array
    byte[] bytes = message.toByteArray();

    TestStringValueMessage messageFromBytes = TestStringValueMessage.parseFrom(bytes);

    if (messageFromBytes.getName().getValue() == "") {
      System.out.println("Name is an empty string wrapped in StringValue.");
    } else {
      System.out.println(messageFromBytes.getName().getValue());
    }
  }
}
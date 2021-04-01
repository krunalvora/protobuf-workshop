package com.github.krunalvora.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import example.simple.Simple.SimpleMessage;

import java.util.Arrays;

public class ProtoToJsonMain {

  public static void main(String[] args) throws InvalidProtocolBufferException {

    SimpleMessage.Builder builder = SimpleMessage.newBuilder();
    builder.setId(42)
          .setIsSimple(true)
          .setName("Simple Name");

    // repeated field
    builder.addSampleList(1)
          .addSampleList(2)
          .addSampleList(3)
          .addAllSampleList(Arrays.asList(4, 5, 6));

    System.out.println(builder.toString());

    // Print builder in json format
    String jsonString = JsonFormat.printer().print(builder);
    System.out.println(jsonString);

    // Print json again in protobuf format
    SimpleMessage.Builder builder2 = SimpleMessage.newBuilder();
    JsonFormat.parser()
          .ignoringUnknownFields()
          .merge(jsonString, builder2);

    System.out.println(builder2);

  }
}

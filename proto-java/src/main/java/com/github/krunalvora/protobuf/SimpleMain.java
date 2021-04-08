package com.github.krunalvora.protobuf;

import example.simple.Simple.SimpleMessage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class SimpleMain {
  public static void main(String[] args) throws IOException {

    System.out.println("Hello World!");

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

    SimpleMessage message = builder.build();

    // Write protocol buffer binary to a file
    FileOutputStream outputStream = new FileOutputStream("simple_message.bin");
    message.writeTo(outputStream);
    outputStream.close();

    // Read protobuf from file
    try {
      System.out.println("Reading from file...");

      FileInputStream inputStream = new FileInputStream("simple_message.bin");
      SimpleMessage messageFromFile = SimpleMessage.parseFrom(inputStream);
      System.out.println(messageFromFile);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

package com.github.krunalvora.protobuf;

import example.enumerations.EnumExample.DayOfTheWeek;
import example.enumerations.EnumExample.EnumMessage;

public class EnumMain {

  public static void main(String[] args) {

    EnumMessage.Builder builder = EnumMessage.newBuilder();

    builder.setId(2342)
          .setDayOfTheWeek(DayOfTheWeek.MONDAY);

    EnumMessage message = builder.build();

    System.out.println(message);
  }

}

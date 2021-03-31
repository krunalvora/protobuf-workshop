# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Money.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='Money.proto',
  package='',
  syntax='proto3',
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x0bMoney.proto\"O\n\x05Money\x12\x15\n\rcurrency_code\x18\x01 \x01(\t\x12\x17\n\x0fintegral_amount\x18\x02 \x01(\x03\x12\x16\n\x0e\x64\x65\x63imal_amount\x18\x03 \x01(\x05\x62\x06proto3'
)




_MONEY = _descriptor.Descriptor(
  name='Money',
  full_name='Money',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='currency_code', full_name='Money.currency_code', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='integral_amount', full_name='Money.integral_amount', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='decimal_amount', full_name='Money.decimal_amount', index=2,
      number=3, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=15,
  serialized_end=94,
)

DESCRIPTOR.message_types_by_name['Money'] = _MONEY
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Money = _reflection.GeneratedProtocolMessageType('Money', (_message.Message,), {
  'DESCRIPTOR' : _MONEY,
  '__module__' : 'Money_pb2'
  # @@protoc_insertion_point(class_scope:Money)
  })
_sym_db.RegisterMessage(Money)


# @@protoc_insertion_point(module_scope)

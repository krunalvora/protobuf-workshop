```bash

# To generate java classes from proto files using protoc:
protoc --proto-path=proto --java_out=java proto/*.proto

# Python:
protoc --proto-path=proto --js_out=js proto/*.proto

# Javascript:
protoc --proto-path=proto --python_out=python proto/*.proto

```

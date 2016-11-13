#!bin/bash
./gradlew bootRepackage
docker build -t b4456609/easylearn-note:latest -t b4456609/easylearn-note:${1} .

#!/bin/bash
set -euo pipefail
IFS=$'\n\t'

./mvnw clean install
java -jar target/movr-api-0.0.1-SNAPSHOT.jar

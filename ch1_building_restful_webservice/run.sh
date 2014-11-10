#!/bin/sh
mvn spring-boot:run | grep -v '[main] DEBUG'

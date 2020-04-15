#!/bin/bash

export DOCKER_HOST="tcp://192.168.10.41:2375"

docker build -t wjl/web:0.0.1-SNAPSHOT .;
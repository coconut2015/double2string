#!/bin/bash

BUILD=$1

if [ -z "$BUILD" ]; then
	BUILD=pkg
fi

case "$BUILD" in
	pkg)
		mvn clean package -Dmaven.test.skip=true
		;;
	coverage)
		mvn clean clover:setup package clover:clover
		;;
esac

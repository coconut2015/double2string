#!/bin/bash

BUILD=$1

if [ -z "$BUILD" ]; then
	BUILD=pkg
fi

case "$BUILD" in
	pkg)
		mvn clean package -Dmaven.test.skip=true
		;;
	test)
		mvn clean package
		;;
	coverage)
		mvn clean clover:setup package clover:clover
		;;
esac

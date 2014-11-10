#!/bin/sh
echo "New Chapter \"$1\""
mkdir $1
cp common/debug.sh common/run.sh $1

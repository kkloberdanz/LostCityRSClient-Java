#!/bin/sh
# Launch the Lost City 377 (May 2006) client against the Pi.
# Usage: play.sh [host]   (default rpi0001.local)
HOST="${1:-rpi0001.local}"
mkdir -p "$HOME/.lostcity377"
exec /opt/homebrew/opt/openjdk@21/bin/java \
  -Dlostcity.host="$HOST" -Dlostcity.webport=8888 \
  -Dapple.awt.application.name="Lost City 377" \
  -jar "$HOME/src/lostcity-377-client/build/lostcity377.jar"

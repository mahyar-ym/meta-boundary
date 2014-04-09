#!/bin/sh
export CHROME_DEVEL_SANDBOX=/usr/sbin/chrome-devel-sandbox && xinit /usr/bin/chrome/chrome --user-data-dir --kiosk &

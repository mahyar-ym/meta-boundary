DESCRIPTION = "A console-only image that includes gstreamer, qt5, node, \
and Chromium web browser. It boots up automatically to the browser. "

LICENSE = "BSD"

inherit core-image

IMAGE_INSTALL += " \
    gstreamer \
    nodejs4 \
    chromium \
    qtbase \
"


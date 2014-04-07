DESCRIPTION = "An image that includes gstreamer, openssh, node, \
and Chromium web browser. It boots up automatically to the browser. "

IMAGE_FEATURES += "ssh-server-openssh"

LICENSE = "BSD"

inherit core-image

IMAGE_INSTALL += " \
    gstreamer \
    nodejs4 \
    chromium \
    packagegroup-core-x11-xserver \
    packagegroup-core-x11-utils \
"

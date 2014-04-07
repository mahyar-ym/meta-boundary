DESCRIPTION = "A console-only image that includes gstreamer, openssh, node, \
and Chromium web browser. It boots up automatically to the browser. "

IMAGE_FEATURES += "ssh-server-openssh"

LICENSE = "BSD"

inherit core-image

IMAGE_INSTALL += " \
    gstreamer \
    nodejs4 \
    chromium \
    packagegroup-x11-boundary \
"

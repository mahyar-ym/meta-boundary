DESCRIPTION = "A console-only image that includes gstreamer, openssh, node, \
and Chromium web browser. It boots up automatically to the browser. "

IMAGE_FEATURES += "ssh-server-openssh x11-base"

LICENSE = "BSD"

inherit core-image

IMAGE_INSTALL += " \
    gstreamer \
    nodejs4 \
    chromium \
"

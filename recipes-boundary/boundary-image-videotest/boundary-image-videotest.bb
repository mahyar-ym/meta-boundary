DESCRIPTION = "This image is based on core-image-sato and provides a demo video test using GStreamer"

require recipes-sato/images/core-image-sato.bb

PREFERRED_PROVIDER_virtual/kernel = "linux-boundary"
PREFERRED_VERSION_linux-boundary = "3.10.17"

CORE_IMAGE_EXTRA_INSTALL += " \
    packagegroup-fsl-gstreamer \
    packagegroup-fsl-gstreamer-full \
    videotest \
"


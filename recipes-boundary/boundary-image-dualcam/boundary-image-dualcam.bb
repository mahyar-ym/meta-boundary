DESCRIPTION = "This image is based on core-image-sato and provides a demo to test dual camera support for nitrogen6x boards"

require recipes-sato/images/core-image-sato.bb

PREFERRED_PROVIDER_virtual/kernel = "linux-boundary"
PREFERRED_VERSION_linux-boundary = "3.10.17"

#install all gstreamer packages
CORE_IMAGE_EXTRA_INSTALL += " \
    cam-demo \
    packagegroup-fsl-gstreamer \
    packagegroup-fsl-gstreamer-full \
"



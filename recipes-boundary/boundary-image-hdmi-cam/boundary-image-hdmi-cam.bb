DESCRIPTION = "This image is based on core-image-sato and provides a demo to test HDMI camera (DB) on Nitrogen6x board (kernel 3.0.35)"

require recipes-sato/images/core-image-sato.bb


#install all gstreamer packages
CORE_IMAGE_EXTRA_INSTALL += " \
    hdmi-cam-demo \
    packagegroup-fsl-gstreamer \
    packagegroup-fsl-gstreamer-full \
    packagegroup-fsl-tools-gpu \
"



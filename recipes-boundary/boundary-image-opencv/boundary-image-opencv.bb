DESCRIPTION = "This Image Extends fsl-image-multimedia-full with additional OpenCV and Devregs features"

require recipes-fsl/images/fsl-image-multimedia-full.bb 

EXTRA_IMAGE_FEATURES += "dev-pkgs"

IMAGE_INSTALL += "\
	devregs \
	opencv \
	"



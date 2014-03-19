DESCRIPTION = "This image extends fsl-image-multimedia-full with additional OpenCV and Devregs features"

require recipes-fsl/images/fsl-image-multimedia-full.bb 

LICENSE_FLAGS = "commercial"

IMAGE_INSTALL += "\
	devregs \
	opencv \
	"



DESCRIPTION = "allow access to device registers"
LICENSE = "GPL-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;e9e36a9de734199567a4d769498f743d"
PR = "r0"
PV = "1.0"

SRCREV = "f420b59e2f9572240acf94757ccc18360a9462ae"
SRC_URI = "git://github.com/boundarydevices/devregs.git"

S = "${WORKDIR}/git"

inherit autotools





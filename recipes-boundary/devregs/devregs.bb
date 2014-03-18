DESCRIPTION = "allow access to device registers"
HOMEPAGE = "http://boundarydevices.com/i-mx5x-device-register-access"
LICENSE = "GPL-1.0"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"
PR = "r0"
PV = "1.0+git${SRCPV}""

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/boundarydevices/devregs.git"

S = "${WORKDIR}/git"

inherit autotools






DESCRIPTION = "allow access to device registers"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=801f80980d171dd6425610833a22dbe6"
PR = "r0"
PV = "1.0"

SRCREV = "f420b59e2f9572240acf94757ccc18360a9462ae"
SRC_URI = "git://github.com/boundarydevices/devregs.git"

S = "${WORKDIR}/git"

inherit autotools





DESCRIPTION = "Installing necessary files for HDMI camera demo"
LICENSE = "GPL-1.0"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"
PR = "r0"
PV = "1"

SRC_URI = "file://hdmi-cam \
	   file://hdmi-cam.desktop \
"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}/
    install -m 755 hdmi-cam ${D}${bindir}/

    install -d ${D}${datadir}/applications/
    install hdmi-cam.desktop ${D}${datadir}/applications/
}

FILES_${PN} = "${bindir}/hdmi-cam ${datadir}/applications/hdmi-cam.desktop"


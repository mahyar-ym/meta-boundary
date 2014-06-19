DESCRIPTION = "Installing necessary files for video test demo"
LICENSE = "GPL-1.0"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"
PR = "r0"
PV = "1"

SRC_URI = "file://videotest \
	   file://videotest.desktop \
	   file://videotest.webm "


S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}/
    install -m 755 videotest ${D}${bindir}/

    install -d ${D}${datadir}/applications/
    install videotest.desktop ${D}${datadir}/applications/

    install -d ${D}/home/root
    install videotest.webm ${D}/home/root/
}

FILES_${PN} = "${bindir}/videotest ${datadir}/applications/videotest.desktop /home/root/videotest.webm"

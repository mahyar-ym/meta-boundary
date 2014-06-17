DESCRIPTION = "Installing necessary files for Dual camera demo"
LICENSE = "GPL-1.0"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"
PR = "r0"
PV = "1"

SRC_URI = "file://dual-cam \
           file://mipi-cam \
           file://parallel-cam \
	   file://dual-cam.desktop \
           file://mipi-cam.desktop \
           file://parallel-cam.desktop \ 
"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}/
    install -m 755 dual-cam ${D}${bindir}/

    install -d ${D}${bindir}/
    install -m 755 mipi-cam ${D}${bindir}/

    install -d ${D}${bindir}/
    install -m 755 parallel-cam ${D}${bindir}/

    install -d ${D}${datadir}/applications/
    install dual-cam.desktop ${D}${datadir}/applications/

    install -d ${D}${datadir}/applications/
    install mipi-cam.desktop ${D}${datadir}/applications/

    install -d ${D}${datadir}/applications/
    install parallel-cam.desktop ${D}${datadir}/applications/
}

FILES_${PN} = "${bindir}/dual-cam ${bindir}/mipi-cam ${bindir}/parallel-cam ${datadir}/applications/dual-cam.desktop ${datadir}/applications/mipi-cam.desktop ${datadir}/applications/parallel-cam.desktop"


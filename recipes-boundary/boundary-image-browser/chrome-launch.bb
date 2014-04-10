DESCRIPTION = "Installing necessary files to launch Chromium automatically"
LICENSE = "GPL-1.0"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"
PR = "r3"
PV = "1.0"

SRC_URI = "file://10xstartchrome.sh "
SRC_URI[md5sum]="8233134ad65a23747b3245726383842c"
SRC_URI[sha256sum] = "91fdd26a5cdfda6cda347659458e0fb0917eb584e363a6ee8709cd6270ac3872"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${sysconfdir}/X11/Xsession.d/
    install -m 0755 10xstartchrome.sh ${D}${sysconfdir}/X11/Xsession.d/
}



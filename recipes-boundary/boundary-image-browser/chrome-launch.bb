DESCRIPTION = "Installing necessary files to launch Chromium automatically"
LICENSE = "GPL-1.0"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "file://startchrome.sh "
SRC_URI[md5sum]="211abb091fd72567ffd0d65a30aa22f6"
SRC_URI[sha256sum] = "7025f92ad3893ebf96c71776936669273116167f1ee982b6e1009713d50cfbb9"
PV = "1.0"

S = "${WORKDIR}"

inherit update-rc.d

INITSCRIPT_NAME = "startchrome.sh"
INITSCRIPT_PARAMS = "start 03 5 2 . stop 01 0 1 6 ."

do_install() {
    install -d ${D}${sysconfdir}/init.d
    install -m 755 startchrome.sh ${D}${sysconfdir}/init.d
}

FILES_${PN} = "${sysconfdir}/init.d/startchrome.sh"


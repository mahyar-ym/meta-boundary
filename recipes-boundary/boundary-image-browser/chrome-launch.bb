DESCRIPTION = "Installing necessary files to launch Chromium automatically"
LICENSE = "GPL-1.0"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"
PR = "r0"
PV = "2"

SRC_URI = "file://10xstartchrome.sh \
	   file://master_preferences "

S = "${WORKDIR}"

do_install() {
    install -d ${D}${sysconfdir}/X11/Xsession.d/
    install -m 0755 10xstartchrome.sh ${D}${sysconfdir}/X11/Xsession.d/

    install -d ${D}${bindir}/chrome/
    install master_preferences ${D}${bindir}/chrome/
}

FILES_${PN} = "${sysconfdir}/X11/Xsession.d/10xstartchrome.sh ${bindir}/chrome/master_preferences"

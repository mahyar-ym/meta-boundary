DESCRIPTION = "installs java to /opt directory"
LICENSE = "GPL-1.0"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "http://linode.boundarydevices.com/jdk-7u51-linux-arm-vfp-hflt.tar.gz"
SRC_URI[md5sum] = "80e14facc0aa784f44d8f142025dd020"
SRC_URI[sha256sum] = "47273843454755d1bdd3b91ec97c42b1bcdae01af6e42c38413c3d0ff630557a"

INSANE_SKIP_${PN} = "ldflags debug-files dev-so"

S = "${WORKDIR}"

do_install() {
	install -d ${D}/opt/
	cp -r jdk1.7.0_51/ ${D}/opt/
}

FILES_${PN} = "/opt/jdk1.7.0_51/* "


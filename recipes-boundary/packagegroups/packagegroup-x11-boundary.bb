SUMMARY = "Basic X11 session for booting up the browser"
DESCRIPTION = "Packages required to set up a basic working X11 session to boot boundary-image-browser"
LICENSE = "MIT"
PR = "r1"

inherit packagegroup


RDEPENDS_${PN} = "\
    packagegroup-core-x11-xserver \
    packagegroup-core-x11-utils \
    "


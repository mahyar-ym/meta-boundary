FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-Modified-gl.gyp-to-link-libEGL-and-libGAL-at-build-t.patch \
	    file://0002-Added-hardware-accelerated-decoding-with-the-i.MX-VP.patch "

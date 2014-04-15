FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-Modified-gl.gyp-to-link-libEGL-and-libGAL-at-build-t.patch \
	    file://0002-Added-hardware-accelerated-decoding-with-the-i.MX-VP.patch \
	    file://0003-Update-vpu_video_decoder.cc-to-match-chromium-35.0.1883.patch \
	    file://remove_google_API_missing_infobar.patch \
	    file://no-crash-infobar.patch "

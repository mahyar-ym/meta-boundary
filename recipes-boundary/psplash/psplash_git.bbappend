FILESEXTRAPATHS_prepend_poky := "${THISDIR}/files:"

SRC_URI += "file://psplash-colors.h \
	    file://psplash-bar-img.h "

do_configure_append () {
        cd ${S}
        cp ../psplash-colors.h ./

        cp ../psplash-bar-img.h ./psplash-bar-img.h
}



DESCRIPTION = "An image that includes gstreamer, openssh, node, \
and Chromium web browser. It boots up automatically to the browser. "

IMAGE_FEATURES += "ssh-server-openssh splash"

LICENSE = "BSD"

inherit core-image

IMAGE_INSTALL += " \
    gst-fsl-plugin \
    gstreamer \
    nodejs4 \
    chromium \
    packagegroup-core-x11-xserver \
    packagegroup-core-x11-utils \
    chrome-launch \
"
ROOTFS_POSTPROCESS_COMMAND += "rootfs_passwd"

rootfs_passwd () {
        sed -i 's/root::/root:$6$UpX6sfUyhkksHFi$4UaSSUpXaR7fo1boXQY4Kgn84M81PwmYfPTqF3qKfwlvkt76SzZiTQGti7Vi0uzQZ49m3abl.R5blSzWTPOj30:/g' ${IMAGE_ROOTFS}/etc/shadow
}

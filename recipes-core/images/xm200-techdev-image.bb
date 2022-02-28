ARAGO_SYSVINIT = "1"

require arago-image.inc

IMAGE_FEATURES_remove = "package-management splash"

IMAGE_FSTYPES += "cpio cpio.xz"

ARAGO_TINY_IMAGE_EXTRA_INSTALL ?= ""

IMAGE_INSTALL = " \
	packagegroup-arago-sysvinit-boot \
	${ARAGO_TINY_IMAGE_EXTRA_INSTALL} \
"

deltask do_packagedata

export IMAGE_BASENAME = "xm200-techdev-image"

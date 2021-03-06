SUMMARY = "KDE configuration system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f0a5d4f90ff74a764691e1d31caa378c"
SRC_URI[sha256sum] = "6f464a63079f43f11deb7f1661dadaa12539b8a8c75e3fa7476dae8ab6886a5e"

# REVISIT remove ugly hack for wayland-only environments
SRC_URI += " \
    file://0001-kconfiggui-do-only-compile-in-case-sessions-are-aval.patch \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

# native executables
CMAKE_ALIGN_SYSROOT[1] = "KF5Config, -s${_IMPORT_PREFIX}/libexec/kf5, -s${KDE_PATH_EXTERNAL_HOST_LIBEXECS}/kf5"

require ${BPN}.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://0001-build-manual-only-alignments.patch \
"

inherit native

S = "${WORKDIR}/git/manual"
LIC_FILES_CHKSUM = "file://../${LICENSEFILE}"

do_install() {
    install -d ${D}${bindir}
    install -m 755 ${B}/genManual ${D}${bindir}/museScoreGenManual
}

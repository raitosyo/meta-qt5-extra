SUMMARY = "All gottcode recipes - just for build test"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

RDEPENDS_${PN} = " \
    focuswriter \
    gottet \
    hexalate \
    peg-e \
    simsu \
    tetzle \
"

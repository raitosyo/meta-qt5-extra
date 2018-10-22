SUMMARY = "Lightweight RDF"
DESCRIPTION = "A lightweight RDF library for accessing plugin metadata in the LADSPA plugin system"
LICENSE = "GPLv2"
LICENSEFILE = "LICENSE.GPL;md5=9239979330a1bf352c61177bfc051460"
LIC_FILES_CHKSUM = "file://${LICENSEFILE}"

SRC_URI = " \
    git://github.com/musescore/MuseScore.git;branch=2.3.2 \
"
SRCREV = "45924076871483cb96b859cc374c5fbdbf76ba53"
S = "${WORKDIR}/git"
PV = "2.3.2"

inherit cmake_qt5 pkgconfig gtk-icon-cache

SUMMARY = "Documentation generation from docbook"
LICENSE = "MIT | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
	file://LICENSE;md5=d975629b732b61cb58f9595c6baa9379 \
"

inherit kde-kf5 perlnative

# allarch recipes
DEPENDS += "docbook-xml-dtd4 docbook-xsl-stylesheets liburi-perl-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0fb5dd4eb907b55782e321f3d86eb825"
SRC_URI[sha256sum] = "5c0b915d0f054098b47c5c1ef6ee0d174a9a607405f23c3921276189cefd48f4"

# allarch packages do only install into machine sysroot
# for xml4
OECMAKE_EXTRA_ROOT_PATH = "${STAGING_DIR}/${MACHINE}"
# for xsl (we have to hardcode /usr - ${prefix} is aligned by native.bbclase
EXTRA_OECMAKE += " \
    -DOE_ROOT_PATH_PREFIX=${STAGING_DIR}/${MACHINE}/usr \
    -DCMAKE_AR:FILEPATH=${AR} \
    -DINSTALL_INTERNAL_TOOLS=ON \
"


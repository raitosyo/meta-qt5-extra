SUMMARY = "All KDE plasma packages - not just for build test"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

OTHER = " \
    plasma-mobile-world \
"

TIER_1 = " \
    kdecoration \
"

TIER_2 = " \
"

TIER_3 = " \
    kactivitymanagerd \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "plasma-workspace", "",d)} \
"

UNTIER = " \
    bluedevil \
    breeze \
    breeze-gtk \
    breeze-plymouth \
    discover \
    kde-cli-tools \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "kde-gtk-config", "",d)} \
    kdeplasma-addons \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "kgamma5", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "khotkeys", "",d)} \
    kinfocenter \
    kmenuedit \
    kscreen \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "kscreenlocker", "",d)} \
    ksshaskpass \
    ksysguard \
    kwallet-pam \
    kwayland-integration \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "kwin", "",d)} \
    kwrited \
    libkscreen \
    libksysguard \
    milou \
    oxygen \
    oxygen-fonts \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', bb.utils.contains('BBFILE_COLLECTIONS', 'browser-layer', 'plasma-browser-integration', '', d), '', d)} \
    plasma-desktop \
    plasma-integration \
    plasma-nm \
    plasma-pa \
    plasma-vault \
    plasma-workspace-wallpapers \
    polkit-kde-agent-1 \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "powerdevil", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "sddm-kcm", "",d)} \
    systemsettings \
    user-manager \
"

RDEPENDS_${PN} = " \
    ${OTHER} \
    ${TIER_1} \
    ${TIER_2} \
    ${TIER_3} \
    ${UNTIER} \
"

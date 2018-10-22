require ${BPN}.inc

OECMAKE_GENERATOR = "Unix Makefiles"

SRC_URI += " \
    file://0001-Build-help-support-if-QtHelp-is-available-only.patch \
    file://0002-Do-not-try-to-find-ln.patch \
    file://0003-Find-native-genManual.patch \
"

# qttools-croos does not work - native help generator needs gui...
DEPENDS += " \
    ${BPN}-native \
    qttools-native \
    gzip-native \
    qtbase \
    qtdeclarative \
    qtsvg \
    qtwebkit \
    freetype \
    pulseaudio \
    libsndfile1 \
    lame \
    fluidsynth \
    portaudio-v19 \
    portmidi \
"

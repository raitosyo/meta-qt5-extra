# Liri specific
PACKAGECONFIG_append_class-target = " drm-egl-server"

# seems Liri specific (yet) - headers missing
# see https://bugreports.qt.io/browse/QTBUG-71340
do_install_append() {
    for header in `find ${B}/src/client -name 'qwayland-*.h'`; do
        echo 'Manual install: $header'
        install -m 644 $header ${D}${includedir}/QtWaylandClient/${BPN}/QtWaylandClient/private
    done
}

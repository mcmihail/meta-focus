FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}_${PV}:"

SRC_URI_append += "file://myconfig"


do_install_append() {
    install -m 0644 ${WORKDIR}/myconfig ${D}${sysconfdir}/
    mv ${D}${sysconfdir}/myconfig ${D}${sysconfdir}/hostapd.conf
}

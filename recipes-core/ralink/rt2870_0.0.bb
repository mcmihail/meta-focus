DESCRIPTION = "Firmware package for rt2870 chipset usb wifi adapters."

# I'm not sure what license type & file to use for rt2870 binary for the moment.
# Please, contact me, if is something wrong with the license part.

LICENSE="custom"
LIC_FILES_CHKSUM="file://${WORKDIR}/git/LICENCE.rtlwifi_firmware.txt;md5=00d06cfd3eddd5a2698948ead2ad54a5"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/firmware/linux-firmware.git;protocol=git;rev=a4f3bc03f1e7b1f25cc52328981c2a35871e55a1"

FILES_${PN} = "lib/firmware/rt2870.bin"

do_install(){
    mkdir -p ${D}/lib/firmware
    install -m 644 ${WORKDIR}/git/rt2870.bin ${D}/lib/firmware
}
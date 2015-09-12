require u-boot.inc

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

# No patches for other machines yet
COMPATIBLE_MACHINE = "(ad203-sd | ad203-emmc)"

DEFAULT_PREFERENCE_mele= "1"
DEFAULT_PREFERENCE_meleg= "1"
DEFAULT_PREFERENCE_olinuxino-a13= "1"
DEFAULT_PREFERENCE_olinuxino-a10s= "1"
DEFAULT_PREFERENCE_olinuxino-a10= "1"
DEFAULT_PREFERENCE_olinuxino-a20= "1"
DEFAULT_PREFERENCE_olinuxino-a20som= "1"
DEFAULT_PREFERENCE_olinuxino-a20lime= "1"
DEFAULT_PREFERENCE_cubieboard="1"
DEFAULT_PREFERENCE_cubieboard2="1"
DEFAULT_PREFERENCE_cubietruck="1"

SRC_URI = "git://github.com/HABEY-USA/u-boot-sunxi.git;branch=sunxi"


PE = "1"
PV = "v2014.04+git${SRCPV}"
#SRCREV = "ee425f94b488a4304c136a171bb8fdec0d835032"
SRCREV = "${AUTOREV}"
SCMVERSION = "n"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"

SPL_BINARY="u-boot-sunxi-with-spl.bin"


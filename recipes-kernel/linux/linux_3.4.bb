require linux.inc

DESCRIPTION = "Linux kernel for Allwinner a10/a20 processors"

COMPATIBLE_MACHINE = "(ad203-sd|ad203-emmc)"

PV = "3.4.90"
PR = "r1"
# Last tested version by myself
#SRCREV_pn-${PN} = "e37d760b363888f3a65cd6455c99a75cac70a7b8"
SRCREV = "${AUTOREV}"
SCMVERSION = "n"

MACHINE_KERNEL_PR_append = "a"

SRC_URI += "git://github.com/HABEY-USA/linux-sunxi.git;branch=sunxi-3.4 \
        file://defconfig \
        "

SRC_URI[cgroup-patch.md5sum] = "4aa5087e3396f3179b61ccd478e9e604"
SRC_URI[cgroup-patch.sha256sum] = "f9f9cb55eb6f8abf322830afd7a5f4a090e539add75e0ed1f1016b5351a9b533"

S = "${WORKDIR}/git"

#fix QA issue "Files/directories were installed but not shipped: /usr/src/debug"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"


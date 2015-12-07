DESCRIPTION = "Recipe for Cowboy Cowlib library" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=25434a2f20632f7f006467fcd55b3da3"
S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
PR = "r0"

inherit erlang-package

SRC_URI = "git://github.com/ninenines/cowlib.git;branch=master"

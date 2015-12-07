DESCRIPTION = "Receipe for Cowboy Ranch library" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8445cb073d1f4438d5975bde2f16aa27"
S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
PR = "r0"

inherit erlang-package

SRC_URI = "git://github.com/ninenines/ranch.git;branch=master"

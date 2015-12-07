# Copyright (C) 2015 Samir Sow
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Ninenines Cowboy Suite"
LICENSE = "MIT"
PR = "r0"

inherit packagegroup

PACKAGES = "\
    ${PN} \
    "

RDEPENDS_${PN} = "\
    openssl \
    libcrypto \
    cowlib \
    ranch \
    "

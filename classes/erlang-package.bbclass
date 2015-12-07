#
# This class is inherited by any erlang recipe to install the beam file
# in the right dest directory
#
 
bindir := "/usr/lib/erlang/lib/${PN}/ebin"

RDEPENDS_${PN} += "erlang"

do_install(){
	install -d ${D}${bindir}
	install ${S}/ebin/* ${D}${bindir}/
}

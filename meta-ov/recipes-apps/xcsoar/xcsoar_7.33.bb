# Copyright (C) 2014 Unknow User <unknow@user.org>
# Released under the MIT license (see COPYING.MIT for the terms)

PR="r0"
RCONFLICTS:${PN}="xcsoar-testing"

SRC_URI = "git://github.com/SashLi/XCSoar.git;protocol=https;branch=master \
"

SRCREV = "e122cbc553a49af473ab35c8109e6e9491727e92"

# TODO remove this after 7.25 has been released with https://github.com/XCSoar/XCSoar/commit/7ce3070fee3a140b6a4d9437a2cfe9854f78abfe
EXTRA_CXXFLAGS = "-Wno-empty-body"
export EXTRA_CXXFLAGS

require xcsoar.inc

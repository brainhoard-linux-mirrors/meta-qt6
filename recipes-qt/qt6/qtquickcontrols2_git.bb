LICENSE = "GFDL-1.3 & BSD & ( LGPL-3.0 | GPL-3.0 ) | The-Qt-Company-Commercial"
LIC_FILES_CHKSUM = " \
    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e \
    file://LICENSE.LGPLv3;md5=382747d0119037529ec2b98b24038eb0 \
    file://LICENSE.GPLv3;md5=dce746aa5261707df6d6999ab9958d8b \
"

inherit qt6-cmake

include recipes-qt/qt6/qt6-git.inc
include recipes-qt/qt6/qt6.inc

DEPENDS = "qtbase qtdeclarative"

SRCREV = "88e9a8914798f902f3f15ae1d67c20f3a0cd22f4"

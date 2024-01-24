inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "ROS package for LDS(LD08). The LDS (Laser Distance Sensor) is a sensor sending data to the host for simultaneous localization and mapping (SLAM). It can also send obstacle detection data to the host. LD08 is developed by ROBOTIS for use in various moving platforms, including Robot Vacuum Cleaners, Home Robots, Robotics Lawn Mower Sensors, etc."
AUTHOR = "Will Son <willson@robotis.com>"
ROS_AUTHOR = "Darby Lim <thlim@robotis.com>"
HOMEPAGE = "https://github.com/ROBOTIS-GIT/ld08_driver"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=801802dd6be2a2405f6097310a6b87b2"

ROS_CN = "ld08_driver"
ROS_BPN = "ld08_driver"

ROS_BUILD_DEPENDS = " \
    boost \
    rclcpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    udev \
    ament-cmake-native \
    python-cmake-module-native \
    python3-empy-native \
    python3-lark-parser-native \
    python3-numpy-native \
    rosidl-adapter-native \
    rosidl-generator-cpp-native \
    rosidl-generator-py-native \
    rosidl-parser-native \
    rosidl-typesupport-cpp-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    rclcpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    rclcpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

# Update the following variables based on the source location and version
ROS_BRANCH ?= "branch=humble-devel"
SRC_URI = "git://github.com/ROBOTIS-GIT/ld08_driver.git;${ROS_BRANCH};protocol=https"
SRCREV = "963968beb941f3072db16660840156f65206c19e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

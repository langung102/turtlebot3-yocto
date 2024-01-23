SUMMARY = "A image including a bare-minimum installation of ROS 2 and including some basic pub/sub examples. It includes two DDS middleware implementations, FastDDS and Cyclone DDS"
DESCRIPTION = "${SUMMARY}"

LICENSE="CLOSED"
LIC_FILES_CHKSUM=""

require ${COREBASE}/meta/recipes-core/images/core-image-minimal.bb

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated
inherit ${ROS_DISTRO_TYPE}_image
inherit extrausers

IMAGE_INSTALL:append = " \
    ros-core \
    ros-base \
    turtlebot3-bringup \
    turtlebot3-msgs \
    turtlebot3-cartographer \
    turtlebot3-description \
    turtlebot3-node \
    turtlebot3-teleop \
    hls-lfcd-lds-driver\
    urdf \
    ld08-driver \
"

PASSWD ="$5$2yZ6pkiYyBNLRwPQ$PWhYRHrHevygrxfscTaqYjuB4igYcOOXvzmV2krqhy."
EXTRA_USERS_PARAMS = "usermod -p '${PASSWD}' root;"
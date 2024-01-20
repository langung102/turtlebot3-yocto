DESCRIPTION = "Image for tourguide robot project"
HOMEPAGE = "https://www.yoctoproject.org/"

IMAGE_FEATURES += "splash package-management x11-base x11-sato ssh-server-dropbear hwcodecs"


LICENSE = "MIT"

inherit core-image

TOOLCHAIN_HOST_TASK_append = " nativesdk-intltool nativesdk-glib-2.0"
TOOLCHAIN_HOST_TASK_remove_task-populate-sdk-ext = " nativesdk-intltool nativesdk-glib-2.0"

QB_MEM = '${@bb.utils.contains("DISTRO_FEATURES", "opengl", "-m 512", "-m 256", d)}'
QB_MEM_qemuarmv5 = "-m 256"
QB_MEM_qemumips = "-m 256"

IMAGE_INSTALL_append_pn-core-image-bv-adas += " \
  
"
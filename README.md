## Init submodule

```
git submodule init
git submodule update --remote
```

## How to build

```
source subrepos/poky/oe-init-build-env
screen bitbake core-image-rasp-pi
```

## Deploy image

```
cd tmp/deploy/images/raspberrypi3-64
bzip2 -d -f {IMAGE_NAME}.wic.bz2
sudo dd bs=4M if={IMAGE_NAME}.wic of=/dev/{DEVICE_NAME} status=progress conv=fsync 
```
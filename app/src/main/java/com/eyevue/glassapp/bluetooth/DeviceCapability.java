package com.eyevue.glassapp.bluetooth;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public enum DeviceCapability {
    SUPPORTS_LIVE_BROADCAST(0, "是否支持直播功能"),
    SUPPORTS_QUICK_VOLUME_ADJUST(1, "是否支持快捷调整音量功能"),
    SUPPORTS_PHOTO_WATERMARK(2, "是否支持照片水印功能"),
    SUPPORTS_WEAR_DETECTION_DYNAMIC(3, "是否支持佩戴检测动态获取"),
    SUPPORTS_WEAR_DETECTION(4, "是否支持佩戴检测功能"),
    SUPPORTS_STABILIZATION_DYNAMIC(5, "是否支持防抖功能动态获取"),
    SUPPORTS_STABILIZATION(6, "是否支持防抖功能"),
    SUPPORTS_AI_WAKE_WORD(7, "是否支持AI唤醒词开关控制"),
    SUPPORTS_LOCAL_OFFLINE_VOICE(8, "是否支持本地离线语音功能"),
    SUPPORTS_DYNAMIC_LANGUAGE_SWITCH(9, "是否支持动态切换中英文词条功能"),
    SUPPORTS_SCREEN_ORIENTATION_DYNAMIC(10, "是否支持横竖屏设置动态获取"),
    SUPPORTS_SCREEN_ORIENTATION(11, "是否支持横竖屏功能");

    private static final Map<Integer, DeviceCapability> bitToEnum = new HashMap();
    private final int bitPosition;
    private final String description;

    static {
        for (DeviceCapability deviceCapability : values()) {
            bitToEnum.put(Integer.valueOf(deviceCapability.bitPosition), deviceCapability);
        }
    }

    DeviceCapability(int bitPosition, String description) {
        this.bitPosition = bitPosition;
        this.description = description;
    }

    public static DeviceCapability getByBitPosition(int bitPosition) {
        return bitToEnum.get(Integer.valueOf(bitPosition));
    }

    public int getBitPosition() {
        return this.bitPosition;
    }

    public String getDescription() {
        return this.description;
    }
}

package com.eyevue.glassapp.bluetooth.beans;

import com.eyevue.glassapp.bluetooth.DeviceCapability;
import com.eyevue.glassapp.bluetooth.DeviceCapabilityParser;
import com.eyevue.glassapp.bluetooth.HexConvert;
import java.util.EnumSet;
import java.util.List;
import p000.zi9;

/* JADX INFO: loaded from: classes4.dex */
public class SupportFunctionBean extends BaseBytesBean {
    public boolean supportAiWakeWord;
    public boolean supportDynamicLanguageSwitch;
    public boolean supportLive;
    public boolean supportLocalOfflineVoice;
    public boolean supportPhotoWatermark;
    public boolean supportQuickVolume;
    public boolean supportScreenOrientation;
    public boolean supportScreenOrientationDynamic;
    public boolean supportStabilization;
    public boolean supportStabilizationDynamic;
    public boolean supportWearDetection;
    public boolean supportWearDetectionDynamic;

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public /* bridge */ /* synthetic */ BaseBytesBean recoverByBytes(List byteList) {
        return recoverByBytes((List<Integer>) byteList);
    }

    @Override // com.eyevue.glassapp.bluetooth.beans.BaseBytesBean
    public SupportFunctionBean recoverByBytes(List<Integer> byteList) {
        if (byteList.isEmpty()) {
            return null;
        }
        SupportFunctionBean supportFunctionBean = new SupportFunctionBean();
        byte[] bArrConvertList2Array = HexConvert.convertList2Array(byteList);
        if (bArrConvertList2Array.length >= 4) {
            EnumSet<DeviceCapability> capabilities = DeviceCapabilityParser.parseCapabilities(bArrConvertList2Array);
            supportFunctionBean.supportLive = capabilities.contains(DeviceCapability.SUPPORTS_LIVE_BROADCAST);
            supportFunctionBean.supportQuickVolume = capabilities.contains(DeviceCapability.SUPPORTS_QUICK_VOLUME_ADJUST);
            supportFunctionBean.supportPhotoWatermark = capabilities.contains(DeviceCapability.SUPPORTS_PHOTO_WATERMARK);
            supportFunctionBean.supportWearDetectionDynamic = capabilities.contains(DeviceCapability.SUPPORTS_WEAR_DETECTION_DYNAMIC);
            supportFunctionBean.supportWearDetection = capabilities.contains(DeviceCapability.SUPPORTS_WEAR_DETECTION);
            supportFunctionBean.supportStabilizationDynamic = capabilities.contains(DeviceCapability.SUPPORTS_STABILIZATION_DYNAMIC);
            supportFunctionBean.supportStabilization = capabilities.contains(DeviceCapability.SUPPORTS_STABILIZATION);
            supportFunctionBean.supportAiWakeWord = capabilities.contains(DeviceCapability.SUPPORTS_AI_WAKE_WORD);
            supportFunctionBean.supportLocalOfflineVoice = capabilities.contains(DeviceCapability.SUPPORTS_LOCAL_OFFLINE_VOICE);
            supportFunctionBean.supportDynamicLanguageSwitch = capabilities.contains(DeviceCapability.SUPPORTS_DYNAMIC_LANGUAGE_SWITCH);
            supportFunctionBean.supportScreenOrientationDynamic = capabilities.contains(DeviceCapability.SUPPORTS_SCREEN_ORIENTATION_DYNAMIC);
            supportFunctionBean.supportScreenOrientation = capabilities.contains(DeviceCapability.SUPPORTS_SCREEN_ORIENTATION);
            zi9.m26852e("BLE", DeviceCapabilityParser.getCapabilityReport(bArrConvertList2Array));
        }
        return supportFunctionBean;
    }
}

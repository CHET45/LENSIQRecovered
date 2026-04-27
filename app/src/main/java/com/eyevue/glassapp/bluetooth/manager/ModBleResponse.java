package com.eyevue.glassapp.bluetooth.manager;

import android.os.Handler;
import android.os.Looper;
import com.blankj.utilcode.util.C2473f;
import com.eyevue.glassapp.bluetooth.beans.BatteryBean;
import com.eyevue.glassapp.bluetooth.beans.CommonBean;
import com.eyevue.glassapp.bluetooth.beans.CommonValue2Bean;
import com.eyevue.glassapp.bluetooth.beans.CustomerCmdBean;
import com.eyevue.glassapp.bluetooth.beans.DeviceValueBean;
import com.eyevue.glassapp.bluetooth.beans.DirectionValueBean;
import com.eyevue.glassapp.bluetooth.beans.IspStateBean;
import com.eyevue.glassapp.bluetooth.beans.OpusCmdBean;
import com.eyevue.glassapp.bluetooth.beans.PhotoValueBean;
import com.eyevue.glassapp.bluetooth.beans.ReciveBatteryBean;
import com.eyevue.glassapp.bluetooth.beans.SupportFunctionBean;
import com.eyevue.glassapp.bluetooth.beans.SyncValueBean;
import com.eyevue.glassapp.bluetooth.beans.VoiceAssistantBean;
import com.eyevue.glassapp.bluetooth.beans.VolumeValueBean;
import com.eyevue.glassapp.bluetooth.beans.WearBean;
import com.eyevue.glassapp.bluetooth.beans.WifiCmdBean;
import com.eyevue.glassapp.bluetooth.beans.WifiOtaResultBean;
import com.eyevue.glassapp.bluetooth.protocol.Datagram;
import com.eyevue.glassapp.bluetooth.protocol.FileDatagram;
import com.jieli.jl_bt_ota.impl.AbstractC3831a;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.u77;

/* JADX INFO: loaded from: classes4.dex */
public class ModBleResponse extends ModResponse {
    private static final String TAG = ModBleResponse.class.toString();
    private OnAiPhotoListener mOnAiPhotoListener;
    private OnAiStartListener mOnAiStartListener;
    private OnBatterDataListener mOnBatterDataListener;
    private onGestureListener mOnGestureListener;
    private OnPcmDataListener mOnPcmDataListener;
    private OnRecoverFactoryListener mOnRecoverFactoryListener;
    private OnThumbnailCountListener mOnThumbnailCountListener;
    private OnVideoTimeListener mOnVideoTimeListener;
    private OnWifiDataListener mOnWifiDataListener;
    private OnCustomerListener onCustomerListener;
    private OnDeviceInfoListener onDeviceInfoListener;
    private OnDirectionListener onDirectionListener;
    private OnIspWorkStateListenr onIspWorkStateListenr;
    private OnPlayOrStopStatusListener onPlayOrStopStatusListener;
    private OnSupportFunctionListener onSupportFunctionListener;
    private OnTakeAudioStatusListener onTakeAudioStatusListener;
    private OnTakePhotoStatusListener onTakePhotoStatusListener;
    private OnTakeVideoStatusListener onTakeVideoStatusListener;
    private OnVoiceAssistantStatusListener onVoiceAssistantStatusListener;
    private OnVolumeListener onVolumeListener;
    private OnVolumeStatusListener onVolumeStatusListener;
    private OnWearListener onWearListener;
    private OnWearStatusListener onWearStatusListener;
    private OnWifiOtaResultListener onWifiOtaResultListener;
    private final ByteArrayOutputStream photoBuffer = new ByteArrayOutputStream();
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final int PHOTO_TIME_OUT = 6000;
    private final Runnable photoTimeoutRun = new Runnable() { // from class: com.eyevue.glassapp.bluetooth.manager.ModBleResponse.1
        @Override // java.lang.Runnable
        public void run() {
            if (ModBleResponse.this.photoBuffer.toByteArray().length > 0) {
                if (ModBleResponse.this.mOnAiPhotoListener != null) {
                    ModBleResponse.this.mOnAiPhotoListener.onAiPhoto(ModBleResponse.this.photoBuffer.toByteArray());
                }
                ModBleResponse.this.photoBuffer.reset();
            }
        }
    };

    public interface OnAiPhotoListener {
        void onAiPhoto(byte[] data);
    }

    public interface OnAiStartListener {
        void onAiStart();
    }

    public interface OnBatterDataListener {
        void onBatterData(int value, boolean isCharging);
    }

    public interface OnCustomerListener {
        void onCustomer(String customer, String project);
    }

    public interface OnDeviceInfoListener {
        void onDeviceInfo(String btVersion, String ispVersion, String deviceVersion);
    }

    public interface OnDirectionListener {
        void onDirection(byte direction);
    }

    public interface OnIspWorkStateListenr {
        void onIspWorkState(int state);
    }

    public interface OnPcmDataListener {
        void onAiCancel();

        void onPcmCancel();

        void onPcmData(byte[] data);

        void onPcmEnd();

        void onPcmStart();
    }

    public interface OnPlayOrStopStatusListener {
        void onPlayOrStopState(boolean isPlayOrStop);
    }

    public interface OnRecoverFactoryListener {
        void onRecoverFactory();
    }

    public interface OnSupportFunctionListener {
        void onSupport(boolean supportLive, boolean supportQuickVolume);
    }

    public interface OnTakeAudioStatusListener {
        void onTakeAudioState(boolean isTakeAudio);
    }

    public interface OnTakePhotoStatusListener {
        void onTakePhotoState(boolean isTakePhoto);
    }

    public interface OnTakeVideoStatusListener {
        void onTakeVideoState(boolean isTakeVideo);
    }

    public interface OnThumbnailCountListener {
        void onThumbnailCount(int count);
    }

    public interface OnVideoTimeListener {
        void onVideoTime(int time);
    }

    public interface OnVoiceAssistantStatusListener {
        void onVoiceAssistantDisable(boolean isLocalOfflineSpeech, boolean isAiWakeUp);
    }

    public interface OnVolumeListener {
        void onVolume(int systemVolume, int mediaVolume, int callVolume);
    }

    public interface OnVolumeStatusListener {
        void onVolumeDown();

        void onVolumeUp();
    }

    public interface OnWearListener {
        void onWear(boolean isWear);
    }

    public interface OnWearStatusListener {
        void onWearState(boolean isWear);
    }

    public interface OnWifiDataListener {
        void onWifiData(String ssid, String password);
    }

    public interface OnWifiOtaResultListener {
        void onResult(boolean isSuccess);
    }

    public interface onGestureListener {
        void onGesture(int commandId, int gesture);
    }

    private String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02X ", Byte.valueOf(b)));
        }
        return sb.toString().trim();
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.ModResponse
    public void onRequestSyncDataResponse(Datagram datagram, byte[] data) {
        OnCustomerListener onCustomerListener;
        OnVolumeListener onVolumeListener;
        OnSupportFunctionListener onSupportFunctionListener;
        switch (datagram.leHeader.commandId) {
            case 2:
                CommonValue2Bean commonValue2BeanRecoverByBytes = new CommonValue2Bean().recoverByBytes(datagram.leHeader.payload);
                OnVideoTimeListener onVideoTimeListener = this.mOnVideoTimeListener;
                if (onVideoTimeListener != null && commonValue2BeanRecoverByBytes != null) {
                    onVideoTimeListener.onVideoTime(commonValue2BeanRecoverByBytes.value);
                    break;
                }
                break;
            case 4:
                WearBean wearBeanRecoverByBytes = new WearBean().recoverByBytes(datagram.leHeader.payload);
                if (this.onWearListener != null && wearBeanRecoverByBytes != null) {
                    C2473f.m4168e(TAG, "收到佩戴:" + datagram.leHeader.commandId + "::" + wearBeanRecoverByBytes.isWear);
                    this.onWearListener.onWear(wearBeanRecoverByBytes.isWear);
                    break;
                }
                break;
            case 7:
            case 8:
            case 9:
            case 16:
            case 17:
                CommonBean commonBeanRecoverByBytes = new CommonBean().recoverByBytes(datagram.leHeader.payload);
                if (this.mOnGestureListener != null && commonBeanRecoverByBytes != null) {
                    C2473f.m4168e(TAG, "收到手势数据:" + datagram.leHeader.commandId + "::" + commonBeanRecoverByBytes.value);
                    this.mOnGestureListener.onGesture(datagram.leHeader.commandId, commonBeanRecoverByBytes.value);
                    break;
                }
                break;
            case 20:
                OnRecoverFactoryListener onRecoverFactoryListener = this.mOnRecoverFactoryListener;
                if (onRecoverFactoryListener != null) {
                    onRecoverFactoryListener.onRecoverFactory();
                }
                break;
            case 23:
                BatteryBean batteryBeanRecoverByBytes = new BatteryBean().recoverByBytes(datagram.leHeader.payload);
                if (this.mOnBatterDataListener != null && batteryBeanRecoverByBytes != null) {
                    C2473f.m4168e(TAG, "获取电量:" + batteryBeanRecoverByBytes.value + ":::" + batteryBeanRecoverByBytes.isCharging);
                    this.mOnBatterDataListener.onBatterData(batteryBeanRecoverByBytes.value, batteryBeanRecoverByBytes.isCharging);
                    break;
                }
                break;
            case 37:
                WifiCmdBean wifiCmdBeanRecoverByBytes = new WifiCmdBean().recoverByBytes(datagram.leHeader.payload);
                if (this.mOnWifiDataListener != null && wifiCmdBeanRecoverByBytes != null && wifiCmdBeanRecoverByBytes.ssid.length() >= 5) {
                    C2473f.m4168e(TAG, "解析WiFi信息: " + wifiCmdBeanRecoverByBytes.ssid);
                    this.mOnWifiDataListener.onWifiData(wifiCmdBeanRecoverByBytes.ssid, "12345678");
                    break;
                }
                break;
            case 64:
            case 66:
                CommonValue2Bean commonValue2BeanRecoverByBytes2 = new CommonValue2Bean().recoverByBytes(datagram.leHeader.payload);
                if (this.mOnThumbnailCountListener != null && commonValue2BeanRecoverByBytes2 != null) {
                    C2473f.m4168e(TAG, "收到缩略图数量: " + commonValue2BeanRecoverByBytes2.value);
                    this.mOnThumbnailCountListener.onThumbnailCount(commonValue2BeanRecoverByBytes2.value);
                    break;
                }
                break;
            case 69:
                SyncValueBean syncValueBeanRecoverByBytes = new SyncValueBean().recoverByBytes(datagram.leHeader.payload);
                C2473f.m4168e(TAG, "收到同步数据: ::::" + syncValueBeanRecoverByBytes.toString());
                OnTakePhotoStatusListener onTakePhotoStatusListener = this.onTakePhotoStatusListener;
                if (onTakePhotoStatusListener != null) {
                    onTakePhotoStatusListener.onTakePhotoState(syncValueBeanRecoverByBytes.isTakePhoto);
                }
                OnTakeVideoStatusListener onTakeVideoStatusListener = this.onTakeVideoStatusListener;
                if (onTakeVideoStatusListener != null) {
                    onTakeVideoStatusListener.onTakeVideoState(syncValueBeanRecoverByBytes.isTakeVideo);
                }
                OnTakeAudioStatusListener onTakeAudioStatusListener = this.onTakeAudioStatusListener;
                if (onTakeAudioStatusListener != null) {
                    onTakeAudioStatusListener.onTakeAudioState(syncValueBeanRecoverByBytes.isTakeAudio);
                }
                OnWearStatusListener onWearStatusListener = this.onWearStatusListener;
                if (onWearStatusListener != null) {
                    onWearStatusListener.onWearState(syncValueBeanRecoverByBytes.isWear);
                }
                OnPlayOrStopStatusListener onPlayOrStopStatusListener = this.onPlayOrStopStatusListener;
                if (onPlayOrStopStatusListener != null) {
                    onPlayOrStopStatusListener.onPlayOrStopState(syncValueBeanRecoverByBytes.isPlayMusic);
                }
                OnVolumeStatusListener onVolumeStatusListener = this.onVolumeStatusListener;
                if (onVolumeStatusListener != null) {
                    if (syncValueBeanRecoverByBytes.isVolumeDown) {
                        onVolumeStatusListener.onVolumeDown();
                    }
                    if (syncValueBeanRecoverByBytes.isVolumeUp) {
                        this.onVolumeStatusListener.onVolumeUp();
                    }
                }
                u77.f86956D = syncValueBeanRecoverByBytes.isImport;
                break;
            case 70:
                OpusCmdBean opusCmdBeanRecoverByBytes = new OpusCmdBean().recoverByBytes(datagram.leHeader.payload);
                OnPcmDataListener onPcmDataListener = this.mOnPcmDataListener;
                if (onPcmDataListener != null && opusCmdBeanRecoverByBytes != null) {
                    onPcmDataListener.onPcmData(opusCmdBeanRecoverByBytes.opusBytes);
                    break;
                }
                break;
            case 73:
                OnPcmDataListener onPcmDataListener2 = this.mOnPcmDataListener;
                if (onPcmDataListener2 != null) {
                    onPcmDataListener2.onPcmCancel();
                }
                break;
            case 81:
                OnPcmDataListener onPcmDataListener3 = this.mOnPcmDataListener;
                if (onPcmDataListener3 != null) {
                    onPcmDataListener3.onAiCancel();
                }
                break;
            case 83:
                ReciveBatteryBean reciveBatteryBeanRecoverByBytes = new ReciveBatteryBean().recoverByBytes(datagram.leHeader.payload);
                OnBatterDataListener onBatterDataListener = this.mOnBatterDataListener;
                if (onBatterDataListener != null && reciveBatteryBeanRecoverByBytes != null) {
                    onBatterDataListener.onBatterData(reciveBatteryBeanRecoverByBytes.value, reciveBatteryBeanRecoverByBytes.isCharging);
                    break;
                }
                break;
            case 84:
                IspStateBean ispStateBeanRecoverByBytes = new IspStateBean().recoverByBytes(datagram.leHeader.payload);
                if (this.onIspWorkStateListenr != null && ispStateBeanRecoverByBytes != null) {
                    C2473f.m4168e(TAG, "收到ISP工作状态:" + ((int) ispStateBeanRecoverByBytes.state));
                    this.onIspWorkStateListenr.onIspWorkState(ispStateBeanRecoverByBytes.state);
                    break;
                }
                break;
            case 85:
                DeviceValueBean deviceValueBeanRecoverByBytes = new DeviceValueBean().recoverByBytes(datagram.leHeader.payload);
                OnDeviceInfoListener onDeviceInfoListener = this.onDeviceInfoListener;
                if (onDeviceInfoListener != null && deviceValueBeanRecoverByBytes != null) {
                    onDeviceInfoListener.onDeviceInfo(deviceValueBeanRecoverByBytes.btVersion, deviceValueBeanRecoverByBytes.ispVersion, deviceValueBeanRecoverByBytes.deviceVersion);
                    C2473f.m4168e(TAG, "版本号::" + deviceValueBeanRecoverByBytes.deviceVersion + "::" + deviceValueBeanRecoverByBytes.btVersion + "::" + deviceValueBeanRecoverByBytes.ispVersion);
                    break;
                }
                break;
            case 97:
                DirectionValueBean directionValueBeanRecoverByBytes = new DirectionValueBean().recoverByBytes(datagram.leHeader.payload);
                OnDirectionListener onDirectionListener = this.onDirectionListener;
                if (onDirectionListener != null && directionValueBeanRecoverByBytes != null) {
                    onDirectionListener.onDirection(directionValueBeanRecoverByBytes.direction);
                    break;
                }
                break;
            case 100:
                CustomerCmdBean customerCmdBeanRecoverByBytes = new CustomerCmdBean().recoverByBytes(datagram.leHeader.payload);
                if (customerCmdBeanRecoverByBytes != null && (onCustomerListener = this.onCustomerListener) != null) {
                    onCustomerListener.onCustomer(customerCmdBeanRecoverByBytes.customer, customerCmdBeanRecoverByBytes.project);
                    C2473f.m4168e(TAG, "收到客户PID和VID:" + customerCmdBeanRecoverByBytes.customer + "-" + customerCmdBeanRecoverByBytes.project);
                    break;
                }
                break;
            case 105:
                VolumeValueBean volumeValueBeanRecoverByBytes = new VolumeValueBean().recoverByBytes(datagram.leHeader.payload);
                if (volumeValueBeanRecoverByBytes != null && (onVolumeListener = this.onVolumeListener) != null) {
                    onVolumeListener.onVolume(volumeValueBeanRecoverByBytes.systemVolume, volumeValueBeanRecoverByBytes.mediaVolume, volumeValueBeanRecoverByBytes.callVolume);
                    break;
                }
                break;
            case 113:
                VoiceAssistantBean voiceAssistantBeanRecoverByBytes = new VoiceAssistantBean().recoverByBytes(datagram.leHeader.payload);
                if (voiceAssistantBeanRecoverByBytes != null && this.onVoiceAssistantStatusListener != null) {
                    C2473f.m4168e(TAG, "收到语音禁用状态:" + voiceAssistantBeanRecoverByBytes.isLocalOfflineSpeech + "::" + voiceAssistantBeanRecoverByBytes.isAiWakeUp);
                    this.onVoiceAssistantStatusListener.onVoiceAssistantDisable(voiceAssistantBeanRecoverByBytes.isLocalOfflineSpeech, voiceAssistantBeanRecoverByBytes.isAiWakeUp);
                    break;
                }
                break;
            case 149:
                SupportFunctionBean supportFunctionBeanRecoverByBytes = new SupportFunctionBean().recoverByBytes(datagram.leHeader.payload);
                if (supportFunctionBeanRecoverByBytes != null && (onSupportFunctionListener = this.onSupportFunctionListener) != null) {
                    onSupportFunctionListener.onSupport(supportFunctionBeanRecoverByBytes.supportLive, supportFunctionBeanRecoverByBytes.supportQuickVolume);
                    u77.f86972p = supportFunctionBeanRecoverByBytes.supportPhotoWatermark;
                    u77.f86973q = supportFunctionBeanRecoverByBytes.supportWearDetectionDynamic;
                    u77.f86974r = supportFunctionBeanRecoverByBytes.supportWearDetection;
                    u77.f86975s = supportFunctionBeanRecoverByBytes.supportStabilizationDynamic;
                    u77.f86976t = supportFunctionBeanRecoverByBytes.supportStabilization;
                    u77.f86979w = supportFunctionBeanRecoverByBytes.supportDynamicLanguageSwitch;
                    u77.f86980x = supportFunctionBeanRecoverByBytes.supportAiWakeWord;
                    u77.f86981y = supportFunctionBeanRecoverByBytes.supportLocalOfflineVoice;
                    u77.f86977u = supportFunctionBeanRecoverByBytes.supportScreenOrientationDynamic;
                    u77.f86978v = supportFunctionBeanRecoverByBytes.supportScreenOrientation;
                    break;
                }
                break;
            case 150:
                WifiOtaResultBean wifiOtaResultBeanRecoverByBytes = new WifiOtaResultBean().recoverByBytes(datagram.leHeader.payload);
                OnWifiOtaResultListener onWifiOtaResultListener = this.onWifiOtaResultListener;
                if (onWifiOtaResultListener != null && wifiOtaResultBeanRecoverByBytes != null) {
                    onWifiOtaResultListener.onResult(wifiOtaResultBeanRecoverByBytes.isSuccess);
                    break;
                }
                break;
            case 151:
                OnPcmDataListener onPcmDataListener4 = this.mOnPcmDataListener;
                if (onPcmDataListener4 != null) {
                    onPcmDataListener4.onPcmStart();
                }
                OnAiStartListener onAiStartListener = this.mOnAiStartListener;
                if (onAiStartListener != null) {
                    onAiStartListener.onAiStart();
                }
                break;
            case 153:
                OnPcmDataListener onPcmDataListener5 = this.mOnPcmDataListener;
                if (onPcmDataListener5 != null) {
                    onPcmDataListener5.onPcmEnd();
                }
                break;
        }
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.ModResponse
    public void onRequestSyncFileResponse(FileDatagram fileDatagram, byte[] data) {
        PhotoValueBean photoValueBeanRecoverByBytes = new PhotoValueBean().recoverByBytes(fileDatagram.fileHeader.payload);
        switch (fileDatagram.fileHeader.commandId) {
            case 151:
                this.photoBuffer.reset();
                this.handler.removeCallbacks(this.photoTimeoutRun);
                this.handler.postDelayed(this.photoTimeoutRun, AbstractC3831a.f24122V);
                break;
            case 152:
                try {
                    byte[] bArr = photoValueBeanRecoverByBytes.value;
                    ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, 4, bArr.length - 4).order(ByteOrder.LITTLE_ENDIAN);
                    byte[] bArr2 = new byte[byteBufferOrder.remaining()];
                    byteBufferOrder.get(bArr2);
                    this.photoBuffer.write(bArr2);
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
                break;
            case 153:
                this.handler.removeCallbacks(this.photoTimeoutRun);
                if (this.photoBuffer.toByteArray().length > 0) {
                    OnAiPhotoListener onAiPhotoListener = this.mOnAiPhotoListener;
                    if (onAiPhotoListener != null) {
                        onAiPhotoListener.onAiPhoto(this.photoBuffer.toByteArray());
                    }
                    this.photoBuffer.reset();
                }
                break;
        }
    }

    public void setOnAiPhotoListener(OnAiPhotoListener onAiPhotoListener) {
        this.mOnAiPhotoListener = onAiPhotoListener;
    }

    public void setOnAiStartListener(OnAiStartListener onAiStartListener) {
        this.mOnAiStartListener = onAiStartListener;
    }

    public void setOnBatterDataListener(OnBatterDataListener listener) {
        this.mOnBatterDataListener = listener;
    }

    public void setOnCustomerListener(OnCustomerListener onCustomerListener) {
        this.onCustomerListener = onCustomerListener;
    }

    public void setOnDeviceInfoListener(OnDeviceInfoListener onDeviceInfoListener) {
        this.onDeviceInfoListener = onDeviceInfoListener;
    }

    public void setOnDirectionListener(OnDirectionListener onDirectionListener) {
        this.onDirectionListener = onDirectionListener;
    }

    public void setOnGestureListener(onGestureListener onGestureListener2) {
        this.mOnGestureListener = onGestureListener2;
    }

    public void setOnIspWorkStateListenr(OnIspWorkStateListenr onIspWorkStateListenr) {
        this.onIspWorkStateListenr = onIspWorkStateListenr;
    }

    public void setOnPcmDataListener(OnPcmDataListener onPcmDataListener) {
        this.mOnPcmDataListener = onPcmDataListener;
    }

    public void setOnPlayOrStopStatusListener(OnPlayOrStopStatusListener onPlayOrStopStatusListener) {
        this.onPlayOrStopStatusListener = onPlayOrStopStatusListener;
    }

    public void setOnRecoverFactoryListener(OnRecoverFactoryListener onRecoverFactoryListener) {
        this.mOnRecoverFactoryListener = onRecoverFactoryListener;
    }

    public void setOnSupportFunctionListener(OnSupportFunctionListener onSupportFunctionListener) {
        this.onSupportFunctionListener = onSupportFunctionListener;
    }

    public void setOnTakeAudioStatusListener(OnTakeAudioStatusListener onTakeAudioStatusListener) {
        this.onTakeAudioStatusListener = onTakeAudioStatusListener;
    }

    public void setOnTakePhotoStatusListener(OnTakePhotoStatusListener onTakePhotoStatusListener) {
        this.onTakePhotoStatusListener = onTakePhotoStatusListener;
    }

    public void setOnTakeVideoStatusListener(OnTakeVideoStatusListener onTakeVideoStatusListener) {
        this.onTakeVideoStatusListener = onTakeVideoStatusListener;
    }

    public void setOnThumbnailCountListener(OnThumbnailCountListener onThumbnailCountListener) {
        this.mOnThumbnailCountListener = onThumbnailCountListener;
    }

    public void setOnVideoTimeListener(OnVideoTimeListener onVideoTimeListener) {
        this.mOnVideoTimeListener = onVideoTimeListener;
    }

    public void setOnVoiceAssistantStatusListener(OnVoiceAssistantStatusListener onVoiceAssistantStatusListener) {
        this.onVoiceAssistantStatusListener = onVoiceAssistantStatusListener;
    }

    public void setOnVolumeListener(OnVolumeListener onVolumeListener) {
        this.onVolumeListener = onVolumeListener;
    }

    public void setOnVolumeStatusListener(OnVolumeStatusListener onVolumeStatusListener) {
        this.onVolumeStatusListener = onVolumeStatusListener;
    }

    public void setOnWearListener(OnWearListener onWearListener) {
        this.onWearListener = onWearListener;
    }

    public void setOnWearStatusListener(OnWearStatusListener onWearStatusListener) {
        this.onWearStatusListener = onWearStatusListener;
    }

    public void setOnWifiDataListener(OnWifiDataListener onWifiDataListener) {
        this.mOnWifiDataListener = onWifiDataListener;
    }

    public void setOnWifiOtaResultListener(OnWifiOtaResultListener onWifiOtaResultListener) {
        this.onWifiOtaResultListener = onWifiOtaResultListener;
    }
}

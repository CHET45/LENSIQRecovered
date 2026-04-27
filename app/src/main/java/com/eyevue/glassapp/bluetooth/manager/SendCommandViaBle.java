package com.eyevue.glassapp.bluetooth.manager;

import com.blankj.utilcode.util.C2473f;
import com.eyevue.glassapp.bluetooth.HexConvert;
import com.eyevue.glassapp.bluetooth.beans.Common2Bean;
import com.eyevue.glassapp.bluetooth.beans.CommonBean;
import com.eyevue.glassapp.bluetooth.beans.IspVersionBean;
import com.eyevue.glassapp.bluetooth.protocol.Command;
import com.eyevue.glassapp.bluetooth.protocol.Datagram;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Calendar;
import java.util.List;
import org.tensorflow.lite.schema.BuiltinOptions;
import p000.jk1;

/* JADX INFO: loaded from: classes4.dex */
public class SendCommandViaBle extends FunctionCore {
    private byte[] assemble0x59CmdWithSecondTimestamp(long secondTimestamp) {
        byte[] bArr = {-85, BuiltinOptions.WhereOptions};
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(secondTimestamp);
        byte[] bArr2 = {(byte) (calendar.get(1) + jk1.f50807M2), (byte) (calendar.get(2) + 1), (byte) calendar.get(5), (byte) calendar.get(11), (byte) calendar.get(12), (byte) calendar.get(13)};
        byte[] bArr3 = {(byte) 0, (byte) 8};
        int i = 89;
        for (int i2 = 0; i2 < 6; i2++) {
            i += bArr2[i2] & 255;
        }
        byte b = (byte) (i & 255);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.put(bArr).put(bArr3).put(BuiltinOptions.QuantizeOptions).put(bArr2).put(b);
        return byteBufferAllocate.array();
    }

    private void configSendCommand(int command, int param) {
        Datagram datagram = new Datagram();
        datagram.leHeader.commandId = command;
        CommonBean commonBean = new CommonBean();
        commonBean.value = param;
        datagram.leHeader.setPayload(commonBean.convertBytes());
        sendCommand(datagram.convertLeHeaderToBytes());
    }

    private byte[] secondTimestampTo4ByteBigEndian(long secondTimestamp) {
        if (secondTimestamp <= 0) {
            secondTimestamp = System.currentTimeMillis() / 1000;
            C2473f.m4168e("TimestampCmd", "非法时间戳，使用当前系统秒级时间戳：" + secondTimestamp);
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.putInt((int) secondTimestamp);
        return byteBufferOrder.array();
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void actionSync() {
        configSendCommand(69, 0);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void appGetDevicdInfo() {
        configSendCommand(85, 0);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void appGetDeviceStatus() {
        configSendCommand(72, Command.Param.GET_DEVICE_STATUS);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void appGetThumbnailImageCount() {
        configSendCommand(64, Command.Param.THUMBNAIL_NUMBS);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void appPullHighQualityImageStatus(int type) {
        configSendCommand(151, type);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void appPullImage(int type) {
        configSendCommand(54, type);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void appPullThumbnailImageStatus(int type) {
        configSendCommand(55, type);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void cancelAiVoiceBroadcast() {
        configSendCommand(81, Command.Param.AI_VOICE_CANCEL);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void cancelVoiceRecognition() {
        configSendCommand(73, Command.Param.VOICE_RECOGNITION_CANCEL);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void controlCall(int type) {
        configSendCommand(51, type);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void controlMusic(int type) {
        configSendCommand(49, type);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void controlRecordAudio(int type) {
        configSendCommand(52, type);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void controlVolume(int type) {
        configSendCommand(50, type);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void fileDownloadFinish(int value1, int value2) {
        Datagram datagram = new Datagram();
        datagram.leHeader.commandId = 68;
        Common2Bean common2Bean = new Common2Bean();
        common2Bean.value1 = value1;
        common2Bean.value2 = value2;
        datagram.leHeader.setPayload(common2Bean.convertBytes());
        sendCommand(datagram.convertLeHeaderToBytes());
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void gestureBackSwipe(int value) {
        configSendCommand(8, value);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void gestureClick(int value) {
        configSendCommand(9, value);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void gestureDoubleClick(int value) {
        configSendCommand(16, value);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void gestureFrontSwipe(int value) {
        configSendCommand(7, value);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void gestureRecover() {
        configSendCommand(67, 0);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void gestureTripleClick(int value) {
        configSendCommand(17, value);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void getCustomer() {
        ModUtils.bleCore.sendData(new byte[]{-85, BuiltinOptions.WhereOptions, 0, 2, 100, 100});
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void getDeviceCapacity() {
        configSendCommand(22, Command.Param.DEVICE_CAPACITY);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void getDevicePower() {
        configSendCommand(23, Command.Param.BATTERY_CAPACITY);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void getSupportFunction() {
        configSendCommand(149, 0);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void getVoiceAssistantStatus() {
        configSendCommand(113, 0);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void getVolume() {
        configSendCommand(105, 0);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void getWifiInfo(int type) {
        configSendCommand(57, type);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void p2pWifiOta() {
        configSendCommand(99, Command.Param.WIFI_OTA_P2P);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void resetFactory() {
        configSendCommand(20, Command.Param.RECOVERY_FACTORY);
    }

    public void sendCommand(List<Integer> bytes) {
        ModUtils.bleCore.sendData(HexConvert.convertList2Array(bytes));
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void sendIspVersion(String version) {
        Datagram datagram = new Datagram();
        datagram.leHeader.commandId = 101;
        IspVersionBean ispVersionBean = new IspVersionBean();
        ispVersionBean.value = version;
        datagram.leHeader.setPayload(ispVersionBean.convertStringToBytes());
        sendCommand(datagram.convertLeHeaderToBytes());
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void sendVoiceData() {
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void setCameraDirection(int direction) {
        configSendCommand(97, direction);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void setCameraMode(int mode) {
        configSendCommand(80, mode);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void setCameraStyle(int value1, int value2) {
        Datagram datagram = new Datagram();
        datagram.leHeader.commandId = 53;
        Common2Bean common2Bean = new Common2Bean();
        common2Bean.value1 = value1;
        common2Bean.value2 = value2;
        datagram.leHeader.setPayload(common2Bean.convertBytes());
        sendCommand(datagram.convertLeHeaderToBytes());
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void setLedBrightness(int brightness) {
        configSendCommand(1, brightness);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void setMicrophone(int microphone) {
        configSendCommand(3, microphone);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void setOfflineLanguage(int type) {
        configSendCommand(98, type);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void setRecordDuration(int duration) {
        Datagram datagram = new Datagram();
        datagram.leHeader.commandId = 2;
        Common2Bean common2Bean = new Common2Bean();
        common2Bean.value1 = duration >> 8;
        common2Bean.value2 = duration & 255;
        datagram.leHeader.setPayload(common2Bean.convertBytes());
        sendCommand(datagram.convertLeHeaderToBytes());
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void setTime(long value) {
        ModUtils.bleCore.sendData(assemble0x59CmdWithSecondTimestamp(value));
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void setVoiceAssistantStatus(boolean mIsLocalOfflineSpeech, boolean mIsAiWakeUp) {
        byte b = !mIsLocalOfflineSpeech ? (byte) 1 : (byte) 0;
        if (!mIsAiWakeUp) {
            b = (byte) (b | 2);
        }
        configSendCommand(114, b);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void setVoiceCommand(int voiceCommand) {
        configSendCommand(6, voiceCommand);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void setVolume(int volumeType, int volume) {
        Datagram datagram = new Datagram();
        datagram.leHeader.commandId = 112;
        Common2Bean common2Bean = new Common2Bean();
        common2Bean.value1 = volumeType;
        common2Bean.value2 = volume;
        datagram.leHeader.setPayload(common2Bean.convertBytes());
        sendCommand(datagram.convertLeHeaderToBytes());
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void setWearDetect(int wearDetect) {
        configSendCommand(4, wearDetect);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void startLive(int liveType) {
        configSendCommand(103, liveType);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void startRecord() {
        configSendCommand(35, Command.Param.RECORD_VIDEO);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void startVoiceRecognition() {
        configSendCommand(87, Command.Param.VOICE_RECOGNITION_START);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void stopRecord() {
        configSendCommand(36, Command.Param.RECORD_VIDEO);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void stopVoiceRecognition() {
        configSendCommand(86, Command.Param.VOICE_RECOGNITION_STOP);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void switchMusic(int type) {
        configSendCommand(48, type);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.FunctionCore
    public void takePhoto(int style) {
        configSendCommand(34, style);
    }
}

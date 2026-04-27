package com.eyevue.glassapp.bluetooth.manager;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FunctionCore {
    public abstract void actionSync();

    public abstract void appGetDevicdInfo();

    public abstract void appGetDeviceStatus();

    public abstract void appGetThumbnailImageCount();

    public abstract void appPullHighQualityImageStatus(int type);

    public abstract void appPullImage(int type);

    public abstract void appPullThumbnailImageStatus(int type);

    public abstract void cancelAiVoiceBroadcast();

    public abstract void cancelVoiceRecognition();

    public abstract void controlCall(int type);

    public abstract void controlMusic(int type);

    public abstract void controlRecordAudio(int type);

    public abstract void controlVolume(int type);

    public abstract void fileDownloadFinish(int value1, int value2);

    public abstract void gestureBackSwipe(int value);

    public abstract void gestureClick(int value);

    public abstract void gestureDoubleClick(int value);

    public abstract void gestureFrontSwipe(int value);

    public abstract void gestureRecover();

    public abstract void gestureTripleClick(int value);

    public abstract void getCustomer();

    public abstract void getDeviceCapacity();

    public abstract void getDevicePower();

    public abstract void getSupportFunction();

    public abstract void getVoiceAssistantStatus();

    public abstract void getVolume();

    public abstract void getWifiInfo(int type);

    public abstract void p2pWifiOta();

    public abstract void resetFactory();

    public abstract void sendIspVersion(String version);

    public abstract void sendVoiceData();

    public abstract void setCameraDirection(int direction);

    public abstract void setCameraMode(int mode);

    public abstract void setCameraStyle(int value1, int value2);

    public abstract void setLedBrightness(int brightness);

    public abstract void setMicrophone(int microphone);

    public abstract void setOfflineLanguage(int type);

    public abstract void setRecordDuration(int duration);

    public abstract void setTime(long value);

    public abstract void setVoiceAssistantStatus(boolean mIsLocalOfflineSpeech, boolean mIsAiWakeUp);

    public abstract void setVoiceCommand(int voiceCommand);

    public abstract void setVolume(int volumeType, int volume);

    public abstract void setWearDetect(int wearDetect);

    public abstract void startLive(int liveType);

    public abstract void startRecord();

    public abstract void startVoiceRecognition();

    public abstract void stopRecord();

    public abstract void stopVoiceRecognition();

    public abstract void switchMusic(int type);

    public abstract void takePhoto(int style);
}

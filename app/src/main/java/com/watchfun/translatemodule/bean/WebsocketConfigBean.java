package com.watchfun.translatemodule.bean;

import p000.k95;
import p000.st5;

/* JADX INFO: loaded from: classes6.dex */
public class WebsocketConfigBean {
    private String command;
    private boolean generateAudio;
    private int noSpeechTimeout;
    private String outputFormat;
    private int outputSampleRate;
    private String sourceLanguage;
    private String speakerId;
    private String speechProvider;
    private String startTimeId;
    private String targetLanguage;
    private int translationMode;
    private String translationProvider;
    private String ttsProvider;
    private float voiceSpeed;

    public WebsocketConfigBean(String str, String str2, String str3, int i, String str4, int i2, boolean z) {
        this.ttsProvider = "watchfun-cosy-1.0";
        this.speakerId = k95.f53083Y4;
        this.outputSampleRate = 16000;
        this.outputFormat = st5.f82815c;
        this.voiceSpeed = 1.0f;
        this.command = str;
        this.sourceLanguage = str2;
        this.targetLanguage = str3;
        this.translationMode = i;
        this.startTimeId = str4;
        this.noSpeechTimeout = i2;
        this.generateAudio = z;
    }

    public String getCommand() {
        return this.command;
    }

    public int getNoSpeechTimeout() {
        return this.noSpeechTimeout;
    }

    public int getOutputSampleRate() {
        return this.outputSampleRate;
    }

    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public String getSpeakerId() {
        return this.speakerId;
    }

    public String getSpeechProvider() {
        return this.speechProvider;
    }

    public String getStartTimeId() {
        return this.startTimeId;
    }

    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public int getTranslationMode() {
        return this.translationMode;
    }

    public String getTranslationProvider() {
        return this.translationProvider;
    }

    public String getTtsProvider() {
        return this.ttsProvider;
    }

    public float getVoiceSpeed() {
        return this.voiceSpeed;
    }

    public boolean isGenerateAudio() {
        return this.generateAudio;
    }

    public void setCommand(String str) {
        this.command = str;
    }

    public void setGenerateAudio(boolean z) {
        this.generateAudio = z;
    }

    public void setNoSpeechTimeout(int i) {
        this.noSpeechTimeout = i;
    }

    public void setOutputSampleRate(int i) {
        this.outputSampleRate = i;
    }

    public void setSourceLanguage(String str) {
        this.sourceLanguage = str;
    }

    public void setSpeakerId(String str) {
        this.speakerId = str;
    }

    public void setSpeechProvider(String str) {
        this.speechProvider = str;
    }

    public void setStartTimeId(String str) {
        this.startTimeId = str;
    }

    public void setTargetLanguage(String str) {
        this.targetLanguage = str;
    }

    public void setTranslationMode(int i) {
        this.translationMode = i;
    }

    public void setTranslationProvider(String str) {
        this.translationProvider = str;
    }

    public void setTtsProvider(String str) {
        this.ttsProvider = str;
    }

    public void setVoiceSpeed(float f) {
        this.voiceSpeed = f;
    }

    public WebsocketConfigBean(String str, String str2, String str3, int i, String str4, boolean z) {
        this.ttsProvider = "watchfun-cosy-1.0";
        this.speakerId = k95.f53083Y4;
        this.outputSampleRate = 16000;
        this.outputFormat = st5.f82815c;
        this.voiceSpeed = 1.0f;
        this.command = str;
        this.sourceLanguage = str2;
        this.targetLanguage = str3;
        this.translationMode = i;
        this.startTimeId = str4;
        this.generateAudio = z;
    }

    public WebsocketConfigBean(String str, String str2, String str3, int i, String str4, int i2) {
        this.generateAudio = true;
        this.ttsProvider = "watchfun-cosy-1.0";
        this.speakerId = k95.f53083Y4;
        this.outputSampleRate = 16000;
        this.outputFormat = st5.f82815c;
        this.voiceSpeed = 1.0f;
        this.command = str;
        this.sourceLanguage = str2;
        this.targetLanguage = str3;
        this.translationMode = i;
        this.startTimeId = str4;
        this.noSpeechTimeout = i2;
    }

    public WebsocketConfigBean(String str, String str2, String str3, int i, String str4, int i2, float f) {
        this.generateAudio = true;
        this.ttsProvider = "watchfun-cosy-1.0";
        this.speakerId = k95.f53083Y4;
        this.outputSampleRate = 16000;
        this.outputFormat = st5.f82815c;
        this.command = str;
        this.sourceLanguage = str2;
        this.targetLanguage = str3;
        this.translationMode = i;
        this.startTimeId = str4;
        this.noSpeechTimeout = i2;
        this.voiceSpeed = f;
    }
}

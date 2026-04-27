package com.watchfun.translatewebsocket.bean;

/* JADX INFO: loaded from: classes7.dex */
public class WebsocketNewConfigBean {
    private String asrProvider;
    private String command;
    private transient boolean enableFallback;
    private transient boolean enableStreamingTranslation;
    private transient boolean generateAudio;
    private transient String inputFormat;
    private transient String outputFormat;
    private String outputRate;
    private transient String outputSampleRate;
    private transient int sampleRate;
    private transient String segmentationStrategy;
    private transient long silenceTimeout;
    private String sourceLanguage;
    private String speakerId;
    private String targetLanguage;
    private long timestamp;
    private int transMode;
    private transient int transType;
    private String translationProvider;
    private String ttsProvider;

    public WebsocketNewConfigBean(String str, long j) {
        this.generateAudio = true;
        this.outputRate = "1.0";
        this.command = str;
        this.timestamp = j;
    }

    public String getCommand() {
        return this.command;
    }

    public String getOutputFormat() {
        return this.outputFormat;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public String getSegmentationStrategy() {
        return this.segmentationStrategy;
    }

    public long getSilenceTimeout() {
        return this.silenceTimeout;
    }

    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public int getTransMode() {
        return this.transMode;
    }

    public int getTransType() {
        return this.transType;
    }

    public boolean isEnableFallback() {
        return this.enableFallback;
    }

    public boolean isEnableStreamingTranslation() {
        return this.enableStreamingTranslation;
    }

    public boolean isGenerateAudio() {
        return this.generateAudio;
    }

    public void setCommand(String str) {
        this.command = str;
    }

    public void setEnableFallback(boolean z) {
        this.enableFallback = z;
    }

    public void setEnableStreamingTranslation(boolean z) {
        this.enableStreamingTranslation = z;
    }

    public void setGenerateAudio(boolean z) {
        this.generateAudio = z;
    }

    public void setOutputFormat(String str) {
        this.outputFormat = str;
    }

    public void setSampleRate(int i) {
        this.sampleRate = i;
    }

    public void setSegmentationStrategy(String str) {
        this.segmentationStrategy = str;
    }

    public void setSilenceTimeout(long j) {
        this.silenceTimeout = j;
    }

    public void setSourceLanguage(String str) {
        this.sourceLanguage = str;
    }

    public void setTargetLanguage(String str) {
        this.targetLanguage = str;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }

    public void setTransMode(int i) {
        this.transMode = i;
    }

    public void setTransType(int i) {
        this.transType = i;
    }

    public WebsocketNewConfigBean(String str, String str2, String str3, int i, long j) {
        this.generateAudio = true;
        this.outputRate = "1.0";
        this.command = str;
        this.sourceLanguage = str2;
        this.targetLanguage = str3;
        this.transMode = i;
        this.timestamp = j;
    }

    public WebsocketNewConfigBean(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, long j) {
        this.generateAudio = true;
        this.command = str;
        this.sourceLanguage = str2;
        this.targetLanguage = str3;
        this.transMode = i;
        this.outputRate = str4;
        this.speakerId = str5;
        this.asrProvider = str6;
        this.translationProvider = str7;
        this.ttsProvider = str8;
        this.timestamp = j;
    }
}

package com.watchfun.voicenotes.database;

import p000.dbd;
import p000.j35;
import p000.sr7;

/* JADX INFO: loaded from: classes7.dex */
@j35(tableName = "voicenotes")
public class VoiceNotesBean {
    private String content;
    private String createById;
    private String createTime;
    private int device;
    private long downloadPos;
    private int downloadStatus;
    private String endTime;
    private String fileCrc;
    private long fileSize;

    /* JADX INFO: renamed from: id */
    public String f26451id;
    public String language;
    private int meetingStatus;
    private int meetingType;
    private int memberNum;

    @dbd(autoGenerate = true)
    public Long mid;
    private String recordPath;
    private long recordTime;
    private String title;

    @sr7
    public VoiceNotesBean(Long l, String str, int i, int i2, int i3, long j, String str2, long j2, String str3, String str4, String str5, String str6, int i4, int i5, long j3, String str7, String str8, String str9) {
        this.mid = l;
        this.f26451id = str;
        this.meetingType = i;
        this.device = i2;
        this.downloadStatus = i3;
        this.downloadPos = j;
        this.fileCrc = str2;
        this.fileSize = j2;
        this.title = str3;
        this.content = str4;
        this.recordPath = str5;
        this.language = str6;
        this.meetingStatus = i4;
        this.memberNum = i5;
        this.recordTime = j3;
        this.createTime = str7;
        this.endTime = str8;
        this.createById = str9;
    }

    public String getContent() {
        return this.content;
    }

    public String getCreateById() {
        return this.createById;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public int getDevice() {
        return this.device;
    }

    public long getDownloadPos() {
        return this.downloadPos;
    }

    public int getDownloadStatus() {
        return this.downloadStatus;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public String getFileCrc() {
        return this.fileCrc;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public String getId() {
        return this.f26451id;
    }

    public String getLanguage() {
        return this.language;
    }

    public int getMeetingStatus() {
        return this.meetingStatus;
    }

    public int getMeetingType() {
        return this.meetingType;
    }

    public int getMemberNum() {
        return this.memberNum;
    }

    public Long getMid() {
        return this.mid;
    }

    public String getRecordPath() {
        return this.recordPath;
    }

    public long getRecordTime() {
        return this.recordTime;
    }

    public String getTitle() {
        return this.title;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setCreateById(String str) {
        this.createById = str;
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setDevice(int i) {
        this.device = i;
    }

    public void setDownloadPos(long j) {
        this.downloadPos = j;
    }

    public void setDownloadStatus(int i) {
        this.downloadStatus = i;
    }

    public void setEndTime(String str) {
        this.endTime = str;
    }

    public void setFileCrc(String str) {
        this.fileCrc = str;
    }

    public void setFileSize(long j) {
        this.fileSize = j;
    }

    public void setId(String str) {
        this.f26451id = str;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setMeetingStatus(int i) {
        this.meetingStatus = i;
    }

    public void setMeetingType(int i) {
        this.meetingType = i;
    }

    public void setMemberNum(int i) {
        this.memberNum = i;
    }

    public void setMid(Long l) {
        this.mid = l;
    }

    public void setRecordPath(String str) {
        this.recordPath = str;
    }

    public void setRecordTime(long j) {
        this.recordTime = j;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public VoiceNotesBean() {
    }
}

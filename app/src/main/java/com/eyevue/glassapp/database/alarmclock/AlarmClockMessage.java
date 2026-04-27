package com.eyevue.glassapp.database.alarmclock;

import p000.dbd;
import p000.j35;

/* JADX INFO: loaded from: classes4.dex */
@j35(tableName = "AlarmClock")
public class AlarmClockMessage {
    private String alarmDescription;
    private int alarmRepeat;
    private long alarmTime;
    private String alarmTitle;
    private long calendarId;
    private long createTime;

    /* JADX INFO: renamed from: id */
    @dbd(autoGenerate = true)
    private int f18247id;
    private boolean isOpen;
    private boolean isOutOfTime;
    private boolean isSyncCalendar;

    public String getAlarmDescription() {
        return this.alarmDescription;
    }

    public int getAlarmRepeat() {
        return this.alarmRepeat;
    }

    public long getAlarmTime() {
        return this.alarmTime;
    }

    public String getAlarmTitle() {
        return this.alarmTitle;
    }

    public long getCalendarId() {
        return this.calendarId;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public int getId() {
        return this.f18247id;
    }

    public boolean isOpen() {
        return this.isOpen;
    }

    public boolean isOutOfTime() {
        return this.isOutOfTime;
    }

    public boolean isSyncCalendar() {
        return this.isSyncCalendar;
    }

    public void setAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
    }

    public void setAlarmRepeat(int alarmRepeat) {
        this.alarmRepeat = alarmRepeat;
    }

    public void setAlarmTime(long alarmTime) {
        this.alarmTime = alarmTime;
    }

    public void setAlarmTitle(String alarmTitle) {
        this.alarmTitle = alarmTitle;
    }

    public void setCalendarId(long calendarId) {
        this.calendarId = calendarId;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public void setId(int id) {
        this.f18247id = id;
    }

    public void setOpen(boolean open) {
        this.isOpen = open;
    }

    public void setOutOfTime(boolean outOfTime) {
        this.isOutOfTime = outOfTime;
    }

    public void setSyncCalendar(boolean syncCalendar) {
        this.isSyncCalendar = syncCalendar;
    }
}

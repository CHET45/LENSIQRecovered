package com.eyevue.glassapp.database.alarmclock;

import java.util.List;
import p000.old;
import p000.p48;
import p000.we3;

/* JADX INFO: loaded from: classes4.dex */
@we3
public interface AlarmClockMessageDao {
    @old("DELETE FROM AlarmClock")
    void deleteAll();

    @old("DELETE FROM AlarmClock WHERE alarmTime = :alarmTime AND id = :id")
    void deleteSelect(int id, long alarmTime);

    @old("DELETE FROM AlarmClock WHERE createTime = :createTime")
    void deleteSelectData(long createTime);

    @old("SELECT * FROM AlarmClock WHERE alarmTime = :alarmTime AND id = :id")
    AlarmClockMessage findByResult(int id, long alarmTime);

    @old("SELECT * FROM AlarmClock WHERE alarmTime = :alarmTime")
    AlarmClockMessage findByResult(long alarmTime);

    @old("SELECT * FROM AlarmClock WHERE alarmTime = :alarmTime")
    List<AlarmClockMessage> findByResultList(long alarmTime);

    @old("SELECT * FROM AlarmClock")
    List<AlarmClockMessage> getAll();

    @old("SELECT * FROM AlarmClock ORDER BY alarmTime DESC")
    List<AlarmClockMessage> getLatestTen();

    @p48(onConflict = 1)
    void insert(AlarmClockMessage message);

    @old("UPDATE AlarmClock SET isOutOfTime = 1 , isOpen = 0 WHERE alarmTime = :alarmTime AND id = :id")
    void updateOutOfTimeByAlarmTime(int id, long alarmTime);

    @old("UPDATE AlarmClock SET alarmTime = :alarmTime, alarmDescription = :remarks, alarmRepeat = :alarmRepeat, isSyncCalendar = :isSyncCalendar, calendarId =:calendarId, isOpen = :isOpen, isOutOfTime = :isOutOfTime WHERE alarmTime = :oldAlarmTime AND id = :id")
    int updateTimeByAlarmTime(int id, long oldAlarmTime, long alarmTime, String remarks, int alarmRepeat, int isSyncCalendar, long calendarId, int isOpen, int isOutOfTime);
}

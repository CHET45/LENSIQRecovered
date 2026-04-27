package com.eyevue.glassapp.database.alarmclock;

import android.database.Cursor;
import com.eyevue.glassapp.services.AlarmReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.bb3;
import p000.bgg;
import p000.caf;
import p000.l35;
import p000.pe3;
import p000.uae;
import p000.xae;

/* JADX INFO: loaded from: classes4.dex */
public final class AlarmClockMessageDao_Impl implements AlarmClockMessageDao {
    private final uae __db;
    private final l35<AlarmClockMessage> __insertionAdapterOfAlarmClockMessage;
    private final caf __preparedStmtOfDeleteAll;
    private final caf __preparedStmtOfDeleteSelect;
    private final caf __preparedStmtOfDeleteSelectData;
    private final caf __preparedStmtOfUpdateOutOfTimeByAlarmTime;
    private final caf __preparedStmtOfUpdateTimeByAlarmTime;

    public AlarmClockMessageDao_Impl(uae __db) {
        this.__db = __db;
        this.__insertionAdapterOfAlarmClockMessage = new l35<AlarmClockMessage>(__db) { // from class: com.eyevue.glassapp.database.alarmclock.AlarmClockMessageDao_Impl.1
            @Override // p000.caf
            public String createQuery() {
                return "INSERT OR REPLACE INTO `AlarmClock` (`id`,`alarmDescription`,`alarmTitle`,`alarmTime`,`alarmRepeat`,`isSyncCalendar`,`isOutOfTime`,`isOpen`,`createTime`,`calendarId`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
            }

            @Override // p000.l35
            public void bind(bgg bggVar, AlarmClockMessage alarmClockMessage) {
                bggVar.bindLong(1, alarmClockMessage.getId());
                if (alarmClockMessage.getAlarmDescription() == null) {
                    bggVar.bindNull(2);
                } else {
                    bggVar.bindString(2, alarmClockMessage.getAlarmDescription());
                }
                if (alarmClockMessage.getAlarmTitle() == null) {
                    bggVar.bindNull(3);
                } else {
                    bggVar.bindString(3, alarmClockMessage.getAlarmTitle());
                }
                bggVar.bindLong(4, alarmClockMessage.getAlarmTime());
                bggVar.bindLong(5, alarmClockMessage.getAlarmRepeat());
                bggVar.bindLong(6, alarmClockMessage.isSyncCalendar() ? 1L : 0L);
                bggVar.bindLong(7, alarmClockMessage.isOutOfTime() ? 1L : 0L);
                bggVar.bindLong(8, alarmClockMessage.isOpen() ? 1L : 0L);
                bggVar.bindLong(9, alarmClockMessage.getCreateTime());
                bggVar.bindLong(10, alarmClockMessage.getCalendarId());
            }
        };
        this.__preparedStmtOfDeleteSelectData = new caf(__db) { // from class: com.eyevue.glassapp.database.alarmclock.AlarmClockMessageDao_Impl.2
            @Override // p000.caf
            public String createQuery() {
                return "DELETE FROM AlarmClock WHERE createTime = ?";
            }
        };
        this.__preparedStmtOfDeleteSelect = new caf(__db) { // from class: com.eyevue.glassapp.database.alarmclock.AlarmClockMessageDao_Impl.3
            @Override // p000.caf
            public String createQuery() {
                return "DELETE FROM AlarmClock WHERE alarmTime = ? AND id = ?";
            }
        };
        this.__preparedStmtOfUpdateOutOfTimeByAlarmTime = new caf(__db) { // from class: com.eyevue.glassapp.database.alarmclock.AlarmClockMessageDao_Impl.4
            @Override // p000.caf
            public String createQuery() {
                return "UPDATE AlarmClock SET isOutOfTime = 1 , isOpen = 0 WHERE alarmTime = ? AND id = ?";
            }
        };
        this.__preparedStmtOfUpdateTimeByAlarmTime = new caf(__db) { // from class: com.eyevue.glassapp.database.alarmclock.AlarmClockMessageDao_Impl.5
            @Override // p000.caf
            public String createQuery() {
                return "UPDATE AlarmClock SET alarmTime = ?, alarmDescription = ?, alarmRepeat = ?, isSyncCalendar = ?, calendarId =?, isOpen = ?, isOutOfTime = ? WHERE alarmTime = ? AND id = ?";
            }
        };
        this.__preparedStmtOfDeleteAll = new caf(__db) { // from class: com.eyevue.glassapp.database.alarmclock.AlarmClockMessageDao_Impl.6
            @Override // p000.caf
            public String createQuery() {
                return "DELETE FROM AlarmClock";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.eyevue.glassapp.database.alarmclock.AlarmClockMessageDao
    public void deleteAll() {
        this.__db.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.__preparedStmtOfDeleteAll.acquire();
        this.__db.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAll.release(bggVarAcquire);
        }
    }

    @Override // com.eyevue.glassapp.database.alarmclock.AlarmClockMessageDao
    public void deleteSelect(final int id, final long alarmTime) {
        this.__db.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.__preparedStmtOfDeleteSelect.acquire();
        bggVarAcquire.bindLong(1, alarmTime);
        bggVarAcquire.bindLong(2, id);
        this.__db.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteSelect.release(bggVarAcquire);
        }
    }

    @Override // com.eyevue.glassapp.database.alarmclock.AlarmClockMessageDao
    public void deleteSelectData(final long createTime) {
        this.__db.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.__preparedStmtOfDeleteSelectData.acquire();
        bggVarAcquire.bindLong(1, createTime);
        this.__db.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteSelectData.release(bggVarAcquire);
        }
    }

    @Override // com.eyevue.glassapp.database.alarmclock.AlarmClockMessageDao
    public AlarmClockMessage findByResult(long j) {
        xae xaeVarAcquire = xae.acquire("SELECT * FROM AlarmClock WHERE alarmTime = ?", 1);
        xaeVarAcquire.bindLong(1, j);
        this.__db.assertNotSuspendingTransaction();
        AlarmClockMessage alarmClockMessage = null;
        String string = null;
        Cursor cursorQuery = pe3.query(this.__db, xaeVarAcquire, false, null);
        try {
            int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "alarmDescription");
            int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "alarmTitle");
            int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "alarmTime");
            int columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "alarmRepeat");
            int columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "isSyncCalendar");
            int columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "isOutOfTime");
            int columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "isOpen");
            int columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, "createTime");
            int columnIndexOrThrow10 = bb3.getColumnIndexOrThrow(cursorQuery, AlarmReceiver.f18301e);
            if (cursorQuery.moveToFirst()) {
                AlarmClockMessage alarmClockMessage2 = new AlarmClockMessage();
                alarmClockMessage2.setId(cursorQuery.getInt(columnIndexOrThrow));
                alarmClockMessage2.setAlarmDescription(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                if (!cursorQuery.isNull(columnIndexOrThrow3)) {
                    string = cursorQuery.getString(columnIndexOrThrow3);
                }
                alarmClockMessage2.setAlarmTitle(string);
                alarmClockMessage2.setAlarmTime(cursorQuery.getLong(columnIndexOrThrow4));
                alarmClockMessage2.setAlarmRepeat(cursorQuery.getInt(columnIndexOrThrow5));
                alarmClockMessage2.setSyncCalendar(cursorQuery.getInt(columnIndexOrThrow6) != 0);
                alarmClockMessage2.setOutOfTime(cursorQuery.getInt(columnIndexOrThrow7) != 0);
                alarmClockMessage2.setOpen(cursorQuery.getInt(columnIndexOrThrow8) != 0);
                alarmClockMessage2.setCreateTime(cursorQuery.getLong(columnIndexOrThrow9));
                alarmClockMessage2.setCalendarId(cursorQuery.getLong(columnIndexOrThrow10));
                alarmClockMessage = alarmClockMessage2;
            }
            return alarmClockMessage;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // com.eyevue.glassapp.database.alarmclock.AlarmClockMessageDao
    public List<AlarmClockMessage> findByResultList(final long alarmTime) {
        xae xaeVarAcquire = xae.acquire("SELECT * FROM AlarmClock WHERE alarmTime = ?", 1);
        xaeVarAcquire.bindLong(1, alarmTime);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.__db, xaeVarAcquire, false, null);
        try {
            int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "alarmDescription");
            int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "alarmTitle");
            int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "alarmTime");
            int columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "alarmRepeat");
            int columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "isSyncCalendar");
            int columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "isOutOfTime");
            int columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "isOpen");
            int columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, "createTime");
            int columnIndexOrThrow10 = bb3.getColumnIndexOrThrow(cursorQuery, AlarmReceiver.f18301e);
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                AlarmClockMessage alarmClockMessage = new AlarmClockMessage();
                alarmClockMessage.setId(cursorQuery.getInt(columnIndexOrThrow));
                alarmClockMessage.setAlarmDescription(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                alarmClockMessage.setAlarmTitle(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                int i = columnIndexOrThrow;
                alarmClockMessage.setAlarmTime(cursorQuery.getLong(columnIndexOrThrow4));
                alarmClockMessage.setAlarmRepeat(cursorQuery.getInt(columnIndexOrThrow5));
                alarmClockMessage.setSyncCalendar(cursorQuery.getInt(columnIndexOrThrow6) != 0);
                alarmClockMessage.setOutOfTime(cursorQuery.getInt(columnIndexOrThrow7) != 0);
                alarmClockMessage.setOpen(cursorQuery.getInt(columnIndexOrThrow8) != 0);
                alarmClockMessage.setCreateTime(cursorQuery.getLong(columnIndexOrThrow9));
                alarmClockMessage.setCalendarId(cursorQuery.getLong(columnIndexOrThrow10));
                arrayList.add(alarmClockMessage);
                columnIndexOrThrow = i;
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // com.eyevue.glassapp.database.alarmclock.AlarmClockMessageDao
    public List<AlarmClockMessage> getAll() {
        xae xaeVarAcquire = xae.acquire("SELECT * FROM AlarmClock", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.__db, xaeVarAcquire, false, null);
        try {
            int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "alarmDescription");
            int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "alarmTitle");
            int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "alarmTime");
            int columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "alarmRepeat");
            int columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "isSyncCalendar");
            int columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "isOutOfTime");
            int columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "isOpen");
            int columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, "createTime");
            int columnIndexOrThrow10 = bb3.getColumnIndexOrThrow(cursorQuery, AlarmReceiver.f18301e);
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                AlarmClockMessage alarmClockMessage = new AlarmClockMessage();
                alarmClockMessage.setId(cursorQuery.getInt(columnIndexOrThrow));
                alarmClockMessage.setAlarmDescription(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                alarmClockMessage.setAlarmTitle(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                int i = columnIndexOrThrow;
                alarmClockMessage.setAlarmTime(cursorQuery.getLong(columnIndexOrThrow4));
                alarmClockMessage.setAlarmRepeat(cursorQuery.getInt(columnIndexOrThrow5));
                boolean z = true;
                alarmClockMessage.setSyncCalendar(cursorQuery.getInt(columnIndexOrThrow6) != 0);
                alarmClockMessage.setOutOfTime(cursorQuery.getInt(columnIndexOrThrow7) != 0);
                if (cursorQuery.getInt(columnIndexOrThrow8) == 0) {
                    z = false;
                }
                alarmClockMessage.setOpen(z);
                alarmClockMessage.setCreateTime(cursorQuery.getLong(columnIndexOrThrow9));
                alarmClockMessage.setCalendarId(cursorQuery.getLong(columnIndexOrThrow10));
                arrayList.add(alarmClockMessage);
                columnIndexOrThrow = i;
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // com.eyevue.glassapp.database.alarmclock.AlarmClockMessageDao
    public List<AlarmClockMessage> getLatestTen() {
        xae xaeVarAcquire = xae.acquire("SELECT * FROM AlarmClock ORDER BY alarmTime DESC", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.__db, xaeVarAcquire, false, null);
        try {
            int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "alarmDescription");
            int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "alarmTitle");
            int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "alarmTime");
            int columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "alarmRepeat");
            int columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "isSyncCalendar");
            int columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "isOutOfTime");
            int columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "isOpen");
            int columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, "createTime");
            int columnIndexOrThrow10 = bb3.getColumnIndexOrThrow(cursorQuery, AlarmReceiver.f18301e);
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                AlarmClockMessage alarmClockMessage = new AlarmClockMessage();
                alarmClockMessage.setId(cursorQuery.getInt(columnIndexOrThrow));
                alarmClockMessage.setAlarmDescription(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                alarmClockMessage.setAlarmTitle(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                int i = columnIndexOrThrow;
                alarmClockMessage.setAlarmTime(cursorQuery.getLong(columnIndexOrThrow4));
                alarmClockMessage.setAlarmRepeat(cursorQuery.getInt(columnIndexOrThrow5));
                boolean z = true;
                alarmClockMessage.setSyncCalendar(cursorQuery.getInt(columnIndexOrThrow6) != 0);
                alarmClockMessage.setOutOfTime(cursorQuery.getInt(columnIndexOrThrow7) != 0);
                if (cursorQuery.getInt(columnIndexOrThrow8) == 0) {
                    z = false;
                }
                alarmClockMessage.setOpen(z);
                alarmClockMessage.setCreateTime(cursorQuery.getLong(columnIndexOrThrow9));
                alarmClockMessage.setCalendarId(cursorQuery.getLong(columnIndexOrThrow10));
                arrayList.add(alarmClockMessage);
                columnIndexOrThrow = i;
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // com.eyevue.glassapp.database.alarmclock.AlarmClockMessageDao
    public void insert(final AlarmClockMessage message) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfAlarmClockMessage.insert(message);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.eyevue.glassapp.database.alarmclock.AlarmClockMessageDao
    public void updateOutOfTimeByAlarmTime(final int id, final long alarmTime) {
        this.__db.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.__preparedStmtOfUpdateOutOfTimeByAlarmTime.acquire();
        bggVarAcquire.bindLong(1, alarmTime);
        bggVarAcquire.bindLong(2, id);
        this.__db.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfUpdateOutOfTimeByAlarmTime.release(bggVarAcquire);
        }
    }

    @Override // com.eyevue.glassapp.database.alarmclock.AlarmClockMessageDao
    public int updateTimeByAlarmTime(final int id, final long oldAlarmTime, final long alarmTime, final String remarks, final int alarmRepeat, final int isSyncCalendar, final long calendarId, final int isOpen, final int isOutOfTime) {
        this.__db.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.__preparedStmtOfUpdateTimeByAlarmTime.acquire();
        bggVarAcquire.bindLong(1, alarmTime);
        if (remarks == null) {
            bggVarAcquire.bindNull(2);
        } else {
            bggVarAcquire.bindString(2, remarks);
        }
        bggVarAcquire.bindLong(3, alarmRepeat);
        bggVarAcquire.bindLong(4, isSyncCalendar);
        bggVarAcquire.bindLong(5, calendarId);
        bggVarAcquire.bindLong(6, isOpen);
        bggVarAcquire.bindLong(7, isOutOfTime);
        bggVarAcquire.bindLong(8, oldAlarmTime);
        bggVarAcquire.bindLong(9, id);
        this.__db.beginTransaction();
        try {
            int iExecuteUpdateDelete = bggVarAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfUpdateTimeByAlarmTime.release(bggVarAcquire);
        }
    }

    @Override // com.eyevue.glassapp.database.alarmclock.AlarmClockMessageDao
    public AlarmClockMessage findByResult(int i, long j) {
        xae xaeVarAcquire = xae.acquire("SELECT * FROM AlarmClock WHERE alarmTime = ? AND id = ?", 2);
        xaeVarAcquire.bindLong(1, j);
        xaeVarAcquire.bindLong(2, i);
        this.__db.assertNotSuspendingTransaction();
        AlarmClockMessage alarmClockMessage = null;
        String string = null;
        Cursor cursorQuery = pe3.query(this.__db, xaeVarAcquire, false, null);
        try {
            int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "alarmDescription");
            int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "alarmTitle");
            int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "alarmTime");
            int columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "alarmRepeat");
            int columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "isSyncCalendar");
            int columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "isOutOfTime");
            int columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "isOpen");
            int columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, "createTime");
            int columnIndexOrThrow10 = bb3.getColumnIndexOrThrow(cursorQuery, AlarmReceiver.f18301e);
            if (cursorQuery.moveToFirst()) {
                AlarmClockMessage alarmClockMessage2 = new AlarmClockMessage();
                alarmClockMessage2.setId(cursorQuery.getInt(columnIndexOrThrow));
                alarmClockMessage2.setAlarmDescription(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                if (!cursorQuery.isNull(columnIndexOrThrow3)) {
                    string = cursorQuery.getString(columnIndexOrThrow3);
                }
                alarmClockMessage2.setAlarmTitle(string);
                alarmClockMessage2.setAlarmTime(cursorQuery.getLong(columnIndexOrThrow4));
                alarmClockMessage2.setAlarmRepeat(cursorQuery.getInt(columnIndexOrThrow5));
                alarmClockMessage2.setSyncCalendar(cursorQuery.getInt(columnIndexOrThrow6) != 0);
                alarmClockMessage2.setOutOfTime(cursorQuery.getInt(columnIndexOrThrow7) != 0);
                alarmClockMessage2.setOpen(cursorQuery.getInt(columnIndexOrThrow8) != 0);
                alarmClockMessage2.setCreateTime(cursorQuery.getLong(columnIndexOrThrow9));
                alarmClockMessage2.setCalendarId(cursorQuery.getLong(columnIndexOrThrow10));
                alarmClockMessage = alarmClockMessage2;
            }
            return alarmClockMessage;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }
}

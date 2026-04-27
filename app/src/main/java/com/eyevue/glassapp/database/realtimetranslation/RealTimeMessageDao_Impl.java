package com.eyevue.glassapp.database.realtimetranslation;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.bb3;
import p000.bgg;
import p000.caf;
import p000.k35;
import p000.l35;
import p000.pe3;
import p000.uae;
import p000.xae;

/* JADX INFO: loaded from: classes4.dex */
public final class RealTimeMessageDao_Impl implements RealTimeMessageDao {
    private final uae __db;
    private final l35<RealTimeMessageTb> __insertionAdapterOfRealTimeMessageTb;
    private final caf __preparedStmtOfDeleteAll;
    private final caf __preparedStmtOfDeleteSelectData;
    private final caf __preparedStmtOfUpdateTransResultByMessageTime;
    private final caf __preparedStmtOfUpdateTransResultByResult;
    private final caf __preparedStmtOfUpdateVoicePathById;
    private final caf __preparedStmtOfUpdateVoicePathByMessageTime;
    private final k35<RealTimeMessageTb> __updateAdapterOfRealTimeMessageTb;

    public RealTimeMessageDao_Impl(uae __db) {
        this.__db = __db;
        this.__insertionAdapterOfRealTimeMessageTb = new l35<RealTimeMessageTb>(__db) { // from class: com.eyevue.glassapp.database.realtimetranslation.RealTimeMessageDao_Impl.1
            @Override // p000.caf
            public String createQuery() {
                return "INSERT OR ABORT INTO `realtimeMessageTb` (`id`,`result`,`transResult`,`type`,`multipleOptions`,`voicePath`,`voiceTime`,`messageTime`,`isPause`,`voiceName`,`isGptOrXF`,`isLangCode`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // p000.l35
            public void bind(bgg bggVar, RealTimeMessageTb realTimeMessageTb) {
                if (realTimeMessageTb.getId() == null) {
                    bggVar.bindNull(1);
                } else {
                    bggVar.bindLong(1, realTimeMessageTb.getId().intValue());
                }
                if (realTimeMessageTb.getResult() == null) {
                    bggVar.bindNull(2);
                } else {
                    bggVar.bindString(2, realTimeMessageTb.getResult());
                }
                if (realTimeMessageTb.getTransResult() == null) {
                    bggVar.bindNull(3);
                } else {
                    bggVar.bindString(3, realTimeMessageTb.getTransResult());
                }
                bggVar.bindLong(4, realTimeMessageTb.getType());
                bggVar.bindLong(5, realTimeMessageTb.getMultipleOptions());
                if (realTimeMessageTb.getVoicePath() == null) {
                    bggVar.bindNull(6);
                } else {
                    bggVar.bindString(6, realTimeMessageTb.getVoicePath());
                }
                bggVar.bindLong(7, realTimeMessageTb.getVoiceTime());
                bggVar.bindLong(8, realTimeMessageTb.getMessageTime());
                bggVar.bindLong(9, realTimeMessageTb.isPause() ? 1L : 0L);
                if (realTimeMessageTb.getVoiceName() == null) {
                    bggVar.bindNull(10);
                } else {
                    bggVar.bindString(10, realTimeMessageTb.getVoiceName());
                }
                bggVar.bindLong(11, realTimeMessageTb.getIsGptOrXF());
                if (realTimeMessageTb.getIsLangCode() == null) {
                    bggVar.bindNull(12);
                } else {
                    bggVar.bindString(12, realTimeMessageTb.getIsLangCode());
                }
            }
        };
        this.__updateAdapterOfRealTimeMessageTb = new k35<RealTimeMessageTb>(__db) { // from class: com.eyevue.glassapp.database.realtimetranslation.RealTimeMessageDao_Impl.2
            @Override // p000.k35, p000.caf
            public String createQuery() {
                return "UPDATE OR ABORT `realtimeMessageTb` SET `id` = ?,`result` = ?,`transResult` = ?,`type` = ?,`multipleOptions` = ?,`voicePath` = ?,`voiceTime` = ?,`messageTime` = ?,`isPause` = ?,`voiceName` = ?,`isGptOrXF` = ?,`isLangCode` = ? WHERE `id` = ?";
            }

            @Override // p000.k35
            public void bind(bgg bggVar, RealTimeMessageTb realTimeMessageTb) {
                if (realTimeMessageTb.getId() == null) {
                    bggVar.bindNull(1);
                } else {
                    bggVar.bindLong(1, realTimeMessageTb.getId().intValue());
                }
                if (realTimeMessageTb.getResult() == null) {
                    bggVar.bindNull(2);
                } else {
                    bggVar.bindString(2, realTimeMessageTb.getResult());
                }
                if (realTimeMessageTb.getTransResult() == null) {
                    bggVar.bindNull(3);
                } else {
                    bggVar.bindString(3, realTimeMessageTb.getTransResult());
                }
                bggVar.bindLong(4, realTimeMessageTb.getType());
                bggVar.bindLong(5, realTimeMessageTb.getMultipleOptions());
                if (realTimeMessageTb.getVoicePath() == null) {
                    bggVar.bindNull(6);
                } else {
                    bggVar.bindString(6, realTimeMessageTb.getVoicePath());
                }
                bggVar.bindLong(7, realTimeMessageTb.getVoiceTime());
                bggVar.bindLong(8, realTimeMessageTb.getMessageTime());
                bggVar.bindLong(9, realTimeMessageTb.isPause() ? 1L : 0L);
                if (realTimeMessageTb.getVoiceName() == null) {
                    bggVar.bindNull(10);
                } else {
                    bggVar.bindString(10, realTimeMessageTb.getVoiceName());
                }
                bggVar.bindLong(11, realTimeMessageTb.getIsGptOrXF());
                if (realTimeMessageTb.getIsLangCode() == null) {
                    bggVar.bindNull(12);
                } else {
                    bggVar.bindString(12, realTimeMessageTb.getIsLangCode());
                }
                if (realTimeMessageTb.getId() == null) {
                    bggVar.bindNull(13);
                } else {
                    bggVar.bindLong(13, realTimeMessageTb.getId().intValue());
                }
            }
        };
        this.__preparedStmtOfUpdateTransResultByResult = new caf(__db) { // from class: com.eyevue.glassapp.database.realtimetranslation.RealTimeMessageDao_Impl.3
            @Override // p000.caf
            public String createQuery() {
                return "UPDATE realtimeMessageTb SET transResult = ? , voiceName = ? WHERE id = ?";
            }
        };
        this.__preparedStmtOfUpdateTransResultByMessageTime = new caf(__db) { // from class: com.eyevue.glassapp.database.realtimetranslation.RealTimeMessageDao_Impl.4
            @Override // p000.caf
            public String createQuery() {
                return "UPDATE realtimeMessageTb SET transResult = ? , result = ? WHERE messageTime = ?";
            }
        };
        this.__preparedStmtOfUpdateVoicePathById = new caf(__db) { // from class: com.eyevue.glassapp.database.realtimetranslation.RealTimeMessageDao_Impl.5
            @Override // p000.caf
            public String createQuery() {
                return "UPDATE realtimeMessageTb SET voicePath = ?  WHERE id = ?";
            }
        };
        this.__preparedStmtOfUpdateVoicePathByMessageTime = new caf(__db) { // from class: com.eyevue.glassapp.database.realtimetranslation.RealTimeMessageDao_Impl.6
            @Override // p000.caf
            public String createQuery() {
                return "UPDATE realtimeMessageTb SET voicePath = ?  WHERE messageTime = ?";
            }
        };
        this.__preparedStmtOfDeleteSelectData = new caf(__db) { // from class: com.eyevue.glassapp.database.realtimetranslation.RealTimeMessageDao_Impl.7
            @Override // p000.caf
            public String createQuery() {
                return "DELETE FROM realtimeMessageTb WHERE messageTime = ?";
            }
        };
        this.__preparedStmtOfDeleteAll = new caf(__db) { // from class: com.eyevue.glassapp.database.realtimetranslation.RealTimeMessageDao_Impl.8
            @Override // p000.caf
            public String createQuery() {
                return "DELETE FROM realtimeMessageTb";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.eyevue.glassapp.database.realtimetranslation.RealTimeMessageDao
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

    @Override // com.eyevue.glassapp.database.realtimetranslation.RealTimeMessageDao
    public void deleteSelectData(final long messageTime) {
        this.__db.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.__preparedStmtOfDeleteSelectData.acquire();
        bggVarAcquire.bindLong(1, messageTime);
        this.__db.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteSelectData.release(bggVarAcquire);
        }
    }

    @Override // com.eyevue.glassapp.database.realtimetranslation.RealTimeMessageDao
    public RealTimeMessageTb findByResult(final String result, final long messageTime) {
        RealTimeMessageTb realTimeMessageTb;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM realtimeMessageTb WHERE result = ? AND messageTime = ?", 2);
        if (result == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, result);
        }
        xaeVarAcquire.bindLong(2, messageTime);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.__db, xaeVarAcquire, false, null);
        try {
            int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "result");
            int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "transResult");
            int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "type");
            int columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "multipleOptions");
            int columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "voicePath");
            int columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "voiceTime");
            int columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "messageTime");
            int columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, "isPause");
            int columnIndexOrThrow10 = bb3.getColumnIndexOrThrow(cursorQuery, "voiceName");
            int columnIndexOrThrow11 = bb3.getColumnIndexOrThrow(cursorQuery, "isGptOrXF");
            int columnIndexOrThrow12 = bb3.getColumnIndexOrThrow(cursorQuery, "isLangCode");
            if (cursorQuery.moveToFirst()) {
                realTimeMessageTb = new RealTimeMessageTb();
                realTimeMessageTb.setId(cursorQuery.isNull(columnIndexOrThrow) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow)));
                realTimeMessageTb.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                realTimeMessageTb.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                realTimeMessageTb.setType(cursorQuery.getInt(columnIndexOrThrow4));
                realTimeMessageTb.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                realTimeMessageTb.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                realTimeMessageTb.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                realTimeMessageTb.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                realTimeMessageTb.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                realTimeMessageTb.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                realTimeMessageTb.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                realTimeMessageTb.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
            } else {
                realTimeMessageTb = null;
            }
            return realTimeMessageTb;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // com.eyevue.glassapp.database.realtimetranslation.RealTimeMessageDao
    public List<RealTimeMessageTb> getAll() {
        int i;
        Integer numValueOf;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM realtimeMessageTb", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.__db, xaeVarAcquire, false, null);
        try {
            int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "result");
            int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "transResult");
            int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "type");
            int columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "multipleOptions");
            int columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "voicePath");
            int columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "voiceTime");
            int columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "messageTime");
            int columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, "isPause");
            int columnIndexOrThrow10 = bb3.getColumnIndexOrThrow(cursorQuery, "voiceName");
            int columnIndexOrThrow11 = bb3.getColumnIndexOrThrow(cursorQuery, "isGptOrXF");
            int columnIndexOrThrow12 = bb3.getColumnIndexOrThrow(cursorQuery, "isLangCode");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                RealTimeMessageTb realTimeMessageTb = new RealTimeMessageTb();
                if (cursorQuery.isNull(columnIndexOrThrow)) {
                    i = columnIndexOrThrow;
                    numValueOf = null;
                } else {
                    i = columnIndexOrThrow;
                    numValueOf = Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow));
                }
                realTimeMessageTb.setId(numValueOf);
                realTimeMessageTb.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                realTimeMessageTb.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                realTimeMessageTb.setType(cursorQuery.getInt(columnIndexOrThrow4));
                realTimeMessageTb.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                realTimeMessageTb.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                int i2 = columnIndexOrThrow2;
                int i3 = columnIndexOrThrow3;
                realTimeMessageTb.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                realTimeMessageTb.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                realTimeMessageTb.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                realTimeMessageTb.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                realTimeMessageTb.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                realTimeMessageTb.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                arrayList.add(realTimeMessageTb);
                columnIndexOrThrow2 = i2;
                columnIndexOrThrow3 = i3;
                columnIndexOrThrow = i;
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // com.eyevue.glassapp.database.realtimetranslation.RealTimeMessageDao
    public List<RealTimeMessageTb> getLatestData() {
        int i;
        Integer numValueOf;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM realtimeMessageTb ORDER BY id DESC LIMIT 50", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.__db, xaeVarAcquire, false, null);
        try {
            int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "result");
            int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "transResult");
            int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "type");
            int columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "multipleOptions");
            int columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "voicePath");
            int columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "voiceTime");
            int columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "messageTime");
            int columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, "isPause");
            int columnIndexOrThrow10 = bb3.getColumnIndexOrThrow(cursorQuery, "voiceName");
            int columnIndexOrThrow11 = bb3.getColumnIndexOrThrow(cursorQuery, "isGptOrXF");
            int columnIndexOrThrow12 = bb3.getColumnIndexOrThrow(cursorQuery, "isLangCode");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                RealTimeMessageTb realTimeMessageTb = new RealTimeMessageTb();
                if (cursorQuery.isNull(columnIndexOrThrow)) {
                    i = columnIndexOrThrow;
                    numValueOf = null;
                } else {
                    i = columnIndexOrThrow;
                    numValueOf = Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow));
                }
                realTimeMessageTb.setId(numValueOf);
                realTimeMessageTb.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                realTimeMessageTb.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                realTimeMessageTb.setType(cursorQuery.getInt(columnIndexOrThrow4));
                realTimeMessageTb.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                realTimeMessageTb.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                int i2 = columnIndexOrThrow2;
                int i3 = columnIndexOrThrow3;
                realTimeMessageTb.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                realTimeMessageTb.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                realTimeMessageTb.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                realTimeMessageTb.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                realTimeMessageTb.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                realTimeMessageTb.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                arrayList.add(realTimeMessageTb);
                columnIndexOrThrow2 = i2;
                columnIndexOrThrow3 = i3;
                columnIndexOrThrow = i;
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // com.eyevue.glassapp.database.realtimetranslation.RealTimeMessageDao
    public List<RealTimeMessageTb> getLatestOne() {
        int i;
        Integer numValueOf;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM realtimeMessageTb ORDER BY messageTime DESC LIMIT 1", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.__db, xaeVarAcquire, false, null);
        try {
            int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "result");
            int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "transResult");
            int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "type");
            int columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "multipleOptions");
            int columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "voicePath");
            int columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "voiceTime");
            int columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "messageTime");
            int columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, "isPause");
            int columnIndexOrThrow10 = bb3.getColumnIndexOrThrow(cursorQuery, "voiceName");
            int columnIndexOrThrow11 = bb3.getColumnIndexOrThrow(cursorQuery, "isGptOrXF");
            int columnIndexOrThrow12 = bb3.getColumnIndexOrThrow(cursorQuery, "isLangCode");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                RealTimeMessageTb realTimeMessageTb = new RealTimeMessageTb();
                if (cursorQuery.isNull(columnIndexOrThrow)) {
                    i = columnIndexOrThrow;
                    numValueOf = null;
                } else {
                    i = columnIndexOrThrow;
                    numValueOf = Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow));
                }
                realTimeMessageTb.setId(numValueOf);
                realTimeMessageTb.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                realTimeMessageTb.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                realTimeMessageTb.setType(cursorQuery.getInt(columnIndexOrThrow4));
                realTimeMessageTb.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                realTimeMessageTb.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                int i2 = columnIndexOrThrow2;
                int i3 = columnIndexOrThrow3;
                realTimeMessageTb.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                realTimeMessageTb.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                realTimeMessageTb.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                realTimeMessageTb.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                realTimeMessageTb.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                realTimeMessageTb.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                arrayList.add(realTimeMessageTb);
                columnIndexOrThrow2 = i2;
                columnIndexOrThrow3 = i3;
                columnIndexOrThrow = i;
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // com.eyevue.glassapp.database.realtimetranslation.RealTimeMessageDao
    public long insert(final RealTimeMessageTb message) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long jInsertAndReturnId = this.__insertionAdapterOfRealTimeMessageTb.insertAndReturnId(message);
            this.__db.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.eyevue.glassapp.database.realtimetranslation.RealTimeMessageDao
    public RealTimeMessageTb queryByTime(final long messageTime) {
        RealTimeMessageTb realTimeMessageTb;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM realtimeMessageTb WHERE messageTime = ?", 1);
        xaeVarAcquire.bindLong(1, messageTime);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.__db, xaeVarAcquire, false, null);
        try {
            int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "result");
            int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "transResult");
            int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "type");
            int columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "multipleOptions");
            int columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "voicePath");
            int columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "voiceTime");
            int columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "messageTime");
            int columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, "isPause");
            int columnIndexOrThrow10 = bb3.getColumnIndexOrThrow(cursorQuery, "voiceName");
            int columnIndexOrThrow11 = bb3.getColumnIndexOrThrow(cursorQuery, "isGptOrXF");
            int columnIndexOrThrow12 = bb3.getColumnIndexOrThrow(cursorQuery, "isLangCode");
            if (cursorQuery.moveToFirst()) {
                realTimeMessageTb = new RealTimeMessageTb();
                realTimeMessageTb.setId(cursorQuery.isNull(columnIndexOrThrow) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow)));
                realTimeMessageTb.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                realTimeMessageTb.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                realTimeMessageTb.setType(cursorQuery.getInt(columnIndexOrThrow4));
                realTimeMessageTb.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                realTimeMessageTb.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                realTimeMessageTb.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                realTimeMessageTb.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                realTimeMessageTb.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                realTimeMessageTb.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                realTimeMessageTb.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                realTimeMessageTb.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
            } else {
                realTimeMessageTb = null;
            }
            return realTimeMessageTb;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // com.eyevue.glassapp.database.realtimetranslation.RealTimeMessageDao
    public RealTimeMessageTb queryByVoicePath(final String voicePath) {
        RealTimeMessageTb realTimeMessageTb;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM realtimeMessageTb WHERE voicePath = ?", 1);
        if (voicePath == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, voicePath);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.__db, xaeVarAcquire, false, null);
        try {
            int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "result");
            int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "transResult");
            int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "type");
            int columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "multipleOptions");
            int columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "voicePath");
            int columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "voiceTime");
            int columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "messageTime");
            int columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, "isPause");
            int columnIndexOrThrow10 = bb3.getColumnIndexOrThrow(cursorQuery, "voiceName");
            int columnIndexOrThrow11 = bb3.getColumnIndexOrThrow(cursorQuery, "isGptOrXF");
            int columnIndexOrThrow12 = bb3.getColumnIndexOrThrow(cursorQuery, "isLangCode");
            if (cursorQuery.moveToFirst()) {
                realTimeMessageTb = new RealTimeMessageTb();
                realTimeMessageTb.setId(cursorQuery.isNull(columnIndexOrThrow) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow)));
                realTimeMessageTb.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                realTimeMessageTb.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                realTimeMessageTb.setType(cursorQuery.getInt(columnIndexOrThrow4));
                realTimeMessageTb.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                realTimeMessageTb.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                realTimeMessageTb.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                realTimeMessageTb.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                realTimeMessageTb.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                realTimeMessageTb.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                realTimeMessageTb.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                realTimeMessageTb.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
            } else {
                realTimeMessageTb = null;
            }
            return realTimeMessageTb;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // com.eyevue.glassapp.database.realtimetranslation.RealTimeMessageDao
    public int update(final RealTimeMessageTb transMachineMessage) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            int iHandle = this.__updateAdapterOfRealTimeMessageTb.handle(transMachineMessage);
            this.__db.setTransactionSuccessful();
            return iHandle;
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.eyevue.glassapp.database.realtimetranslation.RealTimeMessageDao
    public void updateTransResultByMessageTime(final long messageTime, final String text, final String newTransResult) {
        this.__db.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.__preparedStmtOfUpdateTransResultByMessageTime.acquire();
        if (newTransResult == null) {
            bggVarAcquire.bindNull(1);
        } else {
            bggVarAcquire.bindString(1, newTransResult);
        }
        if (text == null) {
            bggVarAcquire.bindNull(2);
        } else {
            bggVarAcquire.bindString(2, text);
        }
        bggVarAcquire.bindLong(3, messageTime);
        this.__db.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfUpdateTransResultByMessageTime.release(bggVarAcquire);
        }
    }

    @Override // com.eyevue.glassapp.database.realtimetranslation.RealTimeMessageDao
    public void updateTransResultByResult(final Integer id, final String newTransResult, final String newVoiceName) {
        this.__db.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.__preparedStmtOfUpdateTransResultByResult.acquire();
        if (newTransResult == null) {
            bggVarAcquire.bindNull(1);
        } else {
            bggVarAcquire.bindString(1, newTransResult);
        }
        if (newVoiceName == null) {
            bggVarAcquire.bindNull(2);
        } else {
            bggVarAcquire.bindString(2, newVoiceName);
        }
        if (id == null) {
            bggVarAcquire.bindNull(3);
        } else {
            bggVarAcquire.bindLong(3, id.intValue());
        }
        this.__db.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfUpdateTransResultByResult.release(bggVarAcquire);
        }
    }

    @Override // com.eyevue.glassapp.database.realtimetranslation.RealTimeMessageDao
    public void updateVoicePathById(final long id, final String voicePath) {
        this.__db.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.__preparedStmtOfUpdateVoicePathById.acquire();
        if (voicePath == null) {
            bggVarAcquire.bindNull(1);
        } else {
            bggVarAcquire.bindString(1, voicePath);
        }
        bggVarAcquire.bindLong(2, id);
        this.__db.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfUpdateVoicePathById.release(bggVarAcquire);
        }
    }

    @Override // com.eyevue.glassapp.database.realtimetranslation.RealTimeMessageDao
    public void updateVoicePathByMessageTime(final long messageTime, final String voicePath) {
        this.__db.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.__preparedStmtOfUpdateVoicePathByMessageTime.acquire();
        if (voicePath == null) {
            bggVarAcquire.bindNull(1);
        } else {
            bggVarAcquire.bindString(1, voicePath);
        }
        bggVarAcquire.bindLong(2, messageTime);
        this.__db.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfUpdateVoicePathByMessageTime.release(bggVarAcquire);
        }
    }
}

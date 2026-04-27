package com.watchfun.voicenotes.database;

import android.database.Cursor;
import com.watchfun.callvideo.base.BaseCallActivity;
import com.watchfun.voicenotes.CommonWebViewActivity;
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
import p000.xs1;

/* JADX INFO: loaded from: classes7.dex */
public final class VoiceNotesDao_Impl implements VoiceNotesDao {
    private final uae __db;
    private final k35<VoiceNotesBean> __deletionAdapterOfVoiceNotesBean;
    private final l35<VoiceNotesBean> __insertionAdapterOfVoiceNotesBean;
    private final caf __preparedStmtOfUpdateMeetingDataByRecordPath;
    private final caf __preparedStmtOfUpdateMeetingDataByRecordPath_1;
    private final k35<VoiceNotesBean> __updateAdapterOfVoiceNotesBean;

    public VoiceNotesDao_Impl(uae uaeVar) {
        this.__db = uaeVar;
        this.__insertionAdapterOfVoiceNotesBean = new l35<VoiceNotesBean>(uaeVar) { // from class: com.watchfun.voicenotes.database.VoiceNotesDao_Impl.1
            @Override // p000.caf
            public String createQuery() {
                return "INSERT OR ABORT INTO `voicenotes` (`mid`,`id`,`meetingType`,`device`,`downloadStatus`,`downloadPos`,`fileCrc`,`fileSize`,`title`,`content`,`recordPath`,`language`,`meetingStatus`,`memberNum`,`recordTime`,`createTime`,`endTime`,`createById`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // p000.l35
            public void bind(bgg bggVar, VoiceNotesBean voiceNotesBean) {
                Long l = voiceNotesBean.mid;
                if (l == null) {
                    bggVar.bindNull(1);
                } else {
                    bggVar.bindLong(1, l.longValue());
                }
                String str = voiceNotesBean.f26451id;
                if (str == null) {
                    bggVar.bindNull(2);
                } else {
                    bggVar.bindString(2, str);
                }
                bggVar.bindLong(3, voiceNotesBean.getMeetingType());
                bggVar.bindLong(4, voiceNotesBean.getDevice());
                bggVar.bindLong(5, voiceNotesBean.getDownloadStatus());
                bggVar.bindLong(6, voiceNotesBean.getDownloadPos());
                if (voiceNotesBean.getFileCrc() == null) {
                    bggVar.bindNull(7);
                } else {
                    bggVar.bindString(7, voiceNotesBean.getFileCrc());
                }
                bggVar.bindLong(8, voiceNotesBean.getFileSize());
                if (voiceNotesBean.getTitle() == null) {
                    bggVar.bindNull(9);
                } else {
                    bggVar.bindString(9, voiceNotesBean.getTitle());
                }
                if (voiceNotesBean.getContent() == null) {
                    bggVar.bindNull(10);
                } else {
                    bggVar.bindString(10, voiceNotesBean.getContent());
                }
                if (voiceNotesBean.getRecordPath() == null) {
                    bggVar.bindNull(11);
                } else {
                    bggVar.bindString(11, voiceNotesBean.getRecordPath());
                }
                String str2 = voiceNotesBean.language;
                if (str2 == null) {
                    bggVar.bindNull(12);
                } else {
                    bggVar.bindString(12, str2);
                }
                bggVar.bindLong(13, voiceNotesBean.getMeetingStatus());
                bggVar.bindLong(14, voiceNotesBean.getMemberNum());
                bggVar.bindLong(15, voiceNotesBean.getRecordTime());
                if (voiceNotesBean.getCreateTime() == null) {
                    bggVar.bindNull(16);
                } else {
                    bggVar.bindString(16, voiceNotesBean.getCreateTime());
                }
                if (voiceNotesBean.getEndTime() == null) {
                    bggVar.bindNull(17);
                } else {
                    bggVar.bindString(17, voiceNotesBean.getEndTime());
                }
                if (voiceNotesBean.getCreateById() == null) {
                    bggVar.bindNull(18);
                } else {
                    bggVar.bindString(18, voiceNotesBean.getCreateById());
                }
            }
        };
        this.__deletionAdapterOfVoiceNotesBean = new k35<VoiceNotesBean>(uaeVar) { // from class: com.watchfun.voicenotes.database.VoiceNotesDao_Impl.2
            @Override // p000.k35, p000.caf
            public String createQuery() {
                return "DELETE FROM `voicenotes` WHERE `mid` = ?";
            }

            @Override // p000.k35
            public void bind(bgg bggVar, VoiceNotesBean voiceNotesBean) {
                Long l = voiceNotesBean.mid;
                if (l == null) {
                    bggVar.bindNull(1);
                } else {
                    bggVar.bindLong(1, l.longValue());
                }
            }
        };
        this.__updateAdapterOfVoiceNotesBean = new k35<VoiceNotesBean>(uaeVar) { // from class: com.watchfun.voicenotes.database.VoiceNotesDao_Impl.3
            @Override // p000.k35, p000.caf
            public String createQuery() {
                return "UPDATE OR ABORT `voicenotes` SET `mid` = ?,`id` = ?,`meetingType` = ?,`device` = ?,`downloadStatus` = ?,`downloadPos` = ?,`fileCrc` = ?,`fileSize` = ?,`title` = ?,`content` = ?,`recordPath` = ?,`language` = ?,`meetingStatus` = ?,`memberNum` = ?,`recordTime` = ?,`createTime` = ?,`endTime` = ?,`createById` = ? WHERE `mid` = ?";
            }

            @Override // p000.k35
            public void bind(bgg bggVar, VoiceNotesBean voiceNotesBean) {
                Long l = voiceNotesBean.mid;
                if (l == null) {
                    bggVar.bindNull(1);
                } else {
                    bggVar.bindLong(1, l.longValue());
                }
                String str = voiceNotesBean.f26451id;
                if (str == null) {
                    bggVar.bindNull(2);
                } else {
                    bggVar.bindString(2, str);
                }
                bggVar.bindLong(3, voiceNotesBean.getMeetingType());
                bggVar.bindLong(4, voiceNotesBean.getDevice());
                bggVar.bindLong(5, voiceNotesBean.getDownloadStatus());
                bggVar.bindLong(6, voiceNotesBean.getDownloadPos());
                if (voiceNotesBean.getFileCrc() == null) {
                    bggVar.bindNull(7);
                } else {
                    bggVar.bindString(7, voiceNotesBean.getFileCrc());
                }
                bggVar.bindLong(8, voiceNotesBean.getFileSize());
                if (voiceNotesBean.getTitle() == null) {
                    bggVar.bindNull(9);
                } else {
                    bggVar.bindString(9, voiceNotesBean.getTitle());
                }
                if (voiceNotesBean.getContent() == null) {
                    bggVar.bindNull(10);
                } else {
                    bggVar.bindString(10, voiceNotesBean.getContent());
                }
                if (voiceNotesBean.getRecordPath() == null) {
                    bggVar.bindNull(11);
                } else {
                    bggVar.bindString(11, voiceNotesBean.getRecordPath());
                }
                String str2 = voiceNotesBean.language;
                if (str2 == null) {
                    bggVar.bindNull(12);
                } else {
                    bggVar.bindString(12, str2);
                }
                bggVar.bindLong(13, voiceNotesBean.getMeetingStatus());
                bggVar.bindLong(14, voiceNotesBean.getMemberNum());
                bggVar.bindLong(15, voiceNotesBean.getRecordTime());
                if (voiceNotesBean.getCreateTime() == null) {
                    bggVar.bindNull(16);
                } else {
                    bggVar.bindString(16, voiceNotesBean.getCreateTime());
                }
                if (voiceNotesBean.getEndTime() == null) {
                    bggVar.bindNull(17);
                } else {
                    bggVar.bindString(17, voiceNotesBean.getEndTime());
                }
                if (voiceNotesBean.getCreateById() == null) {
                    bggVar.bindNull(18);
                } else {
                    bggVar.bindString(18, voiceNotesBean.getCreateById());
                }
                Long l2 = voiceNotesBean.mid;
                if (l2 == null) {
                    bggVar.bindNull(19);
                } else {
                    bggVar.bindLong(19, l2.longValue());
                }
            }
        };
        this.__preparedStmtOfUpdateMeetingDataByRecordPath = new caf(uaeVar) { // from class: com.watchfun.voicenotes.database.VoiceNotesDao_Impl.4
            @Override // p000.caf
            public String createQuery() {
                return "UPDATE voicenotes SET id = ?  WHERE recordPath = ? AND createTime=?";
            }
        };
        this.__preparedStmtOfUpdateMeetingDataByRecordPath_1 = new caf(uaeVar) { // from class: com.watchfun.voicenotes.database.VoiceNotesDao_Impl.5
            @Override // p000.caf
            public String createQuery() {
                return "UPDATE voicenotes SET recordTime = ? ,recordPath = ?  WHERE recordPath = ? AND createTime=?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.watchfun.voicenotes.database.VoiceNotesDao
    public void deleteMeetInfo(VoiceNotesBean voiceNotesBean) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfVoiceNotesBean.handle(voiceNotesBean);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.watchfun.voicenotes.database.VoiceNotesDao
    public VoiceNotesBean findById(String str) throws Throwable {
        xae xaeVar;
        VoiceNotesBean voiceNotesBean;
        int i;
        String str2;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM voicenotes WHERE id = ?", 1);
        if (str == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.__db, xaeVarAcquire, false, null);
        try {
            int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "mid");
            int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "meetingType");
            int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, xs1.f99118w);
            int columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "downloadStatus");
            int columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "downloadPos");
            int columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "fileCrc");
            int columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "fileSize");
            int columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, CommonWebViewActivity.f26185L);
            int columnIndexOrThrow10 = bb3.getColumnIndexOrThrow(cursorQuery, "content");
            int columnIndexOrThrow11 = bb3.getColumnIndexOrThrow(cursorQuery, "recordPath");
            int columnIndexOrThrow12 = bb3.getColumnIndexOrThrow(cursorQuery, BaseCallActivity.f25142j2);
            int columnIndexOrThrow13 = bb3.getColumnIndexOrThrow(cursorQuery, "meetingStatus");
            int columnIndexOrThrow14 = bb3.getColumnIndexOrThrow(cursorQuery, "memberNum");
            xaeVar = xaeVarAcquire;
            try {
                int columnIndexOrThrow15 = bb3.getColumnIndexOrThrow(cursorQuery, "recordTime");
                int columnIndexOrThrow16 = bb3.getColumnIndexOrThrow(cursorQuery, "createTime");
                int columnIndexOrThrow17 = bb3.getColumnIndexOrThrow(cursorQuery, "endTime");
                int columnIndexOrThrow18 = bb3.getColumnIndexOrThrow(cursorQuery, "createById");
                if (cursorQuery.moveToFirst()) {
                    VoiceNotesBean voiceNotesBean2 = new VoiceNotesBean();
                    if (cursorQuery.isNull(columnIndexOrThrow)) {
                        i = columnIndexOrThrow14;
                        voiceNotesBean2.mid = null;
                    } else {
                        i = columnIndexOrThrow14;
                        voiceNotesBean2.mid = Long.valueOf(cursorQuery.getLong(columnIndexOrThrow));
                    }
                    if (cursorQuery.isNull(columnIndexOrThrow2)) {
                        voiceNotesBean2.f26451id = null;
                    } else {
                        voiceNotesBean2.f26451id = cursorQuery.getString(columnIndexOrThrow2);
                    }
                    voiceNotesBean2.setMeetingType(cursorQuery.getInt(columnIndexOrThrow3));
                    voiceNotesBean2.setDevice(cursorQuery.getInt(columnIndexOrThrow4));
                    voiceNotesBean2.setDownloadStatus(cursorQuery.getInt(columnIndexOrThrow5));
                    voiceNotesBean2.setDownloadPos(cursorQuery.getLong(columnIndexOrThrow6));
                    voiceNotesBean2.setFileCrc(cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7));
                    voiceNotesBean2.setFileSize(cursorQuery.getLong(columnIndexOrThrow8));
                    voiceNotesBean2.setTitle(cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9));
                    voiceNotesBean2.setContent(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                    voiceNotesBean2.setRecordPath(cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11));
                    if (cursorQuery.isNull(columnIndexOrThrow12)) {
                        str2 = null;
                        voiceNotesBean2.language = null;
                    } else {
                        str2 = null;
                        voiceNotesBean2.language = cursorQuery.getString(columnIndexOrThrow12);
                    }
                    voiceNotesBean2.setMeetingStatus(cursorQuery.getInt(columnIndexOrThrow13));
                    voiceNotesBean2.setMemberNum(cursorQuery.getInt(i));
                    voiceNotesBean2.setRecordTime(cursorQuery.getLong(columnIndexOrThrow15));
                    voiceNotesBean2.setCreateTime(cursorQuery.isNull(columnIndexOrThrow16) ? str2 : cursorQuery.getString(columnIndexOrThrow16));
                    voiceNotesBean2.setEndTime(cursorQuery.isNull(columnIndexOrThrow17) ? str2 : cursorQuery.getString(columnIndexOrThrow17));
                    voiceNotesBean2.setCreateById(cursorQuery.isNull(columnIndexOrThrow18) ? str2 : cursorQuery.getString(columnIndexOrThrow18));
                    voiceNotesBean = voiceNotesBean2;
                } else {
                    voiceNotesBean = null;
                }
                cursorQuery.close();
                xaeVar.release();
                return voiceNotesBean;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                xaeVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xaeVar = xaeVarAcquire;
        }
    }

    @Override // com.watchfun.voicenotes.database.VoiceNotesDao
    public VoiceNotesBean findByMid(long j) throws Throwable {
        xae xaeVar;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        int columnIndexOrThrow14;
        VoiceNotesBean voiceNotesBean;
        int i;
        String str;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM voicenotes WHERE mid = ?", 1);
        xaeVarAcquire.bindLong(1, j);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.__db, xaeVarAcquire, false, null);
        try {
            columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "mid");
            columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "meetingType");
            columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, xs1.f99118w);
            columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "downloadStatus");
            columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "downloadPos");
            columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "fileCrc");
            columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "fileSize");
            columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, CommonWebViewActivity.f26185L);
            columnIndexOrThrow10 = bb3.getColumnIndexOrThrow(cursorQuery, "content");
            columnIndexOrThrow11 = bb3.getColumnIndexOrThrow(cursorQuery, "recordPath");
            columnIndexOrThrow12 = bb3.getColumnIndexOrThrow(cursorQuery, BaseCallActivity.f25142j2);
            columnIndexOrThrow13 = bb3.getColumnIndexOrThrow(cursorQuery, "meetingStatus");
            columnIndexOrThrow14 = bb3.getColumnIndexOrThrow(cursorQuery, "memberNum");
            xaeVar = xaeVarAcquire;
        } catch (Throwable th) {
            th = th;
            xaeVar = xaeVarAcquire;
        }
        try {
            int columnIndexOrThrow15 = bb3.getColumnIndexOrThrow(cursorQuery, "recordTime");
            int columnIndexOrThrow16 = bb3.getColumnIndexOrThrow(cursorQuery, "createTime");
            int columnIndexOrThrow17 = bb3.getColumnIndexOrThrow(cursorQuery, "endTime");
            int columnIndexOrThrow18 = bb3.getColumnIndexOrThrow(cursorQuery, "createById");
            if (cursorQuery.moveToFirst()) {
                VoiceNotesBean voiceNotesBean2 = new VoiceNotesBean();
                if (cursorQuery.isNull(columnIndexOrThrow)) {
                    i = columnIndexOrThrow14;
                    voiceNotesBean2.mid = null;
                } else {
                    i = columnIndexOrThrow14;
                    voiceNotesBean2.mid = Long.valueOf(cursorQuery.getLong(columnIndexOrThrow));
                }
                if (cursorQuery.isNull(columnIndexOrThrow2)) {
                    voiceNotesBean2.f26451id = null;
                } else {
                    voiceNotesBean2.f26451id = cursorQuery.getString(columnIndexOrThrow2);
                }
                voiceNotesBean2.setMeetingType(cursorQuery.getInt(columnIndexOrThrow3));
                voiceNotesBean2.setDevice(cursorQuery.getInt(columnIndexOrThrow4));
                voiceNotesBean2.setDownloadStatus(cursorQuery.getInt(columnIndexOrThrow5));
                voiceNotesBean2.setDownloadPos(cursorQuery.getLong(columnIndexOrThrow6));
                voiceNotesBean2.setFileCrc(cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7));
                voiceNotesBean2.setFileSize(cursorQuery.getLong(columnIndexOrThrow8));
                voiceNotesBean2.setTitle(cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9));
                voiceNotesBean2.setContent(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                voiceNotesBean2.setRecordPath(cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11));
                if (cursorQuery.isNull(columnIndexOrThrow12)) {
                    str = null;
                    voiceNotesBean2.language = null;
                } else {
                    str = null;
                    voiceNotesBean2.language = cursorQuery.getString(columnIndexOrThrow12);
                }
                voiceNotesBean2.setMeetingStatus(cursorQuery.getInt(columnIndexOrThrow13));
                voiceNotesBean2.setMemberNum(cursorQuery.getInt(i));
                voiceNotesBean2.setRecordTime(cursorQuery.getLong(columnIndexOrThrow15));
                voiceNotesBean2.setCreateTime(cursorQuery.isNull(columnIndexOrThrow16) ? str : cursorQuery.getString(columnIndexOrThrow16));
                voiceNotesBean2.setEndTime(cursorQuery.isNull(columnIndexOrThrow17) ? str : cursorQuery.getString(columnIndexOrThrow17));
                voiceNotesBean2.setCreateById(cursorQuery.isNull(columnIndexOrThrow18) ? str : cursorQuery.getString(columnIndexOrThrow18));
                voiceNotesBean = voiceNotesBean2;
            } else {
                voiceNotesBean = null;
            }
            cursorQuery.close();
            xaeVar.release();
            return voiceNotesBean;
        } catch (Throwable th2) {
            th = th2;
            cursorQuery.close();
            xaeVar.release();
            throw th;
        }
    }

    @Override // com.watchfun.voicenotes.database.VoiceNotesDao
    public List<VoiceNotesBean> getAll() throws Throwable {
        xae xaeVar;
        ArrayList arrayList;
        int i;
        String string;
        String string2;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM voicenotes", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.__db, xaeVarAcquire, false, null);
        try {
            int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "mid");
            int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "meetingType");
            int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, xs1.f99118w);
            int columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "downloadStatus");
            int columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "downloadPos");
            int columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "fileCrc");
            int columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "fileSize");
            int columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, CommonWebViewActivity.f26185L);
            int columnIndexOrThrow10 = bb3.getColumnIndexOrThrow(cursorQuery, "content");
            int columnIndexOrThrow11 = bb3.getColumnIndexOrThrow(cursorQuery, "recordPath");
            int columnIndexOrThrow12 = bb3.getColumnIndexOrThrow(cursorQuery, BaseCallActivity.f25142j2);
            int columnIndexOrThrow13 = bb3.getColumnIndexOrThrow(cursorQuery, "meetingStatus");
            int columnIndexOrThrow14 = bb3.getColumnIndexOrThrow(cursorQuery, "memberNum");
            xaeVar = xaeVarAcquire;
            try {
                int columnIndexOrThrow15 = bb3.getColumnIndexOrThrow(cursorQuery, "recordTime");
                int columnIndexOrThrow16 = bb3.getColumnIndexOrThrow(cursorQuery, "createTime");
                int columnIndexOrThrow17 = bb3.getColumnIndexOrThrow(cursorQuery, "endTime");
                int columnIndexOrThrow18 = bb3.getColumnIndexOrThrow(cursorQuery, "createById");
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList2 = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    VoiceNotesBean voiceNotesBean = new VoiceNotesBean();
                    if (cursorQuery.isNull(columnIndexOrThrow)) {
                        arrayList = arrayList2;
                        voiceNotesBean.mid = null;
                    } else {
                        arrayList = arrayList2;
                        voiceNotesBean.mid = Long.valueOf(cursorQuery.getLong(columnIndexOrThrow));
                    }
                    if (cursorQuery.isNull(columnIndexOrThrow2)) {
                        voiceNotesBean.f26451id = null;
                    } else {
                        voiceNotesBean.f26451id = cursorQuery.getString(columnIndexOrThrow2);
                    }
                    voiceNotesBean.setMeetingType(cursorQuery.getInt(columnIndexOrThrow3));
                    voiceNotesBean.setDevice(cursorQuery.getInt(columnIndexOrThrow4));
                    voiceNotesBean.setDownloadStatus(cursorQuery.getInt(columnIndexOrThrow5));
                    int i3 = columnIndexOrThrow2;
                    int i4 = columnIndexOrThrow3;
                    voiceNotesBean.setDownloadPos(cursorQuery.getLong(columnIndexOrThrow6));
                    voiceNotesBean.setFileCrc(cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7));
                    voiceNotesBean.setFileSize(cursorQuery.getLong(columnIndexOrThrow8));
                    voiceNotesBean.setTitle(cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9));
                    voiceNotesBean.setContent(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                    voiceNotesBean.setRecordPath(cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11));
                    if (cursorQuery.isNull(columnIndexOrThrow12)) {
                        voiceNotesBean.language = null;
                    } else {
                        voiceNotesBean.language = cursorQuery.getString(columnIndexOrThrow12);
                    }
                    voiceNotesBean.setMeetingStatus(cursorQuery.getInt(columnIndexOrThrow13));
                    int i5 = i2;
                    voiceNotesBean.setMemberNum(cursorQuery.getInt(i5));
                    int i6 = columnIndexOrThrow15;
                    int i7 = columnIndexOrThrow13;
                    voiceNotesBean.setRecordTime(cursorQuery.getLong(i6));
                    int i8 = columnIndexOrThrow16;
                    voiceNotesBean.setCreateTime(cursorQuery.isNull(i8) ? null : cursorQuery.getString(i8));
                    int i9 = columnIndexOrThrow17;
                    if (cursorQuery.isNull(i9)) {
                        i = columnIndexOrThrow;
                        string = null;
                    } else {
                        i = columnIndexOrThrow;
                        string = cursorQuery.getString(i9);
                    }
                    voiceNotesBean.setEndTime(string);
                    int i10 = columnIndexOrThrow18;
                    if (cursorQuery.isNull(i10)) {
                        columnIndexOrThrow18 = i10;
                        string2 = null;
                    } else {
                        columnIndexOrThrow18 = i10;
                        string2 = cursorQuery.getString(i10);
                    }
                    voiceNotesBean.setCreateById(string2);
                    ArrayList arrayList3 = arrayList;
                    arrayList3.add(voiceNotesBean);
                    columnIndexOrThrow16 = i8;
                    arrayList2 = arrayList3;
                    columnIndexOrThrow = i;
                    columnIndexOrThrow17 = i9;
                    columnIndexOrThrow13 = i7;
                    columnIndexOrThrow15 = i6;
                    columnIndexOrThrow2 = i3;
                    i2 = i5;
                    columnIndexOrThrow3 = i4;
                }
                ArrayList arrayList4 = arrayList2;
                cursorQuery.close();
                xaeVar.release();
                return arrayList4;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                xaeVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xaeVar = xaeVarAcquire;
        }
    }

    @Override // com.watchfun.voicenotes.database.VoiceNotesDao
    public void saveMeetInfo(VoiceNotesBean voiceNotesBean) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfVoiceNotesBean.insert(voiceNotesBean);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.watchfun.voicenotes.database.VoiceNotesDao
    public void updateMeetInfo(VoiceNotesBean voiceNotesBean) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfVoiceNotesBean.handle(voiceNotesBean);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.watchfun.voicenotes.database.VoiceNotesDao
    public void updateMeetingDataByRecordPath(String str, String str2, String str3) {
        this.__db.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.__preparedStmtOfUpdateMeetingDataByRecordPath.acquire();
        if (str3 == null) {
            bggVarAcquire.bindNull(1);
        } else {
            bggVarAcquire.bindString(1, str3);
        }
        if (str == null) {
            bggVarAcquire.bindNull(2);
        } else {
            bggVarAcquire.bindString(2, str);
        }
        if (str2 == null) {
            bggVarAcquire.bindNull(3);
        } else {
            bggVarAcquire.bindString(3, str2);
        }
        this.__db.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfUpdateMeetingDataByRecordPath.release(bggVarAcquire);
        }
    }

    @Override // com.watchfun.voicenotes.database.VoiceNotesDao
    public void updateMeetingDataByRecordPath(String str, String str2, long j, String str3) {
        this.__db.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.__preparedStmtOfUpdateMeetingDataByRecordPath_1.acquire();
        bggVarAcquire.bindLong(1, j);
        if (str3 == null) {
            bggVarAcquire.bindNull(2);
        } else {
            bggVarAcquire.bindString(2, str3);
        }
        if (str == null) {
            bggVarAcquire.bindNull(3);
        } else {
            bggVarAcquire.bindString(3, str);
        }
        if (str2 == null) {
            bggVarAcquire.bindNull(4);
        } else {
            bggVarAcquire.bindString(4, str2);
        }
        this.__db.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfUpdateMeetingDataByRecordPath_1.release(bggVarAcquire);
        }
    }
}

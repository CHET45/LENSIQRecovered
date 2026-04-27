package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class gbh implements fbh {

    /* JADX INFO: renamed from: a */
    public final uae f39319a;

    /* JADX INFO: renamed from: b */
    public final l35<hbh> f39320b;

    /* JADX INFO: renamed from: c */
    public final k35<hbh> f39321c;

    /* JADX INFO: renamed from: d */
    public final caf f39322d;

    /* JADX INFO: renamed from: e */
    public final caf f39323e;

    /* JADX INFO: renamed from: f */
    public final caf f39324f;

    /* JADX INFO: renamed from: g */
    public final caf f39325g;

    /* JADX INFO: renamed from: h */
    public final caf f39326h;

    /* JADX INFO: renamed from: i */
    public final caf f39327i;

    /* JADX INFO: renamed from: gbh$a */
    public class C6203a extends l35<hbh> {
        public C6203a(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "INSERT OR ABORT INTO `transMachineAiPublic` (`id`,`result`,`transResult`,`type`,`multipleOptions`,`voicePath`,`voiceTime`,`messageTime`,`isPause`,`voiceName`,`isGptOrXF`,`isLangCode`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p000.l35
        public void bind(bgg bggVar, hbh hbhVar) {
            if (hbhVar.getId() == null) {
                bggVar.bindNull(1);
            } else {
                bggVar.bindLong(1, hbhVar.getId().intValue());
            }
            if (hbhVar.getResult() == null) {
                bggVar.bindNull(2);
            } else {
                bggVar.bindString(2, hbhVar.getResult());
            }
            if (hbhVar.getTransResult() == null) {
                bggVar.bindNull(3);
            } else {
                bggVar.bindString(3, hbhVar.getTransResult());
            }
            bggVar.bindLong(4, hbhVar.getType());
            bggVar.bindLong(5, hbhVar.getMultipleOptions());
            if (hbhVar.getVoicePath() == null) {
                bggVar.bindNull(6);
            } else {
                bggVar.bindString(6, hbhVar.getVoicePath());
            }
            bggVar.bindLong(7, hbhVar.getVoiceTime());
            bggVar.bindLong(8, hbhVar.getMessageTime());
            bggVar.bindLong(9, hbhVar.isPause() ? 1L : 0L);
            if (hbhVar.getVoiceName() == null) {
                bggVar.bindNull(10);
            } else {
                bggVar.bindString(10, hbhVar.getVoiceName());
            }
            bggVar.bindLong(11, hbhVar.getIsGptOrXF());
            if (hbhVar.getIsLangCode() == null) {
                bggVar.bindNull(12);
            } else {
                bggVar.bindString(12, hbhVar.getIsLangCode());
            }
        }
    }

    /* JADX INFO: renamed from: gbh$b */
    public class C6204b extends k35<hbh> {
        public C6204b(uae database) {
            super(database);
        }

        @Override // p000.k35, p000.caf
        public String createQuery() {
            return "UPDATE OR ABORT `transMachineAiPublic` SET `id` = ?,`result` = ?,`transResult` = ?,`type` = ?,`multipleOptions` = ?,`voicePath` = ?,`voiceTime` = ?,`messageTime` = ?,`isPause` = ?,`voiceName` = ?,`isGptOrXF` = ?,`isLangCode` = ? WHERE `id` = ?";
        }

        @Override // p000.k35
        public void bind(bgg bggVar, hbh hbhVar) {
            if (hbhVar.getId() == null) {
                bggVar.bindNull(1);
            } else {
                bggVar.bindLong(1, hbhVar.getId().intValue());
            }
            if (hbhVar.getResult() == null) {
                bggVar.bindNull(2);
            } else {
                bggVar.bindString(2, hbhVar.getResult());
            }
            if (hbhVar.getTransResult() == null) {
                bggVar.bindNull(3);
            } else {
                bggVar.bindString(3, hbhVar.getTransResult());
            }
            bggVar.bindLong(4, hbhVar.getType());
            bggVar.bindLong(5, hbhVar.getMultipleOptions());
            if (hbhVar.getVoicePath() == null) {
                bggVar.bindNull(6);
            } else {
                bggVar.bindString(6, hbhVar.getVoicePath());
            }
            bggVar.bindLong(7, hbhVar.getVoiceTime());
            bggVar.bindLong(8, hbhVar.getMessageTime());
            bggVar.bindLong(9, hbhVar.isPause() ? 1L : 0L);
            if (hbhVar.getVoiceName() == null) {
                bggVar.bindNull(10);
            } else {
                bggVar.bindString(10, hbhVar.getVoiceName());
            }
            bggVar.bindLong(11, hbhVar.getIsGptOrXF());
            if (hbhVar.getIsLangCode() == null) {
                bggVar.bindNull(12);
            } else {
                bggVar.bindString(12, hbhVar.getIsLangCode());
            }
            if (hbhVar.getId() == null) {
                bggVar.bindNull(13);
            } else {
                bggVar.bindLong(13, hbhVar.getId().intValue());
            }
        }
    }

    /* JADX INFO: renamed from: gbh$c */
    public class C6205c extends caf {
        public C6205c(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "UPDATE transMachineAiPublic SET transResult = ? , voiceName = ? WHERE id = ?";
        }
    }

    /* JADX INFO: renamed from: gbh$d */
    public class C6206d extends caf {
        public C6206d(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "UPDATE transMachineAiPublic SET transResult = ? , result = ? WHERE messageTime = ?";
        }
    }

    /* JADX INFO: renamed from: gbh$e */
    public class C6207e extends caf {
        public C6207e(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "UPDATE transMachineAiPublic SET voicePath = ?  WHERE id = ?";
        }
    }

    /* JADX INFO: renamed from: gbh$f */
    public class C6208f extends caf {
        public C6208f(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "UPDATE transMachineAiPublic SET voicePath = ?  WHERE messageTime = ?";
        }
    }

    /* JADX INFO: renamed from: gbh$g */
    public class C6209g extends caf {
        public C6209g(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "DELETE FROM transMachineAiPublic WHERE messageTime = ?";
        }
    }

    /* JADX INFO: renamed from: gbh$h */
    public class C6210h extends caf {
        public C6210h(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "DELETE FROM transMachineAiPublic";
        }
    }

    public gbh(uae __db) {
        this.f39319a = __db;
        this.f39320b = new C6203a(__db);
        this.f39321c = new C6204b(__db);
        this.f39322d = new C6205c(__db);
        this.f39323e = new C6206d(__db);
        this.f39324f = new C6207e(__db);
        this.f39325g = new C6208f(__db);
        this.f39326h = new C6209g(__db);
        this.f39327i = new C6210h(__db);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // p000.fbh
    public void deleteAll() {
        this.f39319a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f39327i.acquire();
        this.f39319a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f39319a.setTransactionSuccessful();
        } finally {
            this.f39319a.endTransaction();
            this.f39327i.release(bggVarAcquire);
        }
    }

    @Override // p000.fbh
    public void deleteSelectData(final long messageTime) {
        this.f39319a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f39326h.acquire();
        bggVarAcquire.bindLong(1, messageTime);
        this.f39319a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f39319a.setTransactionSuccessful();
        } finally {
            this.f39319a.endTransaction();
            this.f39326h.release(bggVarAcquire);
        }
    }

    @Override // p000.fbh
    public hbh findByResult(final String result, final long messageTime) {
        hbh hbhVar;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM transMachineAiPublic WHERE result = ? AND messageTime = ?", 2);
        if (result == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, result);
        }
        xaeVarAcquire.bindLong(2, messageTime);
        this.f39319a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f39319a, xaeVarAcquire, false, null);
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
                hbhVar = new hbh();
                hbhVar.setId(cursorQuery.isNull(columnIndexOrThrow) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow)));
                hbhVar.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                hbhVar.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                hbhVar.setType(cursorQuery.getInt(columnIndexOrThrow4));
                hbhVar.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                hbhVar.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                hbhVar.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                hbhVar.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                hbhVar.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                hbhVar.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                hbhVar.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                hbhVar.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
            } else {
                hbhVar = null;
            }
            return hbhVar;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // p000.fbh
    public List<hbh> getAll() {
        int i;
        Integer numValueOf;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM transMachineAiPublic", 0);
        this.f39319a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f39319a, xaeVarAcquire, false, null);
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
                hbh hbhVar = new hbh();
                if (cursorQuery.isNull(columnIndexOrThrow)) {
                    i = columnIndexOrThrow;
                    numValueOf = null;
                } else {
                    i = columnIndexOrThrow;
                    numValueOf = Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow));
                }
                hbhVar.setId(numValueOf);
                hbhVar.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                hbhVar.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                hbhVar.setType(cursorQuery.getInt(columnIndexOrThrow4));
                hbhVar.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                hbhVar.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                int i2 = columnIndexOrThrow2;
                int i3 = columnIndexOrThrow3;
                hbhVar.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                hbhVar.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                hbhVar.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                hbhVar.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                hbhVar.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                hbhVar.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                arrayList.add(hbhVar);
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

    @Override // p000.fbh
    public List<hbh> getLatestData() {
        int i;
        Integer numValueOf;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM transMachineAiPublic ORDER BY id DESC LIMIT 50", 0);
        this.f39319a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f39319a, xaeVarAcquire, false, null);
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
                hbh hbhVar = new hbh();
                if (cursorQuery.isNull(columnIndexOrThrow)) {
                    i = columnIndexOrThrow;
                    numValueOf = null;
                } else {
                    i = columnIndexOrThrow;
                    numValueOf = Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow));
                }
                hbhVar.setId(numValueOf);
                hbhVar.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                hbhVar.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                hbhVar.setType(cursorQuery.getInt(columnIndexOrThrow4));
                hbhVar.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                hbhVar.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                int i2 = columnIndexOrThrow2;
                int i3 = columnIndexOrThrow3;
                hbhVar.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                hbhVar.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                hbhVar.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                hbhVar.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                hbhVar.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                hbhVar.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                arrayList.add(hbhVar);
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

    @Override // p000.fbh
    public List<hbh> getLatestOne() {
        int i;
        Integer numValueOf;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM transMachineAiPublic ORDER BY messageTime DESC LIMIT 1", 0);
        this.f39319a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f39319a, xaeVarAcquire, false, null);
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
                hbh hbhVar = new hbh();
                if (cursorQuery.isNull(columnIndexOrThrow)) {
                    i = columnIndexOrThrow;
                    numValueOf = null;
                } else {
                    i = columnIndexOrThrow;
                    numValueOf = Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow));
                }
                hbhVar.setId(numValueOf);
                hbhVar.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                hbhVar.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                hbhVar.setType(cursorQuery.getInt(columnIndexOrThrow4));
                hbhVar.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                hbhVar.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                int i2 = columnIndexOrThrow2;
                int i3 = columnIndexOrThrow3;
                hbhVar.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                hbhVar.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                hbhVar.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                hbhVar.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                hbhVar.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                hbhVar.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                arrayList.add(hbhVar);
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

    @Override // p000.fbh
    public long insert(final hbh message) {
        this.f39319a.assertNotSuspendingTransaction();
        this.f39319a.beginTransaction();
        try {
            long jInsertAndReturnId = this.f39320b.insertAndReturnId(message);
            this.f39319a.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.f39319a.endTransaction();
        }
    }

    @Override // p000.fbh
    public hbh queryByTime(final long messageTime) {
        hbh hbhVar;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM transMachineAiPublic WHERE messageTime = ?", 1);
        xaeVarAcquire.bindLong(1, messageTime);
        this.f39319a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f39319a, xaeVarAcquire, false, null);
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
                hbhVar = new hbh();
                hbhVar.setId(cursorQuery.isNull(columnIndexOrThrow) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow)));
                hbhVar.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                hbhVar.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                hbhVar.setType(cursorQuery.getInt(columnIndexOrThrow4));
                hbhVar.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                hbhVar.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                hbhVar.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                hbhVar.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                hbhVar.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                hbhVar.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                hbhVar.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                hbhVar.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
            } else {
                hbhVar = null;
            }
            return hbhVar;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // p000.fbh
    public hbh queryByVoicePath(final String voicePath) {
        hbh hbhVar;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM transMachineAiPublic WHERE voicePath = ?", 1);
        if (voicePath == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, voicePath);
        }
        this.f39319a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f39319a, xaeVarAcquire, false, null);
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
                hbhVar = new hbh();
                hbhVar.setId(cursorQuery.isNull(columnIndexOrThrow) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow)));
                hbhVar.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                hbhVar.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                hbhVar.setType(cursorQuery.getInt(columnIndexOrThrow4));
                hbhVar.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                hbhVar.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                hbhVar.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                hbhVar.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                hbhVar.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                hbhVar.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                hbhVar.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                hbhVar.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
            } else {
                hbhVar = null;
            }
            return hbhVar;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // p000.fbh
    public int update(final hbh transMachineMessage) {
        this.f39319a.assertNotSuspendingTransaction();
        this.f39319a.beginTransaction();
        try {
            int iHandle = this.f39321c.handle(transMachineMessage);
            this.f39319a.setTransactionSuccessful();
            return iHandle;
        } finally {
            this.f39319a.endTransaction();
        }
    }

    @Override // p000.fbh
    public void updateTransResultByMessageTime(final long messageTime, final String text, final String newTransResult) {
        this.f39319a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f39323e.acquire();
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
        this.f39319a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f39319a.setTransactionSuccessful();
        } finally {
            this.f39319a.endTransaction();
            this.f39323e.release(bggVarAcquire);
        }
    }

    @Override // p000.fbh
    public void updateTransResultByResult(final Integer id, final String newTransResult, final String newVoiceName) {
        this.f39319a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f39322d.acquire();
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
        this.f39319a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f39319a.setTransactionSuccessful();
        } finally {
            this.f39319a.endTransaction();
            this.f39322d.release(bggVarAcquire);
        }
    }

    @Override // p000.fbh
    public void updateVoicePathById(final long id, final String voicePath) {
        this.f39319a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f39324f.acquire();
        if (voicePath == null) {
            bggVarAcquire.bindNull(1);
        } else {
            bggVarAcquire.bindString(1, voicePath);
        }
        bggVarAcquire.bindLong(2, id);
        this.f39319a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f39319a.setTransactionSuccessful();
        } finally {
            this.f39319a.endTransaction();
            this.f39324f.release(bggVarAcquire);
        }
    }

    @Override // p000.fbh
    public void updateVoicePathByMessageTime(final long messageTime, final String voicePath) {
        this.f39319a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f39325g.acquire();
        if (voicePath == null) {
            bggVarAcquire.bindNull(1);
        } else {
            bggVarAcquire.bindString(1, voicePath);
        }
        bggVarAcquire.bindLong(2, messageTime);
        this.f39319a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f39319a.setTransactionSuccessful();
        } finally {
            this.f39319a.endTransaction();
            this.f39325g.release(bggVarAcquire);
        }
    }
}

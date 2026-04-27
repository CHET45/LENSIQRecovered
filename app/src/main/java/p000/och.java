package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class och implements nch {

    /* JADX INFO: renamed from: a */
    public final uae f67256a;

    /* JADX INFO: renamed from: b */
    public final l35<pch> f67257b;

    /* JADX INFO: renamed from: c */
    public final caf f67258c;

    /* JADX INFO: renamed from: d */
    public final caf f67259d;

    /* JADX INFO: renamed from: e */
    public final caf f67260e;

    /* JADX INFO: renamed from: f */
    public final caf f67261f;

    /* JADX INFO: renamed from: g */
    public final caf f67262g;

    /* JADX INFO: renamed from: och$a */
    public class C10311a extends l35<pch> {
        public C10311a(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "INSERT OR ABORT INTO `twoEarTransAi` (`id`,`result`,`transResult`,`type`,`multipleOptions`,`voicePath`,`voiceTime`,`messageTime`,`isPause`,`voiceName`,`isGptOrXF`,`isLangCode`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p000.l35
        public void bind(bgg bggVar, pch pchVar) {
            bggVar.bindLong(1, pchVar.getId());
            if (pchVar.getResult() == null) {
                bggVar.bindNull(2);
            } else {
                bggVar.bindString(2, pchVar.getResult());
            }
            if (pchVar.getTransResult() == null) {
                bggVar.bindNull(3);
            } else {
                bggVar.bindString(3, pchVar.getTransResult());
            }
            bggVar.bindLong(4, pchVar.getType());
            bggVar.bindLong(5, pchVar.getMultipleOptions());
            if (pchVar.getVoicePath() == null) {
                bggVar.bindNull(6);
            } else {
                bggVar.bindString(6, pchVar.getVoicePath());
            }
            bggVar.bindLong(7, pchVar.getVoiceTime());
            bggVar.bindLong(8, pchVar.getMessageTime());
            bggVar.bindLong(9, pchVar.isPause() ? 1L : 0L);
            if (pchVar.getVoiceName() == null) {
                bggVar.bindNull(10);
            } else {
                bggVar.bindString(10, pchVar.getVoiceName());
            }
            bggVar.bindLong(11, pchVar.getIsGptOrXF());
            if (pchVar.getIsLangCode() == null) {
                bggVar.bindNull(12);
            } else {
                bggVar.bindString(12, pchVar.getIsLangCode());
            }
        }
    }

    /* JADX INFO: renamed from: och$b */
    public class C10312b extends caf {
        public C10312b(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "UPDATE twoEarTransAi SET transResult = ? ,voiceName = ? WHERE id = ?";
        }
    }

    /* JADX INFO: renamed from: och$c */
    public class C10313c extends caf {
        public C10313c(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "UPDATE twoEarTransAi SET transResult = ? , result = ? WHERE messageTime = ?";
        }
    }

    /* JADX INFO: renamed from: och$d */
    public class C10314d extends caf {
        public C10314d(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "UPDATE twoEarTransAi SET voicePath = ?  WHERE id = ?";
        }
    }

    /* JADX INFO: renamed from: och$e */
    public class C10315e extends caf {
        public C10315e(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "DELETE FROM twoEarTransAi WHERE messageTime = ?";
        }
    }

    /* JADX INFO: renamed from: och$f */
    public class C10316f extends caf {
        public C10316f(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "DELETE FROM twoEarTransAi";
        }
    }

    public och(uae __db) {
        this.f67256a = __db;
        this.f67257b = new C10311a(__db);
        this.f67258c = new C10312b(__db);
        this.f67259d = new C10313c(__db);
        this.f67260e = new C10314d(__db);
        this.f67261f = new C10315e(__db);
        this.f67262g = new C10316f(__db);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // p000.nch
    public void deleteAll() {
        this.f67256a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f67262g.acquire();
        this.f67256a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f67256a.setTransactionSuccessful();
        } finally {
            this.f67256a.endTransaction();
            this.f67262g.release(bggVarAcquire);
        }
    }

    @Override // p000.nch
    public void deleteSelectData(final long messageTime) {
        this.f67256a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f67261f.acquire();
        bggVarAcquire.bindLong(1, messageTime);
        this.f67256a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f67256a.setTransactionSuccessful();
        } finally {
            this.f67256a.endTransaction();
            this.f67261f.release(bggVarAcquire);
        }
    }

    @Override // p000.nch
    public pch findByResult(final String result, final long messageTime) {
        pch pchVar;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM twoEarTransAi WHERE result = ? AND messageTime = ?", 2);
        if (result == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, result);
        }
        xaeVarAcquire.bindLong(2, messageTime);
        this.f67256a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f67256a, xaeVarAcquire, false, null);
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
                pchVar = new pch();
                pchVar.setId(cursorQuery.getInt(columnIndexOrThrow));
                pchVar.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                pchVar.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                pchVar.setType(cursorQuery.getInt(columnIndexOrThrow4));
                pchVar.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                pchVar.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                pchVar.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                pchVar.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                pchVar.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                pchVar.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                pchVar.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                pchVar.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
            } else {
                pchVar = null;
            }
            return pchVar;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // p000.nch
    public List<pch> getAll() throws Throwable {
        xae xaeVar;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM twoEarTransAi", 0);
        this.f67256a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f67256a, xaeVarAcquire, false, null);
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
                pch pchVar = new pch();
                xaeVar = xaeVarAcquire;
                try {
                    pchVar.setId(cursorQuery.getInt(columnIndexOrThrow));
                    pchVar.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    pchVar.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    pchVar.setType(cursorQuery.getInt(columnIndexOrThrow4));
                    pchVar.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                    pchVar.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                    int i = columnIndexOrThrow2;
                    int i2 = columnIndexOrThrow3;
                    pchVar.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                    pchVar.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                    pchVar.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                    pchVar.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                    pchVar.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                    pchVar.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                    arrayList.add(pchVar);
                    columnIndexOrThrow2 = i;
                    xaeVarAcquire = xaeVar;
                    columnIndexOrThrow3 = i2;
                } catch (Throwable th) {
                    th = th;
                    cursorQuery.close();
                    xaeVar.release();
                    throw th;
                }
            }
            cursorQuery.close();
            xaeVarAcquire.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            xaeVar = xaeVarAcquire;
        }
    }

    @Override // p000.nch
    public List<pch> getLatestTen() throws Throwable {
        xae xaeVar;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM twoEarTransAi ORDER BY messageTime DESC LIMIT 50", 0);
        this.f67256a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f67256a, xaeVarAcquire, false, null);
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
                pch pchVar = new pch();
                xaeVar = xaeVarAcquire;
                try {
                    pchVar.setId(cursorQuery.getInt(columnIndexOrThrow));
                    pchVar.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    pchVar.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    pchVar.setType(cursorQuery.getInt(columnIndexOrThrow4));
                    pchVar.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                    pchVar.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                    int i = columnIndexOrThrow2;
                    int i2 = columnIndexOrThrow3;
                    pchVar.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                    pchVar.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                    pchVar.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                    pchVar.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                    pchVar.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                    pchVar.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                    arrayList.add(pchVar);
                    columnIndexOrThrow2 = i;
                    xaeVarAcquire = xaeVar;
                    columnIndexOrThrow3 = i2;
                } catch (Throwable th) {
                    th = th;
                    cursorQuery.close();
                    xaeVar.release();
                    throw th;
                }
            }
            cursorQuery.close();
            xaeVarAcquire.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            xaeVar = xaeVarAcquire;
        }
    }

    @Override // p000.nch
    public void insert(final pch message) {
        this.f67256a.assertNotSuspendingTransaction();
        this.f67256a.beginTransaction();
        try {
            this.f67257b.insert(message);
            this.f67256a.setTransactionSuccessful();
        } finally {
            this.f67256a.endTransaction();
        }
    }

    @Override // p000.nch
    public void updateTransResultByMessageTime(final long messageTime, final String text, final String newTransResult) {
        this.f67256a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f67259d.acquire();
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
        this.f67256a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f67256a.setTransactionSuccessful();
        } finally {
            this.f67256a.endTransaction();
            this.f67259d.release(bggVarAcquire);
        }
    }

    @Override // p000.nch
    public void updateTransResultByResult(final Integer id, final String newTransResult, final String newVoiceName) {
        this.f67256a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f67258c.acquire();
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
        this.f67256a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f67256a.setTransactionSuccessful();
        } finally {
            this.f67256a.endTransaction();
            this.f67258c.release(bggVarAcquire);
        }
    }

    @Override // p000.nch
    public void updateVoicePathById(final long id, final String voicePath) {
        this.f67256a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f67260e.acquire();
        if (voicePath == null) {
            bggVarAcquire.bindNull(1);
        } else {
            bggVarAcquire.bindString(1, voicePath);
        }
        bggVarAcquire.bindLong(2, id);
        this.f67256a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f67256a.setTransactionSuccessful();
        } finally {
            this.f67256a.endTransaction();
            this.f67260e.release(bggVarAcquire);
        }
    }
}

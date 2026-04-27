package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class dah implements cah {

    /* JADX INFO: renamed from: a */
    public final uae f29139a;

    /* JADX INFO: renamed from: b */
    public final l35<bah> f29140b;

    /* JADX INFO: renamed from: c */
    public final caf f29141c;

    /* JADX INFO: renamed from: d */
    public final caf f29142d;

    /* JADX INFO: renamed from: e */
    public final caf f29143e;

    /* JADX INFO: renamed from: f */
    public final caf f29144f;

    /* JADX INFO: renamed from: g */
    public final caf f29145g;

    /* JADX INFO: renamed from: dah$a */
    public class C4713a extends l35<bah> {
        public C4713a(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "INSERT OR ABORT INTO `transHeadSetAi` (`id`,`result`,`transResult`,`type`,`multipleOptions`,`voicePath`,`voiceTime`,`messageTime`,`isPause`,`voiceName`,`isGptOrXF`,`isLangCode`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p000.l35
        public void bind(bgg bggVar, bah bahVar) {
            bggVar.bindLong(1, bahVar.getId());
            if (bahVar.getResult() == null) {
                bggVar.bindNull(2);
            } else {
                bggVar.bindString(2, bahVar.getResult());
            }
            if (bahVar.getTransResult() == null) {
                bggVar.bindNull(3);
            } else {
                bggVar.bindString(3, bahVar.getTransResult());
            }
            bggVar.bindLong(4, bahVar.getType());
            bggVar.bindLong(5, bahVar.getMultipleOptions());
            if (bahVar.getVoicePath() == null) {
                bggVar.bindNull(6);
            } else {
                bggVar.bindString(6, bahVar.getVoicePath());
            }
            bggVar.bindLong(7, bahVar.getVoiceTime());
            bggVar.bindLong(8, bahVar.getMessageTime());
            bggVar.bindLong(9, bahVar.isPause() ? 1L : 0L);
            if (bahVar.getVoiceName() == null) {
                bggVar.bindNull(10);
            } else {
                bggVar.bindString(10, bahVar.getVoiceName());
            }
            bggVar.bindLong(11, bahVar.getIsGptOrXF());
            if (bahVar.getIsLangCode() == null) {
                bggVar.bindNull(12);
            } else {
                bggVar.bindString(12, bahVar.getIsLangCode());
            }
        }
    }

    /* JADX INFO: renamed from: dah$b */
    public class C4714b extends caf {
        public C4714b(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "UPDATE transHeadSetAi SET transResult = ?,voiceName = ? WHERE id = ?";
        }
    }

    /* JADX INFO: renamed from: dah$c */
    public class C4715c extends caf {
        public C4715c(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "UPDATE transHeadSetAi SET transResult = ? , result = ? WHERE messageTime = ?";
        }
    }

    /* JADX INFO: renamed from: dah$d */
    public class C4716d extends caf {
        public C4716d(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "UPDATE transHeadSetAi SET voicePath = ?  WHERE id = ?";
        }
    }

    /* JADX INFO: renamed from: dah$e */
    public class C4717e extends caf {
        public C4717e(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "DELETE FROM transHeadSetAi WHERE messageTime = ?";
        }
    }

    /* JADX INFO: renamed from: dah$f */
    public class C4718f extends caf {
        public C4718f(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "DELETE FROM transHeadSetAi";
        }
    }

    public dah(uae __db) {
        this.f29139a = __db;
        this.f29140b = new C4713a(__db);
        this.f29141c = new C4714b(__db);
        this.f29142d = new C4715c(__db);
        this.f29143e = new C4716d(__db);
        this.f29144f = new C4717e(__db);
        this.f29145g = new C4718f(__db);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // p000.cah
    public void deleteAll() {
        this.f29139a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f29145g.acquire();
        this.f29139a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f29139a.setTransactionSuccessful();
        } finally {
            this.f29139a.endTransaction();
            this.f29145g.release(bggVarAcquire);
        }
    }

    @Override // p000.cah
    public void deleteSelectData(final long messageTime) {
        this.f29139a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f29144f.acquire();
        bggVarAcquire.bindLong(1, messageTime);
        this.f29139a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f29139a.setTransactionSuccessful();
        } finally {
            this.f29139a.endTransaction();
            this.f29144f.release(bggVarAcquire);
        }
    }

    @Override // p000.cah
    public bah findByResult(final String result, final long messageTime) {
        bah bahVar;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM transHeadSetAi WHERE result = ? AND messageTime = ?", 2);
        if (result == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, result);
        }
        xaeVarAcquire.bindLong(2, messageTime);
        this.f29139a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f29139a, xaeVarAcquire, false, null);
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
                bahVar = new bah();
                bahVar.setId(cursorQuery.getInt(columnIndexOrThrow));
                bahVar.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                bahVar.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                bahVar.setType(cursorQuery.getInt(columnIndexOrThrow4));
                bahVar.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                bahVar.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                bahVar.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                bahVar.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                bahVar.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                bahVar.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                bahVar.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                bahVar.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
            } else {
                bahVar = null;
            }
            return bahVar;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // p000.cah
    public List<bah> getAll() throws Throwable {
        xae xaeVar;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM transHeadSetAi", 0);
        this.f29139a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f29139a, xaeVarAcquire, false, null);
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
                bah bahVar = new bah();
                xaeVar = xaeVarAcquire;
                try {
                    bahVar.setId(cursorQuery.getInt(columnIndexOrThrow));
                    bahVar.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    bahVar.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    bahVar.setType(cursorQuery.getInt(columnIndexOrThrow4));
                    bahVar.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                    bahVar.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                    int i = columnIndexOrThrow2;
                    int i2 = columnIndexOrThrow3;
                    bahVar.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                    bahVar.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                    bahVar.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                    bahVar.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                    bahVar.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                    bahVar.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                    arrayList.add(bahVar);
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

    @Override // p000.cah
    public List<bah> getLatestTen() throws Throwable {
        xae xaeVar;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM transHeadSetAi ORDER BY messageTime DESC LIMIT 50", 0);
        this.f29139a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f29139a, xaeVarAcquire, false, null);
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
                bah bahVar = new bah();
                xaeVar = xaeVarAcquire;
                try {
                    bahVar.setId(cursorQuery.getInt(columnIndexOrThrow));
                    bahVar.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    bahVar.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    bahVar.setType(cursorQuery.getInt(columnIndexOrThrow4));
                    bahVar.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                    bahVar.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                    int i = columnIndexOrThrow2;
                    int i2 = columnIndexOrThrow3;
                    bahVar.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                    bahVar.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                    bahVar.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                    bahVar.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                    bahVar.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                    bahVar.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                    arrayList.add(bahVar);
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

    @Override // p000.cah
    public void insert(final bah message) {
        this.f29139a.assertNotSuspendingTransaction();
        this.f29139a.beginTransaction();
        try {
            this.f29140b.insert(message);
            this.f29139a.setTransactionSuccessful();
        } finally {
            this.f29139a.endTransaction();
        }
    }

    @Override // p000.cah
    public void updateTransResultByMessageTime(final long messageTime, final String text, final String newTransResult) {
        this.f29139a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f29142d.acquire();
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
        this.f29139a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f29139a.setTransactionSuccessful();
        } finally {
            this.f29139a.endTransaction();
            this.f29142d.release(bggVarAcquire);
        }
    }

    @Override // p000.cah
    public void updateTransResultByResult(final Integer id, final String newTransResult, final String newVoiceName) {
        this.f29139a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f29141c.acquire();
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
        this.f29139a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f29139a.setTransactionSuccessful();
        } finally {
            this.f29139a.endTransaction();
            this.f29141c.release(bggVarAcquire);
        }
    }

    @Override // p000.cah
    public void updateVoicePathById(final long id, final String voicePath) {
        this.f29139a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f29143e.acquire();
        if (voicePath == null) {
            bggVarAcquire.bindNull(1);
        } else {
            bggVarAcquire.bindString(1, voicePath);
        }
        bggVarAcquire.bindLong(2, id);
        this.f29139a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f29139a.setTransactionSuccessful();
        } finally {
            this.f29139a.endTransaction();
            this.f29143e.release(bggVarAcquire);
        }
    }
}

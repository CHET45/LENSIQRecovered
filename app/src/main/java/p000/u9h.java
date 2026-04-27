package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class u9h implements t9h {

    /* JADX INFO: renamed from: a */
    public final uae f87229a;

    /* JADX INFO: renamed from: b */
    public final l35<z9h> f87230b;

    /* JADX INFO: renamed from: c */
    public final caf f87231c;

    /* JADX INFO: renamed from: d */
    public final caf f87232d;

    /* JADX INFO: renamed from: e */
    public final caf f87233e;

    /* JADX INFO: renamed from: f */
    public final caf f87234f;

    /* JADX INFO: renamed from: g */
    public final caf f87235g;

    /* JADX INFO: renamed from: h */
    public final caf f87236h;

    /* JADX INFO: renamed from: u9h$a */
    public class C13418a extends l35<z9h> {
        public C13418a(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "INSERT OR ABORT INTO `transFreelyNew` (`id`,`result`,`transResult`,`type`,`multipleOptions`,`voicePath`,`voiceTime`,`messageTime`,`isPause`,`voiceName`,`isGptOrXF`,`isLangCode`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p000.l35
        public void bind(bgg bggVar, z9h z9hVar) {
            bggVar.bindLong(1, z9hVar.getId());
            if (z9hVar.getResult() == null) {
                bggVar.bindNull(2);
            } else {
                bggVar.bindString(2, z9hVar.getResult());
            }
            if (z9hVar.getTransResult() == null) {
                bggVar.bindNull(3);
            } else {
                bggVar.bindString(3, z9hVar.getTransResult());
            }
            bggVar.bindLong(4, z9hVar.getType());
            bggVar.bindLong(5, z9hVar.getMultipleOptions());
            if (z9hVar.getVoicePath() == null) {
                bggVar.bindNull(6);
            } else {
                bggVar.bindString(6, z9hVar.getVoicePath());
            }
            bggVar.bindLong(7, z9hVar.getVoiceTime());
            bggVar.bindLong(8, z9hVar.getMessageTime());
            bggVar.bindLong(9, z9hVar.isPause() ? 1L : 0L);
            if (z9hVar.getVoiceName() == null) {
                bggVar.bindNull(10);
            } else {
                bggVar.bindString(10, z9hVar.getVoiceName());
            }
            bggVar.bindLong(11, z9hVar.getIsGptOrXF());
            if (z9hVar.getIsLangCode() == null) {
                bggVar.bindNull(12);
            } else {
                bggVar.bindString(12, z9hVar.getIsLangCode());
            }
        }
    }

    /* JADX INFO: renamed from: u9h$b */
    public class C13419b extends caf {
        public C13419b(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "UPDATE transFreelyNew SET transResult = ?, voiceName = ?,voicePath= ? WHERE messageTime = ?";
        }
    }

    /* JADX INFO: renamed from: u9h$c */
    public class C13420c extends caf {
        public C13420c(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "UPDATE transFreelyNew SET transResult = ? , voiceName = ? WHERE id = ?";
        }
    }

    /* JADX INFO: renamed from: u9h$d */
    public class C13421d extends caf {
        public C13421d(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "UPDATE transFreelyNew SET transResult = ? , result = ? WHERE messageTime = ?";
        }
    }

    /* JADX INFO: renamed from: u9h$e */
    public class C13422e extends caf {
        public C13422e(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "UPDATE transFreelyNew SET voicePath = ?  WHERE id = ?";
        }
    }

    /* JADX INFO: renamed from: u9h$f */
    public class C13423f extends caf {
        public C13423f(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "DELETE FROM transFreelyNew WHERE messageTime = ?";
        }
    }

    /* JADX INFO: renamed from: u9h$g */
    public class C13424g extends caf {
        public C13424g(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "DELETE FROM transFreelyNew";
        }
    }

    public u9h(uae __db) {
        this.f87229a = __db;
        this.f87230b = new C13418a(__db);
        this.f87231c = new C13419b(__db);
        this.f87232d = new C13420c(__db);
        this.f87233e = new C13421d(__db);
        this.f87234f = new C13422e(__db);
        this.f87235g = new C13423f(__db);
        this.f87236h = new C13424g(__db);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // p000.t9h
    public void deleteAll() {
        this.f87229a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f87236h.acquire();
        this.f87229a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f87229a.setTransactionSuccessful();
        } finally {
            this.f87229a.endTransaction();
            this.f87236h.release(bggVarAcquire);
        }
    }

    @Override // p000.t9h
    public void deleteSelectData(final long messageTime) {
        this.f87229a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f87235g.acquire();
        bggVarAcquire.bindLong(1, messageTime);
        this.f87229a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f87229a.setTransactionSuccessful();
        } finally {
            this.f87229a.endTransaction();
            this.f87235g.release(bggVarAcquire);
        }
    }

    @Override // p000.t9h
    public z9h findByResult(final String result, final long messageTime) {
        z9h z9hVar;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM transFreelyNew WHERE result = ? AND messageTime = ?", 2);
        if (result == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, result);
        }
        xaeVarAcquire.bindLong(2, messageTime);
        this.f87229a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f87229a, xaeVarAcquire, false, null);
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
                z9hVar = new z9h();
                z9hVar.setId(cursorQuery.getInt(columnIndexOrThrow));
                z9hVar.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                z9hVar.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                z9hVar.setType(cursorQuery.getInt(columnIndexOrThrow4));
                z9hVar.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                z9hVar.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                z9hVar.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                z9hVar.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                z9hVar.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                z9hVar.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                z9hVar.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                z9hVar.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
            } else {
                z9hVar = null;
            }
            return z9hVar;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // p000.t9h
    public List<z9h> getAll() throws Throwable {
        xae xaeVar;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM transFreelyNew", 0);
        this.f87229a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f87229a, xaeVarAcquire, false, null);
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
                z9h z9hVar = new z9h();
                xaeVar = xaeVarAcquire;
                try {
                    z9hVar.setId(cursorQuery.getInt(columnIndexOrThrow));
                    z9hVar.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    z9hVar.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    z9hVar.setType(cursorQuery.getInt(columnIndexOrThrow4));
                    z9hVar.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                    z9hVar.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                    int i = columnIndexOrThrow2;
                    int i2 = columnIndexOrThrow3;
                    z9hVar.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                    z9hVar.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                    z9hVar.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                    z9hVar.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                    z9hVar.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                    z9hVar.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                    arrayList.add(z9hVar);
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

    @Override // p000.t9h
    public List<z9h> getLatestTen() throws Throwable {
        xae xaeVar;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM transFreelyNew ORDER BY messageTime DESC LIMIT 50", 0);
        this.f87229a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f87229a, xaeVarAcquire, false, null);
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
                z9h z9hVar = new z9h();
                xaeVar = xaeVarAcquire;
                try {
                    z9hVar.setId(cursorQuery.getInt(columnIndexOrThrow));
                    z9hVar.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    z9hVar.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    z9hVar.setType(cursorQuery.getInt(columnIndexOrThrow4));
                    z9hVar.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                    z9hVar.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                    int i = columnIndexOrThrow2;
                    int i2 = columnIndexOrThrow3;
                    z9hVar.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                    z9hVar.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                    z9hVar.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                    z9hVar.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                    z9hVar.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                    z9hVar.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                    arrayList.add(z9hVar);
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

    @Override // p000.t9h
    public void insert(final z9h message) {
        this.f87229a.assertNotSuspendingTransaction();
        this.f87229a.beginTransaction();
        try {
            this.f87230b.insert(message);
            this.f87229a.setTransactionSuccessful();
        } finally {
            this.f87229a.endTransaction();
        }
    }

    @Override // p000.t9h
    public void updateByMessageTime(final long messageTime, final String newTransResult, final String newVoiceName, final String voicePath) {
        this.f87229a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f87231c.acquire();
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
        if (voicePath == null) {
            bggVarAcquire.bindNull(3);
        } else {
            bggVarAcquire.bindString(3, voicePath);
        }
        bggVarAcquire.bindLong(4, messageTime);
        this.f87229a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f87229a.setTransactionSuccessful();
        } finally {
            this.f87229a.endTransaction();
            this.f87231c.release(bggVarAcquire);
        }
    }

    @Override // p000.t9h
    public void updateTransResultByMessageTime(final long messageTime, final String text, final String newTransResult) {
        this.f87229a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f87233e.acquire();
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
        this.f87229a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f87229a.setTransactionSuccessful();
        } finally {
            this.f87229a.endTransaction();
            this.f87233e.release(bggVarAcquire);
        }
    }

    @Override // p000.t9h
    public void updateTransResultByResult(final Integer id, final String newTransResult, final String newVoiceName) {
        this.f87229a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f87232d.acquire();
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
        this.f87229a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f87229a.setTransactionSuccessful();
        } finally {
            this.f87229a.endTransaction();
            this.f87232d.release(bggVarAcquire);
        }
    }

    @Override // p000.t9h
    public void updateVoicePathById(final long id, final String voicePath) {
        this.f87229a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f87234f.acquire();
        if (voicePath == null) {
            bggVarAcquire.bindNull(1);
        } else {
            bggVarAcquire.bindString(1, voicePath);
        }
        bggVarAcquire.bindLong(2, id);
        this.f87229a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f87229a.setTransactionSuccessful();
        } finally {
            this.f87229a.endTransaction();
            this.f87234f.release(bggVarAcquire);
        }
    }
}

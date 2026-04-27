package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class cx6 implements bx6 {

    /* JADX INFO: renamed from: a */
    public final uae f27984a;

    /* JADX INFO: renamed from: b */
    public final l35<dx6> f27985b;

    /* JADX INFO: renamed from: c */
    public final caf f27986c;

    /* JADX INFO: renamed from: d */
    public final caf f27987d;

    /* JADX INFO: renamed from: e */
    public final caf f27988e;

    /* JADX INFO: renamed from: f */
    public final caf f27989f;

    /* JADX INFO: renamed from: cx6$a */
    public class C4549a extends l35<dx6> {
        public C4549a(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "INSERT OR ABORT INTO `freedomTalkAi` (`id`,`result`,`transResult`,`type`,`multipleOptions`,`voicePath`,`voiceTime`,`messageTime`,`isPause`,`voiceName`,`isGptOrXF`,`isLangCode`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p000.l35
        public void bind(bgg bggVar, dx6 dx6Var) {
            bggVar.bindLong(1, dx6Var.getId());
            if (dx6Var.getResult() == null) {
                bggVar.bindNull(2);
            } else {
                bggVar.bindString(2, dx6Var.getResult());
            }
            if (dx6Var.getTransResult() == null) {
                bggVar.bindNull(3);
            } else {
                bggVar.bindString(3, dx6Var.getTransResult());
            }
            bggVar.bindLong(4, dx6Var.getType());
            bggVar.bindLong(5, dx6Var.getMultipleOptions());
            if (dx6Var.getVoicePath() == null) {
                bggVar.bindNull(6);
            } else {
                bggVar.bindString(6, dx6Var.getVoicePath());
            }
            bggVar.bindLong(7, dx6Var.getVoiceTime());
            bggVar.bindLong(8, dx6Var.getMessageTime());
            bggVar.bindLong(9, dx6Var.isPause() ? 1L : 0L);
            if (dx6Var.getVoiceName() == null) {
                bggVar.bindNull(10);
            } else {
                bggVar.bindString(10, dx6Var.getVoiceName());
            }
            bggVar.bindLong(11, dx6Var.getIsGptOrXF());
            if (dx6Var.getIsLangCode() == null) {
                bggVar.bindNull(12);
            } else {
                bggVar.bindString(12, dx6Var.getIsLangCode());
            }
        }
    }

    /* JADX INFO: renamed from: cx6$b */
    public class C4550b extends caf {
        public C4550b(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "UPDATE freedomTalkAi SET transResult = ? , voiceName = ? WHERE id = ?";
        }
    }

    /* JADX INFO: renamed from: cx6$c */
    public class C4551c extends caf {
        public C4551c(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "UPDATE freedomTalkAi SET voicePath = ?  WHERE id = ?";
        }
    }

    /* JADX INFO: renamed from: cx6$d */
    public class C4552d extends caf {
        public C4552d(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "DELETE FROM freedomTalkAi WHERE messageTime = ?";
        }
    }

    /* JADX INFO: renamed from: cx6$e */
    public class C4553e extends caf {
        public C4553e(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "DELETE FROM freedomTalkAi";
        }
    }

    public cx6(uae __db) {
        this.f27984a = __db;
        this.f27985b = new C4549a(__db);
        this.f27986c = new C4550b(__db);
        this.f27987d = new C4551c(__db);
        this.f27988e = new C4552d(__db);
        this.f27989f = new C4553e(__db);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // p000.bx6
    public void deleteAll() {
        this.f27984a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f27989f.acquire();
        this.f27984a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f27984a.setTransactionSuccessful();
        } finally {
            this.f27984a.endTransaction();
            this.f27989f.release(bggVarAcquire);
        }
    }

    @Override // p000.bx6
    public void deleteSelectData(final long messageTime) {
        this.f27984a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f27988e.acquire();
        bggVarAcquire.bindLong(1, messageTime);
        this.f27984a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f27984a.setTransactionSuccessful();
        } finally {
            this.f27984a.endTransaction();
            this.f27988e.release(bggVarAcquire);
        }
    }

    @Override // p000.bx6
    public dx6 findByResult(final String result, final long messageTime) {
        dx6 dx6Var;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM freedomTalkAi WHERE result = ? AND messageTime = ?", 2);
        if (result == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, result);
        }
        xaeVarAcquire.bindLong(2, messageTime);
        this.f27984a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f27984a, xaeVarAcquire, false, null);
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
                dx6Var = new dx6();
                dx6Var.setId(cursorQuery.getInt(columnIndexOrThrow));
                dx6Var.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                dx6Var.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                dx6Var.setType(cursorQuery.getInt(columnIndexOrThrow4));
                dx6Var.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                dx6Var.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                dx6Var.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                dx6Var.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                dx6Var.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                dx6Var.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                dx6Var.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                dx6Var.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
            } else {
                dx6Var = null;
            }
            return dx6Var;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // p000.bx6
    public List<dx6> getAll() throws Throwable {
        xae xaeVar;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM freedomTalkAi", 0);
        this.f27984a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f27984a, xaeVarAcquire, false, null);
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
                dx6 dx6Var = new dx6();
                xaeVar = xaeVarAcquire;
                try {
                    dx6Var.setId(cursorQuery.getInt(columnIndexOrThrow));
                    dx6Var.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    dx6Var.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    dx6Var.setType(cursorQuery.getInt(columnIndexOrThrow4));
                    dx6Var.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                    dx6Var.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                    int i = columnIndexOrThrow2;
                    int i2 = columnIndexOrThrow3;
                    dx6Var.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                    dx6Var.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                    dx6Var.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                    dx6Var.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                    dx6Var.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                    dx6Var.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                    arrayList.add(dx6Var);
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

    @Override // p000.bx6
    public List<dx6> getLatestTen() throws Throwable {
        xae xaeVar;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM freedomTalkAi ORDER BY messageTime DESC LIMIT 50", 0);
        this.f27984a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f27984a, xaeVarAcquire, false, null);
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
                dx6 dx6Var = new dx6();
                xaeVar = xaeVarAcquire;
                try {
                    dx6Var.setId(cursorQuery.getInt(columnIndexOrThrow));
                    dx6Var.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    dx6Var.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    dx6Var.setType(cursorQuery.getInt(columnIndexOrThrow4));
                    dx6Var.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                    dx6Var.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                    int i = columnIndexOrThrow2;
                    int i2 = columnIndexOrThrow3;
                    dx6Var.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                    dx6Var.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                    dx6Var.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                    dx6Var.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                    dx6Var.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                    dx6Var.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                    arrayList.add(dx6Var);
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

    @Override // p000.bx6
    public void insert(final dx6 message) {
        this.f27984a.assertNotSuspendingTransaction();
        this.f27984a.beginTransaction();
        try {
            this.f27985b.insert(message);
            this.f27984a.setTransactionSuccessful();
        } finally {
            this.f27984a.endTransaction();
        }
    }

    @Override // p000.bx6
    public void updateTransResultByResult(final Integer id, final String newTransResult, final String newVoiceName) {
        this.f27984a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f27986c.acquire();
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
        this.f27984a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f27984a.setTransactionSuccessful();
        } finally {
            this.f27984a.endTransaction();
            this.f27986c.release(bggVarAcquire);
        }
    }

    @Override // p000.bx6
    public void updateVoicePathById(final long id, final String voicePath) {
        this.f27984a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f27987d.acquire();
        if (voicePath == null) {
            bggVarAcquire.bindNull(1);
        } else {
            bggVarAcquire.bindString(1, voicePath);
        }
        bggVarAcquire.bindLong(2, id);
        this.f27984a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f27984a.setTransactionSuccessful();
        } finally {
            this.f27984a.endTransaction();
            this.f27987d.release(bggVarAcquire);
        }
    }
}

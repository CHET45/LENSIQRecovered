package p000;

import android.database.Cursor;
import androidx.appcompat.widget.C0546a;
import androidx.lifecycle.AbstractC1158q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class vah implements uah {

    /* JADX INFO: renamed from: a */
    public final uae f90497a;

    /* JADX INFO: renamed from: b */
    public final l35<dbh> f90498b;

    /* JADX INFO: renamed from: c */
    public final l35<jbh> f90499c;

    /* JADX INFO: renamed from: d */
    public final caf f90500d;

    /* JADX INFO: renamed from: e */
    public final caf f90501e;

    /* JADX INFO: renamed from: f */
    public final caf f90502f;

    /* JADX INFO: renamed from: g */
    public final caf f90503g;

    /* JADX INFO: renamed from: h */
    public final caf f90504h;

    /* JADX INFO: renamed from: i */
    public final caf f90505i;

    /* JADX INFO: renamed from: j */
    public final caf f90506j;

    /* JADX INFO: renamed from: k */
    public final caf f90507k;

    /* JADX INFO: renamed from: l */
    public final caf f90508l;

    /* JADX INFO: renamed from: m */
    public final caf f90509m;

    /* JADX INFO: renamed from: n */
    public final caf f90510n;

    /* JADX INFO: renamed from: o */
    public final caf f90511o;

    /* JADX INFO: renamed from: vah$a */
    public class C13969a extends caf {
        public C13969a(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "DELETE FROM transMachineRecord WHERE time = ?";
        }
    }

    /* JADX INFO: renamed from: vah$b */
    public class C13970b extends caf {
        public C13970b(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "UPDATE transMachineRecord SET name = ? ,sourceVoicePath =? WHERE id = ?";
        }
    }

    /* JADX INFO: renamed from: vah$c */
    public class C13971c extends caf {
        public C13971c(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "DELETE FROM transMachineRecord WHERE id = ?";
        }
    }

    /* JADX INFO: renamed from: vah$d */
    public class C13972d extends caf {
        public C13972d(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "UPDATE transMachineRecord SET sourceVoicePath = ?  WHERE id = ?";
        }
    }

    /* JADX INFO: renamed from: vah$e */
    public class C13973e extends caf {
        public C13973e(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "UPDATE transMachineRecord SET sourceVoicePath = ?  WHERE time = ?";
        }
    }

    /* JADX INFO: renamed from: vah$f */
    public class CallableC13974f implements Callable<List<jbh>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ xae f90517a;

        public CallableC13974f(final xae val$_statement) {
            this.f90517a = val$_statement;
        }

        public void finalize() {
            this.f90517a.release();
        }

        @Override // java.util.concurrent.Callable
        public List<jbh> call() throws Exception {
            Cursor cursorQuery = pe3.query(vah.this.f90497a, this.f90517a, false, null);
            try {
                int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "name");
                int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "date");
                int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, C0546a.f3357s);
                int columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "sourcePcmPath");
                int columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "sourceVoicePath");
                int columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "transVoicePath");
                int columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "messageListJson");
                int columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, "duration");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    jbh jbhVar = new jbh();
                    jbhVar.setId(cursorQuery.getLong(columnIndexOrThrow));
                    jbhVar.setName(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    jbhVar.setDate(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    jbhVar.setTime(cursorQuery.getLong(columnIndexOrThrow4));
                    jbhVar.setSourcePcmPath(cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5));
                    jbhVar.setSourceVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                    jbhVar.setTransVoicePath(cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7));
                    jbhVar.setMessageListJson(cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8));
                    jbhVar.setDuration(cursorQuery.getLong(columnIndexOrThrow9));
                    arrayList.add(jbhVar);
                }
                return arrayList;
            } finally {
                cursorQuery.close();
            }
        }
    }

    /* JADX INFO: renamed from: vah$g */
    public class C13975g extends l35<dbh> {
        public C13975g(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "INSERT OR ABORT INTO `transMachineMsg` (`id`,`result`,`transResult`,`type`,`multipleOptions`,`voicePath`,`voiceTime`,`messageTime`,`isPause`,`voiceName`,`isGptOrXF`,`isLangCode`,`sourceLanguage`,`transLanguage`,`isLanguageChange`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p000.l35
        public void bind(bgg bggVar, dbh dbhVar) {
            if (dbhVar.getId() == null) {
                bggVar.bindNull(1);
            } else {
                bggVar.bindLong(1, dbhVar.getId().intValue());
            }
            if (dbhVar.getResult() == null) {
                bggVar.bindNull(2);
            } else {
                bggVar.bindString(2, dbhVar.getResult());
            }
            if (dbhVar.getTransResult() == null) {
                bggVar.bindNull(3);
            } else {
                bggVar.bindString(3, dbhVar.getTransResult());
            }
            bggVar.bindLong(4, dbhVar.getType());
            bggVar.bindLong(5, dbhVar.getMultipleOptions());
            if (dbhVar.getVoicePath() == null) {
                bggVar.bindNull(6);
            } else {
                bggVar.bindString(6, dbhVar.getVoicePath());
            }
            bggVar.bindLong(7, dbhVar.getVoiceTime());
            bggVar.bindLong(8, dbhVar.getMessageTime());
            bggVar.bindLong(9, dbhVar.isPause() ? 1L : 0L);
            if (dbhVar.getVoiceName() == null) {
                bggVar.bindNull(10);
            } else {
                bggVar.bindString(10, dbhVar.getVoiceName());
            }
            bggVar.bindLong(11, dbhVar.getIsGptOrXF());
            if (dbhVar.getIsLangCode() == null) {
                bggVar.bindNull(12);
            } else {
                bggVar.bindString(12, dbhVar.getIsLangCode());
            }
            if (dbhVar.getSourceLanguage() == null) {
                bggVar.bindNull(13);
            } else {
                bggVar.bindString(13, dbhVar.getSourceLanguage());
            }
            if (dbhVar.getTransLanguage() == null) {
                bggVar.bindNull(14);
            } else {
                bggVar.bindString(14, dbhVar.getTransLanguage());
            }
            bggVar.bindLong(15, dbhVar.isLanguageChange() ? 1L : 0L);
        }
    }

    /* JADX INFO: renamed from: vah$h */
    public class C13976h extends l35<jbh> {
        public C13976h(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "INSERT OR ABORT INTO `transMachineRecord` (`id`,`name`,`date`,`time`,`sourcePcmPath`,`sourceVoicePath`,`transVoicePath`,`messageListJson`,`duration`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
        }

        @Override // p000.l35
        public void bind(bgg stmt, jbh value) {
            stmt.bindLong(1, value.getId());
            if (value.getName() == null) {
                stmt.bindNull(2);
            } else {
                stmt.bindString(2, value.getName());
            }
            if (value.getDate() == null) {
                stmt.bindNull(3);
            } else {
                stmt.bindString(3, value.getDate());
            }
            stmt.bindLong(4, value.getTime());
            if (value.getSourcePcmPath() == null) {
                stmt.bindNull(5);
            } else {
                stmt.bindString(5, value.getSourcePcmPath());
            }
            if (value.getSourceVoicePath() == null) {
                stmt.bindNull(6);
            } else {
                stmt.bindString(6, value.getSourceVoicePath());
            }
            if (value.getTransVoicePath() == null) {
                stmt.bindNull(7);
            } else {
                stmt.bindString(7, value.getTransVoicePath());
            }
            if (value.getMessageListJson() == null) {
                stmt.bindNull(8);
            } else {
                stmt.bindString(8, value.getMessageListJson());
            }
            stmt.bindLong(9, value.getDuration());
        }
    }

    /* JADX INFO: renamed from: vah$i */
    public class C13977i extends caf {
        public C13977i(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "UPDATE transMachineMsg SET transResult = ? , voiceName = ? WHERE id = ?";
        }
    }

    /* JADX INFO: renamed from: vah$j */
    public class C13978j extends caf {
        public C13978j(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "UPDATE transMachineMsg SET transResult = ? , result = ? WHERE messageTime = ?";
        }
    }

    /* JADX INFO: renamed from: vah$k */
    public class C13979k extends caf {
        public C13979k(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "UPDATE transMachineMsg SET voicePath = ?  WHERE id = ?";
        }
    }

    /* JADX INFO: renamed from: vah$l */
    public class C13980l extends caf {
        public C13980l(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "UPDATE transMachineMsg SET voicePath = ?  WHERE messageTime = ?";
        }
    }

    /* JADX INFO: renamed from: vah$m */
    public class C13981m extends caf {
        public C13981m(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "DELETE FROM transMachineMsg WHERE messageTime = ?";
        }
    }

    /* JADX INFO: renamed from: vah$n */
    public class C13982n extends caf {
        public C13982n(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "DELETE FROM transMachineMsg";
        }
    }

    /* JADX INFO: renamed from: vah$o */
    public class C13983o extends caf {
        public C13983o(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "DELETE FROM transMachineRecord";
        }
    }

    public vah(uae __db) {
        this.f90497a = __db;
        this.f90498b = new C13975g(__db);
        this.f90499c = new C13976h(__db);
        this.f90500d = new C13977i(__db);
        this.f90501e = new C13978j(__db);
        this.f90502f = new C13979k(__db);
        this.f90503g = new C13980l(__db);
        this.f90504h = new C13981m(__db);
        this.f90505i = new C13982n(__db);
        this.f90506j = new C13983o(__db);
        this.f90507k = new C13969a(__db);
        this.f90508l = new C13970b(__db);
        this.f90509m = new C13971c(__db);
        this.f90510n = new C13972d(__db);
        this.f90511o = new C13973e(__db);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // p000.uah
    public void deleteAll() {
        this.f90497a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f90505i.acquire();
        this.f90497a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f90497a.setTransactionSuccessful();
        } finally {
            this.f90497a.endTransaction();
            this.f90505i.release(bggVarAcquire);
        }
    }

    @Override // p000.uah
    public void deleteAllRecord() {
        this.f90497a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f90506j.acquire();
        this.f90497a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f90497a.setTransactionSuccessful();
        } finally {
            this.f90497a.endTransaction();
            this.f90506j.release(bggVarAcquire);
        }
    }

    @Override // p000.uah
    public void deleteRecordById(final long id) {
        this.f90497a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f90509m.acquire();
        bggVarAcquire.bindLong(1, id);
        this.f90497a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f90497a.setTransactionSuccessful();
        } finally {
            this.f90497a.endTransaction();
            this.f90509m.release(bggVarAcquire);
        }
    }

    @Override // p000.uah
    public void deleteSelectData(final long messageTime) {
        this.f90497a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f90504h.acquire();
        bggVarAcquire.bindLong(1, messageTime);
        this.f90497a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f90497a.setTransactionSuccessful();
        } finally {
            this.f90497a.endTransaction();
            this.f90504h.release(bggVarAcquire);
        }
    }

    @Override // p000.uah
    public void deleteSelectRecordData(final long time) {
        this.f90497a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f90507k.acquire();
        bggVarAcquire.bindLong(1, time);
        this.f90497a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f90497a.setTransactionSuccessful();
        } finally {
            this.f90497a.endTransaction();
            this.f90507k.release(bggVarAcquire);
        }
    }

    @Override // p000.uah
    public dbh findByResult(final String result, final long messageTime) throws Throwable {
        xae xaeVar;
        dbh dbhVar;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM transMachineMsg WHERE result = ? AND messageTime = ?", 2);
        if (result == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, result);
        }
        xaeVarAcquire.bindLong(2, messageTime);
        this.f90497a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f90497a, xaeVarAcquire, false, null);
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
            int columnIndexOrThrow13 = bb3.getColumnIndexOrThrow(cursorQuery, "sourceLanguage");
            int columnIndexOrThrow14 = bb3.getColumnIndexOrThrow(cursorQuery, "transLanguage");
            xaeVar = xaeVarAcquire;
            try {
                int columnIndexOrThrow15 = bb3.getColumnIndexOrThrow(cursorQuery, "isLanguageChange");
                if (cursorQuery.moveToFirst()) {
                    dbh dbhVar2 = new dbh();
                    dbhVar2.setId(cursorQuery.isNull(columnIndexOrThrow) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow)));
                    dbhVar2.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    dbhVar2.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    dbhVar2.setType(cursorQuery.getInt(columnIndexOrThrow4));
                    dbhVar2.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                    dbhVar2.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                    dbhVar2.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                    dbhVar2.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                    dbhVar2.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                    dbhVar2.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                    dbhVar2.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                    dbhVar2.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                    dbhVar2.setSourceLanguage(cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13));
                    dbhVar2.setTransLanguage(cursorQuery.isNull(columnIndexOrThrow14) ? null : cursorQuery.getString(columnIndexOrThrow14));
                    dbhVar2.setLanguageChange(cursorQuery.getInt(columnIndexOrThrow15) != 0);
                    dbhVar = dbhVar2;
                } else {
                    dbhVar = null;
                }
                cursorQuery.close();
                xaeVar.release();
                return dbhVar;
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

    @Override // p000.uah
    public List<dbh> getAll() throws Throwable {
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
        int i;
        Integer numValueOf;
        int i2;
        boolean z;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM transMachineMsg", 0);
        this.f90497a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f90497a, xaeVarAcquire, false, null);
        try {
            columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "result");
            columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "transResult");
            columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "type");
            columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "multipleOptions");
            columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "voicePath");
            columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "voiceTime");
            columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "messageTime");
            columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, "isPause");
            columnIndexOrThrow10 = bb3.getColumnIndexOrThrow(cursorQuery, "voiceName");
            columnIndexOrThrow11 = bb3.getColumnIndexOrThrow(cursorQuery, "isGptOrXF");
            columnIndexOrThrow12 = bb3.getColumnIndexOrThrow(cursorQuery, "isLangCode");
            columnIndexOrThrow13 = bb3.getColumnIndexOrThrow(cursorQuery, "sourceLanguage");
            columnIndexOrThrow14 = bb3.getColumnIndexOrThrow(cursorQuery, "transLanguage");
            xaeVar = xaeVarAcquire;
        } catch (Throwable th) {
            th = th;
            xaeVar = xaeVarAcquire;
        }
        try {
            int columnIndexOrThrow15 = bb3.getColumnIndexOrThrow(cursorQuery, "isLanguageChange");
            int i3 = columnIndexOrThrow14;
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                dbh dbhVar = new dbh();
                if (cursorQuery.isNull(columnIndexOrThrow)) {
                    i = columnIndexOrThrow;
                    numValueOf = null;
                } else {
                    i = columnIndexOrThrow;
                    numValueOf = Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow));
                }
                dbhVar.setId(numValueOf);
                dbhVar.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                dbhVar.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                dbhVar.setType(cursorQuery.getInt(columnIndexOrThrow4));
                dbhVar.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                dbhVar.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                int i4 = columnIndexOrThrow2;
                int i5 = columnIndexOrThrow3;
                dbhVar.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                dbhVar.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                dbhVar.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                dbhVar.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                dbhVar.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                dbhVar.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                dbhVar.setSourceLanguage(cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13));
                int i6 = i3;
                dbhVar.setTransLanguage(cursorQuery.isNull(i6) ? null : cursorQuery.getString(i6));
                int i7 = columnIndexOrThrow15;
                if (cursorQuery.getInt(i7) != 0) {
                    i2 = i4;
                    z = true;
                } else {
                    i2 = i4;
                    z = false;
                }
                dbhVar.setLanguageChange(z);
                arrayList.add(dbhVar);
                i3 = i6;
                columnIndexOrThrow2 = i2;
                columnIndexOrThrow = i;
                columnIndexOrThrow15 = i7;
                columnIndexOrThrow3 = i5;
            }
            cursorQuery.close();
            xaeVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorQuery.close();
            xaeVar.release();
            throw th;
        }
    }

    @Override // p000.uah
    public List<jbh> getAllRecord() {
        xae xaeVarAcquire = xae.acquire("SELECT * FROM transMachineRecord ORDER BY time DESC", 0);
        this.f90497a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f90497a, xaeVarAcquire, false, null);
        try {
            int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "name");
            int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "date");
            int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, C0546a.f3357s);
            int columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "sourcePcmPath");
            int columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "sourceVoicePath");
            int columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "transVoicePath");
            int columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "messageListJson");
            int columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, "duration");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                jbh jbhVar = new jbh();
                int i = columnIndexOrThrow2;
                jbhVar.setId(cursorQuery.getLong(columnIndexOrThrow));
                jbhVar.setName(cursorQuery.isNull(i) ? null : cursorQuery.getString(i));
                jbhVar.setDate(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                int i2 = columnIndexOrThrow;
                jbhVar.setTime(cursorQuery.getLong(columnIndexOrThrow4));
                jbhVar.setSourcePcmPath(cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5));
                jbhVar.setSourceVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                jbhVar.setTransVoicePath(cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7));
                jbhVar.setMessageListJson(cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8));
                jbhVar.setDuration(cursorQuery.getLong(columnIndexOrThrow9));
                arrayList.add(jbhVar);
                columnIndexOrThrow = i2;
                columnIndexOrThrow2 = i;
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // p000.uah
    public AbstractC1158q<List<jbh>> getAllRecordLiveData() {
        return this.f90497a.getInvalidationTracker().createLiveData(new String[]{"transMachineRecord"}, false, new CallableC13974f(xae.acquire("SELECT * FROM transMachineRecord ORDER BY time DESC", 0)));
    }

    @Override // p000.uah
    public List<dbh> getLatestData() throws Throwable {
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
        int i;
        Integer numValueOf;
        int i2;
        boolean z;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM transMachineMsg ORDER BY id DESC LIMIT 50", 0);
        this.f90497a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f90497a, xaeVarAcquire, false, null);
        try {
            columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "result");
            columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "transResult");
            columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "type");
            columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "multipleOptions");
            columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "voicePath");
            columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "voiceTime");
            columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "messageTime");
            columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, "isPause");
            columnIndexOrThrow10 = bb3.getColumnIndexOrThrow(cursorQuery, "voiceName");
            columnIndexOrThrow11 = bb3.getColumnIndexOrThrow(cursorQuery, "isGptOrXF");
            columnIndexOrThrow12 = bb3.getColumnIndexOrThrow(cursorQuery, "isLangCode");
            columnIndexOrThrow13 = bb3.getColumnIndexOrThrow(cursorQuery, "sourceLanguage");
            columnIndexOrThrow14 = bb3.getColumnIndexOrThrow(cursorQuery, "transLanguage");
            xaeVar = xaeVarAcquire;
        } catch (Throwable th) {
            th = th;
            xaeVar = xaeVarAcquire;
        }
        try {
            int columnIndexOrThrow15 = bb3.getColumnIndexOrThrow(cursorQuery, "isLanguageChange");
            int i3 = columnIndexOrThrow14;
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                dbh dbhVar = new dbh();
                if (cursorQuery.isNull(columnIndexOrThrow)) {
                    i = columnIndexOrThrow;
                    numValueOf = null;
                } else {
                    i = columnIndexOrThrow;
                    numValueOf = Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow));
                }
                dbhVar.setId(numValueOf);
                dbhVar.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                dbhVar.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                dbhVar.setType(cursorQuery.getInt(columnIndexOrThrow4));
                dbhVar.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                dbhVar.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                int i4 = columnIndexOrThrow2;
                int i5 = columnIndexOrThrow3;
                dbhVar.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                dbhVar.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                dbhVar.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                dbhVar.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                dbhVar.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                dbhVar.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                dbhVar.setSourceLanguage(cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13));
                int i6 = i3;
                dbhVar.setTransLanguage(cursorQuery.isNull(i6) ? null : cursorQuery.getString(i6));
                int i7 = columnIndexOrThrow15;
                if (cursorQuery.getInt(i7) != 0) {
                    i2 = i4;
                    z = true;
                } else {
                    i2 = i4;
                    z = false;
                }
                dbhVar.setLanguageChange(z);
                arrayList.add(dbhVar);
                i3 = i6;
                columnIndexOrThrow2 = i2;
                columnIndexOrThrow = i;
                columnIndexOrThrow15 = i7;
                columnIndexOrThrow3 = i5;
            }
            cursorQuery.close();
            xaeVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorQuery.close();
            xaeVar.release();
            throw th;
        }
    }

    @Override // p000.uah
    public List<dbh> getLatestOne() throws Throwable {
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
        int i;
        Integer numValueOf;
        int i2;
        boolean z;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM transMachineMsg ORDER BY messageTime DESC LIMIT 1", 0);
        this.f90497a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f90497a, xaeVarAcquire, false, null);
        try {
            columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "result");
            columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "transResult");
            columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "type");
            columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "multipleOptions");
            columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "voicePath");
            columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "voiceTime");
            columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "messageTime");
            columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, "isPause");
            columnIndexOrThrow10 = bb3.getColumnIndexOrThrow(cursorQuery, "voiceName");
            columnIndexOrThrow11 = bb3.getColumnIndexOrThrow(cursorQuery, "isGptOrXF");
            columnIndexOrThrow12 = bb3.getColumnIndexOrThrow(cursorQuery, "isLangCode");
            columnIndexOrThrow13 = bb3.getColumnIndexOrThrow(cursorQuery, "sourceLanguage");
            columnIndexOrThrow14 = bb3.getColumnIndexOrThrow(cursorQuery, "transLanguage");
            xaeVar = xaeVarAcquire;
        } catch (Throwable th) {
            th = th;
            xaeVar = xaeVarAcquire;
        }
        try {
            int columnIndexOrThrow15 = bb3.getColumnIndexOrThrow(cursorQuery, "isLanguageChange");
            int i3 = columnIndexOrThrow14;
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                dbh dbhVar = new dbh();
                if (cursorQuery.isNull(columnIndexOrThrow)) {
                    i = columnIndexOrThrow;
                    numValueOf = null;
                } else {
                    i = columnIndexOrThrow;
                    numValueOf = Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow));
                }
                dbhVar.setId(numValueOf);
                dbhVar.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                dbhVar.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                dbhVar.setType(cursorQuery.getInt(columnIndexOrThrow4));
                dbhVar.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                dbhVar.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                int i4 = columnIndexOrThrow2;
                int i5 = columnIndexOrThrow3;
                dbhVar.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                dbhVar.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                dbhVar.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                dbhVar.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                dbhVar.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                dbhVar.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                dbhVar.setSourceLanguage(cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13));
                int i6 = i3;
                dbhVar.setTransLanguage(cursorQuery.isNull(i6) ? null : cursorQuery.getString(i6));
                int i7 = columnIndexOrThrow15;
                if (cursorQuery.getInt(i7) != 0) {
                    i2 = i4;
                    z = true;
                } else {
                    i2 = i4;
                    z = false;
                }
                dbhVar.setLanguageChange(z);
                arrayList.add(dbhVar);
                i3 = i6;
                columnIndexOrThrow2 = i2;
                columnIndexOrThrow = i;
                columnIndexOrThrow15 = i7;
                columnIndexOrThrow3 = i5;
            }
            cursorQuery.close();
            xaeVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorQuery.close();
            xaeVar.release();
            throw th;
        }
    }

    @Override // p000.uah
    public List<dbh> getLatestTen() throws Throwable {
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
        int i;
        Integer numValueOf;
        int i2;
        boolean z;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM transMachineMsg ORDER BY messageTime DESC LIMIT 50", 0);
        this.f90497a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f90497a, xaeVarAcquire, false, null);
        try {
            columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "result");
            columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "transResult");
            columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "type");
            columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "multipleOptions");
            columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "voicePath");
            columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "voiceTime");
            columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "messageTime");
            columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, "isPause");
            columnIndexOrThrow10 = bb3.getColumnIndexOrThrow(cursorQuery, "voiceName");
            columnIndexOrThrow11 = bb3.getColumnIndexOrThrow(cursorQuery, "isGptOrXF");
            columnIndexOrThrow12 = bb3.getColumnIndexOrThrow(cursorQuery, "isLangCode");
            columnIndexOrThrow13 = bb3.getColumnIndexOrThrow(cursorQuery, "sourceLanguage");
            columnIndexOrThrow14 = bb3.getColumnIndexOrThrow(cursorQuery, "transLanguage");
            xaeVar = xaeVarAcquire;
        } catch (Throwable th) {
            th = th;
            xaeVar = xaeVarAcquire;
        }
        try {
            int columnIndexOrThrow15 = bb3.getColumnIndexOrThrow(cursorQuery, "isLanguageChange");
            int i3 = columnIndexOrThrow14;
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                dbh dbhVar = new dbh();
                if (cursorQuery.isNull(columnIndexOrThrow)) {
                    i = columnIndexOrThrow;
                    numValueOf = null;
                } else {
                    i = columnIndexOrThrow;
                    numValueOf = Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow));
                }
                dbhVar.setId(numValueOf);
                dbhVar.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                dbhVar.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                dbhVar.setType(cursorQuery.getInt(columnIndexOrThrow4));
                dbhVar.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                dbhVar.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                int i4 = columnIndexOrThrow2;
                int i5 = columnIndexOrThrow3;
                dbhVar.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                dbhVar.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                dbhVar.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                dbhVar.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                dbhVar.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                dbhVar.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                dbhVar.setSourceLanguage(cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13));
                int i6 = i3;
                dbhVar.setTransLanguage(cursorQuery.isNull(i6) ? null : cursorQuery.getString(i6));
                int i7 = columnIndexOrThrow15;
                if (cursorQuery.getInt(i7) != 0) {
                    i2 = i4;
                    z = true;
                } else {
                    i2 = i4;
                    z = false;
                }
                dbhVar.setLanguageChange(z);
                arrayList.add(dbhVar);
                i3 = i6;
                columnIndexOrThrow2 = i2;
                columnIndexOrThrow = i;
                columnIndexOrThrow15 = i7;
                columnIndexOrThrow3 = i5;
            }
            cursorQuery.close();
            xaeVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorQuery.close();
            xaeVar.release();
            throw th;
        }
    }

    @Override // p000.uah
    public jbh getRecordById(long j) {
        xae xaeVarAcquire = xae.acquire("SELECT * FROM transMachineRecord WHERE id =?", 1);
        xaeVarAcquire.bindLong(1, j);
        this.f90497a.assertNotSuspendingTransaction();
        jbh jbhVar = null;
        String string = null;
        Cursor cursorQuery = pe3.query(this.f90497a, xaeVarAcquire, false, null);
        try {
            int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "name");
            int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "date");
            int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, C0546a.f3357s);
            int columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "sourcePcmPath");
            int columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "sourceVoicePath");
            int columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "transVoicePath");
            int columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "messageListJson");
            int columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, "duration");
            if (cursorQuery.moveToFirst()) {
                jbh jbhVar2 = new jbh();
                jbhVar2.setId(cursorQuery.getLong(columnIndexOrThrow));
                jbhVar2.setName(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                jbhVar2.setDate(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                jbhVar2.setTime(cursorQuery.getLong(columnIndexOrThrow4));
                jbhVar2.setSourcePcmPath(cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5));
                jbhVar2.setSourceVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                jbhVar2.setTransVoicePath(cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7));
                if (!cursorQuery.isNull(columnIndexOrThrow8)) {
                    string = cursorQuery.getString(columnIndexOrThrow8);
                }
                jbhVar2.setMessageListJson(string);
                jbhVar2.setDuration(cursorQuery.getLong(columnIndexOrThrow9));
                jbhVar = jbhVar2;
            }
            return jbhVar;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // p000.uah
    public int getTodayRecordCount() {
        xae xaeVarAcquire = xae.acquire("SELECT COUNT(*) FROM transMachineRecord WHERE date(time/1000, 'unixepoch') = date('now')", 0);
        this.f90497a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f90497a, xaeVarAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? cursorQuery.getInt(0) : 0;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // p000.uah
    public long insert(final dbh message) {
        this.f90497a.assertNotSuspendingTransaction();
        this.f90497a.beginTransaction();
        try {
            long jInsertAndReturnId = this.f90498b.insertAndReturnId(message);
            this.f90497a.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.f90497a.endTransaction();
        }
    }

    @Override // p000.uah
    public dbh queryByVoicePath(final String voicePath) throws Throwable {
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
        dbh dbhVar;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM transMachineMsg WHERE voicePath = ?", 1);
        if (voicePath == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, voicePath);
        }
        this.f90497a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f90497a, xaeVarAcquire, false, null);
        try {
            columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "result");
            columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "transResult");
            columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "type");
            columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "multipleOptions");
            columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "voicePath");
            columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "voiceTime");
            columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "messageTime");
            columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, "isPause");
            columnIndexOrThrow10 = bb3.getColumnIndexOrThrow(cursorQuery, "voiceName");
            columnIndexOrThrow11 = bb3.getColumnIndexOrThrow(cursorQuery, "isGptOrXF");
            columnIndexOrThrow12 = bb3.getColumnIndexOrThrow(cursorQuery, "isLangCode");
            columnIndexOrThrow13 = bb3.getColumnIndexOrThrow(cursorQuery, "sourceLanguage");
            columnIndexOrThrow14 = bb3.getColumnIndexOrThrow(cursorQuery, "transLanguage");
            xaeVar = xaeVarAcquire;
        } catch (Throwable th) {
            th = th;
            xaeVar = xaeVarAcquire;
        }
        try {
            int columnIndexOrThrow15 = bb3.getColumnIndexOrThrow(cursorQuery, "isLanguageChange");
            if (cursorQuery.moveToFirst()) {
                dbh dbhVar2 = new dbh();
                dbhVar2.setId(cursorQuery.isNull(columnIndexOrThrow) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow)));
                dbhVar2.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                dbhVar2.setTransResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                dbhVar2.setType(cursorQuery.getInt(columnIndexOrThrow4));
                dbhVar2.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow5));
                dbhVar2.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                dbhVar2.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow7));
                dbhVar2.setMessageTime(cursorQuery.getLong(columnIndexOrThrow8));
                dbhVar2.setPause(cursorQuery.getInt(columnIndexOrThrow9) != 0);
                dbhVar2.setVoiceName(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                dbhVar2.setIsGptOrXF(cursorQuery.getInt(columnIndexOrThrow11));
                dbhVar2.setIsLangCode(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                dbhVar2.setSourceLanguage(cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13));
                dbhVar2.setTransLanguage(cursorQuery.isNull(columnIndexOrThrow14) ? null : cursorQuery.getString(columnIndexOrThrow14));
                dbhVar2.setLanguageChange(cursorQuery.getInt(columnIndexOrThrow15) != 0);
                dbhVar = dbhVar2;
            } else {
                dbhVar = null;
            }
            cursorQuery.close();
            xaeVar.release();
            return dbhVar;
        } catch (Throwable th2) {
            th = th2;
            cursorQuery.close();
            xaeVar.release();
            throw th;
        }
    }

    @Override // p000.uah
    public void reRecordNameById(final long id, final String name, final String mp3Path) {
        this.f90497a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f90508l.acquire();
        if (name == null) {
            bggVarAcquire.bindNull(1);
        } else {
            bggVarAcquire.bindString(1, name);
        }
        if (mp3Path == null) {
            bggVarAcquire.bindNull(2);
        } else {
            bggVarAcquire.bindString(2, mp3Path);
        }
        bggVarAcquire.bindLong(3, id);
        this.f90497a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f90497a.setTransactionSuccessful();
        } finally {
            this.f90497a.endTransaction();
            this.f90508l.release(bggVarAcquire);
        }
    }

    @Override // p000.uah
    public void updateSourceVoicePathById(final long id, final String sourceVoicePath) {
        this.f90497a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f90510n.acquire();
        if (sourceVoicePath == null) {
            bggVarAcquire.bindNull(1);
        } else {
            bggVarAcquire.bindString(1, sourceVoicePath);
        }
        bggVarAcquire.bindLong(2, id);
        this.f90497a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f90497a.setTransactionSuccessful();
        } finally {
            this.f90497a.endTransaction();
            this.f90510n.release(bggVarAcquire);
        }
    }

    @Override // p000.uah
    public void updateSourceVoicePathByTime(final long time, final String sourceVoicePath) {
        this.f90497a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f90511o.acquire();
        if (sourceVoicePath == null) {
            bggVarAcquire.bindNull(1);
        } else {
            bggVarAcquire.bindString(1, sourceVoicePath);
        }
        bggVarAcquire.bindLong(2, time);
        this.f90497a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f90497a.setTransactionSuccessful();
        } finally {
            this.f90497a.endTransaction();
            this.f90511o.release(bggVarAcquire);
        }
    }

    @Override // p000.uah
    public void updateTransResultByMessageTime(final long messageTime, final String text, final String newTransResult) {
        this.f90497a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f90501e.acquire();
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
        this.f90497a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f90497a.setTransactionSuccessful();
        } finally {
            this.f90497a.endTransaction();
            this.f90501e.release(bggVarAcquire);
        }
    }

    @Override // p000.uah
    public void updateTransResultByResult(final Integer id, final String newTransResult, final String newVoiceName) {
        this.f90497a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f90500d.acquire();
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
        this.f90497a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f90497a.setTransactionSuccessful();
        } finally {
            this.f90497a.endTransaction();
            this.f90500d.release(bggVarAcquire);
        }
    }

    @Override // p000.uah
    public void updateVoicePathById(final long id, final String voicePath) {
        this.f90497a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f90502f.acquire();
        if (voicePath == null) {
            bggVarAcquire.bindNull(1);
        } else {
            bggVarAcquire.bindString(1, voicePath);
        }
        bggVarAcquire.bindLong(2, id);
        this.f90497a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f90497a.setTransactionSuccessful();
        } finally {
            this.f90497a.endTransaction();
            this.f90502f.release(bggVarAcquire);
        }
    }

    @Override // p000.uah
    public void updateVoicePathByMessageTime(final long messageTime, final String voicePath) {
        this.f90497a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f90503g.acquire();
        if (voicePath == null) {
            bggVarAcquire.bindNull(1);
        } else {
            bggVarAcquire.bindString(1, voicePath);
        }
        bggVarAcquire.bindLong(2, messageTime);
        this.f90497a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f90497a.setTransactionSuccessful();
        } finally {
            this.f90497a.endTransaction();
            this.f90503g.release(bggVarAcquire);
        }
    }

    @Override // p000.uah
    public void insert(final jbh record) {
        this.f90497a.assertNotSuspendingTransaction();
        this.f90497a.beginTransaction();
        try {
            this.f90499c.insert(record);
            this.f90497a.setTransactionSuccessful();
        } finally {
            this.f90497a.endTransaction();
        }
    }
}

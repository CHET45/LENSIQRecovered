package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import com.google.firebase.firestore.C3603f;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.wp9;
import p000.yie;

/* JADX INFO: loaded from: classes5.dex */
public final class yie extends jqc {

    /* JADX INFO: renamed from: l */
    public static final int f101720l = 900;

    /* JADX INFO: renamed from: c */
    public final C15684c f101721c;

    /* JADX INFO: renamed from: d */
    public final ud9 f101722d;

    /* JADX INFO: renamed from: e */
    public final eke f101723e;

    /* JADX INFO: renamed from: f */
    public final zfe f101724f;

    /* JADX INFO: renamed from: g */
    public final eje f101725g;

    /* JADX INFO: renamed from: h */
    public final eie f101726h;

    /* JADX INFO: renamed from: i */
    public final SQLiteTransactionListener f101727i;

    /* JADX INFO: renamed from: j */
    public SQLiteDatabase f101728j;

    /* JADX INFO: renamed from: k */
    public boolean f101729k;

    /* JADX INFO: renamed from: yie$a */
    public class C15682a implements SQLiteTransactionListener {
        public C15682a() {
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onBegin() {
            yie.this.f101726h.onTransactionStarted();
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onCommit() {
            yie.this.f101726h.onTransactionCommitted();
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onRollback() {
        }
    }

    /* JADX INFO: renamed from: yie$c */
    @fdi
    public static class C15684c extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: a */
        public final ud9 f101738a;

        /* JADX INFO: renamed from: b */
        public boolean f101739b;

        public /* synthetic */ C15684c(Context context, ud9 ud9Var, String str, C15682a c15682a) {
            this(context, ud9Var, str);
        }

        private void ensureConfigured(SQLiteDatabase sQLiteDatabase) {
            if (this.f101739b) {
                return;
            }
            onConfigure(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f101739b = true;
            sQLiteDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", new String[0]).close();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            ensureConfigured(sQLiteDatabase);
            new yje(sQLiteDatabase, this.f101738a).m26148v(0);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            ensureConfigured(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            ensureConfigured(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            ensureConfigured(sQLiteDatabase);
            new yje(sQLiteDatabase, this.f101738a).m26148v(i);
        }

        private C15684c(Context context, ud9 ud9Var, String str) {
            this(context, ud9Var, str, 18);
        }

        @fdi
        public C15684c(Context context, ud9 ud9Var, String str, int i) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, i);
            this.f101738a = ud9Var;
        }
    }

    /* JADX INFO: renamed from: yie$d */
    public static class C15685d {

        /* JADX INFO: renamed from: a */
        public final SQLiteDatabase f101740a;

        /* JADX INFO: renamed from: b */
        public final String f101741b;

        /* JADX INFO: renamed from: c */
        public SQLiteDatabase.CursorFactory f101742c;

        public C15685d(SQLiteDatabase sQLiteDatabase, String str) {
            this.f101740a = sQLiteDatabase;
            this.f101741b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Cursor lambda$binding$0(Object[] objArr, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            yie.bind(sQLiteQuery, objArr);
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }

        private Cursor startQuery() {
            SQLiteDatabase.CursorFactory cursorFactory = this.f101742c;
            return cursorFactory != null ? this.f101740a.rawQueryWithFactory(cursorFactory, this.f101741b, null, null) : this.f101740a.rawQuery(this.f101741b, null);
        }

        /* JADX INFO: renamed from: b */
        public C15685d m26119b(final Object... objArr) {
            this.f101742c = new SQLiteDatabase.CursorFactory() { // from class: zie
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    return yie.C15685d.lambda$binding$0(objArr, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                }
            };
            return this;
        }

        /* JADX INFO: renamed from: c */
        public int m26120c(su2<Cursor> su2Var) {
            Cursor cursorStartQuery = startQuery();
            try {
                if (!cursorStartQuery.moveToFirst()) {
                    cursorStartQuery.close();
                    return 0;
                }
                su2Var.accept(cursorStartQuery);
                cursorStartQuery.close();
                return 1;
            } catch (Throwable th) {
                if (cursorStartQuery != null) {
                    try {
                        cursorStartQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @hib
        /* JADX INFO: renamed from: d */
        public <T> T m26121d(pz6<Cursor, T> pz6Var) {
            Cursor cursorStartQuery = startQuery();
            try {
                if (!cursorStartQuery.moveToFirst()) {
                    cursorStartQuery.close();
                    return null;
                }
                T tApply = pz6Var.apply(cursorStartQuery);
                cursorStartQuery.close();
                return tApply;
            } catch (Throwable th) {
                if (cursorStartQuery != null) {
                    try {
                        cursorStartQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        /* JADX INFO: renamed from: e */
        public int m26122e(su2<Cursor> su2Var) {
            Cursor cursorStartQuery = startQuery();
            int i = 0;
            while (cursorStartQuery.moveToNext()) {
                try {
                    i++;
                    su2Var.accept(cursorStartQuery);
                } catch (Throwable th) {
                    if (cursorStartQuery != null) {
                        try {
                            cursorStartQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            cursorStartQuery.close();
            return i;
        }

        /* JADX INFO: renamed from: f */
        public boolean m26123f() {
            Cursor cursorStartQuery = startQuery();
            try {
                boolean z = !cursorStartQuery.moveToFirst();
                cursorStartQuery.close();
                return z;
            } catch (Throwable th) {
                if (cursorStartQuery != null) {
                    try {
                        cursorStartQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    public yie(Context context, String str, qi3 qi3Var, ud9 ud9Var, wp9.C14736b c14736b) {
        this(ud9Var, c14736b, new C15684c(context, ud9Var, databaseName(str, qi3Var), (C15682a) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void bind(SQLiteProgram sQLiteProgram, Object[] objArr) {
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null) {
                sQLiteProgram.bindNull(i + 1);
            } else if (obj instanceof String) {
                sQLiteProgram.bindString(i + 1, (String) obj);
            } else if (obj instanceof Integer) {
                sQLiteProgram.bindLong(i + 1, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                sQLiteProgram.bindLong(i + 1, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                sQLiteProgram.bindDouble(i + 1, ((Double) obj).doubleValue());
            } else {
                if (!(obj instanceof byte[])) {
                    throw r80.fail("Unknown argument %s of type %s", obj, obj.getClass());
                }
                sQLiteProgram.bindBlob(i + 1, (byte[]) obj);
            }
        }
    }

    public static void clearPersistence(Context context, qi3 qi3Var, String str) throws C3603f {
        String path = context.getDatabasePath(databaseName(str, qi3Var)).getPath();
        String str2 = path + "-wal";
        File file = new File(path);
        File file2 = new File(path + "-journal");
        File file3 = new File(str2);
        try {
            rt5.delete(file);
            rt5.delete(file2);
            rt5.delete(file3);
        } catch (IOException e) {
            throw new C3603f("Failed to clear persistence." + e, C3603f.a.UNKNOWN);
        }
    }

    @fdi
    public static String databaseName(String str, qi3 qi3Var) {
        try {
            return "firestore." + URLEncoder.encode(str, li3.f57665c) + "." + URLEncoder.encode(qi3Var.getProjectId(), li3.f57665c) + "." + URLEncoder.encode(qi3Var.getDatabaseId(), li3.f57665c);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    private long getPageCount() {
        return ((Long) m26113t("PRAGMA page_count").m26121d(new pz6() { // from class: wie
            @Override // p000.pz6
            public final Object apply(Object obj) {
                return yie.lambda$getPageCount$1((Cursor) obj);
            }
        })).longValue();
    }

    private long getPageSize() {
        return ((Long) m26113t("PRAGMA page_size").m26121d(new pz6() { // from class: xie
            @Override // p000.pz6
            public final Object apply(Object obj) {
                return yie.lambda$getPageSize$0((Cursor) obj);
            }
        })).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$getPageCount$1(Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$getPageSize$0(Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    @Override // p000.jqc
    /* JADX INFO: renamed from: a */
    public mg1 mo14241a() {
        return this.f101724f;
    }

    @Override // p000.jqc
    /* JADX INFO: renamed from: b */
    public gi4 mo14242b(syh syhVar) {
        return new lge(this, this.f101722d, syhVar);
    }

    @Override // p000.jqc
    /* JADX INFO: renamed from: c */
    public v77 mo14243c() {
        return new rhe(this);
    }

    @Override // p000.jqc
    /* JADX INFO: renamed from: d */
    public f08 mo14244d(syh syhVar) {
        return new aie(this, this.f101722d, syhVar);
    }

    @Override // p000.jqc
    /* JADX INFO: renamed from: e */
    public s7b mo14245e(syh syhVar, f08 f08Var) {
        return new rie(this, this.f101722d, syhVar, f08Var);
    }

    @Override // p000.jqc
    /* JADX INFO: renamed from: f */
    public o9c mo14246f() {
        return new vie(this);
    }

    @Override // p000.jqc
    /* JADX INFO: renamed from: g */
    public kyd mo14247g() {
        return this.f101725g;
    }

    @Override // p000.jqc
    /* JADX INFO: renamed from: i */
    public <T> T mo14249i(String str, mfg<T> mfgVar) {
        fj9.debug(jqc.f51484a, "Starting transaction: %s", str);
        this.f101728j.beginTransactionWithListener(this.f101727i);
        try {
            T t = mfgVar.get();
            this.f101728j.setTransactionSuccessful();
            return t;
        } finally {
            this.f101728j.endTransaction();
        }
    }

    @Override // p000.jqc
    public boolean isStarted() {
        return this.f101729k;
    }

    @Override // p000.jqc
    /* JADX INFO: renamed from: j */
    public void mo14250j(String str, Runnable runnable) {
        fj9.debug(jqc.f51484a, "Starting transaction: %s", str);
        this.f101728j.beginTransactionWithListener(this.f101727i);
        try {
            runnable.run();
            this.f101728j.setTransactionSuccessful();
        } finally {
            this.f101728j.endTransaction();
        }
    }

    /* JADX INFO: renamed from: o */
    public int m26108o(SQLiteStatement sQLiteStatement, Object... objArr) {
        sQLiteStatement.clearBindings();
        bind(sQLiteStatement, objArr);
        return sQLiteStatement.executeUpdateDelete();
    }

    /* JADX INFO: renamed from: p */
    public void m26109p(String str, Object... objArr) {
        this.f101728j.execSQL(str, objArr);
    }

    /* JADX INFO: renamed from: q */
    public long m26110q() {
        return getPageCount() * getPageSize();
    }

    @Override // p000.jqc
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public eke mo14248h() {
        return this.f101723e;
    }

    /* JADX INFO: renamed from: s */
    public SQLiteStatement m26112s(String str) {
        return this.f101728j.compileStatement(str);
    }

    @Override // p000.jqc
    public void shutdown() {
        r80.hardAssert(this.f101729k, "SQLitePersistence shutdown without start!", new Object[0]);
        this.f101729k = false;
        this.f101728j.close();
        this.f101728j = null;
    }

    @Override // p000.jqc
    public void start() {
        r80.hardAssert(!this.f101729k, "SQLitePersistence double-started!", new Object[0]);
        this.f101729k = true;
        try {
            this.f101728j = this.f101721c.getWritableDatabase();
            this.f101723e.m10099g();
            this.f101726h.m9996d(this.f101723e.getHighestListenSequenceNumber());
        } catch (SQLiteDatabaseLockedException e) {
            throw new RuntimeException("Failed to gain exclusive lock to the Cloud Firestore client's offline persistence. This generally means you are using Cloud Firestore from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing Cloud Firestore in your Application class. If you are intentionally using Cloud Firestore from multiple processes, you can only enable offline persistence (that is, call setPersistenceEnabled(true)) in one of them.", e);
        }
    }

    /* JADX INFO: renamed from: t */
    public C15685d m26113t(String str) {
        return new C15685d(this.f101728j, str);
    }

    @Override // p000.jqc
    public eie getReferenceDelegate() {
        return this.f101726h;
    }

    public yie(ud9 ud9Var, wp9.C14736b c14736b, C15684c c15684c) {
        this.f101727i = new C15682a();
        this.f101721c = c15684c;
        this.f101722d = ud9Var;
        this.f101723e = new eke(this, ud9Var);
        this.f101724f = new zfe(this, ud9Var);
        this.f101725g = new eje(this, ud9Var);
        this.f101726h = new eie(this, c14736b);
    }

    /* JADX INFO: renamed from: yie$b */
    public static class C15683b {

        /* JADX INFO: renamed from: g */
        public static final int f101731g = 900;

        /* JADX INFO: renamed from: a */
        public final yie f101732a;

        /* JADX INFO: renamed from: b */
        public final String f101733b;

        /* JADX INFO: renamed from: c */
        public final String f101734c;

        /* JADX INFO: renamed from: d */
        public final List<Object> f101735d;

        /* JADX INFO: renamed from: e */
        public int f101736e;

        /* JADX INFO: renamed from: f */
        public final Iterator<Object> f101737f;

        public C15683b(yie yieVar, String str, List<Object> list, String str2) {
            this.f101736e = 0;
            this.f101732a = yieVar;
            this.f101733b = str;
            this.f101735d = Collections.emptyList();
            this.f101734c = str2;
            this.f101737f = list.iterator();
        }

        private Object[] getNextSubqueryArgs() {
            ArrayList arrayList = new ArrayList(this.f101735d);
            for (int i = 0; this.f101737f.hasNext() && i < 900 - this.f101735d.size(); i++) {
                arrayList.add(this.f101737f.next());
            }
            return arrayList.toArray();
        }

        /* JADX INFO: renamed from: a */
        public void m26114a() {
            this.f101736e++;
            Object[] nextSubqueryArgs = getNextSubqueryArgs();
            this.f101732a.m26109p(this.f101733b + ((Object) r0i.repeatSequence("?", nextSubqueryArgs.length, ", ")) + this.f101734c, nextSubqueryArgs);
        }

        /* JADX INFO: renamed from: b */
        public int m26115b() {
            return this.f101736e;
        }

        /* JADX INFO: renamed from: c */
        public boolean m26116c() {
            return this.f101737f.hasNext();
        }

        /* JADX INFO: renamed from: d */
        public C15685d m26117d() {
            this.f101736e++;
            Object[] nextSubqueryArgs = getNextSubqueryArgs();
            return this.f101732a.m26113t(this.f101733b + ((Object) r0i.repeatSequence("?", nextSubqueryArgs.length, ", ")) + this.f101734c).m26119b(nextSubqueryArgs);
        }

        public C15683b(yie yieVar, String str, List<Object> list, List<Object> list2, String str2) {
            this.f101736e = 0;
            this.f101732a = yieVar;
            this.f101733b = str;
            this.f101735d = list;
            this.f101734c = str2;
            this.f101737f = list2.iterator();
        }
    }
}

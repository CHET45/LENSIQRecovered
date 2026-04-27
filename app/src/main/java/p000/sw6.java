package p000;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;
import java.util.UUID;
import p000.sw6;
import p000.vfg;
import p000.xfg;

/* JADX INFO: loaded from: classes3.dex */
public final class sw6 implements xfg {

    /* JADX INFO: renamed from: C */
    @yfb
    public static final C12812a f83126C = new C12812a(null);

    /* JADX INFO: renamed from: F */
    @yfb
    public static final String f83127F = "SupportSQLite";

    /* JADX INFO: renamed from: a */
    @yfb
    public final Context f83128a;

    /* JADX INFO: renamed from: b */
    @gib
    public final String f83129b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final xfg.AbstractC15046a f83130c;

    /* JADX INFO: renamed from: d */
    public final boolean f83131d;

    /* JADX INFO: renamed from: e */
    public final boolean f83132e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final fx8<C12814c> f83133f;

    /* JADX INFO: renamed from: m */
    public boolean f83134m;

    /* JADX INFO: renamed from: sw6$a */
    public static final class C12812a {
        public /* synthetic */ C12812a(jt3 jt3Var) {
            this();
        }

        private C12812a() {
        }
    }

    /* JADX INFO: renamed from: sw6$b */
    public static final class C12813b {

        /* JADX INFO: renamed from: a */
        @gib
        public rw6 f83135a;

        public C12813b(@gib rw6 rw6Var) {
            this.f83135a = rw6Var;
        }

        @gib
        public final rw6 getDb() {
            return this.f83135a;
        }

        public final void setDb(@gib rw6 rw6Var) {
            this.f83135a = rw6Var;
        }
    }

    /* JADX INFO: renamed from: sw6$c */
    public static final class C12814c extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: C */
        @yfb
        public static final c f83136C = new c(null);

        /* JADX INFO: renamed from: a */
        @yfb
        public final Context f83137a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final C12813b f83138b;

        /* JADX INFO: renamed from: c */
        @yfb
        public final xfg.AbstractC15046a f83139c;

        /* JADX INFO: renamed from: d */
        public final boolean f83140d;

        /* JADX INFO: renamed from: e */
        public boolean f83141e;

        /* JADX INFO: renamed from: f */
        @yfb
        public final fdd f83142f;

        /* JADX INFO: renamed from: m */
        public boolean f83143m;

        /* JADX INFO: renamed from: sw6$c$a */
        public static final class a extends RuntimeException {

            /* JADX INFO: renamed from: a */
            @yfb
            public final b f83144a;

            /* JADX INFO: renamed from: b */
            @yfb
            public final Throwable f83145b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@yfb b bVar, @yfb Throwable th) {
                super(th);
                md8.checkNotNullParameter(bVar, "callbackName");
                md8.checkNotNullParameter(th, "cause");
                this.f83144a = bVar;
                this.f83145b = th;
            }

            @yfb
            public final b getCallbackName() {
                return this.f83144a;
            }

            @Override // java.lang.Throwable
            @yfb
            public Throwable getCause() {
                return this.f83145b;
            }
        }

        /* JADX INFO: renamed from: sw6$c$b */
        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* JADX INFO: renamed from: sw6$c$c */
        public static final class c {
            public /* synthetic */ c(jt3 jt3Var) {
                this();
            }

            @yfb
            public final rw6 getWrappedDb(@yfb C12813b c12813b, @yfb SQLiteDatabase sQLiteDatabase) {
                md8.checkNotNullParameter(c12813b, "refHolder");
                md8.checkNotNullParameter(sQLiteDatabase, "sqLiteDatabase");
                rw6 db = c12813b.getDb();
                if (db != null && db.isDelegate(sQLiteDatabase)) {
                    return db;
                }
                rw6 rw6Var = new rw6(sQLiteDatabase);
                c12813b.setDb(rw6Var);
                return rw6Var;
            }

            private c() {
            }
        }

        /* JADX INFO: renamed from: sw6$c$d */
        public /* synthetic */ class d {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f83152a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f83152a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12814c(@yfb Context context, @gib String str, @yfb final C12813b c12813b, @yfb final xfg.AbstractC15046a abstractC15046a, boolean z) {
            super(context, str, null, abstractC15046a.f97666a, new DatabaseErrorHandler() { // from class: tw6
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    sw6.C12814c._init_$lambda$0(abstractC15046a, c12813b, sQLiteDatabase);
                }
            });
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(c12813b, "dbRef");
            md8.checkNotNullParameter(abstractC15046a, "callback");
            this.f83137a = context;
            this.f83138b = c12813b;
            this.f83139c = abstractC15046a;
            this.f83140d = z;
            if (str == null) {
                str = UUID.randomUUID().toString();
                md8.checkNotNullExpressionValue(str, "randomUUID().toString()");
            }
            this.f83142f = new fdd(str, context.getCacheDir(), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(xfg.AbstractC15046a abstractC15046a, C12813b c12813b, SQLiteDatabase sQLiteDatabase) {
            md8.checkNotNullParameter(abstractC15046a, "$callback");
            md8.checkNotNullParameter(c12813b, "$dbRef");
            c cVar = f83136C;
            md8.checkNotNullExpressionValue(sQLiteDatabase, "dbObj");
            abstractC15046a.onCorruption(cVar.getWrappedDb(c12813b, sQLiteDatabase));
        }

        private final SQLiteDatabase getWritableOrReadableDatabase(boolean z) {
            if (z) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                md8.checkNotNullExpressionValue(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            md8.checkNotNullExpressionValue(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        private final SQLiteDatabase innerGetDatabase(boolean z) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z2 = this.f83143m;
            if (databaseName != null && !z2 && (parentFile = this.f83137a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return getWritableOrReadableDatabase(z);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return getWritableOrReadableDatabase(z);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof a) {
                        a aVar = th;
                        Throwable cause = aVar.getCause();
                        int i = d.f83152a[aVar.getCallbackName().ordinal()];
                        if (i == 1 || i == 2 || i == 3 || i == 4 || !(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else if (!(th instanceof SQLiteException) || databaseName == null || !this.f83140d) {
                        throw th;
                    }
                    this.f83137a.deleteDatabase(databaseName);
                    try {
                        return getWritableOrReadableDatabase(z);
                    } catch (a e) {
                        throw e.getCause();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                fdd.lock$default(this.f83142f, false, 1, null);
                super.close();
                this.f83138b.setDb(null);
                this.f83143m = false;
            } finally {
                this.f83142f.unlock();
            }
        }

        public final boolean getAllowDataLossOnRecovery() {
            return this.f83140d;
        }

        @yfb
        public final xfg.AbstractC15046a getCallback() {
            return this.f83139c;
        }

        @yfb
        public final Context getContext() {
            return this.f83137a;
        }

        @yfb
        public final C12813b getDbRef() {
            return this.f83138b;
        }

        @yfb
        public final wfg getSupportDatabase(boolean z) {
            try {
                this.f83142f.lock((this.f83143m || getDatabaseName() == null) ? false : true);
                this.f83141e = false;
                SQLiteDatabase sQLiteDatabaseInnerGetDatabase = innerGetDatabase(z);
                if (!this.f83141e) {
                    rw6 wrappedDb = getWrappedDb(sQLiteDatabaseInnerGetDatabase);
                    this.f83142f.unlock();
                    return wrappedDb;
                }
                close();
                wfg supportDatabase = getSupportDatabase(z);
                this.f83142f.unlock();
                return supportDatabase;
            } catch (Throwable th) {
                this.f83142f.unlock();
                throw th;
            }
        }

        @yfb
        public final rw6 getWrappedDb(@yfb SQLiteDatabase sQLiteDatabase) {
            md8.checkNotNullParameter(sQLiteDatabase, "sqLiteDatabase");
            return f83136C.getWrappedDb(this.f83138b, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(@yfb SQLiteDatabase sQLiteDatabase) {
            md8.checkNotNullParameter(sQLiteDatabase, "db");
            if (!this.f83141e && this.f83139c.f97666a != sQLiteDatabase.getVersion()) {
                sQLiteDatabase.setMaxSqlCacheSize(1);
            }
            try {
                this.f83139c.onConfigure(getWrappedDb(sQLiteDatabase));
            } catch (Throwable th) {
                throw new a(b.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(@yfb SQLiteDatabase sQLiteDatabase) {
            md8.checkNotNullParameter(sQLiteDatabase, "sqLiteDatabase");
            try {
                this.f83139c.onCreate(getWrappedDb(sQLiteDatabase));
            } catch (Throwable th) {
                throw new a(b.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(@yfb SQLiteDatabase sQLiteDatabase, int i, int i2) {
            md8.checkNotNullParameter(sQLiteDatabase, "db");
            this.f83141e = true;
            try {
                this.f83139c.onDowngrade(getWrappedDb(sQLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new a(b.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(@yfb SQLiteDatabase sQLiteDatabase) {
            md8.checkNotNullParameter(sQLiteDatabase, "db");
            if (!this.f83141e) {
                try {
                    this.f83139c.onOpen(getWrappedDb(sQLiteDatabase));
                } catch (Throwable th) {
                    throw new a(b.ON_OPEN, th);
                }
            }
            this.f83143m = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(@yfb SQLiteDatabase sQLiteDatabase, int i, int i2) {
            md8.checkNotNullParameter(sQLiteDatabase, "sqLiteDatabase");
            this.f83141e = true;
            try {
                this.f83139c.onUpgrade(getWrappedDb(sQLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new a(b.ON_UPGRADE, th);
            }
        }
    }

    /* JADX INFO: renamed from: sw6$d */
    public static final class C12815d extends tt8 implements ny6<C12814c> {
        public C12815d() {
            super(0);
        }

        @Override // p000.ny6
        @yfb
        public final C12814c invoke() {
            C12814c c12814c;
            if (sw6.this.f83129b == null || !sw6.this.f83131d) {
                c12814c = new C12814c(sw6.this.f83128a, sw6.this.f83129b, new C12813b(null), sw6.this.f83130c, sw6.this.f83132e);
            } else {
                c12814c = new C12814c(sw6.this.f83128a, new File(vfg.C14041c.getNoBackupFilesDir(sw6.this.f83128a), sw6.this.f83129b).getAbsolutePath(), new C12813b(null), sw6.this.f83130c, sw6.this.f83132e);
            }
            vfg.C14039a.setWriteAheadLoggingEnabled(c12814c, sw6.this.f83134m);
            return c12814c;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public sw6(@yfb Context context, @gib String str, @yfb xfg.AbstractC15046a abstractC15046a) {
        this(context, str, abstractC15046a, false, false, 24, null);
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(abstractC15046a, "callback");
    }

    private final C12814c getDelegate() {
        return this.f83133f.getValue();
    }

    @Override // p000.xfg, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f83133f.isInitialized()) {
            getDelegate().close();
        }
    }

    @Override // p000.xfg
    @gib
    public String getDatabaseName() {
        return this.f83129b;
    }

    @Override // p000.xfg
    @yfb
    public wfg getReadableDatabase() {
        return getDelegate().getSupportDatabase(false);
    }

    @Override // p000.xfg
    @yfb
    public wfg getWritableDatabase() {
        return getDelegate().getSupportDatabase(true);
    }

    @Override // p000.xfg
    @c5e(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z) {
        if (this.f83133f.isInitialized()) {
            vfg.C14039a.setWriteAheadLoggingEnabled(getDelegate(), z);
        }
        this.f83134m = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public sw6(@yfb Context context, @gib String str, @yfb xfg.AbstractC15046a abstractC15046a, boolean z) {
        this(context, str, abstractC15046a, z, false, 16, null);
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(abstractC15046a, "callback");
    }

    @yn8
    public sw6(@yfb Context context, @gib String str, @yfb xfg.AbstractC15046a abstractC15046a, boolean z, boolean z2) {
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(abstractC15046a, "callback");
        this.f83128a = context;
        this.f83129b = str;
        this.f83130c = abstractC15046a;
        this.f83131d = z;
        this.f83132e = z2;
        this.f83133f = hz8.lazy(new C12815d());
    }

    public /* synthetic */ sw6(Context context, String str, xfg.AbstractC15046a abstractC15046a, boolean z, boolean z2, int i, jt3 jt3Var) {
        this(context, str, abstractC15046a, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }
}

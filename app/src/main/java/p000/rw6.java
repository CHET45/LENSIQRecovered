package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import androidx.lifecycle.C1171x;
import com.google.android.gms.actions.SearchIntents;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import p000.vfg;

/* JADX INFO: loaded from: classes3.dex */
public final class rw6 implements wfg {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C12328b f79924b = new C12328b(null);

    /* JADX INFO: renamed from: c */
    @yfb
    public static final String[] f79925c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: d */
    @yfb
    public static final String[] f79926d = new String[0];

    /* JADX INFO: renamed from: a */
    @yfb
    public final SQLiteDatabase f79927a;

    /* JADX INFO: renamed from: rw6$a */
    @c5e(30)
    public static final class C12327a {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C12327a f79928a = new C12327a();

        private C12327a() {
        }

        @ih4
        public final void execPerConnectionSQL(@yfb SQLiteDatabase sQLiteDatabase, @yfb String str, @gib Object[] objArr) {
            md8.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            md8.checkNotNullParameter(str, "sql");
            sQLiteDatabase.execPerConnectionSQL(str, objArr);
        }
    }

    /* JADX INFO: renamed from: rw6$b */
    public static final class C12328b {
        public /* synthetic */ C12328b(jt3 jt3Var) {
            this();
        }

        private C12328b() {
        }
    }

    /* JADX INFO: renamed from: rw6$c */
    public static final class C12329c extends tt8 implements oz6<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zfg f79929a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12329c(zfg zfgVar) {
            super(4);
            this.f79929a = zfgVar;
        }

        @Override // p000.oz6
        @yfb
        public final SQLiteCursor invoke(@gib SQLiteDatabase sQLiteDatabase, @gib SQLiteCursorDriver sQLiteCursorDriver, @gib String str, @gib SQLiteQuery sQLiteQuery) {
            zfg zfgVar = this.f79929a;
            md8.checkNotNull(sQLiteQuery);
            zfgVar.bindTo(new vw6(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public rw6(@yfb SQLiteDatabase sQLiteDatabase) {
        md8.checkNotNullParameter(sQLiteDatabase, "delegate");
        this.f79927a = sQLiteDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor query$lambda$0(oz6 oz6Var, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        md8.checkNotNullParameter(oz6Var, "$tmp0");
        return (Cursor) oz6Var.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor query$lambda$1(zfg zfgVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        md8.checkNotNullParameter(zfgVar, "$query");
        md8.checkNotNull(sQLiteQuery);
        zfgVar.bindTo(new vw6(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // p000.wfg
    public void beginTransaction() {
        this.f79927a.beginTransaction();
    }

    @Override // p000.wfg
    public void beginTransactionNonExclusive() {
        this.f79927a.beginTransactionNonExclusive();
    }

    @Override // p000.wfg
    public void beginTransactionWithListener(@yfb SQLiteTransactionListener sQLiteTransactionListener) {
        md8.checkNotNullParameter(sQLiteTransactionListener, "transactionListener");
        this.f79927a.beginTransactionWithListener(sQLiteTransactionListener);
    }

    @Override // p000.wfg
    public void beginTransactionWithListenerNonExclusive(@yfb SQLiteTransactionListener sQLiteTransactionListener) {
        md8.checkNotNullParameter(sQLiteTransactionListener, "transactionListener");
        this.f79927a.beginTransactionWithListenerNonExclusive(sQLiteTransactionListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f79927a.close();
    }

    @Override // p000.wfg
    @yfb
    public bgg compileStatement(@yfb String str) {
        md8.checkNotNullParameter(str, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f79927a.compileStatement(str);
        md8.checkNotNullExpressionValue(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new ww6(sQLiteStatementCompileStatement);
    }

    @Override // p000.wfg
    public int delete(@yfb String str, @gib String str2, @gib Object[] objArr) {
        md8.checkNotNullParameter(str, "table");
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM ");
        sb.append(str);
        if (str2 != null && str2.length() != 0) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        bgg bggVarCompileStatement = compileStatement(string);
        cjf.f16750c.bind(bggVarCompileStatement, objArr);
        return bggVarCompileStatement.executeUpdateDelete();
    }

    @Override // p000.wfg
    @c5e(api = 16)
    public void disableWriteAheadLogging() {
        vfg.C14039a.disableWriteAheadLogging(this.f79927a);
    }

    @Override // p000.wfg
    public boolean enableWriteAheadLogging() {
        return this.f79927a.enableWriteAheadLogging();
    }

    @Override // p000.wfg
    public void endTransaction() {
        this.f79927a.endTransaction();
    }

    @Override // p000.wfg
    public void execPerConnectionSQL(@yfb String str, @gib Object[] objArr) {
        md8.checkNotNullParameter(str, "sql");
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            C12327a.f79928a.execPerConnectionSQL(this.f79927a, str, objArr);
            return;
        }
        throw new UnsupportedOperationException("execPerConnectionSQL is not supported on a SDK version lower than 30, current version is: " + i);
    }

    @Override // p000.wfg
    public void execSQL(@yfb String str) throws SQLException {
        md8.checkNotNullParameter(str, "sql");
        this.f79927a.execSQL(str);
    }

    @Override // p000.wfg
    @gib
    public List<Pair<String, String>> getAttachedDbs() {
        return this.f79927a.getAttachedDbs();
    }

    @Override // p000.wfg
    public long getMaximumSize() {
        return this.f79927a.getMaximumSize();
    }

    @Override // p000.wfg
    public long getPageSize() {
        return this.f79927a.getPageSize();
    }

    @Override // p000.wfg
    @gib
    public String getPath() {
        return this.f79927a.getPath();
    }

    @Override // p000.wfg
    public int getVersion() {
        return this.f79927a.getVersion();
    }

    @Override // p000.wfg
    public boolean inTransaction() {
        return this.f79927a.inTransaction();
    }

    @Override // p000.wfg
    public long insert(@yfb String str, int i, @yfb ContentValues contentValues) throws SQLException {
        md8.checkNotNullParameter(str, "table");
        md8.checkNotNullParameter(contentValues, C1171x.f7958g);
        return this.f79927a.insertWithOnConflict(str, null, contentValues, i);
    }

    @Override // p000.wfg
    public boolean isDatabaseIntegrityOk() {
        return this.f79927a.isDatabaseIntegrityOk();
    }

    @Override // p000.wfg
    public boolean isDbLockedByCurrentThread() {
        return this.f79927a.isDbLockedByCurrentThread();
    }

    public final boolean isDelegate(@yfb SQLiteDatabase sQLiteDatabase) {
        md8.checkNotNullParameter(sQLiteDatabase, "sqLiteDatabase");
        return md8.areEqual(this.f79927a, sQLiteDatabase);
    }

    @Override // p000.wfg
    public boolean isExecPerConnectionSQLSupported() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @Override // p000.wfg
    public boolean isOpen() {
        return this.f79927a.isOpen();
    }

    @Override // p000.wfg
    public boolean isReadOnly() {
        return this.f79927a.isReadOnly();
    }

    @Override // p000.wfg
    @c5e(api = 16)
    public boolean isWriteAheadLoggingEnabled() {
        return vfg.C14039a.isWriteAheadLoggingEnabled(this.f79927a);
    }

    @Override // p000.wfg
    public boolean needUpgrade(int i) {
        return this.f79927a.needUpgrade(i);
    }

    @Override // p000.wfg
    @yfb
    public Cursor query(@yfb String str) {
        md8.checkNotNullParameter(str, SearchIntents.EXTRA_QUERY);
        return query(new cjf(str));
    }

    @Override // p000.wfg
    @c5e(api = 16)
    public void setForeignKeyConstraintsEnabled(boolean z) {
        vfg.C14039a.setForeignKeyConstraintsEnabled(this.f79927a, z);
    }

    @Override // p000.wfg
    public void setLocale(@yfb Locale locale) {
        md8.checkNotNullParameter(locale, xs1.f99098B);
        this.f79927a.setLocale(locale);
    }

    @Override // p000.wfg
    public void setMaxSqlCacheSize(int i) {
        this.f79927a.setMaxSqlCacheSize(i);
    }

    /* JADX INFO: renamed from: setMaximumSize, reason: collision with other method in class */
    public void m32223setMaximumSize(long j) {
        this.f79927a.setMaximumSize(j);
    }

    @Override // p000.wfg
    public void setPageSize(long j) {
        this.f79927a.setPageSize(j);
    }

    @Override // p000.wfg
    public void setTransactionSuccessful() {
        this.f79927a.setTransactionSuccessful();
    }

    @Override // p000.wfg
    public void setVersion(int i) {
        this.f79927a.setVersion(i);
    }

    @Override // p000.wfg
    public int update(@yfb String str, int i, @yfb ContentValues contentValues, @gib String str2, @gib Object[] objArr) {
        md8.checkNotNullParameter(str, "table");
        md8.checkNotNullParameter(contentValues, C1171x.f7958g);
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = contentValues.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE ");
        sb.append(f79925c[i]);
        sb.append(str);
        sb.append(" SET ");
        int i2 = 0;
        for (String str3 : contentValues.keySet()) {
            sb.append(i2 > 0 ? "," : "");
            sb.append(str3);
            objArr2[i2] = contentValues.get(str3);
            sb.append("=?");
            i2++;
        }
        if (objArr != null) {
            for (int i3 = size; i3 < length; i3++) {
                objArr2[i3] = objArr[i3 - size];
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        bgg bggVarCompileStatement = compileStatement(string);
        cjf.f16750c.bind(bggVarCompileStatement, objArr2);
        return bggVarCompileStatement.executeUpdateDelete();
    }

    @Override // p000.wfg
    public boolean yieldIfContendedSafely() {
        return this.f79927a.yieldIfContendedSafely();
    }

    @Override // p000.wfg
    public void execSQL(@yfb String str, @yfb Object[] objArr) throws SQLException {
        md8.checkNotNullParameter(str, "sql");
        md8.checkNotNullParameter(objArr, "bindArgs");
        this.f79927a.execSQL(str, objArr);
    }

    @Override // p000.wfg
    @yfb
    public Cursor query(@yfb String str, @yfb Object[] objArr) {
        md8.checkNotNullParameter(str, SearchIntents.EXTRA_QUERY);
        md8.checkNotNullParameter(objArr, "bindArgs");
        return query(new cjf(str, objArr));
    }

    @Override // p000.wfg
    public long setMaximumSize(long j) {
        this.f79927a.setMaximumSize(j);
        return this.f79927a.getMaximumSize();
    }

    @Override // p000.wfg
    public boolean yieldIfContendedSafely(long j) {
        return this.f79927a.yieldIfContendedSafely(j);
    }

    @Override // p000.wfg
    @yfb
    public Cursor query(@yfb zfg zfgVar) {
        md8.checkNotNullParameter(zfgVar, SearchIntents.EXTRA_QUERY);
        final C12329c c12329c = new C12329c(zfgVar);
        Cursor cursorRawQueryWithFactory = this.f79927a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: qw6
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return rw6.query$lambda$0(c12329c, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, zfgVar.getSql(), f79926d, null);
        md8.checkNotNullExpressionValue(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    @Override // p000.wfg
    @c5e(16)
    @yfb
    public Cursor query(@yfb final zfg zfgVar, @gib CancellationSignal cancellationSignal) {
        md8.checkNotNullParameter(zfgVar, SearchIntents.EXTRA_QUERY);
        SQLiteDatabase sQLiteDatabase = this.f79927a;
        String sql = zfgVar.getSql();
        String[] strArr = f79926d;
        md8.checkNotNull(cancellationSignal);
        return vfg.C14039a.rawQueryWithFactory(sQLiteDatabase, sql, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: pw6
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return rw6.query$lambda$1(zfgVar, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
            }
        });
    }
}

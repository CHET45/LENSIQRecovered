package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.lifecycle.C1171x;
import com.google.android.gms.actions.SearchIntents;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import p000.uae;

/* JADX INFO: loaded from: classes3.dex */
public final class dmd implements wfg {

    /* JADX INFO: renamed from: a */
    @yfb
    public final wfg f30066a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Executor f30067b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final uae.InterfaceC13438g f30068c;

    public dmd(@yfb wfg wfgVar, @yfb Executor executor, @yfb uae.InterfaceC13438g interfaceC13438g) {
        md8.checkNotNullParameter(wfgVar, "delegate");
        md8.checkNotNullParameter(executor, "queryCallbackExecutor");
        md8.checkNotNullParameter(interfaceC13438g, "queryCallback");
        this.f30066a = wfgVar;
        this.f30067b = executor;
        this.f30068c = interfaceC13438g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void beginTransaction$lambda$0(dmd dmdVar) {
        md8.checkNotNullParameter(dmdVar, "this$0");
        dmdVar.f30068c.onQuery("BEGIN EXCLUSIVE TRANSACTION", l82.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void beginTransactionNonExclusive$lambda$1(dmd dmdVar) {
        md8.checkNotNullParameter(dmdVar, "this$0");
        dmdVar.f30068c.onQuery("BEGIN DEFERRED TRANSACTION", l82.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void beginTransactionWithListener$lambda$2(dmd dmdVar) {
        md8.checkNotNullParameter(dmdVar, "this$0");
        dmdVar.f30068c.onQuery("BEGIN EXCLUSIVE TRANSACTION", l82.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void beginTransactionWithListenerNonExclusive$lambda$3(dmd dmdVar) {
        md8.checkNotNullParameter(dmdVar, "this$0");
        dmdVar.f30068c.onQuery("BEGIN DEFERRED TRANSACTION", l82.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endTransaction$lambda$4(dmd dmdVar) {
        md8.checkNotNullParameter(dmdVar, "this$0");
        dmdVar.f30068c.onQuery("END TRANSACTION", l82.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execSQL$lambda$10(dmd dmdVar, String str) {
        md8.checkNotNullParameter(dmdVar, "this$0");
        md8.checkNotNullParameter(str, "$sql");
        dmdVar.f30068c.onQuery(str, l82.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execSQL$lambda$11(dmd dmdVar, String str, List list) {
        md8.checkNotNullParameter(dmdVar, "this$0");
        md8.checkNotNullParameter(str, "$sql");
        md8.checkNotNullParameter(list, "$inputArguments");
        dmdVar.f30068c.onQuery(str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void query$lambda$6(dmd dmdVar, String str) {
        md8.checkNotNullParameter(dmdVar, "this$0");
        md8.checkNotNullParameter(str, "$query");
        dmdVar.f30068c.onQuery(str, l82.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void query$lambda$7(dmd dmdVar, String str, Object[] objArr) {
        md8.checkNotNullParameter(dmdVar, "this$0");
        md8.checkNotNullParameter(str, "$query");
        md8.checkNotNullParameter(objArr, "$bindArgs");
        dmdVar.f30068c.onQuery(str, e80.toList(objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void query$lambda$8(dmd dmdVar, zfg zfgVar, gmd gmdVar) {
        md8.checkNotNullParameter(dmdVar, "this$0");
        md8.checkNotNullParameter(zfgVar, "$query");
        md8.checkNotNullParameter(gmdVar, "$queryInterceptorProgram");
        dmdVar.f30068c.onQuery(zfgVar.getSql(), gmdVar.getBindArgsCache$room_runtime_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void query$lambda$9(dmd dmdVar, zfg zfgVar, gmd gmdVar) {
        md8.checkNotNullParameter(dmdVar, "this$0");
        md8.checkNotNullParameter(zfgVar, "$query");
        md8.checkNotNullParameter(gmdVar, "$queryInterceptorProgram");
        dmdVar.f30068c.onQuery(zfgVar.getSql(), gmdVar.getBindArgsCache$room_runtime_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTransactionSuccessful$lambda$5(dmd dmdVar) {
        md8.checkNotNullParameter(dmdVar, "this$0");
        dmdVar.f30068c.onQuery("TRANSACTION SUCCESSFUL", l82.emptyList());
    }

    @Override // p000.wfg
    public void beginTransaction() {
        this.f30067b.execute(new Runnable() { // from class: wld
            @Override // java.lang.Runnable
            public final void run() {
                dmd.beginTransaction$lambda$0(this.f94651a);
            }
        });
        this.f30066a.beginTransaction();
    }

    @Override // p000.wfg
    public void beginTransactionNonExclusive() {
        this.f30067b.execute(new Runnable() { // from class: yld
            @Override // java.lang.Runnable
            public final void run() {
                dmd.beginTransactionNonExclusive$lambda$1(this.f102027a);
            }
        });
        this.f30066a.beginTransactionNonExclusive();
    }

    @Override // p000.wfg
    public void beginTransactionWithListener(@yfb SQLiteTransactionListener sQLiteTransactionListener) {
        md8.checkNotNullParameter(sQLiteTransactionListener, "transactionListener");
        this.f30067b.execute(new Runnable() { // from class: bmd
            @Override // java.lang.Runnable
            public final void run() {
                dmd.beginTransactionWithListener$lambda$2(this.f14149a);
            }
        });
        this.f30066a.beginTransactionWithListener(sQLiteTransactionListener);
    }

    @Override // p000.wfg
    public void beginTransactionWithListenerNonExclusive(@yfb SQLiteTransactionListener sQLiteTransactionListener) {
        md8.checkNotNullParameter(sQLiteTransactionListener, "transactionListener");
        this.f30067b.execute(new Runnable() { // from class: sld
            @Override // java.lang.Runnable
            public final void run() {
                dmd.beginTransactionWithListenerNonExclusive$lambda$3(this.f82191a);
            }
        });
        this.f30066a.beginTransactionWithListenerNonExclusive(sQLiteTransactionListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f30066a.close();
    }

    @Override // p000.wfg
    @yfb
    public bgg compileStatement(@yfb String str) {
        md8.checkNotNullParameter(str, "sql");
        return new mmd(this.f30066a.compileStatement(str), str, this.f30067b, this.f30068c);
    }

    @Override // p000.wfg
    public int delete(@yfb String str, @gib String str2, @gib Object[] objArr) {
        md8.checkNotNullParameter(str, "table");
        return this.f30066a.delete(str, str2, objArr);
    }

    @Override // p000.wfg
    @c5e(api = 16)
    public void disableWriteAheadLogging() {
        this.f30066a.disableWriteAheadLogging();
    }

    @Override // p000.wfg
    public boolean enableWriteAheadLogging() {
        return this.f30066a.enableWriteAheadLogging();
    }

    @Override // p000.wfg
    public void endTransaction() {
        this.f30067b.execute(new Runnable() { // from class: rld
            @Override // java.lang.Runnable
            public final void run() {
                dmd.endTransaction$lambda$4(this.f78648a);
            }
        });
        this.f30066a.endTransaction();
    }

    @Override // p000.wfg
    public void execPerConnectionSQL(@yfb String str, @gib @igg({"ArrayReturn"}) Object[] objArr) {
        md8.checkNotNullParameter(str, "sql");
        this.f30066a.execPerConnectionSQL(str, objArr);
    }

    @Override // p000.wfg
    public void execSQL(@yfb final String str) {
        md8.checkNotNullParameter(str, "sql");
        this.f30067b.execute(new Runnable() { // from class: vld
            @Override // java.lang.Runnable
            public final void run() {
                dmd.execSQL$lambda$10(this.f91614a, str);
            }
        });
        this.f30066a.execSQL(str);
    }

    @Override // p000.wfg
    @gib
    public List<Pair<String, String>> getAttachedDbs() {
        return this.f30066a.getAttachedDbs();
    }

    @Override // p000.wfg
    public long getMaximumSize() {
        return this.f30066a.getMaximumSize();
    }

    @Override // p000.wfg
    public long getPageSize() {
        return this.f30066a.getPageSize();
    }

    @Override // p000.wfg
    @gib
    public String getPath() {
        return this.f30066a.getPath();
    }

    @Override // p000.wfg
    public int getVersion() {
        return this.f30066a.getVersion();
    }

    @Override // p000.wfg
    public boolean inTransaction() {
        return this.f30066a.inTransaction();
    }

    @Override // p000.wfg
    public long insert(@yfb String str, int i, @yfb ContentValues contentValues) {
        md8.checkNotNullParameter(str, "table");
        md8.checkNotNullParameter(contentValues, C1171x.f7958g);
        return this.f30066a.insert(str, i, contentValues);
    }

    @Override // p000.wfg
    public boolean isDatabaseIntegrityOk() {
        return this.f30066a.isDatabaseIntegrityOk();
    }

    @Override // p000.wfg
    public boolean isDbLockedByCurrentThread() {
        return this.f30066a.isDbLockedByCurrentThread();
    }

    @Override // p000.wfg
    public boolean isExecPerConnectionSQLSupported() {
        return this.f30066a.isExecPerConnectionSQLSupported();
    }

    @Override // p000.wfg
    public boolean isOpen() {
        return this.f30066a.isOpen();
    }

    @Override // p000.wfg
    public boolean isReadOnly() {
        return this.f30066a.isReadOnly();
    }

    @Override // p000.wfg
    @c5e(api = 16)
    public boolean isWriteAheadLoggingEnabled() {
        return this.f30066a.isWriteAheadLoggingEnabled();
    }

    @Override // p000.wfg
    public boolean needUpgrade(int i) {
        return this.f30066a.needUpgrade(i);
    }

    @Override // p000.wfg
    @yfb
    public Cursor query(@yfb final String str) {
        md8.checkNotNullParameter(str, SearchIntents.EXTRA_QUERY);
        this.f30067b.execute(new Runnable() { // from class: tld
            @Override // java.lang.Runnable
            public final void run() {
                dmd.query$lambda$6(this.f85271a, str);
            }
        });
        return this.f30066a.query(str);
    }

    @Override // p000.wfg
    @c5e(api = 16)
    public void setForeignKeyConstraintsEnabled(boolean z) {
        this.f30066a.setForeignKeyConstraintsEnabled(z);
    }

    @Override // p000.wfg
    public void setLocale(@yfb Locale locale) {
        md8.checkNotNullParameter(locale, xs1.f99098B);
        this.f30066a.setLocale(locale);
    }

    @Override // p000.wfg
    public void setMaxSqlCacheSize(int i) {
        this.f30066a.setMaxSqlCacheSize(i);
    }

    @Override // p000.wfg
    public long setMaximumSize(long j) {
        return this.f30066a.setMaximumSize(j);
    }

    @Override // p000.wfg
    public void setPageSize(long j) {
        this.f30066a.setPageSize(j);
    }

    @Override // p000.wfg
    public void setTransactionSuccessful() {
        this.f30067b.execute(new Runnable() { // from class: xld
            @Override // java.lang.Runnable
            public final void run() {
                dmd.setTransactionSuccessful$lambda$5(this.f98436a);
            }
        });
        this.f30066a.setTransactionSuccessful();
    }

    @Override // p000.wfg
    public void setVersion(int i) {
        this.f30066a.setVersion(i);
    }

    @Override // p000.wfg
    public int update(@yfb String str, int i, @yfb ContentValues contentValues, @gib String str2, @gib Object[] objArr) {
        md8.checkNotNullParameter(str, "table");
        md8.checkNotNullParameter(contentValues, C1171x.f7958g);
        return this.f30066a.update(str, i, contentValues, str2, objArr);
    }

    @Override // p000.wfg
    public boolean yieldIfContendedSafely() {
        return this.f30066a.yieldIfContendedSafely();
    }

    @Override // p000.wfg
    public boolean yieldIfContendedSafely(long j) {
        return this.f30066a.yieldIfContendedSafely(j);
    }

    @Override // p000.wfg
    public void execSQL(@yfb final String str, @yfb Object[] objArr) {
        md8.checkNotNullParameter(str, "sql");
        md8.checkNotNullParameter(objArr, "bindArgs");
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(k82.listOf(objArr));
        this.f30067b.execute(new Runnable() { // from class: zld
            @Override // java.lang.Runnable
            public final void run() {
                dmd.execSQL$lambda$11(this.f105425a, str, arrayList);
            }
        });
        this.f30066a.execSQL(str, new List[]{arrayList});
    }

    @Override // p000.wfg
    @yfb
    public Cursor query(@yfb final String str, @yfb final Object[] objArr) {
        md8.checkNotNullParameter(str, SearchIntents.EXTRA_QUERY);
        md8.checkNotNullParameter(objArr, "bindArgs");
        this.f30067b.execute(new Runnable() { // from class: uld
            @Override // java.lang.Runnable
            public final void run() {
                dmd.query$lambda$7(this.f88401a, str, objArr);
            }
        });
        return this.f30066a.query(str, objArr);
    }

    @Override // p000.wfg
    @yfb
    public Cursor query(@yfb final zfg zfgVar) {
        md8.checkNotNullParameter(zfgVar, SearchIntents.EXTRA_QUERY);
        final gmd gmdVar = new gmd();
        zfgVar.bindTo(gmdVar);
        this.f30067b.execute(new Runnable() { // from class: amd
            @Override // java.lang.Runnable
            public final void run() {
                dmd.query$lambda$8(this.f2121a, zfgVar, gmdVar);
            }
        });
        return this.f30066a.query(zfgVar);
    }

    @Override // p000.wfg
    @yfb
    public Cursor query(@yfb final zfg zfgVar, @gib CancellationSignal cancellationSignal) {
        md8.checkNotNullParameter(zfgVar, SearchIntents.EXTRA_QUERY);
        final gmd gmdVar = new gmd();
        zfgVar.bindTo(gmdVar);
        this.f30067b.execute(new Runnable() { // from class: cmd
            @Override // java.lang.Runnable
            public final void run() {
                dmd.query$lambda$9(this.f16966a, zfgVar, gmdVar);
            }
        });
        return this.f30066a.query(zfgVar);
    }
}

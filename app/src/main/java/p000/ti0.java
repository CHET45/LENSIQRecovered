package p000;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.C1171x;
import com.google.android.gms.actions.SearchIntents;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p000.vfg;

/* JADX INFO: loaded from: classes3.dex */
public final class ti0 implements xfg, e44 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final xfg f84903a;

    /* JADX INFO: renamed from: b */
    @un8
    @yfb
    public final si0 f84904b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final C13056a f84905c;

    /* JADX INFO: renamed from: ti0$a */
    public static final class C13056a implements wfg {

        /* JADX INFO: renamed from: a */
        @yfb
        public final si0 f84906a;

        /* JADX INFO: renamed from: ti0$a$a */
        public static final class a extends tt8 implements qy6<wfg, List<? extends Pair<String, String>>> {

            /* JADX INFO: renamed from: a */
            public static final a f84907a = new a();

            public a() {
                super(1);
            }

            @Override // p000.qy6
            @gib
            public final List<Pair<String, String>> invoke(@yfb wfg wfgVar) {
                md8.checkNotNullParameter(wfgVar, IconCompat.f7419A);
                return wfgVar.getAttachedDbs();
            }
        }

        /* JADX INFO: renamed from: ti0$a$b */
        public static final class b extends tt8 implements qy6<wfg, Integer> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f84908a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f84909b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Object[] f84910c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, String str2, Object[] objArr) {
                super(1);
                this.f84908a = str;
                this.f84909b = str2;
                this.f84910c = objArr;
            }

            @Override // p000.qy6
            @yfb
            public final Integer invoke(@yfb wfg wfgVar) {
                md8.checkNotNullParameter(wfgVar, "db");
                return Integer.valueOf(wfgVar.delete(this.f84908a, this.f84909b, this.f84910c));
            }
        }

        /* JADX INFO: renamed from: ti0$a$c */
        public static final class c extends tt8 implements qy6<wfg, Object> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f84911a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str) {
                super(1);
                this.f84911a = str;
            }

            @Override // p000.qy6
            @gib
            public final Object invoke(@yfb wfg wfgVar) {
                md8.checkNotNullParameter(wfgVar, "db");
                wfgVar.execSQL(this.f84911a);
                return null;
            }
        }

        /* JADX INFO: renamed from: ti0$a$d */
        public static final class d extends tt8 implements qy6<wfg, Object> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f84912a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Object[] f84913b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str, Object[] objArr) {
                super(1);
                this.f84912a = str;
                this.f84913b = objArr;
            }

            @Override // p000.qy6
            @gib
            public final Object invoke(@yfb wfg wfgVar) {
                md8.checkNotNullParameter(wfgVar, "db");
                wfgVar.execSQL(this.f84912a, this.f84913b);
                return null;
            }
        }

        /* JADX INFO: renamed from: ti0$a$e */
        public /* synthetic */ class e extends n07 implements qy6<wfg, Boolean> {

            /* JADX INFO: renamed from: a */
            public static final e f84914a = new e();

            public e() {
                super(1, wfg.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // p000.qy6
            @yfb
            public final Boolean invoke(@yfb wfg wfgVar) {
                md8.checkNotNullParameter(wfgVar, "p0");
                return Boolean.valueOf(wfgVar.inTransaction());
            }
        }

        /* JADX INFO: renamed from: ti0$a$f */
        public static final class f extends tt8 implements qy6<wfg, Long> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f84915a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f84916b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ ContentValues f84917c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(String str, int i, ContentValues contentValues) {
                super(1);
                this.f84915a = str;
                this.f84916b = i;
                this.f84917c = contentValues;
            }

            @Override // p000.qy6
            @yfb
            public final Long invoke(@yfb wfg wfgVar) {
                md8.checkNotNullParameter(wfgVar, "db");
                return Long.valueOf(wfgVar.insert(this.f84915a, this.f84916b, this.f84917c));
            }
        }

        /* JADX INFO: renamed from: ti0$a$g */
        public static final class g extends tt8 implements qy6<wfg, Boolean> {

            /* JADX INFO: renamed from: a */
            public static final g f84918a = new g();

            public g() {
                super(1);
            }

            @Override // p000.qy6
            @yfb
            public final Boolean invoke(@yfb wfg wfgVar) {
                md8.checkNotNullParameter(wfgVar, IconCompat.f7419A);
                return Boolean.valueOf(wfgVar.isDatabaseIntegrityOk());
            }
        }

        /* JADX INFO: renamed from: ti0$a$i */
        public static final class i extends tt8 implements qy6<wfg, Boolean> {

            /* JADX INFO: renamed from: a */
            public static final i f84920a = new i();

            public i() {
                super(1);
            }

            @Override // p000.qy6
            @yfb
            public final Boolean invoke(@yfb wfg wfgVar) {
                md8.checkNotNullParameter(wfgVar, IconCompat.f7419A);
                return Boolean.valueOf(wfgVar.isReadOnly());
            }
        }

        /* JADX INFO: renamed from: ti0$a$j */
        public static final class j extends tt8 implements qy6<wfg, Boolean> {

            /* JADX INFO: renamed from: a */
            public static final j f84921a = new j();

            public j() {
                super(1);
            }

            @Override // p000.qy6
            @yfb
            public final Boolean invoke(@yfb wfg wfgVar) {
                md8.checkNotNullParameter(wfgVar, "db");
                return Boolean.valueOf(wfgVar.isWriteAheadLoggingEnabled());
            }
        }

        /* JADX INFO: renamed from: ti0$a$l */
        public static final class l extends tt8 implements qy6<wfg, Boolean> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f84923a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public l(int i) {
                super(1);
                this.f84923a = i;
            }

            @Override // p000.qy6
            @yfb
            public final Boolean invoke(@yfb wfg wfgVar) {
                md8.checkNotNullParameter(wfgVar, "db");
                return Boolean.valueOf(wfgVar.needUpgrade(this.f84923a));
            }
        }

        /* JADX INFO: renamed from: ti0$a$n */
        public static final class n extends tt8 implements qy6<wfg, Object> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ long f84925a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(long j) {
                super(1);
                this.f84925a = j;
            }

            @Override // p000.qy6
            @gib
            public final Object invoke(@yfb wfg wfgVar) {
                md8.checkNotNullParameter(wfgVar, "db");
                wfgVar.setPageSize(this.f84925a);
                return null;
            }
        }

        /* JADX INFO: renamed from: ti0$a$o */
        public static final class o extends tt8 implements qy6<wfg, String> {

            /* JADX INFO: renamed from: a */
            public static final o f84926a = new o();

            public o() {
                super(1);
            }

            @Override // p000.qy6
            @gib
            public final String invoke(@yfb wfg wfgVar) {
                md8.checkNotNullParameter(wfgVar, IconCompat.f7419A);
                return wfgVar.getPath();
            }
        }

        /* JADX INFO: renamed from: ti0$a$p */
        public static final class p extends tt8 implements qy6<wfg, Object> {

            /* JADX INFO: renamed from: a */
            public static final p f84927a = new p();

            public p() {
                super(1);
            }

            @Override // p000.qy6
            @gib
            public final Object invoke(@yfb wfg wfgVar) {
                md8.checkNotNullParameter(wfgVar, "it");
                return null;
            }
        }

        /* JADX INFO: renamed from: ti0$a$q */
        public static final class q extends tt8 implements qy6<wfg, Object> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ boolean f84928a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public q(boolean z) {
                super(1);
                this.f84928a = z;
            }

            @Override // p000.qy6
            @gib
            public final Object invoke(@yfb wfg wfgVar) {
                md8.checkNotNullParameter(wfgVar, "db");
                wfgVar.setForeignKeyConstraintsEnabled(this.f84928a);
                return null;
            }
        }

        /* JADX INFO: renamed from: ti0$a$r */
        public static final class r extends tt8 implements qy6<wfg, Object> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Locale f84929a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public r(Locale locale) {
                super(1);
                this.f84929a = locale;
            }

            @Override // p000.qy6
            @gib
            public final Object invoke(@yfb wfg wfgVar) {
                md8.checkNotNullParameter(wfgVar, "db");
                wfgVar.setLocale(this.f84929a);
                return null;
            }
        }

        /* JADX INFO: renamed from: ti0$a$s */
        public static final class s extends tt8 implements qy6<wfg, Object> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f84930a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public s(int i) {
                super(1);
                this.f84930a = i;
            }

            @Override // p000.qy6
            @gib
            public final Object invoke(@yfb wfg wfgVar) {
                md8.checkNotNullParameter(wfgVar, "db");
                wfgVar.setMaxSqlCacheSize(this.f84930a);
                return null;
            }
        }

        /* JADX INFO: renamed from: ti0$a$t */
        public static final class t extends tt8 implements qy6<wfg, Long> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ long f84931a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public t(long j) {
                super(1);
                this.f84931a = j;
            }

            @Override // p000.qy6
            @yfb
            public final Long invoke(@yfb wfg wfgVar) {
                md8.checkNotNullParameter(wfgVar, "db");
                return Long.valueOf(wfgVar.setMaximumSize(this.f84931a));
            }
        }

        /* JADX INFO: renamed from: ti0$a$u */
        public static final class u extends tt8 implements qy6<wfg, Integer> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f84932a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f84933b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ ContentValues f84934c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ String f84935d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ Object[] f84936e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public u(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
                super(1);
                this.f84932a = str;
                this.f84933b = i;
                this.f84934c = contentValues;
                this.f84935d = str2;
                this.f84936e = objArr;
            }

            @Override // p000.qy6
            @yfb
            public final Integer invoke(@yfb wfg wfgVar) {
                md8.checkNotNullParameter(wfgVar, "db");
                return Integer.valueOf(wfgVar.update(this.f84932a, this.f84933b, this.f84934c, this.f84935d, this.f84936e));
            }
        }

        /* JADX INFO: renamed from: ti0$a$w */
        public static final class w extends tt8 implements qy6<wfg, Object> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f84938a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public w(int i) {
                super(1);
                this.f84938a = i;
            }

            @Override // p000.qy6
            @gib
            public final Object invoke(@yfb wfg wfgVar) {
                md8.checkNotNullParameter(wfgVar, "db");
                wfgVar.setVersion(this.f84938a);
                return null;
            }
        }

        /* JADX INFO: renamed from: ti0$a$x */
        public /* synthetic */ class x extends n07 implements qy6<wfg, Boolean> {

            /* JADX INFO: renamed from: a */
            public static final x f84939a = new x();

            public x() {
                super(1, wfg.class, "yieldIfContendedSafely", "yieldIfContendedSafely()Z", 0);
            }

            @Override // p000.qy6
            @yfb
            public final Boolean invoke(@yfb wfg wfgVar) {
                md8.checkNotNullParameter(wfgVar, "p0");
                return Boolean.valueOf(wfgVar.yieldIfContendedSafely());
            }
        }

        /* JADX INFO: renamed from: ti0$a$y */
        public /* synthetic */ class y extends n07 implements qy6<wfg, Boolean> {

            /* JADX INFO: renamed from: a */
            public static final y f84940a = new y();

            public y() {
                super(1, wfg.class, "yieldIfContendedSafely", "yieldIfContendedSafely()Z", 0);
            }

            @Override // p000.qy6
            @yfb
            public final Boolean invoke(@yfb wfg wfgVar) {
                md8.checkNotNullParameter(wfgVar, "p0");
                return Boolean.valueOf(wfgVar.yieldIfContendedSafely());
            }
        }

        public C13056a(@yfb si0 si0Var) {
            md8.checkNotNullParameter(si0Var, "autoCloser");
            this.f84906a = si0Var;
        }

        @Override // p000.wfg
        public void beginTransaction() {
            try {
                this.f84906a.incrementCountAndEnsureDbIsOpen().beginTransaction();
            } catch (Throwable th) {
                this.f84906a.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // p000.wfg
        public void beginTransactionNonExclusive() {
            try {
                this.f84906a.incrementCountAndEnsureDbIsOpen().beginTransactionNonExclusive();
            } catch (Throwable th) {
                this.f84906a.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // p000.wfg
        public void beginTransactionWithListener(@yfb SQLiteTransactionListener sQLiteTransactionListener) {
            md8.checkNotNullParameter(sQLiteTransactionListener, "transactionListener");
            try {
                this.f84906a.incrementCountAndEnsureDbIsOpen().beginTransactionWithListener(sQLiteTransactionListener);
            } catch (Throwable th) {
                this.f84906a.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // p000.wfg
        public void beginTransactionWithListenerNonExclusive(@yfb SQLiteTransactionListener sQLiteTransactionListener) {
            md8.checkNotNullParameter(sQLiteTransactionListener, "transactionListener");
            try {
                this.f84906a.incrementCountAndEnsureDbIsOpen().beginTransactionWithListenerNonExclusive(sQLiteTransactionListener);
            } catch (Throwable th) {
                this.f84906a.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f84906a.closeDatabaseIfOpen();
        }

        @Override // p000.wfg
        @yfb
        public bgg compileStatement(@yfb String str) {
            md8.checkNotNullParameter(str, "sql");
            return new C13057b(str, this.f84906a);
        }

        @Override // p000.wfg
        public int delete(@yfb String str, @gib String str2, @gib Object[] objArr) {
            md8.checkNotNullParameter(str, "table");
            return ((Number) this.f84906a.executeRefCountingFunction(new b(str, str2, objArr))).intValue();
        }

        @Override // p000.wfg
        public void disableWriteAheadLogging() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // p000.wfg
        public boolean enableWriteAheadLogging() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // p000.wfg
        public void endTransaction() {
            if (this.f84906a.getDelegateDatabase$room_runtime_release() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                wfg delegateDatabase$room_runtime_release = this.f84906a.getDelegateDatabase$room_runtime_release();
                md8.checkNotNull(delegateDatabase$room_runtime_release);
                delegateDatabase$room_runtime_release.endTransaction();
            } finally {
                this.f84906a.decrementCountAndScheduleClose();
            }
        }

        @Override // p000.wfg
        public void execSQL(@yfb String str) throws SQLException {
            md8.checkNotNullParameter(str, "sql");
            this.f84906a.executeRefCountingFunction(new c(str));
        }

        @Override // p000.wfg
        @gib
        public List<Pair<String, String>> getAttachedDbs() {
            return (List) this.f84906a.executeRefCountingFunction(a.f84907a);
        }

        @Override // p000.wfg
        public long getMaximumSize() {
            return ((Number) this.f84906a.executeRefCountingFunction(new ogd() { // from class: ti0.a.k
                @Override // p000.ogd, p000.jp8
                @gib
                public Object get(@gib Object obj) {
                    return Long.valueOf(((wfg) obj).getMaximumSize());
                }
            })).longValue();
        }

        @Override // p000.wfg
        public long getPageSize() {
            return ((Number) this.f84906a.executeRefCountingFunction(new m6b() { // from class: ti0.a.m
                @Override // p000.m6b, p000.jp8
                @gib
                public Object get(@gib Object obj) {
                    return Long.valueOf(((wfg) obj).getPageSize());
                }

                @Override // p000.m6b, p000.dp8
                public void set(@gib Object obj, @gib Object obj2) {
                    ((wfg) obj).setPageSize(((Number) obj2).longValue());
                }
            })).longValue();
        }

        @Override // p000.wfg
        @gib
        public String getPath() {
            return (String) this.f84906a.executeRefCountingFunction(o.f84926a);
        }

        @Override // p000.wfg
        public int getVersion() {
            return ((Number) this.f84906a.executeRefCountingFunction(new m6b() { // from class: ti0.a.v
                @Override // p000.m6b, p000.jp8
                @gib
                public Object get(@gib Object obj) {
                    return Integer.valueOf(((wfg) obj).getVersion());
                }

                @Override // p000.m6b, p000.dp8
                public void set(@gib Object obj, @gib Object obj2) {
                    ((wfg) obj).setVersion(((Number) obj2).intValue());
                }
            })).intValue();
        }

        @Override // p000.wfg
        public boolean inTransaction() {
            if (this.f84906a.getDelegateDatabase$room_runtime_release() == null) {
                return false;
            }
            return ((Boolean) this.f84906a.executeRefCountingFunction(e.f84914a)).booleanValue();
        }

        @Override // p000.wfg
        public long insert(@yfb String str, int i2, @yfb ContentValues contentValues) throws SQLException {
            md8.checkNotNullParameter(str, "table");
            md8.checkNotNullParameter(contentValues, C1171x.f7958g);
            return ((Number) this.f84906a.executeRefCountingFunction(new f(str, i2, contentValues))).longValue();
        }

        @Override // p000.wfg
        public boolean isDatabaseIntegrityOk() {
            return ((Boolean) this.f84906a.executeRefCountingFunction(g.f84918a)).booleanValue();
        }

        @Override // p000.wfg
        public boolean isDbLockedByCurrentThread() {
            if (this.f84906a.getDelegateDatabase$room_runtime_release() == null) {
                return false;
            }
            return ((Boolean) this.f84906a.executeRefCountingFunction(new ogd() { // from class: ti0.a.h
                @Override // p000.ogd, p000.jp8
                @gib
                public Object get(@gib Object obj) {
                    return Boolean.valueOf(((wfg) obj).isDbLockedByCurrentThread());
                }
            })).booleanValue();
        }

        @Override // p000.wfg
        public boolean isOpen() {
            wfg delegateDatabase$room_runtime_release = this.f84906a.getDelegateDatabase$room_runtime_release();
            if (delegateDatabase$room_runtime_release == null) {
                return false;
            }
            return delegateDatabase$room_runtime_release.isOpen();
        }

        @Override // p000.wfg
        public boolean isReadOnly() {
            return ((Boolean) this.f84906a.executeRefCountingFunction(i.f84920a)).booleanValue();
        }

        @Override // p000.wfg
        @c5e(api = 16)
        public boolean isWriteAheadLoggingEnabled() {
            return ((Boolean) this.f84906a.executeRefCountingFunction(j.f84921a)).booleanValue();
        }

        @Override // p000.wfg
        public boolean needUpgrade(int i2) {
            return ((Boolean) this.f84906a.executeRefCountingFunction(new l(i2))).booleanValue();
        }

        public final void pokeOpen() {
            this.f84906a.executeRefCountingFunction(p.f84927a);
        }

        @Override // p000.wfg
        @yfb
        public Cursor query(@yfb String str) {
            md8.checkNotNullParameter(str, SearchIntents.EXTRA_QUERY);
            try {
                return new C13058c(this.f84906a.incrementCountAndEnsureDbIsOpen().query(str), this.f84906a);
            } catch (Throwable th) {
                this.f84906a.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // p000.wfg
        @c5e(api = 16)
        public void setForeignKeyConstraintsEnabled(boolean z) {
            this.f84906a.executeRefCountingFunction(new q(z));
        }

        @Override // p000.wfg
        public void setLocale(@yfb Locale locale) {
            md8.checkNotNullParameter(locale, xs1.f99098B);
            this.f84906a.executeRefCountingFunction(new r(locale));
        }

        @Override // p000.wfg
        public void setMaxSqlCacheSize(int i2) {
            this.f84906a.executeRefCountingFunction(new s(i2));
        }

        @Override // p000.wfg
        public long setMaximumSize(long j2) {
            return ((Number) this.f84906a.executeRefCountingFunction(new t(j2))).longValue();
        }

        @Override // p000.wfg
        public void setPageSize(long j2) {
            this.f84906a.executeRefCountingFunction(new n(j2));
        }

        @Override // p000.wfg
        public void setTransactionSuccessful() {
            bth bthVar;
            wfg delegateDatabase$room_runtime_release = this.f84906a.getDelegateDatabase$room_runtime_release();
            if (delegateDatabase$room_runtime_release != null) {
                delegateDatabase$room_runtime_release.setTransactionSuccessful();
                bthVar = bth.f14751a;
            } else {
                bthVar = null;
            }
            if (bthVar == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
        }

        @Override // p000.wfg
        public void setVersion(int i2) {
            this.f84906a.executeRefCountingFunction(new w(i2));
        }

        @Override // p000.wfg
        public int update(@yfb String str, int i2, @yfb ContentValues contentValues, @gib String str2, @gib Object[] objArr) {
            md8.checkNotNullParameter(str, "table");
            md8.checkNotNullParameter(contentValues, C1171x.f7958g);
            return ((Number) this.f84906a.executeRefCountingFunction(new u(str, i2, contentValues, str2, objArr))).intValue();
        }

        @Override // p000.wfg
        public boolean yieldIfContendedSafely() {
            return ((Boolean) this.f84906a.executeRefCountingFunction(x.f84939a)).booleanValue();
        }

        @Override // p000.wfg
        public void execSQL(@yfb String str, @yfb Object[] objArr) throws SQLException {
            md8.checkNotNullParameter(str, "sql");
            md8.checkNotNullParameter(objArr, "bindArgs");
            this.f84906a.executeRefCountingFunction(new d(str, objArr));
        }

        @Override // p000.wfg
        public boolean yieldIfContendedSafely(long j2) {
            return ((Boolean) this.f84906a.executeRefCountingFunction(y.f84940a)).booleanValue();
        }

        @Override // p000.wfg
        @yfb
        public Cursor query(@yfb String str, @yfb Object[] objArr) {
            md8.checkNotNullParameter(str, SearchIntents.EXTRA_QUERY);
            md8.checkNotNullParameter(objArr, "bindArgs");
            try {
                return new C13058c(this.f84906a.incrementCountAndEnsureDbIsOpen().query(str, objArr), this.f84906a);
            } catch (Throwable th) {
                this.f84906a.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // p000.wfg
        @yfb
        public Cursor query(@yfb zfg zfgVar) {
            md8.checkNotNullParameter(zfgVar, SearchIntents.EXTRA_QUERY);
            try {
                return new C13058c(this.f84906a.incrementCountAndEnsureDbIsOpen().query(zfgVar), this.f84906a);
            } catch (Throwable th) {
                this.f84906a.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // p000.wfg
        @c5e(api = 24)
        @yfb
        public Cursor query(@yfb zfg zfgVar, @gib CancellationSignal cancellationSignal) {
            md8.checkNotNullParameter(zfgVar, SearchIntents.EXTRA_QUERY);
            try {
                return new C13058c(this.f84906a.incrementCountAndEnsureDbIsOpen().query(zfgVar, cancellationSignal), this.f84906a);
            } catch (Throwable th) {
                this.f84906a.decrementCountAndScheduleClose();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ti0$b */
    public static final class C13057b implements bgg {

        /* JADX INFO: renamed from: a */
        @yfb
        public final String f84941a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final si0 f84942b;

        /* JADX INFO: renamed from: c */
        @yfb
        public final ArrayList<Object> f84943c;

        /* JADX INFO: renamed from: ti0$b$a */
        public static final class a extends tt8 implements qy6<bgg, Object> {

            /* JADX INFO: renamed from: a */
            public static final a f84944a = new a();

            public a() {
                super(1);
            }

            @Override // p000.qy6
            @gib
            public final Object invoke(@yfb bgg bggVar) {
                md8.checkNotNullParameter(bggVar, "statement");
                bggVar.execute();
                return null;
            }
        }

        /* JADX INFO: renamed from: ti0$b$b */
        public static final class b extends tt8 implements qy6<bgg, Long> {

            /* JADX INFO: renamed from: a */
            public static final b f84945a = new b();

            public b() {
                super(1);
            }

            @Override // p000.qy6
            @yfb
            public final Long invoke(@yfb bgg bggVar) {
                md8.checkNotNullParameter(bggVar, IconCompat.f7419A);
                return Long.valueOf(bggVar.executeInsert());
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: ti0$b$c */
        public static final class c<T> extends tt8 implements qy6<wfg, T> {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ qy6<bgg, T> f84947b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(qy6<? super bgg, ? extends T> qy6Var) {
                super(1);
                this.f84947b = qy6Var;
            }

            @Override // p000.qy6
            public final T invoke(@yfb wfg wfgVar) {
                md8.checkNotNullParameter(wfgVar, "db");
                bgg bggVarCompileStatement = wfgVar.compileStatement(C13057b.this.f84941a);
                C13057b.this.doBinds(bggVarCompileStatement);
                return this.f84947b.invoke(bggVarCompileStatement);
            }
        }

        /* JADX INFO: renamed from: ti0$b$d */
        public static final class d extends tt8 implements qy6<bgg, Integer> {

            /* JADX INFO: renamed from: a */
            public static final d f84948a = new d();

            public d() {
                super(1);
            }

            @Override // p000.qy6
            @yfb
            public final Integer invoke(@yfb bgg bggVar) {
                md8.checkNotNullParameter(bggVar, IconCompat.f7419A);
                return Integer.valueOf(bggVar.executeUpdateDelete());
            }
        }

        /* JADX INFO: renamed from: ti0$b$e */
        public static final class e extends tt8 implements qy6<bgg, Long> {

            /* JADX INFO: renamed from: a */
            public static final e f84949a = new e();

            public e() {
                super(1);
            }

            @Override // p000.qy6
            @yfb
            public final Long invoke(@yfb bgg bggVar) {
                md8.checkNotNullParameter(bggVar, IconCompat.f7419A);
                return Long.valueOf(bggVar.simpleQueryForLong());
            }
        }

        /* JADX INFO: renamed from: ti0$b$f */
        public static final class f extends tt8 implements qy6<bgg, String> {

            /* JADX INFO: renamed from: a */
            public static final f f84950a = new f();

            public f() {
                super(1);
            }

            @Override // p000.qy6
            @gib
            public final String invoke(@yfb bgg bggVar) {
                md8.checkNotNullParameter(bggVar, IconCompat.f7419A);
                return bggVar.simpleQueryForString();
            }
        }

        public C13057b(@yfb String str, @yfb si0 si0Var) {
            md8.checkNotNullParameter(str, "sql");
            md8.checkNotNullParameter(si0Var, "autoCloser");
            this.f84941a = str;
            this.f84942b = si0Var;
            this.f84943c = new ArrayList<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void doBinds(bgg bggVar) {
            Iterator<T> it = this.f84943c.iterator();
            int i = 0;
            while (it.hasNext()) {
                it.next();
                int i2 = i + 1;
                if (i < 0) {
                    l82.throwIndexOverflow();
                }
                Object obj = this.f84943c.get(i);
                if (obj == null) {
                    bggVar.bindNull(i2);
                } else if (obj instanceof Long) {
                    bggVar.bindLong(i2, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    bggVar.bindDouble(i2, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    bggVar.bindString(i2, (String) obj);
                } else if (obj instanceof byte[]) {
                    bggVar.bindBlob(i2, (byte[]) obj);
                }
                i = i2;
            }
        }

        private final <T> T executeSqliteStatementWithRefCount(qy6<? super bgg, ? extends T> qy6Var) {
            return (T) this.f84942b.executeRefCountingFunction(new c(qy6Var));
        }

        private final void saveBinds(int i, Object obj) {
            int size;
            int i2 = i - 1;
            if (i2 >= this.f84943c.size() && (size = this.f84943c.size()) <= i2) {
                while (true) {
                    this.f84943c.add(null);
                    if (size == i2) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.f84943c.set(i2, obj);
        }

        @Override // p000.yfg
        public void bindBlob(int i, @yfb byte[] bArr) {
            md8.checkNotNullParameter(bArr, "value");
            saveBinds(i, bArr);
        }

        @Override // p000.yfg
        public void bindDouble(int i, double d2) {
            saveBinds(i, Double.valueOf(d2));
        }

        @Override // p000.yfg
        public void bindLong(int i, long j) {
            saveBinds(i, Long.valueOf(j));
        }

        @Override // p000.yfg
        public void bindNull(int i) {
            saveBinds(i, null);
        }

        @Override // p000.yfg
        public void bindString(int i, @yfb String str) {
            md8.checkNotNullParameter(str, "value");
            saveBinds(i, str);
        }

        @Override // p000.yfg
        public void clearBindings() {
            this.f84943c.clear();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // p000.bgg
        public void execute() {
            executeSqliteStatementWithRefCount(a.f84944a);
        }

        @Override // p000.bgg
        public long executeInsert() {
            return ((Number) executeSqliteStatementWithRefCount(b.f84945a)).longValue();
        }

        @Override // p000.bgg
        public int executeUpdateDelete() {
            return ((Number) executeSqliteStatementWithRefCount(d.f84948a)).intValue();
        }

        @Override // p000.bgg
        public long simpleQueryForLong() {
            return ((Number) executeSqliteStatementWithRefCount(e.f84949a)).longValue();
        }

        @Override // p000.bgg
        @gib
        public String simpleQueryForString() {
            return (String) executeSqliteStatementWithRefCount(f.f84950a);
        }
    }

    /* JADX INFO: renamed from: ti0$c */
    public static final class C13058c implements Cursor {

        /* JADX INFO: renamed from: a */
        @yfb
        public final Cursor f84951a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final si0 f84952b;

        public C13058c(@yfb Cursor cursor, @yfb si0 si0Var) {
            md8.checkNotNullParameter(cursor, "delegate");
            md8.checkNotNullParameter(si0Var, "autoCloser");
            this.f84951a = cursor;
            this.f84952b = si0Var;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f84951a.close();
            this.f84952b.decrementCountAndScheduleClose();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
            this.f84951a.copyStringToBuffer(i, charArrayBuffer);
        }

        @Override // android.database.Cursor
        @q64(message = "Deprecated in Java")
        public void deactivate() {
            this.f84951a.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i) {
            return this.f84951a.getBlob(i);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f84951a.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f84951a.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.f84951a.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i) {
            return this.f84951a.getColumnName(i);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f84951a.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f84951a.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i) {
            return this.f84951a.getDouble(i);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f84951a.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i) {
            return this.f84951a.getFloat(i);
        }

        @Override // android.database.Cursor
        public int getInt(int i) {
            return this.f84951a.getInt(i);
        }

        @Override // android.database.Cursor
        public long getLong(int i) {
            return this.f84951a.getLong(i);
        }

        @Override // android.database.Cursor
        @c5e(api = 19)
        @yfb
        public Uri getNotificationUri() {
            return vfg.C14040b.getNotificationUri(this.f84951a);
        }

        @Override // android.database.Cursor
        @c5e(api = 29)
        @yfb
        public List<Uri> getNotificationUris() {
            return vfg.C14043e.getNotificationUris(this.f84951a);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f84951a.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i) {
            return this.f84951a.getShort(i);
        }

        @Override // android.database.Cursor
        public String getString(int i) {
            return this.f84951a.getString(i);
        }

        @Override // android.database.Cursor
        public int getType(int i) {
            return this.f84951a.getType(i);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f84951a.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f84951a.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f84951a.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f84951a.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f84951a.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f84951a.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i) {
            return this.f84951a.isNull(i);
        }

        @Override // android.database.Cursor
        public boolean move(int i) {
            return this.f84951a.move(i);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f84951a.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f84951a.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f84951a.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i) {
            return this.f84951a.moveToPosition(i);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f84951a.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f84951a.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f84951a.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        @q64(message = "Deprecated in Java")
        public boolean requery() {
            return this.f84951a.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f84951a.respond(bundle);
        }

        @Override // android.database.Cursor
        @c5e(api = 23)
        public void setExtras(@yfb Bundle bundle) {
            md8.checkNotNullParameter(bundle, "extras");
            vfg.C14042d.setExtras(this.f84951a, bundle);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f84951a.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        @c5e(api = 29)
        public void setNotificationUris(@yfb ContentResolver contentResolver, @yfb List<? extends Uri> list) {
            md8.checkNotNullParameter(contentResolver, "cr");
            md8.checkNotNullParameter(list, "uris");
            vfg.C14043e.setNotificationUris(this.f84951a, contentResolver, list);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f84951a.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f84951a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public ti0(@yfb xfg xfgVar, @yfb si0 si0Var) {
        md8.checkNotNullParameter(xfgVar, "delegate");
        md8.checkNotNullParameter(si0Var, "autoCloser");
        this.f84903a = xfgVar;
        this.f84904b = si0Var;
        si0Var.init(getDelegate());
        this.f84905c = new C13056a(si0Var);
    }

    @Override // p000.xfg, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f84905c.close();
    }

    @Override // p000.xfg
    @gib
    public String getDatabaseName() {
        return this.f84903a.getDatabaseName();
    }

    @Override // p000.e44
    @yfb
    public xfg getDelegate() {
        return this.f84903a;
    }

    @Override // p000.xfg
    @c5e(api = 24)
    @yfb
    public wfg getReadableDatabase() {
        this.f84905c.pokeOpen();
        return this.f84905c;
    }

    @Override // p000.xfg
    @c5e(api = 24)
    @yfb
    public wfg getWritableDatabase() {
        this.f84905c.pokeOpen();
        return this.f84905c;
    }

    @Override // p000.xfg
    @c5e(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f84903a.setWriteAheadLoggingEnabled(z);
    }
}

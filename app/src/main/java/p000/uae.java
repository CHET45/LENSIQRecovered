package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import com.google.android.gms.actions.SearchIntents;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p000.p7e;
import p000.vfg;
import p000.xfg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class uae {

    @yfb
    public static final C13434c Companion = new C13434c(null);

    @p7e({p7e.EnumC10826a.f69936c})
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;

    @gib
    private si0 autoCloser;

    @yfb
    private final Map<String, Object> backingFieldMap;
    private xfg internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;

    @gib
    @un8
    @p7e({p7e.EnumC10826a.f69936c})
    protected List<? extends AbstractC13433b> mCallbacks;

    @gib
    @un8
    protected volatile wfg mDatabase;

    @yfb
    private final Map<Class<?>, Object> typeConverters;
    private boolean writeAheadLoggingEnabled;

    @yfb
    private final ke8 invalidationTracker = createInvalidationTracker();

    @yfb
    @p7e({p7e.EnumC10826a.f69935b})
    private Map<Class<? extends zi0>, zi0> autoMigrationSpecs = new LinkedHashMap();

    @yfb
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    @yfb
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    /* JADX INFO: renamed from: uae$a */
    public static class C13432a<T extends uae> {

        /* JADX INFO: renamed from: a */
        @yfb
        public final Context f87305a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final Class<T> f87306b;

        /* JADX INFO: renamed from: c */
        @gib
        public final String f87307c;

        /* JADX INFO: renamed from: d */
        @yfb
        public final List<AbstractC13433b> f87308d;

        /* JADX INFO: renamed from: e */
        @gib
        public AbstractC13437f f87309e;

        /* JADX INFO: renamed from: f */
        @gib
        public InterfaceC13438g f87310f;

        /* JADX INFO: renamed from: g */
        @gib
        public Executor f87311g;

        /* JADX INFO: renamed from: h */
        @yfb
        public final List<Object> f87312h;

        /* JADX INFO: renamed from: i */
        @yfb
        public List<zi0> f87313i;

        /* JADX INFO: renamed from: j */
        @gib
        public Executor f87314j;

        /* JADX INFO: renamed from: k */
        @gib
        public Executor f87315k;

        /* JADX INFO: renamed from: l */
        @gib
        public xfg.InterfaceC15048c f87316l;

        /* JADX INFO: renamed from: m */
        public boolean f87317m;

        /* JADX INFO: renamed from: n */
        @yfb
        public EnumC13435d f87318n;

        /* JADX INFO: renamed from: o */
        @gib
        public Intent f87319o;

        /* JADX INFO: renamed from: p */
        public boolean f87320p;

        /* JADX INFO: renamed from: q */
        public boolean f87321q;

        /* JADX INFO: renamed from: r */
        public long f87322r;

        /* JADX INFO: renamed from: s */
        @gib
        public TimeUnit f87323s;

        /* JADX INFO: renamed from: t */
        @yfb
        public final C13436e f87324t;

        /* JADX INFO: renamed from: u */
        @yfb
        public Set<Integer> f87325u;

        /* JADX INFO: renamed from: v */
        @gib
        public Set<Integer> f87326v;

        /* JADX INFO: renamed from: w */
        @gib
        public String f87327w;

        /* JADX INFO: renamed from: x */
        @gib
        public File f87328x;

        /* JADX INFO: renamed from: y */
        @gib
        public Callable<InputStream> f87329y;

        public C13432a(@yfb Context context, @yfb Class<T> cls, @gib String str) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(cls, "klass");
            this.f87305a = context;
            this.f87306b = cls;
            this.f87307c = str;
            this.f87308d = new ArrayList();
            this.f87312h = new ArrayList();
            this.f87313i = new ArrayList();
            this.f87318n = EnumC13435d.AUTOMATIC;
            this.f87320p = true;
            this.f87322r = -1L;
            this.f87324t = new C13436e();
            this.f87325u = new LinkedHashSet();
        }

        @yfb
        public C13432a<T> addAutoMigrationSpec(@yfb zi0 zi0Var) {
            md8.checkNotNullParameter(zi0Var, "autoMigrationSpec");
            this.f87313i.add(zi0Var);
            return this;
        }

        @yfb
        public C13432a<T> addCallback(@yfb AbstractC13433b abstractC13433b) {
            md8.checkNotNullParameter(abstractC13433b, "callback");
            this.f87308d.add(abstractC13433b);
            return this;
        }

        @yfb
        public C13432a<T> addMigrations(@yfb ova... ovaVarArr) {
            md8.checkNotNullParameter(ovaVarArr, "migrations");
            if (this.f87326v == null) {
                this.f87326v = new HashSet();
            }
            for (ova ovaVar : ovaVarArr) {
                Set<Integer> set = this.f87326v;
                md8.checkNotNull(set);
                set.add(Integer.valueOf(ovaVar.startVersion));
                Set<Integer> set2 = this.f87326v;
                md8.checkNotNull(set2);
                set2.add(Integer.valueOf(ovaVar.endVersion));
            }
            this.f87324t.addMigrations((ova[]) Arrays.copyOf(ovaVarArr, ovaVarArr.length));
            return this;
        }

        @yfb
        public C13432a<T> addTypeConverter(@yfb Object obj) {
            md8.checkNotNullParameter(obj, "typeConverter");
            this.f87312h.add(obj);
            return this;
        }

        @yfb
        public C13432a<T> allowMainThreadQueries() {
            this.f87317m = true;
            return this;
        }

        @yfb
        public T build() {
            xfg.InterfaceC15048c fmdVar;
            Executor executor = this.f87314j;
            if (executor == null && this.f87315k == null) {
                Executor iOThreadExecutor = a50.getIOThreadExecutor();
                this.f87315k = iOThreadExecutor;
                this.f87314j = iOThreadExecutor;
            } else if (executor != null && this.f87315k == null) {
                this.f87315k = executor;
            } else if (executor == null) {
                this.f87314j = this.f87315k;
            }
            Set<Integer> set = this.f87326v;
            if (set != null) {
                md8.checkNotNull(set);
                Iterator<Integer> it = set.iterator();
                while (it.hasNext()) {
                    int iIntValue = it.next().intValue();
                    if (this.f87325u.contains(Integer.valueOf(iIntValue))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + iIntValue).toString());
                    }
                }
            }
            xfg.InterfaceC15048c cgeVar = this.f87316l;
            if (cgeVar == null) {
                cgeVar = new uw6();
            }
            if (cgeVar != null) {
                if (this.f87322r > 0) {
                    if (this.f87307c == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long j = this.f87322r;
                    TimeUnit timeUnit = this.f87323s;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Executor executor2 = this.f87314j;
                    if (executor2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    cgeVar = new ui0(cgeVar, new si0(j, timeUnit, executor2));
                }
                String str = this.f87327w;
                if (str != null || this.f87328x != null || this.f87329y != null) {
                    if (this.f87307c == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    int i = str == null ? 0 : 1;
                    File file = this.f87328x;
                    int i2 = file == null ? 0 : 1;
                    Callable<InputStream> callable = this.f87329y;
                    if (i + i2 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    cgeVar = new cge(str, file, callable, cgeVar);
                }
            } else {
                cgeVar = null;
            }
            if (cgeVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            InterfaceC13438g interfaceC13438g = this.f87310f;
            if (interfaceC13438g != null) {
                Executor executor3 = this.f87311g;
                if (executor3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (interfaceC13438g == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                fmdVar = new fmd(cgeVar, executor3, interfaceC13438g);
            } else {
                fmdVar = cgeVar;
            }
            Context context = this.f87305a;
            String str2 = this.f87307c;
            C13436e c13436e = this.f87324t;
            List<AbstractC13433b> list = this.f87308d;
            boolean z = this.f87317m;
            EnumC13435d enumC13435dResolve$room_runtime_release = this.f87318n.resolve$room_runtime_release(context);
            Executor executor4 = this.f87314j;
            if (executor4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor5 = this.f87315k;
            if (executor5 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ni3 ni3Var = new ni3(context, str2, fmdVar, c13436e, list, z, enumC13435dResolve$room_runtime_release, executor4, executor5, this.f87319o, this.f87320p, this.f87321q, this.f87325u, this.f87327w, this.f87328x, this.f87329y, this.f87309e, (List<? extends Object>) this.f87312h, this.f87313i);
            T t = (T) tae.getGeneratedImplementation(this.f87306b, "_Impl");
            t.init(ni3Var);
            return t;
        }

        @yfb
        public C13432a<T> createFromAsset(@yfb String str) {
            md8.checkNotNullParameter(str, "databaseFilePath");
            this.f87327w = str;
            return this;
        }

        @yfb
        public C13432a<T> createFromFile(@yfb File file) {
            md8.checkNotNullParameter(file, "databaseFile");
            this.f87328x = file;
            return this;
        }

        @yfb
        @igg({"BuilderSetStyle"})
        public C13432a<T> createFromInputStream(@yfb Callable<InputStream> callable) {
            md8.checkNotNullParameter(callable, "inputStreamCallable");
            this.f87329y = callable;
            return this;
        }

        @yfb
        public C13432a<T> enableMultiInstanceInvalidation() {
            this.f87319o = this.f87307c != null ? new Intent(this.f87305a, (Class<?>) MultiInstanceInvalidationService.class) : null;
            return this;
        }

        @yfb
        public C13432a<T> fallbackToDestructiveMigration() {
            this.f87320p = false;
            this.f87321q = true;
            return this;
        }

        @yfb
        public C13432a<T> fallbackToDestructiveMigrationFrom(@yfb int... iArr) {
            md8.checkNotNullParameter(iArr, "startVersions");
            for (int i : iArr) {
                this.f87325u.add(Integer.valueOf(i));
            }
            return this;
        }

        @yfb
        public C13432a<T> fallbackToDestructiveMigrationOnDowngrade() {
            this.f87320p = true;
            this.f87321q = true;
            return this;
        }

        @yfb
        public C13432a<T> openHelperFactory(@gib xfg.InterfaceC15048c interfaceC15048c) {
            this.f87316l = interfaceC15048c;
            return this;
        }

        @oh5
        @yfb
        public C13432a<T> setAutoCloseTimeout(@h78(from = 0) long j, @yfb TimeUnit timeUnit) {
            md8.checkNotNullParameter(timeUnit, "autoCloseTimeUnit");
            if (j < 0) {
                throw new IllegalArgumentException("autoCloseTimeout must be >= 0");
            }
            this.f87322r = j;
            this.f87323s = timeUnit;
            return this;
        }

        @yfb
        public C13432a<T> setJournalMode(@yfb EnumC13435d enumC13435d) {
            md8.checkNotNullParameter(enumC13435d, "journalMode");
            this.f87318n = enumC13435d;
            return this;
        }

        @oh5
        @yfb
        public C13432a<T> setMultiInstanceInvalidationServiceIntent(@yfb Intent intent) {
            md8.checkNotNullParameter(intent, "invalidationServiceIntent");
            if (this.f87307c == null) {
                intent = null;
            }
            this.f87319o = intent;
            return this;
        }

        @yfb
        public C13432a<T> setQueryCallback(@yfb InterfaceC13438g interfaceC13438g, @yfb Executor executor) {
            md8.checkNotNullParameter(interfaceC13438g, "queryCallback");
            md8.checkNotNullParameter(executor, "executor");
            this.f87310f = interfaceC13438g;
            this.f87311g = executor;
            return this;
        }

        @yfb
        public C13432a<T> setQueryExecutor(@yfb Executor executor) {
            md8.checkNotNullParameter(executor, "executor");
            this.f87314j = executor;
            return this;
        }

        @yfb
        public C13432a<T> setTransactionExecutor(@yfb Executor executor) {
            md8.checkNotNullParameter(executor, "executor");
            this.f87315k = executor;
            return this;
        }

        @yfb
        @igg({"BuilderSetStyle"})
        public C13432a<T> createFromAsset(@yfb String str, @yfb AbstractC13437f abstractC13437f) {
            md8.checkNotNullParameter(str, "databaseFilePath");
            md8.checkNotNullParameter(abstractC13437f, "callback");
            this.f87309e = abstractC13437f;
            this.f87327w = str;
            return this;
        }

        @yfb
        @igg({"BuilderSetStyle", "StreamFiles"})
        public C13432a<T> createFromFile(@yfb File file, @yfb AbstractC13437f abstractC13437f) {
            md8.checkNotNullParameter(file, "databaseFile");
            md8.checkNotNullParameter(abstractC13437f, "callback");
            this.f87309e = abstractC13437f;
            this.f87328x = file;
            return this;
        }

        @yfb
        @igg({"BuilderSetStyle", "LambdaLast"})
        public C13432a<T> createFromInputStream(@yfb Callable<InputStream> callable, @yfb AbstractC13437f abstractC13437f) {
            md8.checkNotNullParameter(callable, "inputStreamCallable");
            md8.checkNotNullParameter(abstractC13437f, "callback");
            this.f87309e = abstractC13437f;
            this.f87329y = callable;
            return this;
        }
    }

    /* JADX INFO: renamed from: uae$b */
    public static abstract class AbstractC13433b {
        public void onCreate(@yfb wfg wfgVar) {
            md8.checkNotNullParameter(wfgVar, "db");
        }

        public void onDestructiveMigration(@yfb wfg wfgVar) {
            md8.checkNotNullParameter(wfgVar, "db");
        }

        public void onOpen(@yfb wfg wfgVar) {
            md8.checkNotNullParameter(wfgVar, "db");
        }
    }

    /* JADX INFO: renamed from: uae$c */
    public static final class C13434c {
        public /* synthetic */ C13434c(jt3 jt3Var) {
            this();
        }

        private C13434c() {
        }
    }

    /* JADX INFO: renamed from: uae$d */
    public enum EnumC13435d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private final boolean isLowRamDevice(ActivityManager activityManager) {
            return vfg.C14040b.isLowRamDevice(activityManager);
        }

        @yfb
        public final EnumC13435d resolve$room_runtime_release(@yfb Context context) {
            md8.checkNotNullParameter(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || isLowRamDevice(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* JADX INFO: renamed from: uae$f */
    public static abstract class AbstractC13437f {
        public void onOpenPrepackagedDatabase(@yfb wfg wfgVar) {
            md8.checkNotNullParameter(wfgVar, "db");
        }
    }

    /* JADX INFO: renamed from: uae$g */
    public interface InterfaceC13438g {
        void onQuery(@yfb String str, @yfb List<? extends Object> list);
    }

    /* JADX INFO: renamed from: uae$h */
    public static final class C13439h extends tt8 implements qy6<wfg, Object> {
        public C13439h() {
            super(1);
        }

        @Override // p000.qy6
        @gib
        public final Object invoke(@yfb wfg wfgVar) {
            md8.checkNotNullParameter(wfgVar, "it");
            uae.this.internalBeginTransaction();
            return null;
        }
    }

    /* JADX INFO: renamed from: uae$i */
    public static final class C13440i extends tt8 implements qy6<wfg, Object> {
        public C13440i() {
            super(1);
        }

        @Override // p000.qy6
        @gib
        public final Object invoke(@yfb wfg wfgVar) {
            md8.checkNotNullParameter(wfgVar, "it");
            uae.this.internalEndTransaction();
            return null;
        }
    }

    public uae() {
        Map<String, Object> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        md8.checkNotNullExpressionValue(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.backingFieldMap = mapSynchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    @q64(message = "Will be hidden in a future release.")
    public static /* synthetic */ void getMCallbacks$annotations() {
    }

    @q64(message = "Will be hidden in the next release.")
    public static /* synthetic */ void getMDatabase$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalBeginTransaction() {
        assertNotMainThread();
        wfg writableDatabase = getOpenHelper().getWritableDatabase();
        getInvalidationTracker().syncTriggers$room_runtime_release(writableDatabase);
        if (writableDatabase.isWriteAheadLoggingEnabled()) {
            writableDatabase.beginTransactionNonExclusive();
        } else {
            writableDatabase.beginTransaction();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalEndTransaction() {
        getOpenHelper().getWritableDatabase().endTransaction();
        if (inTransaction()) {
            return;
        }
        getInvalidationTracker().refreshVersionsAsync();
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isOpenInternal$annotations() {
    }

    public static /* synthetic */ Cursor query$default(uae uaeVar, zfg zfgVar, CancellationSignal cancellationSignal, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i & 2) != 0) {
            cancellationSignal = null;
        }
        return uaeVar.query(zfgVar, cancellationSignal);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T unwrapOpenHelper(Class<T> cls, xfg xfgVar) {
        if (cls.isInstance(xfgVar)) {
            return xfgVar;
        }
        if (xfgVar instanceof e44) {
            return (T) unwrapOpenHelper(cls, ((e44) xfgVar).getDelegate());
        }
        return null;
    }

    @p7e({p7e.EnumC10826a.f69936c})
    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime_release()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @q64(message = "beginTransaction() is deprecated", replaceWith = @i2e(expression = "runInTransaction(Runnable)", imports = {}))
    public void beginTransaction() {
        assertNotMainThread();
        si0 si0Var = this.autoCloser;
        if (si0Var == null) {
            internalBeginTransaction();
        } else {
            si0Var.executeRefCountingFunction(new C13439h());
        }
    }

    @xqi
    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            md8.checkNotNullExpressionValue(writeLock, "readWriteLock.writeLock()");
            writeLock.lock();
            try {
                getInvalidationTracker().stopMultiInstanceInvalidation$room_runtime_release();
                getOpenHelper().close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    @yfb
    public bgg compileStatement(@yfb String str) {
        md8.checkNotNullParameter(str, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().compileStatement(str);
    }

    @yfb
    public abstract ke8 createInvalidationTracker();

    @yfb
    public abstract xfg createOpenHelper(@yfb ni3 ni3Var);

    @q64(message = "endTransaction() is deprecated", replaceWith = @i2e(expression = "runInTransaction(Runnable)", imports = {}))
    public void endTransaction() {
        si0 si0Var = this.autoCloser;
        if (si0Var == null) {
            internalEndTransaction();
        } else {
            si0Var.executeRefCountingFunction(new C13440i());
        }
    }

    @yfb
    public final Map<Class<? extends zi0>, zi0> getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    @yfb
    @fo8
    @p7e({p7e.EnumC10826a.f69935b})
    public List<ova> getAutoMigrations(@yfb Map<Class<? extends zi0>, zi0> map) {
        md8.checkNotNullParameter(map, "autoMigrationSpecs");
        return l82.emptyList();
    }

    @yfb
    @p7e({p7e.EnumC10826a.f69935b})
    public final Map<String, Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    @yfb
    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock lock = this.readWriteLock.readLock();
        md8.checkNotNullExpressionValue(lock, "readWriteLock.readLock()");
        return lock;
    }

    @yfb
    public ke8 getInvalidationTracker() {
        return this.invalidationTracker;
    }

    @yfb
    public xfg getOpenHelper() {
        xfg xfgVar = this.internalOpenHelper;
        if (xfgVar != null) {
            return xfgVar;
        }
        md8.throwUninitializedPropertyAccessException("internalOpenHelper");
        return null;
    }

    @yfb
    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        md8.throwUninitializedPropertyAccessException("internalQueryExecutor");
        return null;
    }

    @yfb
    @p7e({p7e.EnumC10826a.f69935b})
    public Set<Class<? extends zi0>> getRequiredAutoMigrationSpecs() {
        return w6f.emptySet();
    }

    @yfb
    @p7e({p7e.EnumC10826a.f69935b})
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return xt9.emptyMap();
    }

    @yfb
    @p7e({p7e.EnumC10826a.f69935b})
    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    @yfb
    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        md8.throwUninitializedPropertyAccessException("internalTransactionExecutor");
        return null;
    }

    @gib
    public <T> T getTypeConverter(@yfb Class<T> cls) {
        md8.checkNotNullParameter(cls, "klass");
        return (T) this.typeConverters.get(cls);
    }

    public boolean inTransaction() {
        return getOpenHelper().getWritableDatabase().inTransaction();
    }

    @un1
    public void init(@yfb ni3 ni3Var) {
        md8.checkNotNullParameter(ni3Var, "configuration");
        this.internalOpenHelper = createOpenHelper(ni3Var);
        Set<Class<? extends zi0>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends zi0>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            int i = -1;
            if (it.hasNext()) {
                Class<? extends zi0> next = it.next();
                int size = ni3Var.f64654s.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        if (next.isAssignableFrom(ni3Var.f64654s.get(size).getClass())) {
                            bitSet.set(size);
                            i = size;
                            break;
                        } else if (i2 < 0) {
                            break;
                        } else {
                            size = i2;
                        }
                    }
                }
                if (i < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.autoMigrationSpecs.put(next, ni3Var.f64654s.get(i));
            } else {
                int size2 = ni3Var.f64654s.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i3 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i3 < 0) {
                            break;
                        } else {
                            size2 = i3;
                        }
                    }
                }
                for (ova ovaVar : getAutoMigrations(this.autoMigrationSpecs)) {
                    if (!ni3Var.f64639d.contains(ovaVar.startVersion, ovaVar.endVersion)) {
                        ni3Var.f64639d.addMigrations(ovaVar);
                    }
                }
                bge bgeVar = (bge) unwrapOpenHelper(bge.class, getOpenHelper());
                if (bgeVar != null) {
                    bgeVar.setDatabaseConfiguration(ni3Var);
                }
                ti0 ti0Var = (ti0) unwrapOpenHelper(ti0.class, getOpenHelper());
                if (ti0Var != null) {
                    this.autoCloser = ti0Var.f84904b;
                    getInvalidationTracker().setAutoCloser$room_runtime_release(ti0Var.f84904b);
                }
                boolean z = ni3Var.f64642g == EnumC13435d.WRITE_AHEAD_LOGGING;
                getOpenHelper().setWriteAheadLoggingEnabled(z);
                this.mCallbacks = ni3Var.f64640e;
                this.internalQueryExecutor = ni3Var.f64643h;
                this.internalTransactionExecutor = new fdh(ni3Var.f64644i);
                this.allowMainThreadQueries = ni3Var.f64641f;
                this.writeAheadLoggingEnabled = z;
                if (ni3Var.f64645j != null) {
                    if (ni3Var.f64637b == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    getInvalidationTracker().startMultiInstanceInvalidation$room_runtime_release(ni3Var.f64636a, ni3Var.f64637b, ni3Var.f64645j);
                }
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : requiredTypeConverters.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size3 = ni3Var.f64653r.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i4 = size3 - 1;
                                if (cls.isAssignableFrom(ni3Var.f64653r.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                } else if (i4 < 0) {
                                    break;
                                } else {
                                    size3 = i4;
                                }
                            }
                            size3 = -1;
                        } else {
                            size3 = -1;
                        }
                        if (size3 < 0) {
                            throw new IllegalArgumentException(("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                        this.typeConverters.put(cls, ni3Var.f64653r.get(size3));
                    }
                }
                int size4 = ni3Var.f64653r.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i5 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + ni3Var.f64653r.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i5 < 0) {
                        return;
                    } else {
                        size4 = i5;
                    }
                }
            }
        }
    }

    public void internalInitInvalidationTracker(@yfb wfg wfgVar) {
        md8.checkNotNullParameter(wfgVar, "db");
        getInvalidationTracker().internalInit$room_runtime_release(wfgVar);
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        Boolean boolValueOf;
        boolean zIsOpen;
        si0 si0Var = this.autoCloser;
        if (si0Var != null) {
            zIsOpen = si0Var.isActive();
        } else {
            wfg wfgVar = this.mDatabase;
            if (wfgVar == null) {
                boolValueOf = null;
                return md8.areEqual(boolValueOf, Boolean.TRUE);
            }
            zIsOpen = wfgVar.isOpen();
        }
        boolValueOf = Boolean.valueOf(zIsOpen);
        return md8.areEqual(boolValueOf, Boolean.TRUE);
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public final boolean isOpenInternal() {
        wfg wfgVar = this.mDatabase;
        return wfgVar != null && wfgVar.isOpen();
    }

    @yfb
    @yn8
    public final Cursor query(@yfb zfg zfgVar) {
        md8.checkNotNullParameter(zfgVar, SearchIntents.EXTRA_QUERY);
        return query$default(this, zfgVar, null, 2, null);
    }

    public void runInTransaction(@yfb Runnable runnable) {
        md8.checkNotNullParameter(runnable, "body");
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    public final void setAutoMigrationSpecs(@yfb Map<Class<? extends zi0>, zi0> map) {
        md8.checkNotNullParameter(map, "<set-?>");
        this.autoMigrationSpecs = map;
    }

    @q64(message = "setTransactionSuccessful() is deprecated", replaceWith = @i2e(expression = "runInTransaction(Runnable)", imports = {}))
    public void setTransactionSuccessful() {
        getOpenHelper().getWritableDatabase().setTransactionSuccessful();
    }

    @yfb
    public Cursor query(@yfb String str, @gib Object[] objArr) {
        md8.checkNotNullParameter(str, SearchIntents.EXTRA_QUERY);
        return getOpenHelper().getWritableDatabase().query(new cjf(str, objArr));
    }

    /* JADX INFO: renamed from: uae$e */
    public static class C13436e {

        /* JADX INFO: renamed from: a */
        @yfb
        public final Map<Integer, TreeMap<Integer, ova>> f87334a = new LinkedHashMap();

        private final void addMigration(ova ovaVar) {
            int i = ovaVar.startVersion;
            int i2 = ovaVar.endVersion;
            Map<Integer, TreeMap<Integer, ova>> map = this.f87334a;
            Integer numValueOf = Integer.valueOf(i);
            TreeMap<Integer, ova> treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(numValueOf, treeMap);
            }
            TreeMap<Integer, ova> treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i2))) {
                Log.w(tae.f84090b, "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + ovaVar);
            }
            treeMap2.put(Integer.valueOf(i2), ovaVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final java.util.List<p000.ova> findUpMigrationPath(java.util.List<p000.ova> r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
            L0:
                if (r8 == 0) goto L5
                if (r9 >= r10) goto L63
                goto L7
            L5:
                if (r9 <= r10) goto L63
            L7:
                java.util.Map<java.lang.Integer, java.util.TreeMap<java.lang.Integer, ova>> r0 = r6.f87334a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r8 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L5f
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                java.lang.String r4 = "targetVersion"
                if (r8 == 0) goto L44
                int r5 = r9 + 1
                p000.md8.checkNotNullExpressionValue(r3, r4)
                int r4 = r3.intValue()
                if (r5 > r4) goto L26
                if (r4 > r10) goto L26
                goto L4f
            L44:
                p000.md8.checkNotNullExpressionValue(r3, r4)
                int r4 = r3.intValue()
                if (r10 > r4) goto L26
                if (r4 >= r9) goto L26
            L4f:
                java.lang.Object r9 = r0.get(r3)
                p000.md8.checkNotNull(r9)
                r7.add(r9)
                int r9 = r3.intValue()
                r0 = 1
                goto L60
            L5f:
                r0 = 0
            L60:
                if (r0 != 0) goto L0
                return r1
            L63:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.uae.C13436e.findUpMigrationPath(java.util.List, boolean, int, int):java.util.List");
        }

        public void addMigrations(@yfb List<? extends ova> list) {
            md8.checkNotNullParameter(list, "migrations");
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                addMigration((ova) it.next());
            }
        }

        public final boolean contains(int i, int i2) {
            Map<Integer, Map<Integer, ova>> migrations = getMigrations();
            if (!migrations.containsKey(Integer.valueOf(i))) {
                return false;
            }
            Map<Integer, ova> mapEmptyMap = migrations.get(Integer.valueOf(i));
            if (mapEmptyMap == null) {
                mapEmptyMap = xt9.emptyMap();
            }
            return mapEmptyMap.containsKey(Integer.valueOf(i2));
        }

        @gib
        public List<ova> findMigrationPath(int i, int i2) {
            if (i == i2) {
                return l82.emptyList();
            }
            return findUpMigrationPath(new ArrayList(), i2 > i, i, i2);
        }

        @yfb
        public Map<Integer, Map<Integer, ova>> getMigrations() {
            return this.f87334a;
        }

        public void addMigrations(@yfb ova... ovaVarArr) {
            md8.checkNotNullParameter(ovaVarArr, "migrations");
            for (ova ovaVar : ovaVarArr) {
                addMigration(ovaVar);
            }
        }
    }

    @yfb
    @yn8
    public Cursor query(@yfb zfg zfgVar, @gib CancellationSignal cancellationSignal) {
        md8.checkNotNullParameter(zfgVar, SearchIntents.EXTRA_QUERY);
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null) {
            return getOpenHelper().getWritableDatabase().query(zfgVar, cancellationSignal);
        }
        return getOpenHelper().getWritableDatabase().query(zfgVar);
    }

    public <V> V runInTransaction(@yfb Callable<V> callable) {
        md8.checkNotNullParameter(callable, "body");
        beginTransaction();
        try {
            V vCall = callable.call();
            setTransactionSuccessful();
            return vCall;
        } finally {
            endTransaction();
        }
    }
}

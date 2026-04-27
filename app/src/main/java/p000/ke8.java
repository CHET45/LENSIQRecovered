package p000;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.lifecycle.AbstractC1158q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import p000.g1c;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public class ke8 {

    /* JADX INFO: renamed from: q */
    @yfb
    public static final C8316a f53737q = new C8316a(null);

    /* JADX INFO: renamed from: r */
    @yfb
    public static final String[] f53738r = {"UPDATE", g1c.C6087d.f38269b, "INSERT"};

    /* JADX INFO: renamed from: s */
    @yfb
    public static final String f53739s = "room_table_modification_log";

    /* JADX INFO: renamed from: t */
    @yfb
    public static final String f53740t = "table_id";

    /* JADX INFO: renamed from: u */
    @yfb
    public static final String f53741u = "invalidated";

    /* JADX INFO: renamed from: v */
    @yfb
    public static final String f53742v = "CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";

    /* JADX INFO: renamed from: w */
    @yfb
    public static final String f53743w = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1";

    /* JADX INFO: renamed from: x */
    @yfb
    public static final String f53744x = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";

    /* JADX INFO: renamed from: a */
    @yfb
    public final uae f53745a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Map<String, String> f53746b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Map<String, Set<String>> f53747c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final Map<String, Integer> f53748d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final String[] f53749e;

    /* JADX INFO: renamed from: f */
    @gib
    public si0 f53750f;

    /* JADX INFO: renamed from: g */
    @yfb
    @p7e({p7e.EnumC10826a.f69934a})
    public final AtomicBoolean f53751g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f53752h;

    /* JADX INFO: renamed from: i */
    @gib
    public volatile bgg f53753i;

    /* JADX INFO: renamed from: j */
    @yfb
    public final C8317b f53754j;

    /* JADX INFO: renamed from: k */
    @yfb
    public final he8 f53755k;

    /* JADX INFO: renamed from: l */
    @xc7("observerMap")
    @yfb
    public final rke<AbstractC8318c, C8319d> f53756l;

    /* JADX INFO: renamed from: m */
    @gib
    public o2b f53757m;

    /* JADX INFO: renamed from: n */
    @yfb
    public final Object f53758n;

    /* JADX INFO: renamed from: o */
    @yfb
    public final Object f53759o;

    /* JADX INFO: renamed from: p */
    @un8
    @yfb
    @p7e({p7e.EnumC10826a.f69934a})
    public final Runnable f53760p;

    /* JADX INFO: renamed from: ke8$a */
    public static final class C8316a {
        public /* synthetic */ C8316a(jt3 jt3Var) {
            this();
        }

        @fdi
        public static /* synthetic */ void getRESET_UPDATED_TABLES_SQL$room_runtime_release$annotations() {
        }

        @fdi
        public static /* synthetic */ void getSELECT_UPDATED_TABLES_SQL$room_runtime_release$annotations() {
        }

        public final void beginTransactionInternal$room_runtime_release(@yfb wfg wfgVar) {
            md8.checkNotNullParameter(wfgVar, "database");
            if (wfgVar.isWriteAheadLoggingEnabled()) {
                wfgVar.beginTransactionNonExclusive();
            } else {
                wfgVar.beginTransaction();
            }
        }

        @yfb
        public final String getTriggerName$room_runtime_release(@yfb String str, @yfb String str2) {
            md8.checkNotNullParameter(str, "tableName");
            md8.checkNotNullParameter(str2, "triggerType");
            return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
        }

        private C8316a() {
        }
    }

    /* JADX INFO: renamed from: ke8$b */
    public static final class C8317b {

        /* JADX INFO: renamed from: e */
        @yfb
        public static final a f53761e = new a(null);

        /* JADX INFO: renamed from: f */
        public static final int f53762f = 0;

        /* JADX INFO: renamed from: g */
        public static final int f53763g = 1;

        /* JADX INFO: renamed from: h */
        public static final int f53764h = 2;

        /* JADX INFO: renamed from: a */
        @yfb
        public final long[] f53765a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final boolean[] f53766b;

        /* JADX INFO: renamed from: c */
        @yfb
        public final int[] f53767c;

        /* JADX INFO: renamed from: d */
        public boolean f53768d;

        /* JADX INFO: renamed from: ke8$b$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            private a() {
            }
        }

        public C8317b(int i) {
            this.f53765a = new long[i];
            this.f53766b = new boolean[i];
            this.f53767c = new int[i];
        }

        public final boolean getNeedsSync() {
            return this.f53768d;
        }

        @yfb
        public final long[] getTableObservers() {
            return this.f53765a;
        }

        @gib
        @fdi
        @xn8(name = "getTablesToSync")
        public final int[] getTablesToSync() {
            synchronized (this) {
                try {
                    if (!this.f53768d) {
                        return null;
                    }
                    long[] jArr = this.f53765a;
                    int length = jArr.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        int i3 = i2 + 1;
                        int i4 = 1;
                        boolean z = jArr[i] > 0;
                        boolean[] zArr = this.f53766b;
                        if (z != zArr[i2]) {
                            int[] iArr = this.f53767c;
                            if (!z) {
                                i4 = 2;
                            }
                            iArr[i2] = i4;
                        } else {
                            this.f53767c[i2] = 0;
                        }
                        zArr[i2] = z;
                        i++;
                        i2 = i3;
                    }
                    this.f53768d = false;
                    return (int[]) this.f53767c.clone();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final boolean onAdded(@yfb int... iArr) {
            boolean z;
            md8.checkNotNullParameter(iArr, "tableIds");
            synchronized (this) {
                try {
                    z = false;
                    for (int i : iArr) {
                        long[] jArr = this.f53765a;
                        long j = jArr[i];
                        jArr[i] = 1 + j;
                        if (j == 0) {
                            z = true;
                            this.f53768d = true;
                        }
                    }
                    bth bthVar = bth.f14751a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z;
        }

        public final boolean onRemoved(@yfb int... iArr) {
            boolean z;
            md8.checkNotNullParameter(iArr, "tableIds");
            synchronized (this) {
                try {
                    z = false;
                    for (int i : iArr) {
                        long[] jArr = this.f53765a;
                        long j = jArr[i];
                        jArr[i] = j - 1;
                        if (j == 1) {
                            z = true;
                            this.f53768d = true;
                        }
                    }
                    bth bthVar = bth.f14751a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z;
        }

        public final void resetTriggerState() {
            synchronized (this) {
                Arrays.fill(this.f53766b, false);
                this.f53768d = true;
                bth bthVar = bth.f14751a;
            }
        }

        public final void setNeedsSync(boolean z) {
            this.f53768d = z;
        }
    }

    /* JADX INFO: renamed from: ke8$c */
    public static abstract class AbstractC8318c {

        /* JADX INFO: renamed from: a */
        @yfb
        public final String[] f53769a;

        public AbstractC8318c(@yfb String[] strArr) {
            md8.checkNotNullParameter(strArr, "tables");
            this.f53769a = strArr;
        }

        @yfb
        public final String[] getTables$room_runtime_release() {
            return this.f53769a;
        }

        public boolean isRemote$room_runtime_release() {
            return false;
        }

        public abstract void onInvalidated(@yfb Set<String> set);

        /* JADX WARN: Illegal instructions before constructor call */
        public AbstractC8318c(@yfb String str, @yfb String... strArr) {
            md8.checkNotNullParameter(str, "firstTable");
            md8.checkNotNullParameter(strArr, "rest");
            List listCreateListBuilder = k82.createListBuilder();
            q82.addAll(listCreateListBuilder, strArr);
            listCreateListBuilder.add(str);
            Object[] array = k82.build(listCreateListBuilder).toArray(new String[0]);
            md8.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            this((String[]) array);
        }
    }

    /* JADX INFO: renamed from: ke8$d */
    public static final class C8319d {

        /* JADX INFO: renamed from: a */
        @yfb
        public final AbstractC8318c f53770a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final int[] f53771b;

        /* JADX INFO: renamed from: c */
        @yfb
        public final String[] f53772c;

        /* JADX INFO: renamed from: d */
        @yfb
        public final Set<String> f53773d;

        public C8319d(@yfb AbstractC8318c abstractC8318c, @yfb int[] iArr, @yfb String[] strArr) {
            md8.checkNotNullParameter(abstractC8318c, "observer");
            md8.checkNotNullParameter(iArr, "tableIds");
            md8.checkNotNullParameter(strArr, "tableNames");
            this.f53770a = abstractC8318c;
            this.f53771b = iArr;
            this.f53772c = strArr;
            this.f53773d = !(strArr.length == 0) ? v6f.setOf(strArr[0]) : w6f.emptySet();
            if (iArr.length != strArr.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        @yfb
        public final AbstractC8318c getObserver$room_runtime_release() {
            return this.f53770a;
        }

        @yfb
        public final int[] getTableIds$room_runtime_release() {
            return this.f53771b;
        }

        public final void notifyByTableInvalidStatus$room_runtime_release(@yfb Set<Integer> set) {
            Set<String> setEmptySet;
            md8.checkNotNullParameter(set, "invalidatedTablesIds");
            int[] iArr = this.f53771b;
            int length = iArr.length;
            if (length != 0) {
                int i = 0;
                if (length != 1) {
                    Set setCreateSetBuilder = v6f.createSetBuilder();
                    int[] iArr2 = this.f53771b;
                    int length2 = iArr2.length;
                    int i2 = 0;
                    while (i < length2) {
                        int i3 = i2 + 1;
                        if (set.contains(Integer.valueOf(iArr2[i]))) {
                            setCreateSetBuilder.add(this.f53772c[i2]);
                        }
                        i++;
                        i2 = i3;
                    }
                    setEmptySet = v6f.build(setCreateSetBuilder);
                } else {
                    setEmptySet = set.contains(Integer.valueOf(iArr[0])) ? this.f53773d : w6f.emptySet();
                }
            } else {
                setEmptySet = w6f.emptySet();
            }
            if (setEmptySet.isEmpty()) {
                return;
            }
            this.f53770a.onInvalidated(setEmptySet);
        }

        public final void notifyByTableNames$room_runtime_release(@yfb String[] strArr) {
            Set<String> setEmptySet;
            md8.checkNotNullParameter(strArr, "tables");
            int length = this.f53772c.length;
            if (length == 0) {
                setEmptySet = w6f.emptySet();
            } else if (length == 1) {
                int length2 = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length2) {
                        setEmptySet = w6f.emptySet();
                        break;
                    } else {
                        if (h9g.equals(strArr[i], this.f53772c[0], true)) {
                            setEmptySet = this.f53773d;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                Set setCreateSetBuilder = v6f.createSetBuilder();
                for (String str : strArr) {
                    for (String str2 : this.f53772c) {
                        if (h9g.equals(str2, str, true)) {
                            setCreateSetBuilder.add(str2);
                        }
                    }
                }
                setEmptySet = v6f.build(setCreateSetBuilder);
            }
            if (setEmptySet.isEmpty()) {
                return;
            }
            this.f53770a.onInvalidated(setEmptySet);
        }
    }

    /* JADX INFO: renamed from: ke8$e */
    public static final class C8320e extends AbstractC8318c {

        /* JADX INFO: renamed from: b */
        @yfb
        public final ke8 f53774b;

        /* JADX INFO: renamed from: c */
        @yfb
        public final WeakReference<AbstractC8318c> f53775c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8320e(@yfb ke8 ke8Var, @yfb AbstractC8318c abstractC8318c) {
            super(abstractC8318c.getTables$room_runtime_release());
            md8.checkNotNullParameter(ke8Var, "tracker");
            md8.checkNotNullParameter(abstractC8318c, "delegate");
            this.f53774b = ke8Var;
            this.f53775c = new WeakReference<>(abstractC8318c);
        }

        @yfb
        public final WeakReference<AbstractC8318c> getDelegateRef() {
            return this.f53775c;
        }

        @yfb
        public final ke8 getTracker() {
            return this.f53774b;
        }

        @Override // p000.ke8.AbstractC8318c
        public void onInvalidated(@yfb Set<String> set) {
            md8.checkNotNullParameter(set, "tables");
            AbstractC8318c abstractC8318c = this.f53775c.get();
            if (abstractC8318c == null) {
                this.f53774b.removeObserver(this);
            } else {
                abstractC8318c.onInvalidated(set);
            }
        }
    }

    /* JADX INFO: renamed from: ke8$f */
    public static final class RunnableC8321f implements Runnable {
        public RunnableC8321f() {
        }

        private final Set<Integer> checkUpdatedTable() {
            ke8 ke8Var = ke8.this;
            Set setCreateSetBuilder = v6f.createSetBuilder();
            Cursor cursorQuery$default = uae.query$default(ke8Var.getDatabase$room_runtime_release(), new cjf(ke8.f53744x), null, 2, null);
            while (cursorQuery$default.moveToNext()) {
                try {
                    setCreateSetBuilder.add(Integer.valueOf(cursorQuery$default.getInt(0)));
                } finally {
                }
            }
            bth bthVar = bth.f14751a;
            u52.closeFinally(cursorQuery$default, null);
            Set<Integer> setBuild = v6f.build(setCreateSetBuilder);
            if (!setBuild.isEmpty()) {
                if (ke8.this.getCleanupStatement$room_runtime_release() == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                bgg cleanupStatement$room_runtime_release = ke8.this.getCleanupStatement$room_runtime_release();
                if (cleanupStatement$room_runtime_release == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                cleanupStatement$room_runtime_release.executeUpdateDelete();
            }
            return setBuild;
        }

        @Override // java.lang.Runnable
        public void run() {
            Set<Integer> setEmptySet;
            si0 si0Var;
            si0 si0Var2;
            Lock closeLock$room_runtime_release = ke8.this.getDatabase$room_runtime_release().getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                try {
                } catch (SQLiteException e) {
                    Log.e(tae.f84090b, "Cannot run invalidation tracker. Is the db closed?", e);
                    setEmptySet = w6f.emptySet();
                    closeLock$room_runtime_release.unlock();
                    si0Var = ke8.this.f53750f;
                    if (si0Var != null) {
                    }
                } catch (IllegalStateException e2) {
                    Log.e(tae.f84090b, "Cannot run invalidation tracker. Is the db closed?", e2);
                    setEmptySet = w6f.emptySet();
                    closeLock$room_runtime_release.unlock();
                    si0Var = ke8.this.f53750f;
                    if (si0Var != null) {
                    }
                }
                if (!ke8.this.ensureInitialization$room_runtime_release()) {
                    if (si0Var2 != null) {
                        return;
                    } else {
                        return;
                    }
                }
                if (!ke8.this.getPendingRefresh().compareAndSet(true, false)) {
                    closeLock$room_runtime_release.unlock();
                    si0 si0Var3 = ke8.this.f53750f;
                    if (si0Var3 != null) {
                        si0Var3.decrementCountAndScheduleClose();
                        return;
                    }
                    return;
                }
                if (ke8.this.getDatabase$room_runtime_release().inTransaction()) {
                    closeLock$room_runtime_release.unlock();
                    si0 si0Var4 = ke8.this.f53750f;
                    if (si0Var4 != null) {
                        si0Var4.decrementCountAndScheduleClose();
                        return;
                    }
                    return;
                }
                wfg writableDatabase = ke8.this.getDatabase$room_runtime_release().getOpenHelper().getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    setEmptySet = checkUpdatedTable();
                    writableDatabase.setTransactionSuccessful();
                    closeLock$room_runtime_release.unlock();
                    si0Var = ke8.this.f53750f;
                    if (si0Var != null) {
                        si0Var.decrementCountAndScheduleClose();
                    }
                    if (setEmptySet.isEmpty()) {
                        return;
                    }
                    rke<AbstractC8318c, C8319d> observerMap$room_runtime_release = ke8.this.getObserverMap$room_runtime_release();
                    ke8 ke8Var = ke8.this;
                    synchronized (observerMap$room_runtime_release) {
                        try {
                            Iterator<Map.Entry<K, V>> it = ke8Var.getObserverMap$room_runtime_release().iterator();
                            while (it.hasNext()) {
                                ((C8319d) ((Map.Entry) it.next()).getValue()).notifyByTableInvalidStatus$room_runtime_release(setEmptySet);
                            }
                            bth bthVar = bth.f14751a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } finally {
                    writableDatabase.endTransaction();
                }
            } finally {
                closeLock$room_runtime_release.unlock();
                si0Var2 = ke8.this.f53750f;
                if (si0Var2 != null) {
                    si0Var2.decrementCountAndScheduleClose();
                }
            }
        }
    }

    @p7e({p7e.EnumC10826a.f69936c})
    public ke8(@yfb uae uaeVar, @yfb Map<String, String> map, @yfb Map<String, Set<String>> map2, @yfb String... strArr) {
        String lowerCase;
        md8.checkNotNullParameter(uaeVar, "database");
        md8.checkNotNullParameter(map, "shadowTablesMap");
        md8.checkNotNullParameter(map2, "viewTables");
        md8.checkNotNullParameter(strArr, "tableNames");
        this.f53745a = uaeVar;
        this.f53746b = map;
        this.f53747c = map2;
        this.f53751g = new AtomicBoolean(false);
        this.f53754j = new C8317b(strArr.length);
        this.f53755k = new he8(uaeVar);
        this.f53756l = new rke<>();
        this.f53758n = new Object();
        this.f53759o = new Object();
        this.f53748d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            md8.checkNotNullExpressionValue(locale, "US");
            String lowerCase2 = str.toLowerCase(locale);
            md8.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            this.f53748d.put(lowerCase2, Integer.valueOf(i));
            String str2 = this.f53746b.get(strArr[i]);
            if (str2 != null) {
                md8.checkNotNullExpressionValue(locale, "US");
                lowerCase = str2.toLowerCase(locale);
                md8.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.f53749e = strArr2;
        for (Map.Entry<String, String> entry : this.f53746b.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.US;
            md8.checkNotNullExpressionValue(locale2, "US");
            String lowerCase3 = value.toLowerCase(locale2);
            md8.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            if (this.f53748d.containsKey(lowerCase3)) {
                String key = entry.getKey();
                md8.checkNotNullExpressionValue(locale2, "US");
                String lowerCase4 = key.toLowerCase(locale2);
                md8.checkNotNullExpressionValue(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                Map<String, Integer> map3 = this.f53748d;
                map3.put(lowerCase4, (Integer) xt9.getValue(map3, lowerCase3));
            }
        }
        this.f53760p = new RunnableC8321f();
    }

    @fdi
    public static /* synthetic */ void getRefreshRunnable$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAutoCloseCallback() {
        synchronized (this.f53759o) {
            this.f53752h = false;
            this.f53754j.resetTriggerState();
            bgg bggVar = this.f53753i;
            if (bggVar != null) {
                bggVar.close();
                bth bthVar = bth.f14751a;
            }
        }
    }

    private final String[] resolveViews(String[] strArr) {
        Set setCreateSetBuilder = v6f.createSetBuilder();
        for (String str : strArr) {
            Map<String, Set<String>> map = this.f53747c;
            Locale locale = Locale.US;
            md8.checkNotNullExpressionValue(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            md8.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map<String, Set<String>> map2 = this.f53747c;
                md8.checkNotNullExpressionValue(locale, "US");
                String lowerCase2 = str.toLowerCase(locale);
                md8.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Set<String> set = map2.get(lowerCase2);
                md8.checkNotNull(set);
                setCreateSetBuilder.addAll(set);
            } else {
                setCreateSetBuilder.add(str);
            }
        }
        Object[] array = v6f.build(setCreateSetBuilder).toArray(new String[0]);
        md8.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    private final void startTrackingTable(wfg wfgVar, int i) {
        wfgVar.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f53749e[i];
        for (String str2 : f53738r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + f53737q.getTriggerName$room_runtime_release(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE " + f53739s + " SET " + f53741u + " = 1 WHERE " + f53740t + " = " + i + " AND " + f53741u + " = 0; END";
            md8.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            wfgVar.execSQL(str3);
        }
    }

    private final void stopTrackingTable(wfg wfgVar, int i) {
        String str = this.f53749e[i];
        for (String str2 : f53738r) {
            String str3 = "DROP TRIGGER IF EXISTS " + f53737q.getTriggerName$room_runtime_release(str, str2);
            md8.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            wfgVar.execSQL(str3);
        }
    }

    private final String[] validateAndResolveTableNames(String[] strArr) {
        String[] strArrResolveViews = resolveViews(strArr);
        for (String str : strArrResolveViews) {
            Map<String, Integer> map = this.f53748d;
            Locale locale = Locale.US;
            md8.checkNotNullExpressionValue(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            md8.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!map.containsKey(lowerCase)) {
                throw new IllegalArgumentException(("There is no table with name " + str).toString());
            }
        }
        return strArrResolveViews;
    }

    @xqi
    @igg({"RestrictedApi"})
    public void addObserver(@yfb AbstractC8318c abstractC8318c) {
        C8319d c8319dPutIfAbsent;
        md8.checkNotNullParameter(abstractC8318c, "observer");
        String[] strArrResolveViews = resolveViews(abstractC8318c.getTables$room_runtime_release());
        ArrayList arrayList = new ArrayList(strArrResolveViews.length);
        for (String str : strArrResolveViews) {
            Map<String, Integer> map = this.f53748d;
            Locale locale = Locale.US;
            md8.checkNotNullExpressionValue(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            md8.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            arrayList.add(num);
        }
        int[] intArray = v82.toIntArray(arrayList);
        C8319d c8319d = new C8319d(abstractC8318c, intArray, strArrResolveViews);
        synchronized (this.f53756l) {
            c8319dPutIfAbsent = this.f53756l.putIfAbsent(abstractC8318c, c8319d);
        }
        if (c8319dPutIfAbsent == null && this.f53754j.onAdded(Arrays.copyOf(intArray, intArray.length))) {
            syncTriggers$room_runtime_release();
        }
    }

    @p7e({p7e.EnumC10826a.f69936c})
    public void addWeakObserver(@yfb AbstractC8318c abstractC8318c) {
        md8.checkNotNullParameter(abstractC8318c, "observer");
        addObserver(new C8320e(this, abstractC8318c));
    }

    @yfb
    @p7e({p7e.EnumC10826a.f69936c})
    @q64(message = "Use [createLiveData(String[], boolean, Callable)]")
    public <T> AbstractC1158q<T> createLiveData(@yfb String[] strArr, @yfb Callable<T> callable) {
        md8.checkNotNullParameter(strArr, "tableNames");
        md8.checkNotNullParameter(callable, "computeFunction");
        return createLiveData(strArr, false, callable);
    }

    public final boolean ensureInitialization$room_runtime_release() {
        if (!this.f53745a.isOpenInternal()) {
            return false;
        }
        if (!this.f53752h) {
            this.f53745a.getOpenHelper().getWritableDatabase();
        }
        if (this.f53752h) {
            return true;
        }
        Log.e(tae.f84090b, "database is not initialized even though it is open");
        return false;
    }

    @gib
    public final bgg getCleanupStatement$room_runtime_release() {
        return this.f53753i;
    }

    @yfb
    public final uae getDatabase$room_runtime_release() {
        return this.f53745a;
    }

    @yfb
    public final rke<AbstractC8318c, C8319d> getObserverMap$room_runtime_release() {
        return this.f53756l;
    }

    @yfb
    @p7e({p7e.EnumC10826a.f69934a})
    public final AtomicBoolean getPendingRefresh() {
        return this.f53751g;
    }

    @yfb
    public final Map<String, Integer> getTableIdLookup$room_runtime_release() {
        return this.f53748d;
    }

    @yfb
    public final String[] getTablesNames$room_runtime_release() {
        return this.f53749e;
    }

    public final void internalInit$room_runtime_release(@yfb wfg wfgVar) {
        md8.checkNotNullParameter(wfgVar, "database");
        synchronized (this.f53759o) {
            if (this.f53752h) {
                Log.e(tae.f84090b, "Invalidation tracker is initialized twice :/.");
                return;
            }
            wfgVar.execSQL("PRAGMA temp_store = MEMORY;");
            wfgVar.execSQL("PRAGMA recursive_triggers='ON';");
            wfgVar.execSQL(f53742v);
            syncTriggers$room_runtime_release(wfgVar);
            this.f53753i = wfgVar.compileStatement(f53743w);
            this.f53752h = true;
            bth bthVar = bth.f14751a;
        }
    }

    @fdi(otherwise = 3)
    @p7e({p7e.EnumC10826a.f69934a})
    public final void notifyObserversByTableNames(@yfb String... strArr) {
        md8.checkNotNullParameter(strArr, "tables");
        synchronized (this.f53756l) {
            try {
                Iterator<Map.Entry<K, V>> it = this.f53756l.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    md8.checkNotNullExpressionValue(entry, "(observer, wrapper)");
                    AbstractC8318c abstractC8318c = (AbstractC8318c) entry.getKey();
                    C8319d c8319d = (C8319d) entry.getValue();
                    if (!abstractC8318c.isRemote$room_runtime_release()) {
                        c8319d.notifyByTableNames$room_runtime_release(strArr);
                    }
                }
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void refreshVersionsAsync() {
        if (this.f53751g.compareAndSet(false, true)) {
            si0 si0Var = this.f53750f;
            if (si0Var != null) {
                si0Var.incrementCountAndEnsureDbIsOpen();
            }
            this.f53745a.getQueryExecutor().execute(this.f53760p);
        }
    }

    @xqi
    @p7e({p7e.EnumC10826a.f69936c})
    public void refreshVersionsSync() {
        si0 si0Var = this.f53750f;
        if (si0Var != null) {
            si0Var.incrementCountAndEnsureDbIsOpen();
        }
        syncTriggers$room_runtime_release();
        this.f53760p.run();
    }

    @xqi
    @igg({"RestrictedApi"})
    public void removeObserver(@yfb AbstractC8318c abstractC8318c) {
        C8319d c8319dRemove;
        md8.checkNotNullParameter(abstractC8318c, "observer");
        synchronized (this.f53756l) {
            c8319dRemove = this.f53756l.remove(abstractC8318c);
        }
        if (c8319dRemove != null) {
            C8317b c8317b = this.f53754j;
            int[] tableIds$room_runtime_release = c8319dRemove.getTableIds$room_runtime_release();
            if (c8317b.onRemoved(Arrays.copyOf(tableIds$room_runtime_release, tableIds$room_runtime_release.length))) {
                syncTriggers$room_runtime_release();
            }
        }
    }

    public final void setAutoCloser$room_runtime_release(@yfb si0 si0Var) {
        md8.checkNotNullParameter(si0Var, "autoCloser");
        this.f53750f = si0Var;
        si0Var.setAutoCloseCallback(new Runnable() { // from class: je8
            @Override // java.lang.Runnable
            public final void run() {
                this.f50388a.onAutoCloseCallback();
            }
        });
    }

    public final void setCleanupStatement$room_runtime_release(@gib bgg bggVar) {
        this.f53753i = bggVar;
    }

    public final void startMultiInstanceInvalidation$room_runtime_release(@yfb Context context, @yfb String str, @yfb Intent intent) {
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(str, "name");
        md8.checkNotNullParameter(intent, "serviceIntent");
        this.f53757m = new o2b(context, str, intent, this, this.f53745a.getQueryExecutor());
    }

    public final void stopMultiInstanceInvalidation$room_runtime_release() {
        o2b o2bVar = this.f53757m;
        if (o2bVar != null) {
            o2bVar.stop();
        }
        this.f53757m = null;
    }

    public final void syncTriggers$room_runtime_release(@yfb wfg wfgVar) {
        md8.checkNotNullParameter(wfgVar, "database");
        if (wfgVar.inTransaction()) {
            return;
        }
        try {
            Lock closeLock$room_runtime_release = this.f53745a.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                synchronized (this.f53758n) {
                    int[] tablesToSync = this.f53754j.getTablesToSync();
                    if (tablesToSync == null) {
                        return;
                    }
                    f53737q.beginTransactionInternal$room_runtime_release(wfgVar);
                    try {
                        int length = tablesToSync.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            int i3 = tablesToSync[i];
                            int i4 = i2 + 1;
                            if (i3 == 1) {
                                startTrackingTable(wfgVar, i2);
                            } else if (i3 == 2) {
                                stopTrackingTable(wfgVar, i2);
                            }
                            i++;
                            i2 = i4;
                        }
                        wfgVar.setTransactionSuccessful();
                        wfgVar.endTransaction();
                        bth bthVar = bth.f14751a;
                    } catch (Throwable th) {
                        wfgVar.endTransaction();
                        throw th;
                    }
                }
            } finally {
                closeLock$room_runtime_release.unlock();
            }
        } catch (SQLiteException e) {
            Log.e(tae.f84090b, "Cannot run invalidation tracker. Is the db closed?", e);
        } catch (IllegalStateException e2) {
            Log.e(tae.f84090b, "Cannot run invalidation tracker. Is the db closed?", e2);
        }
    }

    @yfb
    @p7e({p7e.EnumC10826a.f69936c})
    public <T> AbstractC1158q<T> createLiveData(@yfb String[] strArr, boolean z, @yfb Callable<T> callable) {
        md8.checkNotNullParameter(strArr, "tableNames");
        md8.checkNotNullParameter(callable, "computeFunction");
        return this.f53755k.create(validateAndResolveTableNames(strArr), z, callable);
    }

    public final void syncTriggers$room_runtime_release() {
        if (this.f53745a.isOpenInternal()) {
            syncTriggers$room_runtime_release(this.f53745a.getOpenHelper().getWritableDatabase());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @p7e({p7e.EnumC10826a.f69936c})
    public ke8(@yfb uae uaeVar, @yfb String... strArr) {
        this(uaeVar, xt9.emptyMap(), xt9.emptyMap(), (String[]) Arrays.copyOf(strArr, strArr.length));
        md8.checkNotNullParameter(uaeVar, "database");
        md8.checkNotNullParameter(strArr, "tableNames");
    }
}

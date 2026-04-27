package p000;

import android.database.Cursor;
import androidx.paging.PositionalDataSource;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.ke8;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69936c})
public abstract class v59<T> extends PositionalDataSource<T> {

    /* JADX INFO: renamed from: a */
    public final xae f90013a;

    /* JADX INFO: renamed from: b */
    public final String f90014b;

    /* JADX INFO: renamed from: c */
    public final String f90015c;

    /* JADX INFO: renamed from: d */
    public final uae f90016d;

    /* JADX INFO: renamed from: e */
    public final ke8.AbstractC8318c f90017e;

    /* JADX INFO: renamed from: f */
    public final boolean f90018f;

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f90019g;

    /* JADX INFO: renamed from: v59$a */
    public class C13875a extends ke8.AbstractC8318c {
        public C13875a(String[] strArr) {
            super(strArr);
        }

        @Override // p000.ke8.AbstractC8318c
        public void onInvalidated(@efb Set<String> set) {
            v59.this.invalidate();
        }
    }

    public v59(@efb uae uaeVar, @efb zfg zfgVar, boolean z, @efb String... strArr) {
        this(uaeVar, xae.copyFrom(zfgVar), z, strArr);
    }

    private xae getSQLiteQuery(int i, int i2) {
        xae xaeVarAcquire = xae.acquire(this.f90015c, this.f90013a.getArgCount() + 2);
        xaeVarAcquire.copyArgumentsFrom(this.f90013a);
        xaeVarAcquire.bindLong(xaeVarAcquire.getArgCount() - 1, i2);
        xaeVarAcquire.bindLong(xaeVarAcquire.getArgCount(), i);
        return xaeVarAcquire;
    }

    private void registerObserverIfNecessary() {
        if (this.f90019g.compareAndSet(false, true)) {
            this.f90016d.getInvalidationTracker().addWeakObserver(this.f90017e);
        }
    }

    @efb
    /* JADX INFO: renamed from: a */
    public abstract List<T> m23799a(@efb Cursor cursor);

    public int countItems() {
        registerObserverIfNecessary();
        xae xaeVarAcquire = xae.acquire(this.f90014b, this.f90013a.getArgCount());
        xaeVarAcquire.copyArgumentsFrom(this.f90013a);
        Cursor cursorQuery = this.f90016d.query(xaeVarAcquire);
        try {
            if (cursorQuery.moveToFirst()) {
                return cursorQuery.getInt(0);
            }
            return 0;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    public boolean isInvalid() {
        registerObserverIfNecessary();
        this.f90016d.getInvalidationTracker().refreshVersionsSync();
        return super.isInvalid();
    }

    public void loadInitial(@efb PositionalDataSource.LoadInitialParams loadInitialParams, @efb PositionalDataSource.LoadInitialCallback<T> loadInitialCallback) throws Throwable {
        xae sQLiteQuery;
        int i;
        xae xaeVar;
        registerObserverIfNecessary();
        List<T> listEmptyList = Collections.emptyList();
        this.f90016d.beginTransaction();
        Cursor cursorQuery = null;
        try {
            int iCountItems = countItems();
            if (iCountItems != 0) {
                int iComputeInitialLoadPosition = computeInitialLoadPosition(loadInitialParams, iCountItems);
                sQLiteQuery = getSQLiteQuery(iComputeInitialLoadPosition, computeInitialLoadSize(loadInitialParams, iComputeInitialLoadPosition, iCountItems));
                try {
                    cursorQuery = this.f90016d.query(sQLiteQuery);
                    List<T> listM23799a = m23799a(cursorQuery);
                    this.f90016d.setTransactionSuccessful();
                    xaeVar = sQLiteQuery;
                    i = iComputeInitialLoadPosition;
                    listEmptyList = listM23799a;
                } catch (Throwable th) {
                    th = th;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    this.f90016d.endTransaction();
                    if (sQLiteQuery != null) {
                        sQLiteQuery.release();
                    }
                    throw th;
                }
            } else {
                i = 0;
                xaeVar = null;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            this.f90016d.endTransaction();
            if (xaeVar != null) {
                xaeVar.release();
            }
            loadInitialCallback.onResult(listEmptyList, i, iCountItems);
        } catch (Throwable th2) {
            th = th2;
            sQLiteQuery = null;
        }
    }

    public void loadRange(@efb PositionalDataSource.LoadRangeParams loadRangeParams, @efb PositionalDataSource.LoadRangeCallback<T> loadRangeCallback) {
        loadRangeCallback.onResult(loadRange(loadRangeParams.startPosition, loadRangeParams.loadSize));
    }

    public v59(@efb uae uaeVar, @efb zfg zfgVar, boolean z, boolean z2, @efb String... strArr) {
        this(uaeVar, xae.copyFrom(zfgVar), z, z2, strArr);
    }

    @efb
    public List<T> loadRange(int i, int i2) {
        xae sQLiteQuery = getSQLiteQuery(i, i2);
        if (!this.f90018f) {
            Cursor cursorQuery = this.f90016d.query(sQLiteQuery);
            try {
                return m23799a(cursorQuery);
            } finally {
                cursorQuery.close();
                sQLiteQuery.release();
            }
        }
        this.f90016d.beginTransaction();
        Cursor cursorQuery2 = null;
        try {
            cursorQuery2 = this.f90016d.query(sQLiteQuery);
            List<T> listM23799a = m23799a(cursorQuery2);
            this.f90016d.setTransactionSuccessful();
            return listM23799a;
        } finally {
            if (cursorQuery2 != null) {
                cursorQuery2.close();
            }
            this.f90016d.endTransaction();
            sQLiteQuery.release();
        }
    }

    public v59(@efb uae uaeVar, @efb xae xaeVar, boolean z, @efb String... strArr) {
        this(uaeVar, xaeVar, z, true, strArr);
    }

    public v59(@efb uae uaeVar, @efb xae xaeVar, boolean z, boolean z2, @efb String... strArr) {
        this.f90019g = new AtomicBoolean(false);
        this.f90016d = uaeVar;
        this.f90013a = xaeVar;
        this.f90018f = z;
        this.f90014b = "SELECT COUNT(*) FROM ( " + xaeVar.getSql() + " )";
        this.f90015c = "SELECT * FROM ( " + xaeVar.getSql() + " ) LIMIT ? OFFSET ?";
        this.f90017e = new C13875a(strArr);
        if (z2) {
            registerObserverIfNecessary();
        }
    }
}

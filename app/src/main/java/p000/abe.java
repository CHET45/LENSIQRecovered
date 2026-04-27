package p000;

import androidx.lifecycle.AbstractC1158q;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.ke8;

/* JADX INFO: loaded from: classes3.dex */
@igg({"RestrictedApi"})
public final class abe<T> extends AbstractC1158q<T> {

    /* JADX INFO: renamed from: m */
    @yfb
    public final uae f964m;

    /* JADX INFO: renamed from: n */
    @yfb
    public final he8 f965n;

    /* JADX INFO: renamed from: o */
    public final boolean f966o;

    /* JADX INFO: renamed from: p */
    @yfb
    public final Callable<T> f967p;

    /* JADX INFO: renamed from: q */
    @yfb
    public final ke8.AbstractC8318c f968q;

    /* JADX INFO: renamed from: r */
    @yfb
    public final AtomicBoolean f969r;

    /* JADX INFO: renamed from: s */
    @yfb
    public final AtomicBoolean f970s;

    /* JADX INFO: renamed from: t */
    @yfb
    public final AtomicBoolean f971t;

    /* JADX INFO: renamed from: u */
    @yfb
    public final Runnable f972u;

    /* JADX INFO: renamed from: v */
    @yfb
    public final Runnable f973v;

    /* JADX INFO: renamed from: abe$a */
    public static final class C0151a extends ke8.AbstractC8318c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ abe<T> f974b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0151a(String[] strArr, abe<T> abeVar) {
            super(strArr);
            this.f974b = abeVar;
        }

        @Override // p000.ke8.AbstractC8318c
        public void onInvalidated(@yfb Set<String> set) {
            md8.checkNotNullParameter(set, "tables");
            a50.getInstance().executeOnMainThread(this.f974b.getInvalidationRunnable());
        }
    }

    public abe(@yfb uae uaeVar, @yfb he8 he8Var, boolean z, @yfb Callable<T> callable, @yfb String[] strArr) {
        md8.checkNotNullParameter(uaeVar, "database");
        md8.checkNotNullParameter(he8Var, "container");
        md8.checkNotNullParameter(callable, "computeFunction");
        md8.checkNotNullParameter(strArr, "tableNames");
        this.f964m = uaeVar;
        this.f965n = he8Var;
        this.f966o = z;
        this.f967p = callable;
        this.f968q = new C0151a(strArr, this);
        this.f969r = new AtomicBoolean(true);
        this.f970s = new AtomicBoolean(false);
        this.f971t = new AtomicBoolean(false);
        this.f972u = new Runnable() { // from class: yae
            @Override // java.lang.Runnable
            public final void run() {
                abe.refreshRunnable$lambda$0(this.f101000a);
            }
        };
        this.f973v = new Runnable() { // from class: zae
            @Override // java.lang.Runnable
            public final void run() {
                abe.invalidationRunnable$lambda$1(this.f104641a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invalidationRunnable$lambda$1(abe abeVar) {
        md8.checkNotNullParameter(abeVar, "this$0");
        boolean zHasActiveObservers = abeVar.hasActiveObservers();
        if (abeVar.f969r.compareAndSet(false, true) && zHasActiveObservers) {
            abeVar.getQueryExecutor().execute(abeVar.f972u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshRunnable$lambda$0(abe abeVar) {
        boolean z;
        md8.checkNotNullParameter(abeVar, "this$0");
        if (abeVar.f971t.compareAndSet(false, true)) {
            abeVar.f964m.getInvalidationTracker().addWeakObserver(abeVar.f968q);
        }
        do {
            if (abeVar.f970s.compareAndSet(false, true)) {
                T tCall = null;
                z = false;
                while (abeVar.f969r.compareAndSet(true, false)) {
                    try {
                        try {
                            tCall = abeVar.f967p.call();
                            z = true;
                        } catch (Exception e) {
                            throw new RuntimeException("Exception while computing database live data.", e);
                        }
                    } finally {
                        abeVar.f970s.set(false);
                    }
                }
                if (z) {
                    abeVar.postValue(tCall);
                }
            } else {
                z = false;
            }
            if (!z) {
                return;
            }
        } while (abeVar.f969r.get());
    }

    @Override // androidx.lifecycle.AbstractC1158q
    /* JADX INFO: renamed from: d */
    public void mo317d() {
        super.mo317d();
        he8 he8Var = this.f965n;
        md8.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        he8Var.onActive(this);
        getQueryExecutor().execute(this.f972u);
    }

    @Override // androidx.lifecycle.AbstractC1158q
    /* JADX INFO: renamed from: e */
    public void mo318e() {
        super.mo318e();
        he8 he8Var = this.f965n;
        md8.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        he8Var.onInactive(this);
    }

    @yfb
    public final Callable<T> getComputeFunction() {
        return this.f967p;
    }

    @yfb
    public final AtomicBoolean getComputing() {
        return this.f970s;
    }

    @yfb
    public final uae getDatabase() {
        return this.f964m;
    }

    public final boolean getInTransaction() {
        return this.f966o;
    }

    @yfb
    public final AtomicBoolean getInvalid() {
        return this.f969r;
    }

    @yfb
    public final Runnable getInvalidationRunnable() {
        return this.f973v;
    }

    @yfb
    public final ke8.AbstractC8318c getObserver() {
        return this.f968q;
    }

    @yfb
    public final Executor getQueryExecutor() {
        return this.f966o ? this.f964m.getTransactionExecutor() : this.f964m.getQueryExecutor();
    }

    @yfb
    public final Runnable getRefreshRunnable() {
        return this.f972u;
    }

    @yfb
    public final AtomicBoolean getRegisteredObserver() {
        return this.f971t;
    }
}

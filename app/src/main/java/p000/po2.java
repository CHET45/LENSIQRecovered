package p000;

import androidx.lifecycle.AbstractC1158q;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69936c})
public abstract class po2<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Executor f71515a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final AbstractC1158q<T> f71516b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final AbstractC1158q<T> f71517c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final AtomicBoolean f71518d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final AtomicBoolean f71519e;

    /* JADX INFO: renamed from: f */
    @un8
    @yfb
    public final Runnable f71520f;

    /* JADX INFO: renamed from: g */
    @un8
    @yfb
    public final Runnable f71521g;

    /* JADX INFO: renamed from: po2$a */
    public static final class C11043a extends AbstractC1158q<T> {

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ po2<T> f71522m;

        public C11043a(po2<T> po2Var) {
            this.f71522m = po2Var;
        }

        @Override // androidx.lifecycle.AbstractC1158q
        /* JADX INFO: renamed from: d */
        public void mo317d() {
            this.f71522m.getExecutor$lifecycle_livedata_release().execute(this.f71522m.f71520f);
        }
    }

    @yn8
    public po2() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @fdi
    public static /* synthetic */ void getInvalidationRunnable$lifecycle_livedata_release$annotations() {
    }

    @fdi
    public static /* synthetic */ void getRefreshRunnable$lifecycle_livedata_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invalidationRunnable$lambda$1(po2 po2Var) {
        md8.checkNotNullParameter(po2Var, "this$0");
        boolean zHasActiveObservers = po2Var.getLiveData().hasActiveObservers();
        if (po2Var.f71518d.compareAndSet(false, true) && zHasActiveObservers) {
            po2Var.f71515a.execute(po2Var.f71520f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void refreshRunnable$lambda$0(po2 po2Var) {
        md8.checkNotNullParameter(po2Var, "this$0");
        do {
            boolean z = false;
            if (po2Var.f71519e.compareAndSet(false, true)) {
                Object objM19633c = null;
                boolean z2 = false;
                while (po2Var.f71518d.compareAndSet(true, false)) {
                    try {
                        objM19633c = po2Var.m19633c();
                        z2 = true;
                    } catch (Throwable th) {
                        po2Var.f71519e.set(false);
                        throw th;
                    }
                }
                if (z2) {
                    po2Var.getLiveData().postValue(objM19633c);
                }
                po2Var.f71519e.set(false);
                z = z2;
            }
            if (!z) {
                return;
            }
        } while (po2Var.f71518d.get());
    }

    @xqi
    /* JADX INFO: renamed from: c */
    public abstract T m19633c();

    @yfb
    public final AtomicBoolean getComputing$lifecycle_livedata_release() {
        return this.f71519e;
    }

    @yfb
    public final Executor getExecutor$lifecycle_livedata_release() {
        return this.f71515a;
    }

    @yfb
    public final AtomicBoolean getInvalid$lifecycle_livedata_release() {
        return this.f71518d;
    }

    @yfb
    public AbstractC1158q<T> getLiveData() {
        return this.f71517c;
    }

    public void invalidate() {
        a50.getInstance().executeOnMainThread(this.f71521g);
    }

    @yn8
    public po2(@yfb Executor executor) {
        md8.checkNotNullParameter(executor, "executor");
        this.f71515a = executor;
        C11043a c11043a = new C11043a(this);
        this.f71516b = c11043a;
        this.f71517c = c11043a;
        this.f71518d = new AtomicBoolean(true);
        this.f71519e = new AtomicBoolean(false);
        this.f71520f = new Runnable() { // from class: no2
            @Override // java.lang.Runnable
            public final void run() {
                po2.refreshRunnable$lambda$0(this.f65129a);
            }
        };
        this.f71521g = new Runnable() { // from class: oo2
            @Override // java.lang.Runnable
            public final void run() {
                po2.invalidationRunnable$lambda$1(this.f68219a);
            }
        };
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ po2(Executor executor, int i, jt3 jt3Var) {
        if ((i & 1) != 0) {
            executor = a50.getIOThreadExecutor();
            md8.checkNotNullExpressionValue(executor, "getIOThreadExecutor()");
        }
        this(executor);
    }
}

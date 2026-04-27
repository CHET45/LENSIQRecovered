package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1#2:191\n1855#3,2:192\n*S KotlinDebug\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n*L\n154#1:192,2\n*E\n"})
public final class gy6 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Executor f41808a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final ny6<bth> f41809b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Object f41810c;

    /* JADX INFO: renamed from: d */
    @xc7("lock")
    public int f41811d;

    /* JADX INFO: renamed from: e */
    @xc7("lock")
    public boolean f41812e;

    /* JADX INFO: renamed from: f */
    @xc7("lock")
    public boolean f41813f;

    /* JADX INFO: renamed from: g */
    @xc7("lock")
    @yfb
    public final List<ny6<bth>> f41814g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final Runnable f41815h;

    public gy6(@yfb Executor executor, @yfb ny6<bth> ny6Var) {
        md8.checkNotNullParameter(executor, "executor");
        md8.checkNotNullParameter(ny6Var, "reportFullyDrawn");
        this.f41808a = executor;
        this.f41809b = ny6Var;
        this.f41810c = new Object();
        this.f41814g = new ArrayList();
        this.f41815h = new Runnable() { // from class: fy6
            @Override // java.lang.Runnable
            public final void run() {
                gy6.reportRunnable$lambda$2(this.f38030a);
            }
        };
    }

    private final void postWhenReportersAreDone() {
        if (this.f41812e || this.f41811d != 0) {
            return;
        }
        this.f41812e = true;
        this.f41808a.execute(this.f41815h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportRunnable$lambda$2(gy6 gy6Var) {
        md8.checkNotNullParameter(gy6Var, "this$0");
        synchronized (gy6Var.f41810c) {
            try {
                gy6Var.f41812e = false;
                if (gy6Var.f41811d == 0 && !gy6Var.f41813f) {
                    gy6Var.f41809b.invoke();
                    gy6Var.fullyDrawnReported();
                }
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void addOnReportDrawnListener(@yfb ny6<bth> ny6Var) {
        boolean z;
        md8.checkNotNullParameter(ny6Var, "callback");
        synchronized (this.f41810c) {
            if (this.f41813f) {
                z = true;
            } else {
                this.f41814g.add(ny6Var);
                z = false;
            }
        }
        if (z) {
            ny6Var.invoke();
        }
    }

    public final void addReporter() {
        synchronized (this.f41810c) {
            try {
                if (!this.f41813f) {
                    this.f41811d++;
                }
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public final void fullyDrawnReported() {
        synchronized (this.f41810c) {
            try {
                this.f41813f = true;
                Iterator<T> it = this.f41814g.iterator();
                while (it.hasNext()) {
                    ((ny6) it.next()).invoke();
                }
                this.f41814g.clear();
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isFullyDrawnReported() {
        boolean z;
        synchronized (this.f41810c) {
            z = this.f41813f;
        }
        return z;
    }

    public final void removeOnReportDrawnListener(@yfb ny6<bth> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "callback");
        synchronized (this.f41810c) {
            this.f41814g.remove(ny6Var);
            bth bthVar = bth.f14751a;
        }
    }

    public final void removeReporter() {
        int i;
        synchronized (this.f41810c) {
            try {
                if (!this.f41813f && (i = this.f41811d) > 0) {
                    this.f41811d = i - 1;
                    postWhenReportersAreDone();
                }
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

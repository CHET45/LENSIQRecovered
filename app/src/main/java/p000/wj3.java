package p000;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class wj3 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final e13 f94400a;

    /* JADX INFO: renamed from: b */
    @gib
    public final a23 f94401b;

    /* JADX INFO: renamed from: c */
    public final long f94402c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final List<StackTraceElement> f94403d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final String f94404e;

    /* JADX INFO: renamed from: f */
    @gib
    public final Thread f94405f;

    /* JADX INFO: renamed from: g */
    @gib
    public final a23 f94406g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final List<StackTraceElement> f94407h;

    public wj3(@yfb xj3 xj3Var, @yfb e13 e13Var) {
        this.f94400a = e13Var;
        this.f94401b = xj3Var.getCreationStackBottom$kotlinx_coroutines_core();
        this.f94402c = xj3Var.f98173b;
        this.f94403d = xj3Var.getCreationStackTrace();
        this.f94404e = xj3Var.getState$kotlinx_coroutines_core();
        this.f94405f = xj3Var.lastObservedThread;
        this.f94406g = xj3Var.getLastObservedFrame$kotlinx_coroutines_core();
        this.f94407h = xj3Var.lastObservedStackTrace$kotlinx_coroutines_core();
    }

    @yfb
    public final e13 getContext() {
        return this.f94400a;
    }

    @gib
    public final a23 getCreationStackBottom$kotlinx_coroutines_core() {
        return this.f94401b;
    }

    @yfb
    public final List<StackTraceElement> getCreationStackTrace() {
        return this.f94403d;
    }

    @gib
    public final a23 getLastObservedFrame() {
        return this.f94406g;
    }

    @gib
    public final Thread getLastObservedThread() {
        return this.f94405f;
    }

    public final long getSequenceNumber() {
        return this.f94402c;
    }

    @yfb
    public final String getState() {
        return this.f94404e;
    }

    @yfb
    @xn8(name = "lastObservedStackTrace")
    public final List<StackTraceElement> lastObservedStackTrace() {
        return this.f94407h;
    }
}

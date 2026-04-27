package p000;

import java.io.Serializable;
import java.lang.Thread;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class tk3 implements Serializable {

    /* JADX INFO: renamed from: C */
    public final long f85098C;

    /* JADX INFO: renamed from: a */
    @gib
    public final Long f85099a;

    /* JADX INFO: renamed from: b */
    @gib
    public final String f85100b;

    /* JADX INFO: renamed from: c */
    @gib
    public final String f85101c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final String f85102d;

    /* JADX INFO: renamed from: e */
    @gib
    public final String f85103e;

    /* JADX INFO: renamed from: f */
    @gib
    public final String f85104f;

    /* JADX INFO: renamed from: m */
    @yfb
    public final List<StackTraceElement> f85105m;

    public tk3(@yfb xj3 xj3Var, @yfb e13 e13Var) {
        Thread.State state;
        r13 r13Var = (r13) e13Var.get(r13.f76737c);
        this.f85099a = r13Var != null ? Long.valueOf(r13Var.getId()) : null;
        dz2 dz2Var = (dz2) e13Var.get(dz2.f31343s);
        this.f85100b = dz2Var != null ? dz2Var.toString() : null;
        u13 u13Var = (u13) e13Var.get(u13.f86542c);
        this.f85101c = u13Var != null ? u13Var.getName() : null;
        this.f85102d = xj3Var.getState$kotlinx_coroutines_core();
        Thread thread = xj3Var.lastObservedThread;
        this.f85103e = (thread == null || (state = thread.getState()) == null) ? null : state.toString();
        Thread thread2 = xj3Var.lastObservedThread;
        this.f85104f = thread2 != null ? thread2.getName() : null;
        this.f85105m = xj3Var.lastObservedStackTrace$kotlinx_coroutines_core();
        this.f85098C = xj3Var.f98173b;
    }

    @gib
    public final Long getCoroutineId() {
        return this.f85099a;
    }

    @gib
    public final String getDispatcher() {
        return this.f85100b;
    }

    @yfb
    public final List<StackTraceElement> getLastObservedStackTrace() {
        return this.f85105m;
    }

    @gib
    public final String getLastObservedThreadName() {
        return this.f85104f;
    }

    @gib
    public final String getLastObservedThreadState() {
        return this.f85103e;
    }

    @gib
    public final String getName() {
        return this.f85101c;
    }

    public final long getSequenceNumber() {
        return this.f85098C;
    }

    @yfb
    public final String getState() {
        return this.f85102d;
    }
}

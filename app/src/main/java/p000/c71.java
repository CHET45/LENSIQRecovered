package p000;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/BlockingCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
public final class c71<T> extends AbstractC12833t0<T> {

    /* JADX INFO: renamed from: d */
    @yfb
    public final Thread f15890d;

    /* JADX INFO: renamed from: e */
    @gib
    public final e65 f15891e;

    public c71(@yfb e13 e13Var, @yfb Thread thread, @gib e65 e65Var) {
        super(e13Var, true, true);
        this.f15890d = thread;
        this.f15891e = e65Var;
    }

    @Override // p000.sj8
    /* JADX INFO: renamed from: a */
    public void mo3831a(@gib Object obj) {
        if (md8.areEqual(Thread.currentThread(), this.f15890d)) {
            return;
        }
        Thread thread = this.f15890d;
        AbstractC2202c5 abstractC2202c5 = C4613d5.f28447a;
        if (abstractC2202c5 != null) {
            abstractC2202c5.unpark(thread);
        } else {
            LockSupport.unpark(thread);
        }
    }

    @Override // p000.sj8
    /* JADX INFO: renamed from: j */
    public boolean mo3832j() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T joinBlocking() throws Throwable {
        AbstractC2202c5 abstractC2202c5 = C4613d5.f28447a;
        if (abstractC2202c5 != null) {
            abstractC2202c5.registerTimeLoopThread();
        }
        try {
            e65 e65Var = this.f15891e;
            if (e65Var != null) {
                e65.incrementUseCount$default(e65Var, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    e65 e65Var2 = this.f15891e;
                    long jProcessNextEvent = e65Var2 != null ? e65Var2.processNextEvent() : Long.MAX_VALUE;
                    if (isCompleted()) {
                        e65 e65Var3 = this.f15891e;
                        if (e65Var3 != null) {
                            e65.decrementUseCount$default(e65Var3, false, 1, null);
                        }
                        T t = (T) tj8.unboxState(getState$kotlinx_coroutines_core());
                        ni2 ni2Var = t instanceof ni2 ? (ni2) t : null;
                        if (ni2Var == null) {
                            return t;
                        }
                        throw ni2Var.f64635a;
                    }
                    AbstractC2202c5 abstractC2202c52 = C4613d5.f28447a;
                    if (abstractC2202c52 != null) {
                        abstractC2202c52.parkNanos(this, jProcessNextEvent);
                    } else {
                        LockSupport.parkNanos(this, jProcessNextEvent);
                    }
                } catch (Throwable th) {
                    e65 e65Var4 = this.f15891e;
                    if (e65Var4 != null) {
                        e65.decrementUseCount$default(e65Var4, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            cancelCoroutine(interruptedException);
            throw interruptedException;
        } finally {
            AbstractC2202c5 abstractC2202c53 = C4613d5.f28447a;
            if (abstractC2202c53 != null) {
                abstractC2202c53.unregisterTimeLoopThread();
            }
        }
    }
}

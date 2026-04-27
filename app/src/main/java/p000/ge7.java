package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n+ 2 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,212:1\n13#2:213\n*S KotlinDebug\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n*L\n140#1:213\n*E\n"})
public final class ge7 extends he7 implements o34 {

    /* JADX INFO: renamed from: c */
    @yfb
    public final Handler f39612c;

    /* JADX INFO: renamed from: d */
    @gib
    public final String f39613d;

    /* JADX INFO: renamed from: e */
    public final boolean f39614e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final ge7 f39615f;

    /* JADX INFO: renamed from: ge7$a */
    @dwf({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,13:1\n141#2:14\n142#2:16\n1#3:15\n*E\n"})
    public static final class RunnableC6273a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dq1 f39616a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ge7 f39617b;

        public RunnableC6273a(dq1 dq1Var, ge7 ge7Var) {
            this.f39616a = dq1Var;
            this.f39617b = ge7Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f39616a.resumeUndispatched(this.f39617b, bth.f14751a);
        }
    }

    private ge7(Handler handler, String str, boolean z) {
        super(null);
        this.f39612c = handler;
        this.f39613d = str;
        this.f39614e = z;
        this.f39615f = z ? this : new ge7(handler, str, true);
    }

    private final void cancelOnRejection(e13 e13Var, Runnable runnable) {
        oj8.cancel(e13Var, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        df4.getIO().mo29873dispatch(e13Var, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeOnTimeout$lambda$3(ge7 ge7Var, Runnable runnable) {
        ge7Var.f39612c.removeCallbacks(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth scheduleResumeAfterDelay$lambda$2(ge7 ge7Var, Runnable runnable, Throwable th) {
        ge7Var.f39612c.removeCallbacks(runnable);
        return bth.f14751a;
    }

    @Override // p000.m13
    /* JADX INFO: renamed from: dispatch */
    public void mo29873dispatch(@yfb e13 e13Var, @yfb Runnable runnable) {
        if (this.f39612c.post(runnable)) {
            return;
        }
        cancelOnRejection(e13Var, runnable);
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof ge7) {
            ge7 ge7Var = (ge7) obj;
            if (ge7Var.f39612c == this.f39612c && ge7Var.f39614e == this.f39614e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this.f39612c) ^ (this.f39614e ? 1231 : 1237);
    }

    @Override // p000.he7, p000.o34
    @yfb
    public yf4 invokeOnTimeout(long j, @yfb final Runnable runnable, @yfb e13 e13Var) {
        if (this.f39612c.postDelayed(runnable, kpd.coerceAtMost(j, 4611686018427387903L))) {
            return new yf4() { // from class: ee7
                @Override // p000.yf4
                public final void dispose() {
                    ge7.invokeOnTimeout$lambda$3(this.f32742a, runnable);
                }
            };
        }
        cancelOnRejection(e13Var, runnable);
        return xeb.f97598a;
    }

    @Override // p000.m13
    public boolean isDispatchNeeded(@yfb e13 e13Var) {
        return (this.f39614e && md8.areEqual(Looper.myLooper(), this.f39612c.getLooper())) ? false : true;
    }

    @Override // p000.o34
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo29874scheduleResumeAfterDelay(long j, @yfb dq1<? super bth> dq1Var) {
        final RunnableC6273a runnableC6273a = new RunnableC6273a(dq1Var, this);
        if (this.f39612c.postDelayed(runnableC6273a, kpd.coerceAtMost(j, 4611686018427387903L))) {
            dq1Var.invokeOnCancellation(new qy6() { // from class: fe7
                @Override // p000.qy6
                public final Object invoke(Object obj) {
                    return ge7.scheduleResumeAfterDelay$lambda$2(this.f36283a, runnableC6273a, (Throwable) obj);
                }
            });
        } else {
            cancelOnRejection(dq1Var.getContext(), runnableC6273a);
        }
    }

    @Override // p000.dr9, p000.m13
    @yfb
    public String toString() {
        String strM9332a = m9332a();
        if (strM9332a != null) {
            return strM9332a;
        }
        String string = this.f39613d;
        if (string == null) {
            string = this.f39612c.toString();
        }
        if (!this.f39614e) {
            return string;
        }
        return string + ".immediate";
    }

    @Override // p000.he7, p000.dr9
    @yfb
    public ge7 getImmediate() {
        return this.f39615f;
    }

    public /* synthetic */ ge7(Handler handler, String str, int i, jt3 jt3Var) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public ge7(@yfb Handler handler, @gib String str) {
        this(handler, str, false);
    }
}

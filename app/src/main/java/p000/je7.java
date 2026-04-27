package p000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import p000.v7e;
import p000.ymh;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 Runnable.kt\nkotlinx/coroutines/RunnableKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n351#2,11:213\n351#2,9:224\n360#2,2:234\n13#3:233\n1#4:236\n*S KotlinDebug\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n*L\n184#1:213,11\n192#1:224,9\n192#1:234,2\n196#1:233\n*E\n"})
public final class je7 {

    /* JADX INFO: renamed from: a */
    public static final long f50385a = 4611686018427387903L;

    /* JADX INFO: renamed from: b */
    @gib
    @un8
    public static final he7 f50386b;

    @gib
    private static volatile Choreographer choreographer;

    /* JADX INFO: renamed from: je7$a */
    @dwf({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n*L\n1#1,13:1\n197#2,2:14\n*E\n"})
    public static final class RunnableC7879a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dq1 f50387a;

        public RunnableC7879a(dq1 dq1Var) {
            this.f50387a = dq1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            je7.updateChoreographerAndPostFrameCallback(this.f50387a);
        }
    }

    static {
        Object objM32723constructorimpl;
        try {
            v7e.C13927a c13927a = v7e.f90266b;
            objM32723constructorimpl = v7e.m32723constructorimpl(new ge7(asHandler(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            v7e.C13927a c13927a2 = v7e.f90266b;
            objM32723constructorimpl = v7e.m32723constructorimpl(y7e.createFailure(th));
        }
        f50386b = (he7) (v7e.m32729isFailureimpl(objM32723constructorimpl) ? null : objM32723constructorimpl);
    }

    @yfb
    @fdi
    public static final Handler asHandler(@yfb Looper looper, boolean z) throws IllegalAccessException, InvocationTargetException {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            md8.checkNotNull(objInvoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    @gib
    public static final Object awaitFrame(@yfb zy2<? super Long> zy2Var) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            return awaitFrameSlowPath(zy2Var);
        }
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        postFrameCallback(choreographer2, fq1Var);
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object awaitFrameSlowPath(zy2<? super Long> zy2Var) {
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            updateChoreographerAndPostFrameCallback(fq1Var);
        } else {
            df4.getMain().mo29873dispatch(fq1Var.getContext(), new RunnableC7879a(fq1Var));
        }
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result;
    }

    @yfb
    @xn8(name = ymh.InterfaceC15729h.f102263c)
    @yn8
    public static final he7 from(@yfb Handler handler) {
        return from$default(handler, null, 1, null);
    }

    public static /* synthetic */ he7 from$default(Handler handler, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return from(handler, str);
    }

    @q64(level = u64.f86867c, message = "Use Dispatchers.Main instead")
    public static /* synthetic */ void getMain$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postFrameCallback(Choreographer choreographer2, final dq1<? super Long> dq1Var) {
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: ie7
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                je7.postFrameCallback$lambda$6(dq1Var, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postFrameCallback$lambda$6(dq1 dq1Var, long j) {
        dq1Var.resumeUndispatched(df4.getMain(), Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateChoreographerAndPostFrameCallback(dq1<? super Long> dq1Var) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            md8.checkNotNull(choreographer2);
            choreographer = choreographer2;
        }
        postFrameCallback(choreographer2, dq1Var);
    }

    @yfb
    @xn8(name = ymh.InterfaceC15729h.f102263c)
    @yn8
    public static final he7 from(@yfb Handler handler, @gib String str) {
        return new ge7(handler, str);
    }
}

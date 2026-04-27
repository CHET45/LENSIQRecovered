package p000;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import p000.e13;
import p000.jj8;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nJob.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Job.kt\nkotlinx/coroutines/JobKt__JobKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,677:1\n1317#2,2:678\n1317#2,2:680\n1317#2,2:682\n1317#2,2:684\n*S KotlinDebug\n*F\n+ 1 Job.kt\nkotlinx/coroutines/JobKt__JobKt\n*L\n505#1:678,2\n519#1:680,2\n613#1:682,2\n637#1:684,2\n*E\n"})
public final /* synthetic */ class qj8 {

    /* JADX INFO: renamed from: qj8$a */
    public /* synthetic */ class C11495a extends n07 implements qy6<Throwable, bth> {
        public C11495a(Object obj) {
            super(1, obj, rj8.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
            invoke2(th);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            ((rj8) this.receiver).invoke(th);
        }
    }

    @yfb
    public static final jg2 Job(@gib jj8 jj8Var) {
        return new lj8(jj8Var);
    }

    public static /* synthetic */ jg2 Job$default(jj8 jj8Var, int i, Object obj) {
        if ((i & 1) != 0) {
            jj8Var = null;
        }
        return oj8.Job(jj8Var);
    }

    public static final void cancel(@yfb e13 e13Var, @gib CancellationException cancellationException) {
        jj8 jj8Var = (jj8) e13Var.get(jj8.f50715A);
        if (jj8Var != null) {
            jj8Var.cancel(cancellationException);
        }
    }

    public static /* synthetic */ void cancel$default(e13 e13Var, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        oj8.cancel(e13Var, cancellationException);
    }

    @gib
    public static final Object cancelAndJoin(@yfb jj8 jj8Var, @yfb zy2<? super bth> zy2Var) {
        jj8.C7916a.cancel$default(jj8Var, (CancellationException) null, 1, (Object) null);
        Object objJoin = jj8Var.join(zy2Var);
        return objJoin == pd8.getCOROUTINE_SUSPENDED() ? objJoin : bth.f14751a;
    }

    public static final void cancelChildren(@yfb jj8 jj8Var, @gib CancellationException cancellationException) {
        Iterator<jj8> it = jj8Var.getChildren().iterator();
        while (it.hasNext()) {
            it.next().cancel(cancellationException);
        }
    }

    public static /* synthetic */ void cancelChildren$default(jj8 jj8Var, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        oj8.cancelChildren(jj8Var, cancellationException);
    }

    @yfb
    public static final yf4 disposeOnCompletion(@yfb jj8 jj8Var, @yfb yf4 yf4Var) {
        return invokeOnCompletion$default(jj8Var, false, new tg4(yf4Var), 1, null);
    }

    public static final void ensureActive(@yfb jj8 jj8Var) {
        if (!jj8Var.isActive()) {
            throw jj8Var.getCancellationException();
        }
    }

    @yfb
    public static final jj8 getJob(@yfb e13 e13Var) {
        jj8 jj8Var = (jj8) e13Var.get(jj8.f50715A);
        if (jj8Var != null) {
            return jj8Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + e13Var).toString());
    }

    @yfb
    public static final yf4 invokeOnCompletion(@yfb jj8 jj8Var, boolean z, @yfb rj8 rj8Var) {
        return jj8Var instanceof sj8 ? ((sj8) jj8Var).invokeOnCompletionInternal$kotlinx_coroutines_core(z, rj8Var) : jj8Var.invokeOnCompletion(rj8Var.getOnCancelling(), z, new C11495a(rj8Var));
    }

    public static /* synthetic */ yf4 invokeOnCompletion$default(jj8 jj8Var, boolean z, rj8 rj8Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return oj8.invokeOnCompletion(jj8Var, z, rj8Var);
    }

    public static final boolean isActive(@yfb e13 e13Var) {
        jj8 jj8Var = (jj8) e13Var.get(jj8.f50715A);
        if (jj8Var != null) {
            return jj8Var.isActive();
        }
        return true;
    }

    private static final Throwable orCancellation$JobKt__JobKt(Throwable th, jj8 jj8Var) {
        return th == null ? new kj8("Job was cancelled", null, jj8Var) : th;
    }

    @xn8(name = "Job")
    @q64(level = u64.f86867c, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* JADX INFO: renamed from: Job, reason: collision with other method in class */
    public static final /* synthetic */ jj8 m31936Job(jj8 jj8Var) {
        return oj8.Job(jj8Var);
    }

    /* JADX INFO: renamed from: Job$default, reason: collision with other method in class */
    public static /* synthetic */ jj8 m31937Job$default(jj8 jj8Var, int i, Object obj) {
        if ((i & 1) != 0) {
            jj8Var = null;
        }
        return m31936Job(jj8Var);
    }

    public static /* synthetic */ void cancel$default(jj8 jj8Var, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        oj8.cancel(jj8Var, str, th);
    }

    public static /* synthetic */ void cancelChildren$default(jj8 jj8Var, Throwable th, int i, Object obj) throws Throwable {
        if ((i & 1) != 0) {
            th = null;
        }
        cancelChildren(jj8Var, th);
    }

    public static final void ensureActive(@yfb e13 e13Var) {
        jj8 jj8Var = (jj8) e13Var.get(jj8.f50715A);
        if (jj8Var != null) {
            oj8.ensureActive(jj8Var);
        }
    }

    public static final void cancel(@yfb jj8 jj8Var, @yfb String str, @gib Throwable th) {
        jj8Var.cancel(y75.CancellationException(str, th));
    }

    public static /* synthetic */ boolean cancel$default(e13 e13Var, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        return cancel(e13Var, th);
    }

    public static /* synthetic */ void cancelChildren$default(e13 e13Var, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        oj8.cancelChildren(e13Var, cancellationException);
    }

    @q64(level = u64.f86867c, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ boolean cancel(e13 e13Var, Throwable th) throws Throwable {
        e13.InterfaceC5040b interfaceC5040b = e13Var.get(jj8.f50715A);
        sj8 sj8Var = interfaceC5040b instanceof sj8 ? (sj8) interfaceC5040b : null;
        if (sj8Var == null) {
            return false;
        }
        sj8Var.cancelInternal(orCancellation$JobKt__JobKt(th, sj8Var));
        return true;
    }

    public static /* synthetic */ void cancelChildren$default(e13 e13Var, Throwable th, int i, Object obj) throws Throwable {
        if ((i & 1) != 0) {
            th = null;
        }
        cancelChildren(e13Var, th);
    }

    @q64(level = u64.f86867c, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancelChildren(jj8 jj8Var, Throwable th) throws Throwable {
        for (jj8 jj8Var2 : jj8Var.getChildren()) {
            sj8 sj8Var = jj8Var2 instanceof sj8 ? (sj8) jj8Var2 : null;
            if (sj8Var != null) {
                sj8Var.cancelInternal(orCancellation$JobKt__JobKt(th, jj8Var));
            }
        }
    }

    public static final void cancelChildren(@yfb e13 e13Var, @gib CancellationException cancellationException) {
        vye<jj8> children;
        jj8 jj8Var = (jj8) e13Var.get(jj8.f50715A);
        if (jj8Var == null || (children = jj8Var.getChildren()) == null) {
            return;
        }
        Iterator<jj8> it = children.iterator();
        while (it.hasNext()) {
            it.next().cancel(cancellationException);
        }
    }

    @q64(level = u64.f86867c, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancelChildren(e13 e13Var, Throwable th) throws Throwable {
        jj8 jj8Var = (jj8) e13Var.get(jj8.f50715A);
        if (jj8Var == null) {
            return;
        }
        for (jj8 jj8Var2 : jj8Var.getChildren()) {
            sj8 sj8Var = jj8Var2 instanceof sj8 ? (sj8) jj8Var2 : null;
            if (sj8Var != null) {
                sj8Var.cancelInternal(orCancellation$JobKt__JobKt(th, jj8Var));
            }
        }
    }
}

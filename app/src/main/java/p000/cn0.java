package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,121:1\n351#2,9:122\n360#2,2:133\n13346#3,2:131\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll\n*L\n63#1:122,9\n63#1:133,2\n75#1:131,2\n*E\n"})
public final class cn0<T> {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f17002b = AtomicIntegerFieldUpdater.newUpdater(cn0.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a */
    @yfb
    public final a34<T>[] f17003a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* JADX INFO: renamed from: cn0$a */
    @dwf({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$AwaitAllNode\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,121:1\n11102#2:122\n11437#2,3:123\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$AwaitAllNode\n*L\n115#1:122\n115#1:123,3\n*E\n"})
    public final class C2399a extends rj8 {

        /* JADX INFO: renamed from: C */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f17004C = AtomicReferenceFieldUpdater.newUpdater(C2399a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* JADX INFO: renamed from: e */
        @yfb
        public final dq1<List<? extends T>> f17005e;

        /* JADX INFO: renamed from: f */
        public yf4 f17006f;

        /* JADX WARN: Multi-variable type inference failed */
        public C2399a(@yfb dq1<? super List<? extends T>> dq1Var) {
            this.f17005e = dq1Var;
        }

        private final /* synthetic */ Object get_disposer$volatile() {
            return this._disposer$volatile;
        }

        private final /* synthetic */ void set_disposer$volatile(Object obj) {
            this._disposer$volatile = obj;
        }

        @gib
        public final cn0<T>.C2400b getDisposer() {
            return (C2400b) f17004C.get(this);
        }

        @yfb
        public final yf4 getHandle() {
            yf4 yf4Var = this.f17006f;
            if (yf4Var != null) {
                return yf4Var;
            }
            md8.throwUninitializedPropertyAccessException("handle");
            return null;
        }

        @Override // p000.rj8
        public boolean getOnCancelling() {
            return false;
        }

        @Override // p000.rj8
        public void invoke(@gib Throwable th) {
            if (th != null) {
                Object objTryResumeWithException = this.f17005e.tryResumeWithException(th);
                if (objTryResumeWithException != null) {
                    this.f17005e.completeResume(objTryResumeWithException);
                    cn0<T>.C2400b disposer = getDisposer();
                    if (disposer != null) {
                        disposer.disposeAll();
                        return;
                    }
                    return;
                }
                return;
            }
            if (cn0.getNotCompletedCount$volatile$FU().decrementAndGet(cn0.this) == 0) {
                dq1<List<? extends T>> dq1Var = this.f17005e;
                a34[] a34VarArr = cn0.this.f17003a;
                ArrayList arrayList = new ArrayList(a34VarArr.length);
                for (a34 a34Var : a34VarArr) {
                    arrayList.add(a34Var.getCompleted());
                }
                v7e.C13927a c13927a = v7e.f90266b;
                dq1Var.resumeWith(v7e.m32723constructorimpl(arrayList));
            }
        }

        public final void setDisposer(@gib cn0<T>.C2400b c2400b) {
            f17004C.set(this, c2400b);
        }

        public final void setHandle(@yfb yf4 yf4Var) {
            this.f17006f = yf4Var;
        }
    }

    /* JADX INFO: renamed from: cn0$b */
    @dwf({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,121:1\n13346#2,2:122\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel\n*L\n88#1:122,2\n*E\n"})
    public final class C2400b implements tp1 {

        /* JADX INFO: renamed from: a */
        @yfb
        public final cn0<T>.C2399a[] f17008a;

        public C2400b(@yfb cn0<T>.C2399a[] c2399aArr) {
            this.f17008a = c2399aArr;
        }

        public final void disposeAll() {
            for (cn0<T>.C2399a c2399a : this.f17008a) {
                c2399a.getHandle().dispose();
            }
        }

        @Override // p000.tp1
        public void invoke(@gib Throwable th) {
            disposeAll();
        }

        @yfb
        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f17008a + C4584d2.f28243l;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cn0(@yfb a34<? extends T>[] a34VarArr) {
        this.f17003a = a34VarArr;
        this.notCompletedCount$volatile = a34VarArr.length;
    }

    private final /* synthetic */ int getNotCompletedCount$volatile() {
        return this.notCompletedCount$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater getNotCompletedCount$volatile$FU() {
        return f17002b;
    }

    private final /* synthetic */ void setNotCompletedCount$volatile(int i) {
        this.notCompletedCount$volatile = i;
    }

    @gib
    public final Object await(@yfb zy2<? super List<? extends T>> zy2Var) {
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        int length = this.f17003a.length;
        C2399a[] c2399aArr = new C2399a[length];
        for (int i = 0; i < length; i++) {
            a34 a34Var = this.f17003a[i];
            a34Var.start();
            C2399a c2399a = new C2399a(fq1Var);
            c2399a.setHandle(qj8.invokeOnCompletion$default(a34Var, false, c2399a, 1, null));
            bth bthVar = bth.f14751a;
            c2399aArr[i] = c2399a;
        }
        cn0<T>.C2400b c2400b = new C2400b(c2399aArr);
        for (int i2 = 0; i2 < length; i2++) {
            c2399aArr[i2].setDisposer(c2400b);
        }
        if (fq1Var.isCompleted()) {
            c2400b.disposeAll();
        } else {
            hq1.invokeOnCancellation(fq1Var, c2400b);
        }
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result;
    }
}

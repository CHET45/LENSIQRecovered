package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import p000.e13;
import p000.rya;
import p000.v7e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,139:1\n89#2:140\n89#2:150\n89#2:153\n314#3,9:141\n323#3,2:151\n33#4,6:154\n*S KotlinDebug\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock\n*L\n66#1:140\n86#1:150\n118#1:153\n84#1:141,9\n84#1:151,2\n121#1:154,6\n*E\n"})
@e0g(parameters = 0)
public final class yd1 implements rya {

    /* JADX INFO: renamed from: m */
    public static final int f101212m = 8;

    /* JADX INFO: renamed from: a */
    @gib
    public final ny6<bth> f101213a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Object f101214b;

    /* JADX INFO: renamed from: c */
    @gib
    public Throwable f101215c;

    /* JADX INFO: renamed from: d */
    @yfb
    public List<C15620a<?>> f101216d;

    /* JADX INFO: renamed from: e */
    @yfb
    public List<C15620a<?>> f101217e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final xb0 f101218f;

    /* JADX INFO: renamed from: yd1$a */
    @dwf({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n1#2:140\n*E\n"})
    public static final class C15620a<R> {

        /* JADX INFO: renamed from: a */
        @yfb
        public final qy6<Long, R> f101219a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final zy2<R> f101220b;

        /* JADX WARN: Multi-variable type inference failed */
        public C15620a(@yfb qy6<? super Long, ? extends R> qy6Var, @yfb zy2<? super R> zy2Var) {
            this.f101219a = qy6Var;
            this.f101220b = zy2Var;
        }

        @yfb
        public final zy2<R> getContinuation() {
            return this.f101220b;
        }

        @yfb
        public final qy6<Long, R> getOnFrame() {
            return this.f101219a;
        }

        public final void resume(long j) {
            Object objM32723constructorimpl;
            zy2<R> zy2Var = this.f101220b;
            try {
                v7e.C13927a c13927a = v7e.f90266b;
                objM32723constructorimpl = v7e.m32723constructorimpl(this.f101219a.invoke(Long.valueOf(j)));
            } catch (Throwable th) {
                v7e.C13927a c13927a2 = v7e.f90266b;
                objM32723constructorimpl = v7e.m32723constructorimpl(y7e.createFailure(th));
            }
            zy2Var.resumeWith(objM32723constructorimpl);
        }
    }

    /* JADX INFO: renamed from: yd1$b */
    @dwf({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$withFrameNanos$2$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,139:1\n89#2:140\n*S KotlinDebug\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$withFrameNanos$2$1\n*L\n99#1:140\n*E\n"})
    public static final class C15621b extends tt8 implements qy6<Throwable, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C15620a<R> f101222b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15621b(C15620a<R> c15620a) {
            super(1);
            this.f101222b = c15620a;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
            invoke2(th);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@gib Throwable th) {
            Object obj = yd1.this.f101214b;
            yd1 yd1Var = yd1.this;
            Object obj2 = this.f101222b;
            synchronized (obj) {
                try {
                    yd1Var.f101216d.remove(obj2);
                    if (yd1Var.f101216d.isEmpty()) {
                        yd1Var.f101218f.set(0);
                    }
                    bth bthVar = bth.f14751a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public yd1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void cancel$default(yd1 yd1Var, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = new CancellationException("clock cancelled");
        }
        yd1Var.cancel(cancellationException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fail(Throwable th) {
        synchronized (this.f101214b) {
            try {
                if (this.f101215c != null) {
                    return;
                }
                this.f101215c = th;
                List<C15620a<?>> list = this.f101216d;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    zy2<?> continuation = list.get(i).getContinuation();
                    v7e.C13927a c13927a = v7e.f90266b;
                    continuation.resumeWith(v7e.m32723constructorimpl(y7e.createFailure(th)));
                }
                this.f101216d.clear();
                this.f101218f.set(0);
                bth bthVar = bth.f14751a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void cancel(@yfb CancellationException cancellationException) {
        fail(cancellationException);
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    public <R> R fold(R r, @yfb gz6<? super R, ? super e13.InterfaceC5040b, ? extends R> gz6Var) {
        return (R) rya.C12368a.fold(this, r, gz6Var);
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    @gib
    public <E extends e13.InterfaceC5040b> E get(@yfb e13.InterfaceC5041c<E> interfaceC5041c) {
        return (E) rya.C12368a.get(this, interfaceC5041c);
    }

    public final boolean getHasAwaiters() {
        return this.f101218f.get() != 0;
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    @yfb
    public e13 minusKey(@yfb e13.InterfaceC5041c<?> interfaceC5041c) {
        return rya.C12368a.minusKey(this, interfaceC5041c);
    }

    @Override // p000.e13
    @yfb
    public e13 plus(@yfb e13 e13Var) {
        return rya.C12368a.plus(this, e13Var);
    }

    public final void sendFrame(long j) {
        synchronized (this.f101214b) {
            try {
                List<C15620a<?>> list = this.f101216d;
                this.f101216d = this.f101217e;
                this.f101217e = list;
                this.f101218f.set(0);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).resume(j);
                }
                list.clear();
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.rya
    @gib
    public <R> Object withFrameNanos(@yfb qy6<? super Long, ? extends R> qy6Var, @yfb zy2<? super R> zy2Var) {
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        C15620a c15620a = new C15620a(qy6Var, fq1Var);
        synchronized (this.f101214b) {
            Throwable th = this.f101215c;
            if (th != null) {
                v7e.C13927a c13927a = v7e.f90266b;
                fq1Var.resumeWith(v7e.m32723constructorimpl(y7e.createFailure(th)));
            } else {
                boolean zIsEmpty = this.f101216d.isEmpty();
                this.f101216d.add(c15620a);
                if (zIsEmpty) {
                    this.f101218f.set(1);
                }
                fq1Var.invokeOnCancellation(new C15621b(c15620a));
                if (zIsEmpty && this.f101213a != null) {
                    try {
                        this.f101213a.invoke();
                    } catch (Throwable th2) {
                        fail(th2);
                    }
                }
            }
        }
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result;
    }

    public yd1(@gib ny6<bth> ny6Var) {
        this.f101213a = ny6Var;
        this.f101214b = new Object();
        this.f101216d = new ArrayList();
        this.f101217e = new ArrayList();
        this.f101218f = new xb0(0);
    }

    public /* synthetic */ yd1(ny6 ny6Var, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? null : ny6Var);
    }
}

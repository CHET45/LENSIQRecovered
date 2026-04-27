package p000;

import java.util.ArrayList;
import java.util.List;
import p000.v7e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,91:1\n89#2:92\n89#2:93\n89#2:94\n89#2:104\n314#3,9:95\n323#3,2:105\n*S KotlinDebug\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch\n*L\n39#1:92\n51#1:93\n57#1:94\n79#1:104\n78#1:95,9\n78#1:105,2\n*E\n"})
@e0g(parameters = 0)
public final class mu8 {

    /* JADX INFO: renamed from: e */
    public static final int f62185e = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final Object f62186a = new Object();

    /* JADX INFO: renamed from: b */
    @yfb
    public List<zy2<bth>> f62187b = new ArrayList();

    /* JADX INFO: renamed from: c */
    @yfb
    public List<zy2<bth>> f62188c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public boolean f62189d = true;

    /* JADX INFO: renamed from: mu8$a */
    @dwf({"SMAP\nLatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch$await$2$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,91:1\n89#2:92\n*S KotlinDebug\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch$await$2$2\n*L\n84#1:92\n*E\n"})
    public static final class C9526a extends tt8 implements qy6<Throwable, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ dq1<bth> f62191b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9526a(dq1<? super bth> dq1Var) {
            super(1);
            this.f62191b = dq1Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
            invoke2(th);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@gib Throwable th) {
            Object obj = mu8.this.f62186a;
            mu8 mu8Var = mu8.this;
            dq1<bth> dq1Var = this.f62191b;
            synchronized (obj) {
                mu8Var.f62187b.remove(dq1Var);
                bth bthVar = bth.f14751a;
            }
        }
    }

    @gib
    public final Object await(@yfb zy2<? super bth> zy2Var) {
        if (isOpen()) {
            return bth.f14751a;
        }
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        synchronized (this.f62186a) {
            this.f62187b.add(fq1Var);
        }
        fq1Var.invokeOnCancellation(new C9526a(fq1Var));
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result == pd8.getCOROUTINE_SUSPENDED() ? result : bth.f14751a;
    }

    public final void closeLatch() {
        synchronized (this.f62186a) {
            this.f62189d = false;
            bth bthVar = bth.f14751a;
        }
    }

    public final boolean isOpen() {
        boolean z;
        synchronized (this.f62186a) {
            z = this.f62189d;
        }
        return z;
    }

    public final void openLatch() {
        synchronized (this.f62186a) {
            try {
                if (isOpen()) {
                    return;
                }
                List<zy2<bth>> list = this.f62187b;
                this.f62187b = this.f62188c;
                this.f62188c = list;
                this.f62189d = true;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    zy2<bth> zy2Var = list.get(i);
                    v7e.C13927a c13927a = v7e.f90266b;
                    zy2Var.resumeWith(v7e.m32723constructorimpl(bth.f14751a));
                }
                list.clear();
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <R> R withClosed(@yfb ny6<? extends R> ny6Var) {
        closeLatch();
        try {
            return ny6Var.invoke();
        } finally {
            o28.finallyStart(1);
            openLatch();
            o28.finallyEnd(1);
        }
    }
}

package p000;

import p000.v7e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAwaitFirstLayoutModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AwaitFirstLayoutModifier.kt\nandroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
@e0g(parameters = 1)
public final class dn0 implements x2c {

    /* JADX INFO: renamed from: c */
    public static final int f30169c = 0;

    /* JADX INFO: renamed from: a */
    public boolean f30170a;

    /* JADX INFO: renamed from: b */
    @gib
    public zy2<? super bth> f30171b;

    /* JADX INFO: renamed from: dn0$a */
    @ck3(m4009c = "androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier", m4010f = "AwaitFirstLayoutModifier.kt", m4011i = {0, 0}, m4012l = {35}, m4013m = "waitForFirstLayout", m4014n = {"this", "oldContinuation"}, m4015s = {"L$0", "L$1"})
    public static final class C4875a extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f30172a;

        /* JADX INFO: renamed from: b */
        public Object f30173b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f30174c;

        /* JADX INFO: renamed from: e */
        public int f30176e;

        public C4875a(zy2<? super C4875a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f30174c = obj;
            this.f30176e |= Integer.MIN_VALUE;
            return dn0.this.waitForFirstLayout(this);
        }
    }

    @Override // p000.x2c
    public void onGloballyPositioned(@yfb mv8 mv8Var) {
        if (this.f30170a) {
            return;
        }
        this.f30170a = true;
        zy2<? super bth> zy2Var = this.f30171b;
        if (zy2Var != null) {
            v7e.C13927a c13927a = v7e.f90266b;
            zy2Var.resumeWith(v7e.m32723constructorimpl(bth.f14751a));
        }
        this.f30171b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object waitForFirstLayout(@p000.yfb p000.zy2<? super p000.bth> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p000.dn0.C4875a
            if (r0 == 0) goto L13
            r0 = r5
            dn0$a r0 = (p000.dn0.C4875a) r0
            int r1 = r0.f30176e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30176e = r1
            goto L18
        L13:
            dn0$a r0 = new dn0$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f30174c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f30176e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f30173b
            zy2 r1 = (p000.zy2) r1
            java.lang.Object r0 = r0.f30172a
            dn0 r0 = (p000.dn0) r0
            p000.y7e.throwOnFailure(r5)
            goto L64
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            p000.y7e.throwOnFailure(r5)
            boolean r5 = r4.f30170a
            if (r5 != 0) goto L71
            zy2<? super bth> r5 = r4.f30171b
            r0.f30172a = r4
            r0.f30173b = r5
            r0.f30176e = r3
            oke r2 = new oke
            zy2 r3 = p000.od8.intercepted(r0)
            r2.<init>(r3)
            r4.f30171b = r2
            java.lang.Object r2 = r2.getOrThrow()
            java.lang.Object r3 = p000.pd8.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto L60
            p000.jk3.probeCoroutineSuspended(r0)
        L60:
            if (r2 != r1) goto L63
            return r1
        L63:
            r1 = r5
        L64:
            if (r1 == 0) goto L71
            v7e$a r5 = p000.v7e.f90266b
            bth r5 = p000.bth.f14751a
            java.lang.Object r5 = p000.v7e.m32723constructorimpl(r5)
            r1.resumeWith(r5)
        L71:
            bth r5 = p000.bth.f14751a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dn0.waitForFirstLayout(zy2):java.lang.Object");
    }
}

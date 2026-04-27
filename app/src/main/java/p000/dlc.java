package p000;

import p000.e13;
import p000.rya;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class dlc implements rya {

    /* JADX INFO: renamed from: c */
    public static final int f29951c = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final rya f29952a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final mu8 f29953b = new mu8();

    /* JADX INFO: renamed from: dlc$a */
    @ck3(m4009c = "androidx.compose.runtime.PausableMonotonicFrameClock", m4010f = "PausableMonotonicFrameClock.kt", m4011i = {0, 0}, m4012l = {62, 63}, m4013m = "withFrameNanos", m4014n = {"this", "onFrame"}, m4015s = {"L$0", "L$1"})
    public static final class C4847a<R> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f29954a;

        /* JADX INFO: renamed from: b */
        public Object f29955b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f29956c;

        /* JADX INFO: renamed from: e */
        public int f29958e;

        public C4847a(zy2<? super C4847a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f29956c = obj;
            this.f29958e |= Integer.MIN_VALUE;
            return dlc.this.withFrameNanos(null, this);
        }
    }

    public dlc(@yfb rya ryaVar) {
        this.f29952a = ryaVar;
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

    public final boolean isPaused() {
        return !this.f29953b.isOpen();
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    @yfb
    public e13 minusKey(@yfb e13.InterfaceC5041c<?> interfaceC5041c) {
        return rya.C12368a.minusKey(this, interfaceC5041c);
    }

    public final void pause() {
        this.f29953b.closeLatch();
    }

    @Override // p000.e13
    @yfb
    public e13 plus(@yfb e13 e13Var) {
        return rya.C12368a.plus(this, e13Var);
    }

    public final void resume() {
        this.f29953b.openLatch();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.rya
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <R> java.lang.Object withFrameNanos(@p000.yfb p000.qy6<? super java.lang.Long, ? extends R> r6, @p000.yfb p000.zy2<? super R> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p000.dlc.C4847a
            if (r0 == 0) goto L13
            r0 = r7
            dlc$a r0 = (p000.dlc.C4847a) r0
            int r1 = r0.f29958e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29958e = r1
            goto L18
        L13:
            dlc$a r0 = new dlc$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f29956c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f29958e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p000.y7e.throwOnFailure(r7)
            goto L63
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f29955b
            qy6 r6 = (p000.qy6) r6
            java.lang.Object r2 = r0.f29954a
            dlc r2 = (p000.dlc) r2
            p000.y7e.throwOnFailure(r7)
            goto L53
        L40:
            p000.y7e.throwOnFailure(r7)
            mu8 r7 = r5.f29953b
            r0.f29954a = r5
            r0.f29955b = r6
            r0.f29958e = r4
            java.lang.Object r7 = r7.await(r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r2 = r5
        L53:
            rya r7 = r2.f29952a
            r2 = 0
            r0.f29954a = r2
            r0.f29955b = r2
            r0.f29958e = r3
            java.lang.Object r7 = r7.withFrameNanos(r6, r0)
            if (r7 != r1) goto L63
            return r1
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dlc.withFrameNanos(qy6, zy2):java.lang.Object");
    }
}

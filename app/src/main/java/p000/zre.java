package p000;

/* JADX INFO: loaded from: classes.dex */
public final class zre implements hab {

    /* JADX INFO: renamed from: a */
    @yfb
    public final fse f105860a;

    /* JADX INFO: renamed from: b */
    public boolean f105861b;

    /* JADX INFO: renamed from: zre$a */
    @ck3(m4009c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", m4010f = "Scrollable.kt", m4011i = {0}, m4012l = {865}, m4013m = "onPostFling-RZ2iAVY", m4014n = {"available"}, m4015s = {"J$0"})
    public static final class C16234a extends cz2 {

        /* JADX INFO: renamed from: a */
        public long f105862a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f105863b;

        /* JADX INFO: renamed from: d */
        public int f105865d;

        public C16234a(zy2<? super C16234a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f105863b = obj;
            this.f105865d |= Integer.MIN_VALUE;
            return zre.this.mo29969onPostFlingRZ2iAVY(0L, 0L, this);
        }
    }

    public zre(@yfb fse fseVar, boolean z) {
        this.f105860a = fseVar;
        this.f105861b = z;
    }

    public final boolean getEnabled() {
        return this.f105861b;
    }

    @yfb
    public final fse getScrollingLogic() {
        return this.f105860a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.hab
    @p000.gib
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo29969onPostFlingRZ2iAVY(long r3, long r5, @p000.yfb p000.zy2<? super p000.i4i> r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof p000.zre.C16234a
            if (r3 == 0) goto L13
            r3 = r7
            zre$a r3 = (p000.zre.C16234a) r3
            int r4 = r3.f105865d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.f105865d = r4
            goto L18
        L13:
            zre$a r3 = new zre$a
            r3.<init>(r7)
        L18:
            java.lang.Object r4 = r3.f105863b
            java.lang.Object r7 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r0 = r3.f105865d
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            long r5 = r3.f105862a
            p000.y7e.throwOnFailure(r4)
            goto L47
        L2b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L33:
            p000.y7e.throwOnFailure(r4)
            boolean r4 = r2.f105861b
            if (r4 == 0) goto L52
            fse r4 = r2.f105860a
            r3.f105862a = r5
            r3.f105865d = r1
            java.lang.Object r4 = r4.m29649doFlingAnimationQWom1Mo(r5, r3)
            if (r4 != r7) goto L47
            return r7
        L47:
            i4i r4 = (p000.i4i) r4
            long r3 = r4.m30166unboximpl()
            long r3 = p000.i4i.m30160minusAH228Gc(r5, r3)
            goto L58
        L52:
            i4i$a r3 = p000.i4i.f45754b
            long r3 = r3.m30168getZero9UxMQ8M()
        L58:
            i4i r3 = p000.i4i.m30148boximpl(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zre.mo29969onPostFlingRZ2iAVY(long, long, zy2):java.lang.Object");
    }

    @Override // p000.hab
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo29970onPostScrollDzOQY0M(long j, long j2, int i) {
        return this.f105861b ? this.f105860a.m29651performRawScrollMKHz9U(j2) : izb.f49009b.m30445getZeroF1C5BW0();
    }

    public final void setEnabled(boolean z) {
        this.f105861b = z;
    }
}

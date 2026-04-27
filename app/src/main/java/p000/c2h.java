package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class c2h {

    /* JADX INFO: renamed from: c2h$a */
    @ck3(m4009c = "kotlinx.coroutines.TimeoutKt", m4010f = "Timeout.kt", m4011i = {0, 0, 0}, m4012l = {101}, m4013m = "withTimeoutOrNull", m4014n = {"block", "coroutine", "timeMillis"}, m4015s = {"L$0", "L$1", "J$0"})
    public static final class C2169a<T> extends cz2 {

        /* JADX INFO: renamed from: a */
        public long f15598a;

        /* JADX INFO: renamed from: b */
        public Object f15599b;

        /* JADX INFO: renamed from: c */
        public Object f15600c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f15601d;

        /* JADX INFO: renamed from: e */
        public int f15602e;

        public C2169a(zy2<? super C2169a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f15601d = obj;
            this.f15602e |= Integer.MIN_VALUE;
            return c2h.withTimeoutOrNull(0L, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @p000.yfb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p000.x1h TimeoutCancellationException(long r2, @p000.yfb p000.o34 r4, @p000.yfb p000.jj8 r5) {
        /*
            boolean r0 = r4 instanceof p000.q34
            if (r0 == 0) goto L7
            q34 r4 = (p000.q34) r4
            goto L8
        L7:
            r4 = 0
        L8:
            if (r4 == 0) goto L18
            bt4$a r0 = p000.bt4.f14711b
            lt4 r0 = p000.lt4.f58683d
            long r0 = p000.ft4.toDuration(r2, r0)
            java.lang.String r4 = r4.m31893timeoutMessageLRDsOJo(r0)
            if (r4 != 0) goto L2e
        L18:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Timed out waiting for "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = " ms"
            r4.append(r2)
            java.lang.String r4 = r4.toString()
        L2e:
            x1h r2 = new x1h
            r2.<init>(r4, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.c2h.TimeoutCancellationException(long, o34, jj8):x1h");
    }

    private static final <U, T extends U> Object setupTimeout(z1h<U, ? super T> z1hVar, gz6<? super x13, ? super zy2<? super T>, ? extends Object> gz6Var) {
        oj8.disposeOnCompletion(z1hVar, p34.getDelay(z1hVar.f88815d.getContext()).invokeOnTimeout(z1hVar.f103680e, z1hVar, z1hVar.getContext()));
        return fsh.startUndispatchedOrReturnIgnoreTimeout(z1hVar, z1hVar, gz6Var);
    }

    @gib
    public static final <T> Object withTimeout(long j, @yfb gz6<? super x13, ? super zy2<? super T>, ? extends Object> gz6Var, @yfb zy2<? super T> zy2Var) {
        if (j <= 0) {
            throw new x1h("Timed out immediately");
        }
        Object obj = setupTimeout(new z1h(j, zy2Var), gz6Var);
        if (obj == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return obj;
    }

    @gib
    /* JADX INFO: renamed from: withTimeout-KLykuaI, reason: not valid java name */
    public static final <T> Object m28189withTimeoutKLykuaI(long j, @yfb gz6<? super x13, ? super zy2<? super T>, ? extends Object> gz6Var, @yfb zy2<? super T> zy2Var) {
        return withTimeout(p34.m31717toDelayMillisLRDsOJo(j), gz6Var, zy2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, z1h] */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object withTimeoutOrNull(long r7, @p000.yfb p000.gz6<? super p000.x13, ? super p000.zy2<? super T>, ? extends java.lang.Object> r9, @p000.yfb p000.zy2<? super T> r10) {
        /*
            boolean r0 = r10 instanceof p000.c2h.C2169a
            if (r0 == 0) goto L13
            r0 = r10
            c2h$a r0 = (p000.c2h.C2169a) r0
            int r1 = r0.f15602e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15602e = r1
            goto L18
        L13:
            c2h$a r0 = new c2h$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f15601d
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f15602e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.f15600c
            jvd$h r7 = (p000.jvd.C8121h) r7
            java.lang.Object r8 = r0.f15599b
            gz6 r8 = (p000.gz6) r8
            p000.y7e.throwOnFailure(r10)     // Catch: p000.x1h -> L32
            goto L6f
        L32:
            r8 = move-exception
            goto L70
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            p000.y7e.throwOnFailure(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L46
            return r3
        L46:
            jvd$h r10 = new jvd$h
            r10.<init>()
            r0.f15599b = r9     // Catch: p000.x1h -> L68
            r0.f15600c = r10     // Catch: p000.x1h -> L68
            r0.f15598a = r7     // Catch: p000.x1h -> L68
            r0.f15602e = r4     // Catch: p000.x1h -> L68
            z1h r2 = new z1h     // Catch: p000.x1h -> L68
            r2.<init>(r7, r0)     // Catch: p000.x1h -> L68
            r10.f52110a = r2     // Catch: p000.x1h -> L68
            java.lang.Object r7 = setupTimeout(r2, r9)     // Catch: p000.x1h -> L68
            java.lang.Object r8 = p000.pd8.getCOROUTINE_SUSPENDED()     // Catch: p000.x1h -> L68
            if (r7 != r8) goto L6b
            p000.jk3.probeCoroutineSuspended(r0)     // Catch: p000.x1h -> L68
            goto L6b
        L68:
            r8 = move-exception
            r7 = r10
            goto L70
        L6b:
            if (r7 != r1) goto L6e
            return r1
        L6e:
            r10 = r7
        L6f:
            return r10
        L70:
            jj8 r9 = r8.f96041a
            T r7 = r7.f52110a
            if (r9 != r7) goto L77
            return r3
        L77:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.c2h.withTimeoutOrNull(long, gz6, zy2):java.lang.Object");
    }

    @gib
    /* JADX INFO: renamed from: withTimeoutOrNull-KLykuaI, reason: not valid java name */
    public static final <T> Object m28190withTimeoutOrNullKLykuaI(long j, @yfb gz6<? super x13, ? super zy2<? super T>, ? extends Object> gz6Var, @yfb zy2<? super T> zy2Var) {
        return withTimeoutOrNull(p34.m31717toDelayMillisLRDsOJo(j), gz6Var, zy2Var);
    }
}

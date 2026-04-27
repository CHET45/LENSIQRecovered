package p000;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class tcg<T> implements q9f<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final q9f<T> f84281a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final gz6<t66<? super T>, zy2<? super bth>, Object> f84282b;

    /* JADX INFO: renamed from: tcg$a */
    @ck3(m4009c = "kotlinx.coroutines.flow.SubscribedSharedFlow", m4010f = "Share.kt", m4011i = {}, m4012l = {408}, m4013m = "collect", m4014n = {}, m4015s = {})
    public static final class C12988a extends cz2 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f84283a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ tcg<T> f84284b;

        /* JADX INFO: renamed from: c */
        public int f84285c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12988a(tcg<T> tcgVar, zy2<? super C12988a> zy2Var) {
            super(zy2Var);
            this.f84284b = tcgVar;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f84283a = obj;
            this.f84285c |= Integer.MIN_VALUE;
            return this.f84284b.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tcg(@yfb q9f<? extends T> q9fVar, @yfb gz6<? super t66<? super T>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        this.f84281a = q9fVar;
        this.f84282b = gz6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.q9f, p000.y56
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(@p000.yfb p000.t66<? super T> r6, @p000.yfb p000.zy2<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p000.tcg.C12988a
            if (r0 == 0) goto L13
            r0 = r7
            tcg$a r0 = (p000.tcg.C12988a) r0
            int r1 = r0.f84285c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f84285c = r1
            goto L18
        L13:
            tcg$a r0 = new tcg$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f84283a
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f84285c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            p000.y7e.throwOnFailure(r7)
            goto L46
        L31:
            p000.y7e.throwOnFailure(r7)
            q9f<T> r7 = r5.f84281a
            scg r2 = new scg
            gz6<t66<? super T>, zy2<? super bth>, java.lang.Object> r4 = r5.f84282b
            r2.<init>(r6, r4)
            r0.f84285c = r3
            java.lang.Object r6 = r7.collect(r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            us8 r6 = new us8
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.tcg.collect(t66, zy2):java.lang.Object");
    }

    @Override // p000.q9f
    @yfb
    public List<T> getReplayCache() {
        return this.f84281a.getReplayCache();
    }
}

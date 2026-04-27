package p000;

import org.opencv.videoio.Videoio;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,425:1\n326#2:426\n*S KotlinDebug\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n*L\n416#1:426\n*E\n"})
public final class scg<T> implements t66<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final t66<T> f81225a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final gz6<t66<? super T>, zy2<? super bth>, Object> f81226b;

    /* JADX INFO: renamed from: scg$a */
    @ck3(m4009c = "kotlinx.coroutines.flow.SubscribedFlowCollector", m4010f = "Share.kt", m4011i = {0, 0}, m4012l = {Videoio.CAP_PROP_XI_AG_MAX_LIMIT, 422}, m4013m = "onSubscription", m4014n = {"this", "safeCollector"}, m4015s = {"L$0", "L$1"})
    public static final class C12520a extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f81227a;

        /* JADX INFO: renamed from: b */
        public Object f81228b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f81229c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ scg<T> f81230d;

        /* JADX INFO: renamed from: e */
        public int f81231e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12520a(scg<T> scgVar, zy2<? super C12520a> zy2Var) {
            super(zy2Var);
            this.f81230d = scgVar;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f81229c = obj;
            this.f81231e |= Integer.MIN_VALUE;
            return this.f81230d.onSubscription(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public scg(@yfb t66<? super T> t66Var, @yfb gz6<? super t66<? super T>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        this.f81225a = t66Var;
        this.f81226b = gz6Var;
    }

    @Override // p000.t66
    @gib
    public Object emit(T t, @yfb zy2<? super bth> zy2Var) {
        return this.f81225a.emit(t, zy2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [jke] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object onSubscription(@p000.yfb p000.zy2<? super p000.bth> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p000.scg.C12520a
            if (r0 == 0) goto L13
            r0 = r7
            scg$a r0 = (p000.scg.C12520a) r0
            int r1 = r0.f81231e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81231e = r1
            goto L18
        L13:
            scg$a r0 = new scg$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f81229c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f81231e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p000.y7e.throwOnFailure(r7)
            goto L79
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f81228b
            jke r2 = (p000.jke) r2
            java.lang.Object r4 = r0.f81227a
            scg r4 = (p000.scg) r4
            p000.y7e.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L40
            goto L60
        L40:
            r7 = move-exception
            goto L7f
        L42:
            p000.y7e.throwOnFailure(r7)
            jke r2 = new jke
            t66<T> r7 = r6.f81225a
            e13 r5 = r0.getContext()
            r2.<init>(r7, r5)
            gz6<t66<? super T>, zy2<? super bth>, java.lang.Object> r7 = r6.f81226b     // Catch: java.lang.Throwable -> L40
            r0.f81227a = r6     // Catch: java.lang.Throwable -> L40
            r0.f81228b = r2     // Catch: java.lang.Throwable -> L40
            r0.f81231e = r4     // Catch: java.lang.Throwable -> L40
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L40
            if (r7 != r1) goto L5f
            return r1
        L5f:
            r4 = r6
        L60:
            r2.releaseIntercepted()
            t66<T> r7 = r4.f81225a
            boolean r2 = r7 instanceof p000.scg
            if (r2 == 0) goto L7c
            scg r7 = (p000.scg) r7
            r2 = 0
            r0.f81227a = r2
            r0.f81228b = r2
            r0.f81231e = r3
            java.lang.Object r7 = r7.onSubscription(r0)
            if (r7 != r1) goto L79
            return r1
        L79:
            bth r7 = p000.bth.f14751a
            return r7
        L7c:
            bth r7 = p000.bth.f14751a
            return r7
        L7f:
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.scg.onSubscription(zy2):java.lang.Object");
    }
}

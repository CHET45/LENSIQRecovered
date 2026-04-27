package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nProduceState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/ProduceStateScopeImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,223:1\n314#2,11:224\n*S KotlinDebug\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/ProduceStateScopeImpl\n*L\n50#1:224,11\n*E\n"})
public final class tdd<T> implements sdd<T>, z6b<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final e13 f84366a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z6b<T> f84367b;

    /* JADX INFO: renamed from: tdd$a */
    @ck3(m4009c = "androidx.compose.runtime.ProduceStateScopeImpl", m4010f = "ProduceState.kt", m4011i = {0}, m4012l = {224}, m4013m = "awaitDispose", m4014n = {"onDispose"}, m4015s = {"L$0"})
    public static final class C12998a extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f84368a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f84369b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ tdd<T> f84370c;

        /* JADX INFO: renamed from: d */
        public int f84371d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12998a(tdd<T> tddVar, zy2<? super C12998a> zy2Var) {
            super(zy2Var);
            this.f84370c = tddVar;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f84369b = obj;
            this.f84371d |= Integer.MIN_VALUE;
            return this.f84370c.awaitDispose(null, this);
        }
    }

    public tdd(@yfb z6b<T> z6bVar, @yfb e13 e13Var) {
        this.f84366a = e13Var;
        this.f84367b = z6bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.sdd
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object awaitDispose(@p000.yfb p000.ny6<p000.bth> r5, @p000.yfb p000.zy2<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p000.tdd.C12998a
            if (r0 == 0) goto L13
            r0 = r6
            tdd$a r0 = (p000.tdd.C12998a) r0
            int r1 = r0.f84371d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f84371d = r1
            goto L18
        L13:
            tdd$a r0 = new tdd$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f84369b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f84371d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            java.lang.Object r5 = r0.f84368a
            ny6 r5 = (p000.ny6) r5
            p000.y7e.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L35
            goto L5a
        L35:
            r6 = move-exception
            goto L60
        L37:
            p000.y7e.throwOnFailure(r6)
            r0.f84368a = r5     // Catch: java.lang.Throwable -> L35
            r0.f84371d = r3     // Catch: java.lang.Throwable -> L35
            fq1 r6 = new fq1     // Catch: java.lang.Throwable -> L35
            zy2 r2 = p000.od8.intercepted(r0)     // Catch: java.lang.Throwable -> L35
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L35
            r6.initCancellability()     // Catch: java.lang.Throwable -> L35
            java.lang.Object r6 = r6.getResult()     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = p000.pd8.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L35
            if (r6 != r2) goto L57
            p000.jk3.probeCoroutineSuspended(r0)     // Catch: java.lang.Throwable -> L35
        L57:
            if (r6 != r1) goto L5a
            return r1
        L5a:
            us8 r6 = new us8     // Catch: java.lang.Throwable -> L35
            r6.<init>()     // Catch: java.lang.Throwable -> L35
            throw r6     // Catch: java.lang.Throwable -> L35
        L60:
            r5.invoke()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.tdd.awaitDispose(ny6, zy2):java.lang.Object");
    }

    @Override // p000.z6b
    public T component1() {
        return this.f84367b.component1();
    }

    @Override // p000.z6b
    @yfb
    public qy6<T, bth> component2() {
        return this.f84367b.component2();
    }

    @Override // p000.x13
    @yfb
    public e13 getCoroutineContext() {
        return this.f84366a;
    }

    @Override // p000.z6b, p000.i2g
    public T getValue() {
        return this.f84367b.getValue();
    }

    @Override // p000.z6b
    public void setValue(T t) {
        this.f84367b.setValue(t);
    }
}

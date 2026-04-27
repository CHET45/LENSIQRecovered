package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nUpdatableAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdatableAnimationState.kt\nandroidx/compose/foundation/gestures/UpdatableAnimationState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n1#2:171\n*E\n"})
@e0g(parameters = 0)
public final class cwh {

    /* JADX INFO: renamed from: h */
    @Deprecated
    public static final float f27957h = 0.01f;

    /* JADX INFO: renamed from: a */
    @yfb
    public final t3i<C14294vy> f27959a;

    /* JADX INFO: renamed from: b */
    public long f27960b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    @yfb
    public C14294vy f27961c = f27958i;

    /* JADX INFO: renamed from: d */
    public boolean f27962d;

    /* JADX INFO: renamed from: e */
    public float f27963e;

    /* JADX INFO: renamed from: f */
    @yfb
    public static final C4544a f27955f = new C4544a(null);

    /* JADX INFO: renamed from: g */
    public static final int f27956g = 8;

    /* JADX INFO: renamed from: i */
    @yfb
    public static final C14294vy f27958i = new C14294vy(0.0f);

    /* JADX INFO: renamed from: cwh$a */
    public static final class C4544a {
        public /* synthetic */ C4544a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final C14294vy getZeroVector() {
            return cwh.f27958i;
        }

        public final boolean isZeroish(float f) {
            return Math.abs(f) < 0.01f;
        }

        private C4544a() {
        }
    }

    /* JADX INFO: renamed from: cwh$b */
    @ck3(m4009c = "androidx.compose.foundation.gestures.UpdatableAnimationState", m4010f = "UpdatableAnimationState.kt", m4011i = {0, 0, 0, 0, 1, 1}, m4012l = {101, 147}, m4013m = "animateToZero", m4014n = {"this", "beforeFrame", "afterFrame", "durationScale", "this", "afterFrame"}, m4015s = {"L$0", "L$1", "L$2", "F$0", "L$0", "L$1"})
    public static final class C4545b extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f27964a;

        /* JADX INFO: renamed from: b */
        public Object f27965b;

        /* JADX INFO: renamed from: c */
        public Object f27966c;

        /* JADX INFO: renamed from: d */
        public float f27967d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f27968e;

        /* JADX INFO: renamed from: m */
        public int f27970m;

        public C4545b(zy2<? super C4545b> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f27968e = obj;
            this.f27970m |= Integer.MIN_VALUE;
            return cwh.this.animateToZero(null, null, this);
        }
    }

    /* JADX INFO: renamed from: cwh$c */
    public static final class C4546c extends tt8 implements qy6<Long, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f27972b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qy6<Float, bth> f27973c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4546c(float f, qy6<? super Float, bth> qy6Var) {
            super(1);
            this.f27972b = f;
            this.f27973c = qy6Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Long l) {
            invoke(l.longValue());
            return bth.f14751a;
        }

        public final void invoke(long j) {
            if (cwh.this.f27960b == Long.MIN_VALUE) {
                cwh.this.f27960b = j;
            }
            C14294vy c14294vy = new C14294vy(cwh.this.getValue());
            long durationNanos = this.f27972b == 0.0f ? cwh.this.f27959a.getDurationNanos(new C14294vy(cwh.this.getValue()), cwh.f27955f.getZeroVector(), cwh.this.f27961c) : p3a.roundToLong((j - cwh.this.f27960b) / this.f27972b);
            float value = ((C14294vy) cwh.this.f27959a.getValueFromNanos(durationNanos, c14294vy, cwh.f27955f.getZeroVector(), cwh.this.f27961c)).getValue();
            cwh cwhVar = cwh.this;
            cwhVar.f27961c = (C14294vy) cwhVar.f27959a.getVelocityFromNanos(durationNanos, c14294vy, cwh.f27955f.getZeroVector(), cwh.this.f27961c);
            cwh.this.f27960b = j;
            float value2 = cwh.this.getValue() - value;
            cwh.this.setValue(value);
            this.f27973c.invoke(Float.valueOf(value2));
        }
    }

    /* JADX INFO: renamed from: cwh$d */
    public static final class C4547d extends tt8 implements qy6<Long, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<Float, bth> f27975b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4547d(qy6<? super Float, bth> qy6Var) {
            super(1);
            this.f27975b = qy6Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Long l) {
            invoke(l.longValue());
            return bth.f14751a;
        }

        public final void invoke(long j) {
            float value = cwh.this.getValue();
            cwh.this.setValue(0.0f);
            this.f27975b.invoke(Float.valueOf(value));
        }
    }

    public cwh(@yfb InterfaceC11178py<Float> interfaceC11178py) {
        this.f27959a = interfaceC11178py.vectorize(g3i.getVectorConverter(d46.f28382a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082 A[Catch: all -> 0x00ae, PHI: r0 r2 r13 r14 r15
  0x0082: PHI (r0v9 ??) = (r0v3 ??), (r0v15 ??) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
  0x0082: PHI (r2v4 cwh$b) = (r2v2 cwh$b), (r2v5 cwh$b) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
  0x0082: PHI (r13v6 float) = (r13v4 float), (r13v7 float) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
  0x0082: PHI (r14v7 qy6<? super java.lang.Float, bth>) = (r14v4 qy6<? super java.lang.Float, bth>), (r14v8 qy6<? super java.lang.Float, bth>) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
  0x0082: PHI (r15v15 cwh) = (r15v9 cwh), (r15v16 cwh) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x00ae, blocks: (B:36:0x00a2, B:31:0x0082, B:33:0x008c), top: B:59:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:36:0x00a2, B:31:0x0082, B:33:0x008c), top: B:59:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:13:0x0034, B:48:0x00d1, B:42:0x00b1, B:45:0x00bc), top: B:55:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10, types: [ny6] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v11, types: [ny6] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [ny6<bth>] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [cwh] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2, types: [cwh] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009f -> B:59:0x00a2). Please report as a decompilation issue!!! */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object animateToZero(@p000.yfb p000.qy6<? super java.lang.Float, p000.bth> r13, @p000.yfb p000.ny6<p000.bth> r14, @p000.yfb p000.zy2<? super p000.bth> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cwh.animateToZero(qy6, ny6, zy2):java.lang.Object");
    }

    public final float getValue() {
        return this.f27963e;
    }

    public final void setValue(float f) {
        this.f27963e = f;
    }
}

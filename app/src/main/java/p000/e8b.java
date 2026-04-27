package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class e8b {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final qhg f32117a = new qhg("NO_OWNER");

    /* JADX INFO: renamed from: b */
    @yfb
    public static final qhg f32118b = new qhg("ALREADY_LOCKED_BY_OWNER");

    /* JADX INFO: renamed from: c */
    public static final int f32119c = 0;

    /* JADX INFO: renamed from: d */
    public static final int f32120d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f32121e = 2;

    /* JADX INFO: renamed from: f */
    public static final int f32122f = 0;

    /* JADX INFO: renamed from: g */
    public static final int f32123g = 1;

    /* JADX INFO: renamed from: h */
    public static final int f32124h = 2;

    /* JADX INFO: renamed from: e8b$a */
    @ck3(m4009c = "kotlinx.coroutines.sync.MutexKt", m4010f = "Mutex.kt", m4011i = {0, 0, 0}, m4012l = {121}, m4013m = "withLock", m4014n = {"$this$withLock", "owner", "action"}, m4015s = {"L$0", "L$1", "L$2"})
    public static final class C5191a<T> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f32125a;

        /* JADX INFO: renamed from: b */
        public Object f32126b;

        /* JADX INFO: renamed from: c */
        public Object f32127c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f32128d;

        /* JADX INFO: renamed from: e */
        public int f32129e;

        public C5191a(zy2<? super C5191a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f32128d = obj;
            this.f32129e |= Integer.MIN_VALUE;
            return e8b.withLock(null, null, null, this);
        }
    }

    @yfb
    public static final y7b Mutex(boolean z) {
        return new d8b(z);
    }

    public static /* synthetic */ y7b Mutex$default(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return Mutex(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object withLock(@p000.yfb p000.y7b r4, @p000.gib java.lang.Object r5, @p000.yfb p000.ny6<? extends T> r6, @p000.yfb p000.zy2<? super T> r7) {
        /*
            boolean r0 = r7 instanceof p000.e8b.C5191a
            if (r0 == 0) goto L13
            r0 = r7
            e8b$a r0 = (p000.e8b.C5191a) r0
            int r1 = r0.f32129e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32129e = r1
            goto L18
        L13:
            e8b$a r0 = new e8b$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f32128d
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f32129e
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f32127c
            r6 = r4
            ny6 r6 = (p000.ny6) r6
            java.lang.Object r5 = r0.f32126b
            java.lang.Object r4 = r0.f32125a
            y7b r4 = (p000.y7b) r4
            p000.y7e.throwOnFailure(r7)
            goto L4e
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            p000.y7e.throwOnFailure(r7)
            r0.f32125a = r4
            r0.f32126b = r5
            r0.f32127c = r6
            r0.f32129e = r3
            java.lang.Object r7 = r4.lock(r5, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            java.lang.Object r6 = r6.invoke()     // Catch: java.lang.Throwable -> L5c
            p000.o28.finallyStart(r3)
            r4.unlock(r5)
            p000.o28.finallyEnd(r3)
            return r6
        L5c:
            r6 = move-exception
            p000.o28.finallyStart(r3)
            r4.unlock(r5)
            p000.o28.finallyEnd(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.e8b.withLock(y7b, java.lang.Object, ny6, zy2):java.lang.Object");
    }

    private static final <T> Object withLock$$forInline(y7b y7bVar, Object obj, ny6<? extends T> ny6Var, zy2<? super T> zy2Var) {
        o28.mark(0);
        y7bVar.lock(obj, zy2Var);
        o28.mark(1);
        try {
            return ny6Var.invoke();
        } finally {
            o28.finallyStart(1);
            y7bVar.unlock(obj);
            o28.finallyEnd(1);
        }
    }

    public static /* synthetic */ Object withLock$default(y7b y7bVar, Object obj, ny6 ny6Var, zy2 zy2Var, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        o28.mark(0);
        y7bVar.lock(obj, zy2Var);
        o28.mark(1);
        try {
            return ny6Var.invoke();
        } finally {
            o28.finallyStart(1);
            y7bVar.unlock(obj);
            o28.finallyEnd(1);
        }
    }
}

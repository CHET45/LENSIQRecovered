package p000;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nSingleProcessCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleProcessCoordinator.kt\nandroidx/datastore/core/SingleProcessCoordinator\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 MutexUtils.kt\nandroidx/datastore/core/MutexUtilsKt\n*L\n1#1,60:1\n120#2,10:61\n32#3,10:71\n*S KotlinDebug\n*F\n+ 1 SingleProcessCoordinator.kt\nandroidx/datastore/core/SingleProcessCoordinator\n*L\n40#1:61,10\n49#1:71,10\n*E\n"})
public final class wnf implements m98 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f94850a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final y7b f94851b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final vb0 f94852c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final y56<bth> f94853d;

    /* JADX INFO: renamed from: wnf$a */
    @ck3(m4009c = "androidx.datastore.core.SingleProcessCoordinator", m4010f = "SingleProcessCoordinator.kt", m4011i = {0, 0, 1}, m4012l = {66, 41}, m4013m = "lock", m4014n = {"block", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, m4015s = {"L$0", "L$1", "L$0"})
    public static final class C14706a<T> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f94854a;

        /* JADX INFO: renamed from: b */
        public Object f94855b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f94856c;

        /* JADX INFO: renamed from: e */
        public int f94858e;

        public C14706a(zy2<? super C14706a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f94856c = obj;
            this.f94858e |= Integer.MIN_VALUE;
            return wnf.this.lock(null, this);
        }
    }

    /* JADX INFO: renamed from: wnf$b */
    @ck3(m4009c = "androidx.datastore.core.SingleProcessCoordinator", m4010f = "SingleProcessCoordinator.kt", m4011i = {0, 0}, m4012l = {50}, m4013m = "tryLock", m4014n = {"$this$withTryLock_u24default$iv", "locked$iv"}, m4015s = {"L$0", "Z$0"})
    public static final class C14707b<T> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f94859a;

        /* JADX INFO: renamed from: b */
        public boolean f94860b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f94861c;

        /* JADX INFO: renamed from: e */
        public int f94863e;

        public C14707b(zy2<? super C14707b> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f94861c = obj;
            this.f94863e |= Integer.MIN_VALUE;
            return wnf.this.tryLock(null, this);
        }
    }

    /* JADX INFO: renamed from: wnf$c */
    @ck3(m4009c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", m4010f = "SingleProcessCoordinator.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C14708c extends ugg implements gz6<t66<? super bth>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f94864a;

        public C14708c(zy2<? super C14708c> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C14708c(zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb t66<? super bth> t66Var, @gib zy2<? super bth> zy2Var) {
            return ((C14708c) create(t66Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f94864a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            return bth.f14751a;
        }
    }

    public wnf(@yfb String str) {
        md8.checkNotNullParameter(str, "filePath");
        this.f94850a = str;
        this.f94851b = e8b.Mutex$default(false, 1, null);
        this.f94852c = new vb0(0);
        this.f94853d = c76.flow(new C14708c(null));
    }

    @Override // p000.m98
    @yfb
    public y56<bth> getUpdateNotifications() {
        return this.f94853d;
    }

    @Override // p000.m98
    @gib
    public Object getVersion(@yfb zy2<? super Integer> zy2Var) {
        return wc1.boxInt(this.f94852c.get());
    }

    @Override // p000.m98
    @gib
    public Object incrementAndGetVersion(@yfb zy2<? super Integer> zy2Var) {
        return wc1.boxInt(this.f94852c.incrementAndGet());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.m98
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> java.lang.Object lock(@p000.yfb p000.qy6<? super p000.zy2<? super T>, ? extends java.lang.Object> r8, @p000.yfb p000.zy2<? super T> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p000.wnf.C14706a
            if (r0 == 0) goto L13
            r0 = r9
            wnf$a r0 = (p000.wnf.C14706a) r0
            int r1 = r0.f94858e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94858e = r1
            goto L18
        L13:
            wnf$a r0 = new wnf$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f94856c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f94858e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.f94854a
            y7b r8 = (p000.y7b) r8
            p000.y7e.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L31
            goto L6b
        L31:
            r9 = move-exception
            goto L73
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.f94855b
            y7b r8 = (p000.y7b) r8
            java.lang.Object r2 = r0.f94854a
            qy6 r2 = (p000.qy6) r2
            p000.y7e.throwOnFailure(r9)
            r9 = r8
            r8 = r2
            goto L5b
        L49:
            p000.y7e.throwOnFailure(r9)
            y7b r9 = r7.f94851b
            r0.f94854a = r8
            r0.f94855b = r9
            r0.f94858e = r4
            java.lang.Object r2 = r9.lock(r5, r0)
            if (r2 != r1) goto L5b
            return r1
        L5b:
            r0.f94854a = r9     // Catch: java.lang.Throwable -> L6f
            r0.f94855b = r5     // Catch: java.lang.Throwable -> L6f
            r0.f94858e = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L6f
            if (r8 != r1) goto L68
            return r1
        L68:
            r6 = r9
            r9 = r8
            r8 = r6
        L6b:
            r8.unlock(r5)
            return r9
        L6f:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L73:
            r8.unlock(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.wnf.lock(qy6, zy2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.m98
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> java.lang.Object tryLock(@p000.yfb p000.gz6<? super java.lang.Boolean, ? super p000.zy2<? super T>, ? extends java.lang.Object> r7, @p000.yfb p000.zy2<? super T> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p000.wnf.C14707b
            if (r0 == 0) goto L13
            r0 = r8
            wnf$b r0 = (p000.wnf.C14707b) r0
            int r1 = r0.f94863e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94863e = r1
            goto L18
        L13:
            wnf$b r0 = new wnf$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f94861c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f94863e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            boolean r7 = r0.f94860b
            java.lang.Object r0 = r0.f94859a
            y7b r0 = (p000.y7b) r0
            p000.y7e.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L30
            goto L57
        L30:
            r8 = move-exception
            goto L61
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            p000.y7e.throwOnFailure(r8)
            y7b r8 = r6.f94851b
            boolean r2 = r8.tryLock(r4)
            java.lang.Boolean r5 = p000.wc1.boxBoolean(r2)     // Catch: java.lang.Throwable -> L5d
            r0.f94859a = r8     // Catch: java.lang.Throwable -> L5d
            r0.f94860b = r2     // Catch: java.lang.Throwable -> L5d
            r0.f94863e = r3     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r7 = r7.invoke(r5, r0)     // Catch: java.lang.Throwable -> L5d
            if (r7 != r1) goto L54
            return r1
        L54:
            r0 = r8
            r8 = r7
            r7 = r2
        L57:
            if (r7 == 0) goto L5c
            r0.unlock(r4)
        L5c:
            return r8
        L5d:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L61:
            if (r7 == 0) goto L66
            r0.unlock(r4)
        L66:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.wnf.tryLock(gz6, zy2):java.lang.Object");
    }
}

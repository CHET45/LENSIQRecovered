package p000;

import p000.jvd;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i76 {

    /* JADX INFO: renamed from: i76$a */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__CountKt", m4010f = "Count.kt", m4011i = {0}, m4012l = {13}, m4013m = "count", m4014n = {"i"}, m4015s = {"L$0"})
    public static final class C7172a<T> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f45900a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f45901b;

        /* JADX INFO: renamed from: c */
        public int f45902c;

        public C7172a(zy2<? super C7172a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f45901b = obj;
            this.f45902c |= Integer.MIN_VALUE;
            return c76.count(null, this);
        }
    }

    /* JADX INFO: renamed from: i76$b */
    public static final class C7173b<T> implements t66 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8119f f45903a;

        public C7173b(jvd.C8119f c8119f) {
            this.f45903a = c8119f;
        }

        @Override // p000.t66
        public final Object emit(T t, zy2<? super bth> zy2Var) {
            this.f45903a.f52108a++;
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: i76$c */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__CountKt", m4010f = "Count.kt", m4011i = {0}, m4012l = {25}, m4013m = "count", m4014n = {"i"}, m4015s = {"L$0"})
    public static final class C7174c<T> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f45904a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f45905b;

        /* JADX INFO: renamed from: c */
        public int f45906c;

        public C7174c(zy2<? super C7174c> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f45905b = obj;
            this.f45906c |= Integer.MIN_VALUE;
            return c76.count(null, null, this);
        }
    }

    /* JADX INFO: renamed from: i76$d */
    public static final class C7175d<T> implements t66 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gz6<T, zy2<? super Boolean>, Object> f45907a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ jvd.C8119f f45908b;

        /* JADX INFO: renamed from: i76$d$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__CountKt$count$4", m4010f = "Count.kt", m4011i = {0}, m4012l = {26}, m4013m = "emit", m4014n = {"this"}, m4015s = {"L$0"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public Object f45909a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f45910b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C7175d<T> f45911c;

            /* JADX INFO: renamed from: d */
            public int f45912d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(C7175d<? super T> c7175d, zy2<? super a> zy2Var) {
                super(zy2Var);
                this.f45911c = c7175d;
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f45910b = obj;
                this.f45912d |= Integer.MIN_VALUE;
                return this.f45911c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C7175d(gz6<? super T, ? super zy2<? super Boolean>, ? extends Object> gz6Var, jvd.C8119f c8119f) {
            this.f45907a = gz6Var;
            this.f45908b = c8119f;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p000.t66
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r5, p000.zy2<? super p000.bth> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof p000.i76.C7175d.a
                if (r0 == 0) goto L13
                r0 = r6
                i76$d$a r0 = (p000.i76.C7175d.a) r0
                int r1 = r0.f45912d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f45912d = r1
                goto L18
            L13:
                i76$d$a r0 = new i76$d$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f45910b
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f45912d
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.f45909a
                i76$d r5 = (p000.i76.C7175d) r5
                p000.y7e.throwOnFailure(r6)
                goto L46
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L35:
                p000.y7e.throwOnFailure(r6)
                gz6<T, zy2<? super java.lang.Boolean>, java.lang.Object> r6 = r4.f45907a
                r0.f45909a = r4
                r0.f45912d = r3
                java.lang.Object r6 = r6.invoke(r5, r0)
                if (r6 != r1) goto L45
                return r1
            L45:
                r5 = r4
            L46:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L55
                jvd$f r5 = r5.f45908b
                int r6 = r5.f52108a
                int r6 = r6 + r3
                r5.f52108a = r6
            L55:
                bth r5 = p000.bth.f14751a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.i76.C7175d.emit(java.lang.Object, zy2):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object count(@p000.yfb p000.y56<? extends T> r4, @p000.yfb p000.zy2<? super java.lang.Integer> r5) {
        /*
            boolean r0 = r5 instanceof p000.i76.C7172a
            if (r0 == 0) goto L13
            r0 = r5
            i76$a r0 = (p000.i76.C7172a) r0
            int r1 = r0.f45902c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45902c = r1
            goto L18
        L13:
            i76$a r0 = new i76$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f45901b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f45902c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f45900a
            jvd$f r4 = (p000.jvd.C8119f) r4
            p000.y7e.throwOnFailure(r5)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            p000.y7e.throwOnFailure(r5)
            jvd$f r5 = new jvd$f
            r5.<init>()
            i76$b r2 = new i76$b
            r2.<init>(r5)
            r0.f45900a = r5
            r0.f45902c = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L4d
            return r1
        L4d:
            r4 = r5
        L4e:
            int r4 = r4.f52108a
            java.lang.Integer r4 = p000.wc1.boxInt(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.i76.count(y56, zy2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object count(@p000.yfb p000.y56<? extends T> r4, @p000.yfb p000.gz6<? super T, ? super p000.zy2<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @p000.yfb p000.zy2<? super java.lang.Integer> r6) {
        /*
            boolean r0 = r6 instanceof p000.i76.C7174c
            if (r0 == 0) goto L13
            r0 = r6
            i76$c r0 = (p000.i76.C7174c) r0
            int r1 = r0.f45906c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45906c = r1
            goto L18
        L13:
            i76$c r0 = new i76$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f45905b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f45906c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f45904a
            jvd$f r4 = (p000.jvd.C8119f) r4
            p000.y7e.throwOnFailure(r6)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            p000.y7e.throwOnFailure(r6)
            jvd$f r6 = new jvd$f
            r6.<init>()
            i76$d r2 = new i76$d
            r2.<init>(r5, r6)
            r0.f45904a = r6
            r0.f45906c = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L4d
            return r1
        L4d:
            r4 = r6
        L4e:
            int r4 = r4.f52108a
            java.lang.Integer r4 = p000.wc1.boxInt(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.i76.count(y56, gz6, zy2):java.lang.Object");
    }
}

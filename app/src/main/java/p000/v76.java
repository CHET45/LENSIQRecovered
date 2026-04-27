package p000;

import p000.jvd;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,168:1\n123#2,15:169\n123#2,15:184\n123#2,15:199\n123#2,15:214\n123#2,15:229\n*S KotlinDebug\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n68#1:169,15\n88#1:184,15\n102#1:199,15\n120#1:214,15\n133#1:229,15\n*E\n"})
public final /* synthetic */ class v76 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: v76$a */
    @dwf({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,130:1\n89#2,2:131\n*E\n"})
    public static final class C13899a<T> implements t66<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8121h f90136a;

        public C13899a(jvd.C8121h c8121h) {
            this.f90136a = c8121h;
        }

        @Override // p000.t66
        public Object emit(T t, zy2<? super bth> zy2Var) {
            this.f90136a.f52110a = t;
            throw new C8562l(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: v76$b */
    @dwf({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,130:1\n103#2,6:131\n*E\n"})
    public static final class C13900b<T> implements t66<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gz6 f90137a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ jvd.C8121h f90138b;

        /* JADX INFO: renamed from: v76$b$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", m4010f = "Reduce.kt", m4011i = {0, 0}, m4012l = {131}, m4013m = "emit", m4014n = {"this", "it"}, m4015s = {"L$0", "L$1"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public Object f90139a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f90140b;

            /* JADX INFO: renamed from: c */
            public int f90141c;

            /* JADX INFO: renamed from: e */
            public Object f90143e;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f90140b = obj;
                this.f90141c |= Integer.MIN_VALUE;
                return C13900b.this.emit(null, this);
            }
        }

        public C13900b(gz6 gz6Var, jvd.C8121h c8121h) {
            this.f90137a = gz6Var;
            this.f90138b = c8121h;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p000.t66
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object emit(T r5, p000.zy2<? super p000.bth> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof p000.v76.C13900b.a
                if (r0 == 0) goto L13
                r0 = r6
                v76$b$a r0 = (p000.v76.C13900b.a) r0
                int r1 = r0.f90141c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f90141c = r1
                goto L18
            L13:
                v76$b$a r0 = new v76$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f90140b
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f90141c
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f90143e
                java.lang.Object r0 = r0.f90139a
                v76$b r0 = (p000.v76.C13900b) r0
                p000.y7e.throwOnFailure(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                p000.y7e.throwOnFailure(r6)
                gz6 r6 = r4.f90137a
                r0.f90139a = r4
                r0.f90143e = r5
                r0.f90141c = r3
                r2 = 6
                p000.o28.mark(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                p000.o28.mark(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L5d
                bth r5 = p000.bth.f14751a
                return r5
            L5d:
                jvd$h r6 = r0.f90138b
                r6.f52110a = r5
                l r5 = new l
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.v76.C13900b.emit(java.lang.Object, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: v76$c */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m4010f = "Reduce.kt", m4011i = {0, 0}, m4012l = {179}, m4013m = "first", m4014n = {"result", "collector$iv"}, m4015s = {"L$0", "L$1"})
    public static final class C13901c<T> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f90144a;

        /* JADX INFO: renamed from: b */
        public Object f90145b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f90146c;

        /* JADX INFO: renamed from: d */
        public int f90147d;

        public C13901c(zy2<? super C13901c> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f90146c = obj;
            this.f90147d |= Integer.MIN_VALUE;
            return c76.first(null, this);
        }
    }

    /* JADX INFO: renamed from: v76$d */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m4010f = "Reduce.kt", m4011i = {0, 0, 0}, m4012l = {179}, m4013m = "first", m4014n = {"predicate", "result", "collector$iv"}, m4015s = {"L$0", "L$1", "L$2"})
    public static final class C13902d<T> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f90148a;

        /* JADX INFO: renamed from: b */
        public Object f90149b;

        /* JADX INFO: renamed from: c */
        public Object f90150c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f90151d;

        /* JADX INFO: renamed from: e */
        public int f90152e;

        public C13902d(zy2<? super C13902d> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f90151d = obj;
            this.f90152e |= Integer.MIN_VALUE;
            return c76.first(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: v76$e */
    @dwf({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,130:1\n121#2,2:131\n*E\n"})
    public static final class C13903e<T> implements t66<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8121h f90153a;

        public C13903e(jvd.C8121h c8121h) {
            this.f90153a = c8121h;
        }

        @Override // p000.t66
        public Object emit(T t, zy2<? super bth> zy2Var) {
            this.f90153a.f52110a = t;
            throw new C8562l(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: v76$f */
    @dwf({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,130:1\n134#2,6:131\n*E\n"})
    public static final class C13904f<T> implements t66<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gz6 f90154a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ jvd.C8121h f90155b;

        /* JADX INFO: renamed from: v76$f$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", m4010f = "Reduce.kt", m4011i = {0, 0}, m4012l = {131}, m4013m = "emit", m4014n = {"this", "it"}, m4015s = {"L$0", "L$1"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public Object f90156a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f90157b;

            /* JADX INFO: renamed from: c */
            public int f90158c;

            /* JADX INFO: renamed from: e */
            public Object f90160e;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f90157b = obj;
                this.f90158c |= Integer.MIN_VALUE;
                return C13904f.this.emit(null, this);
            }
        }

        public C13904f(gz6 gz6Var, jvd.C8121h c8121h) {
            this.f90154a = gz6Var;
            this.f90155b = c8121h;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p000.t66
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object emit(T r5, p000.zy2<? super p000.bth> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof p000.v76.C13904f.a
                if (r0 == 0) goto L13
                r0 = r6
                v76$f$a r0 = (p000.v76.C13904f.a) r0
                int r1 = r0.f90158c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f90158c = r1
                goto L18
            L13:
                v76$f$a r0 = new v76$f$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f90157b
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f90158c
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f90160e
                java.lang.Object r0 = r0.f90156a
                v76$f r0 = (p000.v76.C13904f) r0
                p000.y7e.throwOnFailure(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                p000.y7e.throwOnFailure(r6)
                gz6 r6 = r4.f90154a
                r0.f90156a = r4
                r0.f90160e = r5
                r0.f90158c = r3
                r2 = 6
                p000.o28.mark(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                p000.o28.mark(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L5d
                bth r5 = p000.bth.f14751a
                return r5
            L5d:
                jvd$h r6 = r0.f90155b
                r6.f52110a = r5
                l r5 = new l
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.v76.C13904f.emit(java.lang.Object, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: v76$g */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m4010f = "Reduce.kt", m4011i = {0, 0}, m4012l = {179}, m4013m = "firstOrNull", m4014n = {"result", "collector$iv"}, m4015s = {"L$0", "L$1"})
    public static final class C13905g<T> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f90161a;

        /* JADX INFO: renamed from: b */
        public Object f90162b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f90163c;

        /* JADX INFO: renamed from: d */
        public int f90164d;

        public C13905g(zy2<? super C13905g> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f90163c = obj;
            this.f90164d |= Integer.MIN_VALUE;
            return c76.firstOrNull(null, this);
        }
    }

    /* JADX INFO: renamed from: v76$h */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m4010f = "Reduce.kt", m4011i = {0, 0}, m4012l = {179}, m4013m = "firstOrNull", m4014n = {"result", "collector$iv"}, m4015s = {"L$0", "L$1"})
    public static final class C13906h<T> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f90165a;

        /* JADX INFO: renamed from: b */
        public Object f90166b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f90167c;

        /* JADX INFO: renamed from: d */
        public int f90168d;

        public C13906h(zy2<? super C13906h> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f90167c = obj;
            this.f90168d |= Integer.MIN_VALUE;
            return c76.firstOrNull(null, null, this);
        }
    }

    /* JADX INFO: renamed from: v76$i */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m4010f = "Reduce.kt", m4011i = {0}, m4012l = {40}, m4013m = "fold", m4014n = {"accumulator"}, m4015s = {"L$0"})
    public static final class C13907i<T, R> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f90169a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f90170b;

        /* JADX INFO: renamed from: c */
        public int f90171c;

        public C13907i(zy2<? super C13907i> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f90170b = obj;
            this.f90171c |= Integer.MIN_VALUE;
            return v76.fold(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: v76$j */
    public static final class C13908j<T> implements t66 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8121h<R> f90172a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ kz6<R, T, zy2<? super R>, Object> f90173b;

        /* JADX INFO: renamed from: v76$j$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2", m4010f = "Reduce.kt", m4011i = {}, m4012l = {41}, m4013m = "emit", m4014n = {}, m4015s = {})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public Object f90174a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f90175b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C13908j<T> f90176c;

            /* JADX INFO: renamed from: d */
            public int f90177d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(C13908j<? super T> c13908j, zy2<? super a> zy2Var) {
                super(zy2Var);
                this.f90176c = c13908j;
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f90175b = obj;
                this.f90177d |= Integer.MIN_VALUE;
                return this.f90176c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C13908j(jvd.C8121h<R> c8121h, kz6<? super R, ? super T, ? super zy2<? super R>, ? extends Object> kz6Var) {
            this.f90172a = c8121h;
            this.f90173b = kz6Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.t66
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r7, p000.zy2<? super p000.bth> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof p000.v76.C13908j.a
                if (r0 == 0) goto L13
                r0 = r8
                v76$j$a r0 = (p000.v76.C13908j.a) r0
                int r1 = r0.f90177d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f90177d = r1
                goto L18
            L13:
                v76$j$a r0 = new v76$j$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f90175b
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f90177d
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.f90174a
                jvd$h r7 = (p000.jvd.C8121h) r7
                p000.y7e.throwOnFailure(r8)
                goto L4c
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                p000.y7e.throwOnFailure(r8)
                jvd$h<R> r8 = r6.f90172a
                kz6<R, T, zy2<? super R>, java.lang.Object> r2 = r6.f90173b
                T r4 = r8.f52110a
                r0.f90174a = r8
                r0.f90177d = r3
                java.lang.Object r7 = r2.invoke(r4, r7, r0)
                if (r7 != r1) goto L49
                return r1
            L49:
                r5 = r8
                r8 = r7
                r7 = r5
            L4c:
                r7.f52110a = r8
                bth r7 = p000.bth.f14751a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.v76.C13908j.emit(java.lang.Object, zy2):java.lang.Object");
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Object emit$$forInline(T t, zy2<? super bth> zy2Var) {
            o28.mark(4);
            new a(this, zy2Var);
            o28.mark(5);
            jvd.C8121h<R> c8121h = this.f90172a;
            c8121h.f52110a = (T) this.f90173b.invoke((R) c8121h.f52110a, t, (zy2<? super R>) zy2Var);
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: v76$k */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m4010f = "Reduce.kt", m4011i = {0}, m4012l = {151}, m4013m = "last", m4014n = {"result"}, m4015s = {"L$0"})
    public static final class C13909k<T> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f90178a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f90179b;

        /* JADX INFO: renamed from: c */
        public int f90180c;

        public C13909k(zy2<? super C13909k> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f90179b = obj;
            this.f90180c |= Integer.MIN_VALUE;
            return c76.last(null, this);
        }
    }

    /* JADX INFO: renamed from: v76$l */
    public static final class C13910l<T> implements t66 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8121h<Object> f90181a;

        public C13910l(jvd.C8121h<Object> c8121h) {
            this.f90181a = c8121h;
        }

        @Override // p000.t66
        public final Object emit(T t, zy2<? super bth> zy2Var) {
            this.f90181a.f52110a = t;
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: v76$m */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m4010f = "Reduce.kt", m4011i = {0}, m4012l = {163}, m4013m = "lastOrNull", m4014n = {"result"}, m4015s = {"L$0"})
    public static final class C13911m<T> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f90182a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f90183b;

        /* JADX INFO: renamed from: c */
        public int f90184c;

        public C13911m(zy2<? super C13911m> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f90183b = obj;
            this.f90184c |= Integer.MIN_VALUE;
            return c76.lastOrNull(null, this);
        }
    }

    /* JADX INFO: renamed from: v76$n */
    public static final class C13912n<T> implements t66 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8121h<T> f90185a;

        public C13912n(jvd.C8121h<T> c8121h) {
            this.f90185a = c8121h;
        }

        @Override // p000.t66
        public final Object emit(T t, zy2<? super bth> zy2Var) {
            this.f90185a.f52110a = t;
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: v76$o */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m4010f = "Reduce.kt", m4011i = {0}, m4012l = {18}, m4013m = "reduce", m4014n = {"accumulator"}, m4015s = {"L$0"})
    public static final class C13913o<S, T extends S> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f90186a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f90187b;

        /* JADX INFO: renamed from: c */
        public int f90188c;

        public C13913o(zy2<? super C13913o> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f90187b = obj;
            this.f90188c |= Integer.MIN_VALUE;
            return c76.reduce(null, null, this);
        }
    }

    /* JADX INFO: renamed from: v76$p */
    public static final class C13914p<T> implements t66 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8121h<Object> f90189a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ kz6<S, T, zy2<? super S>, Object> f90190b;

        /* JADX INFO: renamed from: v76$p$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2", m4010f = "Reduce.kt", m4011i = {}, m4012l = {21}, m4013m = "emit", m4014n = {}, m4015s = {})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public Object f90191a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f90192b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C13914p<T> f90193c;

            /* JADX INFO: renamed from: d */
            public int f90194d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(C13914p<? super T> c13914p, zy2<? super a> zy2Var) {
                super(zy2Var);
                this.f90193c = c13914p;
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f90192b = obj;
                this.f90194d |= Integer.MIN_VALUE;
                return this.f90193c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C13914p(jvd.C8121h<Object> c8121h, kz6<? super S, ? super T, ? super zy2<? super S>, ? extends Object> kz6Var) {
            this.f90189a = c8121h;
            this.f90190b = kz6Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p000.t66
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r7, p000.zy2<? super p000.bth> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof p000.v76.C13914p.a
                if (r0 == 0) goto L13
                r0 = r8
                v76$p$a r0 = (p000.v76.C13914p.a) r0
                int r1 = r0.f90194d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f90194d = r1
                goto L18
            L13:
                v76$p$a r0 = new v76$p$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f90192b
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f90194d
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.f90191a
                jvd$h r7 = (p000.jvd.C8121h) r7
                p000.y7e.throwOnFailure(r8)
                goto L50
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                p000.y7e.throwOnFailure(r8)
                jvd$h<java.lang.Object> r8 = r6.f90189a
                T r2 = r8.f52110a
                qhg r4 = p000.zhb.f105096a
                if (r2 == r4) goto L53
                kz6<S, T, zy2<? super S>, java.lang.Object> r4 = r6.f90190b
                r0.f90191a = r8
                r0.f90194d = r3
                java.lang.Object r7 = r4.invoke(r2, r7, r0)
                if (r7 != r1) goto L4d
                return r1
            L4d:
                r5 = r8
                r8 = r7
                r7 = r5
            L50:
                r5 = r8
                r8 = r7
                r7 = r5
            L53:
                r8.f52110a = r7
                bth r7 = p000.bth.f14751a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.v76.C13914p.emit(java.lang.Object, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: v76$q */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m4010f = "Reduce.kt", m4011i = {0}, m4012l = {53}, m4013m = "single", m4014n = {"result"}, m4015s = {"L$0"})
    public static final class C13915q<T> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f90195a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f90196b;

        /* JADX INFO: renamed from: c */
        public int f90197c;

        public C13915q(zy2<? super C13915q> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f90196b = obj;
            this.f90197c |= Integer.MIN_VALUE;
            return c76.single(null, this);
        }
    }

    /* JADX INFO: renamed from: v76$r */
    @dwf({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt$single$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
    public static final class C13916r<T> implements t66 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8121h<Object> f90198a;

        public C13916r(jvd.C8121h<Object> c8121h) {
            this.f90198a = c8121h;
        }

        @Override // p000.t66
        public final Object emit(T t, zy2<? super bth> zy2Var) {
            jvd.C8121h<Object> c8121h = this.f90198a;
            if (c8121h.f52110a != zhb.f105096a) {
                throw new IllegalArgumentException("Flow has more than one element");
            }
            c8121h.f52110a = t;
            return bth.f14751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: v76$s */
    @dwf({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,130:1\n70#2,8:131\n*E\n"})
    public static final class C13917s<T> implements t66<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8121h f90199a;

        public C13917s(jvd.C8121h c8121h) {
            this.f90199a = c8121h;
        }

        @Override // p000.t66
        public Object emit(T t, zy2<? super bth> zy2Var) {
            jvd.C8121h c8121h = this.f90199a;
            T t2 = c8121h.f52110a;
            T t3 = (T) zhb.f105096a;
            if (t2 == t3) {
                c8121h.f52110a = t;
                return bth.f14751a;
            }
            c8121h.f52110a = t3;
            throw new C8562l(this);
        }
    }

    /* JADX INFO: renamed from: v76$t */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m4010f = "Reduce.kt", m4011i = {0, 0}, m4012l = {179}, m4013m = "singleOrNull", m4014n = {"result", "collector$iv"}, m4015s = {"L$0", "L$1"})
    public static final class C13918t<T> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f90200a;

        /* JADX INFO: renamed from: b */
        public Object f90201b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f90202c;

        /* JADX INFO: renamed from: d */
        public int f90203d;

        public C13918t(zy2<? super C13918t> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f90202c = obj;
            this.f90203d |= Integer.MIN_VALUE;
            return c76.singleOrNull(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object first(@p000.yfb p000.y56<? extends T> r4, @p000.yfb p000.zy2<? super T> r5) {
        /*
            boolean r0 = r5 instanceof p000.v76.C13901c
            if (r0 == 0) goto L13
            r0 = r5
            v76$c r0 = (p000.v76.C13901c) r0
            int r1 = r0.f90147d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f90147d = r1
            goto L18
        L13:
            v76$c r0 = new v76$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f90146c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f90147d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f90145b
            v76$a r4 = (p000.v76.C13899a) r4
            java.lang.Object r0 = r0.f90144a
            jvd$h r0 = (p000.jvd.C8121h) r0
            p000.y7e.throwOnFailure(r5)     // Catch: p000.C8562l -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            p000.y7e.throwOnFailure(r5)
            jvd$h r5 = new jvd$h
            r5.<init>()
            qhg r2 = p000.zhb.f105096a
            r5.f52110a = r2
            v76$a r2 = new v76$a
            r2.<init>(r5)
            r0.f90144a = r5     // Catch: p000.C8562l -> L5b
            r0.f90145b = r2     // Catch: p000.C8562l -> L5b
            r0.f90147d = r3     // Catch: p000.C8562l -> L5b
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: p000.C8562l -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            p000.a76.checkOwnership(r5, r4)
        L62:
            T r4 = r0.f52110a
            qhg r5 = p000.zhb.f105096a
            if (r4 == r5) goto L69
            return r4
        L69:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v76.first(y56, zy2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object firstOrNull(@p000.yfb p000.y56<? extends T> r4, @p000.yfb p000.zy2<? super T> r5) {
        /*
            boolean r0 = r5 instanceof p000.v76.C13905g
            if (r0 == 0) goto L13
            r0 = r5
            v76$g r0 = (p000.v76.C13905g) r0
            int r1 = r0.f90164d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f90164d = r1
            goto L18
        L13:
            v76$g r0 = new v76$g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f90163c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f90164d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f90162b
            v76$e r4 = (p000.v76.C13903e) r4
            java.lang.Object r0 = r0.f90161a
            jvd$h r0 = (p000.jvd.C8121h) r0
            p000.y7e.throwOnFailure(r5)     // Catch: p000.C8562l -> L31
            goto L5e
        L31:
            r5 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            p000.y7e.throwOnFailure(r5)
            jvd$h r5 = new jvd$h
            r5.<init>()
            v76$e r2 = new v76$e
            r2.<init>(r5)
            r0.f90161a = r5     // Catch: p000.C8562l -> L57
            r0.f90162b = r2     // Catch: p000.C8562l -> L57
            r0.f90164d = r3     // Catch: p000.C8562l -> L57
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: p000.C8562l -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r0 = r5
            goto L5e
        L57:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5b:
            p000.a76.checkOwnership(r5, r4)
        L5e:
            T r4 = r0.f52110a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v76.firstOrNull(y56, zy2):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T, R> java.lang.Object fold(@p000.yfb p000.y56<? extends T> r4, R r5, @p000.yfb p000.kz6<? super R, ? super T, ? super p000.zy2<? super R>, ? extends java.lang.Object> r6, @p000.yfb p000.zy2<? super R> r7) {
        /*
            boolean r0 = r7 instanceof p000.v76.C13907i
            if (r0 == 0) goto L13
            r0 = r7
            v76$i r0 = (p000.v76.C13907i) r0
            int r1 = r0.f90171c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f90171c = r1
            goto L18
        L13:
            v76$i r0 = new v76$i
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f90170b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f90171c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f90169a
            jvd$h r4 = (p000.jvd.C8121h) r4
            p000.y7e.throwOnFailure(r7)
            goto L50
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            p000.y7e.throwOnFailure(r7)
            jvd$h r7 = new jvd$h
            r7.<init>()
            r7.f52110a = r5
            v76$j r5 = new v76$j
            r5.<init>(r7, r6)
            r0.f90169a = r7
            r0.f90171c = r3
            java.lang.Object r4 = r4.collect(r5, r0)
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = r7
        L50:
            T r4 = r4.f52110a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v76.fold(y56, java.lang.Object, kz6, zy2):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T, R> Object fold$$forInline(y56<? extends T> y56Var, R r, kz6<? super R, ? super T, ? super zy2<? super R>, ? extends Object> kz6Var, zy2<? super R> zy2Var) {
        jvd.C8121h c8121h = new jvd.C8121h();
        c8121h.f52110a = r;
        C13908j c13908j = new C13908j(c8121h, kz6Var);
        o28.mark(0);
        y56Var.collect(c13908j, zy2Var);
        o28.mark(1);
        return c8121h.f52110a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object last(@p000.yfb p000.y56<? extends T> r4, @p000.yfb p000.zy2<? super T> r5) {
        /*
            boolean r0 = r5 instanceof p000.v76.C13909k
            if (r0 == 0) goto L13
            r0 = r5
            v76$k r0 = (p000.v76.C13909k) r0
            int r1 = r0.f90180c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f90180c = r1
            goto L18
        L13:
            v76$k r0 = new v76$k
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f90179b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f90180c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f90178a
            jvd$h r4 = (p000.jvd.C8121h) r4
            p000.y7e.throwOnFailure(r5)
            goto L52
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            p000.y7e.throwOnFailure(r5)
            jvd$h r5 = new jvd$h
            r5.<init>()
            qhg r2 = p000.zhb.f105096a
            r5.f52110a = r2
            v76$l r2 = new v76$l
            r2.<init>(r5)
            r0.f90178a = r5
            r0.f90180c = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = r5
        L52:
            T r4 = r4.f52110a
            qhg r5 = p000.zhb.f105096a
            if (r4 == r5) goto L59
            return r4
        L59:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v76.last(y56, zy2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object lastOrNull(@p000.yfb p000.y56<? extends T> r4, @p000.yfb p000.zy2<? super T> r5) {
        /*
            boolean r0 = r5 instanceof p000.v76.C13911m
            if (r0 == 0) goto L13
            r0 = r5
            v76$m r0 = (p000.v76.C13911m) r0
            int r1 = r0.f90184c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f90184c = r1
            goto L18
        L13:
            v76$m r0 = new v76$m
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f90183b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f90184c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f90182a
            jvd$h r4 = (p000.jvd.C8121h) r4
            p000.y7e.throwOnFailure(r5)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            p000.y7e.throwOnFailure(r5)
            jvd$h r5 = new jvd$h
            r5.<init>()
            v76$n r2 = new v76$n
            r2.<init>(r5)
            r0.f90182a = r5
            r0.f90184c = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L4d
            return r1
        L4d:
            r4 = r5
        L4e:
            T r4 = r4.f52110a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v76.lastOrNull(y56, zy2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, qhg] */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <S, T extends S> java.lang.Object reduce(@p000.yfb p000.y56<? extends T> r4, @p000.yfb p000.kz6<? super S, ? super T, ? super p000.zy2<? super S>, ? extends java.lang.Object> r5, @p000.yfb p000.zy2<? super S> r6) {
        /*
            boolean r0 = r6 instanceof p000.v76.C13913o
            if (r0 == 0) goto L13
            r0 = r6
            v76$o r0 = (p000.v76.C13913o) r0
            int r1 = r0.f90188c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f90188c = r1
            goto L18
        L13:
            v76$o r0 = new v76$o
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f90187b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f90188c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f90186a
            jvd$h r4 = (p000.jvd.C8121h) r4
            p000.y7e.throwOnFailure(r6)
            goto L52
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            p000.y7e.throwOnFailure(r6)
            jvd$h r6 = new jvd$h
            r6.<init>()
            qhg r2 = p000.zhb.f105096a
            r6.f52110a = r2
            v76$p r2 = new v76$p
            r2.<init>(r6, r5)
            r0.f90186a = r6
            r0.f90188c = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = r6
        L52:
            T r4 = r4.f52110a
            qhg r5 = p000.zhb.f105096a
            if (r4 == r5) goto L59
            return r4
        L59:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Empty flow can't be reduced"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v76.reduce(y56, kz6, zy2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object single(@p000.yfb p000.y56<? extends T> r4, @p000.yfb p000.zy2<? super T> r5) {
        /*
            boolean r0 = r5 instanceof p000.v76.C13915q
            if (r0 == 0) goto L13
            r0 = r5
            v76$q r0 = (p000.v76.C13915q) r0
            int r1 = r0.f90197c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f90197c = r1
            goto L18
        L13:
            v76$q r0 = new v76$q
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f90196b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f90197c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f90195a
            jvd$h r4 = (p000.jvd.C8121h) r4
            p000.y7e.throwOnFailure(r5)
            goto L52
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            p000.y7e.throwOnFailure(r5)
            jvd$h r5 = new jvd$h
            r5.<init>()
            qhg r2 = p000.zhb.f105096a
            r5.f52110a = r2
            v76$r r2 = new v76$r
            r2.<init>(r5)
            r0.f90195a = r5
            r0.f90197c = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = r5
        L52:
            T r4 = r4.f52110a
            qhg r5 = p000.zhb.f105096a
            if (r4 == r5) goto L59
            return r4
        L59:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Flow is empty"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v76.single(y56, zy2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object singleOrNull(@p000.yfb p000.y56<? extends T> r4, @p000.yfb p000.zy2<? super T> r5) {
        /*
            boolean r0 = r5 instanceof p000.v76.C13918t
            if (r0 == 0) goto L13
            r0 = r5
            v76$t r0 = (p000.v76.C13918t) r0
            int r1 = r0.f90203d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f90203d = r1
            goto L18
        L13:
            v76$t r0 = new v76$t
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f90202c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f90203d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f90201b
            v76$s r4 = (p000.v76.C13917s) r4
            java.lang.Object r0 = r0.f90200a
            jvd$h r0 = (p000.jvd.C8121h) r0
            p000.y7e.throwOnFailure(r5)     // Catch: p000.C8562l -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            p000.y7e.throwOnFailure(r5)
            jvd$h r5 = new jvd$h
            r5.<init>()
            qhg r2 = p000.zhb.f105096a
            r5.f52110a = r2
            v76$s r2 = new v76$s
            r2.<init>(r5)
            r0.f90200a = r5     // Catch: p000.C8562l -> L5b
            r0.f90201b = r2     // Catch: p000.C8562l -> L5b
            r0.f90203d = r3     // Catch: p000.C8562l -> L5b
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: p000.C8562l -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            p000.a76.checkOwnership(r5, r4)
        L62:
            T r4 = r0.f52110a
            qhg r5 = p000.zhb.f105096a
            if (r4 != r5) goto L69
            r4 = 0
        L69:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v76.singleOrNull(y56, zy2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object first(@p000.yfb p000.y56<? extends T> r4, @p000.yfb p000.gz6<? super T, ? super p000.zy2<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @p000.yfb p000.zy2<? super T> r6) {
        /*
            boolean r0 = r6 instanceof p000.v76.C13902d
            if (r0 == 0) goto L13
            r0 = r6
            v76$d r0 = (p000.v76.C13902d) r0
            int r1 = r0.f90152e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f90152e = r1
            goto L18
        L13:
            v76$d r0 = new v76$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f90151d
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f90152e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r4 = r0.f90150c
            v76$b r4 = (p000.v76.C13900b) r4
            java.lang.Object r5 = r0.f90149b
            jvd$h r5 = (p000.jvd.C8121h) r5
            java.lang.Object r0 = r0.f90148a
            gz6 r0 = (p000.gz6) r0
            p000.y7e.throwOnFailure(r6)     // Catch: p000.C8562l -> L35
            goto L6a
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3f:
            p000.y7e.throwOnFailure(r6)
            jvd$h r6 = new jvd$h
            r6.<init>()
            qhg r2 = p000.zhb.f105096a
            r6.f52110a = r2
            v76$b r2 = new v76$b
            r2.<init>(r5, r6)
            r0.f90148a = r5     // Catch: p000.C8562l -> L62
            r0.f90149b = r6     // Catch: p000.C8562l -> L62
            r0.f90150c = r2     // Catch: p000.C8562l -> L62
            r0.f90152e = r3     // Catch: p000.C8562l -> L62
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: p000.C8562l -> L62
            if (r4 != r1) goto L5f
            return r1
        L5f:
            r0 = r5
            r5 = r6
            goto L6a
        L62:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L67:
            p000.a76.checkOwnership(r6, r4)
        L6a:
            T r4 = r5.f52110a
            qhg r5 = p000.zhb.f105096a
            if (r4 == r5) goto L71
            return r4
        L71:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Expected at least one element matching the predicate "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v76.first(y56, gz6, zy2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object firstOrNull(@p000.yfb p000.y56<? extends T> r4, @p000.yfb p000.gz6<? super T, ? super p000.zy2<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @p000.yfb p000.zy2<? super T> r6) {
        /*
            boolean r0 = r6 instanceof p000.v76.C13906h
            if (r0 == 0) goto L13
            r0 = r6
            v76$h r0 = (p000.v76.C13906h) r0
            int r1 = r0.f90168d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f90168d = r1
            goto L18
        L13:
            v76$h r0 = new v76$h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f90167c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f90168d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f90166b
            v76$f r4 = (p000.v76.C13904f) r4
            java.lang.Object r5 = r0.f90165a
            jvd$h r5 = (p000.jvd.C8121h) r5
            p000.y7e.throwOnFailure(r6)     // Catch: p000.C8562l -> L31
            goto L5e
        L31:
            r6 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            p000.y7e.throwOnFailure(r6)
            jvd$h r6 = new jvd$h
            r6.<init>()
            v76$f r2 = new v76$f
            r2.<init>(r5, r6)
            r0.f90165a = r6     // Catch: p000.C8562l -> L57
            r0.f90166b = r2     // Catch: p000.C8562l -> L57
            r0.f90168d = r3     // Catch: p000.C8562l -> L57
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: p000.C8562l -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r5 = r6
            goto L5e
        L57:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L5b:
            p000.a76.checkOwnership(r6, r4)
        L5e:
            T r4 = r5.f52110a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v76.firstOrNull(y56, gz6, zy2):java.lang.Object");
    }
}

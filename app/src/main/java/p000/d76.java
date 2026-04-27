package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,350:1\n105#2:351\n105#2:352\n105#2:353\n105#2:354\n105#2:355\n105#2:356\n105#2:357\n105#2:358\n105#2:359\n105#2:360\n105#2:361\n105#2:362\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n64#1:351\n78#1:352\n85#1:353\n94#1:354\n103#1:355\n118#1:356\n127#1:357\n149#1:358\n160#1:359\n171#1:360\n180#1:361\n189#1:362\n*E\n"})
public final /* synthetic */ class d76 {

    /* JADX INFO: renamed from: d76$a */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n190#2:109\n191#2,2:111\n193#2:114\n1863#3:110\n1864#3:113\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n190#1:110\n190#1:113\n*E\n"})
    public static final class C4641a implements y56<Long> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ul9 f28622a;

        /* JADX INFO: renamed from: d76$a$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10", m4010f = "Builders.kt", m4011i = {0}, m4012l = {111}, m4013m = "collect", m4014n = {"$this$asFlow_u24lambda_u2419"}, m4015s = {"L$0"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f28623a;

            /* JADX INFO: renamed from: b */
            public int f28624b;

            /* JADX INFO: renamed from: d */
            public Object f28626d;

            /* JADX INFO: renamed from: e */
            public Object f28627e;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f28623a = obj;
                this.f28624b |= Integer.MIN_VALUE;
                return C4641a.this.collect(null, this);
            }
        }

        public C4641a(ul9 ul9Var) {
            this.f28622a = ul9Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p000.y56
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(p000.t66<? super java.lang.Long> r8, p000.zy2<? super p000.bth> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof p000.d76.C4641a.a
                if (r0 == 0) goto L13
                r0 = r9
                d76$a$a r0 = (p000.d76.C4641a.a) r0
                int r1 = r0.f28624b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28624b = r1
                goto L18
            L13:
                d76$a$a r0 = new d76$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f28623a
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f28624b
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r8 = r0.f28627e
                java.util.Iterator r8 = (java.util.Iterator) r8
                java.lang.Object r2 = r0.f28626d
                t66 r2 = (p000.t66) r2
                p000.y7e.throwOnFailure(r9)
                r9 = r2
                goto L46
            L32:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3a:
                p000.y7e.throwOnFailure(r9)
                ul9 r9 = r7.f28622a
                java.util.Iterator r9 = r9.iterator()
                r6 = r9
                r9 = r8
                r8 = r6
            L46:
                boolean r2 = r8.hasNext()
                if (r2 == 0) goto L64
                r2 = r8
                gl9 r2 = (p000.gl9) r2
                long r4 = r2.nextLong()
                java.lang.Long r2 = p000.wc1.boxLong(r4)
                r0.f28626d = r9
                r0.f28627e = r8
                r0.f28624b = r3
                java.lang.Object r2 = r9.emit(r2, r0)
                if (r2 != r1) goto L46
                return r1
            L64:
                bth r8 = p000.bth.f14751a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.d76.C4641a.collect(t66, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: d76$b */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,108:1\n65#2,2:109\n*E\n"})
    public static final class C4642b<T> implements y56<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ny6 f28628a;

        public C4642b(ny6 ny6Var) {
            this.f28628a = ny6Var;
        }

        @Override // p000.y56
        public Object collect(t66<? super T> t66Var, zy2<? super bth> zy2Var) {
            Object objEmit = t66Var.emit((Object) this.f28628a.invoke(), zy2Var);
            return objEmit == pd8.getCOROUTINE_SUSPENDED() ? objEmit : bth.f14751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: d76$c */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,108:1\n79#2,2:109\n*E\n"})
    public static final class C4643c<T> implements y56<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6 f28629a;

        /* JADX INFO: renamed from: d76$c$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2", m4010f = "Builders.kt", m4011i = {}, m4012l = {109, 109}, m4013m = "collect", m4014n = {}, m4015s = {})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f28630a;

            /* JADX INFO: renamed from: b */
            public int f28631b;

            /* JADX INFO: renamed from: d */
            public Object f28633d;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f28630a = obj;
                this.f28631b |= Integer.MIN_VALUE;
                return C4643c.this.collect(null, this);
            }
        }

        public C4643c(qy6 qy6Var) {
            this.f28629a = qy6Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p000.y56
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(p000.t66<? super T> r6, p000.zy2<? super p000.bth> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof p000.d76.C4643c.a
                if (r0 == 0) goto L13
                r0 = r7
                d76$c$a r0 = (p000.d76.C4643c.a) r0
                int r1 = r0.f28631b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28631b = r1
                goto L18
            L13:
                d76$c$a r0 = new d76$c$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f28630a
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f28631b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3c
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                p000.y7e.throwOnFailure(r7)
                goto L60
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.f28633d
                t66 r6 = (p000.t66) r6
                p000.y7e.throwOnFailure(r7)
                goto L54
            L3c:
                p000.y7e.throwOnFailure(r7)
                qy6 r7 = r5.f28629a
                r0.f28633d = r6
                r0.f28631b = r4
                r2 = 6
                p000.o28.mark(r2)
                java.lang.Object r7 = r7.invoke(r0)
                r2 = 7
                p000.o28.mark(r2)
                if (r7 != r1) goto L54
                return r1
            L54:
                r2 = 0
                r0.f28633d = r2
                r0.f28631b = r3
                java.lang.Object r6 = r6.emit(r7, r0)
                if (r6 != r1) goto L60
                return r1
            L60:
                bth r6 = p000.bth.f14751a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.d76.C4643c.collect(t66, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: d76$d */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n86#2:109\n87#2,2:111\n89#2:114\n1863#3:110\n1864#3:113\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n86#1:110\n86#1:113\n*E\n"})
    public static final class C4644d<T> implements y56<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterable f28634a;

        /* JADX INFO: renamed from: d76$d$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3", m4010f = "Builders.kt", m4011i = {0}, m4012l = {111}, m4013m = "collect", m4014n = {"$this$asFlow_u24lambda_u243"}, m4015s = {"L$0"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f28635a;

            /* JADX INFO: renamed from: b */
            public int f28636b;

            /* JADX INFO: renamed from: d */
            public Object f28638d;

            /* JADX INFO: renamed from: e */
            public Object f28639e;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f28635a = obj;
                this.f28636b |= Integer.MIN_VALUE;
                return C4644d.this.collect(null, this);
            }
        }

        public C4644d(Iterable iterable) {
            this.f28634a = iterable;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p000.y56
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(p000.t66<? super T> r6, p000.zy2<? super p000.bth> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof p000.d76.C4644d.a
                if (r0 == 0) goto L13
                r0 = r7
                d76$d$a r0 = (p000.d76.C4644d.a) r0
                int r1 = r0.f28636b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28636b = r1
                goto L18
            L13:
                d76$d$a r0 = new d76$d$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f28635a
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f28636b
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.f28639e
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.f28638d
                t66 r2 = (p000.t66) r2
                p000.y7e.throwOnFailure(r7)
                r7 = r2
                goto L46
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                p000.y7e.throwOnFailure(r7)
                java.lang.Iterable r7 = r5.f28634a
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L46:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L5d
                java.lang.Object r2 = r6.next()
                r0.f28638d = r7
                r0.f28639e = r6
                r0.f28636b = r3
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L46
                return r1
            L5d:
                bth r6 = p000.bth.f14751a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.d76.C4644d.collect(t66, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: d76$e */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,108:1\n95#2:109\n96#2,2:111\n98#2:114\n32#3:110\n33#3:113\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n95#1:110\n95#1:113\n*E\n"})
    public static final class C4645e<T> implements y56<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterator f28640a;

        /* JADX INFO: renamed from: d76$e$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4", m4010f = "Builders.kt", m4011i = {0}, m4012l = {111}, m4013m = "collect", m4014n = {"$this$asFlow_u24lambda_u245"}, m4015s = {"L$0"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f28641a;

            /* JADX INFO: renamed from: b */
            public int f28642b;

            /* JADX INFO: renamed from: d */
            public Object f28644d;

            /* JADX INFO: renamed from: e */
            public Object f28645e;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f28641a = obj;
                this.f28642b |= Integer.MIN_VALUE;
                return C4645e.this.collect(null, this);
            }
        }

        public C4645e(Iterator it) {
            this.f28640a = it;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p000.y56
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(p000.t66<? super T> r6, p000.zy2<? super p000.bth> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof p000.d76.C4645e.a
                if (r0 == 0) goto L13
                r0 = r7
                d76$e$a r0 = (p000.d76.C4645e.a) r0
                int r1 = r0.f28642b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28642b = r1
                goto L18
            L13:
                d76$e$a r0 = new d76$e$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f28641a
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f28642b
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.f28645e
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.f28644d
                t66 r2 = (p000.t66) r2
                p000.y7e.throwOnFailure(r7)
                r7 = r2
                goto L42
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                p000.y7e.throwOnFailure(r7)
                java.util.Iterator r7 = r5.f28640a
                r4 = r7
                r7 = r6
                r6 = r4
            L42:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L59
                java.lang.Object r2 = r6.next()
                r0.f28644d = r7
                r0.f28645e = r6
                r0.f28642b = r3
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L42
                return r1
            L59:
                bth r6 = p000.bth.f14751a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.d76.C4645e.collect(t66, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: d76$f */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,108:1\n104#2:109\n105#2,2:111\n107#2:114\n1317#3:110\n1318#3:113\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n104#1:110\n104#1:113\n*E\n"})
    public static final class C4646f<T> implements y56<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vye f28646a;

        /* JADX INFO: renamed from: d76$f$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5", m4010f = "Builders.kt", m4011i = {0}, m4012l = {111}, m4013m = "collect", m4014n = {"$this$asFlow_u24lambda_u247"}, m4015s = {"L$0"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f28647a;

            /* JADX INFO: renamed from: b */
            public int f28648b;

            /* JADX INFO: renamed from: d */
            public Object f28650d;

            /* JADX INFO: renamed from: e */
            public Object f28651e;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f28647a = obj;
                this.f28648b |= Integer.MIN_VALUE;
                return C4646f.this.collect(null, this);
            }
        }

        public C4646f(vye vyeVar) {
            this.f28646a = vyeVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p000.y56
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(p000.t66<? super T> r6, p000.zy2<? super p000.bth> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof p000.d76.C4646f.a
                if (r0 == 0) goto L13
                r0 = r7
                d76$f$a r0 = (p000.d76.C4646f.a) r0
                int r1 = r0.f28648b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28648b = r1
                goto L18
            L13:
                d76$f$a r0 = new d76$f$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f28647a
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f28648b
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.f28651e
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.f28650d
                t66 r2 = (p000.t66) r2
                p000.y7e.throwOnFailure(r7)
                r7 = r2
                goto L46
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                p000.y7e.throwOnFailure(r7)
                vye r7 = r5.f28646a
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L46:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L5d
                java.lang.Object r2 = r6.next()
                r0.f28650d = r7
                r0.f28651e = r6
                r0.f28648b = r3
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L46
                return r1
            L5d:
                bth r6 = p000.bth.f14751a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.d76.C4646f.collect(t66, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: d76$g */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,108:1\n150#2:109\n151#2,2:111\n153#2:114\n13346#3:110\n13347#3:113\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n150#1:110\n150#1:113\n*E\n"})
    public static final class C4647g<T> implements y56<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object[] f28652a;

        /* JADX INFO: renamed from: d76$g$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6", m4010f = "Builders.kt", m4011i = {0, 0}, m4012l = {111}, m4013m = "collect", m4014n = {"$this$asFlow_u24lambda_u2411", "$this$forEach$iv"}, m4015s = {"L$0", "L$1"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f28653a;

            /* JADX INFO: renamed from: b */
            public int f28654b;

            /* JADX INFO: renamed from: d */
            public Object f28656d;

            /* JADX INFO: renamed from: e */
            public Object f28657e;

            /* JADX INFO: renamed from: f */
            public int f28658f;

            /* JADX INFO: renamed from: m */
            public int f28659m;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f28653a = obj;
                this.f28654b |= Integer.MIN_VALUE;
                return C4647g.this.collect(null, this);
            }
        }

        public C4647g(Object[] objArr) {
            this.f28652a = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, t66] */
        /* JADX WARN: Type inference failed for: r9v5 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /* JADX WARN: Type inference failed for: r9v8 */
        /* JADX WARN: Type inference failed for: r9v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005c -> B:19:0x005f). Please report as a decompilation issue!!! */
        @Override // p000.y56
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(p000.t66<? super T> r8, p000.zy2<? super p000.bth> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof p000.d76.C4647g.a
                if (r0 == 0) goto L13
                r0 = r9
                d76$g$a r0 = (p000.d76.C4647g.a) r0
                int r1 = r0.f28654b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28654b = r1
                goto L18
            L13:
                d76$g$a r0 = new d76$g$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f28653a
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f28654b
                r3 = 1
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L36
                int r8 = r0.f28659m
                int r2 = r0.f28658f
                java.lang.Object r4 = r0.f28657e
                java.lang.Object[] r4 = (java.lang.Object[]) r4
                java.lang.Object r5 = r0.f28656d
                t66 r5 = (p000.t66) r5
                p000.y7e.throwOnFailure(r9)
                r9 = r5
                goto L5f
            L36:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3e:
                p000.y7e.throwOnFailure(r9)
                java.lang.Object[] r9 = r7.f28652a
                int r2 = r9.length
                r4 = 0
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r4
                r4 = r6
            L4a:
                if (r2 >= r8) goto L61
                r5 = r4[r2]
                r0.f28656d = r9
                r0.f28657e = r4
                r0.f28658f = r2
                r0.f28659m = r8
                r0.f28654b = r3
                java.lang.Object r5 = r9.emit(r5, r0)
                if (r5 != r1) goto L5f
                return r1
            L5f:
                int r2 = r2 + r3
                goto L4a
            L61:
                bth r8 = p000.bth.f14751a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.d76.C4647g.collect(t66, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: d76$h */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,108:1\n161#2:109\n162#2,2:111\n164#2:114\n13367#3:110\n13368#3:113\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n161#1:110\n161#1:113\n*E\n"})
    public static final class C4648h implements y56<Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int[] f28660a;

        /* JADX INFO: renamed from: d76$h$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7", m4010f = "Builders.kt", m4011i = {0, 0}, m4012l = {111}, m4013m = "collect", m4014n = {"$this$asFlow_u24lambda_u2413", "$this$forEach$iv"}, m4015s = {"L$0", "L$1"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f28661a;

            /* JADX INFO: renamed from: b */
            public int f28662b;

            /* JADX INFO: renamed from: d */
            public Object f28664d;

            /* JADX INFO: renamed from: e */
            public Object f28665e;

            /* JADX INFO: renamed from: f */
            public int f28666f;

            /* JADX INFO: renamed from: m */
            public int f28667m;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f28661a = obj;
                this.f28662b |= Integer.MIN_VALUE;
                return C4648h.this.collect(null, this);
            }
        }

        public C4648h(int[] iArr) {
            this.f28660a = iArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0060 -> B:19:0x0063). Please report as a decompilation issue!!! */
        @Override // p000.y56
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(p000.t66<? super java.lang.Integer> r8, p000.zy2<? super p000.bth> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof p000.d76.C4648h.a
                if (r0 == 0) goto L13
                r0 = r9
                d76$h$a r0 = (p000.d76.C4648h.a) r0
                int r1 = r0.f28662b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28662b = r1
                goto L18
            L13:
                d76$h$a r0 = new d76$h$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f28661a
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f28662b
                r3 = 1
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L36
                int r8 = r0.f28667m
                int r2 = r0.f28666f
                java.lang.Object r4 = r0.f28665e
                int[] r4 = (int[]) r4
                java.lang.Object r5 = r0.f28664d
                t66 r5 = (p000.t66) r5
                p000.y7e.throwOnFailure(r9)
                r9 = r5
                goto L63
            L36:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3e:
                p000.y7e.throwOnFailure(r9)
                int[] r9 = r7.f28660a
                int r2 = r9.length
                r4 = 0
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r4
                r4 = r6
            L4a:
                if (r2 >= r8) goto L65
                r5 = r4[r2]
                java.lang.Integer r5 = p000.wc1.boxInt(r5)
                r0.f28664d = r9
                r0.f28665e = r4
                r0.f28666f = r2
                r0.f28667m = r8
                r0.f28662b = r3
                java.lang.Object r5 = r9.emit(r5, r0)
                if (r5 != r1) goto L63
                return r1
            L63:
                int r2 = r2 + r3
                goto L4a
            L65:
                bth r8 = p000.bth.f14751a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.d76.C4648h.collect(t66, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: d76$i */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,108:1\n172#2:109\n173#2,2:111\n175#2:114\n13374#3:110\n13375#3:113\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n172#1:110\n172#1:113\n*E\n"})
    public static final class C4649i implements y56<Long> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long[] f28668a;

        /* JADX INFO: renamed from: d76$i$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8", m4010f = "Builders.kt", m4011i = {0, 0}, m4012l = {111}, m4013m = "collect", m4014n = {"$this$asFlow_u24lambda_u2415", "$this$forEach$iv"}, m4015s = {"L$0", "L$1"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f28669a;

            /* JADX INFO: renamed from: b */
            public int f28670b;

            /* JADX INFO: renamed from: d */
            public Object f28672d;

            /* JADX INFO: renamed from: e */
            public Object f28673e;

            /* JADX INFO: renamed from: f */
            public int f28674f;

            /* JADX INFO: renamed from: m */
            public int f28675m;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f28669a = obj;
                this.f28670b |= Integer.MIN_VALUE;
                return C4649i.this.collect(null, this);
            }
        }

        public C4649i(long[] jArr) {
            this.f28668a = jArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0060 -> B:19:0x0063). Please report as a decompilation issue!!! */
        @Override // p000.y56
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(p000.t66<? super java.lang.Long> r9, p000.zy2<? super p000.bth> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof p000.d76.C4649i.a
                if (r0 == 0) goto L13
                r0 = r10
                d76$i$a r0 = (p000.d76.C4649i.a) r0
                int r1 = r0.f28670b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28670b = r1
                goto L18
            L13:
                d76$i$a r0 = new d76$i$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f28669a
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f28670b
                r3 = 1
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L36
                int r9 = r0.f28675m
                int r2 = r0.f28674f
                java.lang.Object r4 = r0.f28673e
                long[] r4 = (long[]) r4
                java.lang.Object r5 = r0.f28672d
                t66 r5 = (p000.t66) r5
                p000.y7e.throwOnFailure(r10)
                r10 = r5
                goto L63
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                p000.y7e.throwOnFailure(r10)
                long[] r10 = r8.f28668a
                int r2 = r10.length
                r4 = 0
                r7 = r10
                r10 = r9
                r9 = r2
                r2 = r4
                r4 = r7
            L4a:
                if (r2 >= r9) goto L65
                r5 = r4[r2]
                java.lang.Long r5 = p000.wc1.boxLong(r5)
                r0.f28672d = r10
                r0.f28673e = r4
                r0.f28674f = r2
                r0.f28675m = r9
                r0.f28670b = r3
                java.lang.Object r5 = r10.emit(r5, r0)
                if (r5 != r1) goto L63
                return r1
            L63:
                int r2 = r2 + r3
                goto L4a
            L65:
                bth r9 = p000.bth.f14751a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.d76.C4649i.collect(t66, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: d76$j */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n181#2:109\n182#2,2:111\n184#2:114\n1863#3:110\n1864#3:113\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n181#1:110\n181#1:113\n*E\n"})
    public static final class C4650j implements y56<Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f78 f28676a;

        /* JADX INFO: renamed from: d76$j$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9", m4010f = "Builders.kt", m4011i = {0}, m4012l = {111}, m4013m = "collect", m4014n = {"$this$asFlow_u24lambda_u2417"}, m4015s = {"L$0"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f28677a;

            /* JADX INFO: renamed from: b */
            public int f28678b;

            /* JADX INFO: renamed from: d */
            public Object f28680d;

            /* JADX INFO: renamed from: e */
            public Object f28681e;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f28677a = obj;
                this.f28678b |= Integer.MIN_VALUE;
                return C4650j.this.collect(null, this);
            }
        }

        public C4650j(f78 f78Var) {
            this.f28676a = f78Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p000.y56
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(p000.t66<? super java.lang.Integer> r6, p000.zy2<? super p000.bth> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof p000.d76.C4650j.a
                if (r0 == 0) goto L13
                r0 = r7
                d76$j$a r0 = (p000.d76.C4650j.a) r0
                int r1 = r0.f28678b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28678b = r1
                goto L18
            L13:
                d76$j$a r0 = new d76$j$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f28677a
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f28678b
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.f28681e
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.f28680d
                t66 r2 = (p000.t66) r2
                p000.y7e.throwOnFailure(r7)
                r7 = r2
                goto L46
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                p000.y7e.throwOnFailure(r7)
                f78 r7 = r5.f28676a
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L46:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L64
                r2 = r6
                o68 r2 = (p000.o68) r2
                int r2 = r2.nextInt()
                java.lang.Integer r2 = p000.wc1.boxInt(r2)
                r0.f28680d = r7
                r0.f28681e = r6
                r0.f28678b = r3
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L46
                return r1
            L64:
                bth r6 = p000.bth.f14751a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.d76.C4650j.collect(t66, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: d76$k */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,108:1\n119#2,4:109\n*E\n"})
    public static final class C4651k<T> implements y56<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object[] f28682a;

        /* JADX INFO: renamed from: d76$k$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", m4010f = "Builders.kt", m4011i = {0, 0}, m4012l = {110}, m4013m = "collect", m4014n = {"this", "$this$flowOf_u24lambda_u248"}, m4015s = {"L$0", "L$1"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f28683a;

            /* JADX INFO: renamed from: b */
            public int f28684b;

            /* JADX INFO: renamed from: d */
            public Object f28686d;

            /* JADX INFO: renamed from: e */
            public Object f28687e;

            /* JADX INFO: renamed from: f */
            public int f28688f;

            /* JADX INFO: renamed from: m */
            public int f28689m;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f28683a = obj;
                this.f28684b |= Integer.MIN_VALUE;
                return C4651k.this.collect(null, this);
            }
        }

        public C4651k(Object[] objArr) {
            this.f28682a = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r9v10 */
        /* JADX WARN: Type inference failed for: r9v4 */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, t66] */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v8 */
        /* JADX WARN: Type inference failed for: r9v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005d -> B:19:0x0060). Please report as a decompilation issue!!! */
        @Override // p000.y56
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(p000.t66<? super T> r8, p000.zy2<? super p000.bth> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof p000.d76.C4651k.a
                if (r0 == 0) goto L13
                r0 = r9
                d76$k$a r0 = (p000.d76.C4651k.a) r0
                int r1 = r0.f28684b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28684b = r1
                goto L18
            L13:
                d76$k$a r0 = new d76$k$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f28683a
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f28684b
                r3 = 1
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L36
                int r8 = r0.f28689m
                int r2 = r0.f28688f
                java.lang.Object r4 = r0.f28687e
                t66 r4 = (p000.t66) r4
                java.lang.Object r5 = r0.f28686d
                d76$k r5 = (p000.d76.C4651k) r5
                p000.y7e.throwOnFailure(r9)
                r9 = r4
                goto L60
            L36:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3e:
                p000.y7e.throwOnFailure(r9)
                java.lang.Object[] r9 = r7.f28682a
                int r9 = r9.length
                r2 = 0
                r5 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L49:
                if (r2 >= r8) goto L62
                java.lang.Object[] r4 = r5.f28682a
                r4 = r4[r2]
                r0.f28686d = r5
                r0.f28687e = r9
                r0.f28688f = r2
                r0.f28689m = r8
                r0.f28684b = r3
                java.lang.Object r4 = r9.emit(r4, r0)
                if (r4 != r1) goto L60
                return r1
            L60:
                int r2 = r2 + r3
                goto L49
            L62:
                bth r8 = p000.bth.f14751a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.d76.C4651k.collect(t66, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: d76$l */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,108:1\n132#2,2:109\n*E\n"})
    public static final class C4652l<T> implements y56<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f28690a;

        public C4652l(Object obj) {
            this.f28690a = obj;
        }

        @Override // p000.y56
        public Object collect(t66<? super T> t66Var, zy2<? super bth> zy2Var) {
            Object objEmit = t66Var.emit((Object) this.f28690a, zy2Var);
            return objEmit == pd8.getCOROUTINE_SUSPENDED() ? objEmit : bth.f14751a;
        }
    }

    @yfb
    public static final <T> y56<T> asFlow(@yfb ny6<? extends T> ny6Var) {
        return new C4642b(ny6Var);
    }

    @yfb
    public static final <T> y56<T> callbackFlow(@yfb @cg1 gz6<? super vdd<? super T>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        return new io1(gz6Var, null, 0, null, 14, null);
    }

    @yfb
    public static final <T> y56<T> channelFlow(@yfb @cg1 gz6<? super vdd<? super T>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        return new gu1(gz6Var, null, 0, null, 14, null);
    }

    @yfb
    public static final <T> y56<T> emptyFlow() {
        return d05.f28132a;
    }

    @yfb
    public static final <T> y56<T> flow(@yfb @cg1 gz6<? super t66<? super T>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        return new qke(gz6Var);
    }

    @yfb
    public static final <T> y56<T> flowOf(@yfb T... tArr) {
        return new C4651k(tArr);
    }

    @yfb
    public static final <T> y56<T> asFlow(@yfb qy6<? super zy2<? super T>, ? extends Object> qy6Var) {
        return new C4643c(qy6Var);
    }

    @yfb
    public static final <T> y56<T> flowOf(T t) {
        return new C4652l(t);
    }

    @yfb
    public static final <T> y56<T> asFlow(@yfb Iterable<? extends T> iterable) {
        return new C4644d(iterable);
    }

    @yfb
    public static final <T> y56<T> asFlow(@yfb Iterator<? extends T> it) {
        return new C4645e(it);
    }

    @yfb
    public static final <T> y56<T> asFlow(@yfb vye<? extends T> vyeVar) {
        return new C4646f(vyeVar);
    }

    @yfb
    public static final <T> y56<T> asFlow(@yfb T[] tArr) {
        return new C4647g(tArr);
    }

    @yfb
    public static final y56<Integer> asFlow(@yfb int[] iArr) {
        return new C4648h(iArr);
    }

    @yfb
    public static final y56<Long> asFlow(@yfb long[] jArr) {
        return new C4649i(jArr);
    }

    @yfb
    public static final y56<Integer> asFlow(@yfb f78 f78Var) {
        return new C4650j(f78Var);
    }

    @yfb
    public static final y56<Long> asFlow(@yfb ul9 ul9Var) {
        return new C4641a(ul9Var);
    }
}

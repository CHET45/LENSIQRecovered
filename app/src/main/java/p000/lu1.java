package p000;

import p000.jvd;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n1#2:97\n*E\n"})
public final class lu1<T, R> extends ju1<T, R> {

    /* JADX INFO: renamed from: e */
    @yfb
    public final kz6<t66<? super R>, T, zy2<? super bth>, Object> f58725e;

    /* JADX INFO: renamed from: lu1$a */
    @ck3(m4009c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", m4010f = "Merge.kt", m4011i = {}, m4012l = {23}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C8973a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f58726a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f58727b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ lu1<T, R> f58728c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ t66<R> f58729d;

        /* JADX INFO: renamed from: lu1$a$a */
        public static final class a<T> implements t66 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ jvd.C8121h<jj8> f58730a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ x13 f58731b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ lu1<T, R> f58732c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ t66<R> f58733d;

            /* JADX INFO: renamed from: lu1$a$a$a, reason: collision with other inner class name */
            @ck3(m4009c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", m4010f = "Merge.kt", m4011i = {}, m4012l = {30}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
            public static final class C16478a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: a */
                public int f58734a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ lu1<T, R> f58735b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ t66<R> f58736c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ T f58737d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C16478a(lu1<T, R> lu1Var, t66<? super R> t66Var, T t, zy2<? super C16478a> zy2Var) {
                    super(2, zy2Var);
                    this.f58735b = lu1Var;
                    this.f58736c = t66Var;
                    this.f58737d = t;
                }

                @Override // p000.tq0
                public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                    return new C16478a(this.f58735b, this.f58736c, this.f58737d, zy2Var);
                }

                @Override // p000.gz6
                public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
                    return ((C16478a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
                }

                @Override // p000.tq0
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                    int i = this.f58734a;
                    if (i == 0) {
                        y7e.throwOnFailure(obj);
                        kz6 kz6Var = this.f58735b.f58725e;
                        t66<R> t66Var = this.f58736c;
                        T t = this.f58737d;
                        this.f58734a = 1;
                        if (kz6Var.invoke(t66Var, t, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y7e.throwOnFailure(obj);
                    }
                    return bth.f14751a;
                }
            }

            /* JADX INFO: renamed from: lu1$a$a$b */
            @ck3(m4009c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", m4010f = "Merge.kt", m4011i = {0, 0}, m4012l = {26}, m4013m = "emit", m4014n = {"this", "value"}, m4015s = {"L$0", "L$1"})
            public static final class b extends cz2 {

                /* JADX INFO: renamed from: a */
                public Object f58738a;

                /* JADX INFO: renamed from: b */
                public Object f58739b;

                /* JADX INFO: renamed from: c */
                public Object f58740c;

                /* JADX INFO: renamed from: d */
                public /* synthetic */ Object f58741d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ a<T> f58742e;

                /* JADX INFO: renamed from: f */
                public int f58743f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(a<? super T> aVar, zy2<? super b> zy2Var) {
                    super(zy2Var);
                    this.f58742e = aVar;
                }

                @Override // p000.tq0
                public final Object invokeSuspend(Object obj) {
                    this.f58741d = obj;
                    this.f58743f |= Integer.MIN_VALUE;
                    return this.f58742e.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(jvd.C8121h<jj8> c8121h, x13 x13Var, lu1<T, R> lu1Var, t66<? super R> t66Var) {
                this.f58730a = c8121h;
                this.f58731b = x13Var;
                this.f58732c = lu1Var;
                this.f58733d = t66Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // p000.t66
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r8, p000.zy2<? super p000.bth> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof p000.lu1.C8973a.a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    lu1$a$a$b r0 = (p000.lu1.C8973a.a.b) r0
                    int r1 = r0.f58743f
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f58743f = r1
                    goto L18
                L13:
                    lu1$a$a$b r0 = new lu1$a$a$b
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f58741d
                    java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f58743f
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f58740c
                    jj8 r8 = (p000.jj8) r8
                    java.lang.Object r8 = r0.f58739b
                    java.lang.Object r0 = r0.f58738a
                    lu1$a$a r0 = (p000.lu1.C8973a.a) r0
                    p000.y7e.throwOnFailure(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    p000.y7e.throwOnFailure(r9)
                    jvd$h<jj8> r9 = r7.f58730a
                    T r9 = r9.f52110a
                    jj8 r9 = (p000.jj8) r9
                    if (r9 == 0) goto L5d
                    uy1 r2 = new uy1
                    r2.<init>()
                    r9.cancel(r2)
                    r0.f58738a = r7
                    r0.f58739b = r8
                    r0.f58740c = r9
                    r0.f58743f = r3
                    java.lang.Object r9 = r9.join(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    jvd$h<jj8> r9 = r0.f58730a
                    x13 r1 = r0.f58731b
                    b23 r3 = p000.b23.f12444d
                    lu1$a$a$a r4 = new lu1$a$a$a
                    lu1<T, R> r2 = r0.f58732c
                    t66<R> r0 = r0.f58733d
                    r5 = 0
                    r4.<init>(r2, r0, r8, r5)
                    r5 = 1
                    r6 = 0
                    r2 = 0
                    jj8 r8 = p000.dg1.launch$default(r1, r2, r3, r4, r5, r6)
                    r9.f52110a = r8
                    bth r8 = p000.bth.f14751a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.lu1.C8973a.a.emit(java.lang.Object, zy2):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8973a(lu1<T, R> lu1Var, t66<? super R> t66Var, zy2<? super C8973a> zy2Var) {
            super(2, zy2Var);
            this.f58728c = lu1Var;
            this.f58729d = t66Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C8973a c8973a = new C8973a(this.f58728c, this.f58729d, zy2Var);
            c8973a.f58727b = obj;
            return c8973a;
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C8973a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type zy2 to lu1$a for r7v1 'this'  zy2
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p000.tq0
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r7.f58726a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                p000.y7e.throwOnFailure(r8)
                goto L37
            Lf:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L17:
                p000.y7e.throwOnFailure(r8)
                java.lang.Object r8 = r7.f58727b
                x13 r8 = (p000.x13) r8
                jvd$h r1 = new jvd$h
                r1.<init>()
                lu1<T, R> r3 = r7.f58728c
                y56<S> r4 = r3.f51828d
                lu1$a$a r5 = new lu1$a$a
                t66<R> r6 = r7.f58729d
                r5.<init>(r1, r8, r3, r6)
                r7.f58726a = r2
                java.lang.Object r8 = r4.collect(r5, r7)
                if (r8 != r0) goto L37
                return r0
            L37:
                bth r8 = p000.bth.f14751a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.lu1.C8973a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public /* synthetic */ lu1(kz6 kz6Var, y56 y56Var, e13 e13Var, int i, gf1 gf1Var, int i2, jt3 jt3Var) {
        this(kz6Var, y56Var, (i2 & 4) != 0 ? a05.f2a : e13Var, (i2 & 8) != 0 ? -2 : i, (i2 & 16) != 0 ? gf1.f39657a : gf1Var);
    }

    @Override // p000.fu1
    @yfb
    /* JADX INFO: renamed from: d */
    public fu1<R> mo8701d(@yfb e13 e13Var, int i, @yfb gf1 gf1Var) {
        return new lu1(this.f58725e, this.f51828d, e13Var, i, gf1Var);
    }

    @Override // p000.ju1
    @gib
    /* JADX INFO: renamed from: g */
    public Object mo14309g(@yfb t66<? super R> t66Var, @yfb zy2<? super bth> zy2Var) {
        Object objCoroutineScope = y13.coroutineScope(new C8973a(this, t66Var, null), zy2Var);
        return objCoroutineScope == pd8.getCOROUTINE_SUSPENDED() ? objCoroutineScope : bth.f14751a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lu1(@yfb kz6<? super t66<? super R>, ? super T, ? super zy2<? super bth>, ? extends Object> kz6Var, @yfb y56<? extends T> y56Var, @yfb e13 e13Var, int i, @yfb gf1 gf1Var) {
        super(y56Var, e13Var, i, gf1Var);
        this.f58725e = kz6Var;
    }
}

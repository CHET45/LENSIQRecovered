package p000;

import p000.jvd;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/FlowKt__ShareKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,425:1\n1#2:426\n*E\n"})
public final /* synthetic */ class w76 {

    /* JADX INFO: renamed from: w76$a */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", m4010f = "Share.kt", m4011i = {}, m4012l = {210, 214, 215, 221}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C14448a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f93444a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ jaf f93445b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ y56<T> f93446c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ v6b<T> f93447d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ T f93448e;

        /* JADX INFO: renamed from: w76$a$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", m4010f = "Share.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<Integer, zy2<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a */
            public int f93449a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ int f93450b;

            public a(zy2<? super a> zy2Var) {
                super(2, zy2Var);
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                a aVar = new a(zy2Var);
                aVar.f93450b = ((Number) obj).intValue();
                return aVar;
            }

            public final Object invoke(int i, zy2<? super Boolean> zy2Var) {
                return ((a) create(Integer.valueOf(i), zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                pd8.getCOROUTINE_SUSPENDED();
                if (this.f93449a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
                return wc1.boxBoolean(this.f93450b > 0);
            }

            @Override // p000.gz6
            public /* bridge */ /* synthetic */ Object invoke(Integer num, zy2<? super Boolean> zy2Var) {
                return invoke(num.intValue(), zy2Var);
            }
        }

        /* JADX INFO: renamed from: w76$a$b */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", m4010f = "Share.kt", m4011i = {}, m4012l = {223}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class b extends ugg implements gz6<haf, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f93451a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f93452b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ y56<T> f93453c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ v6b<T> f93454d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ T f93455e;

            /* JADX INFO: renamed from: w76$a$b$a */
            public /* synthetic */ class a {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int[] f93456a;

                static {
                    int[] iArr = new int[haf.values().length];
                    try {
                        iArr[haf.f43014a.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[haf.f43015b.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[haf.f43016c.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f93456a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(y56<? extends T> y56Var, v6b<T> v6bVar, T t, zy2<? super b> zy2Var) {
                super(2, zy2Var);
                this.f93453c = y56Var;
                this.f93454d = v6bVar;
                this.f93455e = t;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                b bVar = new b(this.f93453c, this.f93454d, this.f93455e, zy2Var);
                bVar.f93452b = obj;
                return bVar;
            }

            @Override // p000.gz6
            public final Object invoke(haf hafVar, zy2<? super bth> zy2Var) {
                return ((b) create(hafVar, zy2Var)).invokeSuspend(bth.f14751a);
            }

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
            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f93451a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    int i2 = a.f93456a[((haf) this.f93452b).ordinal()];
                    if (i2 == 1) {
                        y56<T> y56Var = this.f93453c;
                        t66 t66Var = this.f93454d;
                        this.f93451a = 1;
                        if (y56Var.collect(t66Var, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i2 != 2) {
                        if (i2 != 3) {
                            throw new ceb();
                        }
                        T t = this.f93455e;
                        if (t == s9f.f81015a) {
                            this.f93454d.resetReplayCache();
                        } else {
                            wc1.boxBoolean(this.f93454d.tryEmit(t));
                        }
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14448a(jaf jafVar, y56<? extends T> y56Var, v6b<T> v6bVar, T t, zy2<? super C14448a> zy2Var) {
            super(2, zy2Var);
            this.f93445b = jafVar;
            this.f93446c = y56Var;
            this.f93447d = v6bVar;
            this.f93448e = t;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return new C14448a(this.f93445b, this.f93446c, this.f93447d, this.f93448e, zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C14448a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[RETURN] */
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
        @Override // p000.tq0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r7.f93444a
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L21
                if (r1 != r2) goto L15
                goto L21
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                p000.y7e.throwOnFailure(r8)
                goto L5c
            L21:
                p000.y7e.throwOnFailure(r8)
                goto L8d
            L25:
                p000.y7e.throwOnFailure(r8)
                jaf r8 = r7.f93445b
                jaf$a r1 = p000.jaf.f50125a
                jaf r6 = r1.getEagerly()
                if (r8 != r6) goto L3f
                y56<T> r8 = r7.f93446c
                v6b<T> r1 = r7.f93447d
                r7.f93444a = r5
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L3f:
                jaf r8 = r7.f93445b
                jaf r1 = r1.getLazily()
                r5 = 0
                if (r8 != r1) goto L69
                v6b<T> r8 = r7.f93447d
                l2g r8 = r8.getSubscriptionCount()
                w76$a$a r1 = new w76$a$a
                r1.<init>(r5)
                r7.f93444a = r4
                java.lang.Object r8 = p000.c76.first(r8, r1, r7)
                if (r8 != r0) goto L5c
                return r0
            L5c:
                y56<T> r8 = r7.f93446c
                v6b<T> r1 = r7.f93447d
                r7.f93444a = r3
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L69:
                jaf r8 = r7.f93445b
                v6b<T> r1 = r7.f93447d
                l2g r1 = r1.getSubscriptionCount()
                y56 r8 = r8.command(r1)
                y56 r8 = p000.c76.distinctUntilChanged(r8)
                w76$a$b r1 = new w76$a$b
                y56<T> r3 = r7.f93446c
                v6b<T> r4 = r7.f93447d
                T r6 = r7.f93448e
                r1.<init>(r3, r4, r6, r5)
                r7.f93444a = r2
                java.lang.Object r8 = p000.c76.collectLatest(r8, r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L8d:
                bth r8 = p000.bth.f14751a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.w76.C14448a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: w76$b */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", m4010f = "Share.kt", m4011i = {}, m4012l = {336}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C14449b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f93457a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f93458b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ y56<T> f93459c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ve2<l2g<T>> f93460d;

        /* JADX INFO: renamed from: w76$b$a */
        @dwf({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/FlowKt__ShareKt$launchSharingDeferred$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,425:1\n1#2:426\n*E\n"})
        public static final class a<T> implements t66 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ jvd.C8121h<a7b<T>> f93461a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ x13 f93462b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ ve2<l2g<T>> f93463c;

            public a(jvd.C8121h<a7b<T>> c8121h, x13 x13Var, ve2<l2g<T>> ve2Var) {
                this.f93461a = c8121h;
                this.f93462b = x13Var;
                this.f93463c = ve2Var;
            }

            /* JADX WARN: Type inference failed for: r4v1, types: [T, a7b, l2g] */
            @Override // p000.t66
            public final Object emit(T t, zy2<? super bth> zy2Var) {
                jvd.C8121h<a7b<T>> c8121h = this.f93461a;
                a7b<T> a7bVar = c8121h.f52110a;
                if (a7bVar != null) {
                    a7bVar.setValue(t);
                } else {
                    x13 x13Var = this.f93462b;
                    ve2<l2g<T>> ve2Var = this.f93463c;
                    ?? r4 = (T) n2g.MutableStateFlow(t);
                    ve2Var.complete(new qrd(r4, oj8.getJob(x13Var.getCoroutineContext())));
                    c8121h.f52110a = r4;
                }
                return bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14449b(y56<? extends T> y56Var, ve2<l2g<T>> ve2Var, zy2<? super C14449b> zy2Var) {
            super(2, zy2Var);
            this.f93459c = y56Var;
            this.f93460d = ve2Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C14449b c14449b = new C14449b(this.f93459c, this.f93460d, zy2Var);
            c14449b.f93458b = obj;
            return c14449b;
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C14449b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type zy2 to w76$b for r6v1 'this'  zy2
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p000.tq0
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r6.f93457a
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                p000.y7e.throwOnFailure(r7)     // Catch: java.lang.Throwable -> Lf
                goto L37
            Lf:
                r7 = move-exception
                goto L3a
            L11:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L19:
                p000.y7e.throwOnFailure(r7)
                java.lang.Object r7 = r6.f93458b
                x13 r7 = (p000.x13) r7
                jvd$h r1 = new jvd$h     // Catch: java.lang.Throwable -> Lf
                r1.<init>()     // Catch: java.lang.Throwable -> Lf
                y56<T> r3 = r6.f93459c     // Catch: java.lang.Throwable -> Lf
                w76$b$a r4 = new w76$b$a     // Catch: java.lang.Throwable -> Lf
                ve2<l2g<T>> r5 = r6.f93460d     // Catch: java.lang.Throwable -> Lf
                r4.<init>(r1, r7, r5)     // Catch: java.lang.Throwable -> Lf
                r6.f93457a = r2     // Catch: java.lang.Throwable -> Lf
                java.lang.Object r7 = r3.collect(r4, r6)     // Catch: java.lang.Throwable -> Lf
                if (r7 != r0) goto L37
                return r0
            L37:
                bth r7 = p000.bth.f14751a
                return r7
            L3a:
                ve2<l2g<T>> r0 = r6.f93460d
                r0.completeExceptionally(r7)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.w76.C14449b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @yfb
    public static final <T> q9f<T> asSharedFlow(@yfb v6b<T> v6bVar) {
        return new ord(v6bVar, null);
    }

    @yfb
    public static final <T> l2g<T> asStateFlow(@yfb a7b<T> a7bVar) {
        return new qrd(a7bVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final <T> p000.iaf<T> configureSharing$FlowKt__ShareKt(p000.y56<? extends T> r7, int r8) {
        /*
            au1$b r0 = p000.au1.f11861h
            int r0 = r0.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core()
            int r0 = p000.kpd.coerceAtLeast(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof p000.fu1
            if (r1 == 0) goto L3c
            r1 = r7
            fu1 r1 = (p000.fu1) r1
            y56 r2 = r1.dropChannelOperators()
            if (r2 == 0) goto L3c
            iaf r7 = new iaf
            int r3 = r1.f37755b
            r4 = -3
            if (r3 == r4) goto L26
            r4 = -2
            if (r3 == r4) goto L26
            if (r3 == 0) goto L26
            r0 = r3
            goto L34
        L26:
            gf1 r4 = r1.f37756c
            gf1 r5 = p000.gf1.f39657a
            r6 = 0
            if (r4 != r5) goto L31
            if (r3 != 0) goto L34
        L2f:
            r0 = r6
            goto L34
        L31:
            if (r8 != 0) goto L2f
            r0 = 1
        L34:
            gf1 r8 = r1.f37756c
            e13 r1 = r1.f37754a
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3c:
            iaf r8 = new iaf
            gf1 r1 = p000.gf1.f39657a
            a05 r2 = p000.a05.f2a
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.w76.configureSharing$FlowKt__ShareKt(y56, int):iaf");
    }

    private static final <T> jj8 launchSharing$FlowKt__ShareKt(x13 x13Var, e13 e13Var, y56<? extends T> y56Var, v6b<T> v6bVar, jaf jafVar, T t) {
        return dg1.launch(x13Var, e13Var, md8.areEqual(jafVar, jaf.f50125a.getEagerly()) ? b23.f12441a : b23.f12444d, new C14448a(jafVar, y56Var, v6bVar, t, null));
    }

    private static final <T> void launchSharingDeferred$FlowKt__ShareKt(x13 x13Var, e13 e13Var, y56<? extends T> y56Var, ve2<l2g<T>> ve2Var) {
        fg1.launch$default(x13Var, e13Var, null, new C14449b(y56Var, ve2Var, null), 2, null);
    }

    @yfb
    public static final <T> q9f<T> onSubscription(@yfb q9f<? extends T> q9fVar, @yfb gz6<? super t66<? super T>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        return new tcg(q9fVar, gz6Var);
    }

    @yfb
    public static final <T> q9f<T> shareIn(@yfb y56<? extends T> y56Var, @yfb x13 x13Var, @yfb jaf jafVar, int i) {
        iaf iafVarConfigureSharing$FlowKt__ShareKt = configureSharing$FlowKt__ShareKt(y56Var, i);
        v6b v6bVarMutableSharedFlow = s9f.MutableSharedFlow(i, iafVarConfigureSharing$FlowKt__ShareKt.f46267b, iafVarConfigureSharing$FlowKt__ShareKt.f46268c);
        return new ord(v6bVarMutableSharedFlow, launchSharing$FlowKt__ShareKt(x13Var, iafVarConfigureSharing$FlowKt__ShareKt.f46269d, iafVarConfigureSharing$FlowKt__ShareKt.f46266a, v6bVarMutableSharedFlow, jafVar, s9f.f81015a));
    }

    public static /* synthetic */ q9f shareIn$default(y56 y56Var, x13 x13Var, jaf jafVar, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return c76.shareIn(y56Var, x13Var, jafVar, i);
    }

    @yfb
    public static final <T> l2g<T> stateIn(@yfb y56<? extends T> y56Var, @yfb x13 x13Var, @yfb jaf jafVar, T t) {
        iaf iafVarConfigureSharing$FlowKt__ShareKt = configureSharing$FlowKt__ShareKt(y56Var, 1);
        a7b a7bVarMutableStateFlow = n2g.MutableStateFlow(t);
        return new qrd(a7bVarMutableStateFlow, launchSharing$FlowKt__ShareKt(x13Var, iafVarConfigureSharing$FlowKt__ShareKt.f46269d, iafVarConfigureSharing$FlowKt__ShareKt.f46266a, a7bVarMutableStateFlow, jafVar, t));
    }

    @gib
    public static final <T> Object stateIn(@yfb y56<? extends T> y56Var, @yfb x13 x13Var, @yfb zy2<? super l2g<? extends T>> zy2Var) {
        iaf iafVarConfigureSharing$FlowKt__ShareKt = configureSharing$FlowKt__ShareKt(y56Var, 1);
        ve2 ve2VarCompletableDeferred$default = xe2.CompletableDeferred$default(null, 1, null);
        launchSharingDeferred$FlowKt__ShareKt(x13Var, iafVarConfigureSharing$FlowKt__ShareKt.f46269d, iafVarConfigureSharing$FlowKt__ShareKt.f46266a, ve2VarCompletableDeferred$default);
        return ve2VarCompletableDeferred$default.await(zy2Var);
    }
}

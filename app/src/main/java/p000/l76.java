package p000;

import androidx.lifecycle.C1171x;
import java.util.concurrent.CancellationException;
import org.opencv.videoio.Videoio;
import p000.jvd;
import p000.xu1;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,407:1\n1#2:408\n*E\n"})
public final /* synthetic */ class l76 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l76$a */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", m4010f = "Delay.kt", m4011i = {0, 0, 0, 0, 1, 1, 1}, m4012l = {215, Videoio.CAP_PROP_XI_AEAG}, m4013m = "invokeSuspend", m4014n = {"downstream", C1171x.f7958g, "lastValue", "timeoutMillis", "downstream", C1171x.f7958g, "lastValue"}, m4015s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
    @dwf({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,407:1\n14#2:408\n14#2:410\n1#3:409\n54#4,5:411\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1\n*L\n212#1:408\n215#1:410\n222#1:411,5\n*E\n"})
    public static final class C8700a<T> extends ugg implements kz6<x13, t66<? super T>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f56627a;

        /* JADX INFO: renamed from: b */
        public Object f56628b;

        /* JADX INFO: renamed from: c */
        public int f56629c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f56630d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f56631e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ qy6<T, Long> f56632f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ y56<T> f56633m;

        /* JADX INFO: renamed from: l76$a$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", m4010f = "Delay.kt", m4011i = {}, m4012l = {nb2.f63860h}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        @dwf({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$1\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,407:1\n14#2:408\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$1\n*L\n226#1:408\n*E\n"})
        public static final class a extends ugg implements qy6<zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f56634a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ t66<T> f56635b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ jvd.C8121h<Object> f56636c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(t66<? super T> t66Var, jvd.C8121h<Object> c8121h, zy2<? super a> zy2Var) {
                super(1, zy2Var);
                this.f56635b = t66Var;
                this.f56636c = c8121h;
            }

            @Override // p000.tq0
            public final zy2<bth> create(zy2<?> zy2Var) {
                return new a(this.f56635b, this.f56636c, zy2Var);
            }

            @Override // p000.qy6
            public final Object invoke(zy2<? super bth> zy2Var) {
                return ((a) create(zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f56634a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    t66<T> t66Var = this.f56635b;
                    qhg qhgVar = zhb.f105096a;
                    T t = this.f56636c.f52110a;
                    if (t == qhgVar) {
                        t = null;
                    }
                    this.f56634a = 1;
                    if (t66Var.emit(t, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                }
                this.f56636c.f52110a = null;
                return bth.f14751a;
            }
        }

        /* JADX INFO: renamed from: l76$a$b */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", m4010f = "Delay.kt", m4011i = {0}, m4012l = {236}, m4013m = "invokeSuspend", m4014n = {"$this$onFailure_u2dWpGqRn0$iv"}, m4015s = {"L$0"})
        @dwf({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$2\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,407:1\n529#2,2:408\n544#2:410\n545#2:413\n1#3:411\n14#4:412\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$2\n*L\n232#1:408,2\n233#1:410\n233#1:413\n236#1:412\n*E\n"})
        public static final class b extends ugg implements gz6<xu1<? extends Object>, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public Object f56637a;

            /* JADX INFO: renamed from: b */
            public int f56638b;

            /* JADX INFO: renamed from: c */
            public /* synthetic */ Object f56639c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ jvd.C8121h<Object> f56640d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ t66<T> f56641e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(jvd.C8121h<Object> c8121h, t66<? super T> t66Var, zy2<? super b> zy2Var) {
                super(2, zy2Var);
                this.f56640d = c8121h;
                this.f56641e = t66Var;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                b bVar = new b(this.f56640d, this.f56641e, zy2Var);
                bVar.f56639c = obj;
                return bVar;
            }

            @Override // p000.gz6
            public /* bridge */ /* synthetic */ Object invoke(xu1<? extends Object> xu1Var, zy2<? super bth> zy2Var) {
                return m30815invokeWpGqRn0(xu1Var.m33284unboximpl(), zy2Var);
            }

            /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
            public final Object m30815invokeWpGqRn0(Object obj, zy2<? super bth> zy2Var) {
                return ((b) create(xu1.m33272boximpl(obj), zy2Var)).invokeSuspend(bth.f14751a);
            }

            /* JADX WARN: Type inference failed for: r7v6, types: [T, qhg] */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type zy2 to l76$a$b for r6v1 'this'  zy2
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
                    int r1 = r6.f56638b
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r0 = r6.f56637a
                    jvd$h r0 = (p000.jvd.C8121h) r0
                    p000.y7e.throwOnFailure(r7)
                    goto L4f
                L13:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1b:
                    p000.y7e.throwOnFailure(r7)
                    java.lang.Object r7 = r6.f56639c
                    xu1 r7 = (p000.xu1) r7
                    java.lang.Object r7 = r7.m33284unboximpl()
                    jvd$h<java.lang.Object> r1 = r6.f56640d
                    boolean r3 = r7 instanceof p000.xu1.C15302c
                    if (r3 != 0) goto L2e
                    r1.f52110a = r7
                L2e:
                    t66<T> r4 = r6.f56641e
                    if (r3 == 0) goto L56
                    java.lang.Throwable r3 = p000.xu1.m33276exceptionOrNullimpl(r7)
                    if (r3 != 0) goto L55
                    T r3 = r1.f52110a
                    if (r3 == 0) goto L50
                    qhg r5 = p000.zhb.f105096a
                    if (r3 != r5) goto L41
                    r3 = 0
                L41:
                    r6.f56639c = r7
                    r6.f56637a = r1
                    r6.f56638b = r2
                    java.lang.Object r7 = r4.emit(r3, r6)
                    if (r7 != r0) goto L4e
                    return r0
                L4e:
                    r0 = r1
                L4f:
                    r1 = r0
                L50:
                    qhg r7 = p000.zhb.f105098c
                    r1.f52110a = r7
                    goto L56
                L55:
                    throw r3
                L56:
                    bth r7 = p000.bth.f14751a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.l76.C8700a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: l76$a$c */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", m4010f = "Delay.kt", m4011i = {}, m4012l = {gm2.f40176m}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class c extends ugg implements gz6<vdd<? super Object>, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f56642a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f56643b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ y56<T> f56644c;

            /* JADX INFO: renamed from: l76$a$c$a */
            public static final class a<T> implements t66 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ vdd<Object> f56645a;

                /* JADX INFO: renamed from: l76$a$c$a$a, reason: collision with other inner class name */
                @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", m4010f = "Delay.kt", m4011i = {}, m4012l = {gm2.f40176m}, m4013m = "emit", m4014n = {}, m4015s = {})
                public static final class C16471a extends cz2 {

                    /* JADX INFO: renamed from: a */
                    public /* synthetic */ Object f56646a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ a<T> f56647b;

                    /* JADX INFO: renamed from: c */
                    public int f56648c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C16471a(a<? super T> aVar, zy2<? super C16471a> zy2Var) {
                        super(zy2Var);
                        this.f56647b = aVar;
                    }

                    @Override // p000.tq0
                    public final Object invokeSuspend(Object obj) {
                        this.f56646a = obj;
                        this.f56648c |= Integer.MIN_VALUE;
                        return this.f56647b.emit(null, this);
                    }
                }

                public a(vdd<Object> vddVar) {
                    this.f56645a = vddVar;
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
                public final java.lang.Object emit(T r5, p000.zy2<? super p000.bth> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof p000.l76.C8700a.c.a.C16471a
                        if (r0 == 0) goto L13
                        r0 = r6
                        l76$a$c$a$a r0 = (p000.l76.C8700a.c.a.C16471a) r0
                        int r1 = r0.f56648c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f56648c = r1
                        goto L18
                    L13:
                        l76$a$c$a$a r0 = new l76$a$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f56646a
                        java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f56648c
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        p000.y7e.throwOnFailure(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        p000.y7e.throwOnFailure(r6)
                        vdd<java.lang.Object> r6 = r4.f56645a
                        if (r5 != 0) goto L3a
                        qhg r5 = p000.zhb.f105096a
                    L3a:
                        r0.f56648c = r3
                        java.lang.Object r5 = r6.send(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        bth r5 = p000.bth.f14751a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.l76.C8700a.c.a.emit(java.lang.Object, zy2):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(y56<? extends T> y56Var, zy2<? super c> zy2Var) {
                super(2, zy2Var);
                this.f56644c = y56Var;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                c cVar = new c(this.f56644c, zy2Var);
                cVar.f56643b = obj;
                return cVar;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(vdd<Object> vddVar, zy2<? super bth> zy2Var) {
                return ((c) create(vddVar, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f56642a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    vdd vddVar = (vdd) this.f56643b;
                    y56<T> y56Var = this.f56644c;
                    a aVar = new a(vddVar);
                    this.f56642a = 1;
                    if (y56Var.collect(aVar, this) == coroutine_suspended) {
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

            @Override // p000.gz6
            public /* bridge */ /* synthetic */ Object invoke(vdd<? super Object> vddVar, zy2<? super bth> zy2Var) {
                return invoke2((vdd<Object>) vddVar, zy2Var);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8700a(qy6<? super T, Long> qy6Var, y56<? extends T> y56Var, zy2<? super C8700a> zy2Var) {
            super(3, zy2Var);
            this.f56632f = qy6Var;
            this.f56633m = y56Var;
        }

        @Override // p000.kz6
        public final Object invoke(x13 x13Var, t66<? super T> t66Var, zy2<? super bth> zy2Var) {
            C8700a c8700a = new C8700a(this.f56632f, this.f56633m, zy2Var);
            c8700a.f56630d = x13Var;
            c8700a.f56631e = t66Var;
            return c8700a.invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00e4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00e5  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e2 -> B:7:0x001e). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 232
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.l76.C8700a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: l76$b */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1", m4010f = "Delay.kt", m4011i = {0, 1, 2}, m4012l = {307, 309, 310}, m4013m = "invokeSuspend", m4014n = {"$this$produce", "$this$produce", "$this$produce"}, m4015s = {"L$0", "L$0", "L$0"})
    public static final class C8701b extends ugg implements gz6<vdd<? super bth>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f56649a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f56650b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f56651c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8701b(long j, zy2<? super C8701b> zy2Var) {
            super(2, zy2Var);
            this.f56651c = j;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C8701b c8701b = new C8701b(this.f56651c, zy2Var);
            c8701b.f56650b = obj;
            return c8701b;
        }

        @Override // p000.gz6
        public final Object invoke(vdd<? super bth> vddVar, zy2<? super bth> zy2Var) {
            return ((C8701b) create(vddVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:15:0x003f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
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
                int r1 = r7.f56649a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2a
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L22
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                java.lang.Object r1 = r7.f56650b
                vdd r1 = (p000.vdd) r1
                p000.y7e.throwOnFailure(r8)
                goto L50
            L22:
                java.lang.Object r1 = r7.f56650b
                vdd r1 = (p000.vdd) r1
                p000.y7e.throwOnFailure(r8)
                goto L3f
            L2a:
                p000.y7e.throwOnFailure(r8)
                java.lang.Object r8 = r7.f56650b
                r1 = r8
                vdd r1 = (p000.vdd) r1
                long r5 = r7.f56651c
                r7.f56650b = r1
                r7.f56649a = r4
                java.lang.Object r8 = p000.p34.delay(r5, r7)
                if (r8 != r0) goto L3f
                return r0
            L3f:
                nye r8 = r1.getChannel()
                bth r4 = p000.bth.f14751a
                r7.f56650b = r1
                r7.f56649a = r3
                java.lang.Object r8 = r8.send(r4, r7)
                if (r8 != r0) goto L50
                return r0
            L50:
                long r4 = r7.f56651c
                r7.f56650b = r1
                r7.f56649a = r2
                java.lang.Object r8 = p000.p34.delay(r4, r7)
                if (r8 != r0) goto L3f
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.l76.C8701b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l76$c */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", m4010f = "Delay.kt", m4011i = {0, 0, 0, 0}, m4012l = {Videoio.CAP_PROP_XI_LED_MODE}, m4013m = "invokeSuspend", m4014n = {"downstream", C1171x.f7958g, "lastValue", "ticker"}, m4015s = {"L$0", "L$1", "L$2", "L$3"})
    @dwf({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2\n+ 2 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,407:1\n54#2,5:408\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2\n*L\n278#1:408,5\n*E\n"})
    public static final class C8702c<T> extends ugg implements kz6<x13, t66<? super T>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f56652a;

        /* JADX INFO: renamed from: b */
        public Object f56653b;

        /* JADX INFO: renamed from: c */
        public int f56654c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f56655d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f56656e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ long f56657f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ y56<T> f56658m;

        /* JADX INFO: renamed from: l76$c$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", m4010f = "Delay.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        @dwf({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,407:1\n529#2,2:408\n544#2:410\n545#2:412\n1#3:411\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$1\n*L\n281#1:408,2\n282#1:410\n282#1:412\n*E\n"})
        public static final class a extends ugg implements gz6<xu1<? extends Object>, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f56659a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f56660b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ jvd.C8121h<Object> f56661c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ hsd<bth> f56662d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(jvd.C8121h<Object> c8121h, hsd<bth> hsdVar, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f56661c = c8121h;
                this.f56662d = hsdVar;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                a aVar = new a(this.f56661c, this.f56662d, zy2Var);
                aVar.f56660b = obj;
                return aVar;
            }

            @Override // p000.gz6
            public /* bridge */ /* synthetic */ Object invoke(xu1<? extends Object> xu1Var, zy2<? super bth> zy2Var) {
                return m30816invokeWpGqRn0(xu1Var.m33284unboximpl(), zy2Var);
            }

            /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
            public final Object m30816invokeWpGqRn0(Object obj, zy2<? super bth> zy2Var) {
                return ((a) create(xu1.m33272boximpl(obj), zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) throws Throwable {
                pd8.getCOROUTINE_SUSPENDED();
                if (this.f56659a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
                T t = (T) ((xu1) this.f56660b).m33284unboximpl();
                jvd.C8121h<Object> c8121h = this.f56661c;
                boolean z = t instanceof xu1.C15302c;
                if (!z) {
                    c8121h.f52110a = t;
                }
                hsd<bth> hsdVar = this.f56662d;
                if (z) {
                    Throwable thM33276exceptionOrNullimpl = xu1.m33276exceptionOrNullimpl(t);
                    if (thM33276exceptionOrNullimpl != null) {
                        throw thM33276exceptionOrNullimpl;
                    }
                    hsdVar.cancel((CancellationException) new uy1());
                    c8121h.f52110a = (T) zhb.f105098c;
                }
                return bth.f14751a;
            }
        }

        /* JADX INFO: renamed from: l76$c$b */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", m4010f = "Delay.kt", m4011i = {}, m4012l = {293}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        @dwf({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$2\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,407:1\n14#2:408\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$2\n*L\n293#1:408\n*E\n"})
        public static final class b extends ugg implements gz6<bth, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f56663a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ jvd.C8121h<Object> f56664b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ t66<T> f56665c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(jvd.C8121h<Object> c8121h, t66<? super T> t66Var, zy2<? super b> zy2Var) {
                super(2, zy2Var);
                this.f56664b = c8121h;
                this.f56665c = t66Var;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return new b(this.f56664b, this.f56665c, zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(bth bthVar, zy2<? super bth> zy2Var) {
                return ((b) create(bthVar, zy2Var)).invokeSuspend(bth.f14751a);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type zy2 to l76$c$b for r5v1 'this'  zy2
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // p000.tq0
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r1 = r5.f56663a
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    p000.y7e.throwOnFailure(r6)
                    goto L36
                Lf:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L17:
                    p000.y7e.throwOnFailure(r6)
                    jvd$h<java.lang.Object> r6 = r5.f56664b
                    T r1 = r6.f52110a
                    if (r1 != 0) goto L23
                    bth r6 = p000.bth.f14751a
                    return r6
                L23:
                    r3 = 0
                    r6.f52110a = r3
                    t66<T> r6 = r5.f56665c
                    qhg r4 = p000.zhb.f105096a
                    if (r1 != r4) goto L2d
                    r1 = r3
                L2d:
                    r5.f56663a = r2
                    java.lang.Object r6 = r6.emit(r1, r5)
                    if (r6 != r0) goto L36
                    return r0
                L36:
                    bth r6 = p000.bth.f14751a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.l76.C8702c.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: l76$c$c */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1", m4010f = "Delay.kt", m4011i = {}, m4012l = {273}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class c extends ugg implements gz6<vdd<? super Object>, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f56666a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f56667b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ y56<T> f56668c;

            /* JADX INFO: renamed from: l76$c$c$a */
            public static final class a<T> implements t66 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ vdd<Object> f56669a;

                /* JADX INFO: renamed from: l76$c$c$a$a, reason: collision with other inner class name */
                @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1", m4010f = "Delay.kt", m4011i = {}, m4012l = {273}, m4013m = "emit", m4014n = {}, m4015s = {})
                public static final class C16472a extends cz2 {

                    /* JADX INFO: renamed from: a */
                    public /* synthetic */ Object f56670a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ a<T> f56671b;

                    /* JADX INFO: renamed from: c */
                    public int f56672c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C16472a(a<? super T> aVar, zy2<? super C16472a> zy2Var) {
                        super(zy2Var);
                        this.f56671b = aVar;
                    }

                    @Override // p000.tq0
                    public final Object invokeSuspend(Object obj) {
                        this.f56670a = obj;
                        this.f56672c |= Integer.MIN_VALUE;
                        return this.f56671b.emit(null, this);
                    }
                }

                public a(vdd<Object> vddVar) {
                    this.f56669a = vddVar;
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
                public final java.lang.Object emit(T r5, p000.zy2<? super p000.bth> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof p000.l76.C8702c.c.a.C16472a
                        if (r0 == 0) goto L13
                        r0 = r6
                        l76$c$c$a$a r0 = (p000.l76.C8702c.c.a.C16472a) r0
                        int r1 = r0.f56672c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f56672c = r1
                        goto L18
                    L13:
                        l76$c$c$a$a r0 = new l76$c$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f56670a
                        java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f56672c
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        p000.y7e.throwOnFailure(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        p000.y7e.throwOnFailure(r6)
                        vdd<java.lang.Object> r6 = r4.f56669a
                        if (r5 != 0) goto L3a
                        qhg r5 = p000.zhb.f105096a
                    L3a:
                        r0.f56672c = r3
                        java.lang.Object r5 = r6.send(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        bth r5 = p000.bth.f14751a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.l76.C8702c.c.a.emit(java.lang.Object, zy2):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(y56<? extends T> y56Var, zy2<? super c> zy2Var) {
                super(2, zy2Var);
                this.f56668c = y56Var;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                c cVar = new c(this.f56668c, zy2Var);
                cVar.f56667b = obj;
                return cVar;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(vdd<Object> vddVar, zy2<? super bth> zy2Var) {
                return ((c) create(vddVar, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f56666a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    vdd vddVar = (vdd) this.f56667b;
                    y56<T> y56Var = this.f56668c;
                    a aVar = new a(vddVar);
                    this.f56666a = 1;
                    if (y56Var.collect(aVar, this) == coroutine_suspended) {
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

            @Override // p000.gz6
            public /* bridge */ /* synthetic */ Object invoke(vdd<? super Object> vddVar, zy2<? super bth> zy2Var) {
                return invoke2((vdd<Object>) vddVar, zy2Var);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8702c(long j, y56<? extends T> y56Var, zy2<? super C8702c> zy2Var) {
            super(3, zy2Var);
            this.f56657f = j;
            this.f56658m = y56Var;
        }

        @Override // p000.kz6
        public final Object invoke(x13 x13Var, t66<? super T> t66Var, zy2<? super bth> zy2Var) {
            C8702c c8702c = new C8702c(this.f56657f, this.f56658m, zy2Var);
            c8702c.f56655d = x13Var;
            c8702c.f56656e = t66Var;
            return c8702c.invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            t66 t66Var;
            hsd<bth> hsdVarFixedPeriodTicker;
            hsd hsdVar;
            jvd.C8121h c8121h;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f56654c;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                x13 x13Var = (x13) this.f56655d;
                t66 t66Var2 = (t66) this.f56656e;
                hsd hsdVarProduce$default = rdd.produce$default(x13Var, null, -1, new c(this.f56658m, null), 1, null);
                jvd.C8121h c8121h2 = new jvd.C8121h();
                t66Var = t66Var2;
                hsdVarFixedPeriodTicker = c76.fixedPeriodTicker(x13Var, this.f56657f);
                hsdVar = hsdVarProduce$default;
                c8121h = c8121h2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hsdVarFixedPeriodTicker = (hsd) this.f56653b;
                c8121h = (jvd.C8121h) this.f56652a;
                hsdVar = (hsd) this.f56656e;
                t66Var = (t66) this.f56655d;
                y7e.throwOnFailure(obj);
            }
            while (c8121h.f52110a != zhb.f105098c) {
                ove oveVar = new ove(getContext());
                oveVar.invoke(hsdVar.getOnReceiveCatching(), new a(c8121h, hsdVarFixedPeriodTicker, null));
                oveVar.invoke(hsdVarFixedPeriodTicker.getOnReceive(), new b(c8121h, t66Var, null));
                this.f56655d = t66Var;
                this.f56656e = hsdVar;
                this.f56652a = c8121h;
                this.f56653b = hsdVarFixedPeriodTicker;
                this.f56654c = 1;
                if (oveVar.doSelect(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l76$d */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", m4010f = "Delay.kt", m4011i = {0, 0}, m4012l = {Videoio.CAP_PROP_XI_MANUAL_WB}, m4013m = "invokeSuspend", m4014n = {"downStream", C1171x.f7958g}, m4015s = {"L$0", "L$1"})
    @dwf({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1\n+ 2 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n+ 3 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,407:1\n27#2:408\n28#2:414\n54#3,5:409\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1\n*L\n392#1:408\n392#1:414\n392#1:409,5\n*E\n"})
    public static final class C8703d<T> extends ugg implements kz6<x13, t66<? super T>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public long f56673a;

        /* JADX INFO: renamed from: b */
        public int f56674b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f56675c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f56676d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ long f56677e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ y56<T> f56678f;

        /* JADX INFO: renamed from: l76$d$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", m4010f = "Delay.kt", m4011i = {0}, m4012l = {395}, m4013m = "invokeSuspend", m4014n = {"$this$onSuccess_u2dWpGqRn0$iv"}, m4015s = {"L$0"})
        @dwf({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,407:1\n529#2,2:408\n562#2:410\n563#2:412\n1#3:411\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1$1$1\n*L\n394#1:408,2\n396#1:410\n396#1:412\n*E\n"})
        public static final class a extends ugg implements gz6<xu1<? extends T>, zy2<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a */
            public int f56679a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f56680b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ t66<T> f56681c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(t66<? super T> t66Var, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f56681c = t66Var;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                a aVar = new a(this.f56681c, zy2Var);
                aVar.f56680b = obj;
                return aVar;
            }

            @Override // p000.gz6
            public /* bridge */ /* synthetic */ Object invoke(Object obj, zy2<? super Boolean> zy2Var) {
                return m30817invokeWpGqRn0(((xu1) obj).m33284unboximpl(), zy2Var);
            }

            /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
            public final Object m30817invokeWpGqRn0(Object obj, zy2<? super Boolean> zy2Var) {
                return ((a) create(xu1.m33272boximpl(obj), zy2Var)).invokeSuspend(bth.f14751a);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type zy2 to l76$d$a for r4v1 'this'  zy2
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // p000.tq0
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r1 = r4.f56679a
                    r2 = 1
                    if (r1 == 0) goto L19
                    if (r1 != r2) goto L11
                    java.lang.Object r0 = r4.f56680b
                    p000.y7e.throwOnFailure(r5)
                    goto L36
                L11:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L19:
                    p000.y7e.throwOnFailure(r5)
                    java.lang.Object r5 = r4.f56680b
                    xu1 r5 = (p000.xu1) r5
                    java.lang.Object r5 = r5.m33284unboximpl()
                    t66<T> r1 = r4.f56681c
                    boolean r3 = r5 instanceof p000.xu1.C15302c
                    if (r3 != 0) goto L37
                    r4.f56680b = r5
                    r4.f56679a = r2
                    java.lang.Object r1 = r1.emit(r5, r4)
                    if (r1 != r0) goto L35
                    return r0
                L35:
                    r0 = r5
                L36:
                    r5 = r0
                L37:
                    boolean r0 = r5 instanceof p000.xu1.C15300a
                    if (r0 == 0) goto L49
                    java.lang.Throwable r5 = p000.xu1.m33276exceptionOrNullimpl(r5)
                    if (r5 != 0) goto L48
                    r5 = 0
                    java.lang.Boolean r5 = p000.wc1.boxBoolean(r5)
                    return r5
                L48:
                    throw r5
                L49:
                    java.lang.Boolean r5 = p000.wc1.boxBoolean(r2)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.l76.C8703d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: l76$d$b */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", m4010f = "Delay.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class b extends ugg implements qy6<zy2<?>, Object> {

            /* JADX INFO: renamed from: a */
            public int f56682a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ long f56683b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(long j, zy2<? super b> zy2Var) {
                super(1, zy2Var);
                this.f56683b = j;
            }

            @Override // p000.tq0
            public final zy2<bth> create(zy2<?> zy2Var) {
                return new b(this.f56683b, zy2Var);
            }

            @Override // p000.qy6
            public final Object invoke(zy2<?> zy2Var) {
                return ((b) create(zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                pd8.getCOROUTINE_SUSPENDED();
                if (this.f56682a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
                throw new x1h("Timed out waiting for " + ((Object) bt4.m28099toStringimpl(this.f56683b)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8703d(long j, y56<? extends T> y56Var, zy2<? super C8703d> zy2Var) {
            super(3, zy2Var);
            this.f56677e = j;
            this.f56678f = y56Var;
        }

        @Override // p000.kz6
        public final Object invoke(x13 x13Var, t66<? super T> t66Var, zy2<? super bth> zy2Var) {
            C8703d c8703d = new C8703d(this.f56677e, this.f56678f, zy2Var);
            c8703d.f56675c = x13Var;
            c8703d.f56676d = t66Var;
            return c8703d.invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0076 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0074 -> B:14:0x0077). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p000.tq0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r9.f56674b
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L22
                if (r1 != r2) goto L1a
                long r4 = r9.f56673a
                java.lang.Object r1 = r9.f56676d
                hsd r1 = (p000.hsd) r1
                java.lang.Object r6 = r9.f56675c
                t66 r6 = (p000.t66) r6
                p000.y7e.throwOnFailure(r10)
                goto L77
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L22:
                p000.y7e.throwOnFailure(r10)
                java.lang.Object r10 = r9.f56675c
                x13 r10 = (p000.x13) r10
                java.lang.Object r1 = r9.f56676d
                t66 r1 = (p000.t66) r1
                long r4 = r9.f56677e
                bt4$a r6 = p000.bt4.f14711b
                long r6 = r6.m28150getZEROUwyO8pc()
                int r4 = p000.bt4.m28058compareToLRDsOJo(r4, r6)
                if (r4 <= 0) goto L82
                y56<T> r4 = r9.f56678f
                r5 = 0
                r6 = 2
                y56 r4 = p000.c76.buffer$default(r4, r5, r3, r6, r3)
                hsd r10 = p000.c76.produceIn(r4, r10)
                long r4 = r9.f56677e
                r6 = r1
                r1 = r10
            L4b:
                ove r10 = new ove
                e13 r7 = r9.getContext()
                r10.<init>(r7)
                jve r7 = r1.getOnReceiveCatching()
                l76$d$a r8 = new l76$d$a
                r8.<init>(r6, r3)
                r10.invoke(r7, r8)
                l76$d$b r7 = new l76$d$b
                r7.<init>(r4, r3)
                p000.x4c.m33214onTimeout8Mi8wO0(r10, r4, r7)
                r9.f56675c = r6
                r9.f56676d = r1
                r9.f56673a = r4
                r9.f56674b = r2
                java.lang.Object r10 = r10.doSelect(r9)
                if (r10 != r0) goto L77
                return r0
            L77:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 != 0) goto L4b
                bth r10 = p000.bth.f14751a
                return r10
            L82:
                x1h r10 = new x1h
                java.lang.String r0 = "Timed out immediately"
                r10.<init>(r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.l76.C8703d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d86
    @yfb
    public static final <T> y56<T> debounce(@yfb y56<? extends T> y56Var, final long j) {
        if (j >= 0) {
            return j == 0 ? y56Var : debounceInternal$FlowKt__DelayKt(y56Var, new qy6() { // from class: k76
                @Override // p000.qy6
                public final Object invoke(Object obj) {
                    return Long.valueOf(l76.debounce$lambda$1$FlowKt__DelayKt(j, obj));
                }
            });
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long debounce$lambda$1$FlowKt__DelayKt(long j, Object obj) {
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long debounce$lambda$2$FlowKt__DelayKt(qy6 qy6Var, Object obj) {
        return p34.m31717toDelayMillisLRDsOJo(((bt4) qy6Var.invoke(obj)).m28105unboximpl());
    }

    @d86
    @yfb
    /* JADX INFO: renamed from: debounce-HG0u8IE, reason: not valid java name */
    public static final <T> y56<T> m30811debounceHG0u8IE(@yfb y56<? extends T> y56Var, long j) {
        return c76.debounce(y56Var, p34.m31717toDelayMillisLRDsOJo(j));
    }

    @d86
    @r9c
    @xn8(name = "debounceDuration")
    @yfb
    public static final <T> y56<T> debounceDuration(@yfb y56<? extends T> y56Var, @yfb final qy6<? super T, bt4> qy6Var) {
        return debounceInternal$FlowKt__DelayKt(y56Var, new qy6() { // from class: j76
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return Long.valueOf(l76.debounce$lambda$2$FlowKt__DelayKt(qy6Var, obj));
            }
        });
    }

    private static final <T> y56<T> debounceInternal$FlowKt__DelayKt(y56<? extends T> y56Var, qy6<? super T, Long> qy6Var) {
        return z66.scopedFlow(new C8700a(qy6Var, y56Var, null));
    }

    @yfb
    public static final hsd<bth> fixedPeriodTicker(@yfb x13 x13Var, long j) {
        return rdd.produce$default(x13Var, null, 0, new C8701b(j, null), 1, null);
    }

    @d86
    @yfb
    public static final <T> y56<T> sample(@yfb y56<? extends T> y56Var, long j) {
        if (j > 0) {
            return z66.scopedFlow(new C8702c(j, y56Var, null));
        }
        throw new IllegalArgumentException("Sample period should be positive");
    }

    @d86
    @yfb
    /* JADX INFO: renamed from: sample-HG0u8IE, reason: not valid java name */
    public static final <T> y56<T> m30812sampleHG0u8IE(@yfb y56<? extends T> y56Var, long j) {
        return c76.sample(y56Var, p34.m31717toDelayMillisLRDsOJo(j));
    }

    @d86
    @yfb
    /* JADX INFO: renamed from: timeout-HG0u8IE, reason: not valid java name */
    public static final <T> y56<T> m30813timeoutHG0u8IE(@yfb y56<? extends T> y56Var, long j) {
        return m30814timeoutInternalHG0u8IE$FlowKt__DelayKt(y56Var, j);
    }

    /* JADX INFO: renamed from: timeoutInternal-HG0u8IE$FlowKt__DelayKt, reason: not valid java name */
    private static final <T> y56<T> m30814timeoutInternalHG0u8IE$FlowKt__DelayKt(y56<? extends T> y56Var, long j) {
        return z66.scopedFlow(new C8703d(j, y56Var, null));
    }

    @d86
    @r9c
    @yfb
    public static final <T> y56<T> debounce(@yfb y56<? extends T> y56Var, @yfb qy6<? super T, Long> qy6Var) {
        return debounceInternal$FlowKt__DelayKt(y56Var, qy6Var);
    }
}

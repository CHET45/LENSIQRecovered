package p000;

import p000.jvd;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTapGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,376:1\n33#2,6:377\n101#2,2:383\n33#2,6:385\n103#2:391\n86#2,2:392\n33#2,6:394\n88#2:400\n86#2,2:401\n33#2,6:403\n88#2:409\n101#2,2:410\n33#2,6:412\n103#2:418\n101#2,2:419\n33#2,6:421\n103#2:427\n*S KotlinDebug\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt\n*L\n196#1:377,6\n197#1:383,2\n197#1:385,6\n197#1:391\n281#1:392,2\n281#1:394,6\n281#1:400\n306#1:401,2\n306#1:403,6\n306#1:409\n311#1:410,2\n311#1:412,6\n311#1:418\n321#1:419,2\n321#1:421,6\n321#1:427\n*E\n"})
public final class dmg {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final kz6<pad, izb, zy2<? super bth>, Object> f30075a = new C4867a(null);

    /* JADX INFO: renamed from: dmg$a */
    @ck3(m4009c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", m4010f = "TapGestureDetector.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C4867a extends ugg implements kz6<pad, izb, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f30076a;

        public C4867a(zy2<? super C4867a> zy2Var) {
            super(3, zy2Var);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ Object invoke(pad padVar, izb izbVar, zy2<? super bth> zy2Var) {
            return m28654invoked4ec7I(padVar, izbVar.m30439unboximpl(), zy2Var);
        }

        @gib
        /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m28654invoked4ec7I(@yfb pad padVar, long j, @gib zy2<? super bth> zy2Var) {
            return new C4867a(zy2Var).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f30076a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: dmg$b */
    @ck3(m4009c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m4010f = "TapGestureDetector.kt", m4011i = {0, 0, 0}, m4012l = {279}, m4013m = "awaitFirstDown", m4014n = {"$this$awaitFirstDown", "pass", "requireUnconsumed"}, m4015s = {"L$0", "L$1", "Z$0"})
    public static final class C4868b extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f30077a;

        /* JADX INFO: renamed from: b */
        public Object f30078b;

        /* JADX INFO: renamed from: c */
        public boolean f30079c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f30080d;

        /* JADX INFO: renamed from: e */
        public int f30081e;

        public C4868b(zy2<? super C4868b> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f30080d = obj;
            this.f30081e |= Integer.MIN_VALUE;
            return dmg.awaitFirstDown(null, false, null, this);
        }
    }

    /* JADX INFO: renamed from: dmg$c */
    @ck3(m4009c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", m4010f = "TapGestureDetector.kt", m4011i = {0, 0}, m4012l = {nb2.f63868p}, m4013m = "invokeSuspend", m4014n = {"$this$withTimeoutOrNull", "minUptime"}, m4015s = {"L$0", "J$0"})
    public static final class C4869c extends t7e implements gz6<gn0, zy2<? super h2d>, Object> {

        /* JADX INFO: renamed from: a */
        public long f30082a;

        /* JADX INFO: renamed from: b */
        public int f30083b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f30084c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ h2d f30085d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4869c(h2d h2dVar, zy2<? super C4869c> zy2Var) {
            super(2, zy2Var);
            this.f30085d = h2dVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C4869c c4869c = new C4869c(this.f30085d, zy2Var);
            c4869c.f30084c = obj;
            return c4869c;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb gn0 gn0Var, @gib zy2<? super h2d> zy2Var) {
            return ((C4869c) create(gn0Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0046 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0044 -> B:12:0x0047). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p000.tq0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r11.f30083b
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                long r3 = r11.f30082a
                java.lang.Object r1 = r11.f30084c
                gn0 r1 = (p000.gn0) r1
                p000.y7e.throwOnFailure(r12)
                goto L47
            L15:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1d:
                p000.y7e.throwOnFailure(r12)
                java.lang.Object r12 = r11.f30084c
                gn0 r12 = (p000.gn0) r12
                h2d r1 = r11.f30085d
                long r3 = r1.getUptimeMillis()
                u8i r1 = r12.getViewConfiguration()
                long r5 = r1.getDoubleTapMinTimeMillis()
                long r3 = r3 + r5
                r1 = r12
            L34:
                r11.f30084c = r1
                r11.f30082a = r3
                r11.f30083b = r2
                r6 = 0
                r7 = 0
                r9 = 3
                r10 = 0
                r5 = r1
                r8 = r11
                java.lang.Object r12 = p000.dmg.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L47
                return r0
            L47:
                h2d r12 = (p000.h2d) r12
                long r5 = r12.getUptimeMillis()
                int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r5 < 0) goto L34
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.dmg.C4869c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: dmg$d */
    @ck3(m4009c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m4010f = "TapGestureDetector.kt", m4011i = {0}, m4012l = {nb2.f63871s}, m4013m = "consumeUntilUp", m4014n = {"$this$consumeUntilUp"}, m4015s = {"L$0"})
    public static final class C4870d extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f30086a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f30087b;

        /* JADX INFO: renamed from: c */
        public int f30088c;

        public C4870d(zy2<? super C4870d> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f30087b = obj;
            this.f30088c |= Integer.MIN_VALUE;
            return dmg.consumeUntilUp(null, this);
        }
    }

    /* JADX INFO: renamed from: dmg$e */
    @ck3(m4009c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", m4010f = "TapGestureDetector.kt", m4011i = {}, m4012l = {nb2.f63866n}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C4871e extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f30089a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f30090b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ s2d f30091c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ kz6<pad, izb, zy2<? super bth>, Object> f30092d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ qy6<izb, bth> f30093e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ qad f30094f;

        /* JADX INFO: renamed from: dmg$e$a */
        @ck3(m4009c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", m4010f = "TapGestureDetector.kt", m4011i = {0}, m4012l = {237, 245}, m4013m = "invokeSuspend", m4014n = {"$this$awaitEachGesture"}, m4015s = {"L$0"})
        @dwf({"SMAP\nTapGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,376:1\n1#2:377\n*E\n"})
        public static final class a extends t7e implements gz6<gn0, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f30095a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f30096b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ x13 f30097c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ kz6<pad, izb, zy2<? super bth>, Object> f30098d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ qy6<izb, bth> f30099e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ qad f30100f;

            /* JADX INFO: renamed from: dmg$e$a$a, reason: collision with other inner class name */
            @ck3(m4009c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", m4010f = "TapGestureDetector.kt", m4011i = {}, m4012l = {234}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
            public static final class C16429a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: a */
                public int f30101a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ qad f30102b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16429a(qad qadVar, zy2<? super C16429a> zy2Var) {
                    super(2, zy2Var);
                    this.f30102b = qadVar;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    return new C16429a(this.f30102b, zy2Var);
                }

                @Override // p000.gz6
                @gib
                public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                    return ((C16429a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
                }

                @Override // p000.tq0
                @gib
                public final Object invokeSuspend(@yfb Object obj) {
                    Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                    int i = this.f30101a;
                    if (i == 0) {
                        y7e.throwOnFailure(obj);
                        qad qadVar = this.f30102b;
                        this.f30101a = 1;
                        if (qadVar.reset(this) == coroutine_suspended) {
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

            /* JADX INFO: renamed from: dmg$e$a$b */
            @ck3(m4009c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", m4010f = "TapGestureDetector.kt", m4011i = {}, m4012l = {241}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
            public static final class b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: a */
                public int f30103a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ kz6<pad, izb, zy2<? super bth>, Object> f30104b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ qad f30105c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ h2d f30106d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(kz6<? super pad, ? super izb, ? super zy2<? super bth>, ? extends Object> kz6Var, qad qadVar, h2d h2dVar, zy2<? super b> zy2Var) {
                    super(2, zy2Var);
                    this.f30104b = kz6Var;
                    this.f30105c = qadVar;
                    this.f30106d = h2dVar;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    return new b(this.f30104b, this.f30105c, this.f30106d, zy2Var);
                }

                @Override // p000.gz6
                @gib
                public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                    return ((b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
                }

                @Override // p000.tq0
                @gib
                public final Object invokeSuspend(@yfb Object obj) {
                    Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                    int i = this.f30103a;
                    if (i == 0) {
                        y7e.throwOnFailure(obj);
                        kz6<pad, izb, zy2<? super bth>, Object> kz6Var = this.f30104b;
                        qad qadVar = this.f30105c;
                        izb izbVarM30418boximpl = izb.m30418boximpl(this.f30106d.m29911getPositionF1C5BW0());
                        this.f30103a = 1;
                        if (kz6Var.invoke(qadVar, izbVarM30418boximpl, this) == coroutine_suspended) {
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

            /* JADX INFO: renamed from: dmg$e$a$c */
            @ck3(m4009c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", m4010f = "TapGestureDetector.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
            public static final class c extends ugg implements gz6<x13, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: a */
                public int f30107a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ qad f30108b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(qad qadVar, zy2<? super c> zy2Var) {
                    super(2, zy2Var);
                    this.f30108b = qadVar;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    return new c(this.f30108b, zy2Var);
                }

                @Override // p000.gz6
                @gib
                public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                    return ((c) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
                }

                @Override // p000.tq0
                @gib
                public final Object invokeSuspend(@yfb Object obj) {
                    pd8.getCOROUTINE_SUSPENDED();
                    if (this.f30107a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                    this.f30108b.cancel();
                    return bth.f14751a;
                }
            }

            /* JADX INFO: renamed from: dmg$e$a$d */
            @ck3(m4009c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4", m4010f = "TapGestureDetector.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
            public static final class d extends ugg implements gz6<x13, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: a */
                public int f30109a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ qad f30110b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(qad qadVar, zy2<? super d> zy2Var) {
                    super(2, zy2Var);
                    this.f30110b = qadVar;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    return new d(this.f30110b, zy2Var);
                }

                @Override // p000.gz6
                @gib
                public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                    return ((d) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
                }

                @Override // p000.tq0
                @gib
                public final Object invokeSuspend(@yfb Object obj) {
                    pd8.getCOROUTINE_SUSPENDED();
                    if (this.f30109a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                    this.f30110b.release();
                    return bth.f14751a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(x13 x13Var, kz6<? super pad, ? super izb, ? super zy2<? super bth>, ? extends Object> kz6Var, qy6<? super izb, bth> qy6Var, qad qadVar, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f30097c = x13Var;
                this.f30098d = kz6Var;
                this.f30099e = qy6Var;
                this.f30100f = qadVar;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                a aVar = new a(this.f30097c, this.f30098d, this.f30099e, this.f30100f, zy2Var);
                aVar.f30096b = obj;
                return aVar;
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb gn0 gn0Var, @gib zy2<? super bth> zy2Var) {
                return ((a) create(gn0Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
            @Override // p000.tq0
            @p000.gib
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r24) {
                /*
                    r23 = this;
                    r6 = r23
                    java.lang.Object r7 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r0 = r6.f30095a
                    r8 = 2
                    r9 = 1
                    r10 = 0
                    if (r0 == 0) goto L2a
                    if (r0 == r9) goto L1f
                    if (r0 != r8) goto L17
                    p000.y7e.throwOnFailure(r24)
                    r0 = r24
                    goto L7d
                L17:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L1f:
                    java.lang.Object r0 = r6.f30096b
                    gn0 r0 = (p000.gn0) r0
                    p000.y7e.throwOnFailure(r24)
                    r11 = r0
                    r0 = r24
                    goto L51
                L2a:
                    p000.y7e.throwOnFailure(r24)
                    java.lang.Object r0 = r6.f30096b
                    r11 = r0
                    gn0 r11 = (p000.gn0) r11
                    x13 r0 = r6.f30097c
                    dmg$e$a$a r3 = new dmg$e$a$a
                    qad r1 = r6.f30100f
                    r3.<init>(r1, r10)
                    r4 = 3
                    r5 = 0
                    r1 = 0
                    r2 = 0
                    p000.dg1.launch$default(r0, r1, r2, r3, r4, r5)
                    r6.f30096b = r11
                    r6.f30095a = r9
                    r1 = 0
                    r0 = r11
                    r3 = r23
                    java.lang.Object r0 = p000.dmg.awaitFirstDown$default(r0, r1, r2, r3, r4, r5)
                    if (r0 != r7) goto L51
                    return r7
                L51:
                    h2d r0 = (p000.h2d) r0
                    r0.consume()
                    kz6<pad, izb, zy2<? super bth>, java.lang.Object> r1 = r6.f30098d
                    kz6 r2 = p000.dmg.access$getNoPressGesture$p()
                    if (r1 == r2) goto L72
                    x13 r12 = r6.f30097c
                    dmg$e$a$b r15 = new dmg$e$a$b
                    kz6<pad, izb, zy2<? super bth>, java.lang.Object> r1 = r6.f30098d
                    qad r2 = r6.f30100f
                    r15.<init>(r1, r2, r0, r10)
                    r16 = 3
                    r17 = 0
                    r13 = 0
                    r14 = 0
                    p000.dg1.launch$default(r12, r13, r14, r15, r16, r17)
                L72:
                    r6.f30096b = r10
                    r6.f30095a = r8
                    java.lang.Object r0 = p000.dmg.waitForUpOrCancellation$default(r11, r10, r6, r9, r10)
                    if (r0 != r7) goto L7d
                    return r7
                L7d:
                    h2d r0 = (p000.h2d) r0
                    if (r0 != 0) goto L93
                    x13 r11 = r6.f30097c
                    dmg$e$a$c r14 = new dmg$e$a$c
                    qad r0 = r6.f30100f
                    r14.<init>(r0, r10)
                    r15 = 3
                    r16 = 0
                    r12 = 0
                    r13 = 0
                    p000.dg1.launch$default(r11, r12, r13, r14, r15, r16)
                    goto Lbd
                L93:
                    r0.consume()
                    x13 r1 = r6.f30097c
                    dmg$e$a$d r2 = new dmg$e$a$d
                    qad r3 = r6.f30100f
                    r2.<init>(r3, r10)
                    r21 = 3
                    r22 = 0
                    r18 = 0
                    r19 = 0
                    r17 = r1
                    r20 = r2
                    p000.dg1.launch$default(r17, r18, r19, r20, r21, r22)
                    qy6<izb, bth> r1 = r6.f30099e
                    if (r1 == 0) goto Lbd
                    long r2 = r0.m29911getPositionF1C5BW0()
                    izb r0 = p000.izb.m30418boximpl(r2)
                    r1.invoke(r0)
                Lbd:
                    bth r0 = p000.bth.f14751a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.dmg.C4871e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4871e(s2d s2dVar, kz6<? super pad, ? super izb, ? super zy2<? super bth>, ? extends Object> kz6Var, qy6<? super izb, bth> qy6Var, qad qadVar, zy2<? super C4871e> zy2Var) {
            super(2, zy2Var);
            this.f30091c = s2dVar;
            this.f30092d = kz6Var;
            this.f30093e = qy6Var;
            this.f30094f = qadVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C4871e c4871e = new C4871e(this.f30091c, this.f30092d, this.f30093e, this.f30094f, zy2Var);
            c4871e.f30090b = obj;
            return c4871e;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C4871e) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f30089a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                x13 x13Var = (x13) this.f30090b;
                s2d s2dVar = this.f30091c;
                a aVar = new a(x13Var, this.f30092d, this.f30093e, this.f30094f, null);
                this.f30089a = 1;
                if (op6.awaitEachGesture(s2dVar, aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: dmg$f */
    @ck3(m4009c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", m4010f = "TapGestureDetector.kt", m4011i = {}, m4012l = {99}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C4872f extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f30111a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f30112b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ s2d f30113c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ kz6<pad, izb, zy2<? super bth>, Object> f30114d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ qy6<izb, bth> f30115e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ qy6<izb, bth> f30116f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ qy6<izb, bth> f30117m;

        /* JADX INFO: renamed from: dmg$f$a */
        @ck3(m4009c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", m4010f = "TapGestureDetector.kt", m4011i = {0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, m4012l = {100, 114, 129, 141, 156, 178}, m4013m = "invokeSuspend", m4014n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "secondDown"}, m4015s = {"L$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "L$2"})
        public static final class a extends t7e implements gz6<gn0, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: C */
            public final /* synthetic */ kz6<pad, izb, zy2<? super bth>, Object> f30118C;

            /* JADX INFO: renamed from: F */
            public final /* synthetic */ qy6<izb, bth> f30119F;

            /* JADX INFO: renamed from: H */
            public final /* synthetic */ qy6<izb, bth> f30120H;

            /* JADX INFO: renamed from: L */
            public final /* synthetic */ qy6<izb, bth> f30121L;

            /* JADX INFO: renamed from: M */
            public final /* synthetic */ qad f30122M;

            /* JADX INFO: renamed from: a */
            public Object f30123a;

            /* JADX INFO: renamed from: b */
            public Object f30124b;

            /* JADX INFO: renamed from: c */
            public Object f30125c;

            /* JADX INFO: renamed from: d */
            public long f30126d;

            /* JADX INFO: renamed from: e */
            public int f30127e;

            /* JADX INFO: renamed from: f */
            public /* synthetic */ Object f30128f;

            /* JADX INFO: renamed from: m */
            public final /* synthetic */ x13 f30129m;

            /* JADX INFO: renamed from: dmg$f$a$a, reason: collision with other inner class name */
            @ck3(m4009c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$10", m4010f = "TapGestureDetector.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
            public static final class C16430a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: a */
                public int f30130a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ qad f30131b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16430a(qad qadVar, zy2<? super C16430a> zy2Var) {
                    super(2, zy2Var);
                    this.f30131b = qadVar;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    return new C16430a(this.f30131b, zy2Var);
                }

                @Override // p000.gz6
                @gib
                public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                    return ((C16430a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
                }

                @Override // p000.tq0
                @gib
                public final Object invokeSuspend(@yfb Object obj) {
                    pd8.getCOROUTINE_SUSPENDED();
                    if (this.f30130a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                    this.f30131b.release();
                    return bth.f14751a;
                }
            }

            /* JADX INFO: renamed from: dmg$f$a$b */
            @ck3(m4009c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", m4010f = "TapGestureDetector.kt", m4011i = {}, m4012l = {103}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
            public static final class b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: a */
                public int f30132a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ qad f30133b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(qad qadVar, zy2<? super b> zy2Var) {
                    super(2, zy2Var);
                    this.f30133b = qadVar;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    return new b(this.f30133b, zy2Var);
                }

                @Override // p000.gz6
                @gib
                public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                    return ((b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
                }

                @Override // p000.tq0
                @gib
                public final Object invokeSuspend(@yfb Object obj) {
                    Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                    int i = this.f30132a;
                    if (i == 0) {
                        y7e.throwOnFailure(obj);
                        qad qadVar = this.f30133b;
                        this.f30132a = 1;
                        if (qadVar.reset(this) == coroutine_suspended) {
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

            /* JADX INFO: renamed from: dmg$f$a$c */
            @ck3(m4009c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", m4010f = "TapGestureDetector.kt", m4011i = {}, m4012l = {106}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
            public static final class c extends ugg implements gz6<x13, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: a */
                public int f30134a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ kz6<pad, izb, zy2<? super bth>, Object> f30135b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ qad f30136c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ h2d f30137d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public c(kz6<? super pad, ? super izb, ? super zy2<? super bth>, ? extends Object> kz6Var, qad qadVar, h2d h2dVar, zy2<? super c> zy2Var) {
                    super(2, zy2Var);
                    this.f30135b = kz6Var;
                    this.f30136c = qadVar;
                    this.f30137d = h2dVar;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    return new c(this.f30135b, this.f30136c, this.f30137d, zy2Var);
                }

                @Override // p000.gz6
                @gib
                public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                    return ((c) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
                }

                @Override // p000.tq0
                @gib
                public final Object invokeSuspend(@yfb Object obj) {
                    Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                    int i = this.f30134a;
                    if (i == 0) {
                        y7e.throwOnFailure(obj);
                        kz6<pad, izb, zy2<? super bth>, Object> kz6Var = this.f30135b;
                        qad qadVar = this.f30136c;
                        izb izbVarM30418boximpl = izb.m30418boximpl(this.f30137d.m29911getPositionF1C5BW0());
                        this.f30134a = 1;
                        if (kz6Var.invoke(qadVar, izbVarM30418boximpl, this) == coroutine_suspended) {
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

            /* JADX INFO: renamed from: dmg$f$a$d */
            @ck3(m4009c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", m4010f = "TapGestureDetector.kt", m4011i = {}, m4012l = {115}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
            public static final class d extends t7e implements gz6<gn0, zy2<? super h2d>, Object> {

                /* JADX INFO: renamed from: a */
                public int f30138a;

                /* JADX INFO: renamed from: b */
                public /* synthetic */ Object f30139b;

                public d(zy2<? super d> zy2Var) {
                    super(2, zy2Var);
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    d dVar = new d(zy2Var);
                    dVar.f30139b = obj;
                    return dVar;
                }

                @Override // p000.gz6
                @gib
                public final Object invoke(@yfb gn0 gn0Var, @gib zy2<? super h2d> zy2Var) {
                    return ((d) create(gn0Var, zy2Var)).invokeSuspend(bth.f14751a);
                }

                @Override // p000.tq0
                @gib
                public final Object invokeSuspend(@yfb Object obj) {
                    Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                    int i = this.f30138a;
                    if (i == 0) {
                        y7e.throwOnFailure(obj);
                        gn0 gn0Var = (gn0) this.f30139b;
                        this.f30138a = 1;
                        obj = dmg.waitForUpOrCancellation$default(gn0Var, null, this, 1, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y7e.throwOnFailure(obj);
                    }
                    return obj;
                }
            }

            /* JADX INFO: renamed from: dmg$f$a$e */
            @ck3(m4009c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", m4010f = "TapGestureDetector.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
            public static final class e extends ugg implements gz6<x13, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: a */
                public int f30140a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ qad f30141b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(qad qadVar, zy2<? super e> zy2Var) {
                    super(2, zy2Var);
                    this.f30141b = qadVar;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    return new e(this.f30141b, zy2Var);
                }

                @Override // p000.gz6
                @gib
                public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                    return ((e) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
                }

                @Override // p000.tq0
                @gib
                public final Object invokeSuspend(@yfb Object obj) {
                    pd8.getCOROUTINE_SUSPENDED();
                    if (this.f30140a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                    this.f30141b.cancel();
                    return bth.f14751a;
                }
            }

            /* JADX INFO: renamed from: dmg$f$a$f */
            @ck3(m4009c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", m4010f = "TapGestureDetector.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
            public static final class f extends ugg implements gz6<x13, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: a */
                public int f30142a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ qad f30143b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(qad qadVar, zy2<? super f> zy2Var) {
                    super(2, zy2Var);
                    this.f30143b = qadVar;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    return new f(this.f30143b, zy2Var);
                }

                @Override // p000.gz6
                @gib
                public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                    return ((f) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
                }

                @Override // p000.tq0
                @gib
                public final Object invokeSuspend(@yfb Object obj) {
                    pd8.getCOROUTINE_SUSPENDED();
                    if (this.f30142a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                    this.f30143b.release();
                    return bth.f14751a;
                }
            }

            /* JADX INFO: renamed from: dmg$f$a$g */
            @ck3(m4009c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", m4010f = "TapGestureDetector.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
            public static final class g extends ugg implements gz6<x13, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: a */
                public int f30144a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ qad f30145b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public g(qad qadVar, zy2<? super g> zy2Var) {
                    super(2, zy2Var);
                    this.f30145b = qadVar;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    return new g(this.f30145b, zy2Var);
                }

                @Override // p000.gz6
                @gib
                public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                    return ((g) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
                }

                @Override // p000.tq0
                @gib
                public final Object invokeSuspend(@yfb Object obj) {
                    pd8.getCOROUTINE_SUSPENDED();
                    if (this.f30144a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                    this.f30145b.release();
                    return bth.f14751a;
                }
            }

            /* JADX INFO: renamed from: dmg$f$a$h */
            @ck3(m4009c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", m4010f = "TapGestureDetector.kt", m4011i = {}, m4012l = {148}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
            public static final class h extends ugg implements gz6<x13, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: a */
                public int f30146a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ qad f30147b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public h(qad qadVar, zy2<? super h> zy2Var) {
                    super(2, zy2Var);
                    this.f30147b = qadVar;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    return new h(this.f30147b, zy2Var);
                }

                @Override // p000.gz6
                @gib
                public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                    return ((h) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
                }

                @Override // p000.tq0
                @gib
                public final Object invokeSuspend(@yfb Object obj) {
                    Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                    int i = this.f30146a;
                    if (i == 0) {
                        y7e.throwOnFailure(obj);
                        qad qadVar = this.f30147b;
                        this.f30146a = 1;
                        if (qadVar.reset(this) == coroutine_suspended) {
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

            /* JADX INFO: renamed from: dmg$f$a$i */
            @ck3(m4009c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", m4010f = "TapGestureDetector.kt", m4011i = {}, m4012l = {151}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
            public static final class i extends ugg implements gz6<x13, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: a */
                public int f30148a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ kz6<pad, izb, zy2<? super bth>, Object> f30149b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ qad f30150c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ h2d f30151d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public i(kz6<? super pad, ? super izb, ? super zy2<? super bth>, ? extends Object> kz6Var, qad qadVar, h2d h2dVar, zy2<? super i> zy2Var) {
                    super(2, zy2Var);
                    this.f30149b = kz6Var;
                    this.f30150c = qadVar;
                    this.f30151d = h2dVar;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    return new i(this.f30149b, this.f30150c, this.f30151d, zy2Var);
                }

                @Override // p000.gz6
                @gib
                public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                    return ((i) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
                }

                @Override // p000.tq0
                @gib
                public final Object invokeSuspend(@yfb Object obj) {
                    Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                    int i = this.f30148a;
                    if (i == 0) {
                        y7e.throwOnFailure(obj);
                        kz6<pad, izb, zy2<? super bth>, Object> kz6Var = this.f30149b;
                        qad qadVar = this.f30150c;
                        izb izbVarM30418boximpl = izb.m30418boximpl(this.f30151d.m29911getPositionF1C5BW0());
                        this.f30148a = 1;
                        if (kz6Var.invoke(qadVar, izbVarM30418boximpl, this) == coroutine_suspended) {
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

            /* JADX INFO: renamed from: dmg$f$a$j */
            @ck3(m4009c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9", m4010f = "TapGestureDetector.kt", m4011i = {}, m4012l = {157}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
            public static final class j extends t7e implements gz6<gn0, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: a */
                public int f30152a;

                /* JADX INFO: renamed from: b */
                public /* synthetic */ Object f30153b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ x13 f30154c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ qy6<izb, bth> f30155d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ qy6<izb, bth> f30156e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ jvd.C8121h<h2d> f30157f;

                /* JADX INFO: renamed from: m */
                public final /* synthetic */ qad f30158m;

                /* JADX INFO: renamed from: dmg$f$a$j$a, reason: collision with other inner class name */
                @ck3(m4009c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$1", m4010f = "TapGestureDetector.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
                public static final class C16431a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

                    /* JADX INFO: renamed from: a */
                    public int f30159a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ qad f30160b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C16431a(qad qadVar, zy2<? super C16431a> zy2Var) {
                        super(2, zy2Var);
                        this.f30160b = qadVar;
                    }

                    @Override // p000.tq0
                    @yfb
                    public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                        return new C16431a(this.f30160b, zy2Var);
                    }

                    @Override // p000.gz6
                    @gib
                    public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                        return ((C16431a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
                    }

                    @Override // p000.tq0
                    @gib
                    public final Object invokeSuspend(@yfb Object obj) {
                        pd8.getCOROUTINE_SUSPENDED();
                        if (this.f30159a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y7e.throwOnFailure(obj);
                        this.f30160b.release();
                        return bth.f14751a;
                    }
                }

                /* JADX INFO: renamed from: dmg$f$a$j$b */
                @ck3(m4009c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$2", m4010f = "TapGestureDetector.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
                public static final class b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

                    /* JADX INFO: renamed from: a */
                    public int f30161a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ qad f30162b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(qad qadVar, zy2<? super b> zy2Var) {
                        super(2, zy2Var);
                        this.f30162b = qadVar;
                    }

                    @Override // p000.tq0
                    @yfb
                    public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                        return new b(this.f30162b, zy2Var);
                    }

                    @Override // p000.gz6
                    @gib
                    public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                        return ((b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
                    }

                    @Override // p000.tq0
                    @gib
                    public final Object invokeSuspend(@yfb Object obj) {
                        pd8.getCOROUTINE_SUSPENDED();
                        if (this.f30161a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y7e.throwOnFailure(obj);
                        this.f30162b.cancel();
                        return bth.f14751a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public j(x13 x13Var, qy6<? super izb, bth> qy6Var, qy6<? super izb, bth> qy6Var2, jvd.C8121h<h2d> c8121h, qad qadVar, zy2<? super j> zy2Var) {
                    super(2, zy2Var);
                    this.f30154c = x13Var;
                    this.f30155d = qy6Var;
                    this.f30156e = qy6Var2;
                    this.f30157f = c8121h;
                    this.f30158m = qadVar;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    j jVar = new j(this.f30154c, this.f30155d, this.f30156e, this.f30157f, this.f30158m, zy2Var);
                    jVar.f30153b = obj;
                    return jVar;
                }

                @Override // p000.gz6
                @gib
                public final Object invoke(@yfb gn0 gn0Var, @gib zy2<? super bth> zy2Var) {
                    return ((j) create(gn0Var, zy2Var)).invokeSuspend(bth.f14751a);
                }

                @Override // p000.tq0
                @gib
                public final Object invokeSuspend(@yfb Object obj) {
                    Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                    int i = this.f30152a;
                    if (i == 0) {
                        y7e.throwOnFailure(obj);
                        gn0 gn0Var = (gn0) this.f30153b;
                        this.f30152a = 1;
                        obj = dmg.waitForUpOrCancellation$default(gn0Var, null, this, 1, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y7e.throwOnFailure(obj);
                    }
                    h2d h2dVar = (h2d) obj;
                    if (h2dVar != null) {
                        h2dVar.consume();
                        fg1.launch$default(this.f30154c, null, null, new C16431a(this.f30158m, null), 3, null);
                        this.f30155d.invoke(izb.m30418boximpl(h2dVar.m29911getPositionF1C5BW0()));
                        return bth.f14751a;
                    }
                    fg1.launch$default(this.f30154c, null, null, new b(this.f30158m, null), 3, null);
                    qy6<izb, bth> qy6Var = this.f30156e;
                    if (qy6Var == null) {
                        return null;
                    }
                    qy6Var.invoke(izb.m30418boximpl(this.f30157f.f52110a.m29911getPositionF1C5BW0()));
                    return bth.f14751a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(x13 x13Var, kz6<? super pad, ? super izb, ? super zy2<? super bth>, ? extends Object> kz6Var, qy6<? super izb, bth> qy6Var, qy6<? super izb, bth> qy6Var2, qy6<? super izb, bth> qy6Var3, qad qadVar, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f30129m = x13Var;
                this.f30118C = kz6Var;
                this.f30119F = qy6Var;
                this.f30120H = qy6Var2;
                this.f30121L = qy6Var3;
                this.f30122M = qadVar;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                a aVar = new a(this.f30129m, this.f30118C, this.f30119F, this.f30120H, this.f30121L, this.f30122M, zy2Var);
                aVar.f30128f = obj;
                return aVar;
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb gn0 gn0Var, @gib zy2<? super bth> zy2Var) {
                return ((a) create(gn0Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00b0  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00c6  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00cf  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00f1 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00f2  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00fb A[Catch: w1d -> 0x010c, TryCatch #0 {w1d -> 0x010c, blocks: (B:34:0x00f5, B:36:0x00fb, B:38:0x0110), top: B:85:0x00f5 }] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0110 A[Catch: w1d -> 0x010c, TRY_LEAVE, TryCatch #0 {w1d -> 0x010c, blocks: (B:34:0x00f5, B:36:0x00fb, B:38:0x0110), top: B:85:0x00f5 }] */
            /* JADX WARN: Removed duplicated region for block: B:42:0x012a  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0148 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:49:0x015f  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x0191  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x01a6  */
            /* JADX WARN: Removed duplicated region for block: B:72:0x01f7  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x020a  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0224 A[RETURN] */
            @Override // p000.tq0
            @p000.gib
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r17) {
                /*
                    Method dump skipped, instruction units count: 586
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.dmg.C4872f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4872f(s2d s2dVar, kz6<? super pad, ? super izb, ? super zy2<? super bth>, ? extends Object> kz6Var, qy6<? super izb, bth> qy6Var, qy6<? super izb, bth> qy6Var2, qy6<? super izb, bth> qy6Var3, zy2<? super C4872f> zy2Var) {
            super(2, zy2Var);
            this.f30113c = s2dVar;
            this.f30114d = kz6Var;
            this.f30115e = qy6Var;
            this.f30116f = qy6Var2;
            this.f30117m = qy6Var3;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C4872f c4872f = new C4872f(this.f30113c, this.f30114d, this.f30115e, this.f30116f, this.f30117m, zy2Var);
            c4872f.f30112b = obj;
            return c4872f;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C4872f) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f30111a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                x13 x13Var = (x13) this.f30112b;
                qad qadVar = new qad(this.f30113c);
                s2d s2dVar = this.f30113c;
                a aVar = new a(x13Var, this.f30114d, this.f30115e, this.f30116f, this.f30117m, qadVar, null);
                this.f30111a = 1;
                if (op6.awaitEachGesture(s2dVar, aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: dmg$g */
    @ck3(m4009c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m4010f = "TapGestureDetector.kt", m4011i = {0, 0, 1, 1}, m4012l = {305, 320}, m4013m = "waitForUpOrCancellation", m4014n = {"$this$waitForUpOrCancellation", "pass", "$this$waitForUpOrCancellation", "pass"}, m4015s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class C4873g extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f30163a;

        /* JADX INFO: renamed from: b */
        public Object f30164b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f30165c;

        /* JADX INFO: renamed from: d */
        public int f30166d;

        public C4873g(zy2<? super C4873g> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f30165c = obj;
            this.f30166d |= Integer.MIN_VALUE;
            return dmg.waitForUpOrCancellation(null, null, this);
        }
    }

    @q64(level = u64.f86867c, message = "Maintained for binary compatibility. Use version with PointerEventPass instead.")
    public static final /* synthetic */ Object awaitFirstDown(gn0 gn0Var, boolean z, zy2 zy2Var) {
        return awaitFirstDown(gn0Var, z, v1d.Main, zy2Var);
    }

    public static /* synthetic */ Object awaitFirstDown$default(gn0 gn0Var, boolean z, zy2 zy2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return awaitFirstDown(gn0Var, z, zy2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object awaitSecondDown(gn0 gn0Var, h2d h2dVar, zy2<? super h2d> zy2Var) {
        return gn0Var.withTimeoutOrNull(gn0Var.getViewConfiguration().getDoubleTapTimeoutMillis(), new C4869c(h2dVar, null), zy2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[LOOP:0: B:19:0x0050->B:20:0x0052, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object consumeUntilUp(p000.gn0 r8, p000.zy2<? super p000.bth> r9) {
        /*
            boolean r0 = r9 instanceof p000.dmg.C4870d
            if (r0 == 0) goto L13
            r0 = r9
            dmg$d r0 = (p000.dmg.C4870d) r0
            int r1 = r0.f30088c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30088c = r1
            goto L18
        L13:
            dmg$d r0 = new dmg$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f30087b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f30088c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f30086a
            gn0 r8 = (p000.gn0) r8
            p000.y7e.throwOnFailure(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            p000.y7e.throwOnFailure(r9)
        L38:
            r0.f30086a = r8
            r0.f30088c = r3
            r9 = 0
            java.lang.Object r9 = p000.gn0.awaitPointerEvent$default(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            t1d r9 = (p000.t1d) r9
            java.util.List r2 = r9.getChanges()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L50:
            if (r6 >= r4) goto L5e
            java.lang.Object r7 = r2.get(r6)
            h2d r7 = (p000.h2d) r7
            r7.consume()
            int r6 = r6 + 1
            goto L50
        L5e:
            java.util.List r9 = r9.getChanges()
            int r2 = r9.size()
        L66:
            if (r5 >= r2) goto L78
            java.lang.Object r4 = r9.get(r5)
            h2d r4 = (p000.h2d) r4
            boolean r4 = r4.getPressed()
            if (r4 == 0) goto L75
            goto L38
        L75:
            int r5 = r5 + 1
            goto L66
        L78:
            bth r8 = p000.bth.f14751a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dmg.consumeUntilUp(gn0, zy2):java.lang.Object");
    }

    @gib
    public static final Object detectTapAndPress(@yfb s2d s2dVar, @yfb kz6<? super pad, ? super izb, ? super zy2<? super bth>, ? extends Object> kz6Var, @gib qy6<? super izb, bth> qy6Var, @yfb zy2<? super bth> zy2Var) {
        Object objCoroutineScope = y13.coroutineScope(new C4871e(s2dVar, kz6Var, qy6Var, new qad(s2dVar), null), zy2Var);
        return objCoroutineScope == pd8.getCOROUTINE_SUSPENDED() ? objCoroutineScope : bth.f14751a;
    }

    public static /* synthetic */ Object detectTapAndPress$default(s2d s2dVar, kz6 kz6Var, qy6 qy6Var, zy2 zy2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            kz6Var = f30075a;
        }
        if ((i & 2) != 0) {
            qy6Var = null;
        }
        return detectTapAndPress(s2dVar, kz6Var, qy6Var, zy2Var);
    }

    @gib
    public static final Object detectTapGestures(@yfb s2d s2dVar, @gib qy6<? super izb, bth> qy6Var, @gib qy6<? super izb, bth> qy6Var2, @yfb kz6<? super pad, ? super izb, ? super zy2<? super bth>, ? extends Object> kz6Var, @gib qy6<? super izb, bth> qy6Var3, @yfb zy2<? super bth> zy2Var) {
        Object objCoroutineScope = y13.coroutineScope(new C4872f(s2dVar, kz6Var, qy6Var2, qy6Var, qy6Var3, null), zy2Var);
        return objCoroutineScope == pd8.getCOROUTINE_SUSPENDED() ? objCoroutineScope : bth.f14751a;
    }

    public static /* synthetic */ Object detectTapGestures$default(s2d s2dVar, qy6 qy6Var, qy6 qy6Var2, kz6 kz6Var, qy6 qy6Var3, zy2 zy2Var, int i, Object obj) {
        qy6 qy6Var4 = (i & 1) != 0 ? null : qy6Var;
        qy6 qy6Var5 = (i & 2) != 0 ? null : qy6Var2;
        if ((i & 4) != 0) {
            kz6Var = f30075a;
        }
        return detectTapGestures(s2dVar, qy6Var4, qy6Var5, kz6Var, (i & 8) != 0 ? null : qy6Var3, zy2Var);
    }

    public static /* synthetic */ Object waitForUpOrCancellation$default(gn0 gn0Var, v1d v1dVar, zy2 zy2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            v1dVar = v1d.Main;
        }
        return waitForUpOrCancellation(gn0Var, v1dVar, zy2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:18:0x0051). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object awaitFirstDown(@p000.yfb p000.gn0 r9, boolean r10, @p000.yfb p000.v1d r11, @p000.yfb p000.zy2<? super p000.h2d> r12) {
        /*
            boolean r0 = r12 instanceof p000.dmg.C4868b
            if (r0 == 0) goto L13
            r0 = r12
            dmg$b r0 = (p000.dmg.C4868b) r0
            int r1 = r0.f30081e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30081e = r1
            goto L18
        L13:
            dmg$b r0 = new dmg$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f30080d
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f30081e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r9 = r0.f30079c
            java.lang.Object r10 = r0.f30078b
            v1d r10 = (p000.v1d) r10
            java.lang.Object r11 = r0.f30077a
            gn0 r11 = (p000.gn0) r11
            p000.y7e.throwOnFailure(r12)
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
            goto L51
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            p000.y7e.throwOnFailure(r12)
        L42:
            r0.f30077a = r9
            r0.f30078b = r11
            r0.f30079c = r10
            r0.f30081e = r3
            java.lang.Object r12 = r9.awaitPointerEvent(r11, r0)
            if (r12 != r1) goto L51
            return r1
        L51:
            t1d r12 = (p000.t1d) r12
            java.util.List r2 = r12.getChanges()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L5d:
            if (r6 >= r4) goto L77
            java.lang.Object r7 = r2.get(r6)
            h2d r7 = (p000.h2d) r7
            if (r10 == 0) goto L6c
            boolean r7 = p000.u1d.changedToDown(r7)
            goto L70
        L6c:
            boolean r7 = p000.u1d.changedToDownIgnoreConsumed(r7)
        L70:
            if (r7 != 0) goto L74
            r2 = r5
            goto L78
        L74:
            int r6 = r6 + 1
            goto L5d
        L77:
            r2 = r3
        L78:
            if (r2 == 0) goto L42
            java.util.List r9 = r12.getChanges()
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dmg.awaitFirstDown(gn0, boolean, v1d, zy2):java.lang.Object");
    }

    public static /* synthetic */ Object awaitFirstDown$default(gn0 gn0Var, boolean z, v1d v1dVar, zy2 zy2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            v1dVar = v1d.Main;
        }
        return awaitFirstDown(gn0Var, z, v1dVar, zy2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b3, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c0 -> B:13:0x0037). Please report as a decompilation issue!!! */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object waitForUpOrCancellation(@p000.yfb p000.gn0 r18, @p000.yfb p000.v1d r19, @p000.yfb p000.zy2<? super p000.h2d> r20) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dmg.waitForUpOrCancellation(gn0, v1d, zy2):java.lang.Object");
    }
}

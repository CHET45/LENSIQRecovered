package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nTickerChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TickerChannels.kt\nkotlinx/coroutines/channels/TickerChannelsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n1#2:109\n*E\n"})
public final class rzg {

    /* JADX INFO: renamed from: rzg$a */
    @ck3(m4009c = "kotlinx.coroutines.channels.TickerChannelsKt", m4010f = "TickerChannels.kt", m4011i = {0, 0, 1, 1, 2, 2}, m4012l = {102, 104, 105}, m4013m = "fixedDelayTicker", m4014n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, m4015s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
    public static final class C12377a extends cz2 {

        /* JADX INFO: renamed from: a */
        public long f80220a;

        /* JADX INFO: renamed from: b */
        public Object f80221b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f80222c;

        /* JADX INFO: renamed from: d */
        public int f80223d;

        public C12377a(zy2<? super C12377a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f80222c = obj;
            this.f80223d |= Integer.MIN_VALUE;
            return rzg.fixedDelayTicker(0L, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: rzg$b */
    @ck3(m4009c = "kotlinx.coroutines.channels.TickerChannelsKt", m4010f = "TickerChannels.kt", m4011i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, m4012l = {80, 84, 90, 92}, m4013m = "fixedPeriodTicker", m4014n = {"channel", "delayMillis", "deadline", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs"}, m4015s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"})
    public static final class C12378b extends cz2 {

        /* JADX INFO: renamed from: a */
        public long f80224a;

        /* JADX INFO: renamed from: b */
        public long f80225b;

        /* JADX INFO: renamed from: c */
        public Object f80226c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f80227d;

        /* JADX INFO: renamed from: e */
        public int f80228e;

        public C12378b(zy2<? super C12378b> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f80227d = obj;
            this.f80228e |= Integer.MIN_VALUE;
            return rzg.fixedPeriodTicker(0L, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: rzg$c */
    @ck3(m4009c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", m4010f = "TickerChannels.kt", m4011i = {}, m4012l = {68, 69}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C12379c extends ugg implements gz6<vdd<? super bth>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f80229a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f80230b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ szg f80231c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ long f80232d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ long f80233e;

        /* JADX INFO: renamed from: rzg$c$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f80234a;

            static {
                int[] iArr = new int[szg.values().length];
                try {
                    iArr[szg.f83282a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[szg.f83283b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f80234a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12379c(szg szgVar, long j, long j2, zy2<? super C12379c> zy2Var) {
            super(2, zy2Var);
            this.f80231c = szgVar;
            this.f80232d = j;
            this.f80233e = j2;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C12379c c12379c = new C12379c(this.f80231c, this.f80232d, this.f80233e, zy2Var);
            c12379c.f80230b = obj;
            return c12379c;
        }

        @Override // p000.gz6
        public final Object invoke(vdd<? super bth> vddVar, zy2<? super bth> zy2Var) {
            return ((C12379c) create(vddVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f80229a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                vdd vddVar = (vdd) this.f80230b;
                int i2 = a.f80234a[this.f80231c.ordinal()];
                if (i2 == 1) {
                    long j = this.f80232d;
                    long j2 = this.f80233e;
                    nye channel = vddVar.getChannel();
                    this.f80229a = 1;
                    if (rzg.fixedPeriodTicker(j, j2, channel, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 2) {
                        throw new ceb();
                    }
                    long j3 = this.f80232d;
                    long j4 = this.f80233e;
                    nye channel2 = vddVar.getChannel();
                    this.f80229a = 2;
                    if (rzg.fixedDelayTicker(j3, j4, channel2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007d -> B:14:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object fixedDelayTicker(long r6, long r8, p000.nye<? super p000.bth> r10, p000.zy2<? super p000.bth> r11) {
        /*
            boolean r0 = r11 instanceof p000.rzg.C12377a
            if (r0 == 0) goto L13
            r0 = r11
            rzg$a r0 = (p000.rzg.C12377a) r0
            int r1 = r0.f80223d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f80223d = r1
            goto L18
        L13:
            rzg$a r0 = new rzg$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f80222c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f80223d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L48
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            long r6 = r0.f80220a
            java.lang.Object r8 = r0.f80221b
            nye r8 = (p000.nye) r8
            p000.y7e.throwOnFailure(r11)
        L34:
            r10 = r8
            goto L63
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            long r6 = r0.f80220a
            java.lang.Object r8 = r0.f80221b
            nye r8 = (p000.nye) r8
            p000.y7e.throwOnFailure(r11)
            goto L73
        L48:
            long r6 = r0.f80220a
            java.lang.Object r8 = r0.f80221b
            r10 = r8
            nye r10 = (p000.nye) r10
            p000.y7e.throwOnFailure(r11)
            goto L63
        L53:
            p000.y7e.throwOnFailure(r11)
            r0.f80221b = r10
            r0.f80220a = r6
            r0.f80223d = r5
            java.lang.Object r8 = p000.p34.delay(r8, r0)
            if (r8 != r1) goto L63
            return r1
        L63:
            bth r8 = p000.bth.f14751a
            r0.f80221b = r10
            r0.f80220a = r6
            r0.f80223d = r4
            java.lang.Object r8 = r10.send(r8, r0)
            if (r8 != r1) goto L72
            return r1
        L72:
            r8 = r10
        L73:
            r0.f80221b = r8
            r0.f80220a = r6
            r0.f80223d = r3
            java.lang.Object r9 = p000.p34.delay(r6, r0)
            if (r9 != r1) goto L34
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rzg.fixedDelayTicker(long, long, nye, zy2):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fc -> B:31:0x00aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0112 -> B:15:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object fixedPeriodTicker(long r18, long r20, p000.nye<? super p000.bth> r22, p000.zy2<? super p000.bth> r23) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rzg.fixedPeriodTicker(long, long, nye, zy2):java.lang.Object");
    }

    @yfb
    @xxb
    public static final hsd<bth> ticker(long j, long j2, @yfb e13 e13Var, @yfb szg szgVar) {
        if (j < 0) {
            throw new IllegalArgumentException(("Expected non-negative delay, but has " + j + " ms").toString());
        }
        if (j2 >= 0) {
            return rdd.produce(q77.f73410a, df4.getUnconfined().plus(e13Var), 0, new C12379c(szgVar, j, j2, null));
        }
        throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j2 + " ms").toString());
    }

    public static /* synthetic */ hsd ticker$default(long j, long j2, e13 e13Var, szg szgVar, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = j;
        }
        if ((i & 4) != 0) {
            e13Var = a05.f2a;
        }
        if ((i & 8) != 0) {
            szgVar = szg.f83282a;
        }
        return ticker(j, j2, e13Var, szgVar);
    }
}

package p000;

import p000.do6;
import p000.qnh;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/FontFamilyResolverImpl\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,256:1\n151#2,3:257\n33#2,4:260\n154#2,2:264\n38#2:266\n156#2:267\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/FontFamilyResolverImpl\n*L\n47#1:257,3\n47#1:260,4\n47#1:264,2\n47#1:266\n47#1:267\n*E\n"})
@e0g(parameters = 0)
public final class fo6 implements do6.InterfaceC4891b {

    /* JADX INFO: renamed from: g */
    public static final int f37219g = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final ywc f37220a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final pxc f37221b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final pnh f37222c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final mo6 f37223d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final xwc f37224e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final qy6<onh, Object> f37225f;

    /* JADX INFO: renamed from: fo6$a */
    public static final class C5900a extends tt8 implements qy6<onh, Object> {
        public C5900a() {
            super(1);
        }

        @Override // p000.qy6
        @yfb
        public final Object invoke(@yfb onh onhVar) {
            return fo6.this.resolve(onh.m31510copye1PVR60$default(onhVar, null, null, 0, 0, null, 30, null)).getValue();
        }
    }

    /* JADX INFO: renamed from: fo6$b */
    @ck3(m4009c = "androidx.compose.ui.text.font.FontFamilyResolverImpl", m4010f = "FontFamilyResolver.kt", m4011i = {0, 0}, m4012l = {45}, m4013m = "preload", m4014n = {"this", "fontFamily"}, m4015s = {"L$0", "L$1"})
    public static final class C5901b extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f37227a;

        /* JADX INFO: renamed from: b */
        public Object f37228b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f37229c;

        /* JADX INFO: renamed from: e */
        public int f37231e;

        public C5901b(zy2<? super C5901b> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f37229c = obj;
            this.f37231e |= Integer.MIN_VALUE;
            return fo6.this.preload(null, this);
        }
    }

    /* JADX INFO: renamed from: fo6$c */
    public static final class C5902c extends tt8 implements qy6<onh, qnh> {

        /* JADX INFO: renamed from: fo6$c$a */
        public static final class a extends tt8 implements qy6<qnh.C11571b, bth> {

            /* JADX INFO: renamed from: a */
            public static final a f37233a = new a();

            public a() {
                super(1);
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(qnh.C11571b c11571b) {
                invoke2(c11571b);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb qnh.C11571b c11571b) {
            }
        }

        /* JADX INFO: renamed from: fo6$c$b */
        public static final class b extends tt8 implements qy6<qnh.C11571b, bth> {

            /* JADX INFO: renamed from: a */
            public static final b f37234a = new b();

            public b() {
                super(1);
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(qnh.C11571b c11571b) {
                invoke2(c11571b);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb qnh.C11571b c11571b) {
            }
        }

        public C5902c() {
            super(1);
        }

        @Override // p000.qy6
        @yfb
        public final qnh invoke(@yfb onh onhVar) {
            qnh qnhVarResolve = fo6.this.f37223d.resolve(onhVar, fo6.this.getPlatformFontLoader$ui_text_release(), a.f37233a, fo6.this.f37225f);
            if (qnhVarResolve == null && (qnhVarResolve = fo6.this.f37224e.resolve(onhVar, fo6.this.getPlatformFontLoader$ui_text_release(), b.f37234a, fo6.this.f37225f)) == null) {
                throw new IllegalStateException("Could not load font");
            }
            return qnhVarResolve;
        }
    }

    /* JADX INFO: renamed from: fo6$d */
    public static final class C5903d extends tt8 implements qy6<qy6<? super qnh, ? extends bth>, qnh> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ onh f37236b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5903d(onh onhVar) {
            super(1);
            this.f37236b = onhVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ qnh invoke(qy6<? super qnh, ? extends bth> qy6Var) {
            return invoke2((qy6<? super qnh, bth>) qy6Var);
        }

        @yfb
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final qnh invoke2(@yfb qy6<? super qnh, bth> qy6Var) {
            qnh qnhVarResolve = fo6.this.f37223d.resolve(this.f37236b, fo6.this.getPlatformFontLoader$ui_text_release(), qy6Var, fo6.this.f37225f);
            if (qnhVarResolve == null && (qnhVarResolve = fo6.this.f37224e.resolve(this.f37236b, fo6.this.getPlatformFontLoader$ui_text_release(), qy6Var, fo6.this.f37225f)) == null) {
                throw new IllegalStateException("Could not load font");
            }
            return qnhVarResolve;
        }
    }

    public fo6(@yfb ywc ywcVar, @yfb pxc pxcVar, @yfb pnh pnhVar, @yfb mo6 mo6Var, @yfb xwc xwcVar) {
        this.f37220a = ywcVar;
        this.f37221b = pxcVar;
        this.f37222c = pnhVar;
        this.f37223d = mo6Var;
        this.f37224e = xwcVar;
        this.f37225f = new C5900a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i2g<Object> resolve(onh onhVar) {
        return this.f37222c.runCached(onhVar, new C5903d(onhVar));
    }

    @yfb
    public final ywc getPlatformFontLoader$ui_text_release() {
        return this.f37220a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.do6.InterfaceC4891b
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object preload(@p000.yfb p000.do6 r14, @p000.yfb p000.zy2<? super p000.bth> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof p000.fo6.C5901b
            if (r0 == 0) goto L13
            r0 = r15
            fo6$b r0 = (p000.fo6.C5901b) r0
            int r1 = r0.f37231e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37231e = r1
            goto L18
        L13:
            fo6$b r0 = new fo6$b
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f37229c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f37231e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r14 = r0.f37228b
            do6 r14 = (p000.do6) r14
            java.lang.Object r0 = r0.f37227a
            fo6 r0 = (p000.fo6) r0
            p000.y7e.throwOnFailure(r15)
            goto L55
        L31:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L39:
            p000.y7e.throwOnFailure(r15)
            boolean r15 = r14 instanceof p000.lo6
            if (r15 != 0) goto L43
            bth r14 = p000.bth.f14751a
            return r14
        L43:
            mo6 r15 = r13.f37223d
            ywc r2 = r13.f37220a
            r0.f37227a = r13
            r0.f37228b = r14
            r0.f37231e = r3
            java.lang.Object r15 = r15.preload(r14, r2, r0)
            if (r15 != r1) goto L54
            return r1
        L54:
            r0 = r13
        L55:
            r15 = r14
            lo6 r15 = (p000.lo6) r15
            java.util.List r15 = r15.getFonts()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r15.size()
            r1.<init>(r2)
            int r2 = r15.size()
            r3 = 0
        L6a:
            if (r3 >= r2) goto La5
            java.lang.Object r4 = r15.get(r3)
            xn6 r4 = (p000.xn6) r4
            onh r12 = new onh
            pxc r5 = r0.f37221b
            do6 r6 = r5.interceptFontFamily(r14)
            pxc r5 = r0.f37221b
            jp6 r7 = r4.getWeight()
            jp6 r7 = r5.interceptFontWeight(r7)
            pxc r5 = r0.f37221b
            int r4 = r4.mo30175getStyle_LCdwA()
            int r8 = r5.m31883interceptFontStyleT2F_aPo(r4)
            gp6$a r4 = p000.gp6.f40694b
            int r9 = r4.m29849getAllGVVA2EU()
            ywc r4 = r0.f37220a
            java.lang.Object r10 = r4.getCacheKey()
            r11 = 0
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r1.add(r12)
            int r3 = r3 + 1
            goto L6a
        La5:
            pnh r14 = r0.f37222c
            fo6$c r15 = new fo6$c
            r15.<init>()
            r14.preWarmCache(r1, r15)
            bth r14 = p000.bth.f14751a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.fo6.preload(do6, zy2):java.lang.Object");
    }

    @Override // p000.do6.InterfaceC4891b
    @yfb
    /* JADX INFO: renamed from: resolve-DPcqOEQ */
    public i2g<Object> mo28659resolveDPcqOEQ(@gib do6 do6Var, @yfb jp6 jp6Var, int i, int i2) {
        return resolve(new onh(this.f37221b.interceptFontFamily(do6Var), this.f37221b.interceptFontWeight(jp6Var), this.f37221b.m31883interceptFontStyleT2F_aPo(i), this.f37221b.m31884interceptFontSynthesisMscr08Y(i2), this.f37220a.getCacheKey(), null));
    }

    public /* synthetic */ fo6(ywc ywcVar, pxc pxcVar, pnh pnhVar, mo6 mo6Var, xwc xwcVar, int i, jt3 jt3Var) {
        this(ywcVar, (i & 2) != 0 ? pxc.f72462a.getDefault$ui_text_release() : pxcVar, (i & 4) != 0 ? go6.getGlobalTypefaceRequestCache() : pnhVar, (i & 8) != 0 ? new mo6(go6.getGlobalAsyncTypefaceCache(), null, 2, 0 == true ? 1 : 0) : mo6Var, (i & 16) != 0 ? new xwc() : xwcVar);
    }
}

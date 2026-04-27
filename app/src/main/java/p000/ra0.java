package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,432:1\n26#2:433\n26#2:434\n26#2:435\n26#2:436\n26#2:437\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n*L\n369#1:433\n380#1:434\n392#1:435\n399#1:436\n420#1:437\n*E\n"})
@e0g(parameters = 0)
public final class ra0 {

    /* JADX INFO: renamed from: e */
    public static final int f77504e = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final Object f77505a = C11961a.m32095constructorimpl(null);

    /* JADX INFO: renamed from: b */
    @yfb
    public final np9<C11962b, C11961a> f77506b = new np9<>(16);

    /* JADX INFO: renamed from: c */
    @yfb
    public final rcf<C11962b, C11961a> f77507c = new rcf<>(0, 1, null);

    /* JADX INFO: renamed from: d */
    @yfb
    public final cig f77508d = whg.createSynchronizedObject();

    /* JADX INFO: renamed from: ra0$a */
    @vn8
    public static final class C11961a {

        /* JADX INFO: renamed from: a */
        @gib
        public final Object f77509a;

        private /* synthetic */ C11961a(Object obj) {
            this.f77509a = obj;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ C11961a m32094boximpl(Object obj) {
            return new C11961a(obj);
        }

        @yfb
        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static Object m32095constructorimpl(@gib Object obj) {
            return obj;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m32096equalsimpl(Object obj, Object obj2) {
            return (obj2 instanceof C11961a) && md8.areEqual(obj, ((C11961a) obj2).m32101unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m32097equalsimpl0(Object obj, Object obj2) {
            return md8.areEqual(obj, obj2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m32098hashCodeimpl(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        /* JADX INFO: renamed from: isPermanentFailure-impl, reason: not valid java name */
        public static final boolean m32099isPermanentFailureimpl(Object obj) {
            return obj == null;
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m32100toStringimpl(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        public boolean equals(Object obj) {
            return m32096equalsimpl(this.f77509a, obj);
        }

        @gib
        public final Object getResult() {
            return this.f77509a;
        }

        public int hashCode() {
            return m32098hashCodeimpl(this.f77509a);
        }

        public String toString() {
            return m32100toStringimpl(this.f77509a);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ Object m32101unboximpl() {
            return this.f77509a;
        }
    }

    /* JADX INFO: renamed from: ra0$b */
    @e0g(parameters = 0)
    public static final class C11962b {

        /* JADX INFO: renamed from: c */
        public static final int f77510c = 8;

        /* JADX INFO: renamed from: a */
        @yfb
        public final xn6 f77511a;

        /* JADX INFO: renamed from: b */
        @gib
        public final Object f77512b;

        public C11962b(@yfb xn6 xn6Var, @gib Object obj) {
            this.f77511a = xn6Var;
            this.f77512b = obj;
        }

        public static /* synthetic */ C11962b copy$default(C11962b c11962b, xn6 xn6Var, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                xn6Var = c11962b.f77511a;
            }
            if ((i & 2) != 0) {
                obj = c11962b.f77512b;
            }
            return c11962b.copy(xn6Var, obj);
        }

        @yfb
        public final xn6 component1() {
            return this.f77511a;
        }

        @gib
        public final Object component2() {
            return this.f77512b;
        }

        @yfb
        public final C11962b copy(@yfb xn6 xn6Var, @gib Object obj) {
            return new C11962b(xn6Var, obj);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11962b)) {
                return false;
            }
            C11962b c11962b = (C11962b) obj;
            return md8.areEqual(this.f77511a, c11962b.f77511a) && md8.areEqual(this.f77512b, c11962b.f77512b);
        }

        @yfb
        public final xn6 getFont() {
            return this.f77511a;
        }

        @gib
        public final Object getLoaderKey() {
            return this.f77512b;
        }

        public int hashCode() {
            int iHashCode = this.f77511a.hashCode() * 31;
            Object obj = this.f77512b;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        @yfb
        public String toString() {
            return "Key(font=" + this.f77511a + ", loaderKey=" + this.f77512b + ')';
        }
    }

    /* JADX INFO: renamed from: ra0$c */
    @ck3(m4009c = "androidx.compose.ui.text.font.AsyncTypefaceCache", m4010f = "FontListFontFamilyTypefaceAdapter.kt", m4011i = {0, 0, 0}, m4012l = {398}, m4013m = "runCached", m4014n = {"this", "key", "forever"}, m4015s = {"L$0", "L$1", "Z$0"})
    public static final class C11963c extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f77513a;

        /* JADX INFO: renamed from: b */
        public Object f77514b;

        /* JADX INFO: renamed from: c */
        public boolean f77515c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f77516d;

        /* JADX INFO: renamed from: f */
        public int f77518f;

        public C11963c(zy2<? super C11963c> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f77516d = obj;
            this.f77518f |= Integer.MIN_VALUE;
            return ra0.this.runCached(null, null, false, null, this);
        }
    }

    public static /* synthetic */ void put$default(ra0 ra0Var, xn6 xn6Var, ywc ywcVar, Object obj, boolean z, int i, Object obj2) {
        if ((i & 8) != 0) {
            z = false;
        }
        ra0Var.put(xn6Var, ywcVar, obj, z);
    }

    @gib
    /* JADX INFO: renamed from: get-1ASDuI8, reason: not valid java name */
    public final C11961a m32093get1ASDuI8(@yfb xn6 xn6Var, @yfb ywc ywcVar) {
        C11961a c11961a;
        C11962b c11962b = new C11962b(xn6Var, ywcVar.getCacheKey());
        synchronized (this.f77508d) {
            c11961a = this.f77506b.get(c11962b);
            if (c11961a == null) {
                c11961a = this.f77507c.get(c11962b);
            }
        }
        return c11961a;
    }

    public final void put(@yfb xn6 xn6Var, @yfb ywc ywcVar, @gib Object obj, boolean z) {
        C11962b c11962b = new C11962b(xn6Var, ywcVar.getCacheKey());
        synchronized (this.f77508d) {
            try {
                if (obj == null) {
                    this.f77507c.put(c11962b, C11961a.m32094boximpl(this.f77505a));
                } else if (z) {
                    this.f77507c.put(c11962b, C11961a.m32094boximpl(C11961a.m32095constructorimpl(obj)));
                } else {
                    this.f77506b.put(c11962b, C11961a.m32094boximpl(C11961a.m32095constructorimpl(obj)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object runCached(@p000.yfb p000.xn6 r6, @p000.yfb p000.ywc r7, boolean r8, @p000.yfb p000.qy6<? super p000.zy2<java.lang.Object>, ? extends java.lang.Object> r9, @p000.yfb p000.zy2<java.lang.Object> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof p000.ra0.C11963c
            if (r0 == 0) goto L13
            r0 = r10
            ra0$c r0 = (p000.ra0.C11963c) r0
            int r1 = r0.f77518f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f77518f = r1
            goto L18
        L13:
            ra0$c r0 = new ra0$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f77516d
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f77518f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            boolean r8 = r0.f77515c
            java.lang.Object r6 = r0.f77514b
            ra0$b r6 = (p000.ra0.C11962b) r6
            java.lang.Object r7 = r0.f77513a
            ra0 r7 = (p000.ra0) r7
            p000.y7e.throwOnFailure(r10)
            goto L7d
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            p000.y7e.throwOnFailure(r10)
            ra0$b r10 = new ra0$b
            java.lang.Object r7 = r7.getCacheKey()
            r10.<init>(r6, r7)
            cig r6 = r5.f77508d
            monitor-enter(r6)
            np9<ra0$b, ra0$a> r7 = r5.f77506b     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r7 = r7.get(r10)     // Catch: java.lang.Throwable -> L5d
            ra0$a r7 = (p000.ra0.C11961a) r7     // Catch: java.lang.Throwable -> L5d
            if (r7 != 0) goto L5f
            rcf<ra0$b, ra0$a> r7 = r5.f77507c     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r7 = r7.get(r10)     // Catch: java.lang.Throwable -> L5d
            ra0$a r7 = (p000.ra0.C11961a) r7     // Catch: java.lang.Throwable -> L5d
            goto L5f
        L5d:
            r7 = move-exception
            goto Lb3
        L5f:
            if (r7 == 0) goto L67
            java.lang.Object r7 = r7.m32101unboximpl()     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r6)
            return r7
        L67:
            bth r7 = p000.bth.f14751a     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r6)
            r0.f77513a = r5
            r0.f77514b = r10
            r0.f77515c = r8
            r0.f77518f = r3
            java.lang.Object r6 = r9.invoke(r0)
            if (r6 != r1) goto L79
            return r1
        L79:
            r7 = r5
            r4 = r10
            r10 = r6
            r6 = r4
        L7d:
            cig r9 = r7.f77508d
            monitor-enter(r9)
            if (r10 != 0) goto L90
            rcf<ra0$b, ra0$a> r8 = r7.f77507c     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r7 = r7.f77505a     // Catch: java.lang.Throwable -> L8e
            ra0$a r7 = p000.ra0.C11961a.m32094boximpl(r7)     // Catch: java.lang.Throwable -> L8e
            r8.put(r6, r7)     // Catch: java.lang.Throwable -> L8e
            goto Lad
        L8e:
            r6 = move-exception
            goto Lb1
        L90:
            if (r8 == 0) goto La0
            rcf<ra0$b, ra0$a> r7 = r7.f77507c     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r8 = p000.ra0.C11961a.m32095constructorimpl(r10)     // Catch: java.lang.Throwable -> L8e
            ra0$a r8 = p000.ra0.C11961a.m32094boximpl(r8)     // Catch: java.lang.Throwable -> L8e
            r7.put(r6, r8)     // Catch: java.lang.Throwable -> L8e
            goto Lad
        La0:
            np9<ra0$b, ra0$a> r7 = r7.f77506b     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r8 = p000.ra0.C11961a.m32095constructorimpl(r10)     // Catch: java.lang.Throwable -> L8e
            ra0$a r8 = p000.ra0.C11961a.m32094boximpl(r8)     // Catch: java.lang.Throwable -> L8e
            r7.put(r6, r8)     // Catch: java.lang.Throwable -> L8e
        Lad:
            bth r6 = p000.bth.f14751a     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r9)
            return r10
        Lb1:
            monitor-exit(r9)
            throw r6
        Lb3:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ra0.runCached(xn6, ywc, boolean, qy6, zy2):java.lang.Object");
    }

    @gib
    public final Object runCachedBlocking(@yfb xn6 xn6Var, @yfb ywc ywcVar, @yfb ny6<? extends Object> ny6Var) {
        synchronized (this.f77508d) {
            try {
                C11962b c11962b = new C11962b(xn6Var, ywcVar.getCacheKey());
                C11961a c11961a = (C11961a) this.f77506b.get(c11962b);
                if (c11961a == null) {
                    c11961a = (C11961a) this.f77507c.get(c11962b);
                }
                if (c11961a != null) {
                    Object objM32101unboximpl = c11961a.m32101unboximpl();
                    o28.finallyStart(2);
                    o28.finallyEnd(2);
                    return objM32101unboximpl;
                }
                bth bthVar = bth.f14751a;
                o28.finallyStart(1);
                o28.finallyEnd(1);
                Object objInvoke = ny6Var.invoke();
                put$default(this, xn6Var, ywcVar, objInvoke, false, 8, null);
                return objInvoke;
            } catch (Throwable th) {
                o28.finallyStart(1);
                o28.finallyEnd(1);
                throw th;
            }
        }
    }
}

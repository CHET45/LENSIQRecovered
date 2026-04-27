package p000;

import p000.jvd;

/* JADX INFO: loaded from: classes.dex */
public final class rre {

    /* JADX INFO: renamed from: rre$a */
    @ck3(m4009c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", m4010f = "ScrollExtensions.kt", m4011i = {0}, m4012l = {40}, m4013m = "animateScrollBy", m4014n = {"previousValue"}, m4015s = {"L$0"})
    public static final class C12223a extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f79149a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f79150b;

        /* JADX INFO: renamed from: c */
        public int f79151c;

        public C12223a(zy2<? super C12223a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f79150b = obj;
            this.f79151c |= Integer.MIN_VALUE;
            return rre.animateScrollBy(null, 0.0f, null, this);
        }
    }

    /* JADX INFO: renamed from: rre$b */
    @ck3(m4009c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", m4010f = "ScrollExtensions.kt", m4011i = {}, m4012l = {41}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C12224b extends ugg implements gz6<vre, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f79152a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f79153b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f79154c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC11178py<Float> f79155d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ jvd.C8118e f79156e;

        /* JADX INFO: renamed from: rre$b$a */
        public static final class a extends tt8 implements gz6<Float, Float, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ jvd.C8118e f79157a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ vre f79158b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(jvd.C8118e c8118e, vre vreVar) {
                super(2);
                this.f79157a = c8118e;
                this.f79158b = vreVar;
            }

            @Override // p000.gz6
            public /* bridge */ /* synthetic */ bth invoke(Float f, Float f2) {
                invoke(f.floatValue(), f2.floatValue());
                return bth.f14751a;
            }

            public final void invoke(float f, float f2) {
                jvd.C8118e c8118e = this.f79157a;
                float f3 = c8118e.f52107a;
                c8118e.f52107a = f3 + this.f79158b.scrollBy(f - f3);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12224b(float f, InterfaceC11178py<Float> interfaceC11178py, jvd.C8118e c8118e, zy2<? super C12224b> zy2Var) {
            super(2, zy2Var);
            this.f79154c = f;
            this.f79155d = interfaceC11178py;
            this.f79156e = c8118e;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C12224b c12224b = new C12224b(this.f79154c, this.f79155d, this.f79156e, zy2Var);
            c12224b.f79153b = obj;
            return c12224b;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb vre vreVar, @gib zy2<? super bth> zy2Var) {
            return ((C12224b) create(vreVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f79152a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                vre vreVar = (vre) this.f79153b;
                float f = this.f79154c;
                InterfaceC11178py<Float> interfaceC11178py = this.f79155d;
                a aVar = new a(this.f79156e, vreVar);
                this.f79152a = 1;
                if (rgg.animate$default(0.0f, f, 0.0f, interfaceC11178py, aVar, this, 4, null) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: rre$c */
    @ck3(m4009c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", m4010f = "ScrollExtensions.kt", m4011i = {0}, m4012l = {61}, m4013m = "scrollBy", m4014n = {"consumed"}, m4015s = {"L$0"})
    public static final class C12225c extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f79159a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f79160b;

        /* JADX INFO: renamed from: c */
        public int f79161c;

        public C12225c(zy2<? super C12225c> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f79160b = obj;
            this.f79161c |= Integer.MIN_VALUE;
            return rre.scrollBy(null, 0.0f, this);
        }
    }

    /* JADX INFO: renamed from: rre$d */
    @ck3(m4009c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", m4010f = "ScrollExtensions.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C12226d extends ugg implements gz6<vre, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f79162a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f79163b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ jvd.C8118e f79164c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f79165d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12226d(jvd.C8118e c8118e, float f, zy2<? super C12226d> zy2Var) {
            super(2, zy2Var);
            this.f79164c = c8118e;
            this.f79165d = f;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C12226d c12226d = new C12226d(this.f79164c, this.f79165d, zy2Var);
            c12226d.f79163b = obj;
            return c12226d;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb vre vreVar, @gib zy2<? super bth> zy2Var) {
            return ((C12226d) create(vreVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f79162a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            vre vreVar = (vre) this.f79163b;
            this.f79164c.f52107a = vreVar.scrollBy(this.f79165d);
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: rre$e */
    @ck3(m4009c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2", m4010f = "ScrollExtensions.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C12227e extends ugg implements gz6<vre, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f79166a;

        public C12227e(zy2<? super C12227e> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C12227e(zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb vre vreVar, @gib zy2<? super bth> zy2Var) {
            return ((C12227e) create(vreVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f79166a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            return bth.f14751a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object animateScrollBy(@p000.yfb p000.ase r7, float r8, @p000.yfb p000.InterfaceC11178py<java.lang.Float> r9, @p000.yfb p000.zy2<? super java.lang.Float> r10) {
        /*
            boolean r0 = r10 instanceof p000.rre.C12223a
            if (r0 == 0) goto L14
            r0 = r10
            rre$a r0 = (p000.rre.C12223a) r0
            int r1 = r0.f79151c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f79151c = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            rre$a r0 = new rre$a
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r4.f79150b
            java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r1 = r4.f79151c
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r7 = r4.f79149a
            jvd$e r7 = (p000.jvd.C8118e) r7
            p000.y7e.throwOnFailure(r10)
            goto L55
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            p000.y7e.throwOnFailure(r10)
            jvd$e r10 = new jvd$e
            r10.<init>()
            rre$b r3 = new rre$b
            r1 = 0
            r3.<init>(r8, r9, r10, r1)
            r4.f79149a = r10
            r4.f79151c = r2
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r7
            java.lang.Object r7 = p000.ase.scroll$default(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L54
            return r0
        L54:
            r7 = r10
        L55:
            float r7 = r7.f52107a
            java.lang.Float r7 = p000.wc1.boxFloat(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rre.animateScrollBy(ase, float, py, zy2):java.lang.Object");
    }

    public static /* synthetic */ Object animateScrollBy$default(ase aseVar, float f, InterfaceC11178py interfaceC11178py, zy2 zy2Var, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC11178py = C11760qy.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animateScrollBy(aseVar, f, interfaceC11178py, zy2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object scrollBy(@p000.yfb p000.ase r7, float r8, @p000.yfb p000.zy2<? super java.lang.Float> r9) {
        /*
            boolean r0 = r9 instanceof p000.rre.C12225c
            if (r0 == 0) goto L14
            r0 = r9
            rre$c r0 = (p000.rre.C12225c) r0
            int r1 = r0.f79161c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f79161c = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            rre$c r0 = new rre$c
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f79160b
            java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r1 = r4.f79161c
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r7 = r4.f79159a
            jvd$e r7 = (p000.jvd.C8118e) r7
            p000.y7e.throwOnFailure(r9)
            goto L55
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            p000.y7e.throwOnFailure(r9)
            jvd$e r9 = new jvd$e
            r9.<init>()
            rre$d r3 = new rre$d
            r1 = 0
            r3.<init>(r9, r8, r1)
            r4.f79159a = r9
            r4.f79161c = r2
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r7
            java.lang.Object r7 = p000.ase.scroll$default(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L54
            return r0
        L54:
            r7 = r9
        L55:
            float r7 = r7.f52107a
            java.lang.Float r7 = p000.wc1.boxFloat(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rre.scrollBy(ase, float, zy2):java.lang.Object");
    }

    @gib
    public static final Object stopScroll(@yfb ase aseVar, @yfb j7b j7bVar, @yfb zy2<? super bth> zy2Var) {
        Object objScroll = aseVar.scroll(j7bVar, new C12227e(null), zy2Var);
        return objScroll == pd8.getCOROUTINE_SUSPENDED() ? objScroll : bth.f14751a;
    }

    public static /* synthetic */ Object stopScroll$default(ase aseVar, j7b j7bVar, zy2 zy2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            j7bVar = j7b.Default;
        }
        return stopScroll(aseVar, j7bVar, zy2Var);
    }
}

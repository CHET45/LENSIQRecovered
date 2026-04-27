package p000;

import p000.jvd;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTransformableState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformableState.kt\nandroidx/compose/foundation/gestures/TransformableStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,262:1\n1223#2,6:263\n*S KotlinDebug\n*F\n+ 1 TransformableState.kt\nandroidx/compose/foundation/gestures/TransformableStateKt\n*L\n119#1:263,6\n*E\n"})
public final class beh {

    /* JADX INFO: renamed from: beh$a */
    @ck3(m4009c = "androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2", m4010f = "TransformableState.kt", m4011i = {}, m4012l = {182}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C1864a extends ugg implements gz6<zdh, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f13564a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f13565b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ jvd.C8120g f13566c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ long f13567d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ InterfaceC11178py<izb> f13568e;

        /* JADX INFO: renamed from: beh$a$a */
        public static final class a extends tt8 implements qy6<C10714oy<izb, C14830wy>, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ jvd.C8120g f13569a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ zdh f13570b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(jvd.C8120g c8120g, zdh zdhVar) {
                super(1);
                this.f13569a = c8120g;
                this.f13570b = zdhVar;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(C10714oy<izb, C14830wy> c10714oy) {
                invoke2(c10714oy);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb C10714oy<izb, C14830wy> c10714oy) {
                zdh.m33505transformByd4ec7I$default(this.f13570b, 0.0f, izb.m30433minusMKHz9U(c10714oy.getValue().m30439unboximpl(), this.f13569a.f52109a), 0.0f, 5, null);
                this.f13569a.f52109a = c10714oy.getValue().m30439unboximpl();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1864a(jvd.C8120g c8120g, long j, InterfaceC11178py<izb> interfaceC11178py, zy2<? super C1864a> zy2Var) {
            super(2, zy2Var);
            this.f13566c = c8120g;
            this.f13567d = j;
            this.f13568e = interfaceC11178py;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C1864a c1864a = new C1864a(this.f13566c, this.f13567d, this.f13568e, zy2Var);
            c1864a.f13565b = obj;
            return c1864a;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb zdh zdhVar, @gib zy2<? super bth> zy2Var) {
            return ((C1864a) create(zdhVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f13564a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                zdh zdhVar = (zdh) this.f13565b;
                C12364ry c12364ry = new C12364ry(g3i.getVectorConverter(izb.f49009b), izb.m30418boximpl(this.f13566c.f52109a), null, 0L, 0L, false, 60, null);
                izb izbVarM30418boximpl = izb.m30418boximpl(this.f13567d);
                InterfaceC11178py<izb> interfaceC11178py = this.f13568e;
                a aVar = new a(this.f13566c, zdhVar);
                this.f13564a = 1;
                if (rgg.animateTo$default(c12364ry, izbVarM30418boximpl, interfaceC11178py, false, aVar, this, 4, null) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: beh$b */
    @ck3(m4009c = "androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2", m4010f = "TransformableState.kt", m4011i = {}, m4012l = {158}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C1865b extends ugg implements gz6<zdh, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f13571a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f13572b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ jvd.C8118e f13573c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f13574d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ InterfaceC11178py<Float> f13575e;

        /* JADX INFO: renamed from: beh$b$a */
        public static final class a extends tt8 implements qy6<C10714oy<Float, C14294vy>, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ jvd.C8118e f13576a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ zdh f13577b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(jvd.C8118e c8118e, zdh zdhVar) {
                super(1);
                this.f13576a = c8118e;
                this.f13577b = zdhVar;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(C10714oy<Float, C14294vy> c10714oy) {
                invoke2(c10714oy);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb C10714oy<Float, C14294vy> c10714oy) {
                zdh.m33505transformByd4ec7I$default(this.f13577b, 0.0f, 0L, c10714oy.getValue().floatValue() - this.f13576a.f52107a, 3, null);
                this.f13576a.f52107a = c10714oy.getValue().floatValue();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1865b(jvd.C8118e c8118e, float f, InterfaceC11178py<Float> interfaceC11178py, zy2<? super C1865b> zy2Var) {
            super(2, zy2Var);
            this.f13573c = c8118e;
            this.f13574d = f;
            this.f13575e = interfaceC11178py;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C1865b c1865b = new C1865b(this.f13573c, this.f13574d, this.f13575e, zy2Var);
            c1865b.f13572b = obj;
            return c1865b;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb zdh zdhVar, @gib zy2<? super bth> zy2Var) {
            return ((C1865b) create(zdhVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f13571a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                zdh zdhVar = (zdh) this.f13572b;
                C12364ry c12364ryAnimationState$default = C12827sy.AnimationState$default(this.f13573c.f52107a, 0.0f, 0L, 0L, false, 30, null);
                Float fBoxFloat = wc1.boxFloat(this.f13574d);
                InterfaceC11178py<Float> interfaceC11178py = this.f13575e;
                a aVar = new a(this.f13573c, zdhVar);
                this.f13571a = 1;
                if (rgg.animateTo$default(c12364ryAnimationState$default, fBoxFloat, interfaceC11178py, false, aVar, this, 4, null) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: beh$c */
    @ck3(m4009c = "androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3", m4010f = "TransformableState.kt", m4011i = {}, m4012l = {138}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C1866c extends ugg implements gz6<zdh, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f13578a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f13579b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ jvd.C8118e f13580c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f13581d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ InterfaceC11178py<Float> f13582e;

        /* JADX INFO: renamed from: beh$c$a */
        public static final class a extends tt8 implements qy6<C10714oy<Float, C14294vy>, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ jvd.C8118e f13583a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ zdh f13584b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(jvd.C8118e c8118e, zdh zdhVar) {
                super(1);
                this.f13583a = c8118e;
                this.f13584b = zdhVar;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(C10714oy<Float, C14294vy> c10714oy) {
                invoke2(c10714oy);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb C10714oy<Float, C14294vy> c10714oy) {
                zdh.m33505transformByd4ec7I$default(this.f13584b, this.f13583a.f52107a == 0.0f ? 1.0f : c10714oy.getValue().floatValue() / this.f13583a.f52107a, 0L, 0.0f, 6, null);
                this.f13583a.f52107a = c10714oy.getValue().floatValue();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1866c(jvd.C8118e c8118e, float f, InterfaceC11178py<Float> interfaceC11178py, zy2<? super C1866c> zy2Var) {
            super(2, zy2Var);
            this.f13580c = c8118e;
            this.f13581d = f;
            this.f13582e = interfaceC11178py;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C1866c c1866c = new C1866c(this.f13580c, this.f13581d, this.f13582e, zy2Var);
            c1866c.f13579b = obj;
            return c1866c;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb zdh zdhVar, @gib zy2<? super bth> zy2Var) {
            return ((C1866c) create(zdhVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f13578a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                zdh zdhVar = (zdh) this.f13579b;
                C12364ry c12364ryAnimationState$default = C12827sy.AnimationState$default(this.f13580c.f52107a, 0.0f, 0L, 0L, false, 30, null);
                Float fBoxFloat = wc1.boxFloat(this.f13581d);
                InterfaceC11178py<Float> interfaceC11178py = this.f13582e;
                a aVar = new a(this.f13580c, zdhVar);
                this.f13578a = 1;
                if (rgg.animateTo$default(c12364ryAnimationState$default, fBoxFloat, interfaceC11178py, false, aVar, this, 4, null) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: beh$d */
    @ck3(m4009c = "androidx.compose.foundation.gestures.TransformableStateKt$panBy$2", m4010f = "TransformableState.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C1867d extends ugg implements gz6<zdh, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f13585a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f13586b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f13587c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1867d(long j, zy2<? super C1867d> zy2Var) {
            super(2, zy2Var);
            this.f13587c = j;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C1867d c1867d = new C1867d(this.f13587c, zy2Var);
            c1867d.f13586b = obj;
            return c1867d;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb zdh zdhVar, @gib zy2<? super bth> zy2Var) {
            return ((C1867d) create(zdhVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f13585a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            ((zdh) this.f13586b).mo30630transformByd4ec7I(1.0f, this.f13587c, 0.0f);
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: beh$e */
    public static final class C1868e extends tt8 implements kz6<Float, izb, Float, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ i2g<kz6<Float, izb, Float, bth>> f13588a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1868e(i2g<? extends kz6<? super Float, ? super izb, ? super Float, bth>> i2gVar) {
            super(3);
            this.f13588a = i2gVar;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ bth invoke(Float f, izb izbVar, Float f2) {
            m27996invoked4ec7I(f.floatValue(), izbVar.m30439unboximpl(), f2.floatValue());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final void m27996invoked4ec7I(float f, long j, float f2) {
            this.f13588a.getValue().invoke(Float.valueOf(f), izb.m30418boximpl(j), Float.valueOf(f2));
        }
    }

    /* JADX INFO: renamed from: beh$f */
    @ck3(m4009c = "androidx.compose.foundation.gestures.TransformableStateKt$rotateBy$2", m4010f = "TransformableState.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C1869f extends ugg implements gz6<zdh, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f13589a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f13590b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f13591c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1869f(float f, zy2<? super C1869f> zy2Var) {
            super(2, zy2Var);
            this.f13591c = f;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C1869f c1869f = new C1869f(this.f13591c, zy2Var);
            c1869f.f13590b = obj;
            return c1869f;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb zdh zdhVar, @gib zy2<? super bth> zy2Var) {
            return ((C1869f) create(zdhVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f13589a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            ((zdh) this.f13590b).mo30630transformByd4ec7I(1.0f, izb.f49009b.m30445getZeroF1C5BW0(), this.f13591c);
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: beh$g */
    @ck3(m4009c = "androidx.compose.foundation.gestures.TransformableStateKt$stopTransformation$2", m4010f = "TransformableState.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C1870g extends ugg implements gz6<zdh, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f13592a;

        public C1870g(zy2<? super C1870g> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C1870g(zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb zdh zdhVar, @gib zy2<? super bth> zy2Var) {
            return ((C1870g) create(zdhVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f13592a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: beh$h */
    @ck3(m4009c = "androidx.compose.foundation.gestures.TransformableStateKt$zoomBy$2", m4010f = "TransformableState.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C1871h extends ugg implements gz6<zdh, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f13593a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f13594b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f13595c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1871h(float f, zy2<? super C1871h> zy2Var) {
            super(2, zy2Var);
            this.f13595c = f;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C1871h c1871h = new C1871h(this.f13595c, zy2Var);
            c1871h.f13594b = obj;
            return c1871h;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb zdh zdhVar, @gib zy2<? super bth> zy2Var) {
            return ((C1871h) create(zdhVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f13593a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            ((zdh) this.f13594b).mo30630transformByd4ec7I(this.f13595c, izb.f49009b.m30445getZeroF1C5BW0(), 0.0f);
            return bth.f14751a;
        }
    }

    @yfb
    public static final aeh TransformableState(@yfb kz6<? super Float, ? super izb, ? super Float, bth> kz6Var) {
        return new k24(kz6Var);
    }

    @gib
    /* JADX INFO: renamed from: animatePanBy-ubNVwUQ, reason: not valid java name */
    public static final Object m27993animatePanByubNVwUQ(@yfb aeh aehVar, long j, @yfb InterfaceC11178py<izb> interfaceC11178py, @yfb zy2<? super bth> zy2Var) {
        jvd.C8120g c8120g = new jvd.C8120g();
        c8120g.f52109a = izb.f49009b.m30445getZeroF1C5BW0();
        Object objTransform$default = aeh.transform$default(aehVar, null, new C1864a(c8120g, j, interfaceC11178py, null), zy2Var, 1, null);
        return objTransform$default == pd8.getCOROUTINE_SUSPENDED() ? objTransform$default : bth.f14751a;
    }

    /* JADX INFO: renamed from: animatePanBy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ Object m27994animatePanByubNVwUQ$default(aeh aehVar, long j, InterfaceC11178py interfaceC11178py, zy2 zy2Var, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC11178py = new mzf(0.0f, 200.0f, null, 5, null);
        }
        return m27993animatePanByubNVwUQ(aehVar, j, interfaceC11178py, zy2Var);
    }

    @gib
    public static final Object animateRotateBy(@yfb aeh aehVar, float f, @yfb InterfaceC11178py<Float> interfaceC11178py, @yfb zy2<? super bth> zy2Var) {
        Object objTransform$default = aeh.transform$default(aehVar, null, new C1865b(new jvd.C8118e(), f, interfaceC11178py, null), zy2Var, 1, null);
        return objTransform$default == pd8.getCOROUTINE_SUSPENDED() ? objTransform$default : bth.f14751a;
    }

    public static /* synthetic */ Object animateRotateBy$default(aeh aehVar, float f, InterfaceC11178py interfaceC11178py, zy2 zy2Var, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC11178py = new mzf(0.0f, 200.0f, null, 5, null);
        }
        return animateRotateBy(aehVar, f, interfaceC11178py, zy2Var);
    }

    @gib
    public static final Object animateZoomBy(@yfb aeh aehVar, float f, @yfb InterfaceC11178py<Float> interfaceC11178py, @yfb zy2<? super bth> zy2Var) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("zoom value should be greater than 0");
        }
        jvd.C8118e c8118e = new jvd.C8118e();
        c8118e.f52107a = 1.0f;
        Object objTransform$default = aeh.transform$default(aehVar, null, new C1866c(c8118e, f, interfaceC11178py, null), zy2Var, 1, null);
        return objTransform$default == pd8.getCOROUTINE_SUSPENDED() ? objTransform$default : bth.f14751a;
    }

    public static /* synthetic */ Object animateZoomBy$default(aeh aehVar, float f, InterfaceC11178py interfaceC11178py, zy2 zy2Var, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC11178py = new mzf(0.0f, 200.0f, null, 5, null);
        }
        return animateZoomBy(aehVar, f, interfaceC11178py, zy2Var);
    }

    @gib
    /* JADX INFO: renamed from: panBy-d-4ec7I, reason: not valid java name */
    public static final Object m27995panByd4ec7I(@yfb aeh aehVar, long j, @yfb zy2<? super bth> zy2Var) {
        Object objTransform$default = aeh.transform$default(aehVar, null, new C1867d(j, null), zy2Var, 1, null);
        return objTransform$default == pd8.getCOROUTINE_SUSPENDED() ? objTransform$default : bth.f14751a;
    }

    @yfb
    @hk2
    public static final aeh rememberTransformableState(@yfb kz6<? super Float, ? super izb, ? super Float, bth> kz6Var, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1681419281, i, -1, "androidx.compose.foundation.gestures.rememberTransformableState (TransformableState.kt:116)");
        }
        i2g i2gVarRememberUpdatedState = stf.rememberUpdatedState(kz6Var, zl2Var, i & 14);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = TransformableState(new C1868e(i2gVarRememberUpdatedState));
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        aeh aehVar = (aeh) objRememberedValue;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return aehVar;
    }

    @gib
    public static final Object rotateBy(@yfb aeh aehVar, float f, @yfb zy2<? super bth> zy2Var) {
        Object objTransform$default = aeh.transform$default(aehVar, null, new C1869f(f, null), zy2Var, 1, null);
        return objTransform$default == pd8.getCOROUTINE_SUSPENDED() ? objTransform$default : bth.f14751a;
    }

    @gib
    public static final Object stopTransformation(@yfb aeh aehVar, @yfb j7b j7bVar, @yfb zy2<? super bth> zy2Var) {
        Object objTransform = aehVar.transform(j7bVar, new C1870g(null), zy2Var);
        return objTransform == pd8.getCOROUTINE_SUSPENDED() ? objTransform : bth.f14751a;
    }

    public static /* synthetic */ Object stopTransformation$default(aeh aehVar, j7b j7bVar, zy2 zy2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            j7bVar = j7b.Default;
        }
        return stopTransformation(aehVar, j7bVar, zy2Var);
    }

    @gib
    public static final Object zoomBy(@yfb aeh aehVar, float f, @yfb zy2<? super bth> zy2Var) {
        Object objTransform$default = aeh.transform$default(aehVar, null, new C1871h(f, null), zy2Var, 1, null);
        return objTransform$default == pd8.getCOROUTINE_SUSPENDED() ? objTransform$default : bth.f14751a;
    }
}

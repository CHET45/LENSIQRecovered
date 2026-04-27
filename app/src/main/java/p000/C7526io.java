package p000;

import androidx.compose.foundation.gestures.C0602a;

/* JADX INFO: renamed from: io */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex\n*L\n1#1,1225:1\n81#2:1226\n107#2,2:1227\n81#2:1229\n107#2,2:1230\n81#2:1232\n81#2:1236\n81#2:1240\n107#2,2:1241\n81#2:1243\n107#2,2:1244\n76#3:1233\n109#3,2:1234\n76#3:1237\n109#3,2:1238\n195#4,9:1246\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableState\n*L\n557#1:1226\n557#1:1227,2\n566#1:1229\n566#1:1230,2\n573#1:1232\n645#1:1236\n665#1:1240\n665#1:1241,2\n667#1:1243\n667#1:1244,2\n590#1:1233\n590#1:1234,2\n662#1:1237\n662#1:1238,2\n928#1:1246,9\n*E\n"})
@f0g
@ah5
public final class C7526io<T> {

    /* JADX INFO: renamed from: p */
    @yfb
    public static final c f47643p = new c(null);

    /* JADX INFO: renamed from: q */
    public static final int f47644q = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final qy6<Float, Float> f47645a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final ny6<Float> f47646b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final InterfaceC11178py<Float> f47647c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final vk3<Float> f47648d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final qy6<T, Boolean> f47649e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final x7b f47650f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final z6b f47651g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final z6b f47652h;

    /* JADX INFO: renamed from: i */
    @yfb
    public final i2g f47653i;

    /* JADX INFO: renamed from: j */
    @yfb
    public final b5b f47654j;

    /* JADX INFO: renamed from: k */
    @yfb
    public final i2g f47655k;

    /* JADX INFO: renamed from: l */
    @yfb
    public final b5b f47656l;

    /* JADX INFO: renamed from: m */
    @yfb
    public final z6b f47657m;

    /* JADX INFO: renamed from: n */
    @yfb
    public final z6b f47658n;

    /* JADX INFO: renamed from: o */
    @yfb
    public final g f47659o;

    /* JADX INFO: renamed from: io$a */
    public static final class a extends tt8 implements qy6<T, Boolean> {

        /* JADX INFO: renamed from: a */
        public static final a f47660a = new a();

        public a() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.qy6
        @yfb
        public final Boolean invoke(T t) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: io$b */
    public static final class b extends tt8 implements qy6<T, Boolean> {

        /* JADX INFO: renamed from: a */
        public static final b f47661a = new b();

        public b() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.qy6
        @yfb
        public final Boolean invoke(T t) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: io$c */
    public static final class c {

        /* JADX INFO: renamed from: io$c$a */
        public static final class a extends tt8 implements qy6<T, Boolean> {

            /* JADX INFO: renamed from: a */
            public static final a f47662a = new a();

            public a() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.qy6
            @yfb
            public final Boolean invoke(@yfb T t) {
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: renamed from: io$c$b */
        public static final class b extends tt8 implements gz6<fme, C7526io<T>, T> {

            /* JADX INFO: renamed from: a */
            public static final b f47663a = new b();

            public b() {
                super(2);
            }

            @Override // p000.gz6
            @gib
            public final T invoke(@yfb fme fmeVar, @yfb C7526io<T> c7526io) {
                return c7526io.getCurrentValue();
            }
        }

        /* JADX INFO: renamed from: io$c$c, reason: collision with other inner class name */
        public static final class C16454c extends tt8 implements qy6<T, C7526io<T>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ qy6<Float, Float> f47664a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ny6<Float> f47665b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ InterfaceC11178py<Float> f47666c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ vk3<Float> f47667d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ qy6<T, Boolean> f47668e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C16454c(qy6<? super Float, Float> qy6Var, ny6<Float> ny6Var, InterfaceC11178py<Float> interfaceC11178py, vk3<Float> vk3Var, qy6<? super T, Boolean> qy6Var2) {
                super(1);
                this.f47664a = qy6Var;
                this.f47665b = ny6Var;
                this.f47666c = interfaceC11178py;
                this.f47667d = vk3Var;
                this.f47668e = qy6Var2;
            }

            @Override // p000.qy6
            @gib
            public final C7526io<T> invoke(@yfb T t) {
                return new C7526io<>(t, this.f47664a, this.f47665b, this.f47666c, this.f47667d, this.f47668e);
            }
        }

        public /* synthetic */ c(jt3 jt3Var) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ dme Saver$default(c cVar, InterfaceC11178py interfaceC11178py, vk3 vk3Var, qy6 qy6Var, ny6 ny6Var, qy6 qy6Var2, int i, Object obj) {
            if ((i & 16) != 0) {
                qy6Var2 = a.f47662a;
            }
            return cVar.Saver(interfaceC11178py, vk3Var, qy6Var, ny6Var, qy6Var2);
        }

        @ah5
        @yfb
        public final <T> dme<C7526io<T>, T> Saver(@yfb InterfaceC11178py<Float> interfaceC11178py, @yfb vk3<Float> vk3Var, @yfb qy6<? super Float, Float> qy6Var, @yfb ny6<Float> ny6Var, @yfb qy6<? super T, Boolean> qy6Var2) {
            return eme.Saver(b.f47663a, new C16454c(qy6Var, ny6Var, interfaceC11178py, vk3Var, qy6Var2));
        }

        private c() {
        }
    }

    /* JADX INFO: renamed from: io$d */
    @ck3(m4009c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2", m4010f = "AnchoredDraggable.kt", m4011i = {}, m4012l = {835}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class d extends ugg implements qy6<zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f47669a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C7526io<T> f47670b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ kz6<InterfaceC6923ho, ro4<T>, zy2<? super bth>, Object> f47671c;

        /* JADX INFO: renamed from: io$d$a */
        public static final class a extends tt8 implements ny6<ro4<T>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C7526io<T> f47672a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C7526io<T> c7526io) {
                super(0);
                this.f47672a = c7526io;
            }

            @Override // p000.ny6
            @yfb
            public final ro4<T> invoke() {
                return this.f47672a.getAnchors();
            }
        }

        /* JADX INFO: renamed from: io$d$b */
        @ck3(m4009c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2", m4010f = "AnchoredDraggable.kt", m4011i = {}, m4012l = {836}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class b extends ugg implements gz6<ro4<T>, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f47673a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f47674b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ kz6<InterfaceC6923ho, ro4<T>, zy2<? super bth>, Object> f47675c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ C7526io<T> f47676d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(kz6<? super InterfaceC6923ho, ? super ro4<T>, ? super zy2<? super bth>, ? extends Object> kz6Var, C7526io<T> c7526io, zy2<? super b> zy2Var) {
                super(2, zy2Var);
                this.f47675c = kz6Var;
                this.f47676d = c7526io;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                b bVar = new b(this.f47675c, this.f47676d, zy2Var);
                bVar.f47674b = obj;
                return bVar;
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb ro4<T> ro4Var, @gib zy2<? super bth> zy2Var) {
                return ((b) create(ro4Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f47673a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    ro4<T> ro4Var = (ro4) this.f47674b;
                    kz6<InterfaceC6923ho, ro4<T>, zy2<? super bth>, Object> kz6Var = this.f47675c;
                    g gVar = this.f47676d.f47659o;
                    this.f47673a = 1;
                    if (kz6Var.invoke(gVar, ro4Var, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(C7526io<T> c7526io, kz6<? super InterfaceC6923ho, ? super ro4<T>, ? super zy2<? super bth>, ? extends Object> kz6Var, zy2<? super d> zy2Var) {
            super(1, zy2Var);
            this.f47670b = c7526io;
            this.f47671c = kz6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@yfb zy2<?> zy2Var) {
            return new d(this.f47670b, this.f47671c, zy2Var);
        }

        @Override // p000.qy6
        @gib
        public final Object invoke(@gib zy2<? super bth> zy2Var) {
            return ((d) create(zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f47669a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                a aVar = new a(this.f47670b);
                b bVar = new b(this.f47671c, this.f47670b, null);
                this.f47669a = 1;
                if (C0602a.restartable(aVar, bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            T tClosestAnchor = this.f47670b.getAnchors().closestAnchor(this.f47670b.getOffset());
            if (tClosestAnchor != null) {
                if (Math.abs(this.f47670b.getOffset() - this.f47670b.getAnchors().positionOf(tClosestAnchor)) < 0.5f && this.f47670b.getConfirmValueChange$foundation_release().invoke(tClosestAnchor).booleanValue()) {
                    this.f47670b.setSettledValue(tClosestAnchor);
                    this.f47670b.setCurrentValue(tClosestAnchor);
                }
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: io$e */
    @ck3(m4009c = "androidx.compose.foundation.gestures.AnchoredDraggableState", m4010f = "AnchoredDraggable.kt", m4011i = {0}, m4012l = {880}, m4013m = "anchoredDrag", m4014n = {"this"}, m4015s = {"L$0"})
    public static final class e extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f47677a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f47678b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C7526io<T> f47679c;

        /* JADX INFO: renamed from: d */
        public int f47680d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C7526io<T> c7526io, zy2<? super e> zy2Var) {
            super(zy2Var);
            this.f47679c = c7526io;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f47678b = obj;
            this.f47680d |= Integer.MIN_VALUE;
            return this.f47679c.anchoredDrag(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io$f */
    @ck3(m4009c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4", m4010f = "AnchoredDraggable.kt", m4011i = {}, m4012l = {882}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class f extends ugg implements qy6<zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f47681a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C7526io<T> f47682b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ T f47683c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ oz6<InterfaceC6923ho, ro4<T>, T, zy2<? super bth>, Object> f47684d;

        /* JADX INFO: renamed from: io$f$a */
        public static final class a extends tt8 implements ny6<scc<? extends ro4<T>, ? extends T>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C7526io<T> f47685a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C7526io<T> c7526io) {
                super(0);
                this.f47685a = c7526io;
            }

            @Override // p000.ny6
            @yfb
            public final scc<ro4<T>, T> invoke() {
                return vkh.m24050to(this.f47685a.getAnchors(), this.f47685a.getTargetValue());
            }
        }

        /* JADX INFO: renamed from: io$f$b */
        @ck3(m4009c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2", m4010f = "AnchoredDraggable.kt", m4011i = {}, m4012l = {885}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class b extends ugg implements gz6<scc<? extends ro4<T>, ? extends T>, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f47686a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f47687b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ oz6<InterfaceC6923ho, ro4<T>, T, zy2<? super bth>, Object> f47688c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ C7526io<T> f47689d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(oz6<? super InterfaceC6923ho, ? super ro4<T>, ? super T, ? super zy2<? super bth>, ? extends Object> oz6Var, C7526io<T> c7526io, zy2<? super b> zy2Var) {
                super(2, zy2Var);
                this.f47688c = oz6Var;
                this.f47689d = c7526io;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                b bVar = new b(this.f47688c, this.f47689d, zy2Var);
                bVar.f47687b = obj;
                return bVar;
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb scc<? extends ro4<T>, ? extends T> sccVar, @gib zy2<? super bth> zy2Var) {
                return ((b) create(sccVar, zy2Var)).invokeSuspend(bth.f14751a);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to io$f$b for r5v1 'this'  java.lang.Object
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // p000.tq0
            @p000.gib
            public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r1 = r5.f47686a
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    p000.y7e.throwOnFailure(r6)
                    goto L39
                Lf:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L17:
                    p000.y7e.throwOnFailure(r6)
                    java.lang.Object r6 = r5.f47687b
                    scc r6 = (p000.scc) r6
                    java.lang.Object r1 = r6.component1()
                    ro4 r1 = (p000.ro4) r1
                    java.lang.Object r6 = r6.component2()
                    oz6<ho, ro4<T>, T, zy2<? super bth>, java.lang.Object> r3 = r5.f47688c
                    io<T> r4 = r5.f47689d
                    io$g r4 = p000.C7526io.access$getAnchoredDragScope$p(r4)
                    r5.f47686a = r2
                    java.lang.Object r6 = r3.invoke(r4, r1, r6, r5)
                    if (r6 != r0) goto L39
                    return r0
                L39:
                    bth r6 = p000.bth.f14751a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.C7526io.f.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(C7526io<T> c7526io, T t, oz6<? super InterfaceC6923ho, ? super ro4<T>, ? super T, ? super zy2<? super bth>, ? extends Object> oz6Var, zy2<? super f> zy2Var) {
            super(1, zy2Var);
            this.f47682b = c7526io;
            this.f47683c = t;
            this.f47684d = oz6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@yfb zy2<?> zy2Var) {
            return new f(this.f47682b, this.f47683c, this.f47684d, zy2Var);
        }

        @Override // p000.qy6
        @gib
        public final Object invoke(@gib zy2<? super bth> zy2Var) {
            return ((f) create(zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f47681a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                this.f47682b.setDragTarget(this.f47683c);
                a aVar = new a(this.f47682b);
                b bVar = new b(this.f47684d, this.f47682b, null);
                this.f47681a = 1;
                if (C0602a.restartable(aVar, bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            if (this.f47682b.getConfirmValueChange$foundation_release().invoke(this.f47683c).booleanValue()) {
                this.f47682b.f47659o.dragTo(this.f47682b.getAnchors().positionOf(this.f47683c), this.f47682b.getLastVelocity());
                this.f47682b.setSettledValue(this.f47683c);
                this.f47682b.setCurrentValue(this.f47683c);
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: io$g */
    public static final class g implements InterfaceC6923ho {

        /* JADX INFO: renamed from: a */
        @gib
        public T f47690a;

        /* JADX INFO: renamed from: b */
        @gib
        public T f47691b;

        /* JADX INFO: renamed from: c */
        public float f47692c = Float.NaN;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C7526io<T> f47693d;

        public g(C7526io<T> c7526io) {
            this.f47693d = c7526io;
        }

        @Override // p000.InterfaceC6923ho
        public void dragTo(float f, float f2) {
            float offset = this.f47693d.getOffset();
            this.f47693d.setOffset(f);
            this.f47693d.setLastVelocity(f2);
            if (Float.isNaN(offset)) {
                return;
            }
            updateIfNeeded(f >= offset);
        }

        public final float getDistance() {
            return this.f47692c;
        }

        @gib
        public final T getLeftBound() {
            return this.f47690a;
        }

        @gib
        public final T getRightBound() {
            return this.f47691b;
        }

        public final void setDistance(float f) {
            this.f47692c = f;
        }

        public final void setLeftBound(@gib T t) {
            this.f47690a = t;
        }

        public final void setRightBound(@gib T t) {
            this.f47691b = t;
        }

        public final void updateBounds(boolean z) {
            if (this.f47693d.getOffset() == this.f47693d.getAnchors().positionOf(this.f47693d.getCurrentValue())) {
                T tClosestAnchor = this.f47693d.getAnchors().closestAnchor(this.f47693d.getOffset() + (z ? 1.0f : -1.0f), z);
                if (tClosestAnchor == null) {
                    tClosestAnchor = this.f47693d.getCurrentValue();
                }
                if (z) {
                    this.f47690a = this.f47693d.getCurrentValue();
                    this.f47691b = tClosestAnchor;
                } else {
                    this.f47690a = tClosestAnchor;
                    this.f47691b = this.f47693d.getCurrentValue();
                }
            } else {
                T tClosestAnchor2 = this.f47693d.getAnchors().closestAnchor(this.f47693d.getOffset(), false);
                if (tClosestAnchor2 == null) {
                    tClosestAnchor2 = this.f47693d.getCurrentValue();
                }
                T tClosestAnchor3 = this.f47693d.getAnchors().closestAnchor(this.f47693d.getOffset(), true);
                if (tClosestAnchor3 == null) {
                    tClosestAnchor3 = this.f47693d.getCurrentValue();
                }
                this.f47690a = tClosestAnchor2;
                this.f47691b = tClosestAnchor3;
            }
            ro4<T> anchors = this.f47693d.getAnchors();
            T t = this.f47690a;
            md8.checkNotNull(t);
            float fPositionOf = anchors.positionOf(t);
            ro4<T> anchors2 = this.f47693d.getAnchors();
            T t2 = this.f47691b;
            md8.checkNotNull(t2);
            this.f47692c = Math.abs(fPositionOf - anchors2.positionOf(t2));
        }

        public final void updateIfNeeded(boolean z) {
            updateBounds(z);
            if (Math.abs(this.f47693d.getOffset() - this.f47693d.getAnchors().positionOf(this.f47693d.getCurrentValue())) >= this.f47692c / 2.0f) {
                T currentValue = z ? this.f47691b : this.f47690a;
                if (currentValue == null) {
                    currentValue = this.f47693d.getCurrentValue();
                }
                if (((Boolean) this.f47693d.getConfirmValueChange$foundation_release().invoke(currentValue)).booleanValue()) {
                    this.f47693d.setCurrentValue(currentValue);
                }
            }
        }
    }

    /* JADX INFO: renamed from: io$h */
    public static final class h extends tt8 implements ny6<Float> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C7526io<T> f47694a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C7526io<T> c7526io) {
            super(0);
            this.f47694a = c7526io;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Float invoke() {
            float fPositionOf = this.f47694a.getAnchors().positionOf(this.f47694a.getSettledValue());
            float fPositionOf2 = this.f47694a.getAnchors().positionOf(this.f47694a.getTargetValue()) - fPositionOf;
            float fAbs = Math.abs(fPositionOf2);
            float f = 1.0f;
            if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                float fRequireOffset = (this.f47694a.requireOffset() - fPositionOf) / fPositionOf2;
                if (fRequireOffset < 1.0E-6f) {
                    f = 0.0f;
                } else if (fRequireOffset <= 0.999999f) {
                    f = fRequireOffset;
                }
            }
            return Float.valueOf(f);
        }
    }

    /* JADX INFO: renamed from: io$i */
    public static final class i extends tt8 implements ny6<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C7526io<T> f47695a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C7526io<T> c7526io) {
            super(0);
            this.f47695a = c7526io;
        }

        @Override // p000.ny6
        public final T invoke() {
            T tClosestAnchor;
            T t = (T) this.f47695a.getDragTarget();
            if (t != null) {
                return t;
            }
            C7526io<T> c7526io = this.f47695a;
            if (!Float.isNaN(c7526io.getOffset()) && (tClosestAnchor = c7526io.getAnchors().closestAnchor(c7526io.getOffset())) != null) {
                return tClosestAnchor;
            }
            return c7526io.getCurrentValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7526io(T t, @yfb qy6<? super Float, Float> qy6Var, @yfb ny6<Float> ny6Var, @yfb InterfaceC11178py<Float> interfaceC11178py, @yfb vk3<Float> vk3Var, @yfb qy6<? super T, Boolean> qy6Var2) {
        this.f47645a = qy6Var;
        this.f47646b = ny6Var;
        this.f47647c = interfaceC11178py;
        this.f47648d = vk3Var;
        this.f47649e = qy6Var2;
        this.f47650f = new x7b();
        this.f47651g = xtf.mutableStateOf$default(t, null, 2, null);
        this.f47652h = xtf.mutableStateOf$default(t, null, 2, null);
        this.f47653i = stf.derivedStateOf(new i(this));
        this.f47654j = pbd.mutableFloatStateOf(Float.NaN);
        this.f47655k = stf.derivedStateOf(stf.structuralEqualityPolicy(), new h(this));
        this.f47656l = pbd.mutableFloatStateOf(0.0f);
        this.f47657m = xtf.mutableStateOf$default(null, null, 2, null);
        this.f47658n = xtf.mutableStateOf$default(C0602a.emptyDraggableAnchors(), null, 2, null);
        this.f47659o = new g(this);
    }

    public static /* synthetic */ Object anchoredDrag$default(C7526io c7526io, j7b j7bVar, kz6 kz6Var, zy2 zy2Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j7bVar = j7b.Default;
        }
        return c7526io.anchoredDrag(j7bVar, kz6Var, zy2Var);
    }

    private final T computeTarget(float f2, T t, float f3) {
        ro4<T> anchors = getAnchors();
        float fPositionOf = anchors.positionOf(t);
        float fFloatValue = this.f47646b.invoke().floatValue();
        if (fPositionOf == f2 || Float.isNaN(fPositionOf)) {
            return t;
        }
        if (Math.abs(f3) >= Math.abs(fFloatValue)) {
            T tClosestAnchor = anchors.closestAnchor(f2, Math.signum(f3) > 0.0f);
            md8.checkNotNull(tClosestAnchor);
            return tClosestAnchor;
        }
        T tClosestAnchor2 = anchors.closestAnchor(f2, f2 - fPositionOf > 0.0f);
        md8.checkNotNull(tClosestAnchor2);
        return Math.abs(fPositionOf - f2) <= Math.abs(this.f47645a.invoke(Float.valueOf(Math.abs(fPositionOf - anchors.positionOf(tClosestAnchor2)))).floatValue()) ? t : tClosestAnchor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T getDragTarget() {
        return this.f47657m.getValue();
    }

    @q64(message = "Use the progress function to query the progress between two specified anchors.", replaceWith = @i2e(expression = "progress(state.settledValue, state.targetValue)", imports = {}))
    public static /* synthetic */ void getProgress$annotations() {
    }

    private final void setAnchors(ro4<T> ro4Var) {
        this.f47658n.setValue(ro4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentValue(T t) {
        this.f47651g.setValue(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDragTarget(T t) {
        this.f47657m.setValue(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLastVelocity(float f2) {
        this.f47656l.setFloatValue(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOffset(float f2) {
        this.f47654j.setFloatValue(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSettledValue(T t) {
        this.f47652h.setValue(t);
    }

    private final boolean trySnapTo(T t) {
        x7b x7bVar = this.f47650f;
        boolean zTryLock = x7bVar.tryLock();
        if (zTryLock) {
            try {
                g gVar = this.f47659o;
                float fPositionOf = getAnchors().positionOf(t);
                if (!Float.isNaN(fPositionOf)) {
                    InterfaceC6923ho.dragTo$default(gVar, fPositionOf, 0.0f, 2, null);
                    setDragTarget(null);
                }
                setCurrentValue(t);
                setSettledValue(t);
                x7bVar.unlock();
            } catch (Throwable th) {
                x7bVar.unlock();
                throw th;
            }
        }
        return zTryLock;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateAnchors$default(C7526io c7526io, ro4 ro4Var, Object obj, int i2, Object obj2) {
        if ((i2 & 2) != 0 && (Float.isNaN(c7526io.getOffset()) || (obj = ro4Var.closestAnchor(c7526io.getOffset())) == null)) {
            obj = c7526io.getTargetValue();
        }
        c7526io.updateAnchors(ro4Var, obj);
    }

    @gib
    public final Object anchoredDrag(@yfb j7b j7bVar, @yfb kz6<? super InterfaceC6923ho, ? super ro4<T>, ? super zy2<? super bth>, ? extends Object> kz6Var, @yfb zy2<? super bth> zy2Var) {
        Object objMutate = this.f47650f.mutate(j7bVar, new d(this, kz6Var, null), zy2Var);
        return objMutate == pd8.getCOROUTINE_SUSPENDED() ? objMutate : bth.f14751a;
    }

    public final float dispatchRawDelta(float f2) {
        float fNewOffsetForDelta$foundation_release = newOffsetForDelta$foundation_release(f2);
        float offset = Float.isNaN(getOffset()) ? 0.0f : getOffset();
        setOffset(fNewOffsetForDelta$foundation_release);
        return fNewOffsetForDelta$foundation_release - offset;
    }

    @yfb
    public final ro4<T> getAnchors() {
        return (ro4) this.f47658n.getValue();
    }

    @yfb
    public final qy6<T, Boolean> getConfirmValueChange$foundation_release() {
        return this.f47649e;
    }

    public final T getCurrentValue() {
        return this.f47651g.getValue();
    }

    @yfb
    public final vk3<Float> getDecayAnimationSpec() {
        return this.f47648d;
    }

    public final float getLastVelocity() {
        return this.f47656l.getFloatValue();
    }

    public final float getOffset() {
        return this.f47654j.getFloatValue();
    }

    @yfb
    public final qy6<Float, Float> getPositionalThreshold$foundation_release() {
        return this.f47645a;
    }

    @y46(from = 0.0d, m25645to = 1.0d)
    public final float getProgress() {
        return ((Number) this.f47655k.getValue()).floatValue();
    }

    public final T getSettledValue() {
        return this.f47652h.getValue();
    }

    @yfb
    public final InterfaceC11178py<Float> getSnapAnimationSpec() {
        return this.f47647c;
    }

    public final T getTargetValue() {
        return (T) this.f47653i.getValue();
    }

    @yfb
    public final ny6<Float> getVelocityThreshold$foundation_release() {
        return this.f47646b;
    }

    public final boolean isAnimationRunning() {
        return getDragTarget() != null;
    }

    public final float newOffsetForDelta$foundation_release(float f2) {
        return kpd.coerceIn((Float.isNaN(getOffset()) ? 0.0f : getOffset()) + f2, getAnchors().minAnchor(), getAnchors().maxAnchor());
    }

    @y46(from = 0.0d, m25645to = 1.0d)
    public final float progress(T t, T t2) {
        float fPositionOf = getAnchors().positionOf(t);
        float fPositionOf2 = getAnchors().positionOf(t2);
        float fCoerceIn = (kpd.coerceIn(getOffset(), Math.min(fPositionOf, fPositionOf2), Math.max(fPositionOf, fPositionOf2)) - fPositionOf) / (fPositionOf2 - fPositionOf);
        if (Float.isNaN(fCoerceIn)) {
            return 1.0f;
        }
        if (fCoerceIn < 1.0E-6f) {
            return 0.0f;
        }
        if (fCoerceIn > 0.999999f) {
            return 1.0f;
        }
        return Math.abs(fCoerceIn);
    }

    public final float requireOffset() {
        if (Float.isNaN(getOffset())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return getOffset();
    }

    @gib
    public final Object settle(float f2, @yfb zy2<? super Float> zy2Var) {
        T currentValue = getCurrentValue();
        T tComputeTarget = computeTarget(requireOffset(), currentValue, f2);
        return this.f47649e.invoke(tComputeTarget).booleanValue() ? C0602a.animateToWithDecay(this, tComputeTarget, f2, zy2Var) : C0602a.animateToWithDecay(this, currentValue, f2, zy2Var);
    }

    public final void updateAnchors(@yfb ro4<T> ro4Var, T t) {
        if (md8.areEqual(getAnchors(), ro4Var)) {
            return;
        }
        setAnchors(ro4Var);
        if (trySnapTo(t)) {
            return;
        }
        setDragTarget(t);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object anchoredDrag(T r6, @p000.yfb p000.j7b r7, @p000.yfb p000.oz6<? super p000.InterfaceC6923ho, ? super p000.ro4<T>, ? super T, ? super p000.zy2<? super p000.bth>, ? extends java.lang.Object> r8, @p000.yfb p000.zy2<? super p000.bth> r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof p000.C7526io.e
            if (r0 == 0) goto L13
            r0 = r9
            io$e r0 = (p000.C7526io.e) r0
            int r1 = r0.f47680d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47680d = r1
            goto L18
        L13:
            io$e r0 = new io$e
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f47678b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f47680d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f47677a
            io r6 = (p000.C7526io) r6
            p000.y7e.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L2e
            goto L58
        L2e:
            r7 = move-exception
            goto L5e
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            p000.y7e.throwOnFailure(r9)
            ro4 r9 = r5.getAnchors()
            boolean r9 = r9.hasAnchorFor(r6)
            if (r9 == 0) goto L62
            x7b r9 = r5.f47650f     // Catch: java.lang.Throwable -> L5c
            io$f r2 = new io$f     // Catch: java.lang.Throwable -> L5c
            r2.<init>(r5, r6, r8, r4)     // Catch: java.lang.Throwable -> L5c
            r0.f47677a = r5     // Catch: java.lang.Throwable -> L5c
            r0.f47680d = r3     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r6 = r9.mutate(r7, r2, r0)     // Catch: java.lang.Throwable -> L5c
            if (r6 != r1) goto L57
            return r1
        L57:
            r6 = r5
        L58:
            r6.setDragTarget(r4)
            goto L76
        L5c:
            r7 = move-exception
            r6 = r5
        L5e:
            r6.setDragTarget(r4)
            throw r7
        L62:
            qy6<T, java.lang.Boolean> r7 = r5.f47649e
            java.lang.Object r7 = r7.invoke(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L76
            r5.setSettledValue(r6)
            r5.setCurrentValue(r6)
        L76:
            bth r6 = p000.bth.f14751a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7526io.anchoredDrag(java.lang.Object, j7b, oz6, zy2):java.lang.Object");
    }

    public static /* synthetic */ Object anchoredDrag$default(C7526io c7526io, Object obj, j7b j7bVar, oz6 oz6Var, zy2 zy2Var, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            j7bVar = j7b.Default;
        }
        return c7526io.anchoredDrag(obj, j7bVar, oz6Var, zy2Var);
    }

    public /* synthetic */ C7526io(Object obj, qy6 qy6Var, ny6 ny6Var, InterfaceC11178py interfaceC11178py, vk3 vk3Var, qy6 qy6Var2, int i2, jt3 jt3Var) {
        this(obj, qy6Var, ny6Var, interfaceC11178py, vk3Var, (i2 & 32) != 0 ? a.f47660a : qy6Var2);
    }

    public /* synthetic */ C7526io(Object obj, ro4 ro4Var, qy6 qy6Var, ny6 ny6Var, InterfaceC11178py interfaceC11178py, vk3 vk3Var, qy6 qy6Var2, int i2, jt3 jt3Var) {
        this(obj, ro4Var, qy6Var, ny6Var, interfaceC11178py, vk3Var, (i2 & 64) != 0 ? b.f47661a : qy6Var2);
    }

    @ah5
    public C7526io(T t, @yfb ro4<T> ro4Var, @yfb qy6<? super Float, Float> qy6Var, @yfb ny6<Float> ny6Var, @yfb InterfaceC11178py<Float> interfaceC11178py, @yfb vk3<Float> vk3Var, @yfb qy6<? super T, Boolean> qy6Var2) {
        this(t, qy6Var, ny6Var, interfaceC11178py, vk3Var, qy6Var2);
        setAnchors(ro4Var);
        trySnapTo(t);
    }
}

package p000;

import java.util.concurrent.CancellationException;
import p000.AbstractC16313zy;
import p000.jvd;

/* JADX INFO: renamed from: tw */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAnimatable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n*L\n1#1,507:1\n81#2:508\n107#2,2:509\n81#2:511\n107#2,2:512\n1#3:514\n54#4,7:515\n*S KotlinDebug\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n*L\n98#1:508\n98#1:509,2\n105#1:511\n105#1:512,2\n179#1:515,7\n*E\n"})
@e0g(parameters = 0)
public final class C13257tw<T, V extends AbstractC16313zy> {

    /* JADX INFO: renamed from: o */
    public static final int f86120o = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final alh<T, V> f86121a;

    /* JADX INFO: renamed from: b */
    @gib
    public final T f86122b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final String f86123c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final C12364ry<T, V> f86124d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final z6b f86125e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final z6b f86126f;

    /* JADX INFO: renamed from: g */
    @gib
    public T f86127g;

    /* JADX INFO: renamed from: h */
    @gib
    public T f86128h;

    /* JADX INFO: renamed from: i */
    @yfb
    public final w7b f86129i;

    /* JADX INFO: renamed from: j */
    @yfb
    public final mzf<T> f86130j;

    /* JADX INFO: renamed from: k */
    @yfb
    public final V f86131k;

    /* JADX INFO: renamed from: l */
    @yfb
    public final V f86132l;

    /* JADX INFO: renamed from: m */
    @yfb
    public V f86133m;

    /* JADX INFO: renamed from: n */
    @yfb
    public V f86134n;

    /* JADX INFO: renamed from: tw$a */
    @ck3(m4009c = "androidx.compose.animation.core.Animatable$runAnimation$2", m4010f = "Animatable.kt", m4011i = {0, 0}, m4012l = {312}, m4013m = "invokeSuspend", m4014n = {"endState", "clampingNeeded"}, m4015s = {"L$0", "L$1"})
    public static final class a extends ugg implements qy6<zy2<? super C10113ny<T, V>>, Object> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ qy6<C13257tw<T, V>, bth> f86135C;

        /* JADX INFO: renamed from: a */
        public Object f86136a;

        /* JADX INFO: renamed from: b */
        public Object f86137b;

        /* JADX INFO: renamed from: c */
        public int f86138c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C13257tw<T, V> f86139d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ T f86140e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InterfaceC6643gy<T, V> f86141f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ long f86142m;

        /* JADX INFO: renamed from: tw$a$a, reason: collision with other inner class name */
        public static final class C16534a extends tt8 implements qy6<C10714oy<T, V>, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C13257tw<T, V> f86143a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C12364ry<T, V> f86144b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ qy6<C13257tw<T, V>, bth> f86145c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ jvd.C8114a f86146d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C16534a(C13257tw<T, V> c13257tw, C12364ry<T, V> c12364ry, qy6<? super C13257tw<T, V>, bth> qy6Var, jvd.C8114a c8114a) {
                super(1);
                this.f86143a = c13257tw;
                this.f86144b = c12364ry;
                this.f86145c = qy6Var;
                this.f86146d = c8114a;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(Object obj) {
                invoke((C10714oy) obj);
                return bth.f14751a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke(@yfb C10714oy<T, V> c10714oy) {
                rgg.updateState(c10714oy, this.f86143a.getInternalState$animation_core_release());
                Object objClampToBounds = this.f86143a.clampToBounds(c10714oy.getValue());
                if (md8.areEqual(objClampToBounds, c10714oy.getValue())) {
                    qy6<C13257tw<T, V>, bth> qy6Var = this.f86145c;
                    if (qy6Var != null) {
                        qy6Var.invoke(this.f86143a);
                        return;
                    }
                    return;
                }
                this.f86143a.getInternalState$animation_core_release().setValue$animation_core_release(objClampToBounds);
                this.f86144b.setValue$animation_core_release((T) objClampToBounds);
                qy6<C13257tw<T, V>, bth> qy6Var2 = this.f86145c;
                if (qy6Var2 != null) {
                    qy6Var2.invoke(this.f86143a);
                }
                c10714oy.cancelAnimation();
                this.f86146d.f52103a = true;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C13257tw<T, V> c13257tw, T t, InterfaceC6643gy<T, V> interfaceC6643gy, long j, qy6<? super C13257tw<T, V>, bth> qy6Var, zy2<? super a> zy2Var) {
            super(1, zy2Var);
            this.f86139d = c13257tw;
            this.f86140e = t;
            this.f86141f = interfaceC6643gy;
            this.f86142m = j;
            this.f86135C = qy6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@yfb zy2<?> zy2Var) {
            return new a(this.f86139d, this.f86140e, this.f86141f, this.f86142m, this.f86135C, zy2Var);
        }

        @Override // p000.qy6
        @gib
        public final Object invoke(@gib zy2<? super C10113ny<T, V>> zy2Var) {
            return ((a) create(zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            C12364ry c12364ry;
            jvd.C8114a c8114a;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f86138c;
            try {
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    this.f86139d.getInternalState$animation_core_release().setVelocityVector$animation_core_release(this.f86139d.getTypeConverter().getConvertToVector().invoke(this.f86140e));
                    this.f86139d.setTargetValue(this.f86141f.getTargetValue());
                    this.f86139d.setRunning(true);
                    C12364ry c12364ryCopy$default = C12827sy.copy$default((C12364ry) this.f86139d.getInternalState$animation_core_release(), (Object) null, (AbstractC16313zy) null, 0L, Long.MIN_VALUE, false, 23, (Object) null);
                    jvd.C8114a c8114a2 = new jvd.C8114a();
                    InterfaceC6643gy<T, V> interfaceC6643gy = this.f86141f;
                    long j = this.f86142m;
                    C16534a c16534a = new C16534a(this.f86139d, c12364ryCopy$default, this.f86135C, c8114a2);
                    this.f86136a = c12364ryCopy$default;
                    this.f86137b = c8114a2;
                    this.f86138c = 1;
                    if (rgg.animate(c12364ryCopy$default, interfaceC6643gy, j, c16534a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c12364ry = c12364ryCopy$default;
                    c8114a = c8114a2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c8114a = (jvd.C8114a) this.f86137b;
                    c12364ry = (C12364ry) this.f86136a;
                    y7e.throwOnFailure(obj);
                }
                EnumC7662iy enumC7662iy = c8114a.f52103a ? EnumC7662iy.BoundReached : EnumC7662iy.Finished;
                this.f86139d.endAnimation();
                return new C10113ny(c12364ry, enumC7662iy);
            } catch (CancellationException e) {
                this.f86139d.endAnimation();
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: tw$b */
    @ck3(m4009c = "androidx.compose.animation.core.Animatable$snapTo$2", m4010f = "Animatable.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class b extends ugg implements qy6<zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f86147a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C13257tw<T, V> f86148b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ T f86149c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C13257tw<T, V> c13257tw, T t, zy2<? super b> zy2Var) {
            super(1, zy2Var);
            this.f86148b = c13257tw;
            this.f86149c = t;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@yfb zy2<?> zy2Var) {
            return new b(this.f86148b, this.f86149c, zy2Var);
        }

        @Override // p000.qy6
        @gib
        public final Object invoke(@gib zy2<? super bth> zy2Var) {
            return ((b) create(zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f86147a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            this.f86148b.endAnimation();
            Object objClampToBounds = this.f86148b.clampToBounds(this.f86149c);
            this.f86148b.getInternalState$animation_core_release().setValue$animation_core_release(objClampToBounds);
            this.f86148b.setTargetValue(objClampToBounds);
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: tw$c */
    @ck3(m4009c = "androidx.compose.animation.core.Animatable$stop$2", m4010f = "Animatable.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class c extends ugg implements qy6<zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f86150a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C13257tw<T, V> f86151b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C13257tw<T, V> c13257tw, zy2<? super c> zy2Var) {
            super(1, zy2Var);
            this.f86151b = c13257tw;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@yfb zy2<?> zy2Var) {
            return new c(this.f86151b, zy2Var);
        }

        @Override // p000.qy6
        @gib
        public final Object invoke(@gib zy2<? super bth> zy2Var) {
            return ((c) create(zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f86150a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            this.f86151b.endAnimation();
            return bth.f14751a;
        }
    }

    public C13257tw(T t, @yfb alh<T, V> alhVar, @gib T t2, @yfb String str) {
        this.f86121a = alhVar;
        this.f86122b = t2;
        this.f86123c = str;
        this.f86124d = new C12364ry<>(alhVar, t, null, 0L, 0L, false, 60, null);
        this.f86125e = xtf.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.f86126f = xtf.mutableStateOf$default(t, null, 2, null);
        this.f86129i = new w7b();
        this.f86130j = new mzf<>(0.0f, 0.0f, t2, 3, null);
        AbstractC16313zy velocityVector = getVelocityVector();
        V v = velocityVector instanceof C14294vy ? C1634ax.f12052e : velocityVector instanceof C14830wy ? C1634ax.f12053f : velocityVector instanceof C15345xy ? C1634ax.f12054g : C1634ax.f12055h;
        md8.checkNotNull(v, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.f86131k = v;
        AbstractC16313zy velocityVector2 = getVelocityVector();
        V v2 = velocityVector2 instanceof C14294vy ? C1634ax.f12048a : velocityVector2 instanceof C14830wy ? C1634ax.f12049b : velocityVector2 instanceof C15345xy ? C1634ax.f12050c : C1634ax.f12051d;
        md8.checkNotNull(v2, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.f86132l = v2;
        this.f86133m = v;
        this.f86134n = v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateDecay$default(C13257tw c13257tw, Object obj, vk3 vk3Var, qy6 qy6Var, zy2 zy2Var, int i, Object obj2) {
        if ((i & 4) != 0) {
            qy6Var = null;
        }
        return c13257tw.animateDecay(obj, vk3Var, qy6Var, zy2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(C13257tw c13257tw, Object obj, InterfaceC11178py interfaceC11178py, Object obj2, qy6 qy6Var, zy2 zy2Var, int i, Object obj3) {
        if ((i & 2) != 0) {
            interfaceC11178py = c13257tw.f86130j;
        }
        InterfaceC11178py interfaceC11178py2 = interfaceC11178py;
        if ((i & 4) != 0) {
            obj2 = c13257tw.getVelocity();
        }
        Object obj4 = obj2;
        if ((i & 8) != 0) {
            qy6Var = null;
        }
        return c13257tw.animateTo(obj, interfaceC11178py2, obj4, qy6Var, zy2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T clampToBounds(T t) {
        if (md8.areEqual(this.f86133m, this.f86131k) && md8.areEqual(this.f86134n, this.f86132l)) {
            return t;
        }
        V vInvoke = this.f86121a.getConvertToVector().invoke(t);
        int size$animation_core_release = vInvoke.getSize$animation_core_release();
        boolean z = false;
        for (int i = 0; i < size$animation_core_release; i++) {
            if (vInvoke.get$animation_core_release(i) < this.f86133m.get$animation_core_release(i) || vInvoke.get$animation_core_release(i) > this.f86134n.get$animation_core_release(i)) {
                vInvoke.set$animation_core_release(i, kpd.coerceIn(vInvoke.get$animation_core_release(i), this.f86133m.get$animation_core_release(i), this.f86134n.get$animation_core_release(i)));
                z = true;
            }
        }
        return z ? this.f86121a.getConvertFromVector().invoke(vInvoke) : t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endAnimation() {
        C12364ry<T, V> c12364ry = this.f86124d;
        c12364ry.getVelocityVector().reset$animation_core_release();
        c12364ry.setLastFrameTimeNanos$animation_core_release(Long.MIN_VALUE);
        setRunning(false);
    }

    private static /* synthetic */ void getNegativeInfinityBounds$annotations() {
    }

    private static /* synthetic */ void getPositiveInfinityBounds$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runAnimation(InterfaceC6643gy<T, V> interfaceC6643gy, T t, qy6<? super C13257tw<T, V>, bth> qy6Var, zy2<? super C10113ny<T, V>> zy2Var) {
        return w7b.mutate$default(this.f86129i, null, new a(this, t, interfaceC6643gy, this.f86124d.getLastFrameTimeNanos(), qy6Var, null), zy2Var, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRunning(boolean z) {
        this.f86125e.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTargetValue(T t) {
        this.f86126f.setValue(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateBounds$default(C13257tw c13257tw, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = c13257tw.f86127g;
        }
        if ((i & 2) != 0) {
            obj2 = c13257tw.f86128h;
        }
        c13257tw.updateBounds(obj, obj2);
    }

    @gib
    public final Object animateDecay(T t, @yfb vk3<T> vk3Var, @gib qy6<? super C13257tw<T, V>, bth> qy6Var, @yfb zy2<? super C10113ny<T, V>> zy2Var) {
        return runAnimation(new uk3((vk3) vk3Var, (alh) this.f86121a, (Object) getValue(), (AbstractC16313zy) this.f86121a.getConvertToVector().invoke(t)), t, qy6Var, zy2Var);
    }

    @gib
    public final Object animateTo(T t, @yfb InterfaceC11178py<T> interfaceC11178py, T t2, @gib qy6<? super C13257tw<T, V>, bth> qy6Var, @yfb zy2<? super C10113ny<T, V>> zy2Var) {
        return runAnimation(C8551ky.TargetBasedAnimation(interfaceC11178py, this.f86121a, getValue(), t, t2), t2, qy6Var, zy2Var);
    }

    @yfb
    public final i2g<T> asState() {
        return this.f86124d;
    }

    @yfb
    public final mzf<T> getDefaultSpringSpec$animation_core_release() {
        return this.f86130j;
    }

    @yfb
    public final C12364ry<T, V> getInternalState$animation_core_release() {
        return this.f86124d;
    }

    @yfb
    public final String getLabel() {
        return this.f86123c;
    }

    @gib
    public final T getLowerBound() {
        return this.f86127g;
    }

    public final T getTargetValue() {
        return this.f86126f.getValue();
    }

    @yfb
    public final alh<T, V> getTypeConverter() {
        return this.f86121a;
    }

    @gib
    public final T getUpperBound() {
        return this.f86128h;
    }

    public final T getValue() {
        return this.f86124d.getValue();
    }

    public final T getVelocity() {
        return (T) this.f86121a.getConvertFromVector().invoke(getVelocityVector());
    }

    @yfb
    public final V getVelocityVector() {
        return (V) this.f86124d.getVelocityVector();
    }

    public final boolean isRunning() {
        return ((Boolean) this.f86125e.getValue()).booleanValue();
    }

    @gib
    public final Object snapTo(T t, @yfb zy2<? super bth> zy2Var) {
        Object objMutate$default = w7b.mutate$default(this.f86129i, null, new b(this, t, null), zy2Var, 1, null);
        return objMutate$default == pd8.getCOROUTINE_SUSPENDED() ? objMutate$default : bth.f14751a;
    }

    @gib
    public final Object stop(@yfb zy2<? super bth> zy2Var) {
        Object objMutate$default = w7b.mutate$default(this.f86129i, null, new c(this, null), zy2Var, 1, null);
        return objMutate$default == pd8.getCOROUTINE_SUSPENDED() ? objMutate$default : bth.f14751a;
    }

    public final void updateBounds(@gib T t, @gib T t2) {
        V vInvoke;
        V vInvoke2;
        if (t == null || (vInvoke = this.f86121a.getConvertToVector().invoke(t)) == null) {
            vInvoke = this.f86131k;
        }
        if (t2 == null || (vInvoke2 = this.f86121a.getConvertToVector().invoke(t2)) == null) {
            vInvoke2 = this.f86132l;
        }
        int size$animation_core_release = vInvoke.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            if (!(vInvoke.get$animation_core_release(i) <= vInvoke2.get$animation_core_release(i))) {
                c8d.throwIllegalStateException("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + vInvoke + " is greater than upper bound " + vInvoke2 + " on index " + i);
            }
        }
        this.f86133m = vInvoke;
        this.f86134n = vInvoke2;
        this.f86128h = t2;
        this.f86127g = t;
        if (isRunning()) {
            return;
        }
        T tClampToBounds = clampToBounds(getValue());
        if (md8.areEqual(tClampToBounds, getValue())) {
            return;
        }
        this.f86124d.setValue$animation_core_release(tClampToBounds);
    }

    public /* synthetic */ C13257tw(Object obj, alh alhVar, Object obj2, String str, int i, jt3 jt3Var) {
        this(obj, alhVar, (i & 4) != 0 ? null : obj2, (i & 8) != 0 ? "Animatable" : str);
    }

    public /* synthetic */ C13257tw(Object obj, alh alhVar, Object obj2, int i, jt3 jt3Var) {
        this(obj, alhVar, (i & 4) != 0 ? null : obj2);
    }

    @q64(level = u64.f86867c, message = "Maintained for binary compatibility", replaceWith = @i2e(expression = "Animatable(initialValue, typeConverter, visibilityThreshold, \"Animatable\")", imports = {}))
    public /* synthetic */ C13257tw(Object obj, alh alhVar, Object obj2) {
        this(obj, alhVar, obj2, "Animatable");
    }
}

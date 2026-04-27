package p000;

import p000.jvd;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSuspendAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendAnimation.kt\nandroidx/compose/animation/core/SuspendAnimationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n*L\n1#1,363:1\n1#2:364\n54#3,7:365\n*S KotlinDebug\n*F\n+ 1 SuspendAnimation.kt\nandroidx/compose/animation/core/SuspendAnimationKt\n*L\n312#1:365,7\n*E\n"})
public final class rgg {

    /* JADX INFO: Add missing generic type declarations: [T, V] */
    /* JADX INFO: renamed from: rgg$a */
    public static final class C12075a<T, V> extends tt8 implements qy6<C10714oy<T, V>, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gz6<T, T, bth> f78248a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ alh<T, V> f78249b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12075a(gz6<? super T, ? super T, bth> gz6Var, alh<T, V> alhVar) {
            super(1);
            this.f78248a = gz6Var;
            this.f78249b = alhVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Object obj) {
            invoke((C10714oy) obj);
            return bth.f14751a;
        }

        public final void invoke(@yfb C10714oy<T, V> c10714oy) {
            this.f78248a.invoke(c10714oy.getValue(), this.f78249b.getConvertFromVector().invoke(c10714oy.getVelocityVector()));
        }
    }

    /* JADX INFO: renamed from: rgg$b */
    @ck3(m4009c = "androidx.compose.animation.core.SuspendAnimationKt", m4010f = "SuspendAnimation.kt", m4011i = {0, 0, 0, 0, 1, 1, 1, 1}, m4012l = {239, 278}, m4013m = "animate", m4014n = {"$this$animate", b77.f12866m, "block", "lateInitScope", "$this$animate", b77.f12866m, "block", "lateInitScope"}, m4015s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    public static final class C12076b<T, V extends AbstractC16313zy> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f78250a;

        /* JADX INFO: renamed from: b */
        public Object f78251b;

        /* JADX INFO: renamed from: c */
        public Object f78252c;

        /* JADX INFO: renamed from: d */
        public Object f78253d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f78254e;

        /* JADX INFO: renamed from: f */
        public int f78255f;

        public C12076b(zy2<? super C12076b> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f78254e = obj;
            this.f78255f |= Integer.MIN_VALUE;
            return rgg.animate(null, null, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: rgg$c */
    public static final class C12077c extends tt8 implements qy6<C10714oy<Object, Object>, bth> {

        /* JADX INFO: renamed from: a */
        public static final C12077c f78256a = new C12077c();

        public C12077c() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(C10714oy<Object, Object> c10714oy) {
            invoke2(c10714oy);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb C10714oy<Object, Object> c10714oy) {
        }
    }

    /* JADX INFO: renamed from: rgg$d */
    public static final class C12078d extends tt8 implements qy6<Long, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8121h<C10714oy<T, V>> f78257a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ T f78258b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC6643gy<T, V> f78259c;

        /* JADX INFO: Incorrect field signature: TV; */
        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AbstractC16313zy f78260d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C12364ry<T, V> f78261e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ float f78262f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ qy6<C10714oy<T, V>, bth> f78263m;

        /* JADX INFO: renamed from: rgg$d$a */
        public static final class a extends tt8 implements ny6<bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C12364ry<T, V> f78264a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C12364ry<T, V> c12364ry) {
                super(0);
                this.f78264a = c12364ry;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f78264a.setRunning$animation_core_release(false);
            }

            @Override // p000.ny6
            public /* bridge */ /* synthetic */ bth invoke() {
                invoke2();
                return bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Ljvd$h<Loy<TT;TV;>;>;TT;Lgy<TT;TV;>;TV;Lry<TT;TV;>;FLqy6<-Loy<TT;TV;>;Lbth;>;)V */
        /* JADX WARN: Multi-variable type inference failed */
        public C12078d(jvd.C8121h c8121h, Object obj, InterfaceC6643gy interfaceC6643gy, AbstractC16313zy abstractC16313zy, C12364ry c12364ry, float f, qy6 qy6Var) {
            super(1);
            this.f78257a = c8121h;
            this.f78258b = obj;
            this.f78259c = interfaceC6643gy;
            this.f78260d = abstractC16313zy;
            this.f78261e = c12364ry;
            this.f78262f = f;
            this.f78263m = qy6Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Long l) {
            invoke(l.longValue());
            return bth.f14751a;
        }

        /* JADX WARN: Type inference failed for: r12v0, types: [T, oy] */
        public final void invoke(long j) {
            jvd.C8121h<C10714oy<T, V>> c8121h = this.f78257a;
            ?? c10714oy = new C10714oy(this.f78258b, this.f78259c.getTypeConverter(), this.f78260d, j, this.f78259c.getTargetValue(), j, true, new a(this.f78261e));
            rgg.doAnimationFrameWithScale(c10714oy, j, this.f78262f, this.f78259c, this.f78261e, this.f78263m);
            c8121h.f52110a = c10714oy;
        }
    }

    /* JADX INFO: renamed from: rgg$e */
    public static final class C12079e extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C12364ry<T, V> f78265a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12079e(C12364ry<T, V> c12364ry) {
            super(0);
            this.f78265a = c12364ry;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f78265a.setRunning$animation_core_release(false);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: rgg$f */
    public static final class C12080f extends tt8 implements qy6<Long, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8121h<C10714oy<T, V>> f78266a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f78267b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC6643gy<T, V> f78268c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C12364ry<T, V> f78269d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ qy6<C10714oy<T, V>, bth> f78270e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12080f(jvd.C8121h<C10714oy<T, V>> c8121h, float f, InterfaceC6643gy<T, V> interfaceC6643gy, C12364ry<T, V> c12364ry, qy6<? super C10714oy<T, V>, bth> qy6Var) {
            super(1);
            this.f78266a = c8121h;
            this.f78267b = f;
            this.f78268c = interfaceC6643gy;
            this.f78269d = c12364ry;
            this.f78270e = qy6Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Long l) {
            invoke(l.longValue());
            return bth.f14751a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(long j) {
            T t = this.f78266a.f52110a;
            md8.checkNotNull(t);
            rgg.doAnimationFrameWithScale((C10714oy) t, j, this.f78267b, this.f78268c, this.f78269d, this.f78270e);
        }
    }

    /* JADX INFO: renamed from: rgg$g */
    public static final class C12081g extends tt8 implements qy6<C10714oy<Float, C14294vy>, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gz6<Float, Float, bth> f78271a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12081g(gz6<? super Float, ? super Float, bth> gz6Var) {
            super(1);
            this.f78271a = gz6Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(C10714oy<Float, C14294vy> c10714oy) {
            invoke2(c10714oy);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb C10714oy<Float, C14294vy> c10714oy) {
            this.f78271a.invoke(c10714oy.getValue(), Float.valueOf(((C14294vy) c10714oy.getVelocityVector()).getValue()));
        }
    }

    /* JADX INFO: renamed from: rgg$h */
    public static final class C12082h extends tt8 implements qy6<C10714oy<Object, Object>, bth> {

        /* JADX INFO: renamed from: a */
        public static final C12082h f78272a = new C12082h();

        public C12082h() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(C10714oy<Object, Object> c10714oy) {
            invoke2(c10714oy);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb C10714oy<Object, Object> c10714oy) {
        }
    }

    /* JADX INFO: renamed from: rgg$i */
    public static final class C12083i extends tt8 implements qy6<C10714oy<Object, Object>, bth> {

        /* JADX INFO: renamed from: a */
        public static final C12083i f78273a = new C12083i();

        public C12083i() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(C10714oy<Object, Object> c10714oy) {
            invoke2(c10714oy);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb C10714oy<Object, Object> c10714oy) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: rgg$j */
    public static final class C12084j<R> extends tt8 implements qy6<Long, R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<Long, R> f78274a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12084j(qy6<? super Long, ? extends R> qy6Var) {
            super(1);
            this.f78274a = qy6Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Object invoke(Long l) {
            return invoke(l.longValue());
        }

        public final R invoke(long j) {
            return this.f78274a.invoke(Long.valueOf(j));
        }
    }

    @gib
    public static final Object animate(float f, float f2, float f3, @yfb InterfaceC11178py<Float> interfaceC11178py, @yfb gz6<? super Float, ? super Float, bth> gz6Var, @yfb zy2<? super bth> zy2Var) {
        Object objAnimate = animate(g3i.getVectorConverter(d46.f28382a), wc1.boxFloat(f), wc1.boxFloat(f2), wc1.boxFloat(f3), interfaceC11178py, gz6Var, zy2Var);
        return objAnimate == pd8.getCOROUTINE_SUSPENDED() ? objAnimate : bth.f14751a;
    }

    public static /* synthetic */ Object animate$default(float f, float f2, float f3, InterfaceC11178py interfaceC11178py, gz6 gz6Var, zy2 zy2Var, int i, Object obj) {
        float f4 = (i & 4) != 0 ? 0.0f : f3;
        if ((i & 8) != 0) {
            interfaceC11178py = C11760qy.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animate(f, f2, f4, interfaceC11178py, gz6Var, zy2Var);
    }

    @gib
    public static final Object animateDecay(float f, float f2, @yfb e46 e46Var, @yfb gz6<? super Float, ? super Float, bth> gz6Var, @yfb zy2<? super bth> zy2Var) {
        Object objAnimate$default = animate$default(C12827sy.AnimationState$default(f, f2, 0L, 0L, false, 28, null), C8551ky.DecayAnimation(e46Var, f, f2), 0L, new C12081g(gz6Var), zy2Var, 2, null);
        return objAnimate$default == pd8.getCOROUTINE_SUSPENDED() ? objAnimate$default : bth.f14751a;
    }

    public static /* synthetic */ Object animateDecay$default(C12364ry c12364ry, vk3 vk3Var, boolean z, qy6 qy6Var, zy2 zy2Var, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            qy6Var = C12082h.f78272a;
        }
        return animateDecay(c12364ry, vk3Var, z, qy6Var, (zy2<? super bth>) zy2Var);
    }

    @gib
    public static final <T, V extends AbstractC16313zy> Object animateTo(@yfb C12364ry<T, V> c12364ry, T t, @yfb InterfaceC11178py<T> interfaceC11178py, boolean z, @yfb qy6<? super C10714oy<T, V>, bth> qy6Var, @yfb zy2<? super bth> zy2Var) {
        Object objAnimate = animate(c12364ry, new qmg(interfaceC11178py, c12364ry.getTypeConverter(), c12364ry.getValue(), t, c12364ry.getVelocityVector()), z ? c12364ry.getLastFrameTimeNanos() : Long.MIN_VALUE, qy6Var, zy2Var);
        return objAnimate == pd8.getCOROUTINE_SUSPENDED() ? objAnimate : bth.f14751a;
    }

    public static /* synthetic */ Object animateTo$default(C12364ry c12364ry, Object obj, InterfaceC11178py interfaceC11178py, boolean z, qy6 qy6Var, zy2 zy2Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            interfaceC11178py = C11760qy.spring$default(0.0f, 0.0f, null, 7, null);
        }
        InterfaceC11178py interfaceC11178py2 = interfaceC11178py;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            qy6Var = C12083i.f78273a;
        }
        return animateTo(c12364ry, obj, interfaceC11178py2, z2, qy6Var, zy2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <R, T, V extends AbstractC16313zy> Object callWithFrameNanos(InterfaceC6643gy<T, V> interfaceC6643gy, qy6<? super Long, ? extends R> qy6Var, zy2<? super R> zy2Var) {
        return interfaceC6643gy.isInfinite() ? d18.withInfiniteAnimationFrameNanos(qy6Var, zy2Var) : sya.withFrameNanos(new C12084j(qy6Var), zy2Var);
    }

    private static final <T, V extends AbstractC16313zy> void doAnimationFrame(C10714oy<T, V> c10714oy, long j, long j2, InterfaceC6643gy<T, V> interfaceC6643gy, C12364ry<T, V> c12364ry, qy6<? super C10714oy<T, V>, bth> qy6Var) {
        c10714oy.setLastFrameTimeNanos$animation_core_release(j);
        c10714oy.setValue$animation_core_release(interfaceC6643gy.getValueFromNanos(j2));
        c10714oy.setVelocityVector$animation_core_release(interfaceC6643gy.getVelocityVectorFromNanos(j2));
        if (interfaceC6643gy.isFinishedFromNanos(j2)) {
            c10714oy.setFinishedTimeNanos$animation_core_release(c10714oy.getLastFrameTimeNanos());
            c10714oy.setRunning$animation_core_release(false);
        }
        updateState(c10714oy, c12364ry);
        qy6Var.invoke(c10714oy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends AbstractC16313zy> void doAnimationFrameWithScale(C10714oy<T, V> c10714oy, long j, float f, InterfaceC6643gy<T, V> interfaceC6643gy, C12364ry<T, V> c12364ry, qy6<? super C10714oy<T, V>, bth> qy6Var) {
        doAnimationFrame(c10714oy, j, f == 0.0f ? interfaceC6643gy.getDurationNanos() : (long) ((j - c10714oy.getStartTimeNanos()) / f), interfaceC6643gy, c12364ry, qy6Var);
    }

    public static final float getDurationScale(@yfb e13 e13Var) {
        fza fzaVar = (fza) e13Var.get(fza.f38062R);
        float scaleFactor = fzaVar != null ? fzaVar.getScaleFactor() : 1.0f;
        if (!(scaleFactor >= 0.0f)) {
            c8d.throwIllegalStateException("negative scale factor");
        }
        return scaleFactor;
    }

    public static final <T, V extends AbstractC16313zy> void updateState(@yfb C10714oy<T, V> c10714oy, @yfb C12364ry<T, V> c12364ry) {
        c12364ry.setValue$animation_core_release(c10714oy.getValue());
        C1667az.copyFrom(c12364ry.getVelocityVector(), c10714oy.getVelocityVector());
        c12364ry.setFinishedTimeNanos$animation_core_release(c10714oy.getFinishedTimeNanos());
        c12364ry.setLastFrameTimeNanos$animation_core_release(c10714oy.getLastFrameTimeNanos());
        c12364ry.setRunning$animation_core_release(c10714oy.isRunning());
    }

    @gib
    public static final <T, V extends AbstractC16313zy> Object animateDecay(@yfb C12364ry<T, V> c12364ry, @yfb vk3<T> vk3Var, boolean z, @yfb qy6<? super C10714oy<T, V>, bth> qy6Var, @yfb zy2<? super bth> zy2Var) {
        Object objAnimate = animate(c12364ry, new uk3((vk3) vk3Var, (alh<T, AbstractC16313zy>) c12364ry.getTypeConverter(), (Object) c12364ry.getValue(), c12364ry.getVelocityVector()), z ? c12364ry.getLastFrameTimeNanos() : Long.MIN_VALUE, qy6Var, zy2Var);
        return objAnimate == pd8.getCOROUTINE_SUSPENDED() ? objAnimate : bth.f14751a;
    }

    public static /* synthetic */ Object animate$default(C12364ry c12364ry, InterfaceC6643gy interfaceC6643gy, long j, qy6 qy6Var, zy2 zy2Var, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Long.MIN_VALUE;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            qy6Var = C12077c.f78256a;
        }
        return animate(c12364ry, interfaceC6643gy, j2, qy6Var, zy2Var);
    }

    @gib
    public static final <T, V extends AbstractC16313zy> Object animate(@yfb alh<T, V> alhVar, T t, T t2, @gib T t3, @yfb InterfaceC11178py<T> interfaceC11178py, @yfb gz6<? super T, ? super T, bth> gz6Var, @yfb zy2<? super bth> zy2Var) {
        V vNewInstance;
        if (t3 == null || (vNewInstance = alhVar.getConvertToVector().invoke(t3)) == null) {
            vNewInstance = C1667az.newInstance(alhVar.getConvertToVector().invoke(t));
        }
        Object objAnimate$default = animate$default(new C12364ry(alhVar, t, vNewInstance, 0L, 0L, false, 56, null), new qmg(interfaceC11178py, alhVar, t, t2, vNewInstance), 0L, new C12075a(gz6Var, alhVar), zy2Var, 2, null);
        return objAnimate$default == pd8.getCOROUTINE_SUSPENDED() ? objAnimate$default : bth.f14751a;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r13v1, types: [T, oy] */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T, V extends p000.AbstractC16313zy> java.lang.Object animate(@p000.yfb p000.C12364ry<T, V> r25, @p000.yfb p000.InterfaceC6643gy<T, V> r26, long r27, @p000.yfb p000.qy6<? super p000.C10714oy<T, V>, p000.bth> r29, @p000.yfb p000.zy2<? super p000.bth> r30) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rgg.animate(ry, gy, long, qy6, zy2):java.lang.Object");
    }
}

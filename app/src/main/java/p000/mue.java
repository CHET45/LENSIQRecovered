package p000;

import com.haibin.calendarview.BuildConfig;
import org.opencv.videoio.Videoio;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n+ 5 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 6 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,2183:1\n81#2:2184\n107#2,2:2185\n81#2:2187\n107#2,2:2188\n76#3:2190\n109#3,2:2191\n33#4,7:2193\n54#4,7:2224\n314#5,11:2200\n314#5,11:2211\n948#6,2:2222\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState\n*L\n225#1:2184\n225#1:2185,2\n227#1:2187\n227#1:2188,2\n256#1:2190\n256#1:2191,2\n501#1:2193,7\n699#1:2224,7\n544#1:2200,11\n565#1:2211,11\n595#1:2222,2\n*E\n"})
@e0g(parameters = 0)
public final class mue<S> extends nfh<S> {

    /* JADX INFO: renamed from: s */
    @yfb
    public static final C9530a f62249s = new C9530a(null);

    /* JADX INFO: renamed from: t */
    public static final int f62250t = 8;

    /* JADX INFO: renamed from: u */
    @yfb
    public static final C14294vy f62251u = new C14294vy(0.0f);

    /* JADX INFO: renamed from: v */
    @yfb
    public static final C14294vy f62252v = new C14294vy(1.0f);

    /* JADX INFO: renamed from: c */
    @yfb
    public final z6b f62253c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final z6b f62254d;

    /* JADX INFO: renamed from: e */
    public S f62255e;

    /* JADX INFO: renamed from: f */
    @gib
    public yeh<S> f62256f;

    /* JADX INFO: renamed from: g */
    public long f62257g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final ny6<bth> f62258h;

    /* JADX INFO: renamed from: i */
    @yfb
    public final b5b f62259i;

    /* JADX INFO: renamed from: j */
    @gib
    public dq1<? super S> f62260j;

    /* JADX INFO: renamed from: k */
    @yfb
    public final y7b f62261k;

    /* JADX INFO: renamed from: l */
    @yfb
    public final w7b f62262l;

    /* JADX INFO: renamed from: m */
    public long f62263m;

    /* JADX INFO: renamed from: n */
    @yfb
    public final f6b<C9531b> f62264n;

    /* JADX INFO: renamed from: o */
    @gib
    public C9531b f62265o;

    /* JADX INFO: renamed from: p */
    @yfb
    public final qy6<Long, bth> f62266p;

    /* JADX INFO: renamed from: q */
    public float f62267q;

    /* JADX INFO: renamed from: r */
    @yfb
    public final qy6<Long, bth> f62268r;

    /* JADX INFO: renamed from: mue$a */
    public static final class C9530a {
        public /* synthetic */ C9530a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final C14294vy getTarget1() {
            return mue.f62252v;
        }

        @yfb
        public final C14294vy getZeroVelocity() {
            return mue.f62251u;
        }

        private C9530a() {
        }
    }

    /* JADX INFO: renamed from: mue$b */
    @e0g(parameters = 0)
    public static final class C9531b {

        /* JADX INFO: renamed from: i */
        public static final int f62269i = 8;

        /* JADX INFO: renamed from: a */
        public long f62270a;

        /* JADX INFO: renamed from: b */
        @gib
        public t3i<C14294vy> f62271b;

        /* JADX INFO: renamed from: c */
        public boolean f62272c;

        /* JADX INFO: renamed from: d */
        public float f62273d;

        /* JADX INFO: renamed from: e */
        @yfb
        public C14294vy f62274e = new C14294vy(0.0f);

        /* JADX INFO: renamed from: f */
        @gib
        public C14294vy f62275f;

        /* JADX INFO: renamed from: g */
        public long f62276g;

        /* JADX INFO: renamed from: h */
        public long f62277h;

        @gib
        public final t3i<C14294vy> getAnimationSpec() {
            return this.f62271b;
        }

        public final long getAnimationSpecDuration() {
            return this.f62277h;
        }

        public final long getDurationNanos() {
            return this.f62276g;
        }

        @gib
        public final C14294vy getInitialVelocity() {
            return this.f62275f;
        }

        public final long getProgressNanos() {
            return this.f62270a;
        }

        @yfb
        public final C14294vy getStart() {
            return this.f62274e;
        }

        public final float getValue() {
            return this.f62273d;
        }

        public final boolean isComplete() {
            return this.f62272c;
        }

        public final void setAnimationSpec(@gib t3i<C14294vy> t3iVar) {
            this.f62271b = t3iVar;
        }

        public final void setAnimationSpecDuration(long j) {
            this.f62277h = j;
        }

        public final void setComplete(boolean z) {
            this.f62272c = z;
        }

        public final void setDurationNanos(long j) {
            this.f62276g = j;
        }

        public final void setInitialVelocity(@gib C14294vy c14294vy) {
            this.f62275f = c14294vy;
        }

        public final void setProgressNanos(long j) {
            this.f62270a = j;
        }

        public final void setStart(@yfb C14294vy c14294vy) {
            this.f62274e = c14294vy;
        }

        public final void setValue(float f) {
            this.f62273d = f;
        }

        @yfb
        public String toString() {
            return "progress nanos: " + this.f62270a + ", animationSpec: " + this.f62271b + ", isComplete: " + this.f62272c + ", value: " + this.f62273d + ", start: " + this.f62274e + ", initialVelocity: " + this.f62275f + ", durationNanos: " + this.f62276g + ", animationSpecDuration: " + this.f62277h;
        }
    }

    /* JADX INFO: renamed from: mue$c */
    @dwf({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState$animateOneFrameLambda$1\n+ 2 ObjectList.kt\nandroidx/collection/ObjectList\n+ 3 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,2183:1\n305#2,6:2184\n80#2:2194\n976#3,4:2190\n980#3,8:2195\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState$animateOneFrameLambda$1\n*L\n314#1:2184,6\n321#1:2194\n321#1:2190,4\n321#1:2195,8\n*E\n"})
    public static final class C9532c extends tt8 implements qy6<Long, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ mue<S> f62278a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9532c(mue<S> mueVar) {
            super(1);
            this.f62278a = mueVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Long l) {
            invoke(l.longValue());
            return bth.f14751a;
        }

        public final void invoke(long j) {
            long j2 = j - this.f62278a.f62263m;
            this.f62278a.f62263m = j;
            long jRoundToLong = p3a.roundToLong(j2 / ((double) this.f62278a.f62267q));
            if (this.f62278a.f62264n.isNotEmpty()) {
                f6b f6bVar = this.f62278a.f62264n;
                mue<S> mueVar = this.f62278a;
                Object[] objArr = f6bVar.f16823a;
                int i = f6bVar.f16824b;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    C9531b c9531b = (C9531b) objArr[i3];
                    mueVar.recalculateAnimationValue(c9531b, jRoundToLong);
                    c9531b.setComplete(true);
                }
                yeh yehVar = this.f62278a.f62256f;
                if (yehVar != null) {
                    yehVar.updateInitialValues$animation_core_release();
                }
                f6b f6bVar2 = this.f62278a.f62264n;
                int i4 = f6bVar2.f16824b;
                Object[] objArr2 = f6bVar2.f16823a;
                f78 f78VarUntil = kpd.until(0, i4);
                int first = f78VarUntil.getFirst();
                int last = f78VarUntil.getLast();
                if (first <= last) {
                    while (true) {
                        objArr2[first - i2] = objArr2[first];
                        if (((C9531b) objArr2[first]).isComplete()) {
                            i2++;
                        }
                        if (first == last) {
                            break;
                        } else {
                            first++;
                        }
                    }
                }
                u70.fill(objArr2, (Object) null, i4 - i2, i4);
                f6bVar2.f16824b -= i2;
            }
            C9531b c9531b2 = this.f62278a.f62265o;
            if (c9531b2 != null) {
                c9531b2.setDurationNanos(this.f62278a.getTotalDurationNanos$animation_core_release());
                this.f62278a.recalculateAnimationValue(c9531b2, jRoundToLong);
                this.f62278a.setFraction(c9531b2.getValue());
                if (c9531b2.getValue() == 1.0f) {
                    this.f62278a.f62265o = null;
                }
                this.f62278a.seekToFraction();
            }
        }
    }

    /* JADX INFO: renamed from: mue$d */
    @ck3(m4009c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2", m4010f = "Transition.kt", m4011i = {}, m4012l = {621}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C9533d extends ugg implements qy6<zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f62279a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ yeh<S> f62280b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ mue<S> f62281c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ S f62282d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ fw5<Float> f62283e;

        /* JADX INFO: renamed from: mue$d$a */
        @ck3(m4009c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1", m4010f = "Transition.kt", m4011i = {0}, m4012l = {2189, 634, 636, 688, 690}, m4013m = "invokeSuspend", m4014n = {"$this$withLock_u24default$iv"}, m4015s = {"L$0"})
        @dwf({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState$animateTo$2$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,2183:1\n120#2,10:2184\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState$animateTo$2$1\n*L\n632#1:2184,10\n*E\n"})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public Object f62284a;

            /* JADX INFO: renamed from: b */
            public Object f62285b;

            /* JADX INFO: renamed from: c */
            public int f62286c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ mue<S> f62287d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ S f62288e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ yeh<S> f62289f;

            /* JADX INFO: renamed from: m */
            public final /* synthetic */ fw5<Float> f62290m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(mue<S> mueVar, S s, yeh<S> yehVar, fw5<Float> fw5Var, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f62287d = mueVar;
                this.f62288e = s;
                this.f62289f = yehVar;
                this.f62290m = fw5Var;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new a(this.f62287d, this.f62288e, this.f62289f, this.f62290m, zy2Var);
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            /* JADX WARN: Removed duplicated region for block: B:31:0x00b7 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x01e7 A[RETURN] */
            @Override // p000.tq0
            @p000.gib
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r19) {
                /*
                    Method dump skipped, instruction units count: 502
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.mue.C9533d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9533d(yeh<S> yehVar, mue<S> mueVar, S s, fw5<Float> fw5Var, zy2<? super C9533d> zy2Var) {
            super(1, zy2Var);
            this.f62280b = yehVar;
            this.f62281c = mueVar;
            this.f62282d = s;
            this.f62283e = fw5Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@yfb zy2<?> zy2Var) {
            return new C9533d(this.f62280b, this.f62281c, this.f62282d, this.f62283e, zy2Var);
        }

        @Override // p000.qy6
        @gib
        public final Object invoke(@gib zy2<? super bth> zy2Var) {
            return ((C9533d) create(zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f62279a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                a aVar = new a(this.f62281c, this.f62282d, this.f62280b, this.f62283e, null);
                this.f62279a = 1;
                if (y13.coroutineScope(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            this.f62280b.onTransitionEnd$animation_core_release();
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: mue$e */
    public static final class C9534e extends tt8 implements qy6<Long, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ mue<S> f62291a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9534e(mue<S> mueVar) {
            super(1);
            this.f62291a = mueVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Long l) {
            invoke(l.longValue());
            return bth.f14751a;
        }

        public final void invoke(long j) {
            this.f62291a.f62263m = j;
        }
    }

    /* JADX INFO: renamed from: mue$f */
    public static final class C9535f extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ mue<S> f62292a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9535f(mue<S> mueVar) {
            super(0);
            this.f62292a = mueVar;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            mue<S> mueVar = this.f62292a;
            yeh yehVar = mueVar.f62256f;
            mueVar.setTotalDurationNanos$animation_core_release(yehVar != null ? yehVar.getTotalDurationNanos() : 0L);
        }
    }

    /* JADX INFO: renamed from: mue$g */
    @ck3(m4009c = "androidx.compose.animation.core.SeekableTransitionState", m4010f = "Transition.kt", m4011i = {0, 1}, m4012l = {BuildConfig.VERSION_CODE, 371}, m4013m = "runAnimations", m4014n = {"this", "this"}, m4015s = {"L$0", "L$0"})
    public static final class C9536g extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f62293a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f62294b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ mue<S> f62295c;

        /* JADX INFO: renamed from: d */
        public int f62296d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9536g(mue<S> mueVar, zy2<? super C9536g> zy2Var) {
            super(zy2Var);
            this.f62295c = mueVar;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f62294b = obj;
            this.f62296d |= Integer.MIN_VALUE;
            return this.f62295c.runAnimations(this);
        }
    }

    /* JADX INFO: renamed from: mue$h */
    @ck3(m4009c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3", m4010f = "Transition.kt", m4011i = {}, m4012l = {507}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C9537h extends ugg implements qy6<zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f62297a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ S f62298b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ S f62299c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ mue<S> f62300d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ yeh<S> f62301e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ float f62302f;

        /* JADX INFO: renamed from: mue$h$a */
        @ck3(m4009c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1", m4010f = "Transition.kt", m4011i = {}, m4012l = {Videoio.CAP_PROP_XI_IMAGE_DATA_FORMAT_RGB32_ALPHA}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f62303a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f62304b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ S f62305c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ S f62306d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ mue<S> f62307e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ yeh<S> f62308f;

            /* JADX INFO: renamed from: m */
            public final /* synthetic */ float f62309m;

            /* JADX INFO: renamed from: mue$h$a$a, reason: collision with other inner class name */
            @ck3(m4009c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1", m4010f = "Transition.kt", m4011i = {}, m4012l = {525}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
            public static final class C16493a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: a */
                public int f62310a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ mue<S> f62311b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16493a(mue<S> mueVar, zy2<? super C16493a> zy2Var) {
                    super(2, zy2Var);
                    this.f62311b = mueVar;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    return new C16493a(this.f62311b, zy2Var);
                }

                @Override // p000.gz6
                @gib
                public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                    return ((C16493a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
                }

                @Override // p000.tq0
                @gib
                public final Object invokeSuspend(@yfb Object obj) {
                    Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                    int i = this.f62310a;
                    if (i == 0) {
                        y7e.throwOnFailure(obj);
                        mue<S> mueVar = this.f62311b;
                        this.f62310a = 1;
                        if (mueVar.runAnimations(this) == coroutine_suspended) {
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
            public a(S s, S s2, mue<S> mueVar, yeh<S> yehVar, float f, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f62305c = s;
                this.f62306d = s2;
                this.f62307e = mueVar;
                this.f62308f = yehVar;
                this.f62309m = f;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                a aVar = new a(this.f62305c, this.f62306d, this.f62307e, this.f62308f, this.f62309m, zy2Var);
                aVar.f62304b = obj;
                return aVar;
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f62303a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    x13 x13Var = (x13) this.f62304b;
                    if (md8.areEqual(this.f62305c, this.f62306d)) {
                        this.f62307e.f62265o = null;
                        if (md8.areEqual(this.f62307e.getCurrentState(), this.f62305c)) {
                            return bth.f14751a;
                        }
                    } else {
                        this.f62307e.moveAnimationToInitialState();
                    }
                    if (!md8.areEqual(this.f62305c, this.f62306d)) {
                        this.f62308f.updateTarget$animation_core_release(this.f62305c);
                        this.f62308f.setPlayTimeNanos(0L);
                        this.f62307e.setTargetState$animation_core_release(this.f62305c);
                        this.f62308f.resetAnimationFraction$animation_core_release(this.f62309m);
                    }
                    this.f62307e.setFraction(this.f62309m);
                    if (this.f62307e.f62264n.isNotEmpty()) {
                        fg1.launch$default(x13Var, null, null, new C16493a(this.f62307e, null), 3, null);
                    } else {
                        this.f62307e.f62263m = Long.MIN_VALUE;
                    }
                    mue<S> mueVar = this.f62307e;
                    this.f62303a = 1;
                    if (mueVar.waitForCompositionAfterTargetStateChange(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                }
                this.f62307e.seekToFraction();
                return bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9537h(S s, S s2, mue<S> mueVar, yeh<S> yehVar, float f, zy2<? super C9537h> zy2Var) {
            super(1, zy2Var);
            this.f62298b = s;
            this.f62299c = s2;
            this.f62300d = mueVar;
            this.f62301e = yehVar;
            this.f62302f = f;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@yfb zy2<?> zy2Var) {
            return new C9537h(this.f62298b, this.f62299c, this.f62300d, this.f62301e, this.f62302f, zy2Var);
        }

        @Override // p000.qy6
        @gib
        public final Object invoke(@gib zy2<? super bth> zy2Var) {
            return ((C9537h) create(zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f62297a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                a aVar = new a(this.f62298b, this.f62299c, this.f62300d, this.f62301e, this.f62302f, null);
                this.f62297a = 1;
                if (y13.coroutineScope(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: mue$i */
    @ck3(m4009c = "androidx.compose.animation.core.SeekableTransitionState$snapTo$2", m4010f = "Transition.kt", m4011i = {}, m4012l = {Videoio.CAP_PROP_XI_COLOR_FILTER_ARRAY}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C9538i extends ugg implements qy6<zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f62312a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ mue<S> f62313b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ S f62314c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ yeh<S> f62315d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9538i(mue<S> mueVar, S s, yeh<S> yehVar, zy2<? super C9538i> zy2Var) {
            super(1, zy2Var);
            this.f62313b = mueVar;
            this.f62314c = s;
            this.f62315d = yehVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@yfb zy2<?> zy2Var) {
            return new C9538i(this.f62313b, this.f62314c, this.f62315d, zy2Var);
        }

        @Override // p000.qy6
        @gib
        public final Object invoke(@gib zy2<? super bth> zy2Var) {
            return ((C9538i) create(zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f62312a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                this.f62313b.endAllAnimations();
                this.f62313b.f62263m = Long.MIN_VALUE;
                this.f62313b.setFraction(0.0f);
                S s = this.f62314c;
                float f = md8.areEqual(s, this.f62313b.getCurrentState()) ? -4.0f : md8.areEqual(s, this.f62313b.getTargetState()) ? -5.0f : -3.0f;
                this.f62315d.updateTarget$animation_core_release(this.f62314c);
                this.f62315d.setPlayTimeNanos(0L);
                this.f62313b.setTargetState$animation_core_release(this.f62314c);
                this.f62313b.setFraction(0.0f);
                this.f62313b.setCurrentState$animation_core_release(this.f62314c);
                this.f62315d.resetAnimationFraction$animation_core_release(f);
                if (f == -3.0f) {
                    mue<S> mueVar = this.f62313b;
                    this.f62312a = 1;
                    if (mueVar.waitForCompositionAfterTargetStateChange(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            this.f62315d.onTransitionEnd$animation_core_release();
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: mue$j */
    @ck3(m4009c = "androidx.compose.animation.core.SeekableTransitionState", m4010f = "Transition.kt", m4011i = {0, 0, 1, 1}, m4012l = {Videoio.CAP_PROP_XI_KNEEPOINT2, 2184}, m4013m = "waitForComposition", m4014n = {"this", "expectedState", "this", "expectedState"}, m4015s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class C9539j extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f62316a;

        /* JADX INFO: renamed from: b */
        public Object f62317b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f62318c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ mue<S> f62319d;

        /* JADX INFO: renamed from: e */
        public int f62320e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9539j(mue<S> mueVar, zy2<? super C9539j> zy2Var) {
            super(zy2Var);
            this.f62319d = mueVar;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f62318c = obj;
            this.f62320e |= Integer.MIN_VALUE;
            return this.f62319d.waitForComposition(this);
        }
    }

    /* JADX INFO: renamed from: mue$k */
    @ck3(m4009c = "androidx.compose.animation.core.SeekableTransitionState", m4010f = "Transition.kt", m4011i = {0, 0, 1, 1}, m4012l = {Videoio.CAP_PROP_XI_BUFFER_POLICY, 2184}, m4013m = "waitForCompositionAfterTargetStateChange", m4014n = {"this", "expectedState", "this", "expectedState"}, m4015s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class C9540k extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f62321a;

        /* JADX INFO: renamed from: b */
        public Object f62322b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f62323c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ mue<S> f62324d;

        /* JADX INFO: renamed from: e */
        public int f62325e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9540k(mue<S> mueVar, zy2<? super C9540k> zy2Var) {
            super(zy2Var);
            this.f62324d = mueVar;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f62323c = obj;
            this.f62325e |= Integer.MIN_VALUE;
            return this.f62324d.waitForCompositionAfterTargetStateChange(this);
        }
    }

    public mue(S s) {
        super(null);
        this.f62253c = xtf.mutableStateOf$default(s, null, 2, null);
        this.f62254d = xtf.mutableStateOf$default(s, null, 2, null);
        this.f62255e = s;
        this.f62258h = new C9535f(this);
        this.f62259i = pbd.mutableFloatStateOf(0.0f);
        this.f62261k = e8b.Mutex$default(false, 1, null);
        this.f62262l = new w7b();
        this.f62263m = Long.MIN_VALUE;
        this.f62264n = new f6b<>(0, 1, null);
        this.f62266p = new C9534e(this);
        this.f62268r = new C9532c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateOneFrame(zy2<? super bth> zy2Var) {
        float durationScale = rgg.getDurationScale(zy2Var.getContext());
        if (durationScale <= 0.0f) {
            endAllAnimations();
            return bth.f14751a;
        }
        this.f62267q = durationScale;
        Object objWithFrameNanos = sya.withFrameNanos(this.f62268r, zy2Var);
        return objWithFrameNanos == pd8.getCOROUTINE_SUSPENDED() ? objWithFrameNanos : bth.f14751a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(mue mueVar, Object obj, fw5 fw5Var, zy2 zy2Var, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = mueVar.getTargetState();
        }
        if ((i & 2) != 0) {
            fw5Var = null;
        }
        return mueVar.animateTo(obj, fw5Var, zy2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object doOneFrame(zy2<? super bth> zy2Var) {
        if (this.f62263m == Long.MIN_VALUE) {
            Object objWithFrameNanos = sya.withFrameNanos(this.f62266p, zy2Var);
            return objWithFrameNanos == pd8.getCOROUTINE_SUSPENDED() ? objWithFrameNanos : bth.f14751a;
        }
        Object objAnimateOneFrame = animateOneFrame(zy2Var);
        return objAnimateOneFrame == pd8.getCOROUTINE_SUSPENDED() ? objAnimateOneFrame : bth.f14751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endAllAnimations() {
        yeh<S> yehVar = this.f62256f;
        if (yehVar != null) {
            yehVar.clearInitialAnimations$animation_core_release();
        }
        this.f62264n.clear();
        if (this.f62265o != null) {
            this.f62265o = null;
            setFraction(1.0f);
            seekToFraction();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveAnimationToInitialState() {
        yeh<S> yehVar = this.f62256f;
        if (yehVar == null) {
            return;
        }
        C9531b c9531b = this.f62265o;
        if (c9531b == null) {
            if (this.f62257g <= 0 || getFraction() == 1.0f || md8.areEqual(getCurrentState(), getTargetState())) {
                c9531b = null;
            } else {
                c9531b = new C9531b();
                c9531b.setValue(getFraction());
                long j = this.f62257g;
                c9531b.setDurationNanos(j);
                c9531b.setAnimationSpecDuration(p3a.roundToLong(j * (1.0d - ((double) getFraction()))));
                c9531b.getStart().set$animation_core_release(0, getFraction());
            }
        }
        if (c9531b != null) {
            c9531b.setDurationNanos(this.f62257g);
            this.f62264n.add(c9531b);
            yehVar.setInitialAnimations$animation_core_release(c9531b);
        }
        this.f62265o = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recalculateAnimationValue(C9531b c9531b, long j) {
        long progressNanos = c9531b.getProgressNanos() + j;
        c9531b.setProgressNanos(progressNanos);
        long animationSpecDuration = c9531b.getAnimationSpecDuration();
        if (progressNanos >= animationSpecDuration) {
            c9531b.setValue(1.0f);
            return;
        }
        t3i<C14294vy> animationSpec = c9531b.getAnimationSpec();
        if (animationSpec == null) {
            c9531b.setValue(g3i.lerp(c9531b.getStart().get$animation_core_release(0), 1.0f, progressNanos / animationSpecDuration));
            return;
        }
        C14294vy start = c9531b.getStart();
        C14294vy c14294vy = f62252v;
        C14294vy initialVelocity = c9531b.getInitialVelocity();
        if (initialVelocity == null) {
            initialVelocity = f62251u;
        }
        c9531b.setValue(kpd.coerceIn(((C14294vy) animationSpec.getValueFromNanos(progressNanos, start, c14294vy, initialVelocity)).get$animation_core_release(0), 0.0f, 1.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object runAnimations(p000.zy2<? super p000.bth> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof p000.mue.C9536g
            if (r0 == 0) goto L13
            r0 = r10
            mue$g r0 = (p000.mue.C9536g) r0
            int r1 = r0.f62296d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62296d = r1
            goto L18
        L13:
            mue$g r0 = new mue$g
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f62294b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f62296d
            r3 = 2
            r4 = 1
            r5 = -9223372036854775808
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            goto L33
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L33:
            java.lang.Object r2 = r0.f62293a
            mue r2 = (p000.mue) r2
            p000.y7e.throwOnFailure(r10)
            goto L76
        L3b:
            p000.y7e.throwOnFailure(r10)
            f6b<mue$b> r10 = r9.f62264n
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L4d
            mue$b r10 = r9.f62265o
            if (r10 != 0) goto L4d
            bth r10 = p000.bth.f14751a
            return r10
        L4d:
            e13 r10 = r0.getContext()
            float r10 = p000.rgg.getDurationScale(r10)
            r2 = 0
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 != 0) goto L62
            r9.endAllAnimations()
            r9.f62263m = r5
            bth r10 = p000.bth.f14751a
            return r10
        L62:
            long r7 = r9.f62263m
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 != 0) goto L75
            qy6<java.lang.Long, bth> r10 = r9.f62266p
            r0.f62293a = r9
            r0.f62296d = r4
            java.lang.Object r10 = p000.sya.withFrameNanos(r10, r0)
            if (r10 != r1) goto L75
            return r1
        L75:
            r2 = r9
        L76:
            f6b<mue$b> r10 = r2.f62264n
            boolean r10 = r10.isNotEmpty()
            if (r10 != 0) goto L88
            mue$b r10 = r2.f62265o
            if (r10 == 0) goto L83
            goto L88
        L83:
            r2.f62263m = r5
            bth r10 = p000.bth.f14751a
            return r10
        L88:
            r0.f62293a = r2
            r0.f62296d = r3
            java.lang.Object r10 = r2.animateOneFrame(r0)
            if (r10 != r1) goto L76
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.mue.runAnimations(zy2):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object seekTo$default(mue mueVar, float f, Object obj, zy2 zy2Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = mueVar.getTargetState();
        }
        return mueVar.seekTo(f, obj, zy2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void seekToFraction() {
        yeh<S> yehVar = this.f62256f;
        if (yehVar == null) {
            return;
        }
        yehVar.seekAnimations$animation_core_release(p3a.roundToLong(((double) getFraction()) * yehVar.getTotalDurationNanos()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFraction(float f) {
        this.f62259i.setFloatValue(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object waitForComposition(p000.zy2<? super p000.bth> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p000.mue.C9539j
            if (r0 == 0) goto L13
            r0 = r8
            mue$j r0 = (p000.mue.C9539j) r0
            int r1 = r0.f62320e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62320e = r1
            goto L18
        L13:
            mue$j r0 = new mue$j
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f62318c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f62320e
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r1 = r0.f62317b
            java.lang.Object r0 = r0.f62316a
            mue r0 = (p000.mue) r0
            p000.y7e.throwOnFailure(r8)
            goto L8c
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            java.lang.Object r2 = r0.f62317b
            java.lang.Object r6 = r0.f62316a
            mue r6 = (p000.mue) r6
            p000.y7e.throwOnFailure(r8)
            r8 = r2
            goto L5d
        L46:
            p000.y7e.throwOnFailure(r8)
            java.lang.Object r8 = r7.getTargetState()
            y7b r2 = r7.f62261k
            r0.f62316a = r7
            r0.f62317b = r8
            r0.f62320e = r5
            java.lang.Object r2 = p000.y7b.C15538a.lock$default(r2, r4, r0, r5, r4)
            if (r2 != r1) goto L5c
            return r1
        L5c:
            r6 = r7
        L5d:
            r0.f62316a = r6
            r0.f62317b = r8
            r0.f62320e = r3
            fq1 r2 = new fq1
            zy2 r3 = p000.od8.intercepted(r0)
            r2.<init>(r3, r5)
            r2.initCancellability()
            r6.setCompositionContinuation$animation_core_release(r2)
            y7b r3 = r6.getCompositionContinuationMutex$animation_core_release()
            p000.y7b.C15538a.unlock$default(r3, r4, r5, r4)
            java.lang.Object r2 = r2.getResult()
            java.lang.Object r3 = p000.pd8.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto L86
            p000.jk3.probeCoroutineSuspended(r0)
        L86:
            if (r2 != r1) goto L89
            return r1
        L89:
            r1 = r8
            r8 = r2
            r0 = r6
        L8c:
            boolean r8 = p000.md8.areEqual(r8, r1)
            if (r8 == 0) goto L95
            bth r8 = p000.bth.f14751a
            return r8
        L95:
            r1 = -9223372036854775808
            r0.f62263m = r1
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "targetState while waiting for composition"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.mue.waitForComposition(zy2):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object waitForCompositionAfterTargetStateChange(p000.zy2<? super p000.bth> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p000.mue.C9540k
            if (r0 == 0) goto L13
            r0 = r8
            mue$k r0 = (p000.mue.C9540k) r0
            int r1 = r0.f62325e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62325e = r1
            goto L18
        L13:
            mue$k r0 = new mue$k
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f62323c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f62325e
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r1 = r0.f62322b
            java.lang.Object r0 = r0.f62321a
            mue r0 = (p000.mue) r0
            p000.y7e.throwOnFailure(r8)
            goto L9a
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            java.lang.Object r2 = r0.f62322b
            java.lang.Object r6 = r0.f62321a
            mue r6 = (p000.mue) r6
            p000.y7e.throwOnFailure(r8)
            r8 = r2
            goto L5d
        L46:
            p000.y7e.throwOnFailure(r8)
            java.lang.Object r8 = r7.getTargetState()
            y7b r2 = r7.f62261k
            r0.f62321a = r7
            r0.f62322b = r8
            r0.f62325e = r5
            java.lang.Object r2 = p000.y7b.C15538a.lock$default(r2, r4, r0, r5, r4)
            if (r2 != r1) goto L5c
            return r1
        L5c:
            r6 = r7
        L5d:
            S r2 = r6.f62255e
            boolean r2 = p000.md8.areEqual(r8, r2)
            if (r2 == 0) goto L6b
            y7b r8 = r6.f62261k
            p000.y7b.C15538a.unlock$default(r8, r4, r5, r4)
            goto La0
        L6b:
            r0.f62321a = r6
            r0.f62322b = r8
            r0.f62325e = r3
            fq1 r2 = new fq1
            zy2 r3 = p000.od8.intercepted(r0)
            r2.<init>(r3, r5)
            r2.initCancellability()
            r6.setCompositionContinuation$animation_core_release(r2)
            y7b r3 = r6.getCompositionContinuationMutex$animation_core_release()
            p000.y7b.C15538a.unlock$default(r3, r4, r5, r4)
            java.lang.Object r2 = r2.getResult()
            java.lang.Object r3 = p000.pd8.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto L94
            p000.jk3.probeCoroutineSuspended(r0)
        L94:
            if (r2 != r1) goto L97
            return r1
        L97:
            r1 = r8
            r8 = r2
            r0 = r6
        L9a:
            boolean r2 = p000.md8.areEqual(r8, r1)
            if (r2 == 0) goto La3
        La0:
            bth r8 = p000.bth.f14751a
            return r8
        La3:
            r2 = -9223372036854775808
            r0.f62263m = r2
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "snapTo() was canceled because state was changed to "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = " instead of "
            r2.append(r8)
            r2.append(r1)
            java.lang.String r8 = r2.toString()
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.mue.waitForCompositionAfterTargetStateChange(zy2):java.lang.Object");
    }

    @gib
    public final Object animateTo(S s, @gib fw5<Float> fw5Var, @yfb zy2<? super bth> zy2Var) {
        Object objMutate$default;
        yeh<S> yehVar = this.f62256f;
        return (yehVar != null && (objMutate$default = w7b.mutate$default(this.f62262l, null, new C9533d(yehVar, this, s, fw5Var, null), zy2Var, 1, null)) == pd8.getCOROUTINE_SUSPENDED()) ? objMutate$default : bth.f14751a;
    }

    public final S getComposedTargetState$animation_core_release() {
        return this.f62255e;
    }

    @gib
    public final dq1<S> getCompositionContinuation$animation_core_release() {
        return this.f62260j;
    }

    @yfb
    public final y7b getCompositionContinuationMutex$animation_core_release() {
        return this.f62261k;
    }

    @Override // p000.nfh
    public S getCurrentState() {
        return (S) this.f62254d.getValue();
    }

    @y46(from = 0.0d, m25645to = 1.0d)
    public final float getFraction() {
        return this.f62259i.getFloatValue();
    }

    @Override // p000.nfh
    public S getTargetState() {
        return (S) this.f62253c.getValue();
    }

    public final long getTotalDurationNanos$animation_core_release() {
        return this.f62257g;
    }

    public final void observeTotalDuration$animation_core_release() {
        ffh.getSeekableStateObserver().observeReads(this, ffh.f36458b, this.f62258h);
    }

    public final void onTotalDurationChanged$animation_core_release() {
        long j = this.f62257g;
        observeTotalDuration$animation_core_release();
        long j2 = this.f62257g;
        if (j != j2) {
            C9531b c9531b = this.f62265o;
            if (c9531b == null) {
                seekToFraction();
                return;
            }
            c9531b.setDurationNanos(j2);
            if (c9531b.getAnimationSpec() == null) {
                c9531b.setAnimationSpecDuration(p3a.roundToLong((1.0d - ((double) c9531b.getStart().get$animation_core_release(0))) * this.f62257g));
            }
        }
    }

    @gib
    public final Object seekTo(@y46(from = 0.0d, m25645to = 1.0d) float f, S s, @yfb zy2<? super bth> zy2Var) {
        boolean z = false;
        if (0.0f <= f && f <= 1.0f) {
            z = true;
        }
        if (!z) {
            c8d.throwIllegalArgumentException("Expecting fraction between 0 and 1. Got " + f);
        }
        yeh<S> yehVar = this.f62256f;
        if (yehVar == null) {
            return bth.f14751a;
        }
        Object objMutate$default = w7b.mutate$default(this.f62262l, null, new C9537h(s, getTargetState(), this, yehVar, f, null), zy2Var, 1, null);
        return objMutate$default == pd8.getCOROUTINE_SUSPENDED() ? objMutate$default : bth.f14751a;
    }

    public final void setComposedTargetState$animation_core_release(S s) {
        this.f62255e = s;
    }

    public final void setCompositionContinuation$animation_core_release(@gib dq1<? super S> dq1Var) {
        this.f62260j = dq1Var;
    }

    @Override // p000.nfh
    public void setCurrentState$animation_core_release(S s) {
        this.f62254d.setValue(s);
    }

    @Override // p000.nfh
    public void setTargetState$animation_core_release(S s) {
        this.f62253c.setValue(s);
    }

    public final void setTotalDurationNanos$animation_core_release(long j) {
        this.f62257g = j;
    }

    @gib
    public final Object snapTo(S s, @yfb zy2<? super bth> zy2Var) {
        Object objMutate$default;
        yeh<S> yehVar = this.f62256f;
        return yehVar == null ? bth.f14751a : (!(md8.areEqual(getCurrentState(), s) && md8.areEqual(getTargetState(), s)) && (objMutate$default = w7b.mutate$default(this.f62262l, null, new C9538i(this, s, yehVar, null), zy2Var, 1, null)) == pd8.getCOROUTINE_SUSPENDED()) ? objMutate$default : bth.f14751a;
    }

    @Override // p000.nfh
    public void transitionConfigured$animation_core_release(@yfb yeh<S> yehVar) {
        yeh<S> yehVar2 = this.f62256f;
        if (!(yehVar2 == null || md8.areEqual(yehVar, yehVar2))) {
            c8d.throwIllegalStateException("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f62256f + ", new instance: " + yehVar);
        }
        this.f62256f = yehVar;
    }

    @Override // p000.nfh
    public void transitionRemoved$animation_core_release() {
        this.f62256f = null;
        ffh.getSeekableStateObserver().clear(this);
    }
}

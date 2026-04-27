package p000;

/* JADX INFO: loaded from: classes.dex */
public final class jz3 implements ase {

    /* JADX INFO: renamed from: a */
    @yfb
    public final qy6<Float, Float> f52262a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final vre f52263b = new C8148b();

    /* JADX INFO: renamed from: c */
    @yfb
    public final x7b f52264c = new x7b();

    /* JADX INFO: renamed from: d */
    @yfb
    public final z6b<Boolean> f52265d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final z6b<Boolean> f52266e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final z6b<Boolean> f52267f;

    /* JADX INFO: renamed from: jz3$a */
    @ck3(m4009c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", m4010f = "ScrollableState.kt", m4011i = {}, m4012l = {201}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C8147a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f52268a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ j7b f52270c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ gz6<vre, zy2<? super bth>, Object> f52271d;

        /* JADX INFO: renamed from: jz3$a$a */
        @ck3(m4009c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", m4010f = "ScrollableState.kt", m4011i = {}, m4012l = {gm2.f40176m}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<vre, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f52272a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f52273b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ jz3 f52274c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ gz6<vre, zy2<? super bth>, Object> f52275d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(jz3 jz3Var, gz6<? super vre, ? super zy2<? super bth>, ? extends Object> gz6Var, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f52274c = jz3Var;
                this.f52275d = gz6Var;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                a aVar = new a(this.f52274c, this.f52275d, zy2Var);
                aVar.f52273b = obj;
                return aVar;
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb vre vreVar, @gib zy2<? super bth> zy2Var) {
                return ((a) create(vreVar, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f52272a;
                try {
                    if (i == 0) {
                        y7e.throwOnFailure(obj);
                        vre vreVar = (vre) this.f52273b;
                        this.f52274c.f52265d.setValue(wc1.boxBoolean(true));
                        gz6<vre, zy2<? super bth>, Object> gz6Var = this.f52275d;
                        this.f52272a = 1;
                        if (gz6Var.invoke(vreVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y7e.throwOnFailure(obj);
                    }
                    this.f52274c.f52265d.setValue(wc1.boxBoolean(false));
                    return bth.f14751a;
                } catch (Throwable th) {
                    this.f52274c.f52265d.setValue(wc1.boxBoolean(false));
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8147a(j7b j7bVar, gz6<? super vre, ? super zy2<? super bth>, ? extends Object> gz6Var, zy2<? super C8147a> zy2Var) {
            super(2, zy2Var);
            this.f52270c = j7bVar;
            this.f52271d = gz6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return jz3.this.new C8147a(this.f52270c, this.f52271d, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C8147a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f52268a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                x7b x7bVar = jz3.this.f52264c;
                vre vreVar = jz3.this.f52263b;
                j7b j7bVar = this.f52270c;
                a aVar = new a(jz3.this, this.f52271d, null);
                this.f52268a = 1;
                if (x7bVar.mutateWith(vreVar, j7bVar, aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: jz3$b */
    public static final class C8148b implements vre {
        public C8148b() {
        }

        @Override // p000.vre
        public float scrollBy(float f) {
            if (Float.isNaN(f)) {
                return 0.0f;
            }
            float fFloatValue = jz3.this.getOnDelta().invoke(Float.valueOf(f)).floatValue();
            jz3.this.f52266e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
            jz3.this.f52267f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
            return fFloatValue;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jz3(@yfb qy6<? super Float, Float> qy6Var) {
        this.f52262a = qy6Var;
        Boolean bool = Boolean.FALSE;
        this.f52265d = xtf.mutableStateOf$default(bool, null, 2, null);
        this.f52266e = xtf.mutableStateOf$default(bool, null, 2, null);
        this.f52267f = xtf.mutableStateOf$default(bool, null, 2, null);
    }

    @Override // p000.ase
    public float dispatchRawDelta(float f) {
        return this.f52262a.invoke(Float.valueOf(f)).floatValue();
    }

    @Override // p000.ase
    public boolean getLastScrolledBackward() {
        return this.f52267f.getValue().booleanValue();
    }

    @Override // p000.ase
    public boolean getLastScrolledForward() {
        return this.f52266e.getValue().booleanValue();
    }

    @yfb
    public final qy6<Float, Float> getOnDelta() {
        return this.f52262a;
    }

    @Override // p000.ase
    public boolean isScrollInProgress() {
        return this.f52265d.getValue().booleanValue();
    }

    @Override // p000.ase
    @gib
    public Object scroll(@yfb j7b j7bVar, @yfb gz6<? super vre, ? super zy2<? super bth>, ? extends Object> gz6Var, @yfb zy2<? super bth> zy2Var) {
        Object objCoroutineScope = y13.coroutineScope(new C8147a(j7bVar, gz6Var, null), zy2Var);
        return objCoroutineScope == pd8.getCOROUTINE_SUSPENDED() ? objCoroutineScope : bth.f14751a;
    }
}

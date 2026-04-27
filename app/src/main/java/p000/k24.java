package p000;

/* JADX INFO: loaded from: classes.dex */
public final class k24 implements aeh {

    /* JADX INFO: renamed from: a */
    @yfb
    public final kz6<Float, izb, Float, bth> f52428a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final zdh f52429b = new C8175b();

    /* JADX INFO: renamed from: c */
    @yfb
    public final x7b f52430c = new x7b();

    /* JADX INFO: renamed from: d */
    @yfb
    public final z6b<Boolean> f52431d = xtf.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: k24$a */
    @ck3(m4009c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2", m4010f = "TransformableState.kt", m4011i = {}, m4012l = {249}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C8174a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f52432a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ j7b f52434c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ gz6<zdh, zy2<? super bth>, Object> f52435d;

        /* JADX INFO: renamed from: k24$a$a */
        @ck3(m4009c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1", m4010f = "TransformableState.kt", m4011i = {}, m4012l = {252}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<zdh, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f52436a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f52437b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ k24 f52438c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ gz6<zdh, zy2<? super bth>, Object> f52439d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(k24 k24Var, gz6<? super zdh, ? super zy2<? super bth>, ? extends Object> gz6Var, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f52438c = k24Var;
                this.f52439d = gz6Var;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                a aVar = new a(this.f52438c, this.f52439d, zy2Var);
                aVar.f52437b = obj;
                return aVar;
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb zdh zdhVar, @gib zy2<? super bth> zy2Var) {
                return ((a) create(zdhVar, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f52436a;
                try {
                    if (i == 0) {
                        y7e.throwOnFailure(obj);
                        zdh zdhVar = (zdh) this.f52437b;
                        this.f52438c.f52431d.setValue(wc1.boxBoolean(true));
                        gz6<zdh, zy2<? super bth>, Object> gz6Var = this.f52439d;
                        this.f52436a = 1;
                        if (gz6Var.invoke(zdhVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y7e.throwOnFailure(obj);
                    }
                    this.f52438c.f52431d.setValue(wc1.boxBoolean(false));
                    return bth.f14751a;
                } catch (Throwable th) {
                    this.f52438c.f52431d.setValue(wc1.boxBoolean(false));
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8174a(j7b j7bVar, gz6<? super zdh, ? super zy2<? super bth>, ? extends Object> gz6Var, zy2<? super C8174a> zy2Var) {
            super(2, zy2Var);
            this.f52434c = j7bVar;
            this.f52435d = gz6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return k24.this.new C8174a(this.f52434c, this.f52435d, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C8174a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f52432a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                x7b x7bVar = k24.this.f52430c;
                zdh zdhVar = k24.this.f52429b;
                j7b j7bVar = this.f52434c;
                a aVar = new a(k24.this, this.f52435d, null);
                this.f52432a = 1;
                if (x7bVar.mutateWith(zdhVar, j7bVar, aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: k24$b */
    public static final class C8175b implements zdh {
        public C8175b() {
        }

        @Override // p000.zdh
        /* JADX INFO: renamed from: transformBy-d-4ec7I, reason: not valid java name */
        public void mo30630transformByd4ec7I(float f, long j, float f2) {
            k24.this.getOnTransformation().invoke(Float.valueOf(f), izb.m30418boximpl(j), Float.valueOf(f2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k24(@yfb kz6<? super Float, ? super izb, ? super Float, bth> kz6Var) {
        this.f52428a = kz6Var;
    }

    @yfb
    public final kz6<Float, izb, Float, bth> getOnTransformation() {
        return this.f52428a;
    }

    @Override // p000.aeh
    public boolean isTransformInProgress() {
        return this.f52431d.getValue().booleanValue();
    }

    @Override // p000.aeh
    @gib
    public Object transform(@yfb j7b j7bVar, @yfb gz6<? super zdh, ? super zy2<? super bth>, ? extends Object> gz6Var, @yfb zy2<? super bth> zy2Var) {
        Object objCoroutineScope = y13.coroutineScope(new C8174a(j7bVar, gz6Var, null), zy2Var);
        return objCoroutineScope == pd8.getCOROUTINE_SUSPENDED() ? objCoroutineScope : bth.f14751a;
    }
}

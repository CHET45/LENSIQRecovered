package p000;

/* JADX INFO: loaded from: classes.dex */
public final class wt3 implements qo4 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final qy6<izb, bth> f95476a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final sn4 f95477b = new C14795b();

    /* JADX INFO: renamed from: c */
    @yfb
    public final x7b f95478c = new x7b();

    /* JADX INFO: renamed from: wt3$a */
    @ck3(m4009c = "androidx.compose.foundation.gestures.DefaultDraggable2DState$drag$2", m4010f = "Draggable2D.kt", m4011i = {}, m4012l = {497}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C14794a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f95479a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ j7b f95481c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ gz6<sn4, zy2<? super bth>, Object> f95482d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14794a(j7b j7bVar, gz6<? super sn4, ? super zy2<? super bth>, ? extends Object> gz6Var, zy2<? super C14794a> zy2Var) {
            super(2, zy2Var);
            this.f95481c = j7bVar;
            this.f95482d = gz6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return wt3.this.new C14794a(this.f95481c, this.f95482d, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C14794a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f95479a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                x7b x7bVar = wt3.this.f95478c;
                sn4 sn4Var = wt3.this.f95477b;
                j7b j7bVar = this.f95481c;
                gz6<sn4, zy2<? super bth>, Object> gz6Var = this.f95482d;
                this.f95479a = 1;
                if (x7bVar.mutateWith(sn4Var, j7bVar, gz6Var, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: wt3$b */
    public static final class C14795b implements sn4 {
        public C14795b() {
        }

        @Override // p000.sn4
        /* JADX INFO: renamed from: dragBy-k-4lQ0M */
        public void mo32312dragByk4lQ0M(long j) {
            wt3.this.getOnDelta().invoke(izb.m30418boximpl(j));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wt3(@yfb qy6<? super izb, bth> qy6Var) {
        this.f95476a = qy6Var;
    }

    @Override // p000.qo4
    /* JADX INFO: renamed from: dispatchRawDelta-k-4lQ0M */
    public void mo31959dispatchRawDeltak4lQ0M(long j) {
        this.f95476a.invoke(izb.m30418boximpl(j));
    }

    @Override // p000.qo4
    @gib
    public Object drag(@yfb j7b j7bVar, @yfb gz6<? super sn4, ? super zy2<? super bth>, ? extends Object> gz6Var, @yfb zy2<? super bth> zy2Var) {
        Object objCoroutineScope = y13.coroutineScope(new C14794a(j7bVar, gz6Var, null), zy2Var);
        return objCoroutineScope == pd8.getCOROUTINE_SUSPENDED() ? objCoroutineScope : bth.f14751a;
    }

    @yfb
    public final qy6<izb, bth> getOnDelta() {
        return this.f95476a;
    }
}

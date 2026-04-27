package p000;

/* JADX INFO: loaded from: classes.dex */
public final class xt3 implements wo4 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final qy6<Float, bth> f99180a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final ko4 f99181b = new C15273b();

    /* JADX INFO: renamed from: c */
    @yfb
    public final x7b f99182c = new x7b();

    /* JADX INFO: renamed from: xt3$a */
    @ck3(m4009c = "androidx.compose.foundation.gestures.DefaultDraggableState$drag$2", m4010f = "Draggable.kt", m4011i = {}, m4012l = {623}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C15272a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f99183a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ j7b f99185c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ gz6<ko4, zy2<? super bth>, Object> f99186d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15272a(j7b j7bVar, gz6<? super ko4, ? super zy2<? super bth>, ? extends Object> gz6Var, zy2<? super C15272a> zy2Var) {
            super(2, zy2Var);
            this.f99185c = j7bVar;
            this.f99186d = gz6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return xt3.this.new C15272a(this.f99185c, this.f99186d, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C15272a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f99183a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                x7b x7bVar = xt3.this.f99182c;
                ko4 ko4Var = xt3.this.f99181b;
                j7b j7bVar = this.f99185c;
                gz6<ko4, zy2<? super bth>, Object> gz6Var = this.f99186d;
                this.f99183a = 1;
                if (x7bVar.mutateWith(ko4Var, j7bVar, gz6Var, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: xt3$b */
    public static final class C15273b implements ko4 {
        public C15273b() {
        }

        @Override // p000.ko4
        public void dragBy(float f) {
            xt3.this.getOnDelta().invoke(Float.valueOf(f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xt3(@yfb qy6<? super Float, bth> qy6Var) {
        this.f99180a = qy6Var;
    }

    @Override // p000.wo4
    public void dispatchRawDelta(float f) {
        this.f99180a.invoke(Float.valueOf(f));
    }

    @Override // p000.wo4
    @gib
    public Object drag(@yfb j7b j7bVar, @yfb gz6<? super ko4, ? super zy2<? super bth>, ? extends Object> gz6Var, @yfb zy2<? super bth> zy2Var) {
        Object objCoroutineScope = y13.coroutineScope(new C15272a(j7bVar, gz6Var, null), zy2Var);
        return objCoroutineScope == pd8.getCOROUTINE_SUSPENDED() ? objCoroutineScope : bth.f14751a;
    }

    @yfb
    public final qy6<Float, bth> getOnDelta() {
        return this.f99180a;
    }
}

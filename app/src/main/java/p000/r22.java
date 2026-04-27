package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public class r22 extends AbstractC8563l0 {

    /* JADX INFO: renamed from: r2 */
    public static final int f76827r2 = 0;

    /* JADX INFO: renamed from: r22$a */
    @ck3(m4009c = "androidx.compose.foundation.ClickableNode$clickPointerInput$2", m4010f = "Clickable.kt", m4011i = {}, m4012l = {636}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C11849a extends ugg implements kz6<pad, izb, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f76828a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f76829b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ long f76830c;

        public C11849a(zy2<? super C11849a> zy2Var) {
            super(3, zy2Var);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ Object invoke(pad padVar, izb izbVar, zy2<? super bth> zy2Var) {
            return m32073invoked4ec7I(padVar, izbVar.m30439unboximpl(), zy2Var);
        }

        @gib
        /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m32073invoked4ec7I(@yfb pad padVar, long j, @gib zy2<? super bth> zy2Var) {
            C11849a c11849a = r22.this.new C11849a(zy2Var);
            c11849a.f76829b = padVar;
            c11849a.f76830c = j;
            return c11849a.invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f76828a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                pad padVar = (pad) this.f76829b;
                long j = this.f76830c;
                if (r22.this.getEnabled()) {
                    r22 r22Var = r22.this;
                    this.f76828a = 1;
                    if (r22Var.m15183e(padVar, j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* JADX INFO: renamed from: r22$b */
    public static final class C11850b extends tt8 implements qy6<izb, bth> {
        public C11850b() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(izb izbVar) {
            m32074invokek4lQ0M(izbVar.m30439unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m32074invokek4lQ0M(long j) {
            if (r22.this.getEnabled()) {
                r22.this.m15182d().invoke();
            }
        }
    }

    public /* synthetic */ r22(l5b l5bVar, y08 y08Var, boolean z, String str, jae jaeVar, ny6 ny6Var, jt3 jt3Var) {
        this(l5bVar, y08Var, z, str, jaeVar, ny6Var);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m20794h(r22 r22Var, s2d s2dVar, zy2<? super bth> zy2Var) {
        Object objDetectTapAndPress = dmg.detectTapAndPress(s2dVar, r22Var.new C11849a(null), r22Var.new C11850b(), zy2Var);
        return objDetectTapAndPress == pd8.getCOROUTINE_SUSPENDED() ? objDetectTapAndPress : bth.f14751a;
    }

    @Override // p000.AbstractC8563l0
    @gib
    public Object clickPointerInput(@yfb s2d s2dVar, @yfb zy2<? super bth> zy2Var) {
        return m20794h(this, s2dVar, zy2Var);
    }

    /* JADX INFO: renamed from: update-QzZPfjk, reason: not valid java name */
    public final void m32072updateQzZPfjk(@gib l5b l5bVar, @gib y08 y08Var, boolean z, @gib String str, @gib jae jaeVar, @yfb ny6<bth> ny6Var) {
        m15185g(l5bVar, y08Var, z, str, jaeVar, ny6Var);
    }

    private r22(l5b l5bVar, y08 y08Var, boolean z, String str, jae jaeVar, ny6<bth> ny6Var) {
        super(l5bVar, y08Var, z, str, jaeVar, ny6Var, null);
    }
}

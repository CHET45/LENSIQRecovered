package p000;

/* JADX INFO: loaded from: classes.dex */
public final class gb2 extends AbstractC8563l0 implements fb2 {

    /* JADX INFO: renamed from: r2 */
    @gib
    public String f39194r2;

    /* JADX INFO: renamed from: s2 */
    @gib
    public ny6<bth> f39195s2;

    /* JADX INFO: renamed from: t2 */
    @gib
    public ny6<bth> f39196t2;

    /* JADX INFO: renamed from: gb2$a */
    public static final class C6188a extends tt8 implements ny6<Boolean> {
        public C6188a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Boolean invoke() {
            ny6 ny6Var = gb2.this.f39195s2;
            if (ny6Var != null) {
                ny6Var.invoke();
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: gb2$b */
    public static final class C6189b extends tt8 implements qy6<izb, bth> {
        public C6189b() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(izb izbVar) {
            m29707invokek4lQ0M(izbVar.m30439unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m29707invokek4lQ0M(long j) {
            ny6 ny6Var = gb2.this.f39196t2;
            if (ny6Var != null) {
                ny6Var.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: gb2$c */
    public static final class C6190c extends tt8 implements qy6<izb, bth> {
        public C6190c() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(izb izbVar) {
            m29708invokek4lQ0M(izbVar.m30439unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m29708invokek4lQ0M(long j) {
            ny6 ny6Var = gb2.this.f39195s2;
            if (ny6Var != null) {
                ny6Var.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: gb2$d */
    @ck3(m4009c = "androidx.compose.foundation.CombinedClickableNodeImpl$clickPointerInput$4", m4010f = "Clickable.kt", m4011i = {}, m4012l = {787}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C6191d extends ugg implements kz6<pad, izb, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f39200a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f39201b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ long f39202c;

        public C6191d(zy2<? super C6191d> zy2Var) {
            super(3, zy2Var);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ Object invoke(pad padVar, izb izbVar, zy2<? super bth> zy2Var) {
            return m29709invoked4ec7I(padVar, izbVar.m30439unboximpl(), zy2Var);
        }

        @gib
        /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m29709invoked4ec7I(@yfb pad padVar, long j, @gib zy2<? super bth> zy2Var) {
            C6191d c6191d = gb2.this.new C6191d(zy2Var);
            c6191d.f39201b = padVar;
            c6191d.f39202c = j;
            return c6191d.invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f39200a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                pad padVar = (pad) this.f39201b;
                long j = this.f39202c;
                if (gb2.this.getEnabled()) {
                    gb2 gb2Var = gb2.this;
                    this.f39200a = 1;
                    if (gb2Var.m15183e(padVar, j, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: gb2$e */
    public static final class C6192e extends tt8 implements qy6<izb, bth> {
        public C6192e() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(izb izbVar) {
            m29710invokek4lQ0M(izbVar.m30439unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m29710invokek4lQ0M(long j) {
            if (gb2.this.getEnabled()) {
                gb2.this.m15182d().invoke();
            }
        }
    }

    public /* synthetic */ gb2(ny6 ny6Var, String str, ny6 ny6Var2, ny6 ny6Var3, l5b l5bVar, y08 y08Var, boolean z, String str2, jae jaeVar, jt3 jt3Var) {
        this(ny6Var, str, ny6Var2, ny6Var3, l5bVar, y08Var, z, str2, jaeVar);
    }

    @Override // p000.AbstractC8563l0
    public void applyAdditionalSemantics(@yfb eye eyeVar) {
        if (this.f39195s2 != null) {
            bye.onLongClick(eyeVar, this.f39194r2, new C6188a());
        }
    }

    @Override // p000.AbstractC8563l0
    @gib
    public Object clickPointerInput(@yfb s2d s2dVar, @yfb zy2<? super bth> zy2Var) {
        Object objDetectTapGestures = dmg.detectTapGestures(s2dVar, (!getEnabled() || this.f39196t2 == null) ? null : new C6189b(), (!getEnabled() || this.f39195s2 == null) ? null : new C6190c(), new C6191d(null), new C6192e(), zy2Var);
        return objDetectTapGestures == pd8.getCOROUTINE_SUSPENDED() ? objDetectTapGestures : bth.f14751a;
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: update-nSzSaCc */
    public void mo28907updatenSzSaCc(@yfb ny6<bth> ny6Var, @gib String str, @gib ny6<bth> ny6Var2, @gib ny6<bth> ny6Var3, @gib l5b l5bVar, @gib y08 y08Var, boolean z, @gib String str2, @gib jae jaeVar) {
        boolean z2;
        if (!md8.areEqual(this.f39194r2, str)) {
            this.f39194r2 = str;
            sxe.invalidateSemantics(this);
        }
        if ((this.f39195s2 == null) != (ny6Var2 == null)) {
            m15181c();
            sxe.invalidateSemantics(this);
            z2 = true;
        } else {
            z2 = false;
        }
        this.f39195s2 = ny6Var2;
        if ((this.f39196t2 == null) != (ny6Var3 == null)) {
            z2 = true;
        }
        this.f39196t2 = ny6Var3;
        boolean z3 = getEnabled() != z ? true : z2;
        m15185g(l5bVar, y08Var, z, str2, jaeVar, ny6Var);
        if (z3) {
            m15184f();
        }
    }

    private gb2(ny6<bth> ny6Var, String str, ny6<bth> ny6Var2, ny6<bth> ny6Var3, l5b l5bVar, y08 y08Var, boolean z, String str2, jae jaeVar) {
        super(l5bVar, y08Var, z, str2, jaeVar, ny6Var, null);
        this.f39194r2 = str;
        this.f39195s2 = ny6Var2;
        this.f39196t2 = ny6Var3;
    }
}

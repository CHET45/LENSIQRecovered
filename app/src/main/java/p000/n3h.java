package p000;

/* JADX INFO: loaded from: classes.dex */
public final class n3h extends r22 {

    /* JADX INFO: renamed from: s2 */
    public boolean f63210s2;

    /* JADX INFO: renamed from: t2 */
    @yfb
    public qy6<? super Boolean, bth> f63211t2;

    /* JADX INFO: renamed from: u2 */
    @yfb
    public final ny6<bth> f63212u2;

    /* JADX INFO: renamed from: n3h$a */
    public static final class C9683a extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<Boolean, bth> f63213a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f63214b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9683a(qy6<? super Boolean, bth> qy6Var, boolean z) {
            super(0);
            this.f63213a = qy6Var;
            this.f63214b = z;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f63213a.invoke(Boolean.valueOf(!this.f63214b));
        }
    }

    /* JADX INFO: renamed from: n3h$b */
    public static final class C9684b extends tt8 implements ny6<bth> {
        public C9684b() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            n3h.this.f63211t2.invoke(Boolean.valueOf(!n3h.this.f63210s2));
        }
    }

    public /* synthetic */ n3h(boolean z, l5b l5bVar, y08 y08Var, boolean z2, jae jaeVar, qy6 qy6Var, jt3 jt3Var) {
        this(z, l5bVar, y08Var, z2, jaeVar, qy6Var);
    }

    @Override // p000.AbstractC8563l0
    public void applyAdditionalSemantics(@yfb eye eyeVar) {
        bye.setToggleableState(eyeVar, p3h.ToggleableState(this.f63210s2));
    }

    @yfb
    public final ny6<bth> get_onClick() {
        return this.f63212u2;
    }

    /* JADX INFO: renamed from: update-QzZPfjk, reason: not valid java name */
    public final void m31124updateQzZPfjk(boolean z, @gib l5b l5bVar, @gib y08 y08Var, boolean z2, @gib jae jaeVar, @yfb qy6<? super Boolean, bth> qy6Var) {
        if (this.f63210s2 != z) {
            this.f63210s2 = z;
            sxe.invalidateSemantics(this);
        }
        this.f63211t2 = qy6Var;
        super.m32072updateQzZPfjk(l5bVar, y08Var, z2, (String) null, jaeVar, this.f63212u2);
    }

    private n3h(boolean z, l5b l5bVar, y08 y08Var, boolean z2, jae jaeVar, qy6<? super Boolean, bth> qy6Var) {
        super(l5bVar, y08Var, z2, null, jaeVar, new C9683a(qy6Var, z), null);
        this.f63210s2 = z;
        this.f63211t2 = qy6Var;
        this.f63212u2 = new C9684b();
    }
}

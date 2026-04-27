package p000;

/* JADX INFO: loaded from: classes.dex */
public final class xe7 extends d44 implements p2d {

    /* JADX INFO: renamed from: M1 */
    @yfb
    public ny6<bth> f97586M1;

    /* JADX INFO: renamed from: V1 */
    @yfb
    public final fx8 f97587V1 = hz8.lazy(g39.f38327c, (ny6) new C15038a());

    /* JADX INFO: renamed from: Z1 */
    @yfb
    public final bcg f97588Z1 = (bcg) m8877a(new bcg(new C15039b()));

    /* JADX INFO: renamed from: xe7$a */
    public static final class C15038a extends tt8 implements ny6<hl2> {
        public C15038a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final hl2 invoke() {
            return ol2.ComposeInputMethodManager(x34.requireView(xe7.this));
        }
    }

    /* JADX INFO: renamed from: xe7$b */
    public static final class C15039b extends tt8 implements ny6<Boolean> {
        public C15039b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Boolean invoke() {
            xe7.this.getCallback().invoke();
            xe7.this.getComposeImm().prepareStylusHandwritingDelegation();
            return Boolean.TRUE;
        }
    }

    public xe7(@yfb ny6<bth> ny6Var) {
        this.f97586M1 = ny6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hl2 getComposeImm() {
        return (hl2) this.f97587V1.getValue();
    }

    @yfb
    public final ny6<bth> getCallback() {
        return this.f97586M1;
    }

    @yfb
    public final bcg getPointerInputNode() {
        return this.f97588Z1;
    }

    @Override // p000.p2d
    public void onCancelPointerInput() {
        this.f97588Z1.onCancelPointerInput();
    }

    @Override // p000.p2d
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo27219onPointerEventH0pRuoY(@yfb t1d t1dVar, @yfb v1d v1dVar, long j) {
        this.f97588Z1.mo27219onPointerEventH0pRuoY(t1dVar, v1dVar, j);
    }

    public final void setCallback(@yfb ny6<bth> ny6Var) {
        this.f97586M1 = ny6Var;
    }
}

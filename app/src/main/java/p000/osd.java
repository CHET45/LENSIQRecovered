package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class osd extends d44 implements mxa, mn2 {

    /* JADX INFO: renamed from: a2 */
    public static final int f68576a2 = 8;

    /* JADX INFO: renamed from: M1 */
    @yfb
    public nsd f68577M1;

    /* JADX INFO: renamed from: V1 */
    @yfb
    public final isd f68578V1;

    /* JADX INFO: renamed from: Z1 */
    @yfb
    public final lxa f68579Z1;

    /* JADX INFO: renamed from: osd$a */
    public static final class C10635a extends tt8 implements qy6<tn4, bth> {
        public C10635a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(tn4 tn4Var) {
            invoke2(tn4Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb tn4 tn4Var) {
            zn4.dragAndDropRequestPermission(osd.this, tn4Var);
        }
    }

    public osd(@yfb nsd nsdVar) {
        this.f68577M1 = nsdVar;
        yu4 yu4Var = new yu4(this);
        this.f68578V1 = yu4Var;
        this.f68579Z1 = nxa.modifierLocalMapOf(vkh.m24050to(ksd.getModifierLocalReceiveContent(), yu4Var));
        m8877a(lsd.ReceiveContentDragAndDropNode(yu4Var, new C10635a()));
    }

    @Override // p000.mxa
    @yfb
    public lxa getProvidedValues() {
        return this.f68579Z1;
    }

    @yfb
    public final nsd getReceiveContentListener() {
        return this.f68577M1;
    }

    public final void setReceiveContentListener(@yfb nsd nsdVar) {
        this.f68577M1 = nsdVar;
    }

    public final void updateNode(@yfb nsd nsdVar) {
        this.f68577M1 = nsdVar;
    }
}

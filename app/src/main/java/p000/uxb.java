package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class uxb implements aac {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C13788b f89416b = new C13788b(null);

    /* JADX INFO: renamed from: c */
    public static final int f89417c = 8;

    /* JADX INFO: renamed from: d */
    @yfb
    public static final qy6<uxb, bth> f89418d = C13787a.f89420a;

    /* JADX INFO: renamed from: a */
    @yfb
    public final sxb f89419a;

    /* JADX INFO: renamed from: uxb$a */
    public static final class C13787a extends tt8 implements qy6<uxb, bth> {

        /* JADX INFO: renamed from: a */
        public static final C13787a f89420a = new C13787a();

        public C13787a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(uxb uxbVar) {
            invoke2(uxbVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb uxb uxbVar) {
            if (uxbVar.isValidOwnerScope()) {
                uxbVar.getObserverNode$ui_release().onObservedReadsChanged();
            }
        }
    }

    /* JADX INFO: renamed from: uxb$b */
    public static final class C13788b {
        public /* synthetic */ C13788b(jt3 jt3Var) {
            this();
        }

        @yfb
        public final qy6<uxb, bth> getOnObserveReadsChanged$ui_release() {
            return uxb.f89418d;
        }

        private C13788b() {
        }
    }

    public uxb(@yfb sxb sxbVar) {
        this.f89419a = sxbVar;
    }

    @yfb
    public final sxb getObserverNode$ui_release() {
        return this.f89419a;
    }

    @Override // p000.aac
    public boolean isValidOwnerScope() {
        return this.f89419a.getNode().isAttached();
    }
}

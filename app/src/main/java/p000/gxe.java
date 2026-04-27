package p000;

/* JADX INFO: loaded from: classes.dex */
public final class gxe {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final zhd<dxe> f41772a = pn2.compositionLocalOf$default(null, C6642a.f41773a, 1, null);

    /* JADX INFO: renamed from: gxe$a */
    public static final class C6642a extends tt8 implements ny6<dxe> {

        /* JADX INFO: renamed from: a */
        public static final C6642a f41773a = new C6642a();

        public C6642a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @gib
        public final dxe invoke() {
            return null;
        }
    }

    @yfb
    public static final zhd<dxe> getLocalSelectionRegistrar() {
        return f41772a;
    }

    public static final boolean hasSelection(@gib dxe dxeVar, long j) {
        ol9<gwe> subselections;
        if (dxeVar == null || (subselections = dxeVar.getSubselections()) == null) {
            return false;
        }
        return subselections.containsKey(j);
    }
}

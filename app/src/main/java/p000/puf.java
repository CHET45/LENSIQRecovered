package p000;

import p000.yu9;

/* JADX INFO: loaded from: classes7.dex */
public class puf extends AbstractC14875x2 {

    /* JADX INFO: renamed from: puf$a */
    public class C11132a implements yu9.InterfaceC15813c<ruf> {
        public C11132a() {
        }

        @Override // p000.yu9.InterfaceC15813c
        public void visit(@efb yu9 yu9Var, @efb ruf rufVar) {
            yu9Var.ensureNewLine();
        }
    }

    @efb
    public static puf create() {
        return new puf();
    }

    @Override // p000.AbstractC14875x2, p000.tu9
    public void configureVisitor(@efb yu9.InterfaceC15812b interfaceC15812b) {
        interfaceC15812b.mo2700on(ruf.class, new C11132a());
    }
}

package p000;

import p000.yu9;

/* JADX INFO: loaded from: classes7.dex */
public class g61 implements yu9.InterfaceC15811a {
    @Override // p000.yu9.InterfaceC15811a
    public void blockEnd(@efb yu9 yu9Var, @efb deb debVar) {
        if (yu9Var.hasNext(debVar)) {
            yu9Var.ensureNewLine();
            yu9Var.forceNewLine();
        }
    }

    @Override // p000.yu9.InterfaceC15811a
    public void blockStart(@efb yu9 yu9Var, @efb deb debVar) {
        yu9Var.ensureNewLine();
    }
}

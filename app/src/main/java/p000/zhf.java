package p000;

import p000.yu9;

/* JADX INFO: loaded from: classes7.dex */
public class zhf implements yu9.InterfaceC15813c<deb> {
    @Override // p000.yu9.InterfaceC15813c
    public void visit(@efb yu9 yu9Var, @efb deb debVar) {
        yu9Var.blockStart(debVar);
        int length = yu9Var.length();
        yu9Var.visitChildren(debVar);
        yu9Var.setSpansForNodeOptional(debVar, length);
        yu9Var.blockEnd(debVar);
    }
}

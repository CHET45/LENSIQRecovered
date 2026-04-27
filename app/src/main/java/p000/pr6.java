package p000;

import p000.gsa;
import p000.y5g;

/* JADX INFO: loaded from: classes7.dex */
public abstract class pr6 implements gsa.InterfaceC6484b {
    /* JADX INFO: renamed from: a */
    public abstract gsa.InterfaceC6484b mo18162a();

    @Override // p000.gsa.InterfaceC6484b
    public void bytesRead(int i) {
        mo18162a().bytesRead(i);
    }

    @Override // p000.gsa.InterfaceC6484b
    public void deframeFailed(Throwable th) {
        mo18162a().deframeFailed(th);
    }

    @Override // p000.gsa.InterfaceC6484b
    public void deframerClosed(boolean z) {
        mo18162a().deframerClosed(z);
    }

    @Override // p000.gsa.InterfaceC6484b
    public void messagesAvailable(y5g.InterfaceC15496a interfaceC15496a) {
        mo18162a().messagesAvailable(interfaceC15496a);
    }
}

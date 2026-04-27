package p000;

import java.io.Closeable;
import p000.gsa;
import p000.y5g;

/* JADX INFO: loaded from: classes7.dex */
public final class szf extends pr6 {

    /* JADX INFO: renamed from: a */
    public final gsa.InterfaceC6484b f83280a;

    /* JADX INFO: renamed from: b */
    public boolean f83281b;

    public szf(gsa.InterfaceC6484b interfaceC6484b) {
        this.f83280a = interfaceC6484b;
    }

    @Override // p000.pr6
    /* JADX INFO: renamed from: a */
    public gsa.InterfaceC6484b mo18162a() {
        return this.f83280a;
    }

    @Override // p000.pr6, p000.gsa.InterfaceC6484b
    public void deframeFailed(Throwable th) {
        this.f83281b = true;
        super.deframeFailed(th);
    }

    @Override // p000.pr6, p000.gsa.InterfaceC6484b
    public void deframerClosed(boolean z) {
        this.f83281b = true;
        super.deframerClosed(z);
    }

    @Override // p000.pr6, p000.gsa.InterfaceC6484b
    public void messagesAvailable(y5g.InterfaceC15496a interfaceC15496a) {
        if (!this.f83281b) {
            super.messagesAvailable(interfaceC15496a);
        } else if (interfaceC15496a instanceof Closeable) {
            oc7.closeQuietly((Closeable) interfaceC15496a);
        }
    }
}

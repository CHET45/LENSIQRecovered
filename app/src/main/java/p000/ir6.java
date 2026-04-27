package p000;

import p000.p42;
import p000.y5g;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ir6 implements p42 {
    /* JADX INFO: renamed from: a */
    public abstract p42 mo13346a();

    @Override // p000.p42
    public void closed(n4g n4gVar, p42.EnumC10788a enumC10788a, fta ftaVar) {
        mo13346a().closed(n4gVar, enumC10788a, ftaVar);
    }

    @Override // p000.p42
    public void headersRead(fta ftaVar) {
        mo13346a().headersRead(ftaVar);
    }

    @Override // p000.y5g
    public void messagesAvailable(y5g.InterfaceC15496a interfaceC15496a) {
        mo13346a().messagesAvailable(interfaceC15496a);
    }

    @Override // p000.y5g
    public void onReady() {
        mo13346a().onReady();
    }

    public String toString() {
        return yya.toStringHelper(this).add("delegate", mo13346a()).toString();
    }
}

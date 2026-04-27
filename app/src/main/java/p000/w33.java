package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes5.dex */
public class w33 implements InterfaceC16189zn {

    /* JADX INFO: renamed from: b */
    public static final String f93150b = "clx";

    /* JADX INFO: renamed from: a */
    @efb
    public final InterfaceC13109tn f93151a;

    public w33(@efb InterfaceC13109tn interfaceC13109tn) {
        this.f93151a = interfaceC13109tn;
    }

    @Override // p000.InterfaceC16189zn
    public void logEvent(@efb String str, @hib Bundle bundle) {
        this.f93151a.logEvent("clx", str, bundle);
    }
}

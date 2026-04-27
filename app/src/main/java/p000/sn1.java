package p000;

import java.io.IOException;
import p000.t98;
import p000.zk4;

/* JADX INFO: loaded from: classes6.dex */
public class sn1 implements t98.InterfaceC12958a {
    @Override // p000.t98.InterfaceC12958a
    @efb
    public zk4.InterfaceC16164a interceptConnect(yk4 yk4Var) throws IOException {
        e0c.with().downloadStrategy().inspectNetworkOnWifi(yk4Var.getTask());
        e0c.with().downloadStrategy().inspectNetworkAvailable();
        return yk4Var.getConnectionOrCreate().execute();
    }
}

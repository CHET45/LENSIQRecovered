package p000;

import java.io.IOException;
import p000.t98;
import p000.zk4;

/* JADX INFO: loaded from: classes6.dex */
public class t8e implements t98.InterfaceC12958a, t98.InterfaceC12959b {
    @Override // p000.t98.InterfaceC12958a
    @efb
    public zk4.InterfaceC16164a interceptConnect(yk4 yk4Var) throws IOException {
        wk4 cache = yk4Var.getCache();
        while (true) {
            try {
                if (cache.isInterrupt()) {
                    throw nc8.f63949a;
                }
                return yk4Var.processConnect();
            } catch (IOException e) {
                if (!(e instanceof p8e)) {
                    yk4Var.getCache().catchException(e);
                    yk4Var.getOutputStream().catchBlockConnectException(yk4Var.getBlockIndex());
                    throw e;
                }
                yk4Var.resetConnectForRetry();
            }
        }
    }

    @Override // p000.t98.InterfaceC12959b
    public long interceptFetch(yk4 yk4Var) throws IOException {
        try {
            return yk4Var.processFetch();
        } catch (IOException e) {
            yk4Var.getCache().catchException(e);
            throw e;
        }
    }
}

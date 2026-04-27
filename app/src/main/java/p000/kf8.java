package p000;

import android.bluetooth.le.ScanResult;
import p000.p7e;

/* JADX INFO: loaded from: classes6.dex */
@c5e(26)
@p7e({p7e.EnumC10826a.f69935b})
public class kf8 implements hf8 {
    @b28
    public kf8() {
    }

    @Override // p000.hf8
    public gf8 check(ScanResult scanResult) {
        return scanResult.isConnectable() ? gf8.CONNECTABLE : gf8.NOT_CONNECTABLE;
    }
}

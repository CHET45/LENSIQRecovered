package p000;

import p000.ki9;

/* JADX INFO: loaded from: classes6.dex */
public class oj9 {

    /* JADX INFO: renamed from: a */
    public final int f67813a;

    /* JADX INFO: renamed from: b */
    public final int f67814b;

    /* JADX INFO: renamed from: c */
    public final int f67815c;

    /* JADX INFO: renamed from: d */
    public final boolean f67816d;

    /* JADX INFO: renamed from: e */
    public final boolean f67817e;

    /* JADX INFO: renamed from: f */
    public final ki9.InterfaceC8382b f67818f;

    public oj9(int i, int i2, int i3, boolean z, boolean z2, ki9.InterfaceC8382b interfaceC8382b) {
        this.f67813a = i;
        this.f67814b = i2;
        this.f67815c = i3;
        this.f67816d = z;
        this.f67817e = z2;
        this.f67818f = interfaceC8382b;
    }

    public oj9 merge(ki9 ki9Var) {
        return new oj9(ki9Var.getLogLevel() != null ? ki9Var.getLogLevel().intValue() : this.f67813a, ki9Var.getMacAddressLogSetting() != null ? ki9Var.getMacAddressLogSetting().intValue() : this.f67814b, ki9Var.getUuidLogSetting() != null ? ki9Var.getUuidLogSetting().intValue() : this.f67815c, ki9Var.getShouldLogAttributeValues() != null ? ki9Var.getShouldLogAttributeValues().booleanValue() : this.f67816d, ki9Var.getShouldLogScannedPeripherals() != null ? ki9Var.getShouldLogScannedPeripherals().booleanValue() : this.f67817e, ki9Var.getLogger() != null ? ki9Var.getLogger() : this.f67818f);
    }

    public String toString() {
        return "LoggerSetup{logLevel=" + this.f67813a + ", macAddressLogSetting=" + this.f67814b + ", uuidLogSetting=" + this.f67815c + ", shouldLogAttributeValues=" + this.f67816d + ", shouldLogScannedPeripherals=" + this.f67817e + ", logger=" + this.f67818f + '}';
    }
}

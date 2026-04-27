package p000;

/* JADX INFO: loaded from: classes6.dex */
public class fne implements ene {

    /* JADX INFO: renamed from: a */
    public final hee f37181a;

    /* JADX INFO: renamed from: b */
    public final ah9 f37182b;

    @b28
    public fne(hee heeVar, ah9 ah9Var) {
        this.f37181a = heeVar;
        this.f37182b = ah9Var;
    }

    @Override // p000.ene
    public void verify(boolean z) {
        if (!this.f37181a.hasBluetoothAdapter()) {
            throw new m51(2);
        }
        if (!this.f37181a.isBluetoothEnabled()) {
            throw new m51(1);
        }
        if (!this.f37182b.isLocationPermissionOk()) {
            throw new m51(3);
        }
        if (z && !this.f37182b.isLocationProviderOk()) {
            throw new m51(4);
        }
    }
}

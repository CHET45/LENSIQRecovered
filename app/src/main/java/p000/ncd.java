package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ncd extends myf {

    /* JADX INFO: renamed from: a */
    public final long f63953a;

    /* JADX INFO: renamed from: b */
    public final long f63954b;

    /* JADX INFO: renamed from: c */
    public final byte[] f63955c;

    private ncd(long j, byte[] bArr, long j2) {
        this.f63953a = j2;
        this.f63954b = j;
        this.f63955c = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static ncd m17844a(jhc jhcVar, int i, long j) {
        long unsignedInt = jhcVar.readUnsignedInt();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        jhcVar.readBytes(bArr, 0, i2);
        return new ncd(unsignedInt, bArr, j);
    }

    @Override // p000.myf
    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f63953a + ", identifier= " + this.f63954b + " }";
    }
}

package p000;

/* JADX INFO: loaded from: classes3.dex */
public class ek1 implements t5e<byte[]> {

    /* JADX INFO: renamed from: a */
    public final byte[] f33241a;

    public ek1(byte[] bArr) {
        this.f33241a = (byte[]) t7d.checkNotNull(bArr);
    }

    @Override // p000.t5e
    @efb
    public Class<byte[]> getResourceClass() {
        return byte[].class;
    }

    @Override // p000.t5e
    public int getSize() {
        return this.f33241a.length;
    }

    @Override // p000.t5e
    public void recycle() {
    }

    @Override // p000.t5e
    @efb
    public byte[] get() {
        return this.f33241a;
    }
}

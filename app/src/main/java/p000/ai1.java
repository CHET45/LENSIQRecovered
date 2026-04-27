package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class ai1 extends fbd<byte[]> {

    /* JADX INFO: renamed from: a */
    @yfb
    public byte[] f1629a;

    /* JADX INFO: renamed from: b */
    public int f1630b;

    public ai1(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "bufferWithData");
        this.f1629a = bArr;
        this.f1630b = bArr.length;
        ensureCapacity$kotlinx_serialization_core(10);
    }

    public final void append$kotlinx_serialization_core(byte b) {
        fbd.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        byte[] bArr = this.f1629a;
        int position$kotlinx_serialization_core = getPosition$kotlinx_serialization_core();
        this.f1630b = position$kotlinx_serialization_core + 1;
        bArr[position$kotlinx_serialization_core] = b;
    }

    @Override // p000.fbd
    public void ensureCapacity$kotlinx_serialization_core(int i) {
        byte[] bArr = this.f1629a;
        if (bArr.length < i) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, kpd.coerceAtLeast(i, bArr.length * 2));
            md8.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            this.f1629a = bArrCopyOf;
        }
    }

    @Override // p000.fbd
    public int getPosition$kotlinx_serialization_core() {
        return this.f1630b;
    }

    @Override // p000.fbd
    @yfb
    public byte[] build$kotlinx_serialization_core() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f1629a, getPosition$kotlinx_serialization_core());
        md8.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }
}

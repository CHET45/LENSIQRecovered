package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
@ph5
@yh5
@yjd
public final class ioh extends fbd<hoh> {

    /* JADX INFO: renamed from: a */
    @yfb
    public byte[] f47810a;

    /* JADX INFO: renamed from: b */
    public int f47811b;

    public /* synthetic */ ioh(byte[] bArr, jt3 jt3Var) {
        this(bArr);
    }

    /* JADX INFO: renamed from: append-7apg3OU$kotlinx_serialization_core, reason: not valid java name */
    public final void m30214append7apg3OU$kotlinx_serialization_core(byte b) {
        fbd.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        byte[] bArr = this.f47810a;
        int position$kotlinx_serialization_core = getPosition$kotlinx_serialization_core();
        this.f47811b = position$kotlinx_serialization_core + 1;
        hoh.m30093setVurrAj0(bArr, position$kotlinx_serialization_core, b);
    }

    @Override // p000.fbd
    public /* bridge */ /* synthetic */ hoh build$kotlinx_serialization_core() {
        return hoh.m30081boximpl(m30215buildTcUX1vc$kotlinx_serialization_core());
    }

    @yfb
    /* JADX INFO: renamed from: build-TcUX1vc$kotlinx_serialization_core, reason: not valid java name */
    public byte[] m30215buildTcUX1vc$kotlinx_serialization_core() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f47810a, getPosition$kotlinx_serialization_core());
        md8.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return hoh.m30083constructorimpl(bArrCopyOf);
    }

    @Override // p000.fbd
    public void ensureCapacity$kotlinx_serialization_core(int i) {
        if (hoh.m30089getSizeimpl(this.f47810a) < i) {
            byte[] bArr = this.f47810a;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, kpd.coerceAtLeast(i, hoh.m30089getSizeimpl(bArr) * 2));
            md8.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            this.f47810a = hoh.m30083constructorimpl(bArrCopyOf);
        }
    }

    @Override // p000.fbd
    public int getPosition$kotlinx_serialization_core() {
        return this.f47811b;
    }

    private ioh(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "bufferWithData");
        this.f47810a = bArr;
        this.f47811b = hoh.m30089getSizeimpl(bArr);
        ensureCapacity$kotlinx_serialization_core(10);
    }
}

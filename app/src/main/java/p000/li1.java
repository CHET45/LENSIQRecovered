package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nArrayPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayPools.kt\nkotlinx/serialization/json/internal/ByteArrayPoolBase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
public class li1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final e60<byte[]> f57656a = new e60<>();

    /* JADX INFO: renamed from: b */
    public int f57657b;

    /* JADX INFO: renamed from: a */
    public final void m16154a(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "array");
        synchronized (this) {
            try {
                if (this.f57657b + bArr.length < a70.f520a) {
                    this.f57657b += bArr.length / 2;
                    this.f57656a.addLast(bArr);
                }
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @yfb
    /* JADX INFO: renamed from: b */
    public final byte[] m16155b(int i) {
        byte[] bArrRemoveLastOrNull;
        synchronized (this) {
            bArrRemoveLastOrNull = this.f57656a.removeLastOrNull();
            if (bArrRemoveLastOrNull != null) {
                this.f57657b -= bArrRemoveLastOrNull.length / 2;
            } else {
                bArrRemoveLastOrNull = null;
            }
        }
        return bArrRemoveLastOrNull == null ? new byte[i] : bArrRemoveLastOrNull;
    }
}

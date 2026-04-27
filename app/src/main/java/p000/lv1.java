package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nArrayPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayPools.kt\nkotlinx/serialization/json/internal/CharArrayPoolBase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
public class lv1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final e60<char[]> f58863a = new e60<>();

    /* JADX INFO: renamed from: b */
    public int f58864b;

    /* JADX INFO: renamed from: a */
    public final void m16394a(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "array");
        synchronized (this) {
            try {
                if (this.f58864b + cArr.length < a70.f520a) {
                    this.f58864b += cArr.length;
                    this.f58863a.addLast(cArr);
                }
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @yfb
    /* JADX INFO: renamed from: b */
    public final char[] m16395b(int i) {
        char[] cArrRemoveLastOrNull;
        synchronized (this) {
            cArrRemoveLastOrNull = this.f58863a.removeLastOrNull();
            if (cArrRemoveLastOrNull != null) {
                this.f58864b -= cArrRemoveLastOrNull.length;
            } else {
                cArrRemoveLastOrNull = null;
            }
        }
        return cArrRemoveLastOrNull == null ? new char[i] : cArrRemoveLastOrNull;
    }
}

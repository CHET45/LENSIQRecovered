package p000;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public abstract class fbd<Array> {
    public static /* synthetic */ void ensureCapacity$kotlinx_serialization_core$default(fbd fbdVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i2 & 1) != 0) {
            i = fbdVar.getPosition$kotlinx_serialization_core() + 1;
        }
        fbdVar.ensureCapacity$kotlinx_serialization_core(i);
    }

    public abstract Array build$kotlinx_serialization_core();

    public abstract void ensureCapacity$kotlinx_serialization_core(int i);

    public abstract int getPosition$kotlinx_serialization_core();
}

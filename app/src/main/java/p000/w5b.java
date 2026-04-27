package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public interface w5b extends dm9, z6b<Long> {

    /* JADX INFO: renamed from: w5b$a */
    public static final class C14397a {
        @em0(preferredPropertyName = "longValue")
        @yfb
        @Deprecated
        public static Long getValue(@yfb w5b w5bVar) {
            return Long.valueOf(w5b.access$getValue$jd(w5bVar));
        }

        @em0(preferredPropertyName = "longValue")
        @Deprecated
        public static void setValue(@yfb w5b w5bVar, long j) {
            w5b.super.setValue(j);
        }
    }

    static /* synthetic */ long access$getValue$jd(w5b w5bVar) {
        return super.getValue().longValue();
    }

    @Override // p000.dm9
    long getLongValue();

    void setLongValue(long j);

    @Override // p000.z6b
    /* bridge */ /* synthetic */ default void setValue(Long l) {
        setValue(l.longValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.dm9, p000.i2g
    @em0(preferredPropertyName = "longValue")
    @yfb
    default Long getValue() {
        return Long.valueOf(getLongValue());
    }

    @em0(preferredPropertyName = "longValue")
    default void setValue(long j) {
        setLongValue(j);
    }
}

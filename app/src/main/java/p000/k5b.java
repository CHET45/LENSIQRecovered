package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public interface k5b extends w78, z6b<Integer> {

    /* JADX INFO: renamed from: k5b$a */
    public static final class C8202a {
        @em0(preferredPropertyName = "intValue")
        @yfb
        @Deprecated
        public static Integer getValue(@yfb k5b k5bVar) {
            return Integer.valueOf(k5b.access$getValue$jd(k5bVar));
        }

        @em0(preferredPropertyName = "intValue")
        @Deprecated
        public static void setValue(@yfb k5b k5bVar, int i) {
            k5b.super.setValue(i);
        }
    }

    static /* synthetic */ int access$getValue$jd(k5b k5bVar) {
        return super.getValue().intValue();
    }

    @Override // p000.w78
    int getIntValue();

    void setIntValue(int i);

    @Override // p000.z6b
    /* bridge */ /* synthetic */ default void setValue(Integer num) {
        setValue(num.intValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.w78, p000.i2g
    @em0(preferredPropertyName = "intValue")
    @yfb
    default Integer getValue() {
        return Integer.valueOf(getIntValue());
    }

    @em0(preferredPropertyName = "intValue")
    default void setValue(int i) {
        setIntValue(i);
    }
}

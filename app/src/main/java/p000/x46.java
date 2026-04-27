package p000;

import android.util.FloatProperty;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x46<T> {

    /* JADX INFO: renamed from: a */
    public final String f96685a;

    /* JADX INFO: renamed from: x46$a */
    public static class C14916a extends x46<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FloatProperty f96686b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14916a(String str, FloatProperty floatProperty) {
            super(str);
            this.f96686b = floatProperty;
        }

        @Override // p000.x46
        public float getValue(T t) {
            return ((Float) this.f96686b.get(t)).floatValue();
        }

        @Override // p000.x46
        public void setValue(T t, float f) {
            this.f96686b.setValue(t, f);
        }
    }

    public x46(String str) {
        this.f96685a = str;
    }

    @c5e(24)
    public static <T> x46<T> createFloatPropertyCompat(FloatProperty<T> floatProperty) {
        return new C14916a(floatProperty.getName(), floatProperty);
    }

    public abstract float getValue(T t);

    public abstract void setValue(T t, float f);
}

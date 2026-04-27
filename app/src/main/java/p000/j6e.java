package p000;

import android.content.res.Resources;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class j6e {

    /* JADX INFO: renamed from: b */
    public static final int f49650b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final i5b<TypedValue> f49651a = new i5b<>(0, 1, null);

    public final void clear() {
        synchronized (this) {
            this.f49651a.clear();
            bth bthVar = bth.f14751a;
        }
    }

    @yfb
    public final TypedValue resolveResourcePath(@yfb Resources resources, @gq4 int i) {
        TypedValue typedValue;
        synchronized (this) {
            typedValue = this.f49651a.get(i);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                this.f49651a.put(i, typedValue);
            }
        }
        return typedValue;
    }
}

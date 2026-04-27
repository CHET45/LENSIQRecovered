package p000;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class wp4 extends Property<Drawable, Integer> {

    /* JADX INFO: renamed from: b */
    public static final Property<Drawable, Integer> f95008b = new wp4();

    /* JADX INFO: renamed from: a */
    public final WeakHashMap<Drawable, Integer> f95009a;

    private wp4() {
        super(Integer.class, "drawableAlphaCompat");
        this.f95009a = new WeakHashMap<>();
    }

    @Override // android.util.Property
    @hib
    public Integer get(@efb Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    public void set(@efb Drawable drawable, @efb Integer num) {
        drawable.setAlpha(num.intValue());
    }
}

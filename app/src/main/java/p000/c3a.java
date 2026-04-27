package p000;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public class c3a {
    private c3a() {
    }

    @efb
    /* JADX INFO: renamed from: a */
    public static a13 m3745a(int i) {
        return i != 0 ? i != 1 ? m3746b() : new le3() : new wbe();
    }

    @efb
    /* JADX INFO: renamed from: b */
    public static a13 m3746b() {
        return new wbe();
    }

    @efb
    /* JADX INFO: renamed from: c */
    public static jw4 m3747c() {
        return new jw4();
    }

    public static void setElevation(@efb View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof b3a) {
            ((b3a) background).setElevation(f);
        }
    }

    public static void setParentAbsoluteElevation(@efb View view) {
        Drawable background = view.getBackground();
        if (background instanceof b3a) {
            setParentAbsoluteElevation(view, (b3a) background);
        }
    }

    public static void setParentAbsoluteElevation(@efb View view, @efb b3a b3aVar) {
        if (b3aVar.isElevationOverlayEnabled()) {
            b3aVar.setParentAbsoluteElevation(cci.getParentAbsoluteElevation(view));
        }
    }
}

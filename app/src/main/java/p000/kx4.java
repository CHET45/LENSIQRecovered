package p000;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.C3413a;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes5.dex */
public class kx4 extends C3413a {
    private static float accInterp(@y46(from = 0.0d, m25645to = 1.0d) float f) {
        return (float) (1.0d - Math.cos((((double) f) * 3.141592653589793d) / 2.0d));
    }

    private static float decInterp(@y46(from = 0.0d, m25645to = 1.0d) float f) {
        return (float) Math.sin((((double) f) * 3.141592653589793d) / 2.0d);
    }

    @Override // com.google.android.material.tabs.C3413a
    /* JADX INFO: renamed from: d */
    public void mo6486d(TabLayout tabLayout, View view, View view2, float f, @efb Drawable drawable) {
        float fDecInterp;
        float fAccInterp;
        RectF rectFM6483a = C3413a.m6483a(tabLayout, view);
        RectF rectFM6483a2 = C3413a.m6483a(tabLayout, view2);
        if (rectFM6483a.left < rectFM6483a2.left) {
            fDecInterp = accInterp(f);
            fAccInterp = decInterp(f);
        } else {
            fDecInterp = decInterp(f);
            fAccInterp = accInterp(f);
        }
        drawable.setBounds(C13280ty.lerp((int) rectFM6483a.left, (int) rectFM6483a2.left, fDecInterp), drawable.getBounds().top, C13280ty.lerp((int) rectFM6483a.right, (int) rectFM6483a2.right, fAccInterp), drawable.getBounds().bottom);
    }
}

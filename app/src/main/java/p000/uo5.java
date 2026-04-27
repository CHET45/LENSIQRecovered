package p000;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.C3413a;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes5.dex */
public class uo5 extends C3413a {

    /* JADX INFO: renamed from: b */
    public static final float f88672b = 0.5f;

    @Override // com.google.android.material.tabs.C3413a
    /* JADX INFO: renamed from: d */
    public void mo6486d(TabLayout tabLayout, View view, View view2, float f, @efb Drawable drawable) {
        if (f >= 0.5f) {
            view = view2;
        }
        RectF rectFM6483a = C3413a.m6483a(tabLayout, view);
        float fLerp = f < 0.5f ? C13280ty.lerp(1.0f, 0.0f, 0.0f, 0.5f, f) : C13280ty.lerp(0.0f, 1.0f, 0.5f, 1.0f, f);
        drawable.setBounds((int) rectFM6483a.left, drawable.getBounds().top, (int) rectFM6483a.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (fLerp * 255.0f));
    }
}

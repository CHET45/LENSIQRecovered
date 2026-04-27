package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.transition.C1466z;

/* JADX INFO: loaded from: classes3.dex */
public class dci {

    /* JADX INFO: renamed from: a */
    public static final C1466z f29362a;

    /* JADX INFO: renamed from: b */
    public static final String f29363b = "ViewUtils";

    /* JADX INFO: renamed from: c */
    public static final Property<View, Float> f29364c;

    /* JADX INFO: renamed from: d */
    public static final Property<View, Rect> f29365d;

    /* JADX INFO: renamed from: dci$a */
    public static class C4745a extends Property<View, Float> {
        public C4745a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(dci.m9068c(view));
        }

        @Override // android.util.Property
        public void set(View view, Float f) {
            dci.m9073h(view, f.floatValue());
        }
    }

    /* JADX INFO: renamed from: dci$b */
    public static class C4746b extends Property<View, Rect> {
        public C4746b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Rect get(View view) {
            return o8i.getClipBounds(view);
        }

        @Override // android.util.Property
        public void set(View view, Rect rect) {
            o8i.setClipBounds(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f29362a = new qci();
        } else {
            f29362a = new pci();
        }
        f29364c = new C4745a(Float.class, "translationAlpha");
        f29365d = new C4746b(Rect.class, "clipBounds");
    }

    private dci() {
    }

    /* JADX INFO: renamed from: a */
    public static void m9066a(@efb View view) {
        f29362a.clearNonTransitionAlpha(view);
    }

    /* JADX INFO: renamed from: b */
    public static xai m9067b(@efb View view) {
        return new vai(view);
    }

    /* JADX INFO: renamed from: c */
    public static float m9068c(@efb View view) {
        return f29362a.getTransitionAlpha(view);
    }

    /* JADX INFO: renamed from: d */
    public static rli m9069d(@efb View view) {
        return new qli(view);
    }

    /* JADX INFO: renamed from: e */
    public static void m9070e(@efb View view) {
        f29362a.saveNonTransitionAlpha(view);
    }

    /* JADX INFO: renamed from: f */
    public static void m9071f(@efb View view, @hib Matrix matrix) {
        f29362a.setAnimationMatrix(view, matrix);
    }

    /* JADX INFO: renamed from: g */
    public static void m9072g(@efb View view, int i, int i2, int i3, int i4) {
        f29362a.setLeftTopRightBottom(view, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: h */
    public static void m9073h(@efb View view, float f) {
        f29362a.setTransitionAlpha(view, f);
    }

    /* JADX INFO: renamed from: i */
    public static void m9074i(@efb View view, int i) {
        f29362a.setTransitionVisibility(view, i);
    }

    /* JADX INFO: renamed from: j */
    public static void m9075j(@efb View view, @efb Matrix matrix) {
        f29362a.transformMatrixToGlobal(view, matrix);
    }

    /* JADX INFO: renamed from: k */
    public static void m9076k(@efb View view, @efb Matrix matrix) {
        f29362a.transformMatrixToLocal(view, matrix);
    }
}

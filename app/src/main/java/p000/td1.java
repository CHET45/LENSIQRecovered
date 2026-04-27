package p000;

import android.content.Context;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes.dex */
public final class td1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final zhd<sd1> f84305a = pn2.compositionLocalWithComputedDefaultOf(C12990a.f84307a);

    /* JADX INFO: renamed from: b */
    @yfb
    public static final sd1 f84306b = new C12991b();

    /* JADX INFO: renamed from: td1$a */
    public static final class C12990a extends tt8 implements qy6<ln2, sd1> {

        /* JADX INFO: renamed from: a */
        public static final C12990a f84307a = new C12990a();

        public C12990a() {
            super(1);
        }

        @Override // p000.qy6
        @yfb
        public final sd1 invoke(@yfb ln2 ln2Var) {
            return !((Context) ln2Var.getCurrentValue(AndroidCompositionLocals_androidKt.getLocalContext())).getPackageManager().hasSystemFeature("android.software.leanback") ? sd1.f81248a.getDefaultBringIntoViewSpec$foundation_release() : td1.getPivotBringIntoViewSpec();
        }
    }

    /* JADX INFO: renamed from: td1$b */
    public static final class C12991b implements sd1 {

        /* JADX INFO: renamed from: c */
        public final float f84309c;

        /* JADX INFO: renamed from: b */
        public final float f84308b = 0.3f;

        /* JADX INFO: renamed from: d */
        @yfb
        public final InterfaceC11178py<Float> f84310d = C11760qy.tween$default(125, 0, new k93(0.25f, 0.1f, 0.25f, 1.0f), 2, null);

        @Override // p000.sd1
        public float calculateScrollDistance(float f, float f2, float f3) {
            float fAbs = Math.abs((f2 + f) - f);
            boolean z = fAbs <= f3;
            float f4 = (this.f84308b * f3) - (this.f84309c * fAbs);
            float f5 = f3 - f4;
            if (z && f5 < fAbs) {
                f4 = f3 - fAbs;
            }
            return f - f4;
        }

        public final float getChildFraction() {
            return this.f84309c;
        }

        public final float getParentFraction() {
            return this.f84308b;
        }

        @Override // p000.sd1
        @yfb
        public InterfaceC11178py<Float> getScrollAnimationSpec() {
            return this.f84310d;
        }
    }

    @ah5
    @yfb
    public static final zhd<sd1> getLocalBringIntoViewSpec() {
        return f84305a;
    }

    @ah5
    public static /* synthetic */ void getLocalBringIntoViewSpec$annotations() {
    }

    @yfb
    public static final sd1 getPivotBringIntoViewSpec() {
        return f84306b;
    }

    public static /* synthetic */ void getPivotBringIntoViewSpec$annotations() {
    }
}

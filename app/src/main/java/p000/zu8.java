package p000;

import androidx.compose.p002ui.graphics.C0739f;
import androidx.compose.p002ui.graphics.InterfaceC0736c;

/* JADX INFO: loaded from: classes.dex */
public final class zu8 {

    /* JADX INFO: renamed from: c */
    public float f106116c;

    /* JADX INFO: renamed from: d */
    public float f106117d;

    /* JADX INFO: renamed from: e */
    public float f106118e;

    /* JADX INFO: renamed from: f */
    public float f106119f;

    /* JADX INFO: renamed from: g */
    public float f106120g;

    /* JADX INFO: renamed from: a */
    public float f106114a = 1.0f;

    /* JADX INFO: renamed from: b */
    public float f106115b = 1.0f;

    /* JADX INFO: renamed from: h */
    public float f106121h = 8.0f;

    /* JADX INFO: renamed from: i */
    public long f106122i = C0739f.f5349b.m27666getCenterSzJe1aQ();

    public final void copyFrom(@yfb zu8 zu8Var) {
        this.f106114a = zu8Var.f106114a;
        this.f106115b = zu8Var.f106115b;
        this.f106116c = zu8Var.f106116c;
        this.f106117d = zu8Var.f106117d;
        this.f106118e = zu8Var.f106118e;
        this.f106119f = zu8Var.f106119f;
        this.f106120g = zu8Var.f106120g;
        this.f106121h = zu8Var.f106121h;
        this.f106122i = zu8Var.f106122i;
    }

    public final boolean hasSameValuesAs(@yfb zu8 zu8Var) {
        return this.f106114a == zu8Var.f106114a && this.f106115b == zu8Var.f106115b && this.f106116c == zu8Var.f106116c && this.f106117d == zu8Var.f106117d && this.f106118e == zu8Var.f106118e && this.f106119f == zu8Var.f106119f && this.f106120g == zu8Var.f106120g && this.f106121h == zu8Var.f106121h && C0739f.m27660equalsimpl0(this.f106122i, zu8Var.f106122i);
    }

    public final void copyFrom(@yfb InterfaceC0736c interfaceC0736c) {
        this.f106114a = interfaceC0736c.getScaleX();
        this.f106115b = interfaceC0736c.getScaleY();
        this.f106116c = interfaceC0736c.getTranslationX();
        this.f106117d = interfaceC0736c.getTranslationY();
        this.f106118e = interfaceC0736c.getRotationX();
        this.f106119f = interfaceC0736c.getRotationY();
        this.f106120g = interfaceC0736c.getRotationZ();
        this.f106121h = interfaceC0736c.getCameraDistance();
        this.f106122i = interfaceC0736c.mo27620getTransformOriginSzJe1aQ();
    }
}

package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import p000.InterfaceC9407mm;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class uy2 implements g86, ty2 {

    /* JADX INFO: renamed from: f */
    public static final int f89427f = 0;

    /* JADX INFO: renamed from: a */
    public final int f89428a;

    /* JADX INFO: renamed from: b */
    public final int f89429b;

    /* JADX INFO: renamed from: c */
    public final float f89430c;

    /* JADX INFO: renamed from: d */
    public final float f89431d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ h86 f89432e;

    public /* synthetic */ uy2(int i, int i2, float f, float f2, jt3 jt3Var) {
        this(i, i2, f, f2);
    }

    @Override // p000.gce
    @f0g
    @yfb
    public InterfaceC0701e align(@yfb InterfaceC0701e interfaceC0701e, @yfb InterfaceC9407mm.c cVar) {
        return this.f89432e.align(interfaceC0701e, cVar);
    }

    @Override // p000.gce
    @f0g
    @yfb
    public InterfaceC0701e alignBy(@yfb InterfaceC0701e interfaceC0701e, @yfb qy6<? super aca, Integer> qy6Var) {
        return this.f89432e.alignBy(interfaceC0701e, qy6Var);
    }

    @Override // p000.gce
    @f0g
    @yfb
    public InterfaceC0701e alignByBaseline(@yfb InterfaceC0701e interfaceC0701e) {
        return this.f89432e.alignByBaseline(interfaceC0701e);
    }

    @Override // p000.g86
    @hh5
    @yfb
    public InterfaceC0701e fillMaxRowHeight(@yfb InterfaceC0701e interfaceC0701e, @y46(from = 0.0d, m25645to = 1.0d) float f) {
        return this.f89432e.fillMaxRowHeight(interfaceC0701e, f);
    }

    @Override // p000.ty2
    public int getIndexInLine() {
        return this.f89429b;
    }

    @Override // p000.ty2
    public int getLineIndex() {
        return this.f89428a;
    }

    @Override // p000.ty2
    /* JADX INFO: renamed from: getMaxHeight-D9Ej5fM */
    public float mo32467getMaxHeightD9Ej5fM() {
        return this.f89431d;
    }

    @Override // p000.ty2
    /* JADX INFO: renamed from: getMaxWidthInLine-D9Ej5fM */
    public float mo32468getMaxWidthInLineD9Ej5fM() {
        return this.f89430c;
    }

    @Override // p000.gce
    @f0g
    @yfb
    public InterfaceC0701e weight(@yfb InterfaceC0701e interfaceC0701e, @y46(from = 0.0d, fromInclusive = false) float f, boolean z) {
        return this.f89432e.weight(interfaceC0701e, f, z);
    }

    private uy2(int i, int i2, float f, float f2) {
        this.f89428a = i;
        this.f89429b = i2;
        this.f89430c = f;
        this.f89431d = f2;
        this.f89432e = h86.f42900b;
    }

    @Override // p000.gce
    @f0g
    @yfb
    public InterfaceC0701e alignBy(@yfb InterfaceC0701e interfaceC0701e, @yfb kl7 kl7Var) {
        return this.f89432e.alignBy(interfaceC0701e, kl7Var);
    }
}

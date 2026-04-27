package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import p000.InterfaceC9407mm;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class py2 implements w66, oy2 {

    /* JADX INFO: renamed from: f */
    public static final int f72480f = 0;

    /* JADX INFO: renamed from: a */
    public final int f72481a;

    /* JADX INFO: renamed from: b */
    public final int f72482b;

    /* JADX INFO: renamed from: c */
    public final float f72483c;

    /* JADX INFO: renamed from: d */
    public final float f72484d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ x66 f72485e;

    public /* synthetic */ py2(int i, int i2, float f, float f2, jt3 jt3Var) {
        this(i, i2, f, f2);
    }

    @Override // p000.bb2
    @f0g
    @yfb
    public InterfaceC0701e align(@yfb InterfaceC0701e interfaceC0701e, @yfb InterfaceC9407mm.b bVar) {
        return this.f72485e.align(interfaceC0701e, bVar);
    }

    @Override // p000.bb2
    @f0g
    @yfb
    public InterfaceC0701e alignBy(@yfb InterfaceC0701e interfaceC0701e, @yfb qy6<? super aca, Integer> qy6Var) {
        return this.f72485e.alignBy(interfaceC0701e, qy6Var);
    }

    @Override // p000.w66
    @hh5
    @yfb
    public InterfaceC0701e fillMaxColumnWidth(@yfb InterfaceC0701e interfaceC0701e, @y46(from = 0.0d, m25645to = 1.0d) float f) {
        return this.f72485e.fillMaxColumnWidth(interfaceC0701e, f);
    }

    @Override // p000.oy2
    public int getIndexInLine() {
        return this.f72482b;
    }

    @Override // p000.oy2
    public int getLineIndex() {
        return this.f72481a;
    }

    @Override // p000.oy2
    /* JADX INFO: renamed from: getMaxHeightInLine-D9Ej5fM */
    public float mo31698getMaxHeightInLineD9Ej5fM() {
        return this.f72484d;
    }

    @Override // p000.oy2
    /* JADX INFO: renamed from: getMaxWidth-D9Ej5fM */
    public float mo31699getMaxWidthD9Ej5fM() {
        return this.f72483c;
    }

    @Override // p000.bb2
    @f0g
    @yfb
    public InterfaceC0701e weight(@yfb InterfaceC0701e interfaceC0701e, @y46(from = 0.0d, fromInclusive = false) float f, boolean z) {
        return this.f72485e.weight(interfaceC0701e, f, z);
    }

    private py2(int i, int i2, float f, float f2) {
        this.f72481a = i;
        this.f72482b = i2;
        this.f72483c = f;
        this.f72484d = f2;
        this.f72485e = x66.f96862b;
    }

    @Override // p000.bb2
    @f0g
    @yfb
    public InterfaceC0701e alignBy(@yfb InterfaceC0701e interfaceC0701e, @yfb f5i f5iVar) {
        return this.f72485e.alignBy(interfaceC0701e, f5iVar);
    }
}

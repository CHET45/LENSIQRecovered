package p000;

import androidx.compose.p002ui.graphics.InterfaceC0736c;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.C0747a;
import androidx.compose.p002ui.layout.C0753f;
import androidx.compose.p002ui.layout.InterfaceC0761n;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class neb {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final neb f64148a = new neb();

    /* JADX INFO: renamed from: b */
    public static final int f64149b = 0;

    /* JADX INFO: renamed from: neb$a */
    public interface InterfaceC9826a {
        @yfb
        /* JADX INFO: renamed from: measure-3p2s80s */
        vba mo27680measure3p2s80s(@yfb t40 t40Var, @yfb rba rbaVar, long j);
    }

    /* JADX INFO: renamed from: neb$b */
    public static final class C9827b implements rba {

        /* JADX INFO: renamed from: a */
        @yfb
        public final ed8 f64150a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final EnumC9829d f64151b;

        /* JADX INFO: renamed from: c */
        @yfb
        public final EnumC9830e f64152c;

        public C9827b(@yfb ed8 ed8Var, @yfb EnumC9829d enumC9829d, @yfb EnumC9830e enumC9830e) {
            this.f64150a = ed8Var;
            this.f64151b = enumC9829d;
            this.f64152c = enumC9830e;
        }

        @yfb
        public final ed8 getMeasurable() {
            return this.f64150a;
        }

        @yfb
        public final EnumC9829d getMinMax() {
            return this.f64151b;
        }

        @Override // p000.ed8
        @gib
        public Object getParentData() {
            return this.f64150a.getParentData();
        }

        @yfb
        public final EnumC9830e getWidthHeight() {
            return this.f64152c;
        }

        @Override // p000.ed8
        public int maxIntrinsicHeight(int i) {
            return this.f64150a.maxIntrinsicHeight(i);
        }

        @Override // p000.ed8
        public int maxIntrinsicWidth(int i) {
            return this.f64150a.maxIntrinsicWidth(i);
        }

        @Override // p000.rba
        @yfb
        /* JADX INFO: renamed from: measure-BRTryo0 */
        public AbstractC0767t mo27949measureBRTryo0(long j) {
            if (this.f64152c == EnumC9830e.Width) {
                return new C9828c(this.f64151b == EnumC9829d.Max ? this.f64150a.maxIntrinsicWidth(ku2.m30762getMaxHeightimpl(j)) : this.f64150a.minIntrinsicWidth(ku2.m30762getMaxHeightimpl(j)), ku2.m30758getHasBoundedHeightimpl(j) ? ku2.m30762getMaxHeightimpl(j) : 32767);
            }
            return new C9828c(ku2.m30759getHasBoundedWidthimpl(j) ? ku2.m30763getMaxWidthimpl(j) : 32767, this.f64151b == EnumC9829d.Max ? this.f64150a.maxIntrinsicHeight(ku2.m30763getMaxWidthimpl(j)) : this.f64150a.minIntrinsicHeight(ku2.m30763getMaxWidthimpl(j)));
        }

        @Override // p000.ed8
        public int minIntrinsicHeight(int i) {
            return this.f64150a.minIntrinsicHeight(i);
        }

        @Override // p000.ed8
        public int minIntrinsicWidth(int i) {
            return this.f64150a.minIntrinsicWidth(i);
        }
    }

    /* JADX INFO: renamed from: neb$c */
    public static final class C9828c extends AbstractC0767t {
        public C9828c(int i, int i2) {
            m1212f(s78.IntSize(i, i2));
        }

        @Override // androidx.compose.p002ui.layout.AbstractC0767t
        /* JADX INFO: renamed from: d */
        public void mo1210d(long j, float f, @gib qy6<? super InterfaceC0736c, bth> qy6Var) {
        }

        @Override // p000.aca
        public int get(@yfb AbstractC9938nm abstractC9938nm) {
            return Integer.MIN_VALUE;
        }
    }

    /* JADX INFO: renamed from: neb$d */
    public enum EnumC9829d {
        Min,
        Max
    }

    /* JADX INFO: renamed from: neb$e */
    public enum EnumC9830e {
        Width,
        Height
    }

    /* JADX INFO: renamed from: neb$f */
    public interface InterfaceC9831f {
        @yfb
        /* JADX INFO: renamed from: measure-3p2s80s */
        vba mo28869measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j);
    }

    private neb() {
    }

    public final int maxHeight$ui_release(@yfb InterfaceC9826a interfaceC9826a, @yfb s40 s40Var, @yfb ed8 ed8Var, int i) {
        return interfaceC9826a.mo27680measure3p2s80s(new C0747a(s40Var, s40Var.getLayoutDirection()), new C9827b(ed8Var, EnumC9829d.Max, EnumC9830e.Height), nu2.Constraints$default(0, i, 0, 0, 13, null)).getHeight();
    }

    public final int maxWidth$ui_release(@yfb InterfaceC9826a interfaceC9826a, @yfb s40 s40Var, @yfb ed8 ed8Var, int i) {
        return interfaceC9826a.mo27680measure3p2s80s(new C0747a(s40Var, s40Var.getLayoutDirection()), new C9827b(ed8Var, EnumC9829d.Max, EnumC9830e.Width), nu2.Constraints$default(0, 0, 0, i, 7, null)).getWidth();
    }

    public final int minHeight$ui_release(@yfb InterfaceC9826a interfaceC9826a, @yfb s40 s40Var, @yfb ed8 ed8Var, int i) {
        return interfaceC9826a.mo27680measure3p2s80s(new C0747a(s40Var, s40Var.getLayoutDirection()), new C9827b(ed8Var, EnumC9829d.Min, EnumC9830e.Height), nu2.Constraints$default(0, i, 0, 0, 13, null)).getHeight();
    }

    public final int minWidth$ui_release(@yfb InterfaceC9826a interfaceC9826a, @yfb s40 s40Var, @yfb ed8 ed8Var, int i) {
        return interfaceC9826a.mo27680measure3p2s80s(new C0747a(s40Var, s40Var.getLayoutDirection()), new C9827b(ed8Var, EnumC9829d.Min, EnumC9830e.Width), nu2.Constraints$default(0, 0, 0, i, 7, null)).getWidth();
    }

    public final int maxHeight$ui_release(@yfb InterfaceC9831f interfaceC9831f, @yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return interfaceC9831f.mo28869measure3p2s80s(new C0753f(gd8Var, gd8Var.getLayoutDirection()), new C9827b(ed8Var, EnumC9829d.Max, EnumC9830e.Height), nu2.Constraints$default(0, i, 0, 0, 13, null)).getHeight();
    }

    public final int maxWidth$ui_release(@yfb InterfaceC9831f interfaceC9831f, @yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return interfaceC9831f.mo28869measure3p2s80s(new C0753f(gd8Var, gd8Var.getLayoutDirection()), new C9827b(ed8Var, EnumC9829d.Max, EnumC9830e.Width), nu2.Constraints$default(0, 0, 0, i, 7, null)).getWidth();
    }

    public final int minHeight$ui_release(@yfb InterfaceC9831f interfaceC9831f, @yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return interfaceC9831f.mo28869measure3p2s80s(new C0753f(gd8Var, gd8Var.getLayoutDirection()), new C9827b(ed8Var, EnumC9829d.Min, EnumC9830e.Height), nu2.Constraints$default(0, i, 0, 0, 13, null)).getHeight();
    }

    public final int minWidth$ui_release(@yfb InterfaceC9831f interfaceC9831f, @yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return interfaceC9831f.mo28869measure3p2s80s(new C0753f(gd8Var, gd8Var.getLayoutDirection()), new C9827b(ed8Var, EnumC9829d.Min, EnumC9830e.Width), nu2.Constraints$default(0, 0, 0, i, 7, null)).getWidth();
    }
}

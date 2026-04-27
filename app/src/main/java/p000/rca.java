package p000;

import androidx.compose.p002ui.graphics.InterfaceC0736c;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.C0753f;

/* JADX INFO: loaded from: classes.dex */
public final class rca {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final rca f77816a = new rca();

    /* JADX INFO: renamed from: rca$a */
    public static final class C12014a implements rba {

        /* JADX INFO: renamed from: a */
        @yfb
        public final ed8 f77817a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final EnumC12016c f77818b;

        /* JADX INFO: renamed from: c */
        @yfb
        public final EnumC12017d f77819c;

        public C12014a(@yfb ed8 ed8Var, @yfb EnumC12016c enumC12016c, @yfb EnumC12017d enumC12017d) {
            this.f77817a = ed8Var;
            this.f77818b = enumC12016c;
            this.f77819c = enumC12017d;
        }

        @yfb
        public final ed8 getMeasurable() {
            return this.f77817a;
        }

        @yfb
        public final EnumC12016c getMinMax() {
            return this.f77818b;
        }

        @Override // p000.ed8
        @gib
        public Object getParentData() {
            return this.f77817a.getParentData();
        }

        @yfb
        public final EnumC12017d getWidthHeight() {
            return this.f77819c;
        }

        @Override // p000.ed8
        public int maxIntrinsicHeight(int i) {
            return this.f77817a.maxIntrinsicHeight(i);
        }

        @Override // p000.ed8
        public int maxIntrinsicWidth(int i) {
            return this.f77817a.maxIntrinsicWidth(i);
        }

        @Override // p000.rba
        @yfb
        /* JADX INFO: renamed from: measure-BRTryo0 */
        public AbstractC0767t mo27949measureBRTryo0(long j) {
            if (this.f77819c == EnumC12017d.Width) {
                return new C12015b(this.f77818b == EnumC12016c.Max ? this.f77817a.maxIntrinsicWidth(ku2.m30762getMaxHeightimpl(j)) : this.f77817a.minIntrinsicWidth(ku2.m30762getMaxHeightimpl(j)), ku2.m30758getHasBoundedHeightimpl(j) ? ku2.m30762getMaxHeightimpl(j) : 32767);
            }
            return new C12015b(ku2.m30759getHasBoundedWidthimpl(j) ? ku2.m30763getMaxWidthimpl(j) : 32767, this.f77818b == EnumC12016c.Max ? this.f77817a.maxIntrinsicHeight(ku2.m30763getMaxWidthimpl(j)) : this.f77817a.minIntrinsicHeight(ku2.m30763getMaxWidthimpl(j)));
        }

        @Override // p000.ed8
        public int minIntrinsicHeight(int i) {
            return this.f77817a.minIntrinsicHeight(i);
        }

        @Override // p000.ed8
        public int minIntrinsicWidth(int i) {
            return this.f77817a.minIntrinsicWidth(i);
        }
    }

    /* JADX INFO: renamed from: rca$b */
    public static final class C12015b extends AbstractC0767t {
        public C12015b(int i, int i2) {
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

    /* JADX INFO: renamed from: rca$c */
    public enum EnumC12016c {
        Min,
        Max
    }

    /* JADX INFO: renamed from: rca$d */
    public enum EnumC12017d {
        Width,
        Height
    }

    private rca() {
    }

    public final int maxHeight(@yfb cw8 cw8Var, @yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return cw8Var.mo27254measure3p2s80s(new C0753f(gd8Var, gd8Var.getLayoutDirection()), new C12014a(ed8Var, EnumC12016c.Max, EnumC12017d.Height), nu2.Constraints$default(0, i, 0, 0, 13, null)).getHeight();
    }

    public final int maxWidth(@yfb cw8 cw8Var, @yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return cw8Var.mo27254measure3p2s80s(new C0753f(gd8Var, gd8Var.getLayoutDirection()), new C12014a(ed8Var, EnumC12016c.Max, EnumC12017d.Width), nu2.Constraints$default(0, 0, 0, i, 7, null)).getWidth();
    }

    public final int minHeight(@yfb cw8 cw8Var, @yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return cw8Var.mo27254measure3p2s80s(new C0753f(gd8Var, gd8Var.getLayoutDirection()), new C12014a(ed8Var, EnumC12016c.Min, EnumC12017d.Height), nu2.Constraints$default(0, i, 0, 0, 13, null)).getHeight();
    }

    public final int minWidth(@yfb cw8 cw8Var, @yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return cw8Var.mo27254measure3p2s80s(new C0753f(gd8Var, gd8Var.getLayoutDirection()), new C12014a(ed8Var, EnumC12016c.Min, EnumC12017d.Width), nu2.Constraints$default(0, 0, 0, i, 7, null)).getWidth();
    }
}

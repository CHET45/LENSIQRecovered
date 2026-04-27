package p000;

import androidx.compose.p002ui.layout.InterfaceC0761n;
import p000.neb;

/* JADX INFO: loaded from: classes.dex */
public interface ew8 extends v34 {

    /* JADX INFO: renamed from: ew8$a */
    public static final class C5498a implements neb.InterfaceC9831f {
        public C5498a() {
        }

        @Override // p000.neb.InterfaceC9831f
        @yfb
        /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
        public final vba mo28869measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
            return ew8.this.mo27276measure3p2s80s(interfaceC0761n, rbaVar, j);
        }
    }

    /* JADX INFO: renamed from: ew8$b */
    public static final class C5499b implements neb.InterfaceC9831f {
        public C5499b() {
        }

        @Override // p000.neb.InterfaceC9831f
        @yfb
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final vba mo28869measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
            return ew8.this.mo27276measure3p2s80s(interfaceC0761n, rbaVar, j);
        }
    }

    /* JADX INFO: renamed from: ew8$c */
    public static final class C5500c implements neb.InterfaceC9831f {
        public C5500c() {
        }

        @Override // p000.neb.InterfaceC9831f
        @yfb
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final vba mo28869measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
            return ew8.this.mo27276measure3p2s80s(interfaceC0761n, rbaVar, j);
        }
    }

    /* JADX INFO: renamed from: ew8$d */
    public static final class C5501d implements neb.InterfaceC9831f {
        public C5501d() {
        }

        @Override // p000.neb.InterfaceC9831f
        @yfb
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final vba mo28869measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
            return ew8.this.mo27276measure3p2s80s(interfaceC0761n, rbaVar, j);
        }
    }

    default int maxIntrinsicHeight(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return neb.f64148a.maxHeight$ui_release(new C5498a(), gd8Var, ed8Var, i);
    }

    default int maxIntrinsicWidth(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return neb.f64148a.maxWidth$ui_release(new C5499b(), gd8Var, ed8Var, i);
    }

    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    vba mo27276measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j);

    default int minIntrinsicHeight(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return neb.f64148a.minHeight$ui_release(new C5500c(), gd8Var, ed8Var, i);
    }

    default int minIntrinsicWidth(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return neb.f64148a.minWidth$ui_release(new C5501d(), gd8Var, ed8Var, i);
    }
}

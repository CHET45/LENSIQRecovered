package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@hh5
@vw8
@vw7
public interface g86 extends gce {
    static /* synthetic */ InterfaceC0701e fillMaxRowHeight$default(g86 g86Var, InterfaceC0701e interfaceC0701e, float f, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillMaxRowHeight");
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return g86Var.fillMaxRowHeight(interfaceC0701e, f);
    }

    @hh5
    @yfb
    InterfaceC0701e fillMaxRowHeight(@yfb InterfaceC0701e interfaceC0701e, @y46(from = 0.0d, m25645to = 1.0d) float f);
}

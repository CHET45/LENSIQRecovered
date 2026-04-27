package p000;

import androidx.compose.p002ui.layout.InterfaceC0761n;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@q64(message = "MeasureBlocks was deprecated. Please use MeasurePolicy instead.")
public interface tba {
    int maxIntrinsicHeight(@yfb gd8 gd8Var, @yfb List<? extends ed8> list, int i);

    int maxIntrinsicWidth(@yfb gd8 gd8Var, @yfb List<? extends ed8> list, int i);

    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    vba m32397measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb List<? extends rba> list, long j);

    int minIntrinsicHeight(@yfb gd8 gd8Var, @yfb List<? extends ed8> list, int i);

    int minIntrinsicWidth(@yfb gd8 gd8Var, @yfb List<? extends ed8> list, int i);
}

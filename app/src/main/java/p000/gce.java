package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import p000.InterfaceC9407mm;

/* JADX INFO: loaded from: classes.dex */
@vw8
@vw7
public interface gce {

    /* JADX INFO: renamed from: gce$a */
    public static final class C6217a {
    }

    static /* synthetic */ InterfaceC0701e weight$default(gce gceVar, InterfaceC0701e interfaceC0701e, float f, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return gceVar.weight(interfaceC0701e, f, z);
    }

    @f0g
    @yfb
    InterfaceC0701e align(@yfb InterfaceC0701e interfaceC0701e, @yfb InterfaceC9407mm.c cVar);

    @f0g
    @yfb
    InterfaceC0701e alignBy(@yfb InterfaceC0701e interfaceC0701e, @yfb kl7 kl7Var);

    @f0g
    @yfb
    InterfaceC0701e alignBy(@yfb InterfaceC0701e interfaceC0701e, @yfb qy6<? super aca, Integer> qy6Var);

    @f0g
    @yfb
    InterfaceC0701e alignByBaseline(@yfb InterfaceC0701e interfaceC0701e);

    @f0g
    @yfb
    InterfaceC0701e weight(@yfb InterfaceC0701e interfaceC0701e, @y46(from = 0.0d, fromInclusive = false) float f, boolean z);
}

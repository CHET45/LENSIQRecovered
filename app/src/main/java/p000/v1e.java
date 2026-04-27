package p000;

import android.os.Handler;
import androidx.media3.exoplayer.InterfaceC1254q;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface v1e {
    InterfaceC1254q[] createRenderers(Handler handler, v7i v7iVar, rg0 rg0Var, avg avgVar, fua fuaVar);

    @hib
    default InterfaceC1254q createSecondaryRenderer(InterfaceC1254q interfaceC1254q, Handler handler, v7i v7iVar, rg0 rg0Var, avg avgVar, fua fuaVar) {
        return null;
    }
}

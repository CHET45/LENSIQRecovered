package p000;

import android.content.Context;
import androidx.media3.exoplayer.InterfaceC1254q;
import androidx.media3.exoplayer.InterfaceC1255s;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class o7h {

    /* JADX INFO: renamed from: a */
    @hib
    public InterfaceC10215b f66626a;

    /* JADX INFO: renamed from: b */
    @hib
    public up0 f66627b;

    /* JADX INFO: renamed from: o7h$a */
    public interface InterfaceC10214a {
        o7h createTrackSelector(Context context);
    }

    /* JADX INFO: renamed from: o7h$b */
    public interface InterfaceC10215b {
        default void onRendererCapabilitiesChanged(InterfaceC1254q interfaceC1254q) {
        }

        void onTrackSelectionsInvalidated();
    }

    /* JADX INFO: renamed from: a */
    public final up0 m18395a() {
        return (up0) v80.checkStateNotNull(this.f66627b);
    }

    /* JADX INFO: renamed from: b */
    public final void m18396b() {
        InterfaceC10215b interfaceC10215b = this.f66626a;
        if (interfaceC10215b != null) {
            interfaceC10215b.onTrackSelectionsInvalidated();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m18397c(InterfaceC1254q interfaceC1254q) {
        InterfaceC10215b interfaceC10215b = this.f66626a;
        if (interfaceC10215b != null) {
            interfaceC10215b.onRendererCapabilitiesChanged(interfaceC1254q);
        }
    }

    public h7h getParameters() {
        return h7h.f42758F;
    }

    @hib
    public InterfaceC1255s.f getRendererCapabilitiesListener() {
        return null;
    }

    @un1
    public void init(InterfaceC10215b interfaceC10215b, up0 up0Var) {
        v80.checkState(this.f66626a == null);
        this.f66626a = interfaceC10215b;
        this.f66627b = up0Var;
    }

    public boolean isSetParametersSupported() {
        return false;
    }

    public abstract void onSelectionActivated(@hib Object obj);

    @un1
    public void release() {
        this.f66626a = null;
        this.f66627b = null;
    }

    public abstract r7h selectTracks(InterfaceC1255s[] interfaceC1255sArr, n6h n6hVar, una.C13612b c13612b, q1h q1hVar) throws aa5;

    public void setAudioAttributes(uc0 uc0Var) {
    }

    public void setParameters(h7h h7hVar) {
    }
}

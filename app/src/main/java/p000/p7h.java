package p000;

import p000.p1e;
import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class p7h {

    /* JADX INFO: renamed from: a */
    @hib
    public InterfaceC10828a f69942a;

    /* JADX INFO: renamed from: b */
    @hib
    public vp0 f69943b;

    /* JADX INFO: renamed from: p7h$a */
    public interface InterfaceC10828a {
        default void onRendererCapabilitiesChanged(n1e n1eVar) {
        }

        void onTrackSelectionsInvalidated();
    }

    /* JADX INFO: renamed from: a */
    public final vp0 m19315a() {
        return (vp0) u80.checkStateNotNull(this.f69943b);
    }

    /* JADX INFO: renamed from: b */
    public final void m19316b() {
        InterfaceC10828a interfaceC10828a = this.f69942a;
        if (interfaceC10828a != null) {
            interfaceC10828a.onTrackSelectionsInvalidated();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m19317c(n1e n1eVar) {
        InterfaceC10828a interfaceC10828a = this.f69942a;
        if (interfaceC10828a != null) {
            interfaceC10828a.onRendererCapabilitiesChanged(n1eVar);
        }
    }

    public j7h getParameters() {
        return j7h.f49729g2;
    }

    @hib
    public p1e.InterfaceC10758f getRendererCapabilitiesListener() {
        return null;
    }

    @un1
    public void init(InterfaceC10828a interfaceC10828a, vp0 vp0Var) {
        this.f69942a = interfaceC10828a;
        this.f69943b = vp0Var;
    }

    public boolean isSetParametersSupported() {
        return false;
    }

    public abstract void onSelectionActivated(@hib Object obj);

    @un1
    public void release() {
        this.f69942a = null;
        this.f69943b = null;
    }

    public abstract q7h selectTracks(p1e[] p1eVarArr, m6h m6hVar, vna.C14175b c14175b, t1h t1hVar) throws ba5;

    public void setAudioAttributes(yc0 yc0Var) {
    }

    public void setParameters(j7h j7hVar) {
    }
}

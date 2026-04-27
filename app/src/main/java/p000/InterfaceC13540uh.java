package p000;

import java.io.IOException;
import p000.C2317ci;
import p000.nfa;

/* JADX INFO: renamed from: uh */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC13540uh {

    /* JADX INFO: renamed from: uh$a */
    @ovh
    public interface a {
        default void onAdClicked() {
        }

        default void onAdLoadError(C2317ci.a aVar, xh3 xh3Var) {
        }

        default void onAdPlaybackState(C9343mf c9343mf) {
        }

        default void onAdTapped() {
        }
    }

    /* JADX INFO: renamed from: uh$b */
    public interface b {
        @hib
        InterfaceC13540uh getAdsLoader(nfa.C9850b c9850b);
    }

    @ovh
    default boolean handleContentTimelineChanged(C2317ci c2317ci, q1h q1hVar) {
        return false;
    }

    @ovh
    void handlePrepareComplete(C2317ci c2317ci, int i, int i2);

    @ovh
    void handlePrepareError(C2317ci c2317ci, int i, int i2, IOException iOException);

    void release();

    void setPlayer(@hib izc izcVar);

    @ovh
    void setSupportedContentTypes(int... iArr);

    @ovh
    void start(C2317ci c2317ci, xh3 xh3Var, Object obj, InterfaceC6849hh interfaceC6849hh, a aVar);

    @ovh
    void stop(C2317ci c2317ci, a aVar);
}

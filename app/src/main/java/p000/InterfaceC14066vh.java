package p000;

import java.io.IOException;
import p000.C7909ji;
import p000.aga;

/* JADX INFO: renamed from: vh */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface InterfaceC14066vh {

    /* JADX INFO: renamed from: vh$a */
    public interface a {
        default void onAdClicked() {
        }

        default void onAdLoadError(C7909ji.a aVar, yh3 yh3Var) {
        }

        default void onAdPlaybackState(C10354of c10354of) {
        }

        default void onAdTapped() {
        }
    }

    /* JADX INFO: renamed from: vh$b */
    public interface b {
        @hib
        InterfaceC14066vh getAdsLoader(aga.C0234b c0234b);
    }

    void handlePrepareComplete(C7909ji c7909ji, int i, int i2);

    void handlePrepareError(C7909ji c7909ji, int i, int i2, IOException iOException);

    void release();

    void setPlayer(@hib lzc lzcVar);

    void setSupportedContentTypes(int... iArr);

    void start(C7909ji c7909ji, yh3 yh3Var, Object obj, InterfaceC6309gh interfaceC6309gh, a aVar);

    void stop(C7909ji c7909ji, a aVar);
}

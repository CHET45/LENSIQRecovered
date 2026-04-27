package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import androidx.media3.common.C1213a;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface a7i {

    /* JADX INFO: renamed from: a7i$a */
    public interface InterfaceC0086a {
        a7i create(Context context, e92 e92Var, sk3 sk3Var, InterfaceC0087b interfaceC0087b, Executor executor, long j, boolean z);

        boolean supportsMultipleInputs();
    }

    /* JADX INFO: renamed from: a7i$b */
    public interface InterfaceC0087b {
        default void onEnded(long j) {
        }

        default void onError(q6i q6iVar) {
        }

        default void onOutputFrameAvailableForRendering(long j, boolean z) {
        }

        default void onOutputFrameRateChanged(float f) {
        }

        default void onOutputSizeChanged(int i, int i2) {
        }
    }

    void flush();

    Surface getInputSurface(int i);

    int getPendingInputFrameCount(int i);

    boolean hasProducedFrameWithTimestampZero();

    void initialize() throws q6i;

    boolean queueInputBitmap(int i, Bitmap bitmap, j2h j2hVar);

    boolean queueInputTexture(int i, int i2, long j);

    void redraw();

    void registerInput(@h78(from = 0) int i) throws q6i;

    boolean registerInputFrame(int i);

    void registerInputStream(int i, int i2, C1213a c1213a, List<ix4> list, long j);

    void release();

    void renderOutputFrame(long j);

    void setCompositionEffects(List<ix4> list);

    void setCompositorSettings(d6i d6iVar);

    void setOnInputFrameProcessedListener(int i, c3c c3cVar);

    void setOnInputSurfaceReadyListener(int i, Runnable runnable);

    void setOutputSurfaceInfo(@hib ngg nggVar);

    void signalEndOfInput(int i);
}

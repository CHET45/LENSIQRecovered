package p000;

import android.os.Looper;
import androidx.media3.common.C1213a;
import java.util.List;
import p000.bh0;
import p000.izc;
import p000.una;
import p000.up0;

/* JADX INFO: renamed from: sn */
/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface InterfaceC12680sn extends izc.InterfaceC7680g, joa, up0.InterfaceC13636a, nr4 {
    void addListener(InterfaceC2409co interfaceC2409co);

    void notifySeekStarted();

    void onAudioCodecError(Exception exc);

    void onAudioDecoderInitialized(String str, long j, long j2);

    void onAudioDecoderReleased(String str);

    void onAudioDisabled(ol3 ol3Var);

    void onAudioEnabled(ol3 ol3Var);

    void onAudioInputFormatChanged(C1213a c1213a, @hib vl3 vl3Var);

    void onAudioPositionAdvancing(long j);

    void onAudioSinkError(Exception exc);

    void onAudioTrackInitialized(bh0.C1887a c1887a);

    void onAudioTrackReleased(bh0.C1887a c1887a);

    void onAudioUnderrun(int i, long j, long j2);

    void onDroppedFrames(int i, long j);

    void onRenderedFirstFrame(Object obj, long j);

    void onRendererReadyChanged(int i, int i2, boolean z);

    void onVideoCodecError(Exception exc);

    void onVideoDecoderInitialized(String str, long j, long j2);

    void onVideoDecoderReleased(String str);

    void onVideoDisabled(ol3 ol3Var);

    void onVideoEnabled(ol3 ol3Var);

    void onVideoFrameProcessingOffset(long j, int i);

    void onVideoInputFormatChanged(C1213a c1213a, @hib vl3 vl3Var);

    void release();

    void removeListener(InterfaceC2409co interfaceC2409co);

    void setPlayer(izc izcVar, Looper looper);

    void updateMediaPeriodQueueInfo(List<una.C13612b> list, @hib una.C13612b c13612b);
}

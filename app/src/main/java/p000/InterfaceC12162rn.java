package p000;

import android.os.Looper;
import com.google.android.exoplayer2.drm.InterfaceC3005e;
import java.util.List;
import p000.lzc;
import p000.vna;
import p000.vp0;

/* JADX INFO: renamed from: rn */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface InterfaceC12162rn extends lzc.InterfaceC9049g, koa, vp0.InterfaceC14197a, InterfaceC3005e {
    void addListener(InterfaceC5415eo interfaceC5415eo);

    void notifySeekStarted();

    void onAudioCodecError(Exception exc);

    void onAudioDecoderInitialized(String str, long j, long j2);

    void onAudioDecoderReleased(String str);

    void onAudioDisabled(nl3 nl3Var);

    void onAudioEnabled(nl3 nl3Var);

    void onAudioInputFormatChanged(kq6 kq6Var, @hib wl3 wl3Var);

    void onAudioPositionAdvancing(long j);

    void onAudioSinkError(Exception exc);

    void onAudioUnderrun(int i, long j, long j2);

    void onDroppedFrames(int i, long j);

    void onRenderedFirstFrame(Object obj, long j);

    void onVideoCodecError(Exception exc);

    void onVideoDecoderInitialized(String str, long j, long j2);

    void onVideoDecoderReleased(String str);

    void onVideoDisabled(nl3 nl3Var);

    void onVideoEnabled(nl3 nl3Var);

    void onVideoFrameProcessingOffset(long j, int i);

    void onVideoInputFormatChanged(kq6 kq6Var, @hib wl3 wl3Var);

    void release();

    void removeListener(InterfaceC5415eo interfaceC5415eo);

    void setPlayer(lzc lzcVar, Looper looper);

    void updateMediaPeriodQueueInfo(List<vna.C14175b> list, @hib vna.C14175b c14175b);
}

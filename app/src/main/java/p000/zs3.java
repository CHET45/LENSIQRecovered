package p000;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioTrack;
import android.os.Build;
import p000.bh0;
import p000.ps3;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class zs3 implements ps3.InterfaceC11095g {
    private AudioTrack createAudioTrackV21(bh0.C1887a c1887a, uc0 uc0Var, int i) {
        return new AudioTrack(getAudioTrackAttributesV21(uc0Var, c1887a.f13719d), t0i.getAudioFormat(c1887a.f13717b, c1887a.f13718c, c1887a.f13716a), c1887a.f13721f, 1, i);
    }

    @c5e(23)
    private AudioTrack createAudioTrackV23(bh0.C1887a c1887a, uc0 uc0Var, int i, @hib Context context) {
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(getAudioTrackAttributesV21(uc0Var, c1887a.f13719d)).setAudioFormat(t0i.getAudioFormat(c1887a.f13717b, c1887a.f13718c, c1887a.f13716a)).setTransferMode(1).setBufferSizeInBytes(c1887a.f13721f).setSessionId(i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            setOffloadedPlaybackV29(sessionId, c1887a.f13720e);
        }
        if (i2 >= 34 && context != null) {
            sessionId.setContext(context);
        }
        return m27060a(sessionId).build();
    }

    private AudioAttributes getAudioTrackAttributesV21(uc0 uc0Var, boolean z) {
        return z ? getAudioTrackTunnelingAttributesV21() : uc0Var.getAudioAttributesV21().f87481a;
    }

    private AudioAttributes getAudioTrackTunnelingAttributesV21() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    @c5e(29)
    private void setOffloadedPlaybackV29(AudioTrack.Builder builder, boolean z) {
        builder.setOffloadedPlayback(z);
    }

    @c5e(23)
    @op1
    /* JADX INFO: renamed from: a */
    public AudioTrack.Builder m27060a(AudioTrack.Builder builder) {
        return builder;
    }

    @Override // p000.ps3.InterfaceC11095g
    public final AudioTrack getAudioTrack(bh0.C1887a c1887a, uc0 uc0Var, int i, @hib Context context) {
        return createAudioTrackV23(c1887a, uc0Var, i, context);
    }
}

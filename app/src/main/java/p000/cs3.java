package p000;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
import androidx.media3.common.C1213a;
import p000.oe0;
import p000.ps3;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class cs3 implements ps3.InterfaceC11092d {

    /* JADX INFO: renamed from: c */
    public static final String f27198c = "offloadVariableRateSupported";

    /* JADX INFO: renamed from: a */
    @hib
    public final Context f27199a;

    /* JADX INFO: renamed from: b */
    public Boolean f27200b;

    /* JADX INFO: renamed from: cs3$a */
    @c5e(29)
    public static final class C4476a {
        private C4476a() {
        }

        public static oe0 getOffloadedPlaybackSupport(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
            return !AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes) ? oe0.f67372d : new oe0.C10335b().setIsFormatSupported(true).setIsSpeedChangeSupported(z).build();
        }
    }

    /* JADX INFO: renamed from: cs3$b */
    @c5e(31)
    public static final class C4477b {
        private C4477b() {
        }

        public static oe0 getOffloadedPlaybackSupport(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return oe0.f67372d;
            }
            return new oe0.C10335b().setIsFormatSupported(true).setIsGaplessSupported(Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2).setIsSpeedChangeSupported(z).build();
        }
    }

    public cs3() {
        this(null);
    }

    private boolean isOffloadVariableRateSupported(@hib Context context) {
        Boolean bool = this.f27200b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context != null) {
            String parameters = he0.getAudioManager(context).getParameters(f27198c);
            this.f27200b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
        } else {
            this.f27200b = Boolean.FALSE;
        }
        return this.f27200b.booleanValue();
    }

    @Override // p000.ps3.InterfaceC11092d
    public oe0 getAudioOffloadSupport(C1213a c1213a, uc0 uc0Var) {
        v80.checkNotNull(c1213a);
        v80.checkNotNull(uc0Var);
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || c1213a.f8267H == -1) {
            return oe0.f67372d;
        }
        boolean zIsOffloadVariableRateSupported = isOffloadVariableRateSupported(this.f27199a);
        int encoding = rva.getEncoding((String) v80.checkNotNull(c1213a.f8291o), c1213a.f8287k);
        if (encoding == 0 || i < t0i.getApiLevelThatAudioFormatIntroducedAudioEncoding(encoding)) {
            return oe0.f67372d;
        }
        int audioTrackChannelConfig = t0i.getAudioTrackChannelConfig(c1213a.f8266G);
        if (audioTrackChannelConfig == 0) {
            return oe0.f67372d;
        }
        try {
            AudioFormat audioFormat = t0i.getAudioFormat(c1213a.f8267H, audioTrackChannelConfig, encoding);
            return i >= 31 ? C4477b.getOffloadedPlaybackSupport(audioFormat, uc0Var.getAudioAttributesV21().f87481a, zIsOffloadVariableRateSupported) : C4476a.getOffloadedPlaybackSupport(audioFormat, uc0Var.getAudioAttributesV21().f87481a, zIsOffloadVariableRateSupported);
        } catch (IllegalArgumentException unused) {
            return oe0.f67372d;
        }
    }

    public cs3(@hib Context context) {
        this.f27199a = context == null ? null : context.getApplicationContext();
    }
}

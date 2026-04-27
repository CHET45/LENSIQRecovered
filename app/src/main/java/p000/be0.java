package p000;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class be0 {

    /* JADX INFO: renamed from: j */
    public static final int f13468j = -1;

    /* JADX INFO: renamed from: k */
    public static final int f13469k = 0;

    /* JADX INFO: renamed from: l */
    public static final int f13470l = 1;

    /* JADX INFO: renamed from: m */
    public static final int f13471m = 0;

    /* JADX INFO: renamed from: n */
    public static final int f13472n = 1;

    /* JADX INFO: renamed from: o */
    public static final int f13473o = 2;

    /* JADX INFO: renamed from: p */
    public static final int f13474p = 3;

    /* JADX INFO: renamed from: q */
    public static final int f13475q = 0;

    /* JADX INFO: renamed from: r */
    public static final int f13476r = 1;

    /* JADX INFO: renamed from: s */
    public static final int f13477s = 2;

    /* JADX INFO: renamed from: t */
    public static final int f13478t = 3;

    /* JADX INFO: renamed from: u */
    public static final int f13479u = 4;

    /* JADX INFO: renamed from: v */
    public static final String f13480v = "AudioFocusManager";

    /* JADX INFO: renamed from: w */
    public static final float f13481w = 0.2f;

    /* JADX INFO: renamed from: x */
    public static final float f13482x = 1.0f;

    /* JADX INFO: renamed from: a */
    public final AudioManager f13483a;

    /* JADX INFO: renamed from: b */
    public final C1852a f13484b;

    /* JADX INFO: renamed from: c */
    @hib
    public InterfaceC1854c f13485c;

    /* JADX INFO: renamed from: d */
    @hib
    public yc0 f13486d;

    /* JADX INFO: renamed from: f */
    public int f13488f;

    /* JADX INFO: renamed from: h */
    public AudioFocusRequest f13490h;

    /* JADX INFO: renamed from: i */
    public boolean f13491i;

    /* JADX INFO: renamed from: g */
    public float f13489g = 1.0f;

    /* JADX INFO: renamed from: e */
    public int f13487e = 0;

    /* JADX INFO: renamed from: be0$a */
    public class C1852a implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: a */
        public final Handler f13492a;

        public C1852a(Handler handler) {
            this.f13492a = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAudioFocusChange$0(int i) {
            be0.this.handlePlatformAudioFocusChange(i);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i) {
            this.f13492a.post(new Runnable() { // from class: ae0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1187a.lambda$onAudioFocusChange$0(i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: be0$b */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC1853b {
    }

    /* JADX INFO: renamed from: be0$c */
    public interface InterfaceC1854c {
        void executePlayerCommand(int i);

        void setVolumeMultiplier(float f);
    }

    public be0(Context context, Handler handler, InterfaceC1854c interfaceC1854c) {
        this.f13483a = (AudioManager) u80.checkNotNull((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f13485c = interfaceC1854c;
        this.f13484b = new C1852a(handler);
    }

    private void abandonAudioFocusDefault() {
        this.f13483a.abandonAudioFocus(this.f13484b);
    }

    private void abandonAudioFocusIfHeld() {
        if (this.f13487e == 0) {
            return;
        }
        if (x0i.f95978a >= 26) {
            abandonAudioFocusV26();
        } else {
            abandonAudioFocusDefault();
        }
        setAudioFocusState(0);
    }

    @c5e(26)
    private void abandonAudioFocusV26() {
        AudioFocusRequest audioFocusRequest = this.f13490h;
        if (audioFocusRequest != null) {
            this.f13483a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    private static int convertAudioAttributesToFocusGain(@hib yc0 yc0Var) {
        if (yc0Var == null) {
            return 0;
        }
        switch (yc0Var.f101072c) {
            case 0:
                yh9.m25919w("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (yc0Var.f101070a == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                yh9.m25919w("AudioFocusManager", "Unidentified audio usage: " + yc0Var.f101072c);
                return 0;
            case 16:
                return x0i.f95978a >= 19 ? 4 : 2;
        }
    }

    private void executePlayerCommand(int i) {
        InterfaceC1854c interfaceC1854c = this.f13485c;
        if (interfaceC1854c != null) {
            interfaceC1854c.executePlayerCommand(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePlatformAudioFocusChange(int i) {
        if (i == -3 || i == -2) {
            if (i != -2 && !willPauseWhenDucked()) {
                setAudioFocusState(3);
                return;
            } else {
                executePlayerCommand(0);
                setAudioFocusState(2);
                return;
            }
        }
        if (i == -1) {
            executePlayerCommand(-1);
            abandonAudioFocusIfHeld();
        } else if (i == 1) {
            setAudioFocusState(1);
            executePlayerCommand(1);
        } else {
            yh9.m25919w("AudioFocusManager", "Unknown focus change type: " + i);
        }
    }

    private int requestAudioFocus() {
        if (this.f13487e == 1) {
            return 1;
        }
        if ((x0i.f95978a >= 26 ? requestAudioFocusV26() : requestAudioFocusDefault()) == 1) {
            setAudioFocusState(1);
            return 1;
        }
        setAudioFocusState(0);
        return -1;
    }

    private int requestAudioFocusDefault() {
        return this.f13483a.requestAudioFocus(this.f13484b, x0i.getStreamTypeForAudioUsage(((yc0) u80.checkNotNull(this.f13486d)).f101072c), this.f13488f);
    }

    @c5e(26)
    private int requestAudioFocusV26() {
        AudioFocusRequest audioFocusRequest = this.f13490h;
        if (audioFocusRequest == null || this.f13491i) {
            this.f13490h = (audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f13488f) : new AudioFocusRequest.Builder(this.f13490h)).setAudioAttributes(((yc0) u80.checkNotNull(this.f13486d)).getAudioAttributesV21().f101076a).setWillPauseWhenDucked(willPauseWhenDucked()).setOnAudioFocusChangeListener(this.f13484b).build();
            this.f13491i = false;
        }
        return this.f13483a.requestAudioFocus(this.f13490h);
    }

    private void setAudioFocusState(int i) {
        if (this.f13487e == i) {
            return;
        }
        this.f13487e = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.f13489g == f) {
            return;
        }
        this.f13489g = f;
        InterfaceC1854c interfaceC1854c = this.f13485c;
        if (interfaceC1854c != null) {
            interfaceC1854c.setVolumeMultiplier(f);
        }
    }

    private boolean shouldAbandonAudioFocusIfHeld(int i) {
        return i == 1 || this.f13488f != 1;
    }

    private boolean willPauseWhenDucked() {
        yc0 yc0Var = this.f13486d;
        return yc0Var != null && yc0Var.f101070a == 1;
    }

    @fdi
    /* JADX INFO: renamed from: b */
    public AudioManager.OnAudioFocusChangeListener m3061b() {
        return this.f13484b;
    }

    public float getVolumeMultiplier() {
        return this.f13489g;
    }

    public void release() {
        this.f13485c = null;
        abandonAudioFocusIfHeld();
    }

    public void setAudioAttributes(@hib yc0 yc0Var) {
        if (x0i.areEqual(this.f13486d, yc0Var)) {
            return;
        }
        this.f13486d = yc0Var;
        int iConvertAudioAttributesToFocusGain = convertAudioAttributesToFocusGain(yc0Var);
        this.f13488f = iConvertAudioAttributesToFocusGain;
        boolean z = true;
        if (iConvertAudioAttributesToFocusGain != 1 && iConvertAudioAttributesToFocusGain != 0) {
            z = false;
        }
        u80.checkArgument(z, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int updateAudioFocus(boolean z, int i) {
        if (shouldAbandonAudioFocusIfHeld(i)) {
            abandonAudioFocusIfHeld();
            return z ? 1 : -1;
        }
        if (z) {
            return requestAudioFocus();
        }
        return -1;
    }
}

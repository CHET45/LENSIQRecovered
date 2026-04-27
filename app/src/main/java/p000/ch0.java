package p000;

import android.media.AudioDeviceInfo;
import com.blankj.utilcode.util.C2473f;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface ch0 {

    /* JADX INFO: renamed from: a */
    public static final int f16507a = 2;

    /* JADX INFO: renamed from: b */
    public static final int f16508b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f16509c = 0;

    /* JADX INFO: renamed from: d */
    public static final long f16510d = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ch0$b */
    public static final class C2309b extends Exception {

        /* JADX INFO: renamed from: a */
        public final int f16512a;

        /* JADX INFO: renamed from: b */
        public final boolean f16513b;

        /* JADX INFO: renamed from: c */
        public final kq6 f16514c;

        public C2309b(int i, int i2, int i3, int i4, kq6 kq6Var, boolean z, @hib Exception exc) {
            StringBuilder sb = new StringBuilder();
            sb.append("AudioTrack init failed ");
            sb.append(i);
            sb.append(C2473f.f17566z);
            sb.append("Config(");
            sb.append(i2);
            sb.append(", ");
            sb.append(i3);
            sb.append(", ");
            sb.append(i4);
            sb.append(c0b.f15434d);
            sb.append(C2473f.f17566z);
            sb.append(kq6Var);
            sb.append(z ? " (recoverable)" : "");
            super(sb.toString(), exc);
            this.f16512a = i;
            this.f16513b = z;
            this.f16514c = kq6Var;
        }
    }

    /* JADX INFO: renamed from: ch0$c */
    public interface InterfaceC2310c {
        default void onAudioCapabilitiesChanged() {
        }

        default void onAudioSinkError(Exception exc) {
        }

        default void onOffloadBufferEmptying() {
        }

        default void onOffloadBufferFull() {
        }

        default void onPositionAdvancing(long j) {
        }

        void onPositionDiscontinuity();

        void onSkipSilenceEnabledChanged(boolean z);

        void onUnderrun(int i, long j, long j2);
    }

    /* JADX INFO: renamed from: ch0$d */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC2311d {
    }

    /* JADX INFO: renamed from: ch0$e */
    public static final class C2312e extends Exception {

        /* JADX INFO: renamed from: a */
        public final long f16515a;

        /* JADX INFO: renamed from: b */
        public final long f16516b;

        public C2312e(long j, long j2) {
            super("Unexpected audio track timestamp discontinuity: expected " + j2 + ", got " + j);
            this.f16515a = j;
            this.f16516b = j2;
        }
    }

    /* JADX INFO: renamed from: ch0$f */
    public static final class C2313f extends Exception {

        /* JADX INFO: renamed from: a */
        public final int f16517a;

        /* JADX INFO: renamed from: b */
        public final boolean f16518b;

        /* JADX INFO: renamed from: c */
        public final kq6 f16519c;

        public C2313f(int i, kq6 kq6Var, boolean z) {
            super("AudioTrack write failed: " + i);
            this.f16518b = z;
            this.f16517a = i;
            this.f16519c = kq6Var;
        }
    }

    void configure(kq6 kq6Var, int i, @hib int[] iArr) throws C2308a;

    void disableTunneling();

    void enableTunnelingV21();

    void experimentalFlushWithoutAudioTrackRelease();

    void flush();

    @hib
    yc0 getAudioAttributes();

    long getCurrentPositionUs(boolean z);

    int getFormatSupport(kq6 kq6Var);

    qyc getPlaybackParameters();

    boolean getSkipSilenceEnabled();

    boolean handleBuffer(ByteBuffer byteBuffer, long j, int i) throws C2309b, C2313f;

    void handleDiscontinuity();

    boolean hasPendingData();

    boolean isEnded();

    void pause();

    void play();

    void playToEndOfStream() throws C2313f;

    default void release() {
    }

    void reset();

    void setAudioAttributes(yc0 yc0Var);

    void setAudioSessionId(int i);

    void setAuxEffectInfo(om0 om0Var);

    void setListener(InterfaceC2310c interfaceC2310c);

    default void setOutputStreamOffsetUs(long j) {
    }

    void setPlaybackParameters(qyc qycVar);

    default void setPlayerId(@hib k0d k0dVar) {
    }

    @c5e(23)
    default void setPreferredDevice(@hib AudioDeviceInfo audioDeviceInfo) {
    }

    void setSkipSilenceEnabled(boolean z);

    void setVolume(float f);

    boolean supportsFormat(kq6 kq6Var);

    /* JADX INFO: renamed from: ch0$a */
    public static final class C2308a extends Exception {

        /* JADX INFO: renamed from: a */
        public final kq6 f16511a;

        public C2308a(Throwable th, kq6 kq6Var) {
            super(th);
            this.f16511a = kq6Var;
        }

        public C2308a(String str, kq6 kq6Var) {
            super(str);
            this.f16511a = kq6Var;
        }
    }
}

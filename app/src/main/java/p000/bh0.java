package p000;

import android.media.AudioDeviceInfo;
import androidx.media3.common.C1213a;
import com.blankj.utilcode.util.C2473f;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface bh0 {

    /* JADX INFO: renamed from: a */
    public static final int f13709a = 2;

    /* JADX INFO: renamed from: b */
    public static final int f13710b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f13711c = 0;

    /* JADX INFO: renamed from: d */
    public static final long f13712d = Long.MIN_VALUE;

    /* JADX INFO: renamed from: e */
    public static final int f13713e = 0;

    /* JADX INFO: renamed from: f */
    public static final int f13714f = 1;

    /* JADX INFO: renamed from: g */
    public static final int f13715g = 2;

    /* JADX INFO: renamed from: bh0$a */
    public static final class C1887a {

        /* JADX INFO: renamed from: a */
        public final int f13716a;

        /* JADX INFO: renamed from: b */
        public final int f13717b;

        /* JADX INFO: renamed from: c */
        public final int f13718c;

        /* JADX INFO: renamed from: d */
        public final boolean f13719d;

        /* JADX INFO: renamed from: e */
        public final boolean f13720e;

        /* JADX INFO: renamed from: f */
        public final int f13721f;

        public C1887a(int i, int i2, int i3, boolean z, boolean z2, int i4) {
            this.f13716a = i;
            this.f13717b = i2;
            this.f13718c = i3;
            this.f13719d = z;
            this.f13720e = z2;
            this.f13721f = i4;
        }
    }

    /* JADX INFO: renamed from: bh0$d */
    public interface InterfaceC1890d {
        default void onAudioCapabilitiesChanged() {
        }

        default void onAudioSessionIdChanged(int i) {
        }

        default void onAudioSinkError(Exception exc) {
        }

        default void onAudioTrackInitialized(C1887a c1887a) {
        }

        default void onAudioTrackReleased(C1887a c1887a) {
        }

        default void onOffloadBufferEmptying() {
        }

        default void onOffloadBufferFull() {
        }

        default void onPositionAdvancing(long j) {
        }

        void onPositionDiscontinuity();

        default void onSilenceSkipped() {
        }

        void onSkipSilenceEnabledChanged(boolean z);

        void onUnderrun(int i, long j, long j2);
    }

    /* JADX INFO: renamed from: bh0$e */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC1891e {
    }

    /* JADX INFO: renamed from: bh0$f */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC1892f {
    }

    /* JADX INFO: renamed from: bh0$g */
    public static final class C1893g extends Exception {

        /* JADX INFO: renamed from: a */
        public final long f13726a;

        /* JADX INFO: renamed from: b */
        public final long f13727b;

        public C1893g(long j, long j2) {
            super("Unexpected audio track timestamp discontinuity: expected " + j2 + ", got " + j);
            this.f13726a = j;
            this.f13727b = j2;
        }
    }

    /* JADX INFO: renamed from: bh0$h */
    public static final class C1894h extends Exception {

        /* JADX INFO: renamed from: a */
        public final int f13728a;

        /* JADX INFO: renamed from: b */
        public final boolean f13729b;

        /* JADX INFO: renamed from: c */
        public final C1213a f13730c;

        public C1894h(int i, C1213a c1213a, boolean z) {
            super("AudioTrack write failed: " + i);
            this.f13729b = z;
            this.f13728a = i;
            this.f13730c = c1213a;
        }
    }

    void configure(C1213a c1213a, int i, @hib int[] iArr) throws C1888b;

    void disableTunneling();

    void enableTunnelingV21();

    void flush();

    @hib
    uc0 getAudioAttributes();

    long getAudioTrackBufferSizeUs();

    long getCurrentPositionUs(boolean z);

    default oe0 getFormatOffloadSupport(C1213a c1213a) {
        return oe0.f67372d;
    }

    int getFormatSupport(C1213a c1213a);

    ryc getPlaybackParameters();

    boolean getSkipSilenceEnabled();

    boolean handleBuffer(ByteBuffer byteBuffer, long j, int i) throws C1894h, C1889c;

    void handleDiscontinuity();

    boolean hasPendingData();

    boolean isEnded();

    void pause();

    void play();

    void playToEndOfStream() throws C1894h;

    default void release() {
    }

    void reset();

    void setAudioAttributes(uc0 uc0Var);

    void setAudioSessionId(int i);

    void setAuxEffectInfo(pm0 pm0Var);

    default void setClock(j52 j52Var) {
    }

    void setListener(InterfaceC1890d interfaceC1890d);

    @c5e(29)
    default void setOffloadDelayPadding(int i, int i2) {
    }

    @c5e(29)
    default void setOffloadMode(int i) {
    }

    default void setOutputStreamOffsetUs(long j) {
    }

    void setPlaybackParameters(ryc rycVar);

    default void setPlayerId(@hib j0d j0dVar) {
    }

    @c5e(23)
    default void setPreferredDevice(@hib AudioDeviceInfo audioDeviceInfo) {
    }

    void setSkipSilenceEnabled(boolean z);

    void setVolume(float f);

    boolean supportsFormat(C1213a c1213a);

    /* JADX INFO: renamed from: bh0$b */
    public static final class C1888b extends Exception {

        /* JADX INFO: renamed from: a */
        public final C1213a f13722a;

        public C1888b(Throwable th, C1213a c1213a) {
            super(th);
            this.f13722a = c1213a;
        }

        public C1888b(String str, C1213a c1213a) {
            super(str);
            this.f13722a = c1213a;
        }
    }

    /* JADX INFO: renamed from: bh0$c */
    public static final class C1889c extends Exception {

        /* JADX INFO: renamed from: a */
        public final int f13723a;

        /* JADX INFO: renamed from: b */
        public final boolean f13724b;

        /* JADX INFO: renamed from: c */
        public final C1213a f13725c;

        public C1889c(String str, int i, C1213a c1213a, boolean z, @hib Throwable th) {
            super(str, th);
            this.f13723a = i;
            this.f13724b = z;
            this.f13725c = c1213a;
        }

        public C1889c(int i, int i2, int i3, int i4, int i5, C1213a c1213a, boolean z, @hib Exception exc) {
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
            sb.append(", ");
            sb.append(i5);
            sb.append(c0b.f15434d);
            sb.append(C2473f.f17566z);
            sb.append(c1213a);
            sb.append(z ? " (recoverable)" : "");
            this(sb.toString(), i, c1213a, z, exc);
        }
    }
}

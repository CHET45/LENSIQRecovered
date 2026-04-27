package p000;

import androidx.media3.common.C1213a;
import com.blankj.utilcode.util.C2473f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface hf0 {

    /* JADX INFO: renamed from: a */
    public static final ByteBuffer f43348a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* JADX INFO: renamed from: hf0$a */
    public static final class C6832a {

        /* JADX INFO: renamed from: e */
        public static final C6832a f43349e = new C6832a(-1, -1, -1);

        /* JADX INFO: renamed from: a */
        public final int f43350a;

        /* JADX INFO: renamed from: b */
        public final int f43351b;

        /* JADX INFO: renamed from: c */
        public final int f43352c;

        /* JADX INFO: renamed from: d */
        public final int f43353d;

        public C6832a(C1213a c1213a) {
            this(c1213a.f8267H, c1213a.f8266G, c1213a.f8268I);
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6832a)) {
                return false;
            }
            C6832a c6832a = (C6832a) obj;
            return this.f43350a == c6832a.f43350a && this.f43351b == c6832a.f43351b && this.f43352c == c6832a.f43352c;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f43350a), Integer.valueOf(this.f43351b), Integer.valueOf(this.f43352c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f43350a + ", channelCount=" + this.f43351b + ", encoding=" + this.f43352c + C4584d2.f28243l;
        }

        public C6832a(int i, int i2, int i3) {
            this.f43350a = i;
            this.f43351b = i2;
            this.f43352c = i3;
            this.f43353d = t0i.isEncodingLinearPcm(i3) ? t0i.getPcmFrameSize(i3, i2) : -1;
        }
    }

    /* JADX INFO: renamed from: hf0$b */
    public static final class C6833b extends Exception {

        /* JADX INFO: renamed from: a */
        public final C6832a f43354a;

        public C6833b(C6832a c6832a) {
            this("Unhandled input format:", c6832a);
        }

        public C6833b(String str, C6832a c6832a) {
            super(str + C2473f.f17566z + c6832a);
            this.f43354a = c6832a;
        }
    }

    C6832a configure(C6832a c6832a) throws C6833b;

    void flush();

    default long getDurationAfterProcessorApplied(long j) {
        return j;
    }

    ByteBuffer getOutput();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(ByteBuffer byteBuffer);

    void reset();
}

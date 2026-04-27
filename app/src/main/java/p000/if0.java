package p000;

import com.blankj.utilcode.util.C2473f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface if0 {

    /* JADX INFO: renamed from: a */
    public static final ByteBuffer f46718a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* JADX INFO: renamed from: if0$a */
    public static final class C7262a {

        /* JADX INFO: renamed from: e */
        public static final C7262a f46719e = new C7262a(-1, -1, -1);

        /* JADX INFO: renamed from: a */
        public final int f46720a;

        /* JADX INFO: renamed from: b */
        public final int f46721b;

        /* JADX INFO: renamed from: c */
        public final int f46722c;

        /* JADX INFO: renamed from: d */
        public final int f46723d;

        public C7262a(int i, int i2, int i3) {
            this.f46720a = i;
            this.f46721b = i2;
            this.f46722c = i3;
            this.f46723d = x0i.isEncodingLinearPcm(i3) ? x0i.getPcmFrameSize(i3, i2) : -1;
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7262a)) {
                return false;
            }
            C7262a c7262a = (C7262a) obj;
            return this.f46720a == c7262a.f46720a && this.f46721b == c7262a.f46721b && this.f46722c == c7262a.f46722c;
        }

        public int hashCode() {
            return okb.hashCode(Integer.valueOf(this.f46720a), Integer.valueOf(this.f46721b), Integer.valueOf(this.f46722c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f46720a + ", channelCount=" + this.f46721b + ", encoding=" + this.f46722c + C4584d2.f28243l;
        }
    }

    /* JADX INFO: renamed from: if0$b */
    public static final class C7263b extends Exception {
        public C7263b(C7262a c7262a) {
            this("Unhandled input format:", c7262a);
        }

        public C7263b(String str, C7262a c7262a) {
            super(str + C2473f.f17566z + c7262a);
        }
    }

    @op1
    C7262a configure(C7262a c7262a) throws C7263b;

    void flush();

    ByteBuffer getOutput();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(ByteBuffer byteBuffer);

    void reset();
}

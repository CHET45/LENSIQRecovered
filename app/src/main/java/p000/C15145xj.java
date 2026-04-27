package p000;

import com.arthenica.ffmpegkit.StreamInformation;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: xj */
/* JADX INFO: loaded from: classes6.dex */
public class C15145xj extends rui {

    /* JADX INFO: renamed from: b */
    public static String f98122b = "pcm";

    /* JADX INFO: renamed from: c */
    public static String f98123c = "raw";

    /* JADX INFO: renamed from: d */
    public static String f98124d = "ico";

    /* JADX INFO: renamed from: e */
    public static String f98125e = "speex";

    /* JADX INFO: renamed from: f */
    public static String f98126f = "speex-wb";

    /* JADX INFO: renamed from: g */
    public static String f98127g = "lame";

    /* JADX INFO: renamed from: h */
    public static String f98128h = "opus";

    /* JADX INFO: renamed from: i */
    public static String f98129i = "opus-wb";

    /* JADX INFO: renamed from: j */
    public static String f98130j = "speex-wb";

    /* JADX INFO: renamed from: xj$a */
    public static class a extends AbstractC8399kk<a, C15145xj> {

        /* JADX INFO: renamed from: i */
        public String f98131i;

        /* JADX INFO: renamed from: j */
        public int f98132j;

        /* JADX INFO: renamed from: k */
        public int f98133k;

        /* JADX INFO: renamed from: l */
        public int f98134l;

        public a(String str) {
            super(new C15145xj(), str);
            this.f98131i = C15145xj.f98130j;
            this.f98132j = 16000;
            this.f98133k = 1;
            this.f98134l = 16;
        }

        @Override // p000.AbstractC8399kk
        /* JADX INFO: renamed from: a */
        public void mo9219a(int i) {
            m14806e(i, "encoding", this.f98131i.getBytes());
            m14805d(i, StreamInformation.KEY_SAMPLE_RATE, Integer.valueOf(this.f98132j));
            m14805d(i, "channels", Integer.valueOf(this.f98133k));
            m14805d(i, "bit_depth", Integer.valueOf(this.f98134l));
            ByteBuffer byteBuffer = this.f54313b;
            m14805d(i, "frame_size", Integer.valueOf(byteBuffer != null ? byteBuffer.capacity() : 0));
        }

        public a bitDepth(int i) {
            this.f98134l = ((Integer) m14809i(Integer.valueOf(this.f98134l), Integer.valueOf(i))).intValue();
            return this;
        }

        public a channels(int i) {
            this.f98133k = ((Integer) m14809i(Integer.valueOf(this.f98133k), Integer.valueOf(i))).intValue();
            return this;
        }

        public a encoding(String str) {
            this.f98131i = (String) m14809i(this.f98131i, str);
            return this;
        }

        @Override // p000.AbstractC8399kk
        /* JADX INFO: renamed from: h */
        public wvi mo9220h() {
            return wvi.AUDIO;
        }

        public a sampleRate(int i) {
            this.f98132j = ((Integer) m14809i(Integer.valueOf(this.f98132j), Integer.valueOf(i))).intValue();
            return this;
        }
    }

    public static a get(String str) {
        return new a(str);
    }

    public static void main(String[] strArr) {
        get("haha").data("111").status(EnumC0304al.BEGIN).bitDepth(1).valid().syncCtrl(1);
    }
}

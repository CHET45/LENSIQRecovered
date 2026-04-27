package p000;

import com.arthenica.ffmpegkit.StreamInformation;

/* JADX INFO: renamed from: ok */
/* JADX INFO: loaded from: classes6.dex */
public class C10396ok extends rui {

    /* JADX INFO: renamed from: b */
    public static String f67869b = "jpg";

    /* JADX INFO: renamed from: c */
    public static String f67870c = "jpeg";

    /* JADX INFO: renamed from: d */
    public static String f67871d = "png";

    /* JADX INFO: renamed from: e */
    public static String f67872e = "bmp";

    /* JADX INFO: renamed from: f */
    public static String f67873f = "webp";

    /* JADX INFO: renamed from: g */
    public static String f67874g = "tiff";

    /* JADX INFO: renamed from: h */
    public static String f67875h = "jpg";

    /* JADX INFO: renamed from: ok$b */
    public static class b extends AbstractC8399kk<b, C10396ok> {

        /* JADX INFO: renamed from: i */
        public String f67876i;

        /* JADX INFO: renamed from: j */
        public int f67877j;

        /* JADX INFO: renamed from: k */
        public int f67878k;

        /* JADX INFO: renamed from: l */
        public int f67879l;

        private b(String str) {
            super(new C10396ok(), str);
            this.f67876i = C10396ok.f67875h;
            this.f67877j = 0;
            this.f67878k = 0;
            this.f67879l = 0;
        }

        @Override // p000.AbstractC8399kk
        /* JADX INFO: renamed from: a */
        public void mo9219a(int i) {
            m14806e(i, "encoding", this.f67876i.getBytes());
            int i2 = this.f67877j;
            if (i2 != 0) {
                m14805d(i, StreamInformation.KEY_WIDTH, Integer.valueOf(i2));
            }
            int i3 = this.f67878k;
            if (i3 != 0) {
                m14805d(i, StreamInformation.KEY_HEIGHT, Integer.valueOf(i3));
            }
            int i4 = this.f67879l;
            if (i4 != 0) {
                m14805d(i, "dims", Integer.valueOf(i4));
            }
        }

        public b dims(int i) {
            this.f67879l = ((Integer) m14809i(Integer.valueOf(this.f67879l), Integer.valueOf(i))).intValue();
            return this;
        }

        public b encoding(String str) {
            this.f67876i = (String) m14809i(this.f67876i, str);
            return this;
        }

        @Override // p000.AbstractC8399kk
        /* JADX INFO: renamed from: h */
        public wvi mo9220h() {
            return wvi.IMAGE;
        }

        public b height(int i) {
            this.f67878k = ((Integer) m14809i(Integer.valueOf(this.f67878k), Integer.valueOf(i))).intValue();
            return this;
        }

        public b width(int i) {
            this.f67877j = ((Integer) m14809i(Integer.valueOf(this.f67877j), Integer.valueOf(i))).intValue();
            return this;
        }
    }

    public static b get(String str) {
        return new b(str);
    }
}

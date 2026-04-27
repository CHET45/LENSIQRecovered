package p000;

import com.arthenica.ffmpegkit.StreamInformation;
import java.security.InvalidParameterException;

/* JADX INFO: renamed from: el */
/* JADX INFO: loaded from: classes6.dex */
public class C5362el extends rui {

    /* JADX INFO: renamed from: b */
    public static String f33300b = "h264";

    /* JADX INFO: renamed from: c */
    public static String f33301c = "h264";

    /* JADX INFO: renamed from: el$a */
    public static class a extends AbstractC8399kk<a, C5362el> {

        /* JADX INFO: renamed from: i */
        public String f33302i;

        /* JADX INFO: renamed from: j */
        public int f33303j;

        /* JADX INFO: renamed from: k */
        public int f33304k;

        /* JADX INFO: renamed from: l */
        public int f33305l;

        public a(String str) {
            super(new C5362el(), str);
            this.f33302i = C5362el.f33301c;
            this.f33303j = -1;
            this.f33304k = -1;
            this.f33305l = -1;
        }

        @Override // p000.AbstractC8399kk
        /* JADX INFO: renamed from: a */
        public void mo9219a(int i) {
            m14806e(i, "encoding", this.f33302i.getBytes());
            m14805d(i, "frame_rate", Integer.valueOf(this.f33303j));
            m14805d(i, StreamInformation.KEY_WIDTH, Integer.valueOf(this.f33304k));
            m14805d(i, StreamInformation.KEY_HEIGHT, Integer.valueOf(this.f33305l));
        }

        public a encoding(String str) {
            this.f33302i = (String) m14809i(this.f33302i, str);
            return this;
        }

        public a frameRate(int i) {
            this.f33303j = ((Integer) m14809i(Integer.valueOf(this.f33303j), Integer.valueOf(i))).intValue();
            return this;
        }

        @Override // p000.AbstractC8399kk
        /* JADX INFO: renamed from: h */
        public wvi mo9220h() {
            return wvi.VIDEO;
        }

        public a height(int i) {
            this.f33305l = ((Integer) m14809i(Integer.valueOf(this.f33305l), Integer.valueOf(i))).intValue();
            return this;
        }

        @Override // p000.AbstractC8399kk
        public C5362el valid() {
            super.valid();
            if (this.f33303j == -1 || this.f33304k == -1 || this.f33305l == -1) {
                throw new InvalidParameterException();
            }
            return (C5362el) this.f54319h;
        }

        public a width(int i) {
            this.f33304k = ((Integer) m14809i(Integer.valueOf(this.f33304k), Integer.valueOf(i))).intValue();
            return this;
        }
    }

    public static a get(String str) {
        return new a(str);
    }

    public static void main(String[] strArr) {
        get("video").data("").frameRate(1).valid();
    }
}

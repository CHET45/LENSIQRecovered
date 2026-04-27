package p000;

import com.arthenica.ffmpegkit.MediaInformation;

/* JADX INFO: renamed from: dl */
/* JADX INFO: loaded from: classes6.dex */
public class C4839dl extends rui {

    /* JADX INFO: renamed from: b */
    public static String f29911b = "utf8";

    /* JADX INFO: renamed from: c */
    public static String f29912c = "gbk";

    /* JADX INFO: renamed from: d */
    public static String f29913d = "gb2312";

    /* JADX INFO: renamed from: e */
    public static String f29914e = "utf8";

    /* JADX INFO: renamed from: f */
    public static String f29915f = "raw";

    /* JADX INFO: renamed from: g */
    public static String f29916g = "gzip";

    /* JADX INFO: renamed from: h */
    public static String f29917h = "raw";

    /* JADX INFO: renamed from: i */
    public static String f29918i = "plain";

    /* JADX INFO: renamed from: j */
    public static String f29919j = "json";

    /* JADX INFO: renamed from: k */
    public static String f29920k = "xml";

    /* JADX INFO: renamed from: l */
    public static String f29921l = "plain";

    /* JADX INFO: renamed from: dl$b */
    public static class b extends AbstractC8399kk<b, C4839dl> {

        /* JADX INFO: renamed from: i */
        public String f29922i;

        /* JADX INFO: renamed from: j */
        public String f29923j;

        /* JADX INFO: renamed from: k */
        public String f29924k;

        private b(String str) {
            super(new C4839dl(), str);
            this.f29922i = C4839dl.f29914e;
            this.f29923j = C4839dl.f29917h;
            this.f29924k = C4839dl.f29921l;
        }

        @Override // p000.AbstractC8399kk
        /* JADX INFO: renamed from: a */
        public void mo9219a(int i) {
            m14806e(i, "encoding", this.f29922i.getBytes());
            m14806e(i, "compress", this.f29923j.getBytes());
            m14806e(i, MediaInformation.KEY_FORMAT_PROPERTIES, this.f29924k.getBytes());
        }

        public b compress(String str) {
            this.f29923j = (String) m14809i(this.f29923j, str);
            return this;
        }

        public b encoding(String str) {
            this.f29922i = (String) m14809i(this.f29922i, str);
            return this;
        }

        public b format(String str) {
            this.f29924k = (String) m14809i(this.f29924k, str);
            return this;
        }

        @Override // p000.AbstractC8399kk
        /* JADX INFO: renamed from: h */
        public wvi mo9220h() {
            return wvi.TEXT;
        }
    }

    public static b get(String str) {
        return new b(str);
    }

    public static void main(String[] strArr) {
        get("text").data("").compress(f29916g).valid();
    }
}

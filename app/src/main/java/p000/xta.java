package p000;

import androidx.media3.common.C1213a;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface xta {

    /* JADX INFO: renamed from: a */
    public static final xta f99231a = new C15297a();

    /* JADX INFO: renamed from: xta$a */
    public class C15297a implements xta {
        @Override // p000.xta
        public wta createDecoder(C1213a c1213a) {
            String str = c1213a.f8291o;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new j30();
                    case "application/x-icy":
                        return new vq7();
                    case "application/id3":
                        return new ar7();
                    case "application/x-emsg":
                        return new m65();
                    case "application/x-scte35":
                        return new oyf();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }

        @Override // p000.xta
        public boolean supportsFormat(C1213a c1213a) {
            String str = c1213a.f8291o;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }
    }

    wta createDecoder(C1213a c1213a);

    boolean supportsFormat(C1213a c1213a);
}

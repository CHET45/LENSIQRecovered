package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface yta {

    /* JADX INFO: renamed from: a */
    public static final yta f102950a = new C15803a();

    /* JADX INFO: renamed from: yta$a */
    public class C15803a implements yta {
        @Override // p000.yta
        public vta createDecoder(kq6 kq6Var) {
            String str = kq6Var.f54989M;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new i30();
                    case "application/x-icy":
                        return new uq7();
                    case "application/id3":
                        return new br7();
                    case "application/x-emsg":
                        return new l65();
                    case "application/x-scte35":
                        return new nyf();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }

        @Override // p000.yta
        public boolean supportsFormat(kq6 kq6Var) {
            String str = kq6Var.f54989M;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }
    }

    vta createDecoder(kq6 kq6Var);

    boolean supportsFormat(kq6 kq6Var);
}

package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface eeg {

    /* JADX INFO: renamed from: a */
    public static final eeg f32770a = new C5273a();

    /* JADX INFO: renamed from: eeg$a */
    public class C5273a implements eeg {
        @Override // p000.eeg
        public zdg createDecoder(kq6 kq6Var) {
            String str = kq6Var.f54989M;
            if (str != null) {
                switch (str) {
                    case "application/dvbsubs":
                        return new pt4(kq6Var.f54992Q);
                    case "application/pgs":
                        return new ssc();
                    case "application/x-mp4-vtt":
                        return new j1b();
                    case "text/vtt":
                        return new zji();
                    case "application/x-quicktime-tx3g":
                        return new dlh(kq6Var.f54992Q);
                    case "text/x-ssa":
                        return new vzf(kq6Var.f54992Q);
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new zs1(str, kq6Var.f55013j2, 16000L);
                    case "text/x-exoplayer-cues":
                        return new qf5();
                    case "application/cea-708":
                        return new dt1(kq6Var.f55013j2, kq6Var.f54992Q);
                    case "application/x-subrip":
                        return new ocg();
                    case "application/ttml+xml":
                        return new gkh();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }

        @Override // p000.eeg
        public boolean supportsFormat(kq6 kq6Var) {
            String str = kq6Var.f54989M;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || sva.f83047o0.equals(str);
        }
    }

    zdg createDecoder(kq6 kq6Var);

    boolean supportsFormat(kq6 kq6Var);
}

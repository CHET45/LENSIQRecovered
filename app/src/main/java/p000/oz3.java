package p000;

import androidx.media3.common.C1213a;
import java.util.Objects;
import p000.peg;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class oz3 implements peg.InterfaceC10936a {
    @Override // p000.peg.InterfaceC10936a
    public peg create(C1213a c1213a) {
        String str = c1213a.f8291o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new qt4(c1213a.f8294r);
                case "application/pgs":
                    return new tsc();
                case "application/x-mp4-vtt":
                    return new k1b();
                case "text/vtt":
                    return new aki();
                case "application/x-quicktime-tx3g":
                    return new elh(c1213a.f8294r);
                case "text/x-ssa":
                    return new yzf(c1213a.f8294r);
                case "application/vobsub":
                    return new ldi(c1213a.f8294r);
                case "application/x-subrip":
                    return new pcg();
                case "application/ttml+xml":
                    return new jkh();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }

    @Override // p000.peg.InterfaceC10936a
    public int getCueReplacementBehavior(C1213a c1213a) {
        String str = c1213a.f8291o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }

    @Override // p000.peg.InterfaceC10936a
    public boolean supportsFormat(C1213a c1213a) {
        String str = c1213a.f8291o;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }
}

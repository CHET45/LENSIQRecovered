package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.eta;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class o27 {

    /* JADX INFO: renamed from: c */
    public static final String f66273c = "com.apple.iTunes";

    /* JADX INFO: renamed from: d */
    public static final String f66274d = "iTunSMPB";

    /* JADX INFO: renamed from: e */
    public static final Pattern f66275e = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a */
    public int f66276a = -1;

    /* JADX INFO: renamed from: b */
    public int f66277b = -1;

    private boolean setFromComment(String str) {
        Matcher matcher = f66275e.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i = Integer.parseInt((String) t0i.castNonNull(matcher.group(1)), 16);
            int i2 = Integer.parseInt((String) t0i.castNonNull(matcher.group(2)), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.f66276a = i;
            this.f66277b = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean hasGaplessInfo() {
        return (this.f66276a == -1 || this.f66277b == -1) ? false : true;
    }

    public boolean setFromMetadata(eta etaVar) {
        for (int i = 0; i < etaVar.length(); i++) {
            eta.InterfaceC5464a interfaceC5464a = etaVar.get(i);
            if (interfaceC5464a instanceof vb2) {
                vb2 vb2Var = (vb2) interfaceC5464a;
                if ("iTunSMPB".equals(vb2Var.f90539c) && setFromComment(vb2Var.f90540d)) {
                    return true;
                }
            } else if (interfaceC5464a instanceof ra8) {
                ra8 ra8Var = (ra8) interfaceC5464a;
                if ("com.apple.iTunes".equals(ra8Var.f77581b) && "iTunSMPB".equals(ra8Var.f77582c) && setFromComment(ra8Var.f77583d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}

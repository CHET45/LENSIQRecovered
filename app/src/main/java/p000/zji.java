package p000;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class zji extends djf {

    /* JADX INFO: renamed from: q */
    public static final int f105324q = -1;

    /* JADX INFO: renamed from: r */
    public static final int f105325r = 0;

    /* JADX INFO: renamed from: s */
    public static final int f105326s = 1;

    /* JADX INFO: renamed from: t */
    public static final int f105327t = 2;

    /* JADX INFO: renamed from: u */
    public static final int f105328u = 3;

    /* JADX INFO: renamed from: v */
    public static final String f105329v = "NOTE";

    /* JADX INFO: renamed from: w */
    public static final String f105330w = "STYLE";

    /* JADX INFO: renamed from: o */
    public final ihc f105331o;

    /* JADX INFO: renamed from: p */
    public final pji f105332p;

    public zji() {
        super("WebvttDecoder");
        this.f105331o = new ihc();
        this.f105332p = new pji();
    }

    private static int getNextEvent(ihc ihcVar) {
        int i = -1;
        int position = 0;
        while (i == -1) {
            position = ihcVar.getPosition();
            String line = ihcVar.readLine();
            i = line == null ? 0 : "STYLE".equals(line) ? 2 : line.startsWith("NOTE") ? 1 : 3;
        }
        ihcVar.setPosition(position);
        return i;
    }

    private static void skipComment(ihc ihcVar) {
        while (!TextUtils.isEmpty(ihcVar.readLine())) {
        }
    }

    @Override // p000.djf
    /* JADX INFO: renamed from: l */
    public xdg mo9213l(byte[] bArr, int i, boolean z) throws beg {
        tji cue;
        this.f105331o.reset(bArr, i);
        ArrayList arrayList = new ArrayList();
        try {
            bki.validateWebvttHeaderLine(this.f105331o);
            while (!TextUtils.isEmpty(this.f105331o.readLine())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int nextEvent = getNextEvent(this.f105331o);
                if (nextEvent == 0) {
                    return new fki(arrayList2);
                }
                if (nextEvent == 1) {
                    skipComment(this.f105331o);
                } else if (nextEvent == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new beg("A style block was found after the first cue.");
                    }
                    this.f105331o.readLine();
                    arrayList.addAll(this.f105332p.parseBlock(this.f105331o));
                } else if (nextEvent == 3 && (cue = yji.parseCue(this.f105331o, arrayList)) != null) {
                    arrayList2.add(cue);
                }
            }
        } catch (xhc e) {
            throw new beg(e);
        }
    }
}

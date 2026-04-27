package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import p000.peg;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class aki implements peg {

    /* JADX INFO: renamed from: c */
    public static final int f1926c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f1927d = -1;

    /* JADX INFO: renamed from: e */
    public static final int f1928e = 0;

    /* JADX INFO: renamed from: f */
    public static final int f1929f = 1;

    /* JADX INFO: renamed from: g */
    public static final int f1930g = 2;

    /* JADX INFO: renamed from: h */
    public static final int f1931h = 3;

    /* JADX INFO: renamed from: i */
    public static final String f1932i = "NOTE";

    /* JADX INFO: renamed from: j */
    public static final String f1933j = "STYLE";

    /* JADX INFO: renamed from: a */
    public final jhc f1934a = new jhc();

    /* JADX INFO: renamed from: b */
    public final qji f1935b = new qji();

    private static int getNextEvent(jhc jhcVar) {
        int i = -1;
        int position = 0;
        while (i == -1) {
            position = jhcVar.getPosition();
            String line = jhcVar.readLine();
            i = line == null ? 0 : "STYLE".equals(line) ? 2 : line.startsWith("NOTE") ? 1 : 3;
        }
        jhcVar.setPosition(position);
        return i;
    }

    private static void skipComment(jhc jhcVar) {
        while (!TextUtils.isEmpty(jhcVar.readLine())) {
        }
    }

    @Override // p000.peg
    public int getCueReplacementBehavior() {
        return 1;
    }

    @Override // p000.peg
    public void parse(byte[] bArr, int i, int i2, peg.C10937b c10937b, qu2<ba3> qu2Var) {
        uji cue;
        this.f1934a.reset(bArr, i2 + i);
        this.f1934a.setPosition(i);
        ArrayList arrayList = new ArrayList();
        try {
            cki.validateWebvttHeaderLine(this.f1934a);
            while (!TextUtils.isEmpty(this.f1934a.readLine())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int nextEvent = getNextEvent(this.f1934a);
                if (nextEvent == 0) {
                    y39.toCuesWithTiming(new gki(arrayList2), c10937b, qu2Var);
                    return;
                }
                if (nextEvent == 1) {
                    skipComment(this.f1934a);
                } else if (nextEvent == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.f1934a.readLine();
                    arrayList.addAll(this.f1935b.parseBlock(this.f1934a));
                } else if (nextEvent == 3 && (cue = vji.parseCue(this.f1934a, arrayList)) != null) {
                    arrayList2.add(cue);
                }
            }
        } catch (yhc e) {
            throw new IllegalArgumentException(e);
        }
    }
}

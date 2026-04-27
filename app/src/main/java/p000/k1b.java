package p000;

import java.util.ArrayList;
import java.util.Collections;
import p000.n93;
import p000.peg;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class k1b implements peg {

    /* JADX INFO: renamed from: b */
    public static final int f52372b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f52373c = 8;

    /* JADX INFO: renamed from: d */
    public static final int f52374d = 1885436268;

    /* JADX INFO: renamed from: e */
    public static final int f52375e = 1937011815;

    /* JADX INFO: renamed from: f */
    public static final int f52376f = 1987343459;

    /* JADX INFO: renamed from: a */
    public final jhc f52377a = new jhc();

    private static n93 parseVttCueBox(jhc jhcVar, int i) {
        CharSequence charSequenceM24040b = null;
        n93.C9750c c9750cM24039a = null;
        while (i > 0) {
            v80.checkArgument(i >= 8, "Incomplete vtt cue box header found.");
            int i2 = jhcVar.readInt();
            int i3 = jhcVar.readInt();
            int i4 = i2 - 8;
            String strFromUtf8Bytes = t0i.fromUtf8Bytes(jhcVar.getData(), jhcVar.getPosition(), i4);
            jhcVar.skipBytes(i4);
            i = (i - 8) - i4;
            if (i3 == 1937011815) {
                c9750cM24039a = vji.m24039a(strFromUtf8Bytes);
            } else if (i3 == 1885436268) {
                charSequenceM24040b = vji.m24040b(null, strFromUtf8Bytes.trim(), Collections.emptyList());
            }
        }
        if (charSequenceM24040b == null) {
            charSequenceM24040b = "";
        }
        return c9750cM24039a != null ? c9750cM24039a.setText(charSequenceM24040b).build() : vji.newCueForText(charSequenceM24040b);
    }

    @Override // p000.peg
    public int getCueReplacementBehavior() {
        return 2;
    }

    @Override // p000.peg
    public void parse(byte[] bArr, int i, int i2, peg.C10937b c10937b, qu2<ba3> qu2Var) {
        this.f52377a.reset(bArr, i2 + i);
        this.f52377a.setPosition(i);
        ArrayList arrayList = new ArrayList();
        while (this.f52377a.bytesLeft() > 0) {
            v80.checkArgument(this.f52377a.bytesLeft() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int i3 = this.f52377a.readInt();
            if (this.f52377a.readInt() == 1987343459) {
                arrayList.add(parseVttCueBox(this.f52377a, i3 - 8));
            } else {
                this.f52377a.skipBytes(i3 - 8);
            }
        }
        qu2Var.accept(new ba3(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}

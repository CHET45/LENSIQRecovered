package p000;

import java.util.ArrayList;
import java.util.Collections;
import p000.o93;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class j1b extends djf {

    /* JADX INFO: renamed from: p */
    public static final int f49334p = 8;

    /* JADX INFO: renamed from: q */
    public static final int f49335q = 1885436268;

    /* JADX INFO: renamed from: r */
    public static final int f49336r = 1937011815;

    /* JADX INFO: renamed from: s */
    public static final int f49337s = 1987343459;

    /* JADX INFO: renamed from: o */
    public final ihc f49338o;

    public j1b() {
        super("Mp4WebvttDecoder");
        this.f49338o = new ihc();
    }

    private static o93 parseVttCueBox(ihc ihcVar, int i) throws beg {
        CharSequence charSequenceM26152c = null;
        o93.C10261c c10261cM26151b = null;
        while (i > 0) {
            if (i < 8) {
                throw new beg("Incomplete vtt cue box header found.");
            }
            int i2 = ihcVar.readInt();
            int i3 = ihcVar.readInt();
            int i4 = i2 - 8;
            String strFromUtf8Bytes = x0i.fromUtf8Bytes(ihcVar.getData(), ihcVar.getPosition(), i4);
            ihcVar.skipBytes(i4);
            i = (i - 8) - i4;
            if (i3 == 1937011815) {
                c10261cM26151b = yji.m26151b(strFromUtf8Bytes);
            } else if (i3 == 1885436268) {
                charSequenceM26152c = yji.m26152c(null, strFromUtf8Bytes.trim(), Collections.emptyList());
            }
        }
        if (charSequenceM26152c == null) {
            charSequenceM26152c = "";
        }
        return c10261cM26151b != null ? c10261cM26151b.setText(charSequenceM26152c).build() : yji.m26150a(charSequenceM26152c);
    }

    @Override // p000.djf
    /* JADX INFO: renamed from: l */
    public xdg mo9213l(byte[] bArr, int i, boolean z) throws beg {
        this.f49338o.reset(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.f49338o.bytesLeft() > 0) {
            if (this.f49338o.bytesLeft() < 8) {
                throw new beg("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int i2 = this.f49338o.readInt();
            if (this.f49338o.readInt() == 1987343459) {
                arrayList.add(parseVttCueBox(this.f49338o, i2 - 8));
            } else {
                this.f49338o.skipBytes(i2 - 8);
            }
        }
        return new l1b(arrayList);
    }
}

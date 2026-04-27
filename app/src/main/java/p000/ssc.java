package p000;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import p000.o93;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ssc extends djf {

    /* JADX INFO: renamed from: s */
    public static final int f82756s = 20;

    /* JADX INFO: renamed from: t */
    public static final int f82757t = 21;

    /* JADX INFO: renamed from: u */
    public static final int f82758u = 22;

    /* JADX INFO: renamed from: v */
    public static final int f82759v = 128;

    /* JADX INFO: renamed from: w */
    public static final byte f82760w = 120;

    /* JADX INFO: renamed from: o */
    public final ihc f82761o;

    /* JADX INFO: renamed from: p */
    public final ihc f82762p;

    /* JADX INFO: renamed from: q */
    public final C12767a f82763q;

    /* JADX INFO: renamed from: r */
    @hib
    public Inflater f82764r;

    /* JADX INFO: renamed from: ssc$a */
    public static final class C12767a {

        /* JADX INFO: renamed from: a */
        public final ihc f82765a = new ihc();

        /* JADX INFO: renamed from: b */
        public final int[] f82766b = new int[256];

        /* JADX INFO: renamed from: c */
        public boolean f82767c;

        /* JADX INFO: renamed from: d */
        public int f82768d;

        /* JADX INFO: renamed from: e */
        public int f82769e;

        /* JADX INFO: renamed from: f */
        public int f82770f;

        /* JADX INFO: renamed from: g */
        public int f82771g;

        /* JADX INFO: renamed from: h */
        public int f82772h;

        /* JADX INFO: renamed from: i */
        public int f82773i;

        /* JADX INFO: Access modifiers changed from: private */
        public void parseBitmapSection(ihc ihcVar, int i) {
            int unsignedInt24;
            if (i < 4) {
                return;
            }
            ihcVar.skipBytes(3);
            int i2 = i - 4;
            if ((ihcVar.readUnsignedByte() & 128) != 0) {
                if (i2 < 7 || (unsignedInt24 = ihcVar.readUnsignedInt24()) < 4) {
                    return;
                }
                this.f82772h = ihcVar.readUnsignedShort();
                this.f82773i = ihcVar.readUnsignedShort();
                this.f82765a.reset(unsignedInt24 - 4);
                i2 = i - 11;
            }
            int position = this.f82765a.getPosition();
            int iLimit = this.f82765a.limit();
            if (position >= iLimit || i2 <= 0) {
                return;
            }
            int iMin = Math.min(i2, iLimit - position);
            ihcVar.readBytes(this.f82765a.getData(), position, iMin);
            this.f82765a.setPosition(position + iMin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void parseIdentifierSection(ihc ihcVar, int i) {
            if (i < 19) {
                return;
            }
            this.f82768d = ihcVar.readUnsignedShort();
            this.f82769e = ihcVar.readUnsignedShort();
            ihcVar.skipBytes(11);
            this.f82770f = ihcVar.readUnsignedShort();
            this.f82771g = ihcVar.readUnsignedShort();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void parsePaletteSection(ihc ihcVar, int i) {
            if (i % 5 != 2) {
                return;
            }
            ihcVar.skipBytes(2);
            Arrays.fill(this.f82766b, 0);
            int i2 = i / 5;
            for (int i3 = 0; i3 < i2; i3++) {
                int unsignedByte = ihcVar.readUnsignedByte();
                int unsignedByte2 = ihcVar.readUnsignedByte();
                int unsignedByte3 = ihcVar.readUnsignedByte();
                int unsignedByte4 = ihcVar.readUnsignedByte();
                double d = unsignedByte2;
                double d2 = unsignedByte3 - 128;
                double d3 = unsignedByte4 - 128;
                this.f82766b[unsignedByte] = (x0i.constrainValue((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (ihcVar.readUnsignedByte() << 24) | (x0i.constrainValue((int) ((1.402d * d2) + d), 0, 255) << 16) | x0i.constrainValue((int) (d + (d3 * 1.772d)), 0, 255);
            }
            this.f82767c = true;
        }

        @hib
        public o93 build() {
            int unsignedByte;
            if (this.f82768d == 0 || this.f82769e == 0 || this.f82772h == 0 || this.f82773i == 0 || this.f82765a.limit() == 0 || this.f82765a.getPosition() != this.f82765a.limit() || !this.f82767c) {
                return null;
            }
            this.f82765a.setPosition(0);
            int i = this.f82772h * this.f82773i;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int unsignedByte2 = this.f82765a.readUnsignedByte();
                if (unsignedByte2 != 0) {
                    unsignedByte = i2 + 1;
                    iArr[i2] = this.f82766b[unsignedByte2];
                } else {
                    int unsignedByte3 = this.f82765a.readUnsignedByte();
                    if (unsignedByte3 != 0) {
                        unsignedByte = ((unsignedByte3 & 64) == 0 ? unsignedByte3 & 63 : ((unsignedByte3 & 63) << 8) | this.f82765a.readUnsignedByte()) + i2;
                        Arrays.fill(iArr, i2, unsignedByte, (unsignedByte3 & 128) == 0 ? 0 : this.f82766b[this.f82765a.readUnsignedByte()]);
                    }
                }
                i2 = unsignedByte;
            }
            return new o93.C10261c().setBitmap(Bitmap.createBitmap(iArr, this.f82772h, this.f82773i, Bitmap.Config.ARGB_8888)).setPosition(this.f82770f / this.f82768d).setPositionAnchor(0).setLine(this.f82771g / this.f82769e, 0).setLineAnchor(0).setSize(this.f82772h / this.f82768d).setBitmapHeight(this.f82773i / this.f82769e).build();
        }

        public void reset() {
            this.f82768d = 0;
            this.f82769e = 0;
            this.f82770f = 0;
            this.f82771g = 0;
            this.f82772h = 0;
            this.f82773i = 0;
            this.f82765a.reset(0);
            this.f82767c = false;
        }
    }

    public ssc() {
        super("PgsDecoder");
        this.f82761o = new ihc();
        this.f82762p = new ihc();
        this.f82763q = new C12767a();
    }

    private void maybeInflateData(ihc ihcVar) {
        if (ihcVar.bytesLeft() <= 0 || ihcVar.peekUnsignedByte() != 120) {
            return;
        }
        if (this.f82764r == null) {
            this.f82764r = new Inflater();
        }
        if (x0i.inflate(ihcVar, this.f82762p, this.f82764r)) {
            ihcVar.reset(this.f82762p.getData(), this.f82762p.limit());
        }
    }

    @hib
    private static o93 readNextSection(ihc ihcVar, C12767a c12767a) {
        int iLimit = ihcVar.limit();
        int unsignedByte = ihcVar.readUnsignedByte();
        int unsignedShort = ihcVar.readUnsignedShort();
        int position = ihcVar.getPosition() + unsignedShort;
        o93 o93VarBuild = null;
        if (position > iLimit) {
            ihcVar.setPosition(iLimit);
            return null;
        }
        if (unsignedByte != 128) {
            switch (unsignedByte) {
                case 20:
                    c12767a.parsePaletteSection(ihcVar, unsignedShort);
                    break;
                case 21:
                    c12767a.parseBitmapSection(ihcVar, unsignedShort);
                    break;
                case 22:
                    c12767a.parseIdentifierSection(ihcVar, unsignedShort);
                    break;
            }
        } else {
            o93VarBuild = c12767a.build();
            c12767a.reset();
        }
        ihcVar.setPosition(position);
        return o93VarBuild;
    }

    @Override // p000.djf
    /* JADX INFO: renamed from: l */
    public xdg mo9213l(byte[] bArr, int i, boolean z) throws beg {
        this.f82761o.reset(bArr, i);
        maybeInflateData(this.f82761o);
        this.f82763q.reset();
        ArrayList arrayList = new ArrayList();
        while (this.f82761o.bytesLeft() >= 3) {
            o93 nextSection = readNextSection(this.f82761o, this.f82763q);
            if (nextSection != null) {
                arrayList.add(nextSection);
            }
        }
        return new usc(Collections.unmodifiableList(arrayList));
    }
}

package p000;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;
import p000.n93;
import p000.peg;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class tsc implements peg {

    /* JADX INFO: renamed from: e */
    public static final int f85720e = 2;

    /* JADX INFO: renamed from: f */
    public static final int f85721f = 20;

    /* JADX INFO: renamed from: g */
    public static final int f85722g = 21;

    /* JADX INFO: renamed from: h */
    public static final int f85723h = 22;

    /* JADX INFO: renamed from: i */
    public static final int f85724i = 128;

    /* JADX INFO: renamed from: a */
    public final jhc f85725a = new jhc();

    /* JADX INFO: renamed from: b */
    public final jhc f85726b = new jhc();

    /* JADX INFO: renamed from: c */
    public final C13184a f85727c = new C13184a();

    /* JADX INFO: renamed from: d */
    @hib
    public Inflater f85728d;

    /* JADX INFO: renamed from: tsc$a */
    public static final class C13184a {

        /* JADX INFO: renamed from: a */
        public final jhc f85729a = new jhc();

        /* JADX INFO: renamed from: b */
        public final int[] f85730b = new int[256];

        /* JADX INFO: renamed from: c */
        public boolean f85731c;

        /* JADX INFO: renamed from: d */
        public int f85732d;

        /* JADX INFO: renamed from: e */
        public int f85733e;

        /* JADX INFO: renamed from: f */
        public int f85734f;

        /* JADX INFO: renamed from: g */
        public int f85735g;

        /* JADX INFO: renamed from: h */
        public int f85736h;

        /* JADX INFO: renamed from: i */
        public int f85737i;

        /* JADX INFO: Access modifiers changed from: private */
        public void parseBitmapSection(jhc jhcVar, int i) {
            int unsignedInt24;
            if (i < 4) {
                return;
            }
            jhcVar.skipBytes(3);
            int i2 = i - 4;
            if ((jhcVar.readUnsignedByte() & 128) != 0) {
                if (i2 < 7 || (unsignedInt24 = jhcVar.readUnsignedInt24()) < 4) {
                    return;
                }
                this.f85736h = jhcVar.readUnsignedShort();
                this.f85737i = jhcVar.readUnsignedShort();
                this.f85729a.reset(unsignedInt24 - 4);
                i2 = i - 11;
            }
            int position = this.f85729a.getPosition();
            int iLimit = this.f85729a.limit();
            if (position >= iLimit || i2 <= 0) {
                return;
            }
            int iMin = Math.min(i2, iLimit - position);
            jhcVar.readBytes(this.f85729a.getData(), position, iMin);
            this.f85729a.setPosition(position + iMin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void parseIdentifierSection(jhc jhcVar, int i) {
            if (i < 19) {
                return;
            }
            this.f85732d = jhcVar.readUnsignedShort();
            this.f85733e = jhcVar.readUnsignedShort();
            jhcVar.skipBytes(11);
            this.f85734f = jhcVar.readUnsignedShort();
            this.f85735g = jhcVar.readUnsignedShort();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void parsePaletteSection(jhc jhcVar, int i) {
            if (i % 5 != 2) {
                return;
            }
            jhcVar.skipBytes(2);
            Arrays.fill(this.f85730b, 0);
            int i2 = i / 5;
            for (int i3 = 0; i3 < i2; i3++) {
                int unsignedByte = jhcVar.readUnsignedByte();
                int unsignedByte2 = jhcVar.readUnsignedByte();
                int unsignedByte3 = jhcVar.readUnsignedByte();
                int unsignedByte4 = jhcVar.readUnsignedByte();
                double d = unsignedByte2;
                double d2 = unsignedByte3 - 128;
                double d3 = unsignedByte4 - 128;
                this.f85730b[unsignedByte] = (t0i.constrainValue((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (jhcVar.readUnsignedByte() << 24) | (t0i.constrainValue((int) ((1.402d * d2) + d), 0, 255) << 16) | t0i.constrainValue((int) (d + (d3 * 1.772d)), 0, 255);
            }
            this.f85731c = true;
        }

        @hib
        public n93 build() {
            int unsignedByte;
            if (this.f85732d == 0 || this.f85733e == 0 || this.f85736h == 0 || this.f85737i == 0 || this.f85729a.limit() == 0 || this.f85729a.getPosition() != this.f85729a.limit() || !this.f85731c) {
                return null;
            }
            this.f85729a.setPosition(0);
            int i = this.f85736h * this.f85737i;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int unsignedByte2 = this.f85729a.readUnsignedByte();
                if (unsignedByte2 != 0) {
                    unsignedByte = i2 + 1;
                    iArr[i2] = this.f85730b[unsignedByte2];
                } else {
                    int unsignedByte3 = this.f85729a.readUnsignedByte();
                    if (unsignedByte3 != 0) {
                        unsignedByte = ((unsignedByte3 & 64) == 0 ? unsignedByte3 & 63 : ((unsignedByte3 & 63) << 8) | this.f85729a.readUnsignedByte()) + i2;
                        Arrays.fill(iArr, i2, unsignedByte, (unsignedByte3 & 128) == 0 ? this.f85730b[0] : this.f85730b[this.f85729a.readUnsignedByte()]);
                    }
                }
                i2 = unsignedByte;
            }
            return new n93.C9750c().setBitmap(Bitmap.createBitmap(iArr, this.f85736h, this.f85737i, Bitmap.Config.ARGB_8888)).setPosition(this.f85734f / this.f85732d).setPositionAnchor(0).setLine(this.f85735g / this.f85733e, 0).setLineAnchor(0).setSize(this.f85736h / this.f85732d).setBitmapHeight(this.f85737i / this.f85733e).build();
        }

        public void reset() {
            this.f85732d = 0;
            this.f85733e = 0;
            this.f85734f = 0;
            this.f85735g = 0;
            this.f85736h = 0;
            this.f85737i = 0;
            this.f85729a.reset(0);
            this.f85731c = false;
        }
    }

    @hib
    private static n93 readNextSection(jhc jhcVar, C13184a c13184a) {
        int iLimit = jhcVar.limit();
        int unsignedByte = jhcVar.readUnsignedByte();
        int unsignedShort = jhcVar.readUnsignedShort();
        int position = jhcVar.getPosition() + unsignedShort;
        n93 n93VarBuild = null;
        if (position > iLimit) {
            jhcVar.setPosition(iLimit);
            return null;
        }
        if (unsignedByte != 128) {
            switch (unsignedByte) {
                case 20:
                    c13184a.parsePaletteSection(jhcVar, unsignedShort);
                    break;
                case 21:
                    c13184a.parseBitmapSection(jhcVar, unsignedShort);
                    break;
                case 22:
                    c13184a.parseIdentifierSection(jhcVar, unsignedShort);
                    break;
            }
        } else {
            n93VarBuild = c13184a.build();
            c13184a.reset();
        }
        jhcVar.setPosition(position);
        return n93VarBuild;
    }

    @Override // p000.peg
    public int getCueReplacementBehavior() {
        return 2;
    }

    @Override // p000.peg
    public void parse(byte[] bArr, int i, int i2, peg.C10937b c10937b, qu2<ba3> qu2Var) {
        this.f85725a.reset(bArr, i2 + i);
        this.f85725a.setPosition(i);
        if (this.f85728d == null) {
            this.f85728d = new Inflater();
        }
        if (t0i.maybeInflate(this.f85725a, this.f85726b, this.f85728d)) {
            this.f85725a.reset(this.f85726b.getData(), this.f85726b.limit());
        }
        this.f85727c.reset();
        ArrayList arrayList = new ArrayList();
        while (this.f85725a.bytesLeft() >= 3) {
            n93 nextSection = readNextSection(this.f85725a, this.f85727c);
            if (nextSection != null) {
                arrayList.add(nextSection);
            }
        }
        qu2Var.accept(new ba3(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}

package p000;

import java.util.Arrays;
import java.util.Collections;
import p000.dkh;
import p000.kq6;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class qd7 implements cy4 {

    /* JADX INFO: renamed from: l */
    public static final String f74031l = "H263Reader";

    /* JADX INFO: renamed from: m */
    public static final int f74032m = 176;

    /* JADX INFO: renamed from: n */
    public static final int f74033n = 178;

    /* JADX INFO: renamed from: o */
    public static final int f74034o = 179;

    /* JADX INFO: renamed from: p */
    public static final int f74035p = 181;

    /* JADX INFO: renamed from: q */
    public static final int f74036q = 182;

    /* JADX INFO: renamed from: r */
    public static final int f74037r = 31;

    /* JADX INFO: renamed from: s */
    public static final int f74038s = -1;

    /* JADX INFO: renamed from: t */
    public static final float[] f74039t = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: u */
    public static final int f74040u = 0;

    /* JADX INFO: renamed from: a */
    @hib
    public final wyh f74041a;

    /* JADX INFO: renamed from: b */
    @hib
    public final ihc f74042b;

    /* JADX INFO: renamed from: c */
    public final boolean[] f74043c;

    /* JADX INFO: renamed from: d */
    public final C11441a f74044d;

    /* JADX INFO: renamed from: e */
    @hib
    public final l8b f74045e;

    /* JADX INFO: renamed from: f */
    public C11442b f74046f;

    /* JADX INFO: renamed from: g */
    public long f74047g;

    /* JADX INFO: renamed from: h */
    public String f74048h;

    /* JADX INFO: renamed from: i */
    public r6h f74049i;

    /* JADX INFO: renamed from: j */
    public boolean f74050j;

    /* JADX INFO: renamed from: k */
    public long f74051k;

    /* JADX INFO: renamed from: qd7$a */
    public static final class C11441a {

        /* JADX INFO: renamed from: f */
        public static final byte[] f74052f = {0, 0, 1};

        /* JADX INFO: renamed from: g */
        public static final int f74053g = 0;

        /* JADX INFO: renamed from: h */
        public static final int f74054h = 1;

        /* JADX INFO: renamed from: i */
        public static final int f74055i = 2;

        /* JADX INFO: renamed from: j */
        public static final int f74056j = 3;

        /* JADX INFO: renamed from: k */
        public static final int f74057k = 4;

        /* JADX INFO: renamed from: a */
        public boolean f74058a;

        /* JADX INFO: renamed from: b */
        public int f74059b;

        /* JADX INFO: renamed from: c */
        public int f74060c;

        /* JADX INFO: renamed from: d */
        public int f74061d;

        /* JADX INFO: renamed from: e */
        public byte[] f74062e;

        public C11441a(int i) {
            this.f74062e = new byte[i];
        }

        public void onData(byte[] bArr, int i, int i2) {
            if (this.f74058a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f74062e;
                int length = bArr2.length;
                int i4 = this.f74060c;
                if (length < i4 + i3) {
                    this.f74062e = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f74062e, this.f74060c, i3);
                this.f74060c += i3;
            }
        }

        public boolean onStartCode(int i, int i2) {
            int i3 = this.f74059b;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i == 179 || i == 181) {
                                this.f74060c -= i2;
                                this.f74058a = false;
                                return true;
                            }
                        } else if ((i & 240) != 32) {
                            yh9.m25919w("H263Reader", "Unexpected start code value");
                            reset();
                        } else {
                            this.f74061d = this.f74060c;
                            this.f74059b = 4;
                        }
                    } else if (i > 31) {
                        yh9.m25919w("H263Reader", "Unexpected start code value");
                        reset();
                    } else {
                        this.f74059b = 3;
                    }
                } else if (i != 181) {
                    yh9.m25919w("H263Reader", "Unexpected start code value");
                    reset();
                } else {
                    this.f74059b = 2;
                }
            } else if (i == 176) {
                this.f74059b = 1;
                this.f74058a = true;
            }
            byte[] bArr = f74052f;
            onData(bArr, 0, bArr.length);
            return false;
        }

        public void reset() {
            this.f74058a = false;
            this.f74060c = 0;
            this.f74059b = 0;
        }
    }

    /* JADX INFO: renamed from: qd7$b */
    public static final class C11442b {

        /* JADX INFO: renamed from: i */
        public static final int f74063i = 1;

        /* JADX INFO: renamed from: j */
        public static final int f74064j = 0;

        /* JADX INFO: renamed from: a */
        public final r6h f74065a;

        /* JADX INFO: renamed from: b */
        public boolean f74066b;

        /* JADX INFO: renamed from: c */
        public boolean f74067c;

        /* JADX INFO: renamed from: d */
        public boolean f74068d;

        /* JADX INFO: renamed from: e */
        public int f74069e;

        /* JADX INFO: renamed from: f */
        public int f74070f;

        /* JADX INFO: renamed from: g */
        public long f74071g;

        /* JADX INFO: renamed from: h */
        public long f74072h;

        public C11442b(r6h r6hVar) {
            this.f74065a = r6hVar;
        }

        public void onData(byte[] bArr, int i, int i2) {
            if (this.f74067c) {
                int i3 = this.f74070f;
                int i4 = (i + 1) - i3;
                if (i4 >= i2) {
                    this.f74070f = i3 + (i2 - i);
                } else {
                    this.f74068d = ((bArr[i4] & k95.f53214o7) >> 6) == 0;
                    this.f74067c = false;
                }
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void onDataEnd(long j, int i, boolean z) {
            if (this.f74069e == 182 && z && this.f74066b) {
                long j2 = this.f74072h;
                if (j2 != -9223372036854775807L) {
                    this.f74065a.sampleMetadata(j2, this.f74068d ? 1 : 0, (int) (j - this.f74071g), i, null);
                }
            }
            if (this.f74069e != 179) {
                this.f74071g = j;
            }
        }

        public void onStartCode(int i, long j) {
            this.f74069e = i;
            this.f74068d = false;
            this.f74066b = i == 182 || i == 179;
            this.f74067c = i == 182;
            this.f74070f = 0;
            this.f74072h = j;
        }

        public void reset() {
            this.f74066b = false;
            this.f74067c = false;
            this.f74068d = false;
            this.f74069e = -1;
        }
    }

    public qd7() {
        this(null);
    }

    private static kq6 parseCsdBuffer(C11441a c11441a, int i, String str) {
        byte[] bArrCopyOf = Arrays.copyOf(c11441a.f74062e, c11441a.f74060c);
        ghc ghcVar = new ghc(bArrCopyOf);
        ghcVar.skipBytes(i);
        ghcVar.skipBytes(4);
        ghcVar.skipBit();
        ghcVar.skipBits(8);
        if (ghcVar.readBit()) {
            ghcVar.skipBits(4);
            ghcVar.skipBits(3);
        }
        int bits = ghcVar.readBits(4);
        float f = 1.0f;
        if (bits == 15) {
            int bits2 = ghcVar.readBits(8);
            int bits3 = ghcVar.readBits(8);
            if (bits3 == 0) {
                yh9.m25919w("H263Reader", "Invalid aspect ratio");
            } else {
                f = bits2 / bits3;
            }
        } else {
            float[] fArr = f74039t;
            if (bits < fArr.length) {
                f = fArr[bits];
            } else {
                yh9.m25919w("H263Reader", "Invalid aspect ratio");
            }
        }
        if (ghcVar.readBit()) {
            ghcVar.skipBits(2);
            ghcVar.skipBits(1);
            if (ghcVar.readBit()) {
                ghcVar.skipBits(15);
                ghcVar.skipBit();
                ghcVar.skipBits(15);
                ghcVar.skipBit();
                ghcVar.skipBits(15);
                ghcVar.skipBit();
                ghcVar.skipBits(3);
                ghcVar.skipBits(11);
                ghcVar.skipBit();
                ghcVar.skipBits(15);
                ghcVar.skipBit();
            }
        }
        if (ghcVar.readBits(2) != 0) {
            yh9.m25919w("H263Reader", "Unhandled video object layer shape");
        }
        ghcVar.skipBit();
        int bits4 = ghcVar.readBits(16);
        ghcVar.skipBit();
        if (ghcVar.readBit()) {
            if (bits4 == 0) {
                yh9.m25919w("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i2 = 0;
                for (int i3 = bits4 - 1; i3 > 0; i3 >>= 1) {
                    i2++;
                }
                ghcVar.skipBits(i2);
            }
        }
        ghcVar.skipBit();
        int bits5 = ghcVar.readBits(13);
        ghcVar.skipBit();
        int bits6 = ghcVar.readBits(13);
        ghcVar.skipBit();
        ghcVar.skipBit();
        return new kq6.C8497b().setId(str).setSampleMimeType("video/mp4v-es").setWidth(bits5).setHeight(bits6).setPixelWidthHeightRatio(f).setInitializationData(Collections.singletonList(bArrCopyOf)).build();
    }

    @Override // p000.cy4
    public void consume(ihc ihcVar) {
        u80.checkStateNotNull(this.f74046f);
        u80.checkStateNotNull(this.f74049i);
        int position = ihcVar.getPosition();
        int iLimit = ihcVar.limit();
        byte[] data = ihcVar.getData();
        this.f74047g += (long) ihcVar.bytesLeft();
        this.f74049i.sampleData(ihcVar, ihcVar.bytesLeft());
        while (true) {
            int iFindNalUnit = o8b.findNalUnit(data, position, iLimit, this.f74043c);
            if (iFindNalUnit == iLimit) {
                break;
            }
            int i = iFindNalUnit + 3;
            int i2 = ihcVar.getData()[i] & 255;
            int i3 = iFindNalUnit - position;
            int i4 = 0;
            if (!this.f74050j) {
                if (i3 > 0) {
                    this.f74044d.onData(data, position, iFindNalUnit);
                }
                if (this.f74044d.onStartCode(i2, i3 < 0 ? -i3 : 0)) {
                    r6h r6hVar = this.f74049i;
                    C11441a c11441a = this.f74044d;
                    r6hVar.format(parseCsdBuffer(c11441a, c11441a.f74061d, (String) u80.checkNotNull(this.f74048h)));
                    this.f74050j = true;
                }
            }
            this.f74046f.onData(data, position, iFindNalUnit);
            l8b l8bVar = this.f74045e;
            if (l8bVar != null) {
                if (i3 > 0) {
                    l8bVar.appendToNalUnit(data, position, iFindNalUnit);
                } else {
                    i4 = -i3;
                }
                if (this.f74045e.endNalUnit(i4)) {
                    l8b l8bVar2 = this.f74045e;
                    ((ihc) x0i.castNonNull(this.f74042b)).reset(this.f74045e.f56778d, o8b.unescapeStream(l8bVar2.f56778d, l8bVar2.f56779e));
                    ((wyh) x0i.castNonNull(this.f74041a)).consume(this.f74051k, this.f74042b);
                }
                if (i2 == 178 && ihcVar.getData()[iFindNalUnit + 2] == 1) {
                    this.f74045e.startNalUnit(i2);
                }
            }
            int i5 = iLimit - iFindNalUnit;
            this.f74046f.onDataEnd(this.f74047g - ((long) i5), i5, this.f74050j);
            this.f74046f.onStartCode(i2, this.f74051k);
            position = i;
        }
        if (!this.f74050j) {
            this.f74044d.onData(data, position, iLimit);
        }
        this.f74046f.onData(data, position, iLimit);
        l8b l8bVar3 = this.f74045e;
        if (l8bVar3 != null) {
            l8bVar3.appendToNalUnit(data, position, iLimit);
        }
    }

    @Override // p000.cy4
    public void createTracks(ck5 ck5Var, dkh.C4838e c4838e) {
        c4838e.generateNewId();
        this.f74048h = c4838e.getFormatId();
        r6h r6hVarTrack = ck5Var.track(c4838e.getTrackId(), 2);
        this.f74049i = r6hVarTrack;
        this.f74046f = new C11442b(r6hVarTrack);
        wyh wyhVar = this.f74041a;
        if (wyhVar != null) {
            wyhVar.createTracks(ck5Var, c4838e);
        }
    }

    @Override // p000.cy4
    public void packetFinished() {
    }

    @Override // p000.cy4
    public void packetStarted(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f74051k = j;
        }
    }

    @Override // p000.cy4
    public void seek() {
        o8b.clearPrefixFlags(this.f74043c);
        this.f74044d.reset();
        C11442b c11442b = this.f74046f;
        if (c11442b != null) {
            c11442b.reset();
        }
        l8b l8bVar = this.f74045e;
        if (l8bVar != null) {
            l8bVar.reset();
        }
        this.f74047g = 0L;
        this.f74051k = -9223372036854775807L;
    }

    public qd7(@hib wyh wyhVar) {
        this.f74041a = wyhVar;
        this.f74043c = new boolean[4];
        this.f74044d = new C11441a(128);
        this.f74051k = -9223372036854775807L;
        if (wyhVar != null) {
            this.f74045e = new l8b(178, 128);
            this.f74042b = new ihc();
        } else {
            this.f74045e = null;
            this.f74042b = null;
        }
    }
}

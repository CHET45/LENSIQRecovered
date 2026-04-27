package p000;

import androidx.media3.common.C1213a;
import java.util.Arrays;
import java.util.Collections;
import p000.ckh;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class pd7 implements dy4 {

    /* JADX INFO: renamed from: m */
    public static final String f70448m = "H263Reader";

    /* JADX INFO: renamed from: n */
    public static final int f70449n = 176;

    /* JADX INFO: renamed from: o */
    public static final int f70450o = 178;

    /* JADX INFO: renamed from: p */
    public static final int f70451p = 179;

    /* JADX INFO: renamed from: q */
    public static final int f70452q = 181;

    /* JADX INFO: renamed from: r */
    public static final int f70453r = 182;

    /* JADX INFO: renamed from: s */
    public static final int f70454s = 31;

    /* JADX INFO: renamed from: t */
    public static final int f70455t = -1;

    /* JADX INFO: renamed from: u */
    public static final float[] f70456u = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: v */
    public static final int f70457v = 0;

    /* JADX INFO: renamed from: a */
    @hib
    public final yyh f70458a;

    /* JADX INFO: renamed from: b */
    public final String f70459b;

    /* JADX INFO: renamed from: c */
    @hib
    public final jhc f70460c;

    /* JADX INFO: renamed from: d */
    public final boolean[] f70461d;

    /* JADX INFO: renamed from: e */
    public final C10919a f70462e;

    /* JADX INFO: renamed from: f */
    @hib
    public final m8b f70463f;

    /* JADX INFO: renamed from: g */
    public C10920b f70464g;

    /* JADX INFO: renamed from: h */
    public long f70465h;

    /* JADX INFO: renamed from: i */
    public String f70466i;

    /* JADX INFO: renamed from: j */
    public q6h f70467j;

    /* JADX INFO: renamed from: k */
    public boolean f70468k;

    /* JADX INFO: renamed from: l */
    public long f70469l;

    /* JADX INFO: renamed from: pd7$a */
    public static final class C10919a {

        /* JADX INFO: renamed from: f */
        public static final byte[] f70470f = {0, 0, 1};

        /* JADX INFO: renamed from: g */
        public static final int f70471g = 0;

        /* JADX INFO: renamed from: h */
        public static final int f70472h = 1;

        /* JADX INFO: renamed from: i */
        public static final int f70473i = 2;

        /* JADX INFO: renamed from: j */
        public static final int f70474j = 3;

        /* JADX INFO: renamed from: k */
        public static final int f70475k = 4;

        /* JADX INFO: renamed from: a */
        public boolean f70476a;

        /* JADX INFO: renamed from: b */
        public int f70477b;

        /* JADX INFO: renamed from: c */
        public int f70478c;

        /* JADX INFO: renamed from: d */
        public int f70479d;

        /* JADX INFO: renamed from: e */
        public byte[] f70480e;

        public C10919a(int i) {
            this.f70480e = new byte[i];
        }

        public void onData(byte[] bArr, int i, int i2) {
            if (this.f70476a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f70480e;
                int length = bArr2.length;
                int i4 = this.f70478c;
                if (length < i4 + i3) {
                    this.f70480e = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f70480e, this.f70478c, i3);
                this.f70478c += i3;
            }
        }

        public boolean onStartCode(int i, int i2) {
            int i3 = this.f70477b;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i == 179 || i == 181) {
                                this.f70478c -= i2;
                                this.f70476a = false;
                                return true;
                            }
                        } else if ((i & 240) != 32) {
                            xh9.m25148w("H263Reader", "Unexpected start code value");
                            reset();
                        } else {
                            this.f70479d = this.f70478c;
                            this.f70477b = 4;
                        }
                    } else if (i > 31) {
                        xh9.m25148w("H263Reader", "Unexpected start code value");
                        reset();
                    } else {
                        this.f70477b = 3;
                    }
                } else if (i != 181) {
                    xh9.m25148w("H263Reader", "Unexpected start code value");
                    reset();
                } else {
                    this.f70477b = 2;
                }
            } else if (i == 176) {
                this.f70477b = 1;
                this.f70476a = true;
            }
            byte[] bArr = f70470f;
            onData(bArr, 0, bArr.length);
            return false;
        }

        public void reset() {
            this.f70476a = false;
            this.f70478c = 0;
            this.f70477b = 0;
        }
    }

    /* JADX INFO: renamed from: pd7$b */
    public static final class C10920b {

        /* JADX INFO: renamed from: i */
        public static final int f70481i = 1;

        /* JADX INFO: renamed from: j */
        public static final int f70482j = 0;

        /* JADX INFO: renamed from: a */
        public final q6h f70483a;

        /* JADX INFO: renamed from: b */
        public boolean f70484b;

        /* JADX INFO: renamed from: c */
        public boolean f70485c;

        /* JADX INFO: renamed from: d */
        public boolean f70486d;

        /* JADX INFO: renamed from: e */
        public int f70487e;

        /* JADX INFO: renamed from: f */
        public int f70488f;

        /* JADX INFO: renamed from: g */
        public long f70489g;

        /* JADX INFO: renamed from: h */
        public long f70490h;

        public C10920b(q6h q6hVar) {
            this.f70483a = q6hVar;
        }

        public void onData(byte[] bArr, int i, int i2) {
            if (this.f70485c) {
                int i3 = this.f70488f;
                int i4 = (i + 1) - i3;
                if (i4 >= i2) {
                    this.f70488f = i3 + (i2 - i);
                } else {
                    this.f70486d = ((bArr[i4] & k95.f53214o7) >> 6) == 0;
                    this.f70485c = false;
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
            v80.checkState(this.f70490h != -9223372036854775807L);
            if (this.f70487e == 182 && z && this.f70484b) {
                this.f70483a.sampleMetadata(this.f70490h, this.f70486d ? 1 : 0, (int) (j - this.f70489g), i, null);
            }
            if (this.f70487e != 179) {
                this.f70489g = j;
            }
        }

        public void onStartCode(int i, long j) {
            this.f70487e = i;
            this.f70486d = false;
            this.f70484b = i == 182 || i == 179;
            this.f70485c = i == 182;
            this.f70488f = 0;
            this.f70490h = j;
        }

        public void reset() {
            this.f70484b = false;
            this.f70485c = false;
            this.f70486d = false;
            this.f70487e = -1;
        }
    }

    public pd7(String str) {
        this(null, str);
    }

    private static C1213a parseCsdBuffer(C10919a c10919a, int i, String str, String str2) {
        byte[] bArrCopyOf = Arrays.copyOf(c10919a.f70480e, c10919a.f70478c);
        hhc hhcVar = new hhc(bArrCopyOf);
        hhcVar.skipBytes(i);
        hhcVar.skipBytes(4);
        hhcVar.skipBit();
        hhcVar.skipBits(8);
        if (hhcVar.readBit()) {
            hhcVar.skipBits(4);
            hhcVar.skipBits(3);
        }
        int bits = hhcVar.readBits(4);
        float f = 1.0f;
        if (bits == 15) {
            int bits2 = hhcVar.readBits(8);
            int bits3 = hhcVar.readBits(8);
            if (bits3 == 0) {
                xh9.m25148w("H263Reader", "Invalid aspect ratio");
            } else {
                f = bits2 / bits3;
            }
        } else {
            float[] fArr = f70456u;
            if (bits < fArr.length) {
                f = fArr[bits];
            } else {
                xh9.m25148w("H263Reader", "Invalid aspect ratio");
            }
        }
        if (hhcVar.readBit()) {
            hhcVar.skipBits(2);
            hhcVar.skipBits(1);
            if (hhcVar.readBit()) {
                hhcVar.skipBits(15);
                hhcVar.skipBit();
                hhcVar.skipBits(15);
                hhcVar.skipBit();
                hhcVar.skipBits(15);
                hhcVar.skipBit();
                hhcVar.skipBits(3);
                hhcVar.skipBits(11);
                hhcVar.skipBit();
                hhcVar.skipBits(15);
                hhcVar.skipBit();
            }
        }
        if (hhcVar.readBits(2) != 0) {
            xh9.m25148w("H263Reader", "Unhandled video object layer shape");
        }
        hhcVar.skipBit();
        int bits4 = hhcVar.readBits(16);
        hhcVar.skipBit();
        if (hhcVar.readBit()) {
            if (bits4 == 0) {
                xh9.m25148w("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i2 = 0;
                for (int i3 = bits4 - 1; i3 > 0; i3 >>= 1) {
                    i2++;
                }
                hhcVar.skipBits(i2);
            }
        }
        hhcVar.skipBit();
        int bits5 = hhcVar.readBits(13);
        hhcVar.skipBit();
        int bits6 = hhcVar.readBits(13);
        hhcVar.skipBit();
        hhcVar.skipBit();
        return new C1213a.b().setId(str).setContainerMimeType(str2).setSampleMimeType("video/mp4v-es").setWidth(bits5).setHeight(bits6).setPixelWidthHeightRatio(f).setInitializationData(Collections.singletonList(bArrCopyOf)).build();
    }

    @Override // p000.dy4
    public void consume(jhc jhcVar) {
        v80.checkStateNotNull(this.f70464g);
        v80.checkStateNotNull(this.f70467j);
        int position = jhcVar.getPosition();
        int iLimit = jhcVar.limit();
        byte[] data = jhcVar.getData();
        this.f70465h += (long) jhcVar.bytesLeft();
        this.f70467j.sampleData(jhcVar, jhcVar.bytesLeft());
        while (true) {
            int iFindNalUnit = n8b.findNalUnit(data, position, iLimit, this.f70461d);
            if (iFindNalUnit == iLimit) {
                break;
            }
            int i = iFindNalUnit + 3;
            int i2 = jhcVar.getData()[i] & 255;
            int i3 = iFindNalUnit - position;
            int i4 = 0;
            if (!this.f70468k) {
                if (i3 > 0) {
                    this.f70462e.onData(data, position, iFindNalUnit);
                }
                if (this.f70462e.onStartCode(i2, i3 < 0 ? -i3 : 0)) {
                    q6h q6hVar = this.f70467j;
                    C10919a c10919a = this.f70462e;
                    q6hVar.format(parseCsdBuffer(c10919a, c10919a.f70479d, (String) v80.checkNotNull(this.f70466i), this.f70459b));
                    this.f70468k = true;
                }
            }
            this.f70464g.onData(data, position, iFindNalUnit);
            m8b m8bVar = this.f70463f;
            if (m8bVar != null) {
                if (i3 > 0) {
                    m8bVar.appendToNalUnit(data, position, iFindNalUnit);
                } else {
                    i4 = -i3;
                }
                if (this.f70463f.endNalUnit(i4)) {
                    m8b m8bVar2 = this.f70463f;
                    ((jhc) t0i.castNonNull(this.f70460c)).reset(this.f70463f.f60192d, n8b.unescapeStream(m8bVar2.f60192d, m8bVar2.f60193e));
                    ((yyh) t0i.castNonNull(this.f70458a)).consume(this.f70469l, this.f70460c);
                }
                if (i2 == 178 && jhcVar.getData()[iFindNalUnit + 2] == 1) {
                    this.f70463f.startNalUnit(i2);
                }
            }
            int i5 = iLimit - iFindNalUnit;
            this.f70464g.onDataEnd(this.f70465h - ((long) i5), i5, this.f70468k);
            this.f70464g.onStartCode(i2, this.f70469l);
            position = i;
        }
        if (!this.f70468k) {
            this.f70462e.onData(data, position, iLimit);
        }
        this.f70464g.onData(data, position, iLimit);
        m8b m8bVar3 = this.f70463f;
        if (m8bVar3 != null) {
            m8bVar3.appendToNalUnit(data, position, iLimit);
        }
    }

    @Override // p000.dy4
    public void createTracks(bk5 bk5Var, ckh.C2372e c2372e) {
        c2372e.generateNewId();
        this.f70466i = c2372e.getFormatId();
        q6h q6hVarTrack = bk5Var.track(c2372e.getTrackId(), 2);
        this.f70467j = q6hVarTrack;
        this.f70464g = new C10920b(q6hVarTrack);
        yyh yyhVar = this.f70458a;
        if (yyhVar != null) {
            yyhVar.createTracks(bk5Var, c2372e);
        }
    }

    @Override // p000.dy4
    public void packetFinished(boolean z) {
        v80.checkStateNotNull(this.f70464g);
        if (z) {
            this.f70464g.onDataEnd(this.f70465h, 0, this.f70468k);
            this.f70464g.reset();
        }
    }

    @Override // p000.dy4
    public void packetStarted(long j, int i) {
        this.f70469l = j;
    }

    @Override // p000.dy4
    public void seek() {
        n8b.clearPrefixFlags(this.f70461d);
        this.f70462e.reset();
        C10920b c10920b = this.f70464g;
        if (c10920b != null) {
            c10920b.reset();
        }
        m8b m8bVar = this.f70463f;
        if (m8bVar != null) {
            m8bVar.reset();
        }
        this.f70465h = 0L;
        this.f70469l = -9223372036854775807L;
    }

    public pd7(@hib yyh yyhVar, String str) {
        this.f70458a = yyhVar;
        this.f70459b = str;
        this.f70461d = new boolean[4];
        this.f70462e = new C10919a(128);
        this.f70469l = -9223372036854775807L;
        if (yyhVar != null) {
            this.f70463f = new m8b(178, 128);
            this.f70460c = new jhc();
        } else {
            this.f70463f = null;
            this.f70460c = null;
        }
    }
}

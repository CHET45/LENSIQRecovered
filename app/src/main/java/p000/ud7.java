package p000;

import java.util.Collections;
import p000.dkh;
import p000.kq6;
import p000.o8b;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ud7 implements cy4 {

    /* JADX INFO: renamed from: o */
    public static final String f87613o = "H265Reader";

    /* JADX INFO: renamed from: p */
    public static final int f87614p = 9;

    /* JADX INFO: renamed from: q */
    public static final int f87615q = 16;

    /* JADX INFO: renamed from: r */
    public static final int f87616r = 21;

    /* JADX INFO: renamed from: s */
    public static final int f87617s = 32;

    /* JADX INFO: renamed from: t */
    public static final int f87618t = 33;

    /* JADX INFO: renamed from: u */
    public static final int f87619u = 34;

    /* JADX INFO: renamed from: v */
    public static final int f87620v = 35;

    /* JADX INFO: renamed from: w */
    public static final int f87621w = 39;

    /* JADX INFO: renamed from: x */
    public static final int f87622x = 40;

    /* JADX INFO: renamed from: a */
    public final dve f87623a;

    /* JADX INFO: renamed from: b */
    public String f87624b;

    /* JADX INFO: renamed from: c */
    public r6h f87625c;

    /* JADX INFO: renamed from: d */
    public C13506a f87626d;

    /* JADX INFO: renamed from: e */
    public boolean f87627e;

    /* JADX INFO: renamed from: l */
    public long f87634l;

    /* JADX INFO: renamed from: f */
    public final boolean[] f87628f = new boolean[3];

    /* JADX INFO: renamed from: g */
    public final l8b f87629g = new l8b(32, 128);

    /* JADX INFO: renamed from: h */
    public final l8b f87630h = new l8b(33, 128);

    /* JADX INFO: renamed from: i */
    public final l8b f87631i = new l8b(34, 128);

    /* JADX INFO: renamed from: j */
    public final l8b f87632j = new l8b(39, 128);

    /* JADX INFO: renamed from: k */
    public final l8b f87633k = new l8b(40, 128);

    /* JADX INFO: renamed from: m */
    public long f87635m = -9223372036854775807L;

    /* JADX INFO: renamed from: n */
    public final ihc f87636n = new ihc();

    /* JADX INFO: renamed from: ud7$a */
    public static final class C13506a {

        /* JADX INFO: renamed from: n */
        public static final int f87637n = 2;

        /* JADX INFO: renamed from: a */
        public final r6h f87638a;

        /* JADX INFO: renamed from: b */
        public long f87639b;

        /* JADX INFO: renamed from: c */
        public boolean f87640c;

        /* JADX INFO: renamed from: d */
        public int f87641d;

        /* JADX INFO: renamed from: e */
        public long f87642e;

        /* JADX INFO: renamed from: f */
        public boolean f87643f;

        /* JADX INFO: renamed from: g */
        public boolean f87644g;

        /* JADX INFO: renamed from: h */
        public boolean f87645h;

        /* JADX INFO: renamed from: i */
        public boolean f87646i;

        /* JADX INFO: renamed from: j */
        public boolean f87647j;

        /* JADX INFO: renamed from: k */
        public long f87648k;

        /* JADX INFO: renamed from: l */
        public long f87649l;

        /* JADX INFO: renamed from: m */
        public boolean f87650m;

        public C13506a(r6h r6hVar) {
            this.f87638a = r6hVar;
        }

        private static boolean isPrefixNalUnit(int i) {
            return (32 <= i && i <= 35) || i == 39;
        }

        private static boolean isVclBodyNalUnit(int i) {
            return i < 32 || i == 40;
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
        private void outputSample(int i) {
            long j = this.f87649l;
            if (j == -9223372036854775807L) {
                return;
            }
            boolean z = this.f87650m;
            this.f87638a.sampleMetadata(j, z ? 1 : 0, (int) (this.f87639b - this.f87648k), i, null);
        }

        public void endNalUnit(long j, int i, boolean z) {
            if (this.f87647j && this.f87644g) {
                this.f87650m = this.f87640c;
                this.f87647j = false;
            } else if (this.f87645h || this.f87644g) {
                if (z && this.f87646i) {
                    outputSample(i + ((int) (j - this.f87639b)));
                }
                this.f87648k = this.f87639b;
                this.f87649l = this.f87642e;
                this.f87650m = this.f87640c;
                this.f87646i = true;
            }
        }

        public void readNalUnitData(byte[] bArr, int i, int i2) {
            if (this.f87643f) {
                int i3 = this.f87641d;
                int i4 = (i + 2) - i3;
                if (i4 >= i2) {
                    this.f87641d = i3 + (i2 - i);
                } else {
                    this.f87644g = (bArr[i4] & 128) != 0;
                    this.f87643f = false;
                }
            }
        }

        public void reset() {
            this.f87643f = false;
            this.f87644g = false;
            this.f87645h = false;
            this.f87646i = false;
            this.f87647j = false;
        }

        public void startNalUnit(long j, int i, int i2, long j2, boolean z) {
            this.f87644g = false;
            this.f87645h = false;
            this.f87642e = j2;
            this.f87641d = 0;
            this.f87639b = j;
            if (!isVclBodyNalUnit(i2)) {
                if (this.f87646i && !this.f87647j) {
                    if (z) {
                        outputSample(i);
                    }
                    this.f87646i = false;
                }
                if (isPrefixNalUnit(i2)) {
                    this.f87645h = !this.f87647j;
                    this.f87647j = true;
                }
            }
            boolean z2 = i2 >= 16 && i2 <= 21;
            this.f87640c = z2;
            this.f87643f = z2 || i2 <= 9;
        }
    }

    public ud7(dve dveVar) {
        this.f87623a = dveVar;
    }

    @z25({"output", "sampleReader"})
    private void assertTracksCreated() {
        u80.checkStateNotNull(this.f87625c);
        x0i.castNonNull(this.f87626d);
    }

    @g5e({"output", "sampleReader"})
    private void endNalUnit(long j, int i, int i2, long j2) {
        this.f87626d.endNalUnit(j, i, this.f87627e);
        if (!this.f87627e) {
            this.f87629g.endNalUnit(i2);
            this.f87630h.endNalUnit(i2);
            this.f87631i.endNalUnit(i2);
            if (this.f87629g.isCompleted() && this.f87630h.isCompleted() && this.f87631i.isCompleted()) {
                this.f87625c.format(parseMediaFormat(this.f87624b, this.f87629g, this.f87630h, this.f87631i));
                this.f87627e = true;
            }
        }
        if (this.f87632j.endNalUnit(i2)) {
            l8b l8bVar = this.f87632j;
            this.f87636n.reset(this.f87632j.f56778d, o8b.unescapeStream(l8bVar.f56778d, l8bVar.f56779e));
            this.f87636n.skipBytes(5);
            this.f87623a.consume(j2, this.f87636n);
        }
        if (this.f87633k.endNalUnit(i2)) {
            l8b l8bVar2 = this.f87633k;
            this.f87636n.reset(this.f87633k.f56778d, o8b.unescapeStream(l8bVar2.f56778d, l8bVar2.f56779e));
            this.f87636n.skipBytes(5);
            this.f87623a.consume(j2, this.f87636n);
        }
    }

    @g5e({"sampleReader"})
    private void nalUnitData(byte[] bArr, int i, int i2) {
        this.f87626d.readNalUnitData(bArr, i, i2);
        if (!this.f87627e) {
            this.f87629g.appendToNalUnit(bArr, i, i2);
            this.f87630h.appendToNalUnit(bArr, i, i2);
            this.f87631i.appendToNalUnit(bArr, i, i2);
        }
        this.f87632j.appendToNalUnit(bArr, i, i2);
        this.f87633k.appendToNalUnit(bArr, i, i2);
    }

    private static kq6 parseMediaFormat(@hib String str, l8b l8bVar, l8b l8bVar2, l8b l8bVar3) {
        int i = l8bVar.f56779e;
        byte[] bArr = new byte[l8bVar2.f56779e + i + l8bVar3.f56779e];
        System.arraycopy(l8bVar.f56778d, 0, bArr, 0, i);
        System.arraycopy(l8bVar2.f56778d, 0, bArr, l8bVar.f56779e, l8bVar2.f56779e);
        System.arraycopy(l8bVar3.f56778d, 0, bArr, l8bVar.f56779e + l8bVar2.f56779e, l8bVar3.f56779e);
        o8b.C10225a h265SpsNalUnit = o8b.parseH265SpsNalUnit(l8bVar2.f56778d, 3, l8bVar2.f56779e);
        return new kq6.C8497b().setId(str).setSampleMimeType("video/hevc").setCodecs(c72.buildHevcCodecString(h265SpsNalUnit.f66678a, h265SpsNalUnit.f66679b, h265SpsNalUnit.f66680c, h265SpsNalUnit.f66681d, h265SpsNalUnit.f66685h, h265SpsNalUnit.f66686i)).setWidth(h265SpsNalUnit.f66688k).setHeight(h265SpsNalUnit.f66689l).setPixelWidthHeightRatio(h265SpsNalUnit.f66690m).setInitializationData(Collections.singletonList(bArr)).build();
    }

    @g5e({"sampleReader"})
    private void startNalUnit(long j, int i, int i2, long j2) {
        this.f87626d.startNalUnit(j, i, i2, j2, this.f87627e);
        if (!this.f87627e) {
            this.f87629g.startNalUnit(i2);
            this.f87630h.startNalUnit(i2);
            this.f87631i.startNalUnit(i2);
        }
        this.f87632j.startNalUnit(i2);
        this.f87633k.startNalUnit(i2);
    }

    @Override // p000.cy4
    public void consume(ihc ihcVar) {
        assertTracksCreated();
        while (ihcVar.bytesLeft() > 0) {
            int position = ihcVar.getPosition();
            int iLimit = ihcVar.limit();
            byte[] data = ihcVar.getData();
            this.f87634l += (long) ihcVar.bytesLeft();
            this.f87625c.sampleData(ihcVar, ihcVar.bytesLeft());
            while (position < iLimit) {
                int iFindNalUnit = o8b.findNalUnit(data, position, iLimit, this.f87628f);
                if (iFindNalUnit == iLimit) {
                    nalUnitData(data, position, iLimit);
                    return;
                }
                int h265NalUnitType = o8b.getH265NalUnitType(data, iFindNalUnit);
                int i = iFindNalUnit - position;
                if (i > 0) {
                    nalUnitData(data, position, iFindNalUnit);
                }
                int i2 = iLimit - iFindNalUnit;
                long j = this.f87634l - ((long) i2);
                endNalUnit(j, i2, i < 0 ? -i : 0, this.f87635m);
                startNalUnit(j, i2, h265NalUnitType, this.f87635m);
                position = iFindNalUnit + 3;
            }
        }
    }

    @Override // p000.cy4
    public void createTracks(ck5 ck5Var, dkh.C4838e c4838e) {
        c4838e.generateNewId();
        this.f87624b = c4838e.getFormatId();
        r6h r6hVarTrack = ck5Var.track(c4838e.getTrackId(), 2);
        this.f87625c = r6hVarTrack;
        this.f87626d = new C13506a(r6hVarTrack);
        this.f87623a.createTracks(ck5Var, c4838e);
    }

    @Override // p000.cy4
    public void packetFinished() {
    }

    @Override // p000.cy4
    public void packetStarted(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f87635m = j;
        }
    }

    @Override // p000.cy4
    public void seek() {
        this.f87634l = 0L;
        this.f87635m = -9223372036854775807L;
        o8b.clearPrefixFlags(this.f87628f);
        this.f87629g.reset();
        this.f87630h.reset();
        this.f87631i.reset();
        this.f87632j.reset();
        this.f87633k.reset();
        C13506a c13506a = this.f87626d;
        if (c13506a != null) {
            c13506a.reset();
        }
    }
}

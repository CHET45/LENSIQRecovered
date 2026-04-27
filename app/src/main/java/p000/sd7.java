package p000;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import p000.dkh;
import p000.kq6;
import p000.o8b;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class sd7 implements cy4 {

    /* JADX INFO: renamed from: a */
    public final dve f81318a;

    /* JADX INFO: renamed from: b */
    public final boolean f81319b;

    /* JADX INFO: renamed from: c */
    public final boolean f81320c;

    /* JADX INFO: renamed from: g */
    public long f81324g;

    /* JADX INFO: renamed from: i */
    public String f81326i;

    /* JADX INFO: renamed from: j */
    public r6h f81327j;

    /* JADX INFO: renamed from: k */
    public C12531b f81328k;

    /* JADX INFO: renamed from: l */
    public boolean f81329l;

    /* JADX INFO: renamed from: n */
    public boolean f81331n;

    /* JADX INFO: renamed from: h */
    public final boolean[] f81325h = new boolean[3];

    /* JADX INFO: renamed from: d */
    public final l8b f81321d = new l8b(7, 128);

    /* JADX INFO: renamed from: e */
    public final l8b f81322e = new l8b(8, 128);

    /* JADX INFO: renamed from: f */
    public final l8b f81323f = new l8b(6, 128);

    /* JADX INFO: renamed from: m */
    public long f81330m = -9223372036854775807L;

    /* JADX INFO: renamed from: o */
    public final ihc f81332o = new ihc();

    /* JADX INFO: renamed from: sd7$b */
    public static final class C12531b {

        /* JADX INFO: renamed from: s */
        public static final int f81333s = 128;

        /* JADX INFO: renamed from: a */
        public final r6h f81334a;

        /* JADX INFO: renamed from: b */
        public final boolean f81335b;

        /* JADX INFO: renamed from: c */
        public final boolean f81336c;

        /* JADX INFO: renamed from: d */
        public final SparseArray<o8b.C10227c> f81337d = new SparseArray<>();

        /* JADX INFO: renamed from: e */
        public final SparseArray<o8b.C10226b> f81338e = new SparseArray<>();

        /* JADX INFO: renamed from: f */
        public final khc f81339f;

        /* JADX INFO: renamed from: g */
        public byte[] f81340g;

        /* JADX INFO: renamed from: h */
        public int f81341h;

        /* JADX INFO: renamed from: i */
        public int f81342i;

        /* JADX INFO: renamed from: j */
        public long f81343j;

        /* JADX INFO: renamed from: k */
        public boolean f81344k;

        /* JADX INFO: renamed from: l */
        public long f81345l;

        /* JADX INFO: renamed from: m */
        public a f81346m;

        /* JADX INFO: renamed from: n */
        public a f81347n;

        /* JADX INFO: renamed from: o */
        public boolean f81348o;

        /* JADX INFO: renamed from: p */
        public long f81349p;

        /* JADX INFO: renamed from: q */
        public long f81350q;

        /* JADX INFO: renamed from: r */
        public boolean f81351r;

        /* JADX INFO: renamed from: sd7$b$a */
        public static final class a {

            /* JADX INFO: renamed from: q */
            public static final int f81352q = 2;

            /* JADX INFO: renamed from: r */
            public static final int f81353r = 7;

            /* JADX INFO: renamed from: a */
            public boolean f81354a;

            /* JADX INFO: renamed from: b */
            public boolean f81355b;

            /* JADX INFO: renamed from: c */
            @hib
            public o8b.C10227c f81356c;

            /* JADX INFO: renamed from: d */
            public int f81357d;

            /* JADX INFO: renamed from: e */
            public int f81358e;

            /* JADX INFO: renamed from: f */
            public int f81359f;

            /* JADX INFO: renamed from: g */
            public int f81360g;

            /* JADX INFO: renamed from: h */
            public boolean f81361h;

            /* JADX INFO: renamed from: i */
            public boolean f81362i;

            /* JADX INFO: renamed from: j */
            public boolean f81363j;

            /* JADX INFO: renamed from: k */
            public boolean f81364k;

            /* JADX INFO: renamed from: l */
            public int f81365l;

            /* JADX INFO: renamed from: m */
            public int f81366m;

            /* JADX INFO: renamed from: n */
            public int f81367n;

            /* JADX INFO: renamed from: o */
            public int f81368o;

            /* JADX INFO: renamed from: p */
            public int f81369p;

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean isFirstVclNalUnitOfPicture(a aVar) {
                int i;
                int i2;
                int i3;
                boolean z;
                if (!this.f81354a) {
                    return false;
                }
                if (!aVar.f81354a) {
                    return true;
                }
                o8b.C10227c c10227c = (o8b.C10227c) u80.checkStateNotNull(this.f81356c);
                o8b.C10227c c10227c2 = (o8b.C10227c) u80.checkStateNotNull(aVar.f81356c);
                return (this.f81359f == aVar.f81359f && this.f81360g == aVar.f81360g && this.f81361h == aVar.f81361h && (!this.f81362i || !aVar.f81362i || this.f81363j == aVar.f81363j) && (((i = this.f81357d) == (i2 = aVar.f81357d) || (i != 0 && i2 != 0)) && (((i3 = c10227c.f66708l) != 0 || c10227c2.f66708l != 0 || (this.f81366m == aVar.f81366m && this.f81367n == aVar.f81367n)) && ((i3 != 1 || c10227c2.f66708l != 1 || (this.f81368o == aVar.f81368o && this.f81369p == aVar.f81369p)) && (z = this.f81364k) == aVar.f81364k && (!z || this.f81365l == aVar.f81365l))))) ? false : true;
            }

            public void clear() {
                this.f81355b = false;
                this.f81354a = false;
            }

            public boolean isISlice() {
                int i;
                return this.f81355b && ((i = this.f81358e) == 7 || i == 2);
            }

            public void setAll(o8b.C10227c c10227c, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.f81356c = c10227c;
                this.f81357d = i;
                this.f81358e = i2;
                this.f81359f = i3;
                this.f81360g = i4;
                this.f81361h = z;
                this.f81362i = z2;
                this.f81363j = z3;
                this.f81364k = z4;
                this.f81365l = i5;
                this.f81366m = i6;
                this.f81367n = i7;
                this.f81368o = i8;
                this.f81369p = i9;
                this.f81354a = true;
                this.f81355b = true;
            }

            public void setSliceType(int i) {
                this.f81358e = i;
                this.f81355b = true;
            }
        }

        public C12531b(r6h r6hVar, boolean z, boolean z2) {
            this.f81334a = r6hVar;
            this.f81335b = z;
            this.f81336c = z2;
            this.f81346m = new a();
            this.f81347n = new a();
            byte[] bArr = new byte[128];
            this.f81340g = bArr;
            this.f81339f = new khc(bArr, 0, 0);
            reset();
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
            long j = this.f81350q;
            if (j == -9223372036854775807L) {
                return;
            }
            boolean z = this.f81351r;
            this.f81334a.sampleMetadata(j, z ? 1 : 0, (int) (this.f81343j - this.f81349p), i, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0157  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void appendToNalUnit(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instruction units count: 416
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.sd7.C12531b.appendToNalUnit(byte[], int, int):void");
        }

        public boolean endNalUnit(long j, int i, boolean z, boolean z2) {
            boolean z3 = false;
            if (this.f81342i == 9 || (this.f81336c && this.f81347n.isFirstVclNalUnitOfPicture(this.f81346m))) {
                if (z && this.f81348o) {
                    outputSample(i + ((int) (j - this.f81343j)));
                }
                this.f81349p = this.f81343j;
                this.f81350q = this.f81345l;
                this.f81351r = false;
                this.f81348o = true;
            }
            if (this.f81335b) {
                z2 = this.f81347n.isISlice();
            }
            boolean z4 = this.f81351r;
            int i2 = this.f81342i;
            if (i2 == 5 || (z2 && i2 == 1)) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            this.f81351r = z5;
            return z5;
        }

        public boolean needsSpsPps() {
            return this.f81336c;
        }

        public void putPps(o8b.C10226b c10226b) {
            this.f81338e.append(c10226b.f66694a, c10226b);
        }

        public void putSps(o8b.C10227c c10227c) {
            this.f81337d.append(c10227c.f66700d, c10227c);
        }

        public void reset() {
            this.f81344k = false;
            this.f81348o = false;
            this.f81347n.clear();
        }

        public void startNalUnit(long j, int i, long j2) {
            this.f81342i = i;
            this.f81345l = j2;
            this.f81343j = j;
            if (!this.f81335b || i != 1) {
                if (!this.f81336c) {
                    return;
                }
                if (i != 5 && i != 1 && i != 2) {
                    return;
                }
            }
            a aVar = this.f81346m;
            this.f81346m = this.f81347n;
            this.f81347n = aVar;
            aVar.clear();
            this.f81341h = 0;
            this.f81344k = true;
        }
    }

    public sd7(dve dveVar, boolean z, boolean z2) {
        this.f81318a = dveVar;
        this.f81319b = z;
        this.f81320c = z2;
    }

    @z25({"output", "sampleReader"})
    private void assertTracksCreated() {
        u80.checkStateNotNull(this.f81327j);
        x0i.castNonNull(this.f81328k);
    }

    @g5e({"output", "sampleReader"})
    private void endNalUnit(long j, int i, int i2, long j2) {
        if (!this.f81329l || this.f81328k.needsSpsPps()) {
            this.f81321d.endNalUnit(i2);
            this.f81322e.endNalUnit(i2);
            if (this.f81329l) {
                if (this.f81321d.isCompleted()) {
                    l8b l8bVar = this.f81321d;
                    this.f81328k.putSps(o8b.parseSpsNalUnit(l8bVar.f56778d, 3, l8bVar.f56779e));
                    this.f81321d.reset();
                } else if (this.f81322e.isCompleted()) {
                    l8b l8bVar2 = this.f81322e;
                    this.f81328k.putPps(o8b.parsePpsNalUnit(l8bVar2.f56778d, 3, l8bVar2.f56779e));
                    this.f81322e.reset();
                }
            } else if (this.f81321d.isCompleted() && this.f81322e.isCompleted()) {
                ArrayList arrayList = new ArrayList();
                l8b l8bVar3 = this.f81321d;
                arrayList.add(Arrays.copyOf(l8bVar3.f56778d, l8bVar3.f56779e));
                l8b l8bVar4 = this.f81322e;
                arrayList.add(Arrays.copyOf(l8bVar4.f56778d, l8bVar4.f56779e));
                l8b l8bVar5 = this.f81321d;
                o8b.C10227c spsNalUnit = o8b.parseSpsNalUnit(l8bVar5.f56778d, 3, l8bVar5.f56779e);
                l8b l8bVar6 = this.f81322e;
                o8b.C10226b ppsNalUnit = o8b.parsePpsNalUnit(l8bVar6.f56778d, 3, l8bVar6.f56779e);
                this.f81327j.format(new kq6.C8497b().setId(this.f81326i).setSampleMimeType("video/avc").setCodecs(c72.buildAvcCodecString(spsNalUnit.f66697a, spsNalUnit.f66698b, spsNalUnit.f66699c)).setWidth(spsNalUnit.f66702f).setHeight(spsNalUnit.f66703g).setPixelWidthHeightRatio(spsNalUnit.f66704h).setInitializationData(arrayList).build());
                this.f81329l = true;
                this.f81328k.putSps(spsNalUnit);
                this.f81328k.putPps(ppsNalUnit);
                this.f81321d.reset();
                this.f81322e.reset();
            }
        }
        if (this.f81323f.endNalUnit(i2)) {
            l8b l8bVar7 = this.f81323f;
            this.f81332o.reset(this.f81323f.f56778d, o8b.unescapeStream(l8bVar7.f56778d, l8bVar7.f56779e));
            this.f81332o.setPosition(4);
            this.f81318a.consume(j2, this.f81332o);
        }
        if (this.f81328k.endNalUnit(j, i, this.f81329l, this.f81331n)) {
            this.f81331n = false;
        }
    }

    @g5e({"sampleReader"})
    private void nalUnitData(byte[] bArr, int i, int i2) {
        if (!this.f81329l || this.f81328k.needsSpsPps()) {
            this.f81321d.appendToNalUnit(bArr, i, i2);
            this.f81322e.appendToNalUnit(bArr, i, i2);
        }
        this.f81323f.appendToNalUnit(bArr, i, i2);
        this.f81328k.appendToNalUnit(bArr, i, i2);
    }

    @g5e({"sampleReader"})
    private void startNalUnit(long j, int i, long j2) {
        if (!this.f81329l || this.f81328k.needsSpsPps()) {
            this.f81321d.startNalUnit(i);
            this.f81322e.startNalUnit(i);
        }
        this.f81323f.startNalUnit(i);
        this.f81328k.startNalUnit(j, i, j2);
    }

    @Override // p000.cy4
    public void consume(ihc ihcVar) {
        assertTracksCreated();
        int position = ihcVar.getPosition();
        int iLimit = ihcVar.limit();
        byte[] data = ihcVar.getData();
        this.f81324g += (long) ihcVar.bytesLeft();
        this.f81327j.sampleData(ihcVar, ihcVar.bytesLeft());
        while (true) {
            int iFindNalUnit = o8b.findNalUnit(data, position, iLimit, this.f81325h);
            if (iFindNalUnit == iLimit) {
                nalUnitData(data, position, iLimit);
                return;
            }
            int nalUnitType = o8b.getNalUnitType(data, iFindNalUnit);
            int i = iFindNalUnit - position;
            if (i > 0) {
                nalUnitData(data, position, iFindNalUnit);
            }
            int i2 = iLimit - iFindNalUnit;
            long j = this.f81324g - ((long) i2);
            endNalUnit(j, i2, i < 0 ? -i : 0, this.f81330m);
            startNalUnit(j, nalUnitType, this.f81330m);
            position = iFindNalUnit + 3;
        }
    }

    @Override // p000.cy4
    public void createTracks(ck5 ck5Var, dkh.C4838e c4838e) {
        c4838e.generateNewId();
        this.f81326i = c4838e.getFormatId();
        r6h r6hVarTrack = ck5Var.track(c4838e.getTrackId(), 2);
        this.f81327j = r6hVarTrack;
        this.f81328k = new C12531b(r6hVarTrack, this.f81319b, this.f81320c);
        this.f81318a.createTracks(ck5Var, c4838e);
    }

    @Override // p000.cy4
    public void packetFinished() {
    }

    @Override // p000.cy4
    public void packetStarted(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f81330m = j;
        }
        this.f81331n |= (i & 2) != 0;
    }

    @Override // p000.cy4
    public void seek() {
        this.f81324g = 0L;
        this.f81331n = false;
        this.f81330m = -9223372036854775807L;
        o8b.clearPrefixFlags(this.f81325h);
        this.f81321d.reset();
        this.f81322e.reset();
        this.f81323f.reset();
        C12531b c12531b = this.f81328k;
        if (c12531b != null) {
            c12531b.reset();
        }
    }
}

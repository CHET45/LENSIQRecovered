package p000;

import android.util.SparseArray;
import androidx.media3.common.C1213a;
import java.util.ArrayList;
import java.util.Arrays;
import p000.ckh;
import p000.e92;
import p000.n8b;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class rd7 implements dy4 {

    /* JADX INFO: renamed from: a */
    public final eve f77879a;

    /* JADX INFO: renamed from: b */
    public final boolean f77880b;

    /* JADX INFO: renamed from: c */
    public final boolean f77881c;

    /* JADX INFO: renamed from: d */
    public final String f77882d;

    /* JADX INFO: renamed from: h */
    public long f77886h;

    /* JADX INFO: renamed from: j */
    public String f77888j;

    /* JADX INFO: renamed from: k */
    public q6h f77889k;

    /* JADX INFO: renamed from: l */
    public C12027b f77890l;

    /* JADX INFO: renamed from: m */
    public boolean f77891m;

    /* JADX INFO: renamed from: o */
    public boolean f77893o;

    /* JADX INFO: renamed from: i */
    public final boolean[] f77887i = new boolean[3];

    /* JADX INFO: renamed from: e */
    public final m8b f77883e = new m8b(7, 128);

    /* JADX INFO: renamed from: f */
    public final m8b f77884f = new m8b(8, 128);

    /* JADX INFO: renamed from: g */
    public final m8b f77885g = new m8b(6, 128);

    /* JADX INFO: renamed from: n */
    public long f77892n = -9223372036854775807L;

    /* JADX INFO: renamed from: p */
    public final jhc f77894p = new jhc();

    /* JADX INFO: renamed from: rd7$b */
    public static final class C12027b {

        /* JADX INFO: renamed from: t */
        public static final int f77895t = 128;

        /* JADX INFO: renamed from: a */
        public final q6h f77896a;

        /* JADX INFO: renamed from: b */
        public final boolean f77897b;

        /* JADX INFO: renamed from: c */
        public final boolean f77898c;

        /* JADX INFO: renamed from: d */
        public final SparseArray<n8b.C9740m> f77899d = new SparseArray<>();

        /* JADX INFO: renamed from: e */
        public final SparseArray<n8b.C9739l> f77900e = new SparseArray<>();

        /* JADX INFO: renamed from: f */
        public final lhc f77901f;

        /* JADX INFO: renamed from: g */
        public byte[] f77902g;

        /* JADX INFO: renamed from: h */
        public int f77903h;

        /* JADX INFO: renamed from: i */
        public int f77904i;

        /* JADX INFO: renamed from: j */
        public long f77905j;

        /* JADX INFO: renamed from: k */
        public boolean f77906k;

        /* JADX INFO: renamed from: l */
        public long f77907l;

        /* JADX INFO: renamed from: m */
        public a f77908m;

        /* JADX INFO: renamed from: n */
        public a f77909n;

        /* JADX INFO: renamed from: o */
        public boolean f77910o;

        /* JADX INFO: renamed from: p */
        public long f77911p;

        /* JADX INFO: renamed from: q */
        public long f77912q;

        /* JADX INFO: renamed from: r */
        public boolean f77913r;

        /* JADX INFO: renamed from: s */
        public boolean f77914s;

        /* JADX INFO: renamed from: rd7$b$a */
        public static final class a {

            /* JADX INFO: renamed from: q */
            public static final int f77915q = 2;

            /* JADX INFO: renamed from: r */
            public static final int f77916r = 7;

            /* JADX INFO: renamed from: a */
            public boolean f77917a;

            /* JADX INFO: renamed from: b */
            public boolean f77918b;

            /* JADX INFO: renamed from: c */
            @hib
            public n8b.C9740m f77919c;

            /* JADX INFO: renamed from: d */
            public int f77920d;

            /* JADX INFO: renamed from: e */
            public int f77921e;

            /* JADX INFO: renamed from: f */
            public int f77922f;

            /* JADX INFO: renamed from: g */
            public int f77923g;

            /* JADX INFO: renamed from: h */
            public boolean f77924h;

            /* JADX INFO: renamed from: i */
            public boolean f77925i;

            /* JADX INFO: renamed from: j */
            public boolean f77926j;

            /* JADX INFO: renamed from: k */
            public boolean f77927k;

            /* JADX INFO: renamed from: l */
            public int f77928l;

            /* JADX INFO: renamed from: m */
            public int f77929m;

            /* JADX INFO: renamed from: n */
            public int f77930n;

            /* JADX INFO: renamed from: o */
            public int f77931o;

            /* JADX INFO: renamed from: p */
            public int f77932p;

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean isFirstVclNalUnitOfPicture(a aVar) {
                int i;
                int i2;
                int i3;
                boolean z;
                if (!this.f77917a) {
                    return false;
                }
                if (!aVar.f77917a) {
                    return true;
                }
                n8b.C9740m c9740m = (n8b.C9740m) v80.checkStateNotNull(this.f77919c);
                n8b.C9740m c9740m2 = (n8b.C9740m) v80.checkStateNotNull(aVar.f77919c);
                return (this.f77922f == aVar.f77922f && this.f77923g == aVar.f77923g && this.f77924h == aVar.f77924h && (!this.f77925i || !aVar.f77925i || this.f77926j == aVar.f77926j) && (((i = this.f77920d) == (i2 = aVar.f77920d) || (i != 0 && i2 != 0)) && (((i3 = c9740m.f63599n) != 0 || c9740m2.f63599n != 0 || (this.f77929m == aVar.f77929m && this.f77930n == aVar.f77930n)) && ((i3 != 1 || c9740m2.f63599n != 1 || (this.f77931o == aVar.f77931o && this.f77932p == aVar.f77932p)) && (z = this.f77927k) == aVar.f77927k && (!z || this.f77928l == aVar.f77928l))))) ? false : true;
            }

            public void clear() {
                this.f77918b = false;
                this.f77917a = false;
            }

            public boolean isISlice() {
                int i;
                return this.f77918b && ((i = this.f77921e) == 7 || i == 2);
            }

            public void setAll(n8b.C9740m c9740m, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.f77919c = c9740m;
                this.f77920d = i;
                this.f77921e = i2;
                this.f77922f = i3;
                this.f77923g = i4;
                this.f77924h = z;
                this.f77925i = z2;
                this.f77926j = z3;
                this.f77927k = z4;
                this.f77928l = i5;
                this.f77929m = i6;
                this.f77930n = i7;
                this.f77931o = i8;
                this.f77932p = i9;
                this.f77917a = true;
                this.f77918b = true;
            }

            public void setSliceType(int i) {
                this.f77921e = i;
                this.f77918b = true;
            }
        }

        public C12027b(q6h q6hVar, boolean z, boolean z2) {
            this.f77896a = q6hVar;
            this.f77897b = z;
            this.f77898c = z2;
            this.f77908m = new a();
            this.f77909n = new a();
            byte[] bArr = new byte[128];
            this.f77902g = bArr;
            this.f77901f = new lhc(bArr, 0, 0);
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
            long j = this.f77912q;
            if (j != -9223372036854775807L) {
                long j2 = this.f77905j;
                long j3 = this.f77911p;
                if (j2 == j3) {
                    return;
                }
                boolean z = this.f77913r;
                this.f77896a.sampleMetadata(j, z ? 1 : 0, (int) (j2 - j3), i, null);
            }
        }

        private void setSampleIsKeyframe() {
            boolean zIsISlice = this.f77897b ? this.f77909n.isISlice() : this.f77914s;
            boolean z = this.f77913r;
            int i = this.f77904i;
            boolean z2 = true;
            if (i != 5 && (!zIsISlice || i != 1)) {
                z2 = false;
            }
            this.f77913r = z | z2;
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
            throw new UnsupportedOperationException("Method not decompiled: p000.rd7.C12027b.appendToNalUnit(byte[], int, int):void");
        }

        public boolean endNalUnit(long j, int i, boolean z) {
            if (this.f77904i == 9 || (this.f77898c && this.f77909n.isFirstVclNalUnitOfPicture(this.f77908m))) {
                if (z && this.f77910o) {
                    outputSample(i + ((int) (j - this.f77905j)));
                }
                this.f77911p = this.f77905j;
                this.f77912q = this.f77907l;
                this.f77913r = false;
                this.f77910o = true;
            }
            setSampleIsKeyframe();
            this.f77904i = 24;
            return this.f77913r;
        }

        public boolean needsSpsPps() {
            return this.f77898c;
        }

        public void putPps(n8b.C9739l c9739l) {
            this.f77900e.append(c9739l.f63583a, c9739l);
        }

        public void putSps(n8b.C9740m c9740m) {
            this.f77899d.append(c9740m.f63589d, c9740m);
        }

        public void reset() {
            this.f77906k = false;
            this.f77910o = false;
            this.f77909n.clear();
        }

        public void startNalUnit(long j, int i, long j2, boolean z) {
            this.f77904i = i;
            this.f77907l = j2;
            this.f77905j = j;
            this.f77914s = z;
            if (!this.f77897b || i != 1) {
                if (!this.f77898c) {
                    return;
                }
                if (i != 5 && i != 1 && i != 2) {
                    return;
                }
            }
            a aVar = this.f77908m;
            this.f77908m = this.f77909n;
            this.f77909n = aVar;
            aVar.clear();
            this.f77903h = 0;
            this.f77906k = true;
        }
    }

    public rd7(eve eveVar, boolean z, boolean z2, String str) {
        this.f77879a = eveVar;
        this.f77880b = z;
        this.f77881c = z2;
        this.f77882d = str;
    }

    @z25({"output", "sampleReader"})
    private void assertTracksCreated() {
        v80.checkStateNotNull(this.f77889k);
        t0i.castNonNull(this.f77890l);
    }

    @g5e({"output", "sampleReader"})
    private void endNalUnit(long j, int i, int i2, long j2) {
        if (!this.f77891m || this.f77890l.needsSpsPps()) {
            this.f77883e.endNalUnit(i2);
            this.f77884f.endNalUnit(i2);
            if (this.f77891m) {
                if (this.f77883e.isCompleted()) {
                    m8b m8bVar = this.f77883e;
                    n8b.C9740m spsNalUnit = n8b.parseSpsNalUnit(m8bVar.f60192d, 3, m8bVar.f60193e);
                    this.f77879a.setReorderingQueueSize(spsNalUnit.f63605t);
                    this.f77890l.putSps(spsNalUnit);
                    this.f77883e.reset();
                } else if (this.f77884f.isCompleted()) {
                    m8b m8bVar2 = this.f77884f;
                    this.f77890l.putPps(n8b.parsePpsNalUnit(m8bVar2.f60192d, 3, m8bVar2.f60193e));
                    this.f77884f.reset();
                }
            } else if (this.f77883e.isCompleted() && this.f77884f.isCompleted()) {
                ArrayList arrayList = new ArrayList();
                m8b m8bVar3 = this.f77883e;
                arrayList.add(Arrays.copyOf(m8bVar3.f60192d, m8bVar3.f60193e));
                m8b m8bVar4 = this.f77884f;
                arrayList.add(Arrays.copyOf(m8bVar4.f60192d, m8bVar4.f60193e));
                m8b m8bVar5 = this.f77883e;
                n8b.C9740m spsNalUnit2 = n8b.parseSpsNalUnit(m8bVar5.f60192d, 3, m8bVar5.f60193e);
                m8b m8bVar6 = this.f77884f;
                n8b.C9739l ppsNalUnit = n8b.parsePpsNalUnit(m8bVar6.f60192d, 3, m8bVar6.f60193e);
                this.f77889k.format(new C1213a.b().setId(this.f77888j).setContainerMimeType(this.f77882d).setSampleMimeType("video/avc").setCodecs(d72.buildAvcCodecString(spsNalUnit2.f63586a, spsNalUnit2.f63587b, spsNalUnit2.f63588c)).setWidth(spsNalUnit2.f63591f).setHeight(spsNalUnit2.f63592g).setColorInfo(new e92.C5196b().setColorSpace(spsNalUnit2.f63602q).setColorRange(spsNalUnit2.f63603r).setColorTransfer(spsNalUnit2.f63604s).setLumaBitdepth(spsNalUnit2.f63594i + 8).setChromaBitdepth(spsNalUnit2.f63595j + 8).build()).setPixelWidthHeightRatio(spsNalUnit2.f63593h).setInitializationData(arrayList).setMaxNumReorderSamples(spsNalUnit2.f63605t).build());
                this.f77891m = true;
                this.f77879a.setReorderingQueueSize(spsNalUnit2.f63605t);
                this.f77890l.putSps(spsNalUnit2);
                this.f77890l.putPps(ppsNalUnit);
                this.f77883e.reset();
                this.f77884f.reset();
            }
        }
        if (this.f77885g.endNalUnit(i2)) {
            m8b m8bVar7 = this.f77885g;
            this.f77894p.reset(this.f77885g.f60192d, n8b.unescapeStream(m8bVar7.f60192d, m8bVar7.f60193e));
            this.f77894p.setPosition(4);
            this.f77879a.consume(j2, this.f77894p);
        }
        if (this.f77890l.endNalUnit(j, i, this.f77891m)) {
            this.f77893o = false;
        }
    }

    @g5e({"sampleReader"})
    private void nalUnitData(byte[] bArr, int i, int i2) {
        if (!this.f77891m || this.f77890l.needsSpsPps()) {
            this.f77883e.appendToNalUnit(bArr, i, i2);
            this.f77884f.appendToNalUnit(bArr, i, i2);
        }
        this.f77885g.appendToNalUnit(bArr, i, i2);
        this.f77890l.appendToNalUnit(bArr, i, i2);
    }

    @g5e({"sampleReader"})
    private void startNalUnit(long j, int i, long j2) {
        if (!this.f77891m || this.f77890l.needsSpsPps()) {
            this.f77883e.startNalUnit(i);
            this.f77884f.startNalUnit(i);
        }
        this.f77885g.startNalUnit(i);
        this.f77890l.startNalUnit(j, i, j2, this.f77893o);
    }

    @Override // p000.dy4
    public void consume(jhc jhcVar) {
        int i;
        assertTracksCreated();
        int position = jhcVar.getPosition();
        int iLimit = jhcVar.limit();
        byte[] data = jhcVar.getData();
        this.f77886h += (long) jhcVar.bytesLeft();
        this.f77889k.sampleData(jhcVar, jhcVar.bytesLeft());
        while (true) {
            int iFindNalUnit = n8b.findNalUnit(data, position, iLimit, this.f77887i);
            if (iFindNalUnit == iLimit) {
                nalUnitData(data, position, iLimit);
                return;
            }
            int nalUnitType = n8b.getNalUnitType(data, iFindNalUnit);
            if (iFindNalUnit <= 0 || data[iFindNalUnit - 1] != 0) {
                i = 3;
            } else {
                iFindNalUnit--;
                i = 4;
            }
            int i2 = iFindNalUnit;
            int i3 = i;
            int i4 = i2 - position;
            if (i4 > 0) {
                nalUnitData(data, position, i2);
            }
            int i5 = iLimit - i2;
            long j = this.f77886h - ((long) i5);
            endNalUnit(j, i5, i4 < 0 ? -i4 : 0, this.f77892n);
            startNalUnit(j, nalUnitType, this.f77892n);
            position = i2 + i3;
        }
    }

    @Override // p000.dy4
    public void createTracks(bk5 bk5Var, ckh.C2372e c2372e) {
        c2372e.generateNewId();
        this.f77888j = c2372e.getFormatId();
        q6h q6hVarTrack = bk5Var.track(c2372e.getTrackId(), 2);
        this.f77889k = q6hVarTrack;
        this.f77890l = new C12027b(q6hVarTrack, this.f77880b, this.f77881c);
        this.f77879a.createTracks(bk5Var, c2372e);
    }

    @Override // p000.dy4
    public void packetFinished(boolean z) {
        assertTracksCreated();
        if (z) {
            this.f77879a.flush();
            endNalUnit(this.f77886h, 0, 0, this.f77892n);
            startNalUnit(this.f77886h, 9, this.f77892n);
            endNalUnit(this.f77886h, 0, 0, this.f77892n);
        }
    }

    @Override // p000.dy4
    public void packetStarted(long j, int i) {
        this.f77892n = j;
        this.f77893o |= (i & 2) != 0;
    }

    @Override // p000.dy4
    public void seek() {
        this.f77886h = 0L;
        this.f77893o = false;
        this.f77892n = -9223372036854775807L;
        n8b.clearPrefixFlags(this.f77887i);
        this.f77883e.reset();
        this.f77884f.reset();
        this.f77885g.reset();
        this.f77879a.clear();
        C12027b c12027b = this.f77890l;
        if (c12027b != null) {
            c12027b.reset();
        }
    }
}

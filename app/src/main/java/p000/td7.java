package p000;

import androidx.media3.common.C1213a;
import java.util.Collections;
import p000.ckh;
import p000.e92;
import p000.n8b;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class td7 implements dy4 {

    /* JADX INFO: renamed from: a */
    public final eve f84318a;

    /* JADX INFO: renamed from: b */
    public final String f84319b;

    /* JADX INFO: renamed from: c */
    public String f84320c;

    /* JADX INFO: renamed from: d */
    public q6h f84321d;

    /* JADX INFO: renamed from: e */
    public C12992a f84322e;

    /* JADX INFO: renamed from: f */
    public boolean f84323f;

    /* JADX INFO: renamed from: m */
    public long f84330m;

    /* JADX INFO: renamed from: g */
    public final boolean[] f84324g = new boolean[3];

    /* JADX INFO: renamed from: h */
    public final m8b f84325h = new m8b(32, 128);

    /* JADX INFO: renamed from: i */
    public final m8b f84326i = new m8b(33, 128);

    /* JADX INFO: renamed from: j */
    public final m8b f84327j = new m8b(34, 128);

    /* JADX INFO: renamed from: k */
    public final m8b f84328k = new m8b(39, 128);

    /* JADX INFO: renamed from: l */
    public final m8b f84329l = new m8b(40, 128);

    /* JADX INFO: renamed from: n */
    public long f84331n = -9223372036854775807L;

    /* JADX INFO: renamed from: o */
    public final jhc f84332o = new jhc();

    /* JADX INFO: renamed from: td7$a */
    public static final class C12992a {

        /* JADX INFO: renamed from: n */
        public static final int f84333n = 2;

        /* JADX INFO: renamed from: a */
        public final q6h f84334a;

        /* JADX INFO: renamed from: b */
        public long f84335b;

        /* JADX INFO: renamed from: c */
        public boolean f84336c;

        /* JADX INFO: renamed from: d */
        public int f84337d;

        /* JADX INFO: renamed from: e */
        public long f84338e;

        /* JADX INFO: renamed from: f */
        public boolean f84339f;

        /* JADX INFO: renamed from: g */
        public boolean f84340g;

        /* JADX INFO: renamed from: h */
        public boolean f84341h;

        /* JADX INFO: renamed from: i */
        public boolean f84342i;

        /* JADX INFO: renamed from: j */
        public boolean f84343j;

        /* JADX INFO: renamed from: k */
        public long f84344k;

        /* JADX INFO: renamed from: l */
        public long f84345l;

        /* JADX INFO: renamed from: m */
        public boolean f84346m;

        public C12992a(q6h q6hVar) {
            this.f84334a = q6hVar;
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
            long j = this.f84345l;
            if (j != -9223372036854775807L) {
                long j2 = this.f84335b;
                long j3 = this.f84344k;
                if (j2 == j3) {
                    return;
                }
                boolean z = this.f84346m;
                this.f84334a.sampleMetadata(j, z ? 1 : 0, (int) (j2 - j3), i, null);
            }
        }

        public void endNalUnit(long j, int i, boolean z) {
            if (this.f84343j && this.f84340g) {
                this.f84346m = this.f84336c;
                this.f84343j = false;
            } else if (this.f84341h || this.f84340g) {
                if (z && this.f84342i) {
                    outputSample(i + ((int) (j - this.f84335b)));
                }
                this.f84344k = this.f84335b;
                this.f84345l = this.f84338e;
                this.f84346m = this.f84336c;
                this.f84342i = true;
            }
        }

        public void readNalUnitData(byte[] bArr, int i, int i2) {
            if (this.f84339f) {
                int i3 = this.f84337d;
                int i4 = (i + 2) - i3;
                if (i4 >= i2) {
                    this.f84337d = i3 + (i2 - i);
                } else {
                    this.f84340g = (bArr[i4] & 128) != 0;
                    this.f84339f = false;
                }
            }
        }

        public void reset() {
            this.f84339f = false;
            this.f84340g = false;
            this.f84341h = false;
            this.f84342i = false;
            this.f84343j = false;
        }

        public void startNalUnit(long j, int i, int i2, long j2, boolean z) {
            this.f84340g = false;
            this.f84341h = false;
            this.f84338e = j2;
            this.f84337d = 0;
            this.f84335b = j;
            if (!isVclBodyNalUnit(i2)) {
                if (this.f84342i && !this.f84343j) {
                    if (z) {
                        outputSample(i);
                    }
                    this.f84342i = false;
                }
                if (isPrefixNalUnit(i2)) {
                    this.f84341h = !this.f84343j;
                    this.f84343j = true;
                }
            }
            boolean z2 = i2 >= 16 && i2 <= 21;
            this.f84336c = z2;
            this.f84339f = z2 || i2 <= 9;
        }
    }

    public td7(eve eveVar, String str) {
        this.f84318a = eveVar;
        this.f84319b = str;
    }

    @z25({"output", "sampleReader"})
    private void assertTracksCreated() {
        v80.checkStateNotNull(this.f84321d);
        t0i.castNonNull(this.f84322e);
    }

    @g5e({"output", "sampleReader"})
    private void endNalUnit(long j, int i, int i2, long j2) {
        this.f84322e.endNalUnit(j, i, this.f84323f);
        if (!this.f84323f) {
            this.f84325h.endNalUnit(i2);
            this.f84326i.endNalUnit(i2);
            this.f84327j.endNalUnit(i2);
            if (this.f84325h.isCompleted() && this.f84326i.isCompleted() && this.f84327j.isCompleted()) {
                C1213a mediaFormat = parseMediaFormat(this.f84320c, this.f84325h, this.f84326i, this.f84327j, this.f84319b);
                this.f84321d.format(mediaFormat);
                v7d.checkState(mediaFormat.f8293q != -1);
                this.f84318a.setReorderingQueueSize(mediaFormat.f8293q);
                this.f84323f = true;
            }
        }
        if (this.f84328k.endNalUnit(i2)) {
            m8b m8bVar = this.f84328k;
            this.f84332o.reset(this.f84328k.f60192d, n8b.unescapeStream(m8bVar.f60192d, m8bVar.f60193e));
            this.f84332o.skipBytes(5);
            this.f84318a.consume(j2, this.f84332o);
        }
        if (this.f84329l.endNalUnit(i2)) {
            m8b m8bVar2 = this.f84329l;
            this.f84332o.reset(this.f84329l.f60192d, n8b.unescapeStream(m8bVar2.f60192d, m8bVar2.f60193e));
            this.f84332o.skipBytes(5);
            this.f84318a.consume(j2, this.f84332o);
        }
    }

    @g5e({"sampleReader"})
    private void nalUnitData(byte[] bArr, int i, int i2) {
        this.f84322e.readNalUnitData(bArr, i, i2);
        if (!this.f84323f) {
            this.f84325h.appendToNalUnit(bArr, i, i2);
            this.f84326i.appendToNalUnit(bArr, i, i2);
            this.f84327j.appendToNalUnit(bArr, i, i2);
        }
        this.f84328k.appendToNalUnit(bArr, i, i2);
        this.f84329l.appendToNalUnit(bArr, i, i2);
    }

    private static C1213a parseMediaFormat(@hib String str, m8b m8bVar, m8b m8bVar2, m8b m8bVar3, String str2) {
        int i = m8bVar.f60193e;
        byte[] bArr = new byte[m8bVar2.f60193e + i + m8bVar3.f60193e];
        System.arraycopy(m8bVar.f60192d, 0, bArr, 0, i);
        System.arraycopy(m8bVar2.f60192d, 0, bArr, m8bVar.f60193e, m8bVar2.f60193e);
        System.arraycopy(m8bVar3.f60192d, 0, bArr, m8bVar.f60193e + m8bVar2.f60193e, m8bVar3.f60193e);
        n8b.C9735h h265SpsNalUnit = n8b.parseH265SpsNalUnit(m8bVar2.f60192d, 3, m8bVar2.f60193e, null);
        n8b.C9730c c9730c = h265SpsNalUnit.f63559c;
        return new C1213a.b().setId(str).setContainerMimeType(str2).setSampleMimeType("video/hevc").setCodecs(c9730c != null ? d72.buildHevcCodecString(c9730c.f63533a, c9730c.f63534b, c9730c.f63535c, c9730c.f63536d, c9730c.f63537e, c9730c.f63538f) : null).setWidth(h265SpsNalUnit.f63564h).setHeight(h265SpsNalUnit.f63565i).setDecodedWidth(h265SpsNalUnit.f63566j).setDecodedHeight(h265SpsNalUnit.f63567k).setColorInfo(new e92.C5196b().setColorSpace(h265SpsNalUnit.f63570n).setColorRange(h265SpsNalUnit.f63571o).setColorTransfer(h265SpsNalUnit.f63572p).setLumaBitdepth(h265SpsNalUnit.f63561e + 8).setChromaBitdepth(h265SpsNalUnit.f63562f + 8).build()).setPixelWidthHeightRatio(h265SpsNalUnit.f63568l).setMaxNumReorderSamples(h265SpsNalUnit.f63569m).setMaxSubLayers(h265SpsNalUnit.f63558b + 1).setInitializationData(Collections.singletonList(bArr)).build();
    }

    @g5e({"sampleReader"})
    private void startNalUnit(long j, int i, int i2, long j2) {
        this.f84322e.startNalUnit(j, i, i2, j2, this.f84323f);
        if (!this.f84323f) {
            this.f84325h.startNalUnit(i2);
            this.f84326i.startNalUnit(i2);
            this.f84327j.startNalUnit(i2);
        }
        this.f84328k.startNalUnit(i2);
        this.f84329l.startNalUnit(i2);
    }

    @Override // p000.dy4
    public void consume(jhc jhcVar) {
        int i;
        assertTracksCreated();
        while (jhcVar.bytesLeft() > 0) {
            int position = jhcVar.getPosition();
            int iLimit = jhcVar.limit();
            byte[] data = jhcVar.getData();
            this.f84330m += (long) jhcVar.bytesLeft();
            this.f84321d.sampleData(jhcVar, jhcVar.bytesLeft());
            while (position < iLimit) {
                int iFindNalUnit = n8b.findNalUnit(data, position, iLimit, this.f84324g);
                if (iFindNalUnit == iLimit) {
                    nalUnitData(data, position, iLimit);
                    return;
                }
                int h265NalUnitType = n8b.getH265NalUnitType(data, iFindNalUnit);
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
                long j = this.f84330m - ((long) i5);
                endNalUnit(j, i5, i4 < 0 ? -i4 : 0, this.f84331n);
                startNalUnit(j, i5, h265NalUnitType, this.f84331n);
                position = i2 + i3;
            }
        }
    }

    @Override // p000.dy4
    public void createTracks(bk5 bk5Var, ckh.C2372e c2372e) {
        c2372e.generateNewId();
        this.f84320c = c2372e.getFormatId();
        q6h q6hVarTrack = bk5Var.track(c2372e.getTrackId(), 2);
        this.f84321d = q6hVarTrack;
        this.f84322e = new C12992a(q6hVarTrack);
        this.f84318a.createTracks(bk5Var, c2372e);
    }

    @Override // p000.dy4
    public void packetFinished(boolean z) {
        assertTracksCreated();
        if (z) {
            this.f84318a.flush();
            endNalUnit(this.f84330m, 0, 0, this.f84331n);
            startNalUnit(this.f84330m, 0, 48, this.f84331n);
        }
    }

    @Override // p000.dy4
    public void packetStarted(long j, int i) {
        this.f84331n = j;
    }

    @Override // p000.dy4
    public void seek() {
        this.f84330m = 0L;
        this.f84331n = -9223372036854775807L;
        n8b.clearPrefixFlags(this.f84324g);
        this.f84325h.reset();
        this.f84326i.reset();
        this.f84327j.reset();
        this.f84328k.reset();
        this.f84329l.reset();
        this.f84318a.clear();
        C12992a c12992a = this.f84322e;
        if (c12992a != null) {
            c12992a.reset();
        }
    }
}

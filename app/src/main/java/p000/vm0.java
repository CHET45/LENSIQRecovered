package p000;

import androidx.media3.common.C1213a;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import p000.gue;
import p000.peg;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class vm0 implements xj5 {

    /* JADX INFO: renamed from: A */
    public static final int f91632A = 1769369453;

    /* JADX INFO: renamed from: B */
    public static final int f91633B = 829973609;

    /* JADX INFO: renamed from: C */
    public static final int f91634C = 1263424842;

    /* JADX INFO: renamed from: D */
    public static final int f91635D = 1718776947;

    /* JADX INFO: renamed from: E */
    public static final int f91636E = 1852994675;

    /* JADX INFO: renamed from: F */
    public static final int f91637F = 1752331379;

    /* JADX INFO: renamed from: G */
    public static final int f91638G = 1935963489;

    /* JADX INFO: renamed from: H */
    public static final int f91639H = 1937012852;

    /* JADX INFO: renamed from: I */
    public static final int f91640I = 1935960438;

    /* JADX INFO: renamed from: J */
    public static final int f91641J = 0;

    /* JADX INFO: renamed from: K */
    public static final int f91642K = 1;

    /* JADX INFO: renamed from: L */
    public static final int f91643L = 2;

    /* JADX INFO: renamed from: M */
    public static final int f91644M = 3;

    /* JADX INFO: renamed from: N */
    public static final int f91645N = 4;

    /* JADX INFO: renamed from: O */
    public static final int f91646O = 5;

    /* JADX INFO: renamed from: P */
    public static final int f91647P = 6;

    /* JADX INFO: renamed from: Q */
    public static final int f91648Q = 16;

    /* JADX INFO: renamed from: R */
    public static final int f91649R = 1;

    /* JADX INFO: renamed from: S */
    public static final long f91650S = 262144;

    /* JADX INFO: renamed from: t */
    public static final String f91651t = "AviExtractor";

    /* JADX INFO: renamed from: u */
    public static final int f91652u = 1179011410;

    /* JADX INFO: renamed from: v */
    public static final int f91653v = 541677121;

    /* JADX INFO: renamed from: w */
    public static final int f91654w = 1414744396;

    /* JADX INFO: renamed from: x */
    public static final int f91655x = 1751742049;

    /* JADX INFO: renamed from: y */
    public static final int f91656y = 1819436136;

    /* JADX INFO: renamed from: z */
    public static final int f91657z = 1819440243;

    /* JADX INFO: renamed from: d */
    public final jhc f91658d;

    /* JADX INFO: renamed from: e */
    public final C14160c f91659e;

    /* JADX INFO: renamed from: f */
    public final boolean f91660f;

    /* JADX INFO: renamed from: g */
    public final peg.InterfaceC10936a f91661g;

    /* JADX INFO: renamed from: h */
    public int f91662h;

    /* JADX INFO: renamed from: i */
    public bk5 f91663i;

    /* JADX INFO: renamed from: j */
    public ym0 f91664j;

    /* JADX INFO: renamed from: k */
    public long f91665k;

    /* JADX INFO: renamed from: l */
    public pz1[] f91666l;

    /* JADX INFO: renamed from: m */
    public long f91667m;

    /* JADX INFO: renamed from: n */
    @hib
    public pz1 f91668n;

    /* JADX INFO: renamed from: o */
    public int f91669o;

    /* JADX INFO: renamed from: p */
    public long f91670p;

    /* JADX INFO: renamed from: q */
    public long f91671q;

    /* JADX INFO: renamed from: r */
    public int f91672r;

    /* JADX INFO: renamed from: s */
    public boolean f91673s;

    /* JADX INFO: renamed from: vm0$b */
    public class C14159b implements gue {

        /* JADX INFO: renamed from: d */
        public final long f91674d;

        public C14159b(long j) {
            this.f91674d = j;
        }

        @Override // p000.gue
        public long getDurationUs() {
            return this.f91674d;
        }

        @Override // p000.gue
        public gue.C6548a getSeekPoints(long j) {
            gue.C6548a seekPoints = vm0.this.f91666l[0].getSeekPoints(j);
            for (int i = 1; i < vm0.this.f91666l.length; i++) {
                gue.C6548a seekPoints2 = vm0.this.f91666l[i].getSeekPoints(j);
                if (seekPoints2.f41218a.f58834b < seekPoints.f41218a.f58834b) {
                    seekPoints = seekPoints2;
                }
            }
            return seekPoints;
        }

        @Override // p000.gue
        public boolean isSeekable() {
            return true;
        }
    }

    /* JADX INFO: renamed from: vm0$c */
    public static class C14160c {

        /* JADX INFO: renamed from: a */
        public int f91676a;

        /* JADX INFO: renamed from: b */
        public int f91677b;

        /* JADX INFO: renamed from: c */
        public int f91678c;

        private C14160c() {
        }

        public void populateFrom(jhc jhcVar) {
            this.f91676a = jhcVar.readLittleEndianInt();
            this.f91677b = jhcVar.readLittleEndianInt();
            this.f91678c = 0;
        }

        public void populateWithListHeaderFrom(jhc jhcVar) throws yhc {
            populateFrom(jhcVar);
            if (this.f91676a == 1414744396) {
                this.f91678c = jhcVar.readLittleEndianInt();
                return;
            }
            throw yhc.createForMalformedContainer("LIST expected, found: " + this.f91676a, null);
        }
    }

    /* JADX INFO: renamed from: vm0$d */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC14161d {
    }

    @Deprecated
    public vm0() {
        this(1, peg.InterfaceC10936a.f70575a);
    }

    private static void alignInputToEvenPosition(ak5 ak5Var) throws IOException {
        if ((ak5Var.getPosition() & 1) == 1) {
            ak5Var.skipFully(1);
        }
    }

    @hib
    private pz1 getChunkReader(int i) {
        for (pz1 pz1Var : this.f91666l) {
            if (pz1Var.handlesChunkId(i)) {
                return pz1Var;
            }
        }
        return null;
    }

    private void parseHdrlBody(jhc jhcVar) throws IOException {
        m89 from = m89.parseFrom(1819436136, jhcVar);
        if (from.getType() != 1819436136) {
            throw yhc.createForMalformedContainer("Unexpected header list type " + from.getType(), null);
        }
        ym0 ym0Var = (ym0) from.getChild(ym0.class);
        if (ym0Var == null) {
            throw yhc.createForMalformedContainer("AviHeader not found", null);
        }
        this.f91664j = ym0Var;
        this.f91665k = ((long) ym0Var.f102042c) * ((long) ym0Var.f102040a);
        ArrayList arrayList = new ArrayList();
        quh<um0> it = from.f60185a.iterator();
        int i = 0;
        while (it.hasNext()) {
            um0 next = it.next();
            if (next.getType() == 1819440243) {
                int i2 = i + 1;
                pz1 pz1VarProcessStreamList = processStreamList((m89) next, i);
                if (pz1VarProcessStreamList != null) {
                    arrayList.add(pz1VarProcessStreamList);
                }
                i = i2;
            }
        }
        this.f91666l = (pz1[]) arrayList.toArray(new pz1[0]);
        this.f91663i.endTracks();
    }

    private void parseIdx1Body(jhc jhcVar) {
        int i;
        long jPeekSeekOffset = peekSeekOffset(jhcVar);
        while (true) {
            if (jhcVar.bytesLeft() < 16) {
                break;
            }
            int littleEndianInt = jhcVar.readLittleEndianInt();
            int littleEndianInt2 = jhcVar.readLittleEndianInt();
            long littleEndianInt3 = ((long) jhcVar.readLittleEndianInt()) + jPeekSeekOffset;
            jhcVar.skipBytes(4);
            pz1 chunkReader = getChunkReader(littleEndianInt);
            if (chunkReader != null) {
                chunkReader.appendIndexChunk(littleEndianInt3, (littleEndianInt2 & 16) == 16);
            }
        }
        for (pz1 pz1Var : this.f91666l) {
            pz1Var.commitIndex();
        }
        this.f91673s = true;
        if (this.f91666l.length == 0) {
            this.f91663i.seekMap(new gue.C6549b(this.f91665k));
        } else {
            this.f91663i.seekMap(new C14159b(this.f91665k));
        }
    }

    private long peekSeekOffset(jhc jhcVar) {
        if (jhcVar.bytesLeft() < 16) {
            return 0L;
        }
        int position = jhcVar.getPosition();
        jhcVar.skipBytes(8);
        long littleEndianInt = jhcVar.readLittleEndianInt();
        long j = this.f91670p;
        long j2 = littleEndianInt <= j ? j + 8 : 0L;
        jhcVar.setPosition(position);
        return j2;
    }

    @hib
    private pz1 processStreamList(m89 m89Var, int i) {
        an0 an0Var = (an0) m89Var.getChild(an0.class);
        v5g v5gVar = (v5g) m89Var.getChild(v5g.class);
        if (an0Var == null) {
            xh9.m25148w("AviExtractor", "Missing Stream Header");
            return null;
        }
        if (v5gVar == null) {
            xh9.m25148w("AviExtractor", "Missing Stream Format");
            return null;
        }
        long durationUs = an0Var.getDurationUs();
        C1213a c1213a = v5gVar.f90040a;
        C1213a.b bVarBuildUpon = c1213a.buildUpon();
        bVarBuildUpon.setId(i);
        int i2 = an0Var.f2138f;
        if (i2 != 0) {
            bVarBuildUpon.setMaxInputSize(i2);
        }
        b6g b6gVar = (b6g) m89Var.getChild(b6g.class);
        if (b6gVar != null) {
            bVarBuildUpon.setLabel(b6gVar.f12816a);
        }
        int trackType = rva.getTrackType(c1213a.f8291o);
        if (trackType != 1 && trackType != 2) {
            return null;
        }
        q6h q6hVarTrack = this.f91663i.track(i, trackType);
        q6hVarTrack.format(bVarBuildUpon.build());
        q6hVarTrack.durationUs(durationUs);
        this.f91665k = Math.max(this.f91665k, durationUs);
        return new pz1(i, an0Var, q6hVarTrack);
    }

    private int readMoviChunks(ak5 ak5Var) throws IOException {
        if (ak5Var.getPosition() >= this.f91671q) {
            return -1;
        }
        pz1 pz1Var = this.f91668n;
        if (pz1Var == null) {
            alignInputToEvenPosition(ak5Var);
            ak5Var.peekFully(this.f91658d.getData(), 0, 12);
            this.f91658d.setPosition(0);
            int littleEndianInt = this.f91658d.readLittleEndianInt();
            if (littleEndianInt == 1414744396) {
                this.f91658d.setPosition(8);
                ak5Var.skipFully(this.f91658d.readLittleEndianInt() != 1769369453 ? 8 : 12);
                ak5Var.resetPeekPosition();
                return 0;
            }
            int littleEndianInt2 = this.f91658d.readLittleEndianInt();
            if (littleEndianInt == 1263424842) {
                this.f91667m = ak5Var.getPosition() + ((long) littleEndianInt2) + 8;
                return 0;
            }
            ak5Var.skipFully(8);
            ak5Var.resetPeekPosition();
            pz1 chunkReader = getChunkReader(littleEndianInt);
            if (chunkReader == null) {
                this.f91667m = ak5Var.getPosition() + ((long) littleEndianInt2);
                return 0;
            }
            chunkReader.onChunkStart(littleEndianInt2);
            this.f91668n = chunkReader;
        } else if (pz1Var.onChunkData(ak5Var)) {
            this.f91668n = null;
        }
        return 0;
    }

    private boolean resolvePendingReposition(ak5 ak5Var, d5d d5dVar) throws IOException {
        boolean z;
        if (this.f91667m != -1) {
            long position = ak5Var.getPosition();
            long j = this.f91667m;
            if (j < position || j > 262144 + position) {
                d5dVar.f28476a = j;
                z = true;
            } else {
                ak5Var.skipFully((int) (j - position));
                z = false;
            }
        } else {
            z = false;
        }
        this.f91667m = -1L;
        return z;
    }

    @Override // p000.xj5
    public void init(bk5 bk5Var) {
        this.f91662h = 0;
        if (this.f91660f) {
            bk5Var = new reg(bk5Var, this.f91661g);
        }
        this.f91663i = bk5Var;
        this.f91667m = -1L;
    }

    @Override // p000.xj5
    public int read(ak5 ak5Var, d5d d5dVar) throws IOException {
        if (resolvePendingReposition(ak5Var, d5dVar)) {
            return 1;
        }
        switch (this.f91662h) {
            case 0:
                if (!sniff(ak5Var)) {
                    throw yhc.createForMalformedContainer("AVI Header List not found", null);
                }
                ak5Var.skipFully(12);
                this.f91662h = 1;
                return 0;
            case 1:
                ak5Var.readFully(this.f91658d.getData(), 0, 12);
                this.f91658d.setPosition(0);
                this.f91659e.populateWithListHeaderFrom(this.f91658d);
                C14160c c14160c = this.f91659e;
                if (c14160c.f91678c == 1819436136) {
                    this.f91669o = c14160c.f91677b;
                    this.f91662h = 2;
                    return 0;
                }
                throw yhc.createForMalformedContainer("hdrl expected, found: " + this.f91659e.f91678c, null);
            case 2:
                int i = this.f91669o - 4;
                jhc jhcVar = new jhc(i);
                ak5Var.readFully(jhcVar.getData(), 0, i);
                parseHdrlBody(jhcVar);
                this.f91662h = 3;
                return 0;
            case 3:
                if (this.f91670p != -1) {
                    long position = ak5Var.getPosition();
                    long j = this.f91670p;
                    if (position != j) {
                        this.f91667m = j;
                        return 0;
                    }
                }
                ak5Var.peekFully(this.f91658d.getData(), 0, 12);
                ak5Var.resetPeekPosition();
                this.f91658d.setPosition(0);
                this.f91659e.populateFrom(this.f91658d);
                int littleEndianInt = this.f91658d.readLittleEndianInt();
                int i2 = this.f91659e.f91676a;
                if (i2 == 1179011410) {
                    ak5Var.skipFully(12);
                    return 0;
                }
                if (i2 != 1414744396 || littleEndianInt != 1769369453) {
                    this.f91667m = ak5Var.getPosition() + ((long) this.f91659e.f91677b) + 8;
                    return 0;
                }
                long position2 = ak5Var.getPosition();
                this.f91670p = position2;
                this.f91671q = position2 + ((long) this.f91659e.f91677b) + 8;
                if (!this.f91673s) {
                    if (((ym0) v80.checkNotNull(this.f91664j)).hasIndex()) {
                        this.f91662h = 4;
                        this.f91667m = this.f91671q;
                        return 0;
                    }
                    this.f91663i.seekMap(new gue.C6549b(this.f91665k));
                    this.f91673s = true;
                }
                this.f91667m = ak5Var.getPosition() + 12;
                this.f91662h = 6;
                return 0;
            case 4:
                ak5Var.readFully(this.f91658d.getData(), 0, 8);
                this.f91658d.setPosition(0);
                int littleEndianInt2 = this.f91658d.readLittleEndianInt();
                int littleEndianInt3 = this.f91658d.readLittleEndianInt();
                if (littleEndianInt2 == 829973609) {
                    this.f91662h = 5;
                    this.f91672r = littleEndianInt3;
                } else {
                    this.f91667m = ak5Var.getPosition() + ((long) littleEndianInt3);
                }
                return 0;
            case 5:
                jhc jhcVar2 = new jhc(this.f91672r);
                ak5Var.readFully(jhcVar2.getData(), 0, this.f91672r);
                parseIdx1Body(jhcVar2);
                this.f91662h = 6;
                this.f91667m = this.f91670p;
                return 0;
            case 6:
                return readMoviChunks(ak5Var);
            default:
                throw new AssertionError();
        }
    }

    @Override // p000.xj5
    public void release() {
    }

    @Override // p000.xj5
    public void seek(long j, long j2) {
        this.f91667m = -1L;
        this.f91668n = null;
        for (pz1 pz1Var : this.f91666l) {
            pz1Var.seekToPosition(j);
        }
        if (j != 0) {
            this.f91662h = 6;
        } else if (this.f91666l.length == 0) {
            this.f91662h = 0;
        } else {
            this.f91662h = 3;
        }
    }

    @Override // p000.xj5
    public boolean sniff(ak5 ak5Var) throws IOException {
        ak5Var.peekFully(this.f91658d.getData(), 0, 12);
        this.f91658d.setPosition(0);
        if (this.f91658d.readLittleEndianInt() != 1179011410) {
            return false;
        }
        this.f91658d.skipBytes(4);
        return this.f91658d.readLittleEndianInt() == 541677121;
    }

    public vm0(int i, peg.InterfaceC10936a interfaceC10936a) {
        this.f91661g = interfaceC10936a;
        this.f91660f = (i & 1) == 0;
        this.f91658d = new jhc(12);
        this.f91659e = new C14160c();
        this.f91663i = new tdb();
        this.f91666l = new pz1[0];
        this.f91670p = -1L;
        this.f91671q = -1L;
        this.f91669o = -1;
        this.f91665k = -9223372036854775807L;
    }
}

package p000;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.dkh;
import p000.hue;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class bkh implements yj5 {

    /* JADX INFO: renamed from: A */
    public static final int f13973A = 188;

    /* JADX INFO: renamed from: B */
    public static final int f13974B = 112800;

    /* JADX INFO: renamed from: C */
    public static final int f13975C = 3;

    /* JADX INFO: renamed from: D */
    public static final int f13976D = 4;

    /* JADX INFO: renamed from: E */
    public static final int f13977E = 15;

    /* JADX INFO: renamed from: F */
    public static final int f13978F = 17;

    /* JADX INFO: renamed from: G */
    public static final int f13979G = 129;

    /* JADX INFO: renamed from: H */
    public static final int f13980H = 138;

    /* JADX INFO: renamed from: I */
    public static final int f13981I = 130;

    /* JADX INFO: renamed from: J */
    public static final int f13982J = 135;

    /* JADX INFO: renamed from: K */
    public static final int f13983K = 172;

    /* JADX INFO: renamed from: L */
    public static final int f13984L = 2;

    /* JADX INFO: renamed from: M */
    public static final int f13985M = 16;

    /* JADX INFO: renamed from: N */
    public static final int f13986N = 27;

    /* JADX INFO: renamed from: O */
    public static final int f13987O = 36;

    /* JADX INFO: renamed from: P */
    public static final int f13988P = 21;

    /* JADX INFO: renamed from: Q */
    public static final int f13989Q = 134;

    /* JADX INFO: renamed from: R */
    public static final int f13990R = 89;

    /* JADX INFO: renamed from: S */
    public static final int f13991S = 128;

    /* JADX INFO: renamed from: T */
    public static final int f13992T = 257;

    /* JADX INFO: renamed from: U */
    public static final int f13993U = 71;

    /* JADX INFO: renamed from: V */
    public static final int f13994V = 0;

    /* JADX INFO: renamed from: W */
    public static final int f13995W = 8192;

    /* JADX INFO: renamed from: X */
    public static final long f13996X = 1094921523;

    /* JADX INFO: renamed from: Y */
    public static final long f13997Y = 1161904947;

    /* JADX INFO: renamed from: Z */
    public static final long f13998Z = 1094921524;

    /* JADX INFO: renamed from: a0 */
    public static final long f13999a0 = 1212503619;

    /* JADX INFO: renamed from: b0 */
    public static final int f14000b0 = 9400;

    /* JADX INFO: renamed from: c0 */
    public static final int f14001c0 = 5;

    /* JADX INFO: renamed from: w */
    public static final hk5 f14002w = new hk5() { // from class: xjh
        @Override // p000.hk5
        public final yj5[] createExtractors() {
            return bkh.lambda$static$0();
        }
    };

    /* JADX INFO: renamed from: x */
    public static final int f14003x = 0;

    /* JADX INFO: renamed from: y */
    public static final int f14004y = 1;

    /* JADX INFO: renamed from: z */
    public static final int f14005z = 2;

    /* JADX INFO: renamed from: d */
    public final int f14006d;

    /* JADX INFO: renamed from: e */
    public final int f14007e;

    /* JADX INFO: renamed from: f */
    public final List<g2h> f14008f;

    /* JADX INFO: renamed from: g */
    public final ihc f14009g;

    /* JADX INFO: renamed from: h */
    public final SparseIntArray f14010h;

    /* JADX INFO: renamed from: i */
    public final dkh.InterfaceC4836c f14011i;

    /* JADX INFO: renamed from: j */
    public final SparseArray<dkh> f14012j;

    /* JADX INFO: renamed from: k */
    public final SparseBooleanArray f14013k;

    /* JADX INFO: renamed from: l */
    public final SparseBooleanArray f14014l;

    /* JADX INFO: renamed from: m */
    public final vjh f14015m;

    /* JADX INFO: renamed from: n */
    public ujh f14016n;

    /* JADX INFO: renamed from: o */
    public ck5 f14017o;

    /* JADX INFO: renamed from: p */
    public int f14018p;

    /* JADX INFO: renamed from: q */
    public boolean f14019q;

    /* JADX INFO: renamed from: r */
    public boolean f14020r;

    /* JADX INFO: renamed from: s */
    public boolean f14021s;

    /* JADX INFO: renamed from: t */
    @hib
    public dkh f14022t;

    /* JADX INFO: renamed from: u */
    public int f14023u;

    /* JADX INFO: renamed from: v */
    public int f14024v;

    /* JADX INFO: renamed from: bkh$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC1932a {
    }

    /* JADX INFO: renamed from: bkh$b */
    public class C1933b implements ute {

        /* JADX INFO: renamed from: a */
        public final ghc f14025a = new ghc(new byte[4]);

        public C1933b() {
        }

        @Override // p000.ute
        public void consume(ihc ihcVar) {
            if (ihcVar.readUnsignedByte() == 0 && (ihcVar.readUnsignedByte() & 128) != 0) {
                ihcVar.skipBytes(6);
                int iBytesLeft = ihcVar.bytesLeft() / 4;
                for (int i = 0; i < iBytesLeft; i++) {
                    ihcVar.readBytes(this.f14025a, 4);
                    int bits = this.f14025a.readBits(16);
                    this.f14025a.skipBits(3);
                    if (bits == 0) {
                        this.f14025a.skipBits(13);
                    } else {
                        int bits2 = this.f14025a.readBits(13);
                        if (bkh.this.f14012j.get(bits2) == null) {
                            bkh.this.f14012j.put(bits2, new wte(bkh.this.new C1934c(bits2)));
                            bkh.m3227g(bkh.this);
                        }
                    }
                }
                if (bkh.this.f14006d != 2) {
                    bkh.this.f14012j.remove(0);
                }
            }
        }

        @Override // p000.ute
        public void init(g2h g2hVar, ck5 ck5Var, dkh.C4838e c4838e) {
        }
    }

    /* JADX INFO: renamed from: bkh$c */
    public class C1934c implements ute {

        /* JADX INFO: renamed from: f */
        public static final int f14027f = 5;

        /* JADX INFO: renamed from: g */
        public static final int f14028g = 10;

        /* JADX INFO: renamed from: h */
        public static final int f14029h = 106;

        /* JADX INFO: renamed from: i */
        public static final int f14030i = 111;

        /* JADX INFO: renamed from: j */
        public static final int f14031j = 122;

        /* JADX INFO: renamed from: k */
        public static final int f14032k = 123;

        /* JADX INFO: renamed from: l */
        public static final int f14033l = 127;

        /* JADX INFO: renamed from: m */
        public static final int f14034m = 89;

        /* JADX INFO: renamed from: n */
        public static final int f14035n = 21;

        /* JADX INFO: renamed from: a */
        public final ghc f14036a = new ghc(new byte[5]);

        /* JADX INFO: renamed from: b */
        public final SparseArray<dkh> f14037b = new SparseArray<>();

        /* JADX INFO: renamed from: c */
        public final SparseIntArray f14038c = new SparseIntArray();

        /* JADX INFO: renamed from: d */
        public final int f14039d;

        public C1934c(int i) {
            this.f14039d = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private p000.dkh.C4835b readEsInfo(p000.ihc r13, int r14) {
            /*
                Method dump skipped, instruction units count: 206
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.bkh.C1934c.readEsInfo(ihc, int):dkh$b");
        }

        @Override // p000.ute
        public void consume(ihc ihcVar) {
            g2h g2hVar;
            if (ihcVar.readUnsignedByte() != 2) {
                return;
            }
            if (bkh.this.f14006d == 1 || bkh.this.f14006d == 2 || bkh.this.f14018p == 1) {
                g2hVar = (g2h) bkh.this.f14008f.get(0);
            } else {
                g2hVar = new g2h(((g2h) bkh.this.f14008f.get(0)).getFirstSampleTimestampUs());
                bkh.this.f14008f.add(g2hVar);
            }
            if ((ihcVar.readUnsignedByte() & 128) == 0) {
                return;
            }
            ihcVar.skipBytes(1);
            int unsignedShort = ihcVar.readUnsignedShort();
            int i = 3;
            ihcVar.skipBytes(3);
            ihcVar.readBytes(this.f14036a, 2);
            this.f14036a.skipBits(3);
            int i2 = 13;
            bkh.this.f14024v = this.f14036a.readBits(13);
            ihcVar.readBytes(this.f14036a, 2);
            int i3 = 4;
            this.f14036a.skipBits(4);
            ihcVar.skipBytes(this.f14036a.readBits(12));
            if (bkh.this.f14006d == 2 && bkh.this.f14022t == null) {
                dkh.C4835b c4835b = new dkh.C4835b(21, null, null, x0i.f95983f);
                bkh bkhVar = bkh.this;
                bkhVar.f14022t = bkhVar.f14011i.createPayloadReader(21, c4835b);
                if (bkh.this.f14022t != null) {
                    bkh.this.f14022t.init(g2hVar, bkh.this.f14017o, new dkh.C4838e(unsignedShort, 21, 8192));
                }
            }
            this.f14037b.clear();
            this.f14038c.clear();
            int iBytesLeft = ihcVar.bytesLeft();
            while (iBytesLeft > 0) {
                ihcVar.readBytes(this.f14036a, 5);
                int bits = this.f14036a.readBits(8);
                this.f14036a.skipBits(i);
                int bits2 = this.f14036a.readBits(i2);
                this.f14036a.skipBits(i3);
                int bits3 = this.f14036a.readBits(12);
                dkh.C4835b esInfo = readEsInfo(ihcVar, bits3);
                if (bits == 6 || bits == 5) {
                    bits = esInfo.f29901a;
                }
                iBytesLeft -= bits3 + 5;
                int i4 = bkh.this.f14006d == 2 ? bits : bits2;
                if (!bkh.this.f14013k.get(i4)) {
                    dkh dkhVarCreatePayloadReader = (bkh.this.f14006d == 2 && bits == 21) ? bkh.this.f14022t : bkh.this.f14011i.createPayloadReader(bits, esInfo);
                    if (bkh.this.f14006d != 2 || bits2 < this.f14038c.get(i4, 8192)) {
                        this.f14038c.put(i4, bits2);
                        this.f14037b.put(i4, dkhVarCreatePayloadReader);
                    }
                }
                i = 3;
                i3 = 4;
                i2 = 13;
            }
            int size = this.f14038c.size();
            for (int i5 = 0; i5 < size; i5++) {
                int iKeyAt = this.f14038c.keyAt(i5);
                int iValueAt = this.f14038c.valueAt(i5);
                bkh.this.f14013k.put(iKeyAt, true);
                bkh.this.f14014l.put(iValueAt, true);
                dkh dkhVarValueAt = this.f14037b.valueAt(i5);
                if (dkhVarValueAt != null) {
                    if (dkhVarValueAt != bkh.this.f14022t) {
                        dkhVarValueAt.init(g2hVar, bkh.this.f14017o, new dkh.C4838e(unsignedShort, iKeyAt, 8192));
                    }
                    bkh.this.f14012j.put(iValueAt, dkhVarValueAt);
                }
            }
            if (bkh.this.f14006d == 2) {
                if (bkh.this.f14019q) {
                    return;
                }
                bkh.this.f14017o.endTracks();
                bkh.this.f14018p = 0;
                bkh.this.f14019q = true;
                return;
            }
            bkh.this.f14012j.remove(this.f14039d);
            bkh bkhVar2 = bkh.this;
            bkhVar2.f14018p = bkhVar2.f14006d == 1 ? 0 : bkh.this.f14018p - 1;
            if (bkh.this.f14018p == 0) {
                bkh.this.f14017o.endTracks();
                bkh.this.f14019q = true;
            }
        }

        @Override // p000.ute
        public void init(g2h g2hVar, ck5 ck5Var, dkh.C4838e c4838e) {
        }
    }

    public bkh() {
        this(0);
    }

    private boolean fillBufferWithAtLeastOnePacket(zj5 zj5Var) throws IOException {
        byte[] data = this.f14009g.getData();
        if (9400 - this.f14009g.getPosition() < 188) {
            int iBytesLeft = this.f14009g.bytesLeft();
            if (iBytesLeft > 0) {
                System.arraycopy(data, this.f14009g.getPosition(), data, 0, iBytesLeft);
            }
            this.f14009g.reset(data, iBytesLeft);
        }
        while (this.f14009g.bytesLeft() < 188) {
            int iLimit = this.f14009g.limit();
            int i = zj5Var.read(data, iLimit, 9400 - iLimit);
            if (i == -1) {
                return false;
            }
            this.f14009g.setLimit(iLimit + i);
        }
        return true;
    }

    private int findEndOfFirstTsPacketInBuffer() throws xhc {
        int position = this.f14009g.getPosition();
        int iLimit = this.f14009g.limit();
        int iFindSyncBytePosition = ekh.findSyncBytePosition(this.f14009g.getData(), position, iLimit);
        this.f14009g.setPosition(iFindSyncBytePosition);
        int i = iFindSyncBytePosition + 188;
        if (i > iLimit) {
            int i2 = this.f14023u + (iFindSyncBytePosition - position);
            this.f14023u = i2;
            if (this.f14006d == 2 && i2 > 376) {
                throw xhc.createForMalformedContainer("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f14023u = 0;
        }
        return i;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m3227g(bkh bkhVar) {
        int i = bkhVar.f14018p;
        bkhVar.f14018p = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ yj5[] lambda$static$0() {
        return new yj5[]{new bkh()};
    }

    private void maybeOutputSeekMap(long j) {
        if (this.f14020r) {
            return;
        }
        this.f14020r = true;
        if (this.f14015m.getDurationUs() == -9223372036854775807L) {
            this.f14017o.seekMap(new hue.C7024b(this.f14015m.getDurationUs()));
            return;
        }
        ujh ujhVar = new ujh(this.f14015m.getPcrTimestampAdjuster(), this.f14015m.getDurationUs(), j, this.f14024v, this.f14007e);
        this.f14016n = ujhVar;
        this.f14017o.seekMap(ujhVar.getSeekMap());
    }

    private void resetPayloadReaders() {
        this.f14013k.clear();
        this.f14012j.clear();
        SparseArray<dkh> sparseArrayCreateInitialPayloadReaders = this.f14011i.createInitialPayloadReaders();
        int size = sparseArrayCreateInitialPayloadReaders.size();
        for (int i = 0; i < size; i++) {
            this.f14012j.put(sparseArrayCreateInitialPayloadReaders.keyAt(i), sparseArrayCreateInitialPayloadReaders.valueAt(i));
        }
        this.f14012j.put(0, new wte(new C1933b()));
        this.f14022t = null;
    }

    private boolean shouldConsumePacketPayload(int i) {
        return this.f14006d == 2 || this.f14019q || !this.f14014l.get(i, false);
    }

    @Override // p000.yj5
    public void init(ck5 ck5Var) {
        this.f14017o = ck5Var;
    }

    @Override // p000.yj5
    public int read(zj5 zj5Var, c5d c5dVar) throws IOException {
        long length = zj5Var.getLength();
        if (this.f14019q) {
            if (length != -1 && this.f14006d != 2 && !this.f14015m.isDurationReadFinished()) {
                return this.f14015m.readDuration(zj5Var, c5dVar, this.f14024v);
            }
            maybeOutputSeekMap(length);
            if (this.f14021s) {
                this.f14021s = false;
                seek(0L, 0L);
                if (zj5Var.getPosition() != 0) {
                    c5dVar.f15813a = 0L;
                    return 1;
                }
            }
            ujh ujhVar = this.f14016n;
            if (ujhVar != null && ujhVar.isSeeking()) {
                return this.f14016n.handlePendingSeek(zj5Var, c5dVar);
            }
        }
        if (!fillBufferWithAtLeastOnePacket(zj5Var)) {
            return -1;
        }
        int iFindEndOfFirstTsPacketInBuffer = findEndOfFirstTsPacketInBuffer();
        int iLimit = this.f14009g.limit();
        if (iFindEndOfFirstTsPacketInBuffer > iLimit) {
            return 0;
        }
        int i = this.f14009g.readInt();
        if ((8388608 & i) != 0) {
            this.f14009g.setPosition(iFindEndOfFirstTsPacketInBuffer);
            return 0;
        }
        int i2 = (4194304 & i) != 0 ? 1 : 0;
        int i3 = (2096896 & i) >> 8;
        boolean z = (i & 32) != 0;
        dkh dkhVar = (i & 16) != 0 ? this.f14012j.get(i3) : null;
        if (dkhVar == null) {
            this.f14009g.setPosition(iFindEndOfFirstTsPacketInBuffer);
            return 0;
        }
        if (this.f14006d != 2) {
            int i4 = i & 15;
            int i5 = this.f14010h.get(i3, i4 - 1);
            this.f14010h.put(i3, i4);
            if (i5 == i4) {
                this.f14009g.setPosition(iFindEndOfFirstTsPacketInBuffer);
                return 0;
            }
            if (i4 != ((i5 + 1) & 15)) {
                dkhVar.seek();
            }
        }
        if (z) {
            int unsignedByte = this.f14009g.readUnsignedByte();
            i2 |= (this.f14009g.readUnsignedByte() & 64) != 0 ? 2 : 0;
            this.f14009g.skipBytes(unsignedByte - 1);
        }
        boolean z2 = this.f14019q;
        if (shouldConsumePacketPayload(i3)) {
            this.f14009g.setLimit(iFindEndOfFirstTsPacketInBuffer);
            dkhVar.consume(this.f14009g, i2);
            this.f14009g.setLimit(iLimit);
        }
        if (this.f14006d != 2 && !z2 && this.f14019q && length != -1) {
            this.f14021s = true;
        }
        this.f14009g.setPosition(iFindEndOfFirstTsPacketInBuffer);
        return 0;
    }

    @Override // p000.yj5
    public void release() {
    }

    @Override // p000.yj5
    public void seek(long j, long j2) {
        ujh ujhVar;
        u80.checkState(this.f14006d != 2);
        int size = this.f14008f.size();
        for (int i = 0; i < size; i++) {
            g2h g2hVar = this.f14008f.get(i);
            boolean z = g2hVar.getTimestampOffsetUs() == -9223372036854775807L;
            if (!z) {
                long firstSampleTimestampUs = g2hVar.getFirstSampleTimestampUs();
                z = (firstSampleTimestampUs == -9223372036854775807L || firstSampleTimestampUs == 0 || firstSampleTimestampUs == j2) ? false : true;
            }
            if (z) {
                g2hVar.reset(j2);
            }
        }
        if (j2 != 0 && (ujhVar = this.f14016n) != null) {
            ujhVar.setSeekTargetUs(j2);
        }
        this.f14009g.reset(0);
        this.f14010h.clear();
        for (int i2 = 0; i2 < this.f14012j.size(); i2++) {
            this.f14012j.valueAt(i2).seek();
        }
        this.f14023u = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // p000.yj5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean sniff(p000.zj5 r7) throws java.io.IOException {
        /*
            r6 = this;
            ihc r0 = r6.f14009g
            byte[] r0 = r0.getData()
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.peekFully(r0, r2, r1)
            r1 = r2
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L29
            r3 = r2
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r1 = r1 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.skipFully(r1)
            r7 = 1
            return r7
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bkh.sniff(zj5):boolean");
    }

    public bkh(int i) {
        this(1, i, 112800);
    }

    public bkh(int i, int i2, int i3) {
        this(i, new g2h(0L), new m24(i2), i3);
    }

    public bkh(int i, g2h g2hVar, dkh.InterfaceC4836c interfaceC4836c) {
        this(i, g2hVar, interfaceC4836c, 112800);
    }

    public bkh(int i, g2h g2hVar, dkh.InterfaceC4836c interfaceC4836c, int i2) {
        this.f14011i = (dkh.InterfaceC4836c) u80.checkNotNull(interfaceC4836c);
        this.f14007e = i2;
        this.f14006d = i;
        if (i != 1 && i != 2) {
            ArrayList arrayList = new ArrayList();
            this.f14008f = arrayList;
            arrayList.add(g2hVar);
        } else {
            this.f14008f = Collections.singletonList(g2hVar);
        }
        this.f14009g = new ihc(new byte[9400], 0);
        this.f14013k = new SparseBooleanArray();
        this.f14014l = new SparseBooleanArray();
        this.f14012j = new SparseArray<>();
        this.f14010h = new SparseIntArray();
        this.f14015m = new vjh(i2);
        this.f14017o = ck5.f16800x;
        this.f14024v = -1;
        resetPayloadReaders();
    }
}

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
import p000.ckh;
import p000.gue;
import p000.peg;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class akh implements xj5 {

    /* JADX INFO: renamed from: A */
    public static final int f1850A = 2;

    /* JADX INFO: renamed from: B */
    public static final int f1851B = 1;

    /* JADX INFO: renamed from: C */
    @Deprecated
    public static final ik5 f1852C = new ik5() { // from class: zjh
        @Override // p000.ik5
        public final xj5[] createExtractors() {
            return akh.lambda$static$1();
        }
    };

    /* JADX INFO: renamed from: D */
    public static final int f1853D = 188;

    /* JADX INFO: renamed from: E */
    public static final int f1854E = 112800;

    /* JADX INFO: renamed from: F */
    public static final int f1855F = 3;

    /* JADX INFO: renamed from: G */
    public static final int f1856G = 4;

    /* JADX INFO: renamed from: H */
    public static final int f1857H = 15;

    /* JADX INFO: renamed from: I */
    public static final int f1858I = 17;

    /* JADX INFO: renamed from: J */
    public static final int f1859J = 129;

    /* JADX INFO: renamed from: K */
    public static final int f1860K = 138;

    /* JADX INFO: renamed from: L */
    public static final int f1861L = 130;

    /* JADX INFO: renamed from: M */
    public static final int f1862M = 135;

    /* JADX INFO: renamed from: N */
    public static final int f1863N = 172;

    /* JADX INFO: renamed from: O */
    public static final int f1864O = 2;

    /* JADX INFO: renamed from: P */
    public static final int f1865P = 16;

    /* JADX INFO: renamed from: Q */
    public static final int f1866Q = 27;

    /* JADX INFO: renamed from: R */
    public static final int f1867R = 36;

    /* JADX INFO: renamed from: S */
    public static final int f1868S = 45;

    /* JADX INFO: renamed from: T */
    public static final int f1869T = 21;

    /* JADX INFO: renamed from: U */
    public static final int f1870U = 134;

    /* JADX INFO: renamed from: V */
    public static final int f1871V = 89;

    /* JADX INFO: renamed from: W */
    public static final int f1872W = 136;

    /* JADX INFO: renamed from: X */
    public static final int f1873X = 139;

    /* JADX INFO: renamed from: Y */
    public static final int f1874Y = 128;

    /* JADX INFO: renamed from: Z */
    public static final int f1875Z = 257;

    /* JADX INFO: renamed from: a0 */
    public static final int f1876a0 = 71;

    /* JADX INFO: renamed from: b0 */
    public static final int f1877b0 = 0;

    /* JADX INFO: renamed from: c0 */
    public static final int f1878c0 = 8192;

    /* JADX INFO: renamed from: d0 */
    public static final long f1879d0 = 1094921523;

    /* JADX INFO: renamed from: e0 */
    public static final long f1880e0 = 1161904947;

    /* JADX INFO: renamed from: f0 */
    public static final long f1881f0 = 1094921524;

    /* JADX INFO: renamed from: g0 */
    public static final long f1882g0 = 1212503619;

    /* JADX INFO: renamed from: h0 */
    public static final int f1883h0 = 9400;

    /* JADX INFO: renamed from: i0 */
    public static final int f1884i0 = 5;

    /* JADX INFO: renamed from: y */
    public static final int f1885y = 0;

    /* JADX INFO: renamed from: z */
    public static final int f1886z = 1;

    /* JADX INFO: renamed from: d */
    public final int f1887d;

    /* JADX INFO: renamed from: e */
    public final int f1888e;

    /* JADX INFO: renamed from: f */
    public final int f1889f;

    /* JADX INFO: renamed from: g */
    public final List<h2h> f1890g;

    /* JADX INFO: renamed from: h */
    public final jhc f1891h;

    /* JADX INFO: renamed from: i */
    public final SparseIntArray f1892i;

    /* JADX INFO: renamed from: j */
    public final ckh.InterfaceC2370c f1893j;

    /* JADX INFO: renamed from: k */
    public final peg.InterfaceC10936a f1894k;

    /* JADX INFO: renamed from: l */
    public final SparseArray<ckh> f1895l;

    /* JADX INFO: renamed from: m */
    public final SparseBooleanArray f1896m;

    /* JADX INFO: renamed from: n */
    public final SparseBooleanArray f1897n;

    /* JADX INFO: renamed from: o */
    public final wjh f1898o;

    /* JADX INFO: renamed from: p */
    public tjh f1899p;

    /* JADX INFO: renamed from: q */
    public bk5 f1900q;

    /* JADX INFO: renamed from: r */
    public int f1901r;

    /* JADX INFO: renamed from: s */
    public boolean f1902s;

    /* JADX INFO: renamed from: t */
    public boolean f1903t;

    /* JADX INFO: renamed from: u */
    public boolean f1904u;

    /* JADX INFO: renamed from: v */
    @hib
    public ckh f1905v;

    /* JADX INFO: renamed from: w */
    public int f1906w;

    /* JADX INFO: renamed from: x */
    public int f1907x;

    /* JADX INFO: renamed from: akh$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0300a {
    }

    /* JADX INFO: renamed from: akh$b */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0301b {
    }

    /* JADX INFO: renamed from: akh$c */
    public class C0302c implements vte {

        /* JADX INFO: renamed from: a */
        public final hhc f1908a = new hhc(new byte[4]);

        public C0302c() {
        }

        @Override // p000.vte
        public void consume(jhc jhcVar) {
            if (jhcVar.readUnsignedByte() == 0 && (jhcVar.readUnsignedByte() & 128) != 0) {
                jhcVar.skipBytes(6);
                int iBytesLeft = jhcVar.bytesLeft() / 4;
                for (int i = 0; i < iBytesLeft; i++) {
                    jhcVar.readBytes(this.f1908a, 4);
                    int bits = this.f1908a.readBits(16);
                    this.f1908a.skipBits(3);
                    if (bits == 0) {
                        this.f1908a.skipBits(13);
                    } else {
                        int bits2 = this.f1908a.readBits(13);
                        if (akh.this.f1895l.get(bits2) == null) {
                            akh.this.f1895l.put(bits2, new xte(akh.this.new C0303d(bits2)));
                            akh.m859h(akh.this);
                        }
                    }
                }
                if (akh.this.f1887d != 2) {
                    akh.this.f1895l.remove(0);
                }
            }
        }

        @Override // p000.vte
        public void init(h2h h2hVar, bk5 bk5Var, ckh.C2372e c2372e) {
        }
    }

    /* JADX INFO: renamed from: akh$d */
    public class C0303d implements vte {

        /* JADX INFO: renamed from: f */
        public static final int f1910f = 5;

        /* JADX INFO: renamed from: g */
        public static final int f1911g = 10;

        /* JADX INFO: renamed from: h */
        public static final int f1912h = 106;

        /* JADX INFO: renamed from: i */
        public static final int f1913i = 111;

        /* JADX INFO: renamed from: j */
        public static final int f1914j = 122;

        /* JADX INFO: renamed from: k */
        public static final int f1915k = 123;

        /* JADX INFO: renamed from: l */
        public static final int f1916l = 127;

        /* JADX INFO: renamed from: m */
        public static final int f1917m = 89;

        /* JADX INFO: renamed from: n */
        public static final int f1918n = 21;

        /* JADX INFO: renamed from: o */
        public static final int f1919o = 14;

        /* JADX INFO: renamed from: p */
        public static final int f1920p = 33;

        /* JADX INFO: renamed from: a */
        public final hhc f1921a = new hhc(new byte[5]);

        /* JADX INFO: renamed from: b */
        public final SparseArray<ckh> f1922b = new SparseArray<>();

        /* JADX INFO: renamed from: c */
        public final SparseIntArray f1923c = new SparseIntArray();

        /* JADX INFO: renamed from: d */
        public final int f1924d;

        public C0303d(int i) {
            this.f1924d = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private p000.ckh.C2369b readEsInfo(p000.jhc r17, int r18) {
            /*
                Method dump skipped, instruction units count: 236
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.akh.C0303d.readEsInfo(jhc, int):ckh$b");
        }

        @Override // p000.vte
        public void consume(jhc jhcVar) {
            h2h h2hVar;
            if (jhcVar.readUnsignedByte() != 2) {
                return;
            }
            if (akh.this.f1887d == 1 || akh.this.f1887d == 2 || akh.this.f1901r == 1) {
                h2hVar = (h2h) akh.this.f1890g.get(0);
            } else {
                h2hVar = new h2h(((h2h) akh.this.f1890g.get(0)).getFirstSampleTimestampUs());
                akh.this.f1890g.add(h2hVar);
            }
            if ((jhcVar.readUnsignedByte() & 128) == 0) {
                return;
            }
            jhcVar.skipBytes(1);
            int unsignedShort = jhcVar.readUnsignedShort();
            int i = 3;
            jhcVar.skipBytes(3);
            jhcVar.readBytes(this.f1921a, 2);
            this.f1921a.skipBits(3);
            int i2 = 13;
            akh.this.f1907x = this.f1921a.readBits(13);
            jhcVar.readBytes(this.f1921a, 2);
            int i3 = 4;
            this.f1921a.skipBits(4);
            jhcVar.skipBytes(this.f1921a.readBits(12));
            if (akh.this.f1887d == 2 && akh.this.f1905v == null) {
                ckh.C2369b c2369b = new ckh.C2369b(21, null, 0, null, t0i.f83321f);
                akh akhVar = akh.this;
                akhVar.f1905v = akhVar.f1893j.createPayloadReader(21, c2369b);
                if (akh.this.f1905v != null) {
                    akh.this.f1905v.init(h2hVar, akh.this.f1900q, new ckh.C2372e(unsignedShort, 21, 8192));
                }
            }
            this.f1922b.clear();
            this.f1923c.clear();
            int iBytesLeft = jhcVar.bytesLeft();
            while (iBytesLeft > 0) {
                jhcVar.readBytes(this.f1921a, 5);
                int bits = this.f1921a.readBits(8);
                this.f1921a.skipBits(i);
                int bits2 = this.f1921a.readBits(i2);
                this.f1921a.skipBits(i3);
                int bits3 = this.f1921a.readBits(12);
                ckh.C2369b esInfo = readEsInfo(jhcVar, bits3);
                if (bits == 6 || bits == 5) {
                    bits = esInfo.f16845a;
                }
                iBytesLeft -= bits3 + 5;
                int i4 = akh.this.f1887d == 2 ? bits : bits2;
                if (!akh.this.f1896m.get(i4)) {
                    ckh ckhVarCreatePayloadReader = (akh.this.f1887d == 2 && bits == 21) ? akh.this.f1905v : akh.this.f1893j.createPayloadReader(bits, esInfo);
                    if (akh.this.f1887d != 2 || bits2 < this.f1923c.get(i4, 8192)) {
                        this.f1923c.put(i4, bits2);
                        this.f1922b.put(i4, ckhVarCreatePayloadReader);
                    }
                }
                i = 3;
                i3 = 4;
                i2 = 13;
            }
            int size = this.f1923c.size();
            for (int i5 = 0; i5 < size; i5++) {
                int iKeyAt = this.f1923c.keyAt(i5);
                int iValueAt = this.f1923c.valueAt(i5);
                akh.this.f1896m.put(iKeyAt, true);
                akh.this.f1897n.put(iValueAt, true);
                ckh ckhVarValueAt = this.f1922b.valueAt(i5);
                if (ckhVarValueAt != null) {
                    if (ckhVarValueAt != akh.this.f1905v) {
                        ckhVarValueAt.init(h2hVar, akh.this.f1900q, new ckh.C2372e(unsignedShort, iKeyAt, 8192));
                    }
                    akh.this.f1895l.put(iValueAt, ckhVarValueAt);
                }
            }
            if (akh.this.f1887d == 2) {
                if (akh.this.f1902s) {
                    return;
                }
                akh.this.f1900q.endTracks();
                akh.this.f1901r = 0;
                akh.this.f1902s = true;
                return;
            }
            akh.this.f1895l.remove(this.f1924d);
            akh akhVar2 = akh.this;
            akhVar2.f1901r = akhVar2.f1887d == 1 ? 0 : akh.this.f1901r - 1;
            if (akh.this.f1901r == 0) {
                akh.this.f1900q.endTracks();
                akh.this.f1902s = true;
            }
        }

        @Override // p000.vte
        public void init(h2h h2hVar, bk5 bk5Var, ckh.C2372e c2372e) {
        }
    }

    @Deprecated
    public akh() {
        this(1, 1, peg.InterfaceC10936a.f70575a, new h2h(0L), new l24(0), 112800);
    }

    private boolean fillBufferWithAtLeastOnePacket(ak5 ak5Var) throws IOException {
        byte[] data = this.f1891h.getData();
        if (9400 - this.f1891h.getPosition() < 188) {
            int iBytesLeft = this.f1891h.bytesLeft();
            if (iBytesLeft > 0) {
                System.arraycopy(data, this.f1891h.getPosition(), data, 0, iBytesLeft);
            }
            this.f1891h.reset(data, iBytesLeft);
        }
        while (this.f1891h.bytesLeft() < 188) {
            int iLimit = this.f1891h.limit();
            int i = ak5Var.read(data, iLimit, 9400 - iLimit);
            if (i == -1) {
                return false;
            }
            this.f1891h.setLimit(iLimit + i);
        }
        return true;
    }

    private int findEndOfFirstTsPacketInBuffer() throws yhc {
        int position = this.f1891h.getPosition();
        int iLimit = this.f1891h.limit();
        int iFindSyncBytePosition = fkh.findSyncBytePosition(this.f1891h.getData(), position, iLimit);
        this.f1891h.setPosition(iFindSyncBytePosition);
        int i = iFindSyncBytePosition + 188;
        if (i > iLimit) {
            int i2 = this.f1906w + (iFindSyncBytePosition - position);
            this.f1906w = i2;
            if (this.f1887d == 2 && i2 > 376) {
                throw yhc.createForMalformedContainer("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f1906w = 0;
        }
        return i;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m859h(akh akhVar) {
        int i = akhVar.f1901r;
        akhVar.f1901r = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ xj5[] lambda$newFactory$0(peg.InterfaceC10936a interfaceC10936a) {
        return new xj5[]{new akh(interfaceC10936a)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ xj5[] lambda$static$1() {
        return new xj5[]{new akh(1, peg.InterfaceC10936a.f70575a)};
    }

    private void maybeOutputSeekMap(long j) {
        if (this.f1903t) {
            return;
        }
        this.f1903t = true;
        if (this.f1898o.getDurationUs() == -9223372036854775807L) {
            this.f1900q.seekMap(new gue.C6549b(this.f1898o.getDurationUs()));
            return;
        }
        tjh tjhVar = new tjh(this.f1898o.getPcrTimestampAdjuster(), this.f1898o.getDurationUs(), j, this.f1907x, this.f1889f);
        this.f1899p = tjhVar;
        this.f1900q.seekMap(tjhVar.getSeekMap());
    }

    public static ik5 newFactory(final peg.InterfaceC10936a interfaceC10936a) {
        return new ik5() { // from class: yjh
            @Override // p000.ik5
            public final xj5[] createExtractors() {
                return akh.lambda$newFactory$0(interfaceC10936a);
            }
        };
    }

    private void resetPayloadReaders() {
        this.f1896m.clear();
        this.f1895l.clear();
        SparseArray<ckh> sparseArrayCreateInitialPayloadReaders = this.f1893j.createInitialPayloadReaders();
        int size = sparseArrayCreateInitialPayloadReaders.size();
        for (int i = 0; i < size; i++) {
            this.f1895l.put(sparseArrayCreateInitialPayloadReaders.keyAt(i), sparseArrayCreateInitialPayloadReaders.valueAt(i));
        }
        this.f1895l.put(0, new xte(new C0302c()));
        this.f1905v = null;
    }

    private boolean shouldConsumePacketPayload(int i) {
        return this.f1887d == 2 || this.f1902s || !this.f1897n.get(i, false);
    }

    @Override // p000.xj5
    public void init(bk5 bk5Var) {
        if ((this.f1888e & 1) == 0) {
            bk5Var = new reg(bk5Var, this.f1894k);
        }
        this.f1900q = bk5Var;
    }

    @Override // p000.xj5
    public int read(ak5 ak5Var, d5d d5dVar) throws IOException {
        long length = ak5Var.getLength();
        boolean z = this.f1887d == 2;
        if (this.f1902s) {
            if (length != -1 && !z && !this.f1898o.isDurationReadFinished()) {
                return this.f1898o.readDuration(ak5Var, d5dVar, this.f1907x);
            }
            maybeOutputSeekMap(length);
            if (this.f1904u) {
                this.f1904u = false;
                seek(0L, 0L);
                if (ak5Var.getPosition() != 0) {
                    d5dVar.f28476a = 0L;
                    return 1;
                }
            }
            tjh tjhVar = this.f1899p;
            if (tjhVar != null && tjhVar.isSeeking()) {
                return this.f1899p.handlePendingSeek(ak5Var, d5dVar);
            }
        }
        if (!fillBufferWithAtLeastOnePacket(ak5Var)) {
            for (int i = 0; i < this.f1895l.size(); i++) {
                ckh ckhVarValueAt = this.f1895l.valueAt(i);
                if (ckhVarValueAt instanceof rsc) {
                    rsc rscVar = (rsc) ckhVarValueAt;
                    if (rscVar.canConsumeSynthesizedEmptyPusi(z)) {
                        rscVar.consume(new jhc(), 1);
                    }
                }
            }
            return -1;
        }
        int iFindEndOfFirstTsPacketInBuffer = findEndOfFirstTsPacketInBuffer();
        int iLimit = this.f1891h.limit();
        if (iFindEndOfFirstTsPacketInBuffer > iLimit) {
            return 0;
        }
        int i2 = this.f1891h.readInt();
        if ((8388608 & i2) != 0) {
            this.f1891h.setPosition(iFindEndOfFirstTsPacketInBuffer);
            return 0;
        }
        int i3 = (4194304 & i2) != 0 ? 1 : 0;
        int i4 = (2096896 & i2) >> 8;
        boolean z2 = (i2 & 32) != 0;
        ckh ckhVar = (i2 & 16) != 0 ? this.f1895l.get(i4) : null;
        if (ckhVar == null) {
            this.f1891h.setPosition(iFindEndOfFirstTsPacketInBuffer);
            return 0;
        }
        if (this.f1887d != 2) {
            int i5 = i2 & 15;
            int i6 = this.f1892i.get(i4, i5 - 1);
            this.f1892i.put(i4, i5);
            if (i6 == i5) {
                this.f1891h.setPosition(iFindEndOfFirstTsPacketInBuffer);
                return 0;
            }
            if (i5 != ((i6 + 1) & 15)) {
                ckhVar.seek();
            }
        }
        if (z2) {
            int unsignedByte = this.f1891h.readUnsignedByte();
            i3 |= (this.f1891h.readUnsignedByte() & 64) != 0 ? 2 : 0;
            this.f1891h.skipBytes(unsignedByte - 1);
        }
        boolean z3 = this.f1902s;
        if (shouldConsumePacketPayload(i4)) {
            this.f1891h.setLimit(iFindEndOfFirstTsPacketInBuffer);
            ckhVar.consume(this.f1891h, i3);
            this.f1891h.setLimit(iLimit);
        }
        if (this.f1887d != 2 && !z3 && this.f1902s && length != -1) {
            this.f1904u = true;
        }
        this.f1891h.setPosition(iFindEndOfFirstTsPacketInBuffer);
        return 0;
    }

    @Override // p000.xj5
    public void release() {
    }

    @Override // p000.xj5
    public void seek(long j, long j2) {
        tjh tjhVar;
        v80.checkState(this.f1887d != 2);
        int size = this.f1890g.size();
        for (int i = 0; i < size; i++) {
            h2h h2hVar = this.f1890g.get(i);
            boolean z = h2hVar.getTimestampOffsetUs() == -9223372036854775807L;
            if (!z) {
                long firstSampleTimestampUs = h2hVar.getFirstSampleTimestampUs();
                z = (firstSampleTimestampUs == -9223372036854775807L || firstSampleTimestampUs == 0 || firstSampleTimestampUs == j2) ? false : true;
            }
            if (z) {
                h2hVar.reset(j2);
            }
        }
        if (j2 != 0 && (tjhVar = this.f1899p) != null) {
            tjhVar.setSeekTargetUs(j2);
        }
        this.f1891h.reset(0);
        this.f1892i.clear();
        for (int i2 = 0; i2 < this.f1895l.size(); i2++) {
            this.f1895l.valueAt(i2).seek();
        }
        this.f1906w = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // p000.xj5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean sniff(p000.ak5 r7) throws java.io.IOException {
        /*
            r6 = this;
            jhc r0 = r6.f1891h
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
        throw new UnsupportedOperationException("Method not decompiled: p000.akh.sniff(ak5):boolean");
    }

    public akh(peg.InterfaceC10936a interfaceC10936a) {
        this(1, 0, interfaceC10936a, new h2h(0L), new l24(0), 112800);
    }

    public akh(int i, peg.InterfaceC10936a interfaceC10936a) {
        this(1, i, interfaceC10936a, new h2h(0L), new l24(0), 112800);
    }

    @Deprecated
    public akh(int i) {
        this(1, 1, peg.InterfaceC10936a.f70575a, new h2h(0L), new l24(i), 112800);
    }

    @Deprecated
    public akh(int i, int i2, int i3) {
        this(i, 1, peg.InterfaceC10936a.f70575a, new h2h(0L), new l24(i2), i3);
    }

    @Deprecated
    public akh(int i, h2h h2hVar, ckh.InterfaceC2370c interfaceC2370c) {
        this(i, 1, peg.InterfaceC10936a.f70575a, h2hVar, interfaceC2370c, 112800);
    }

    @Deprecated
    public akh(int i, h2h h2hVar, ckh.InterfaceC2370c interfaceC2370c, int i2) {
        this(i, 1, peg.InterfaceC10936a.f70575a, h2hVar, interfaceC2370c, i2);
    }

    public akh(int i, int i2, peg.InterfaceC10936a interfaceC10936a, h2h h2hVar, ckh.InterfaceC2370c interfaceC2370c, int i3) {
        this.f1893j = (ckh.InterfaceC2370c) v80.checkNotNull(interfaceC2370c);
        this.f1889f = i3;
        this.f1887d = i;
        this.f1888e = i2;
        this.f1894k = interfaceC10936a;
        if (i != 1 && i != 2) {
            ArrayList arrayList = new ArrayList();
            this.f1890g = arrayList;
            arrayList.add(h2hVar);
        } else {
            this.f1890g = Collections.singletonList(h2hVar);
        }
        this.f1891h = new jhc(new byte[9400], 0);
        this.f1896m = new SparseBooleanArray();
        this.f1897n = new SparseBooleanArray();
        this.f1895l = new SparseArray<>();
        this.f1892i = new SparseIntArray();
        this.f1898o = new wjh(i3);
        this.f1900q = bk5.f13929y;
        this.f1907x = -1;
        resetPayloadReaders();
    }
}

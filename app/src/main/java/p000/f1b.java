package p000;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import p000.hue;
import p000.ib0;
import p000.jb0;
import p000.kq6;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class f1b implements yj5, hue {

    /* JADX INFO: renamed from: B */
    public static final hk5 f34667B = new hk5() { // from class: b1b
        @Override // p000.hk5
        public final yj5[] createExtractors() {
            return f1b.lambda$static$0();
        }
    };

    /* JADX INFO: renamed from: C */
    public static final int f34668C = 1;

    /* JADX INFO: renamed from: D */
    public static final int f34669D = 2;

    /* JADX INFO: renamed from: E */
    public static final int f34670E = 4;

    /* JADX INFO: renamed from: F */
    public static final int f34671F = 0;

    /* JADX INFO: renamed from: G */
    public static final int f34672G = 1;

    /* JADX INFO: renamed from: H */
    public static final int f34673H = 2;

    /* JADX INFO: renamed from: I */
    public static final int f34674I = 3;

    /* JADX INFO: renamed from: J */
    public static final int f34675J = 0;

    /* JADX INFO: renamed from: K */
    public static final int f34676K = 1;

    /* JADX INFO: renamed from: L */
    public static final int f34677L = 2;

    /* JADX INFO: renamed from: M */
    public static final long f34678M = 262144;

    /* JADX INFO: renamed from: N */
    public static final long f34679N = 10485760;

    /* JADX INFO: renamed from: A */
    @hib
    public MotionPhotoMetadata f34680A;

    /* JADX INFO: renamed from: d */
    public final int f34681d;

    /* JADX INFO: renamed from: e */
    public final ihc f34682e;

    /* JADX INFO: renamed from: f */
    public final ihc f34683f;

    /* JADX INFO: renamed from: g */
    public final ihc f34684g;

    /* JADX INFO: renamed from: h */
    public final ihc f34685h;

    /* JADX INFO: renamed from: i */
    public final ArrayDeque<ib0.C7222a> f34686i;

    /* JADX INFO: renamed from: j */
    public final que f34687j;

    /* JADX INFO: renamed from: k */
    public final List<Metadata.Entry> f34688k;

    /* JADX INFO: renamed from: l */
    public int f34689l;

    /* JADX INFO: renamed from: m */
    public int f34690m;

    /* JADX INFO: renamed from: n */
    public long f34691n;

    /* JADX INFO: renamed from: o */
    public int f34692o;

    /* JADX INFO: renamed from: p */
    @hib
    public ihc f34693p;

    /* JADX INFO: renamed from: q */
    public int f34694q;

    /* JADX INFO: renamed from: r */
    public int f34695r;

    /* JADX INFO: renamed from: s */
    public int f34696s;

    /* JADX INFO: renamed from: t */
    public int f34697t;

    /* JADX INFO: renamed from: u */
    public ck5 f34698u;

    /* JADX INFO: renamed from: v */
    public C5542b[] f34699v;

    /* JADX INFO: renamed from: w */
    public long[][] f34700w;

    /* JADX INFO: renamed from: x */
    public int f34701x;

    /* JADX INFO: renamed from: y */
    public long f34702y;

    /* JADX INFO: renamed from: z */
    public int f34703z;

    /* JADX INFO: renamed from: f1b$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC5541a {
    }

    /* JADX INFO: renamed from: f1b$b */
    public static final class C5542b {

        /* JADX INFO: renamed from: a */
        public final z5h f34704a;

        /* JADX INFO: renamed from: b */
        public final s6h f34705b;

        /* JADX INFO: renamed from: c */
        public final r6h f34706c;

        /* JADX INFO: renamed from: d */
        @hib
        public final gjh f34707d;

        /* JADX INFO: renamed from: e */
        public int f34708e;

        public C5542b(z5h z5hVar, s6h s6hVar, r6h r6hVar) {
            this.f34704a = z5hVar;
            this.f34705b = s6hVar;
            this.f34706c = r6hVar;
            this.f34707d = "audio/true-hd".equals(z5hVar.f104268f.f54989M) ? new gjh() : null;
        }
    }

    public f1b() {
        this(0);
    }

    private static int brandToFileType(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static long[][] calculateAccumulatedSampleSizes(C5542b[] c5542bArr) {
        long[][] jArr = new long[c5542bArr.length][];
        int[] iArr = new int[c5542bArr.length];
        long[] jArr2 = new long[c5542bArr.length];
        boolean[] zArr = new boolean[c5542bArr.length];
        for (int i = 0; i < c5542bArr.length; i++) {
            jArr[i] = new long[c5542bArr[i].f34705b.f80851b];
            jArr2[i] = c5542bArr[i].f34705b.f80855f[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < c5542bArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < c5542bArr.length; i4++) {
                if (!zArr[i4]) {
                    long j3 = jArr2[i4];
                    if (j3 <= j2) {
                        i3 = i4;
                        j2 = j3;
                    }
                }
            }
            int i5 = iArr[i3];
            long[] jArr3 = jArr[i3];
            jArr3[i5] = j;
            s6h s6hVar = c5542bArr[i3].f34705b;
            j += (long) s6hVar.f80853d[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr3.length) {
                jArr2[i3] = s6hVar.f80855f[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    private void enterReadingAtomHeaderState() {
        this.f34689l = 0;
        this.f34692o = 0;
    }

    private static int getSynchronizationSampleIndex(s6h s6hVar, long j) {
        int indexOfEarlierOrEqualSynchronizationSample = s6hVar.getIndexOfEarlierOrEqualSynchronizationSample(j);
        return indexOfEarlierOrEqualSynchronizationSample == -1 ? s6hVar.getIndexOfLaterOrEqualSynchronizationSample(j) : indexOfEarlierOrEqualSynchronizationSample;
    }

    private int getTrackIndexOfNextReadSample(long j) {
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        while (true) {
            C5542b[] c5542bArr = this.f34699v;
            if (i3 >= c5542bArr.length) {
                break;
            }
            C5542b c5542b = c5542bArr[i3];
            int i4 = c5542b.f34708e;
            s6h s6hVar = c5542b.f34705b;
            if (i4 != s6hVar.f80851b) {
                long j5 = s6hVar.f80852c[i4];
                long j6 = ((long[][]) x0i.castNonNull(this.f34700w))[i3][i4];
                long j7 = j5 - j;
                boolean z3 = j7 < 0 || j7 >= 262144;
                if ((!z3 && z2) || (z3 == z2 && j7 < j4)) {
                    z2 = z3;
                    j4 = j7;
                    i2 = i3;
                    j3 = j6;
                }
                if (j6 < j2) {
                    z = z3;
                    i = i3;
                    j2 = j6;
                }
            }
            i3++;
        }
        return (j2 == Long.MAX_VALUE || !z || j3 < j2 + 10485760) ? i2 : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ z5h lambda$processMoovAtom$1(z5h z5hVar) {
        return z5hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ yj5[] lambda$static$0() {
        return new yj5[]{new f1b()};
    }

    private static long maybeAdjustSeekOffset(s6h s6hVar, long j, long j2) {
        int synchronizationSampleIndex = getSynchronizationSampleIndex(s6hVar, j);
        return synchronizationSampleIndex == -1 ? j2 : Math.min(s6hVar.f80852c[synchronizationSampleIndex], j2);
    }

    private void maybeSkipRemainingMetaAtomHeaderBytes(zj5 zj5Var) throws IOException {
        this.f34684g.reset(8);
        zj5Var.peekFully(this.f34684g.getData(), 0, 8);
        jb0.maybeSkipRemainingMetaAtomHeaderBytes(this.f34684g);
        zj5Var.skipFully(this.f34684g.getPosition());
        zj5Var.resetPeekPosition();
    }

    private void processAtomEnded(long j) throws xhc {
        while (!this.f34686i.isEmpty() && this.f34686i.peek().f46424E1 == j) {
            ib0.C7222a c7222aPop = this.f34686i.pop();
            if (c7222aPop.f46423a == 1836019574) {
                processMoovAtom(c7222aPop);
                this.f34686i.clear();
                this.f34689l = 2;
            } else if (!this.f34686i.isEmpty()) {
                this.f34686i.peek().add(c7222aPop);
            }
        }
        if (this.f34689l != 2) {
            enterReadingAtomHeaderState();
        }
    }

    private void processEndOfStreamReadingAtomHeader() {
        if (this.f34703z != 2 || (this.f34681d & 2) == 0) {
            return;
        }
        this.f34698u.track(0, 4).format(new kq6.C8497b().setMetadata(this.f34680A == null ? null : new Metadata(this.f34680A)).build());
        this.f34698u.endTracks();
        this.f34698u.seekMap(new hue.C7024b(-9223372036854775807L));
    }

    private static int processFtypAtom(ihc ihcVar) {
        ihcVar.setPosition(8);
        int iBrandToFileType = brandToFileType(ihcVar.readInt());
        if (iBrandToFileType != 0) {
            return iBrandToFileType;
        }
        ihcVar.skipBytes(4);
        while (ihcVar.bytesLeft() > 0) {
            int iBrandToFileType2 = brandToFileType(ihcVar.readInt());
            if (iBrandToFileType2 != 0) {
                return iBrandToFileType2;
            }
        }
        return 0;
    }

    private void processMoovAtom(ib0.C7222a c7222a) throws xhc {
        Metadata metadata;
        Metadata metadata2;
        Metadata metadata3;
        List<s6h> list;
        int i;
        n27 n27Var;
        Metadata metadata4;
        Metadata metadata5;
        ArrayList arrayList = new ArrayList();
        boolean z = this.f34703z == 1;
        n27 n27Var2 = new n27();
        ib0.C7223b leafAtomOfType = c7222a.getLeafAtomOfType(1969517665);
        if (leafAtomOfType != null) {
            jb0.C7837i udta = jb0.parseUdta(leafAtomOfType);
            Metadata metadata6 = udta.f50190a;
            Metadata metadata7 = udta.f50191b;
            Metadata metadata8 = udta.f50192c;
            if (metadata6 != null) {
                n27Var2.setFromMetadata(metadata6);
            }
            metadata2 = metadata8;
            metadata3 = metadata6;
            metadata = metadata7;
        } else {
            metadata = null;
            metadata2 = null;
            metadata3 = null;
        }
        ib0.C7222a containerAtomOfType = c7222a.getContainerAtomOfType(1835365473);
        Metadata mdtaFromMeta = containerAtomOfType != null ? jb0.parseMdtaFromMeta(containerAtomOfType) : null;
        Metadata metadata9 = jb0.parseMvhd(((ib0.C7223b) u80.checkNotNull(c7222a.getLeafAtomOfType(1836476516))).f46427E1).f50172a;
        Metadata metadata10 = mdtaFromMeta;
        Metadata metadata11 = metadata;
        List<s6h> traks = jb0.parseTraks(c7222a, n27Var2, -9223372036854775807L, null, (this.f34681d & 1) != 0, z, new lz6() { // from class: z0b
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return f1b.lambda$processMoovAtom$1((z5h) obj);
            }
        });
        int size = traks.size();
        long j = -9223372036854775807L;
        n27 n27Var3 = n27Var2;
        int i2 = 0;
        int size2 = -1;
        long j2 = -9223372036854775807L;
        while (i2 < size) {
            s6h s6hVar = traks.get(i2);
            if (s6hVar.f80851b == 0) {
                list = traks;
                i = size;
                n27Var = n27Var3;
                metadata5 = metadata11;
            } else {
                z5h z5hVar = s6hVar.f80850a;
                list = traks;
                i = size;
                long j3 = z5hVar.f104267e;
                if (j3 == j) {
                    j3 = s6hVar.f80857h;
                }
                long jMax = Math.max(j2, j3);
                C5542b c5542b = new C5542b(z5hVar, s6hVar, this.f34698u.track(i2, z5hVar.f104264b));
                int i3 = "audio/true-hd".equals(z5hVar.f104268f.f54989M) ? s6hVar.f80854e * 16 : s6hVar.f80854e + 30;
                kq6.C8497b c8497bBuildUpon = z5hVar.f104268f.buildUpon();
                c8497bBuildUpon.setMaxInputSize(i3);
                if (z5hVar.f104264b == 2 && j3 > 0) {
                    int i4 = s6hVar.f80851b;
                    if (i4 > 1) {
                        c8497bBuildUpon.setFrameRate(i4 / (j3 / 1000000.0f));
                    }
                }
                n27Var = n27Var3;
                lua.setFormatGaplessInfo(z5hVar.f104264b, n27Var, c8497bBuildUpon);
                int i5 = z5hVar.f104264b;
                if (this.f34688k.isEmpty()) {
                    metadata5 = metadata11;
                    metadata4 = null;
                } else {
                    metadata4 = new Metadata(this.f34688k);
                    metadata5 = metadata11;
                }
                lua.setFormatMetadata(i5, metadata3, metadata10, c8497bBuildUpon, metadata5, metadata4, metadata2, metadata9);
                c5542b.f34706c.format(c8497bBuildUpon.build());
                if (z5hVar.f104264b == 2 && size2 == -1) {
                    size2 = arrayList.size();
                }
                arrayList.add(c5542b);
                j2 = jMax;
            }
            i2++;
            n27Var3 = n27Var;
            metadata11 = metadata5;
            traks = list;
            size = i;
            j = -9223372036854775807L;
        }
        this.f34701x = size2;
        this.f34702y = j2;
        C5542b[] c5542bArr = (C5542b[]) arrayList.toArray(new C5542b[0]);
        this.f34699v = c5542bArr;
        this.f34700w = calculateAccumulatedSampleSizes(c5542bArr);
        this.f34698u.endTracks();
        this.f34698u.seekMap(this);
    }

    private void processUnparsedAtom(long j) {
        if (this.f34690m == 1836086884) {
            int i = this.f34692o;
            this.f34680A = new MotionPhotoMetadata(0L, j, -9223372036854775807L, j + ((long) i), this.f34691n - ((long) i));
        }
    }

    private boolean readAtomHeader(zj5 zj5Var) throws IOException {
        ib0.C7222a c7222aPeek;
        if (this.f34692o == 0) {
            if (!zj5Var.readFully(this.f34685h.getData(), 0, 8, true)) {
                processEndOfStreamReadingAtomHeader();
                return false;
            }
            this.f34692o = 8;
            this.f34685h.setPosition(0);
            this.f34691n = this.f34685h.readUnsignedInt();
            this.f34690m = this.f34685h.readInt();
        }
        long j = this.f34691n;
        if (j == 1) {
            zj5Var.readFully(this.f34685h.getData(), 8, 8);
            this.f34692o += 8;
            this.f34691n = this.f34685h.readUnsignedLongToLong();
        } else if (j == 0) {
            long length = zj5Var.getLength();
            if (length == -1 && (c7222aPeek = this.f34686i.peek()) != null) {
                length = c7222aPeek.f46424E1;
            }
            if (length != -1) {
                this.f34691n = (length - zj5Var.getPosition()) + ((long) this.f34692o);
            }
        }
        if (this.f34691n < this.f34692o) {
            throw xhc.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        if (shouldParseContainerAtom(this.f34690m)) {
            long position = zj5Var.getPosition();
            long j2 = this.f34691n;
            int i = this.f34692o;
            long j3 = (position + j2) - ((long) i);
            if (j2 != i && this.f34690m == 1835365473) {
                maybeSkipRemainingMetaAtomHeaderBytes(zj5Var);
            }
            this.f34686i.push(new ib0.C7222a(this.f34690m, j3));
            if (this.f34691n == this.f34692o) {
                processAtomEnded(j3);
            } else {
                enterReadingAtomHeaderState();
            }
        } else if (shouldParseLeafAtom(this.f34690m)) {
            u80.checkState(this.f34692o == 8);
            u80.checkState(this.f34691n <= 2147483647L);
            ihc ihcVar = new ihc((int) this.f34691n);
            System.arraycopy(this.f34685h.getData(), 0, ihcVar.getData(), 0, 8);
            this.f34693p = ihcVar;
            this.f34689l = 1;
        } else {
            processUnparsedAtom(zj5Var.getPosition() - ((long) this.f34692o));
            this.f34693p = null;
            this.f34689l = 1;
        }
        return true;
    }

    private boolean readAtomPayload(zj5 zj5Var, c5d c5dVar) throws IOException {
        boolean z;
        long j = this.f34691n - ((long) this.f34692o);
        long position = zj5Var.getPosition() + j;
        ihc ihcVar = this.f34693p;
        if (ihcVar != null) {
            zj5Var.readFully(ihcVar.getData(), this.f34692o, (int) j);
            if (this.f34690m == 1718909296) {
                this.f34703z = processFtypAtom(ihcVar);
            } else if (!this.f34686i.isEmpty()) {
                this.f34686i.peek().add(new ib0.C7223b(this.f34690m, ihcVar));
            }
        } else {
            if (j >= 262144) {
                c5dVar.f15813a = zj5Var.getPosition() + j;
                z = true;
                processAtomEnded(position);
                return (z || this.f34689l == 2) ? false : true;
            }
            zj5Var.skipFully((int) j);
        }
        z = false;
        processAtomEnded(position);
        if (z) {
        }
    }

    private int readSample(zj5 zj5Var, c5d c5dVar) throws IOException {
        int i;
        c5d c5dVar2;
        long position = zj5Var.getPosition();
        if (this.f34694q == -1) {
            int trackIndexOfNextReadSample = getTrackIndexOfNextReadSample(position);
            this.f34694q = trackIndexOfNextReadSample;
            if (trackIndexOfNextReadSample == -1) {
                return -1;
            }
        }
        C5542b c5542b = this.f34699v[this.f34694q];
        r6h r6hVar = c5542b.f34706c;
        int i2 = c5542b.f34708e;
        s6h s6hVar = c5542b.f34705b;
        long j = s6hVar.f80852c[i2];
        int i3 = s6hVar.f80853d[i2];
        gjh gjhVar = c5542b.f34707d;
        long j2 = (j - position) + ((long) this.f34695r);
        if (j2 < 0) {
            i = 1;
            c5dVar2 = c5dVar;
        } else {
            if (j2 < 262144) {
                if (c5542b.f34704a.f104269g == 1) {
                    j2 += 8;
                    i3 -= 8;
                }
                zj5Var.skipFully((int) j2);
                z5h z5hVar = c5542b.f34704a;
                if (z5hVar.f104272j == 0) {
                    if ("audio/ac4".equals(z5hVar.f104268f.f54989M)) {
                        if (this.f34696s == 0) {
                            C0070a6.getAc4SampleHeader(i3, this.f34684g);
                            r6hVar.sampleData(this.f34684g, 7);
                            this.f34696s += 7;
                        }
                        i3 += 7;
                    } else if (gjhVar != null) {
                        gjhVar.startSample(zj5Var);
                    }
                    while (true) {
                        int i4 = this.f34696s;
                        if (i4 >= i3) {
                            break;
                        }
                        int iSampleData = r6hVar.sampleData((ah3) zj5Var, i3 - i4, false);
                        this.f34695r += iSampleData;
                        this.f34696s += iSampleData;
                        this.f34697t -= iSampleData;
                    }
                } else {
                    byte[] data = this.f34683f.getData();
                    data[0] = 0;
                    data[1] = 0;
                    data[2] = 0;
                    int i5 = c5542b.f34704a.f104272j;
                    int i6 = 4 - i5;
                    while (this.f34696s < i3) {
                        int i7 = this.f34697t;
                        if (i7 == 0) {
                            zj5Var.readFully(data, i6, i5);
                            this.f34695r += i5;
                            this.f34683f.setPosition(0);
                            int i8 = this.f34683f.readInt();
                            if (i8 < 0) {
                                throw xhc.createForMalformedContainer("Invalid NAL length", null);
                            }
                            this.f34697t = i8;
                            this.f34682e.setPosition(0);
                            r6hVar.sampleData(this.f34682e, 4);
                            this.f34696s += 4;
                            i3 += i6;
                        } else {
                            int iSampleData2 = r6hVar.sampleData((ah3) zj5Var, i7, false);
                            this.f34695r += iSampleData2;
                            this.f34696s += iSampleData2;
                            this.f34697t -= iSampleData2;
                        }
                    }
                }
                int i9 = i3;
                s6h s6hVar2 = c5542b.f34705b;
                long j3 = s6hVar2.f80855f[i2];
                int i10 = s6hVar2.f80856g[i2];
                if (gjhVar != null) {
                    gjhVar.sampleMetadata(r6hVar, j3, i10, i9, 0, null);
                    if (i2 + 1 == c5542b.f34705b.f80851b) {
                        gjhVar.outputPendingSampleMetadata(r6hVar, null);
                    }
                } else {
                    r6hVar.sampleMetadata(j3, i10, i9, 0, null);
                }
                c5542b.f34708e++;
                this.f34694q = -1;
                this.f34695r = 0;
                this.f34696s = 0;
                this.f34697t = 0;
                return 0;
            }
            c5dVar2 = c5dVar;
            i = 1;
        }
        c5dVar2.f15813a = j;
        return i;
    }

    private int readSefData(zj5 zj5Var, c5d c5dVar) throws IOException {
        int i = this.f34687j.read(zj5Var, c5dVar, this.f34688k);
        if (i == 1 && c5dVar.f15813a == 0) {
            enterReadingAtomHeaderState();
        }
        return i;
    }

    private static boolean shouldParseContainerAtom(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1701082227 || i == 1835365473;
    }

    private static boolean shouldParseLeafAtom(int i) {
        return i == 1835296868 || i == 1836476516 || i == 1751411826 || i == 1937011556 || i == 1937011827 || i == 1937011571 || i == 1668576371 || i == 1701606260 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1953196132 || i == 1718909296 || i == 1969517665 || i == 1801812339 || i == 1768715124;
    }

    private void updateSampleIndex(C5542b c5542b, long j) {
        s6h s6hVar = c5542b.f34705b;
        int indexOfEarlierOrEqualSynchronizationSample = s6hVar.getIndexOfEarlierOrEqualSynchronizationSample(j);
        if (indexOfEarlierOrEqualSynchronizationSample == -1) {
            indexOfEarlierOrEqualSynchronizationSample = s6hVar.getIndexOfLaterOrEqualSynchronizationSample(j);
        }
        c5542b.f34708e = indexOfEarlierOrEqualSynchronizationSample;
    }

    @Override // p000.hue
    public long getDurationUs() {
        return this.f34702y;
    }

    @Override // p000.hue
    public hue.C7023a getSeekPoints(long j) {
        return getSeekPoints(j, -1);
    }

    @Override // p000.yj5
    public void init(ck5 ck5Var) {
        this.f34698u = ck5Var;
    }

    @Override // p000.hue
    public boolean isSeekable() {
        return true;
    }

    @Override // p000.yj5
    public int read(zj5 zj5Var, c5d c5dVar) throws IOException {
        while (true) {
            int i = this.f34689l;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return readSample(zj5Var, c5dVar);
                    }
                    if (i == 3) {
                        return readSefData(zj5Var, c5dVar);
                    }
                    throw new IllegalStateException();
                }
                if (readAtomPayload(zj5Var, c5dVar)) {
                    return 1;
                }
            } else if (!readAtomHeader(zj5Var)) {
                return -1;
            }
        }
    }

    @Override // p000.yj5
    public void release() {
    }

    @Override // p000.yj5
    public void seek(long j, long j2) {
        this.f34686i.clear();
        this.f34692o = 0;
        this.f34694q = -1;
        this.f34695r = 0;
        this.f34696s = 0;
        this.f34697t = 0;
        if (j == 0) {
            if (this.f34689l != 3) {
                enterReadingAtomHeaderState();
                return;
            } else {
                this.f34687j.reset();
                this.f34688k.clear();
                return;
            }
        }
        for (C5542b c5542b : this.f34699v) {
            updateSampleIndex(c5542b, j2);
            gjh gjhVar = c5542b.f34707d;
            if (gjhVar != null) {
                gjhVar.reset();
            }
        }
    }

    @Override // p000.yj5
    public boolean sniff(zj5 zj5Var) throws IOException {
        return kuf.sniffUnfragmented(zj5Var, (this.f34681d & 2) != 0);
    }

    public f1b(int i) {
        this.f34681d = i;
        this.f34689l = (i & 4) != 0 ? 3 : 0;
        this.f34687j = new que();
        this.f34688k = new ArrayList();
        this.f34685h = new ihc(16);
        this.f34686i = new ArrayDeque<>();
        this.f34682e = new ihc(o8b.f66670i);
        this.f34683f = new ihc(4);
        this.f34684g = new ihc();
        this.f34694q = -1;
        this.f34698u = ck5.f16800x;
        this.f34699v = new C5542b[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.hue.C7023a getSeekPoints(long r17, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            f1b$b[] r4 = r0.f34699v
            int r5 = r4.length
            if (r5 != 0) goto L13
            hue$a r1 = new hue$a
            kue r2 = p000.kue.f55383c
            r1.<init>(r2)
            return r1
        L13:
            r5 = -1
            if (r3 == r5) goto L18
            r6 = r3
            goto L1a
        L18:
            int r6 = r0.f34701x
        L1a:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = -1
            if (r6 == r5) goto L58
            r4 = r4[r6]
            s6h r4 = r4.f34705b
            int r6 = getSynchronizationSampleIndex(r4, r1)
            if (r6 != r5) goto L35
            hue$a r1 = new hue$a
            kue r2 = p000.kue.f55383c
            r1.<init>(r2)
            return r1
        L35:
            long[] r11 = r4.f80855f
            r12 = r11[r6]
            long[] r11 = r4.f80852c
            r14 = r11[r6]
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 >= 0) goto L5e
            int r11 = r4.f80851b
            int r11 = r11 + (-1)
            if (r6 >= r11) goto L5e
            int r1 = r4.getIndexOfLaterOrEqualSynchronizationSample(r1)
            if (r1 == r5) goto L5e
            if (r1 == r6) goto L5e
            long[] r2 = r4.f80855f
            r9 = r2[r1]
            long[] r2 = r4.f80852c
            r1 = r2[r1]
            goto L60
        L58:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = r1
        L5e:
            r1 = r9
            r9 = r7
        L60:
            if (r3 != r5) goto L80
            r3 = 0
        L63:
            f1b$b[] r4 = r0.f34699v
            int r5 = r4.length
            if (r3 >= r5) goto L80
            int r5 = r0.f34701x
            if (r3 == r5) goto L7d
            r4 = r4[r3]
            s6h r4 = r4.f34705b
            long r5 = maybeAdjustSeekOffset(r4, r12, r14)
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L7c
            long r1 = maybeAdjustSeekOffset(r4, r9, r1)
        L7c:
            r14 = r5
        L7d:
            int r3 = r3 + 1
            goto L63
        L80:
            kue r3 = new kue
            r3.<init>(r12, r14)
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 != 0) goto L8f
            hue$a r1 = new hue$a
            r1.<init>(r3)
            return r1
        L8f:
            kue r4 = new kue
            r4.<init>(r9, r1)
            hue$a r1 = new hue$a
            r1.<init>(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.f1b.getSeekPoints(long, int):hue$a");
    }
}

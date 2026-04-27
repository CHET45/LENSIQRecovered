package p000;

import androidx.media3.common.C1213a;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p000.eta;
import p000.gue;
import p000.peg;
import p000.q6h;
import p000.y0b;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class e1b implements xj5, gue {

    /* JADX INFO: renamed from: J */
    public static final int f31502J = 1;

    /* JADX INFO: renamed from: K */
    public static final int f31503K = 2;

    /* JADX INFO: renamed from: L */
    public static final int f31504L = 4;

    /* JADX INFO: renamed from: M */
    public static final int f31505M = 8;

    /* JADX INFO: renamed from: N */
    public static final int f31506N = 16;

    /* JADX INFO: renamed from: O */
    public static final int f31507O = 32;

    /* JADX INFO: renamed from: P */
    public static final int f31508P = 64;

    /* JADX INFO: renamed from: Q */
    public static final int f31509Q = 128;

    /* JADX INFO: renamed from: R */
    @Deprecated
    public static final ik5 f31510R = new ik5() { // from class: d1b
        @Override // p000.ik5
        public final xj5[] createExtractors() {
            return e1b.lambda$static$1();
        }
    };

    /* JADX INFO: renamed from: S */
    public static final int f31511S = 0;

    /* JADX INFO: renamed from: T */
    public static final int f31512T = 1;

    /* JADX INFO: renamed from: U */
    public static final int f31513U = 2;

    /* JADX INFO: renamed from: V */
    public static final int f31514V = 3;

    /* JADX INFO: renamed from: W */
    public static final int f31515W = 0;

    /* JADX INFO: renamed from: X */
    public static final int f31516X = 1;

    /* JADX INFO: renamed from: Y */
    public static final int f31517Y = 2;

    /* JADX INFO: renamed from: Z */
    public static final long f31518Z = 262144;

    /* JADX INFO: renamed from: a0 */
    public static final long f31519a0 = 10485760;

    /* JADX INFO: renamed from: A */
    public boolean f31520A;

    /* JADX INFO: renamed from: B */
    public long f31521B;

    /* JADX INFO: renamed from: C */
    public bk5 f31522C;

    /* JADX INFO: renamed from: D */
    public C5044b[] f31523D;

    /* JADX INFO: renamed from: E */
    public long[][] f31524E;

    /* JADX INFO: renamed from: F */
    public int f31525F;

    /* JADX INFO: renamed from: G */
    public long f31526G;

    /* JADX INFO: renamed from: H */
    public int f31527H;

    /* JADX INFO: renamed from: I */
    @hib
    public yza f31528I;

    /* JADX INFO: renamed from: d */
    public final peg.InterfaceC10936a f31529d;

    /* JADX INFO: renamed from: e */
    public final int f31530e;

    /* JADX INFO: renamed from: f */
    public final jhc f31531f;

    /* JADX INFO: renamed from: g */
    public final jhc f31532g;

    /* JADX INFO: renamed from: h */
    public final jhc f31533h;

    /* JADX INFO: renamed from: i */
    public final jhc f31534i;

    /* JADX INFO: renamed from: j */
    public final ArrayDeque<y0b.C15366b> f31535j;

    /* JADX INFO: renamed from: k */
    public final pue f31536k;

    /* JADX INFO: renamed from: l */
    public final List<eta.InterfaceC5464a> f31537l;

    /* JADX INFO: renamed from: m */
    public kx7<huf> f31538m;

    /* JADX INFO: renamed from: n */
    public int f31539n;

    /* JADX INFO: renamed from: o */
    public int f31540o;

    /* JADX INFO: renamed from: p */
    public long f31541p;

    /* JADX INFO: renamed from: q */
    public int f31542q;

    /* JADX INFO: renamed from: r */
    @hib
    public jhc f31543r;

    /* JADX INFO: renamed from: s */
    public int f31544s;

    /* JADX INFO: renamed from: t */
    public int f31545t;

    /* JADX INFO: renamed from: u */
    public int f31546u;

    /* JADX INFO: renamed from: v */
    public int f31547v;

    /* JADX INFO: renamed from: w */
    public boolean f31548w;

    /* JADX INFO: renamed from: x */
    public boolean f31549x;

    /* JADX INFO: renamed from: y */
    public boolean f31550y;

    /* JADX INFO: renamed from: z */
    public long f31551z;

    /* JADX INFO: renamed from: e1b$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC5043a {
    }

    /* JADX INFO: renamed from: e1b$b */
    public static final class C5044b {

        /* JADX INFO: renamed from: a */
        public final y5h f31552a;

        /* JADX INFO: renamed from: b */
        public final t6h f31553b;

        /* JADX INFO: renamed from: c */
        public final q6h f31554c;

        /* JADX INFO: renamed from: d */
        @hib
        public final hjh f31555d;

        /* JADX INFO: renamed from: e */
        public int f31556e;

        public C5044b(y5h y5hVar, t6h t6hVar, q6h q6hVar) {
            this.f31552a = y5hVar;
            this.f31553b = t6hVar;
            this.f31554c = q6hVar;
            this.f31555d = "audio/true-hd".equals(y5hVar.f100448g.f8291o) ? new hjh() : null;
        }
    }

    @Deprecated
    public e1b() {
        this(peg.InterfaceC10936a.f70575a, 16);
    }

    private static int brandToFileType(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static long[][] calculateAccumulatedSampleSizes(C5044b[] c5044bArr) {
        long[][] jArr = new long[c5044bArr.length][];
        int[] iArr = new int[c5044bArr.length];
        long[] jArr2 = new long[c5044bArr.length];
        boolean[] zArr = new boolean[c5044bArr.length];
        for (int i = 0; i < c5044bArr.length; i++) {
            jArr[i] = new long[c5044bArr[i].f31553b.f83874b];
            jArr2[i] = c5044bArr[i].f31553b.f83878f[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < c5044bArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < c5044bArr.length; i4++) {
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
            t6h t6hVar = c5044bArr[i3].f31553b;
            j += (long) t6hVar.f83876d[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr3.length) {
                jArr2[i3] = t6hVar.f83878f[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    private boolean canReadWithinGopSampleDependencies(C1213a c1213a) {
        return Objects.equals(c1213a.f8291o, "video/avc") ? (this.f31530e & 32) != 0 : Objects.equals(c1213a.f8291o, "video/hevc") && (this.f31530e & 128) != 0;
    }

    public static int codecsToParseWithinGopSampleDependenciesAsFlags(int i) {
        int i2 = (i & 1) != 0 ? 32 : 0;
        return (i & 2) != 0 ? i2 | 128 : i2;
    }

    private void enterReadingAtomHeaderState() {
        this.f31539n = 0;
        this.f31542q = 0;
    }

    private List<Integer> getAuxiliaryTrackTypesForAuxiliaryTracks(eta etaVar) {
        List<Integer> auxiliaryTrackTypesFromMap = ((pba) v80.checkStateNotNull(mua.findMdtaMetadataEntryWithKey(etaVar, pba.f70220h))).getAuxiliaryTrackTypesFromMap();
        ArrayList arrayList = new ArrayList(auxiliaryTrackTypesFromMap.size());
        for (int i = 0; i < auxiliaryTrackTypesFromMap.size(); i++) {
            int iIntValue = auxiliaryTrackTypesFromMap.get(i).intValue();
            int i2 = 1;
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    i2 = 3;
                    if (iIntValue != 2) {
                        i2 = iIntValue != 3 ? 0 : 4;
                    }
                } else {
                    i2 = 2;
                }
            }
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList;
    }

    private static int getSynchronizationSampleIndex(t6h t6hVar, long j) {
        int indexOfEarlierOrEqualSynchronizationSample = t6hVar.getIndexOfEarlierOrEqualSynchronizationSample(j);
        return indexOfEarlierOrEqualSynchronizationSample == -1 ? t6hVar.getIndexOfLaterOrEqualSynchronizationSample(j) : indexOfEarlierOrEqualSynchronizationSample;
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
            C5044b[] c5044bArr = this.f31523D;
            if (i3 >= c5044bArr.length) {
                break;
            }
            C5044b c5044b = c5044bArr[i3];
            int i4 = c5044b.f31556e;
            t6h t6hVar = c5044b.f31553b;
            if (i4 != t6hVar.f83874b) {
                long j5 = t6hVar.f83875c[i4];
                long j6 = ((long[][]) t0i.castNonNull(this.f31524E))[i3][i4];
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
    public static /* synthetic */ xj5[] lambda$newFactory$0(peg.InterfaceC10936a interfaceC10936a) {
        return new xj5[]{new e1b(interfaceC10936a)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y5h lambda$processMoovAtom$2(y5h y5hVar) {
        return y5hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ xj5[] lambda$static$1() {
        return new xj5[]{new e1b(peg.InterfaceC10936a.f70575a, 16)};
    }

    private static long maybeAdjustSeekOffset(t6h t6hVar, long j, long j2) {
        int synchronizationSampleIndex = getSynchronizationSampleIndex(t6hVar, j);
        return synchronizationSampleIndex == -1 ? j2 : Math.min(t6hVar.f83875c[synchronizationSampleIndex], j2);
    }

    private void maybeSetDefaultSampleOffsetForAuxiliaryTracks(eta etaVar) {
        pba pbaVarFindMdtaMetadataEntryWithKey = mua.findMdtaMetadataEntryWithKey(etaVar, pba.f70221i);
        if (pbaVarFindMdtaMetadataEntryWithKey == null || pbaVarFindMdtaMetadataEntryWithKey.f70232b[0] != 0) {
            return;
        }
        this.f31521B = this.f31551z + 16;
    }

    private void maybeSkipRemainingMetaAtomHeaderBytes(ak5 ak5Var) throws IOException {
        this.f31533h.reset(8);
        ak5Var.peekFully(this.f31533h.getData(), 0, 8);
        rc1.maybeSkipRemainingMetaBoxHeaderBytes(this.f31533h);
        ak5Var.skipFully(this.f31533h.getPosition());
        ak5Var.resetPeekPosition();
    }

    public static ik5 newFactory(final peg.InterfaceC10936a interfaceC10936a) {
        return new ik5() { // from class: a1b
            @Override // p000.ik5
            public final xj5[] createExtractors() {
                return e1b.lambda$newFactory$0(interfaceC10936a);
            }
        };
    }

    private void processAtomEnded(long j) throws yhc {
        while (!this.f31535j.isEmpty() && this.f31535j.peek().f99982W1 == j) {
            y0b.C15366b c15366bPop = this.f31535j.pop();
            if (c15366bPop.f99981a == 1836019574) {
                processMoovAtom(c15366bPop);
                this.f31535j.clear();
                if (!this.f31550y) {
                    this.f31539n = 2;
                }
            } else if (!this.f31535j.isEmpty()) {
                this.f31535j.peek().add(c15366bPop);
            }
        }
        if (this.f31539n != 2) {
            enterReadingAtomHeaderState();
        }
    }

    private void processEndOfStreamReadingAtomHeader() {
        if (this.f31527H != 2 || (this.f31530e & 2) == 0) {
            return;
        }
        q6h q6hVarTrack = this.f31522C.track(0, 4);
        yza yzaVar = this.f31528I;
        q6hVarTrack.format(new C1213a.b().setMetadata(yzaVar == null ? null : new eta(yzaVar)).build());
        this.f31522C.endTracks();
        this.f31522C.seekMap(new gue.C6549b(-9223372036854775807L));
    }

    private static int processFtypAtom(jhc jhcVar) {
        jhcVar.setPosition(8);
        int iBrandToFileType = brandToFileType(jhcVar.readInt());
        if (iBrandToFileType != 0) {
            return iBrandToFileType;
        }
        jhcVar.skipBytes(4);
        while (jhcVar.bytesLeft() > 0) {
            int iBrandToFileType2 = brandToFileType(jhcVar.readInt());
            if (iBrandToFileType2 != 0) {
                return iBrandToFileType2;
            }
        }
        return 0;
    }

    private void processMoovAtom(y0b.C15366b c15366b) throws yhc {
        List<Integer> list;
        eta etaVar;
        eta etaVar2;
        List<t6h> list2;
        eta etaVar3;
        String str;
        int i;
        y0b.C15366b containerBoxOfType = c15366b.getContainerBoxOfType(1835365473);
        List<Integer> arrayList = new ArrayList<>();
        int i2 = 1;
        if (containerBoxOfType != null) {
            eta mdtaFromMeta = rc1.parseMdtaFromMeta(containerBoxOfType);
            if (this.f31520A) {
                v80.checkStateNotNull(mdtaFromMeta);
                maybeSetDefaultSampleOffsetForAuxiliaryTracks(mdtaFromMeta);
                arrayList = getAuxiliaryTrackTypesForAuxiliaryTracks(mdtaFromMeta);
            } else if (shouldSeekToAxteAtom(mdtaFromMeta)) {
                this.f31550y = true;
                return;
            }
            etaVar = mdtaFromMeta;
            list = arrayList;
        } else {
            list = arrayList;
            etaVar = null;
        }
        ArrayList arrayList2 = new ArrayList();
        boolean z = this.f31527H == 1;
        o27 o27Var = new o27();
        y0b.C15367c leafBoxOfType = c15366b.getLeafBoxOfType(1969517665);
        if (leafBoxOfType != null) {
            eta udta = rc1.parseUdta(leafBoxOfType);
            o27Var.setFromMetadata(udta);
            etaVar2 = udta;
        } else {
            etaVar2 = null;
        }
        eta etaVar4 = new eta(rc1.parseMvhd(((y0b.C15367c) v80.checkNotNull(c15366b.getLeafBoxOfType(1836476516))).f99985W1));
        eta etaVar5 = etaVar2;
        List<t6h> traks = rc1.parseTraks(c15366b, o27Var, -9223372036854775807L, null, (this.f31530e & 1) != 0, z, new lz6() { // from class: c1b
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return e1b.lambda$processMoovAtom$2((y5h) obj);
            }
        });
        if (this.f31520A) {
            v80.checkState(list.size() == traks.size(), String.format(Locale.US, "The number of auxiliary track types from metadata (%d) is not same as the number of auxiliary tracks (%d)", Integer.valueOf(list.size()), Integer.valueOf(traks.size())));
        }
        String containerMimeType = qva.getContainerMimeType(traks);
        int i3 = 0;
        int size = -1;
        int i4 = 0;
        long jMax = -9223372036854775807L;
        while (i3 < traks.size()) {
            t6h t6hVar = traks.get(i3);
            if (t6hVar.f83874b == 0) {
                list2 = traks;
                str = containerMimeType;
                i = i2;
                etaVar3 = etaVar5;
            } else {
                y5h y5hVar = t6hVar.f83873a;
                list2 = traks;
                int i5 = i4 + 1;
                C5044b c5044b = new C5044b(y5hVar, t6hVar, this.f31522C.track(i4, y5hVar.f100443b));
                String str2 = containerMimeType;
                long j = y5hVar.f100446e;
                if (j == -9223372036854775807L) {
                    j = t6hVar.f83880h;
                }
                c5044b.f31554c.durationUs(j);
                etaVar3 = etaVar5;
                jMax = Math.max(jMax, j);
                int i6 = "audio/true-hd".equals(y5hVar.f100448g.f8291o) ? t6hVar.f83877e * 16 : t6hVar.f83877e + 30;
                C1213a.b bVarBuildUpon = y5hVar.f100448g.buildUpon();
                bVarBuildUpon.setMaxInputSize(i6);
                if (y5hVar.f100443b == 2) {
                    int i7 = y5hVar.f100448g.f8282f;
                    if ((this.f31530e & 8) != 0) {
                        i7 |= size == -1 ? 1 : 2;
                    }
                    if (this.f31520A) {
                        i7 |= 32768;
                        bVarBuildUpon.setAuxiliaryTrackType(list.get(i3).intValue());
                    }
                    bVarBuildUpon.setRoleFlags(i7);
                }
                mua.setFormatGaplessInfo(y5hVar.f100443b, o27Var, bVarBuildUpon);
                mua.setFormatMetadata(y5hVar.f100443b, etaVar, bVarBuildUpon, y5hVar.f100448g.f8288l, this.f31537l.isEmpty() ? null : new eta(this.f31537l), etaVar3, etaVar4);
                str = str2;
                bVarBuildUpon.setContainerMimeType(str);
                c5044b.f31554c.format(bVarBuildUpon.build());
                if (y5hVar.f100443b == 2 && size == -1) {
                    size = arrayList2.size();
                }
                arrayList2.add(c5044b);
                i4 = i5;
                i = 1;
            }
            i3 += i;
            containerMimeType = str;
            etaVar5 = etaVar3;
            traks = list2;
            i2 = i;
        }
        this.f31525F = size;
        this.f31526G = jMax;
        C5044b[] c5044bArr = (C5044b[]) arrayList2.toArray(new C5044b[0]);
        this.f31523D = c5044bArr;
        this.f31524E = calculateAccumulatedSampleSizes(c5044bArr);
        this.f31522C.endTracks();
        this.f31522C.seekMap(this);
    }

    private void processUnparsedAtom(long j) {
        if (this.f31540o == 1836086884) {
            int i = this.f31542q;
            this.f31528I = new yza(0L, j, -9223372036854775807L, j + ((long) i), this.f31541p - ((long) i));
        }
    }

    private boolean readAtomHeader(ak5 ak5Var) throws IOException {
        y0b.C15366b c15366bPeek;
        if (this.f31542q == 0) {
            if (!ak5Var.readFully(this.f31534i.getData(), 0, 8, true)) {
                processEndOfStreamReadingAtomHeader();
                return false;
            }
            this.f31542q = 8;
            this.f31534i.setPosition(0);
            this.f31541p = this.f31534i.readUnsignedInt();
            this.f31540o = this.f31534i.readInt();
        }
        long j = this.f31541p;
        if (j == 1) {
            ak5Var.readFully(this.f31534i.getData(), 8, 8);
            this.f31542q += 8;
            this.f31541p = this.f31534i.readUnsignedLongToLong();
        } else if (j == 0) {
            long length = ak5Var.getLength();
            if (length == -1 && (c15366bPeek = this.f31535j.peek()) != null) {
                length = c15366bPeek.f99982W1;
            }
            if (length != -1) {
                this.f31541p = (length - ak5Var.getPosition()) + ((long) this.f31542q);
            }
        }
        if (this.f31541p < this.f31542q) {
            throw yhc.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        if (shouldParseContainerAtom(this.f31540o)) {
            long position = ak5Var.getPosition();
            long j2 = this.f31541p;
            int i = this.f31542q;
            long j3 = (position + j2) - ((long) i);
            if (j2 != i && this.f31540o == 1835365473) {
                maybeSkipRemainingMetaAtomHeaderBytes(ak5Var);
            }
            this.f31535j.push(new y0b.C15366b(this.f31540o, j3));
            if (this.f31541p == this.f31542q) {
                processAtomEnded(j3);
            } else {
                enterReadingAtomHeaderState();
            }
        } else if (shouldParseLeafAtom(this.f31540o)) {
            v80.checkState(this.f31542q == 8);
            v80.checkState(this.f31541p <= 2147483647L);
            jhc jhcVar = new jhc((int) this.f31541p);
            System.arraycopy(this.f31534i.getData(), 0, jhcVar.getData(), 0, 8);
            this.f31543r = jhcVar;
            this.f31539n = 1;
        } else {
            processUnparsedAtom(ak5Var.getPosition() - ((long) this.f31542q));
            this.f31543r = null;
            this.f31539n = 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean readAtomPayload(p000.ak5 r10, p000.d5d r11) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.f31541p
            int r2 = r9.f31542q
            long r2 = (long) r2
            long r0 = r0 - r2
            long r2 = r10.getPosition()
            long r2 = r2 + r0
            jhc r4 = r9.f31543r
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L46
            byte[] r7 = r4.getData()
            int r8 = r9.f31542q
            int r0 = (int) r0
            r10.readFully(r7, r8, r0)
            int r10 = r9.f31540o
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r10 != r0) goto L2b
            r9.f31549x = r5
            int r10 = processFtypAtom(r4)
            r9.f31527H = r10
            goto L5e
        L2b:
            java.util.ArrayDeque<y0b$b> r10 = r9.f31535j
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L5e
            java.util.ArrayDeque<y0b$b> r10 = r9.f31535j
            java.lang.Object r10 = r10.peek()
            y0b$b r10 = (p000.y0b.C15366b) r10
            y0b$c r0 = new y0b$c
            int r1 = r9.f31540o
            r0.<init>(r1, r4)
            r10.add(r0)
            goto L5e
        L46:
            boolean r4 = r9.f31549x
            if (r4 != 0) goto L53
            int r4 = r9.f31540o
            r7 = 1835295092(0x6d646174, float:4.4175247E27)
            if (r4 != r7) goto L53
            r9.f31527H = r5
        L53:
            r7 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L60
            int r0 = (int) r0
            r10.skipFully(r0)
        L5e:
            r10 = r6
            goto L68
        L60:
            long r7 = r10.getPosition()
            long r7 = r7 + r0
            r11.f28476a = r7
            r10 = r5
        L68:
            r9.processAtomEnded(r2)
            boolean r0 = r9.f31550y
            if (r0 == 0) goto L78
            r9.f31520A = r5
            long r0 = r9.f31551z
            r11.f28476a = r0
            r9.f31550y = r6
            r10 = r5
        L78:
            if (r10 == 0) goto L80
            int r10 = r9.f31539n
            r11 = 2
            if (r10 == r11) goto L80
            goto L81
        L80:
            r5 = r6
        L81:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.e1b.readAtomPayload(ak5, d5d):boolean");
    }

    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean, int] */
    private int readSample(ak5 ak5Var, d5d d5dVar) throws IOException {
        int i;
        d5d d5dVar2;
        q6h.C11325a c11325a;
        ?? r5;
        int iNumberOfBytesInNalUnitHeader;
        long position = ak5Var.getPosition();
        if (this.f31544s == -1) {
            int trackIndexOfNextReadSample = getTrackIndexOfNextReadSample(position);
            this.f31544s = trackIndexOfNextReadSample;
            if (trackIndexOfNextReadSample == -1) {
                return -1;
            }
        }
        C5044b c5044b = this.f31523D[this.f31544s];
        q6h q6hVar = c5044b.f31554c;
        int i2 = c5044b.f31556e;
        t6h t6hVar = c5044b.f31553b;
        long j = t6hVar.f83875c[i2] + this.f31521B;
        int i3 = t6hVar.f83876d[i2];
        hjh hjhVar = c5044b.f31555d;
        long j2 = (j - position) + ((long) this.f31545t);
        if (j2 < 0) {
            i = 1;
            d5dVar2 = d5dVar;
        } else {
            if (j2 < 262144) {
                if (c5044b.f31552a.f100449h == 1) {
                    j2 += 8;
                    i3 -= 8;
                }
                ak5Var.skipFully((int) j2);
                if (!canReadWithinGopSampleDependencies(c5044b.f31552a.f100448g)) {
                    this.f31548w = true;
                }
                y5h y5hVar = c5044b.f31552a;
                if (y5hVar.f100452k == 0) {
                    c11325a = null;
                    if ("audio/ac4".equals(y5hVar.f100448g.f8291o)) {
                        if (this.f31546u == 0) {
                            C16006z5.getAc4SampleHeader(i3, this.f31533h);
                            q6hVar.sampleData(this.f31533h, 7);
                            this.f31546u += 7;
                        }
                        i3 += 7;
                    } else if (hjhVar != null) {
                        hjhVar.startSample(ak5Var);
                    }
                    while (true) {
                        int i4 = this.f31546u;
                        if (i4 >= i3) {
                            break;
                        }
                        int iSampleData = q6hVar.sampleData((bh3) ak5Var, i3 - i4, false);
                        this.f31545t += iSampleData;
                        this.f31546u += iSampleData;
                        this.f31547v -= iSampleData;
                    }
                } else {
                    byte[] data = this.f31532g.getData();
                    data[0] = 0;
                    data[1] = 0;
                    data[2] = 0;
                    int i5 = 4 - c5044b.f31552a.f100452k;
                    i3 += i5;
                    while (this.f31546u < i3) {
                        int i6 = this.f31547v;
                        if (i6 == 0) {
                            y5h y5hVar2 = c5044b.f31552a;
                            int i7 = y5hVar2.f100452k;
                            if (this.f31548w || n8b.numberOfBytesInNalUnitHeader(y5hVar2.f100448g) + i7 > c5044b.f31553b.f83876d[i2] - this.f31545t) {
                                iNumberOfBytesInNalUnitHeader = 0;
                            } else {
                                iNumberOfBytesInNalUnitHeader = n8b.numberOfBytesInNalUnitHeader(c5044b.f31552a.f100448g);
                                i7 = c5044b.f31552a.f100452k + iNumberOfBytesInNalUnitHeader;
                            }
                            ak5Var.readFully(data, i5, i7);
                            this.f31545t += i7;
                            this.f31532g.setPosition(0);
                            int i8 = this.f31532g.readInt();
                            if (i8 < 0) {
                                throw yhc.createForMalformedContainer("Invalid NAL length", null);
                            }
                            this.f31547v = i8 - iNumberOfBytesInNalUnitHeader;
                            this.f31531f.setPosition(0);
                            q6hVar.sampleData(this.f31531f, 4);
                            this.f31546u += 4;
                            if (iNumberOfBytesInNalUnitHeader > 0) {
                                q6hVar.sampleData(this.f31532g, iNumberOfBytesInNalUnitHeader);
                                this.f31546u += iNumberOfBytesInNalUnitHeader;
                                if (n8b.isDependedOn(data, 4, iNumberOfBytesInNalUnitHeader, c5044b.f31552a.f100448g)) {
                                    this.f31548w = true;
                                }
                            }
                        } else {
                            int iSampleData2 = q6hVar.sampleData((bh3) ak5Var, i6, false);
                            this.f31545t += iSampleData2;
                            this.f31546u += iSampleData2;
                            this.f31547v -= iSampleData2;
                        }
                    }
                    c11325a = null;
                }
                int i9 = i3;
                t6h t6hVar2 = c5044b.f31553b;
                long j3 = t6hVar2.f83878f[i2];
                int i10 = t6hVar2.f83879g[i2];
                if (!this.f31548w) {
                    i10 |= 67108864;
                }
                if (hjhVar != null) {
                    int i11 = i10;
                    q6h.C11325a c11325a2 = c11325a;
                    boolean z = false;
                    hjhVar.sampleMetadata(q6hVar, j3, i11, i9, 0, null);
                    r5 = z;
                    if (i2 + 1 == c5044b.f31553b.f83874b) {
                        hjhVar.outputPendingSampleMetadata(q6hVar, c11325a2);
                        r5 = z;
                    }
                } else {
                    r5 = 0;
                    q6hVar.sampleMetadata(j3, i10, i9, 0, null);
                }
                c5044b.f31556e++;
                this.f31544s = -1;
                this.f31545t = r5;
                this.f31546u = r5;
                this.f31547v = r5;
                this.f31548w = r5;
                return r5;
            }
            d5dVar2 = d5dVar;
            i = 1;
        }
        d5dVar2.f28476a = j;
        return i;
    }

    private int readSefData(ak5 ak5Var, d5d d5dVar) throws IOException {
        int i = this.f31536k.read(ak5Var, d5dVar, this.f31537l);
        if (i == 1 && d5dVar.f28476a == 0) {
            enterReadingAtomHeaderState();
        }
        return i;
    }

    private static boolean shouldParseContainerAtom(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1701082227 || i == 1835365473 || i == 1635284069;
    }

    private static boolean shouldParseLeafAtom(int i) {
        return i == 1835296868 || i == 1836476516 || i == 1751411826 || i == 1937011556 || i == 1937011827 || i == 1937011571 || i == 1668576371 || i == 1701606260 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1953196132 || i == 1718909296 || i == 1969517665 || i == 1801812339 || i == 1768715124;
    }

    private boolean shouldSeekToAxteAtom(@hib eta etaVar) {
        pba pbaVarFindMdtaMetadataEntryWithKey;
        if (etaVar != null && (this.f31530e & 64) != 0 && (pbaVarFindMdtaMetadataEntryWithKey = mua.findMdtaMetadataEntryWithKey(etaVar, pba.f70218f)) != null) {
            long unsignedLongToLong = new jhc(pbaVarFindMdtaMetadataEntryWithKey.f70232b).readUnsignedLongToLong();
            if (unsignedLongToLong > 0) {
                this.f31551z = unsignedLongToLong;
                return true;
            }
        }
        return false;
    }

    private void updateSampleIndex(C5044b c5044b, long j) {
        t6h t6hVar = c5044b.f31553b;
        int indexOfEarlierOrEqualSynchronizationSample = t6hVar.getIndexOfEarlierOrEqualSynchronizationSample(j);
        if (indexOfEarlierOrEqualSynchronizationSample == -1) {
            indexOfEarlierOrEqualSynchronizationSample = t6hVar.getIndexOfLaterOrEqualSynchronizationSample(j);
        }
        c5044b.f31556e = indexOfEarlierOrEqualSynchronizationSample;
    }

    @Override // p000.gue
    public long getDurationUs() {
        return this.f31526G;
    }

    public long[] getSampleTimestampsUs(int i) {
        C5044b[] c5044bArr = this.f31523D;
        return c5044bArr.length <= i ? new long[0] : c5044bArr[i].f31553b.f83878f;
    }

    @Override // p000.gue
    public gue.C6548a getSeekPoints(long j) {
        return getSeekPoints(j, -1);
    }

    @Override // p000.xj5
    public void init(bk5 bk5Var) {
        if ((this.f31530e & 16) == 0) {
            bk5Var = new reg(bk5Var, this.f31529d);
        }
        this.f31522C = bk5Var;
    }

    @Override // p000.gue
    public boolean isSeekable() {
        return true;
    }

    @Override // p000.xj5
    public int read(ak5 ak5Var, d5d d5dVar) throws IOException {
        while (true) {
            int i = this.f31539n;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return readSample(ak5Var, d5dVar);
                    }
                    if (i == 3) {
                        return readSefData(ak5Var, d5dVar);
                    }
                    throw new IllegalStateException();
                }
                if (readAtomPayload(ak5Var, d5dVar)) {
                    return 1;
                }
            } else if (!readAtomHeader(ak5Var)) {
                return -1;
            }
        }
    }

    @Override // p000.xj5
    public void release() {
    }

    @Override // p000.xj5
    public void seek(long j, long j2) {
        this.f31535j.clear();
        this.f31542q = 0;
        this.f31544s = -1;
        this.f31545t = 0;
        this.f31546u = 0;
        this.f31547v = 0;
        this.f31548w = false;
        if (j == 0) {
            if (this.f31539n != 3) {
                enterReadingAtomHeaderState();
                return;
            } else {
                this.f31536k.reset();
                this.f31537l.clear();
                return;
            }
        }
        for (C5044b c5044b : this.f31523D) {
            updateSampleIndex(c5044b, j2);
            hjh hjhVar = c5044b.f31555d;
            if (hjhVar != null) {
                hjhVar.reset();
            }
        }
    }

    @Override // p000.xj5
    public boolean sniff(ak5 ak5Var) throws IOException {
        huf hufVarSniffUnfragmented = iuf.sniffUnfragmented(ak5Var, (this.f31530e & 2) != 0);
        this.f31538m = hufVarSniffUnfragmented != null ? kx7.m15111of(hufVarSniffUnfragmented) : kx7.m15110of();
        return hufVarSniffUnfragmented == null;
    }

    public e1b(peg.InterfaceC10936a interfaceC10936a) {
        this(interfaceC10936a, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.gue.C6548a getSeekPoints(long r17, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            e1b$b[] r4 = r0.f31523D
            int r5 = r4.length
            if (r5 != 0) goto L13
            gue$a r1 = new gue$a
            lue r2 = p000.lue.f58832c
            r1.<init>(r2)
            return r1
        L13:
            r5 = -1
            if (r3 == r5) goto L18
            r6 = r3
            goto L1a
        L18:
            int r6 = r0.f31525F
        L1a:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = -1
            if (r6 == r5) goto L58
            r4 = r4[r6]
            t6h r4 = r4.f31553b
            int r6 = getSynchronizationSampleIndex(r4, r1)
            if (r6 != r5) goto L35
            gue$a r1 = new gue$a
            lue r2 = p000.lue.f58832c
            r1.<init>(r2)
            return r1
        L35:
            long[] r11 = r4.f83878f
            r12 = r11[r6]
            long[] r11 = r4.f83875c
            r14 = r11[r6]
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 >= 0) goto L5e
            int r11 = r4.f83874b
            int r11 = r11 + (-1)
            if (r6 >= r11) goto L5e
            int r1 = r4.getIndexOfLaterOrEqualSynchronizationSample(r1)
            if (r1 == r5) goto L5e
            if (r1 == r6) goto L5e
            long[] r2 = r4.f83878f
            r9 = r2[r1]
            long[] r2 = r4.f83875c
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
            e1b$b[] r4 = r0.f31523D
            int r5 = r4.length
            if (r3 >= r5) goto L80
            int r5 = r0.f31525F
            if (r3 == r5) goto L7d
            r4 = r4[r3]
            t6h r4 = r4.f31553b
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
            lue r3 = new lue
            r3.<init>(r12, r14)
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 != 0) goto L8f
            gue$a r1 = new gue$a
            r1.<init>(r3)
            return r1
        L8f:
            lue r4 = new lue
            r4.<init>(r9, r1)
            gue$a r1 = new gue$a
            r1.<init>(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.e1b.getSeekPoints(long, int):gue$a");
    }

    @Override // p000.xj5
    public kx7<huf> getSniffFailureDetails() {
        return this.f31538m;
    }

    @Deprecated
    public e1b(int i) {
        this(peg.InterfaceC10936a.f70575a, i);
    }

    public e1b(peg.InterfaceC10936a interfaceC10936a, int i) {
        this.f31529d = interfaceC10936a;
        this.f31530e = i;
        this.f31538m = kx7.m15110of();
        this.f31539n = (i & 4) != 0 ? 3 : 0;
        this.f31536k = new pue();
        this.f31537l = new ArrayList();
        this.f31534i = new jhc(16);
        this.f31535j = new ArrayDeque<>();
        this.f31531f = new jhc(n8b.f63496C);
        this.f31532g = new jhc(6);
        this.f31533h = new jhc();
        this.f31544s = -1;
        this.f31522C = bk5.f13929y;
        this.f31523D = new C5044b[0];
    }
}

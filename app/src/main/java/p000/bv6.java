package p000;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.C1213a;
import androidx.media3.common.DrmInitData;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.tensorflow.lite.schema.BuiltinOptions;
import p000.gue;
import p000.peg;
import p000.w1e;
import p000.y0b;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class bv6 implements xj5 {

    /* JADX INFO: renamed from: S */
    public static final int f14855S = 1;

    /* JADX INFO: renamed from: T */
    public static final int f14856T = 2;

    /* JADX INFO: renamed from: U */
    public static final int f14857U = 4;

    /* JADX INFO: renamed from: V */
    public static final int f14858V = 16;

    /* JADX INFO: renamed from: W */
    public static final int f14859W = 32;

    /* JADX INFO: renamed from: X */
    public static final int f14860X = 64;

    /* JADX INFO: renamed from: Y */
    public static final int f14861Y = 128;

    /* JADX INFO: renamed from: Z */
    public static final int f14862Z = 256;

    /* JADX INFO: renamed from: b0 */
    public static final String f14864b0 = "FragmentedMp4Extractor";

    /* JADX INFO: renamed from: c0 */
    public static final int f14865c0 = 1936025959;

    /* JADX INFO: renamed from: f0 */
    public static final int f14868f0 = 100;

    /* JADX INFO: renamed from: g0 */
    public static final int f14869g0 = 0;

    /* JADX INFO: renamed from: h0 */
    public static final int f14870h0 = 1;

    /* JADX INFO: renamed from: i0 */
    public static final int f14871i0 = 2;

    /* JADX INFO: renamed from: j0 */
    public static final int f14872j0 = 3;

    /* JADX INFO: renamed from: k0 */
    public static final int f14873k0 = 4;

    /* JADX INFO: renamed from: A */
    @hib
    public jhc f14874A;

    /* JADX INFO: renamed from: B */
    public long f14875B;

    /* JADX INFO: renamed from: C */
    public int f14876C;

    /* JADX INFO: renamed from: D */
    public long f14877D;

    /* JADX INFO: renamed from: E */
    public long f14878E;

    /* JADX INFO: renamed from: F */
    public long f14879F;

    /* JADX INFO: renamed from: G */
    @hib
    public C2067c f14880G;

    /* JADX INFO: renamed from: H */
    public int f14881H;

    /* JADX INFO: renamed from: I */
    public int f14882I;

    /* JADX INFO: renamed from: J */
    public int f14883J;

    /* JADX INFO: renamed from: K */
    public boolean f14884K;

    /* JADX INFO: renamed from: L */
    public boolean f14885L;

    /* JADX INFO: renamed from: M */
    public bk5 f14886M;

    /* JADX INFO: renamed from: N */
    public q6h[] f14887N;

    /* JADX INFO: renamed from: O */
    public q6h[] f14888O;

    /* JADX INFO: renamed from: P */
    public boolean f14889P;

    /* JADX INFO: renamed from: Q */
    public boolean f14890Q;

    /* JADX INFO: renamed from: R */
    public long f14891R;

    /* JADX INFO: renamed from: d */
    public final peg.InterfaceC10936a f14892d;

    /* JADX INFO: renamed from: e */
    public final int f14893e;

    /* JADX INFO: renamed from: f */
    @hib
    public final y5h f14894f;

    /* JADX INFO: renamed from: g */
    public final List<C1213a> f14895g;

    /* JADX INFO: renamed from: h */
    public final SparseArray<C2067c> f14896h;

    /* JADX INFO: renamed from: i */
    public final jhc f14897i;

    /* JADX INFO: renamed from: j */
    public final jhc f14898j;

    /* JADX INFO: renamed from: k */
    public final jhc f14899k;

    /* JADX INFO: renamed from: l */
    public final byte[] f14900l;

    /* JADX INFO: renamed from: m */
    public final jhc f14901m;

    /* JADX INFO: renamed from: n */
    @hib
    public final h2h f14902n;

    /* JADX INFO: renamed from: o */
    public final o65 f14903o;

    /* JADX INFO: renamed from: p */
    public final jhc f14904p;

    /* JADX INFO: renamed from: q */
    public final ArrayDeque<y0b.C15366b> f14905q;

    /* JADX INFO: renamed from: r */
    public final ArrayDeque<C2066b> f14906r;

    /* JADX INFO: renamed from: s */
    public final w1e f14907s;

    /* JADX INFO: renamed from: t */
    @hib
    public final q6h f14908t;

    /* JADX INFO: renamed from: u */
    public final nz1 f14909u;

    /* JADX INFO: renamed from: v */
    public kx7<huf> f14910v;

    /* JADX INFO: renamed from: w */
    public int f14911w;

    /* JADX INFO: renamed from: x */
    public int f14912x;

    /* JADX INFO: renamed from: y */
    public long f14913y;

    /* JADX INFO: renamed from: z */
    public int f14914z;

    /* JADX INFO: renamed from: a0 */
    @Deprecated
    public static final ik5 f14863a0 = new ik5() { // from class: yu6
        @Override // p000.ik5
        public final xj5[] createExtractors() {
            return bv6.lambda$static$1();
        }
    };

    /* JADX INFO: renamed from: d0 */
    public static final byte[] f14866d0 = {-94, BuiltinOptions.ArgMinOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.AddNOptions, BuiltinOptions.MatrixSetDiagOptions, -101, BuiltinOptions.SplitVOptions, 20, -94, BuiltinOptions.FillOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.SquareOptions, BuiltinOptions.BitcastOptions, 100, -115, -12};

    /* JADX INFO: renamed from: e0 */
    public static final C1213a f14867e0 = new C1213a.b().setSampleMimeType("application/x-emsg").build();

    /* JADX INFO: renamed from: bv6$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC2065a {
    }

    /* JADX INFO: renamed from: bv6$b */
    public static final class C2066b {

        /* JADX INFO: renamed from: a */
        public final long f14915a;

        /* JADX INFO: renamed from: b */
        public final boolean f14916b;

        /* JADX INFO: renamed from: c */
        public final int f14917c;

        public C2066b(long j, boolean z, int i) {
            this.f14915a = j;
            this.f14916b = z;
            this.f14917c = i;
        }
    }

    /* JADX INFO: renamed from: bv6$c */
    public static final class C2067c {

        /* JADX INFO: renamed from: n */
        public static final int f14918n = 8;

        /* JADX INFO: renamed from: a */
        public final q6h f14919a;

        /* JADX INFO: renamed from: d */
        public t6h f14922d;

        /* JADX INFO: renamed from: e */
        public dz3 f14923e;

        /* JADX INFO: renamed from: f */
        public int f14924f;

        /* JADX INFO: renamed from: g */
        public int f14925g;

        /* JADX INFO: renamed from: h */
        public int f14926h;

        /* JADX INFO: renamed from: i */
        public int f14927i;

        /* JADX INFO: renamed from: j */
        public final C1213a f14928j;

        /* JADX INFO: renamed from: m */
        public boolean f14931m;

        /* JADX INFO: renamed from: b */
        public final d6h f14920b = new d6h();

        /* JADX INFO: renamed from: c */
        public final jhc f14921c = new jhc();

        /* JADX INFO: renamed from: k */
        public final jhc f14929k = new jhc(1);

        /* JADX INFO: renamed from: l */
        public final jhc f14930l = new jhc();

        public C2067c(q6h q6hVar, t6h t6hVar, dz3 dz3Var, C1213a c1213a) {
            this.f14919a = q6hVar;
            this.f14922d = t6hVar;
            this.f14923e = dz3Var;
            this.f14928j = c1213a;
            reset(t6hVar, dz3Var);
        }

        public int getCurrentSampleFlags() {
            int i = !this.f14931m ? this.f14922d.f83879g[this.f14924f] : this.f14920b.f28586k[this.f14924f] ? 1 : 0;
            return getEncryptionBoxIfEncrypted() != null ? i | 1073741824 : i;
        }

        public long getCurrentSampleOffset() {
            return !this.f14931m ? this.f14922d.f83875c[this.f14924f] : this.f14920b.f28582g[this.f14926h];
        }

        public long getCurrentSamplePresentationTimeUs() {
            return !this.f14931m ? this.f14922d.f83878f[this.f14924f] : this.f14920b.getSamplePresentationTimeUs(this.f14924f);
        }

        public int getCurrentSampleSize() {
            return !this.f14931m ? this.f14922d.f83876d[this.f14924f] : this.f14920b.f28584i[this.f14924f];
        }

        @hib
        public b6h getEncryptionBoxIfEncrypted() {
            if (!this.f14931m) {
                return null;
            }
            int i = ((dz3) t0i.castNonNull(this.f14920b.f28576a)).f31345a;
            b6h sampleDescriptionEncryptionBox = this.f14920b.f28589n;
            if (sampleDescriptionEncryptionBox == null) {
                sampleDescriptionEncryptionBox = this.f14922d.f83873a.getSampleDescriptionEncryptionBox(i);
            }
            if (sampleDescriptionEncryptionBox == null || !sampleDescriptionEncryptionBox.f12818a) {
                return null;
            }
            return sampleDescriptionEncryptionBox;
        }

        public boolean next() {
            this.f14924f++;
            if (!this.f14931m) {
                return false;
            }
            int i = this.f14925g + 1;
            this.f14925g = i;
            int[] iArr = this.f14920b.f28583h;
            int i2 = this.f14926h;
            if (i != iArr[i2]) {
                return true;
            }
            this.f14926h = i2 + 1;
            this.f14925g = 0;
            return false;
        }

        public int outputSampleEncryptionData(int i, int i2) {
            jhc jhcVar;
            b6h encryptionBoxIfEncrypted = getEncryptionBoxIfEncrypted();
            if (encryptionBoxIfEncrypted == null) {
                return 0;
            }
            int length = encryptionBoxIfEncrypted.f12821d;
            if (length != 0) {
                jhcVar = this.f14920b.f28590o;
            } else {
                byte[] bArr = (byte[]) t0i.castNonNull(encryptionBoxIfEncrypted.f12822e);
                this.f14930l.reset(bArr, bArr.length);
                jhc jhcVar2 = this.f14930l;
                length = bArr.length;
                jhcVar = jhcVar2;
            }
            boolean zSampleHasSubsampleEncryptionTable = this.f14920b.sampleHasSubsampleEncryptionTable(this.f14924f);
            boolean z = zSampleHasSubsampleEncryptionTable || i2 != 0;
            this.f14929k.getData()[0] = (byte) ((z ? 128 : 0) | length);
            this.f14929k.setPosition(0);
            this.f14919a.sampleData(this.f14929k, 1, 1);
            this.f14919a.sampleData(jhcVar, length, 1);
            if (!z) {
                return length + 1;
            }
            if (!zSampleHasSubsampleEncryptionTable) {
                this.f14921c.reset(8);
                byte[] data = this.f14921c.getData();
                data[0] = 0;
                data[1] = 1;
                data[2] = (byte) ((i2 >> 8) & 255);
                data[3] = (byte) (i2 & 255);
                data[4] = (byte) ((i >> 24) & 255);
                data[5] = (byte) ((i >> 16) & 255);
                data[6] = (byte) ((i >> 8) & 255);
                data[7] = (byte) (i & 255);
                this.f14919a.sampleData(this.f14921c, 8, 1);
                return length + 9;
            }
            jhc jhcVar3 = this.f14920b.f28590o;
            int unsignedShort = jhcVar3.readUnsignedShort();
            jhcVar3.skipBytes(-2);
            int i3 = (unsignedShort * 6) + 2;
            if (i2 != 0) {
                this.f14921c.reset(i3);
                byte[] data2 = this.f14921c.getData();
                jhcVar3.readBytes(data2, 0, i3);
                int i4 = (((data2[2] & 255) << 8) | (data2[3] & 255)) + i2;
                data2[2] = (byte) ((i4 >> 8) & 255);
                data2[3] = (byte) (i4 & 255);
                jhcVar3 = this.f14921c;
            }
            this.f14919a.sampleData(jhcVar3, i3, 1);
            return length + 1 + i3;
        }

        public void reset(t6h t6hVar, dz3 dz3Var) {
            this.f14922d = t6hVar;
            this.f14923e = dz3Var;
            this.f14919a.format(this.f14928j);
            resetFragmentInfo();
        }

        public void resetFragmentInfo() {
            this.f14920b.reset();
            this.f14924f = 0;
            this.f14926h = 0;
            this.f14925g = 0;
            this.f14927i = 0;
            this.f14931m = false;
        }

        public void seek(long j) {
            int i = this.f14924f;
            while (true) {
                d6h d6hVar = this.f14920b;
                if (i >= d6hVar.f28581f || d6hVar.getSamplePresentationTimeUs(i) > j) {
                    return;
                }
                if (this.f14920b.f28586k[i]) {
                    this.f14927i = i;
                }
                i++;
            }
        }

        public void skipSampleEncryptionData() {
            b6h encryptionBoxIfEncrypted = getEncryptionBoxIfEncrypted();
            if (encryptionBoxIfEncrypted == null) {
                return;
            }
            jhc jhcVar = this.f14920b.f28590o;
            int i = encryptionBoxIfEncrypted.f12821d;
            if (i != 0) {
                jhcVar.skipBytes(i);
            }
            if (this.f14920b.sampleHasSubsampleEncryptionTable(this.f14924f)) {
                jhcVar.skipBytes(jhcVar.readUnsignedShort() * 6);
            }
        }

        public void updateDrmInitData(DrmInitData drmInitData) {
            b6h sampleDescriptionEncryptionBox = this.f14922d.f83873a.getSampleDescriptionEncryptionBox(((dz3) t0i.castNonNull(this.f14920b.f28576a)).f31345a);
            this.f14919a.format(this.f14928j.buildUpon().setDrmInitData(drmInitData.copyWithSchemeType(sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.f12819b : null)).build());
        }
    }

    @Deprecated
    public bv6() {
        this(peg.InterfaceC10936a.f70575a, 32, null, null, kx7.m15110of(), null);
    }

    private boolean canReadWithinGopSampleDependencies(C1213a c1213a) {
        return Objects.equals(c1213a.f8291o, "video/avc") ? (this.f14893e & 64) != 0 : Objects.equals(c1213a.f8291o, "video/hevc") && (this.f14893e & 128) != 0;
    }

    private static int checkNonNegative(int i) throws yhc {
        if (i >= 0) {
            return i;
        }
        throw yhc.createForMalformedContainer("Unexpected negative value: " + i, null);
    }

    public static int codecsToParseWithinGopSampleDependenciesAsFlags(int i) {
        int i2 = (i & 1) != 0 ? 64 : 0;
        return (i & 2) != 0 ? i2 | 128 : i2;
    }

    private void enterReadingAtomHeaderState() {
        this.f14911w = 0;
        this.f14914z = 0;
    }

    private dz3 getDefaultSampleValues(SparseArray<dz3> sparseArray, int i) {
        return sparseArray.size() == 1 ? sparseArray.valueAt(0) : (dz3) v80.checkNotNull(sparseArray.get(i));
    }

    @hib
    private static DrmInitData getDrmInitDataFromAtoms(List<y0b.C15367c> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            y0b.C15367c c15367c = list.get(i);
            if (c15367c.f99981a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] data = c15367c.f99985W1.getData();
                UUID uuid = ejd.parseUuid(data);
                if (uuid == null) {
                    xh9.m25148w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuid, "video/mp4", data));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    @hib
    private static C2067c getNextTrackBundle(SparseArray<C2067c> sparseArray) {
        int size = sparseArray.size();
        C2067c c2067c = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            C2067c c2067cValueAt = sparseArray.valueAt(i);
            if ((c2067cValueAt.f14931m || c2067cValueAt.f14924f != c2067cValueAt.f14922d.f83874b) && (!c2067cValueAt.f14931m || c2067cValueAt.f14926h != c2067cValueAt.f14920b.f28580e)) {
                long currentSampleOffset = c2067cValueAt.getCurrentSampleOffset();
                if (currentSampleOffset < j) {
                    c2067c = c2067cValueAt;
                    j = currentSampleOffset;
                }
            }
        }
        return c2067c;
    }

    private void initExtraTracks() {
        int i;
        q6h[] q6hVarArr = new q6h[2];
        this.f14887N = q6hVarArr;
        q6h q6hVar = this.f14908t;
        int i2 = 0;
        if (q6hVar != null) {
            q6hVarArr[0] = q6hVar;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.f14893e & 4) != 0) {
            q6hVarArr[i] = this.f14886M.track(100, 5);
            i3 = 101;
            i++;
        }
        q6h[] q6hVarArr2 = (q6h[]) t0i.nullSafeArrayCopy(this.f14887N, i);
        this.f14887N = q6hVarArr2;
        for (q6h q6hVar2 : q6hVarArr2) {
            q6hVar2.format(f14867e0);
        }
        this.f14888O = new q6h[this.f14895g.size()];
        while (i2 < this.f14888O.length) {
            q6h q6hVarTrack = this.f14886M.track(i3, 3);
            q6hVarTrack.format(this.f14895g.get(i2));
            this.f14888O[i2] = q6hVarTrack;
            i2++;
            i3++;
        }
    }

    private static boolean isEdtsListDurationForEntireMediaTimeline(y5h y5hVar) {
        long[] jArr = y5hVar.f100450i;
        if (jArr == null || jArr.length != 1 || y5hVar.f100451j == null) {
            return false;
        }
        long j = jArr[0];
        return j == 0 || t0i.scaleLargeTimestamp(j, 1000000L, y5hVar.f100445d) + t0i.scaleLargeTimestamp(y5hVar.f100451j[0], 1000000L, y5hVar.f100444c) >= y5hVar.f100446e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(long j, jhc jhcVar) {
        lt1.consume(j, jhcVar, this.f14888O);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ xj5[] lambda$newFactory$0(peg.InterfaceC10936a interfaceC10936a) {
        return new xj5[]{new bv6(interfaceC10936a)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ xj5[] lambda$static$1() {
        return new xj5[]{new bv6(peg.InterfaceC10936a.f70575a, 32)};
    }

    private void maybeSkipRemainingMetaAtomHeaderBytes(ak5 ak5Var) throws IOException {
        this.f14901m.reset(8);
        ak5Var.peekFully(this.f14901m.getData(), 0, 8);
        rc1.maybeSkipRemainingMetaBoxHeaderBytes(this.f14901m);
        ak5Var.skipFully(this.f14901m.getPosition());
        ak5Var.resetPeekPosition();
    }

    public static ik5 newFactory(final peg.InterfaceC10936a interfaceC10936a) {
        return new ik5() { // from class: zu6
            @Override // p000.ik5
            public final xj5[] createExtractors() {
                return bv6.lambda$newFactory$0(interfaceC10936a);
            }
        };
    }

    private void onContainerAtomRead(y0b.C15366b c15366b) throws yhc {
        int i = c15366b.f99981a;
        if (i == 1836019574) {
            onMoovContainerAtomRead(c15366b);
        } else if (i == 1836019558) {
            onMoofContainerAtomRead(c15366b);
        } else {
            if (this.f14905q.isEmpty()) {
                return;
            }
            this.f14905q.peek().add(c15366b);
        }
    }

    private void onEmsgLeafAtomRead(jhc jhcVar) {
        long jScaleLargeTimestamp;
        String str;
        long jScaleLargeTimestamp2;
        String str2;
        long unsignedInt;
        long jAdjustSampleTimestamp;
        if (this.f14887N.length == 0) {
            return;
        }
        jhcVar.setPosition(8);
        int fullBoxVersion = rc1.parseFullBoxVersion(jhcVar.readInt());
        if (fullBoxVersion == 0) {
            String str3 = (String) v80.checkNotNull(jhcVar.readNullTerminatedString());
            String str4 = (String) v80.checkNotNull(jhcVar.readNullTerminatedString());
            long unsignedInt2 = jhcVar.readUnsignedInt();
            jScaleLargeTimestamp = t0i.scaleLargeTimestamp(jhcVar.readUnsignedInt(), 1000000L, unsignedInt2);
            long j = this.f14879F;
            long j2 = j != -9223372036854775807L ? j + jScaleLargeTimestamp : -9223372036854775807L;
            str = str3;
            jScaleLargeTimestamp2 = t0i.scaleLargeTimestamp(jhcVar.readUnsignedInt(), 1000L, unsignedInt2);
            str2 = str4;
            unsignedInt = jhcVar.readUnsignedInt();
            jAdjustSampleTimestamp = j2;
        } else {
            if (fullBoxVersion != 1) {
                xh9.m25148w("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + fullBoxVersion);
                return;
            }
            long unsignedInt3 = jhcVar.readUnsignedInt();
            jAdjustSampleTimestamp = t0i.scaleLargeTimestamp(jhcVar.readUnsignedLongToLong(), 1000000L, unsignedInt3);
            long jScaleLargeTimestamp3 = t0i.scaleLargeTimestamp(jhcVar.readUnsignedInt(), 1000L, unsignedInt3);
            long unsignedInt4 = jhcVar.readUnsignedInt();
            str = (String) v80.checkNotNull(jhcVar.readNullTerminatedString());
            jScaleLargeTimestamp2 = jScaleLargeTimestamp3;
            unsignedInt = unsignedInt4;
            str2 = (String) v80.checkNotNull(jhcVar.readNullTerminatedString());
            jScaleLargeTimestamp = -9223372036854775807L;
        }
        byte[] bArr = new byte[jhcVar.bytesLeft()];
        jhcVar.readBytes(bArr, 0, jhcVar.bytesLeft());
        jhc jhcVar2 = new jhc(this.f14903o.encode(new k65(str, str2, jScaleLargeTimestamp2, unsignedInt, bArr)));
        int iBytesLeft = jhcVar2.bytesLeft();
        for (q6h q6hVar : this.f14887N) {
            jhcVar2.setPosition(0);
            q6hVar.sampleData(jhcVar2, iBytesLeft);
        }
        if (jAdjustSampleTimestamp == -9223372036854775807L) {
            this.f14906r.addLast(new C2066b(jScaleLargeTimestamp, true, iBytesLeft));
            this.f14876C += iBytesLeft;
            return;
        }
        if (!this.f14906r.isEmpty()) {
            this.f14906r.addLast(new C2066b(jAdjustSampleTimestamp, false, iBytesLeft));
            this.f14876C += iBytesLeft;
            return;
        }
        h2h h2hVar = this.f14902n;
        if (h2hVar != null && !h2hVar.isInitialized()) {
            this.f14906r.addLast(new C2066b(jAdjustSampleTimestamp, false, iBytesLeft));
            this.f14876C += iBytesLeft;
            return;
        }
        h2h h2hVar2 = this.f14902n;
        if (h2hVar2 != null) {
            jAdjustSampleTimestamp = h2hVar2.adjustSampleTimestamp(jAdjustSampleTimestamp);
        }
        for (q6h q6hVar2 : this.f14887N) {
            q6hVar2.sampleMetadata(jAdjustSampleTimestamp, 1, iBytesLeft, 0, null);
        }
    }

    private void onLeafAtomRead(y0b.C15367c c15367c, ak5 ak5Var) throws IOException {
        if (!this.f14905q.isEmpty()) {
            this.f14905q.peek().add(c15367c);
            return;
        }
        int i = c15367c.f99981a;
        if (i != 1936286840) {
            if (i == 1701671783) {
                onEmsgLeafAtomRead(c15367c.f99985W1);
                return;
            }
            return;
        }
        Pair<Long, mz1> sidx = parseSidx(c15367c.f99985W1, ak5Var.getPosition());
        this.f14909u.add((mz1) sidx.second);
        if (!this.f14889P) {
            this.f14879F = ((Long) sidx.first).longValue();
            this.f14886M.seekMap((gue) sidx.second);
            this.f14889P = true;
        } else {
            if ((this.f14893e & 256) == 0 || this.f14890Q || this.f14909u.size() <= 1) {
                return;
            }
            this.f14891R = ak5Var.getPosition();
        }
    }

    private void onMoofContainerAtomRead(y0b.C15366b c15366b) throws yhc {
        parseMoof(c15366b, this.f14896h, this.f14894f != null, this.f14893e, this.f14900l);
        DrmInitData drmInitDataFromAtoms = getDrmInitDataFromAtoms(c15366b.f99983X1);
        if (drmInitDataFromAtoms != null) {
            int size = this.f14896h.size();
            for (int i = 0; i < size; i++) {
                this.f14896h.valueAt(i).updateDrmInitData(drmInitDataFromAtoms);
            }
        }
        if (this.f14877D != -9223372036854775807L) {
            int size2 = this.f14896h.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f14896h.valueAt(i2).seek(this.f14877D);
            }
            this.f14877D = -9223372036854775807L;
        }
    }

    private void onMoovContainerAtomRead(y0b.C15366b c15366b) throws yhc {
        int i = 0;
        v80.checkState(this.f14894f == null, "Unexpected moov box.");
        DrmInitData drmInitDataFromAtoms = getDrmInitDataFromAtoms(c15366b.f99983X1);
        y0b.C15366b c15366b2 = (y0b.C15366b) v80.checkNotNull(c15366b.getContainerBoxOfType(1836475768));
        SparseArray<dz3> sparseArray = new SparseArray<>();
        int size = c15366b2.f99983X1.size();
        long mehd = -9223372036854775807L;
        for (int i2 = 0; i2 < size; i2++) {
            y0b.C15367c c15367c = c15366b2.f99983X1.get(i2);
            int i3 = c15367c.f99981a;
            if (i3 == 1953654136) {
                Pair<Integer, dz3> trex = parseTrex(c15367c.f99985W1);
                sparseArray.put(((Integer) trex.first).intValue(), (dz3) trex.second);
            } else if (i3 == 1835362404) {
                mehd = parseMehd(c15367c.f99985W1);
            }
        }
        y0b.C15366b containerBoxOfType = c15366b.getContainerBoxOfType(1835365473);
        eta udta = null;
        eta mdtaFromMeta = containerBoxOfType != null ? rc1.parseMdtaFromMeta(containerBoxOfType) : null;
        o27 o27Var = new o27();
        y0b.C15367c leafBoxOfType = c15366b.getLeafBoxOfType(1969517665);
        if (leafBoxOfType != null) {
            udta = rc1.parseUdta(leafBoxOfType);
            o27Var.setFromMetadata(udta);
        }
        eta etaVar = udta;
        eta etaVar2 = new eta(rc1.parseMvhd(((y0b.C15367c) v80.checkNotNull(c15366b.getLeafBoxOfType(1836476516))).f99985W1));
        List<t6h> traks = rc1.parseTraks(c15366b, o27Var, mehd, drmInitDataFromAtoms, (this.f14893e & 16) != 0, false, new lz6() { // from class: wu6
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return this.f95529a.m3433d((y5h) obj);
            }
        });
        int size2 = traks.size();
        if (this.f14896h.size() != 0) {
            v80.checkState(this.f14896h.size() == size2);
            while (i < size2) {
                t6h t6hVar = traks.get(i);
                y5h y5hVar = t6hVar.f83873a;
                this.f14896h.get(y5hVar.f100442a).reset(t6hVar, getDefaultSampleValues(sparseArray, y5hVar.f100442a));
                i++;
            }
            return;
        }
        String containerMimeType = qva.getContainerMimeType(traks);
        while (i < size2) {
            t6h t6hVar2 = traks.get(i);
            y5h y5hVar2 = t6hVar2.f83873a;
            q6h q6hVarTrack = this.f14886M.track(i, y5hVar2.f100443b);
            q6hVarTrack.durationUs(y5hVar2.f100446e);
            C1213a.b bVarBuildUpon = y5hVar2.f100448g.buildUpon();
            bVarBuildUpon.setContainerMimeType(containerMimeType);
            mua.setFormatGaplessInfo(y5hVar2.f100443b, o27Var, bVarBuildUpon);
            mua.setFormatMetadata(y5hVar2.f100443b, mdtaFromMeta, bVarBuildUpon, y5hVar2.f100448g.f8288l, etaVar, etaVar2);
            this.f14896h.put(y5hVar2.f100442a, new C2067c(q6hVarTrack, t6hVar2, getDefaultSampleValues(sparseArray, y5hVar2.f100442a), bVarBuildUpon.build()));
            this.f14878E = Math.max(this.f14878E, y5hVar2.f100446e);
            i++;
            containerMimeType = containerMimeType;
        }
        this.f14886M.endTracks();
    }

    private void outputPendingMetadataSamples(long j) {
        while (!this.f14906r.isEmpty()) {
            C2066b c2066bRemoveFirst = this.f14906r.removeFirst();
            this.f14876C -= c2066bRemoveFirst.f14917c;
            long jAdjustSampleTimestamp = c2066bRemoveFirst.f14915a;
            if (c2066bRemoveFirst.f14916b) {
                jAdjustSampleTimestamp += j;
            }
            h2h h2hVar = this.f14902n;
            if (h2hVar != null) {
                jAdjustSampleTimestamp = h2hVar.adjustSampleTimestamp(jAdjustSampleTimestamp);
            }
            for (q6h q6hVar : this.f14887N) {
                q6hVar.sampleMetadata(jAdjustSampleTimestamp, 1, c2066bRemoveFirst.f14917c, this.f14876C, null);
            }
        }
    }

    private static long parseMehd(jhc jhcVar) {
        jhcVar.setPosition(8);
        return rc1.parseFullBoxVersion(jhcVar.readInt()) == 0 ? jhcVar.readUnsignedInt() : jhcVar.readUnsignedLongToLong();
    }

    private static void parseMoof(y0b.C15366b c15366b, SparseArray<C2067c> sparseArray, boolean z, int i, byte[] bArr) throws yhc {
        int size = c15366b.f99984Y1.size();
        for (int i2 = 0; i2 < size; i2++) {
            y0b.C15366b c15366b2 = c15366b.f99984Y1.get(i2);
            if (c15366b2.f99981a == 1953653094) {
                parseTraf(c15366b2, sparseArray, z, i, bArr);
            }
        }
    }

    private static void parseSaio(jhc jhcVar, d6h d6hVar) throws yhc {
        jhcVar.setPosition(8);
        int i = jhcVar.readInt();
        if ((rc1.parseFullBoxFlags(i) & 1) == 1) {
            jhcVar.skipBytes(8);
        }
        int unsignedIntToInt = jhcVar.readUnsignedIntToInt();
        if (unsignedIntToInt == 1) {
            d6hVar.f28579d += rc1.parseFullBoxVersion(i) == 0 ? jhcVar.readUnsignedInt() : jhcVar.readUnsignedLongToLong();
        } else {
            throw yhc.createForMalformedContainer("Unexpected saio entry count: " + unsignedIntToInt, null);
        }
    }

    private static void parseSaiz(b6h b6hVar, jhc jhcVar, d6h d6hVar) throws yhc {
        int i;
        int i2 = b6hVar.f12821d;
        jhcVar.setPosition(8);
        if ((rc1.parseFullBoxFlags(jhcVar.readInt()) & 1) == 1) {
            jhcVar.skipBytes(8);
        }
        int unsignedByte = jhcVar.readUnsignedByte();
        int unsignedIntToInt = jhcVar.readUnsignedIntToInt();
        if (unsignedIntToInt > d6hVar.f28581f) {
            throw yhc.createForMalformedContainer("Saiz sample count " + unsignedIntToInt + " is greater than fragment sample count" + d6hVar.f28581f, null);
        }
        if (unsignedByte == 0) {
            boolean[] zArr = d6hVar.f28588m;
            i = 0;
            for (int i3 = 0; i3 < unsignedIntToInt; i3++) {
                int unsignedByte2 = jhcVar.readUnsignedByte();
                i += unsignedByte2;
                zArr[i3] = unsignedByte2 > i2;
            }
        } else {
            i = unsignedByte * unsignedIntToInt;
            Arrays.fill(d6hVar.f28588m, 0, unsignedIntToInt, unsignedByte > i2);
        }
        Arrays.fill(d6hVar.f28588m, unsignedIntToInt, d6hVar.f28581f, false);
        if (i > 0) {
            d6hVar.initEncryptionData(i);
        }
    }

    private static void parseSampleGroups(y0b.C15366b c15366b, @hib String str, d6h d6hVar) throws yhc {
        byte[] bArr = null;
        jhc jhcVar = null;
        jhc jhcVar2 = null;
        for (int i = 0; i < c15366b.f99983X1.size(); i++) {
            y0b.C15367c c15367c = c15366b.f99983X1.get(i);
            jhc jhcVar3 = c15367c.f99985W1;
            int i2 = c15367c.f99981a;
            if (i2 == 1935828848) {
                jhcVar3.setPosition(12);
                if (jhcVar3.readInt() == 1936025959) {
                    jhcVar = jhcVar3;
                }
            } else if (i2 == 1936158820) {
                jhcVar3.setPosition(12);
                if (jhcVar3.readInt() == 1936025959) {
                    jhcVar2 = jhcVar3;
                }
            }
        }
        if (jhcVar == null || jhcVar2 == null) {
            return;
        }
        jhcVar.setPosition(8);
        int fullBoxVersion = rc1.parseFullBoxVersion(jhcVar.readInt());
        jhcVar.skipBytes(4);
        if (fullBoxVersion == 1) {
            jhcVar.skipBytes(4);
        }
        if (jhcVar.readInt() != 1) {
            throw yhc.createForUnsupportedContainerFeature("Entry count in sbgp != 1 (unsupported).");
        }
        jhcVar2.setPosition(8);
        int fullBoxVersion2 = rc1.parseFullBoxVersion(jhcVar2.readInt());
        jhcVar2.skipBytes(4);
        if (fullBoxVersion2 == 1) {
            if (jhcVar2.readUnsignedInt() == 0) {
                throw yhc.createForUnsupportedContainerFeature("Variable length description in sgpd found (unsupported)");
            }
        } else if (fullBoxVersion2 >= 2) {
            jhcVar2.skipBytes(4);
        }
        if (jhcVar2.readUnsignedInt() != 1) {
            throw yhc.createForUnsupportedContainerFeature("Entry count in sgpd != 1 (unsupported).");
        }
        jhcVar2.skipBytes(1);
        int unsignedByte = jhcVar2.readUnsignedByte();
        int i3 = (unsignedByte & 240) >> 4;
        int i4 = unsignedByte & 15;
        boolean z = jhcVar2.readUnsignedByte() == 1;
        if (z) {
            int unsignedByte2 = jhcVar2.readUnsignedByte();
            byte[] bArr2 = new byte[16];
            jhcVar2.readBytes(bArr2, 0, 16);
            if (unsignedByte2 == 0) {
                int unsignedByte3 = jhcVar2.readUnsignedByte();
                bArr = new byte[unsignedByte3];
                jhcVar2.readBytes(bArr, 0, unsignedByte3);
            }
            d6hVar.f28587l = true;
            d6hVar.f28589n = new b6h(z, str, unsignedByte2, bArr2, i3, i4, bArr);
        }
    }

    private static void parseSenc(jhc jhcVar, d6h d6hVar) throws yhc {
        parseSenc(jhcVar, 0, d6hVar);
    }

    private static Pair<Long, mz1> parseSidx(jhc jhcVar, long j) throws yhc {
        long unsignedLongToLong;
        long unsignedLongToLong2;
        jhcVar.setPosition(8);
        int fullBoxVersion = rc1.parseFullBoxVersion(jhcVar.readInt());
        jhcVar.skipBytes(4);
        long unsignedInt = jhcVar.readUnsignedInt();
        if (fullBoxVersion == 0) {
            unsignedLongToLong = jhcVar.readUnsignedInt();
            unsignedLongToLong2 = jhcVar.readUnsignedInt();
        } else {
            unsignedLongToLong = jhcVar.readUnsignedLongToLong();
            unsignedLongToLong2 = jhcVar.readUnsignedLongToLong();
        }
        long j2 = unsignedLongToLong;
        long j3 = j + unsignedLongToLong2;
        long jScaleLargeTimestamp = t0i.scaleLargeTimestamp(j2, 1000000L, unsignedInt);
        jhcVar.skipBytes(2);
        int unsignedShort = jhcVar.readUnsignedShort();
        int[] iArr = new int[unsignedShort];
        long[] jArr = new long[unsignedShort];
        long[] jArr2 = new long[unsignedShort];
        long[] jArr3 = new long[unsignedShort];
        long j4 = jScaleLargeTimestamp;
        int i = 0;
        long j5 = j2;
        while (i < unsignedShort) {
            int i2 = jhcVar.readInt();
            if ((i2 & Integer.MIN_VALUE) != 0) {
                throw yhc.createForMalformedContainer("Unhandled indirect reference", null);
            }
            long unsignedInt2 = jhcVar.readUnsignedInt();
            iArr[i] = i2 & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            long j6 = j5 + unsignedInt2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i3 = unsignedShort;
            int[] iArr2 = iArr;
            long jScaleLargeTimestamp2 = t0i.scaleLargeTimestamp(j6, 1000000L, unsignedInt);
            jArr4[i] = jScaleLargeTimestamp2 - jArr5[i];
            jhcVar.skipBytes(4);
            j3 += (long) iArr2[i];
            i++;
            iArr = iArr2;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            unsignedShort = i3;
            j5 = j6;
            j4 = jScaleLargeTimestamp2;
        }
        return Pair.create(Long.valueOf(jScaleLargeTimestamp), new mz1(iArr, jArr, jArr2, jArr3));
    }

    private static long parseTfdt(jhc jhcVar) {
        jhcVar.setPosition(8);
        return rc1.parseFullBoxVersion(jhcVar.readInt()) == 1 ? jhcVar.readUnsignedLongToLong() : jhcVar.readUnsignedInt();
    }

    @hib
    private static C2067c parseTfhd(jhc jhcVar, SparseArray<C2067c> sparseArray, boolean z) {
        jhcVar.setPosition(8);
        int fullBoxFlags = rc1.parseFullBoxFlags(jhcVar.readInt());
        C2067c c2067cValueAt = z ? sparseArray.valueAt(0) : sparseArray.get(jhcVar.readInt());
        if (c2067cValueAt == null) {
            return null;
        }
        if ((fullBoxFlags & 1) != 0) {
            long unsignedLongToLong = jhcVar.readUnsignedLongToLong();
            d6h d6hVar = c2067cValueAt.f14920b;
            d6hVar.f28578c = unsignedLongToLong;
            d6hVar.f28579d = unsignedLongToLong;
        }
        dz3 dz3Var = c2067cValueAt.f14923e;
        c2067cValueAt.f14920b.f28576a = new dz3((fullBoxFlags & 2) != 0 ? jhcVar.readInt() - 1 : dz3Var.f31345a, (fullBoxFlags & 8) != 0 ? jhcVar.readInt() : dz3Var.f31346b, (fullBoxFlags & 16) != 0 ? jhcVar.readInt() : dz3Var.f31347c, (fullBoxFlags & 32) != 0 ? jhcVar.readInt() : dz3Var.f31348d);
        return c2067cValueAt;
    }

    private static void parseTraf(y0b.C15366b c15366b, SparseArray<C2067c> sparseArray, boolean z, int i, byte[] bArr) throws yhc {
        C2067c tfhd = parseTfhd(((y0b.C15367c) v80.checkNotNull(c15366b.getLeafBoxOfType(1952868452))).f99985W1, sparseArray, z);
        if (tfhd == null) {
            return;
        }
        d6h d6hVar = tfhd.f14920b;
        long j = d6hVar.f28592q;
        boolean z2 = d6hVar.f28593r;
        tfhd.resetFragmentInfo();
        tfhd.f14931m = true;
        y0b.C15367c leafBoxOfType = c15366b.getLeafBoxOfType(1952867444);
        if (leafBoxOfType == null || (i & 2) != 0) {
            d6hVar.f28592q = j;
            d6hVar.f28593r = z2;
        } else {
            d6hVar.f28592q = parseTfdt(leafBoxOfType.f99985W1);
            d6hVar.f28593r = true;
        }
        parseTruns(c15366b, tfhd, i);
        b6h sampleDescriptionEncryptionBox = tfhd.f14922d.f83873a.getSampleDescriptionEncryptionBox(((dz3) v80.checkNotNull(d6hVar.f28576a)).f31345a);
        y0b.C15367c leafBoxOfType2 = c15366b.getLeafBoxOfType(1935763834);
        if (leafBoxOfType2 != null) {
            parseSaiz((b6h) v80.checkNotNull(sampleDescriptionEncryptionBox), leafBoxOfType2.f99985W1, d6hVar);
        }
        y0b.C15367c leafBoxOfType3 = c15366b.getLeafBoxOfType(1935763823);
        if (leafBoxOfType3 != null) {
            parseSaio(leafBoxOfType3.f99985W1, d6hVar);
        }
        y0b.C15367c leafBoxOfType4 = c15366b.getLeafBoxOfType(1936027235);
        if (leafBoxOfType4 != null) {
            parseSenc(leafBoxOfType4.f99985W1, d6hVar);
        }
        parseSampleGroups(c15366b, sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.f12819b : null, d6hVar);
        int size = c15366b.f99983X1.size();
        for (int i2 = 0; i2 < size; i2++) {
            y0b.C15367c c15367c = c15366b.f99983X1.get(i2);
            if (c15367c.f99981a == 1970628964) {
                parseUuid(c15367c.f99985W1, d6hVar, bArr);
            }
        }
    }

    private static Pair<Integer, dz3> parseTrex(jhc jhcVar) {
        jhcVar.setPosition(12);
        return Pair.create(Integer.valueOf(jhcVar.readInt()), new dz3(jhcVar.readInt() - 1, jhcVar.readInt(), jhcVar.readInt(), jhcVar.readInt()));
    }

    private static int parseTrun(C2067c c2067c, int i, int i2, jhc jhcVar, int i3) throws yhc {
        boolean z;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        boolean z4;
        boolean z5;
        int i6;
        C2067c c2067c2 = c2067c;
        jhcVar.setPosition(8);
        int fullBoxFlags = rc1.parseFullBoxFlags(jhcVar.readInt());
        y5h y5hVar = c2067c2.f14922d.f83873a;
        d6h d6hVar = c2067c2.f14920b;
        dz3 dz3Var = (dz3) t0i.castNonNull(d6hVar.f28576a);
        d6hVar.f28583h[i] = jhcVar.readUnsignedIntToInt();
        long[] jArr = d6hVar.f28582g;
        long j = d6hVar.f28578c;
        jArr[i] = j;
        if ((fullBoxFlags & 1) != 0) {
            jArr[i] = j + ((long) jhcVar.readInt());
        }
        boolean z6 = (fullBoxFlags & 4) != 0;
        int i7 = dz3Var.f31348d;
        if (z6) {
            i7 = jhcVar.readInt();
        }
        boolean z7 = (fullBoxFlags & 256) != 0;
        boolean z8 = (fullBoxFlags & 512) != 0;
        boolean z9 = (fullBoxFlags & 1024) != 0;
        boolean z10 = (fullBoxFlags & 2048) != 0;
        long j2 = isEdtsListDurationForEntireMediaTimeline(y5hVar) ? ((long[]) t0i.castNonNull(y5hVar.f100451j))[0] : 0L;
        int[] iArr = d6hVar.f28584i;
        long[] jArr2 = d6hVar.f28585j;
        boolean[] zArr = d6hVar.f28586k;
        int i8 = i7;
        boolean z11 = y5hVar.f100443b == 2 && (i2 & 1) != 0;
        int i9 = i3 + d6hVar.f28583h[i];
        boolean z12 = z11;
        long j3 = y5hVar.f100444c;
        long j4 = d6hVar.f28592q;
        int i10 = i3;
        while (i10 < i9) {
            int iCheckNonNegative = checkNonNegative(z7 ? jhcVar.readInt() : dz3Var.f31346b);
            if (z8) {
                i4 = jhcVar.readInt();
                z = z7;
            } else {
                z = z7;
                i4 = dz3Var.f31347c;
            }
            int iCheckNonNegative2 = checkNonNegative(i4);
            if (z9) {
                z2 = z6;
                i5 = jhcVar.readInt();
            } else if (i10 == 0 && z6) {
                z2 = z6;
                i5 = i8;
            } else {
                z2 = z6;
                i5 = dz3Var.f31348d;
            }
            if (z10) {
                z3 = z10;
                z4 = z8;
                z5 = z9;
                i6 = jhcVar.readInt();
            } else {
                z3 = z10;
                z4 = z8;
                z5 = z9;
                i6 = 0;
            }
            long jScaleLargeTimestamp = t0i.scaleLargeTimestamp((((long) i6) + j4) - j2, 1000000L, j3);
            jArr2[i10] = jScaleLargeTimestamp;
            if (!d6hVar.f28593r) {
                jArr2[i10] = jScaleLargeTimestamp + c2067c2.f14922d.f83880h;
            }
            iArr[i10] = iCheckNonNegative2;
            zArr[i10] = ((i5 >> 16) & 1) == 0 && (!z12 || i10 == 0);
            j4 += (long) iCheckNonNegative;
            i10++;
            c2067c2 = c2067c;
            z7 = z;
            z6 = z2;
            z10 = z3;
            z8 = z4;
            z9 = z5;
        }
        d6hVar.f28592q = j4;
        return i9;
    }

    private static void parseTruns(y0b.C15366b c15366b, C2067c c2067c, int i) throws yhc {
        List<y0b.C15367c> list = c15366b.f99983X1;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            y0b.C15367c c15367c = list.get(i4);
            if (c15367c.f99981a == 1953658222) {
                jhc jhcVar = c15367c.f99985W1;
                jhcVar.setPosition(12);
                int unsignedIntToInt = jhcVar.readUnsignedIntToInt();
                if (unsignedIntToInt > 0) {
                    i3 += unsignedIntToInt;
                    i2++;
                }
            }
        }
        c2067c.f14926h = 0;
        c2067c.f14925g = 0;
        c2067c.f14924f = 0;
        c2067c.f14920b.initTables(i2, i3);
        int i5 = 0;
        int trun = 0;
        for (int i6 = 0; i6 < size; i6++) {
            y0b.C15367c c15367c2 = list.get(i6);
            if (c15367c2.f99981a == 1953658222) {
                trun = parseTrun(c2067c, i5, i, c15367c2.f99985W1, trun);
                i5++;
            }
        }
    }

    private static void parseUuid(jhc jhcVar, d6h d6hVar, byte[] bArr) throws yhc {
        jhcVar.setPosition(8);
        jhcVar.readBytes(bArr, 0, 16);
        if (Arrays.equals(bArr, f14866d0)) {
            parseSenc(jhcVar, 16, d6hVar);
        }
    }

    private void processAtomEnded(long j) throws yhc {
        while (!this.f14905q.isEmpty() && this.f14905q.peek().f99982W1 == j) {
            onContainerAtomRead(this.f14905q.pop());
        }
        enterReadingAtomHeaderState();
    }

    private boolean readAtomHeader(ak5 ak5Var) throws IOException {
        if (this.f14914z == 0) {
            if (!ak5Var.readFully(this.f14904p.getData(), 0, 8, true)) {
                return false;
            }
            this.f14914z = 8;
            this.f14904p.setPosition(0);
            this.f14913y = this.f14904p.readUnsignedInt();
            this.f14912x = this.f14904p.readInt();
        }
        long j = this.f14913y;
        if (j == 1) {
            ak5Var.readFully(this.f14904p.getData(), 8, 8);
            this.f14914z += 8;
            this.f14913y = this.f14904p.readUnsignedLongToLong();
        } else if (j == 0) {
            long length = ak5Var.getLength();
            if (length == -1 && !this.f14905q.isEmpty()) {
                length = this.f14905q.peek().f99982W1;
            }
            if (length != -1) {
                this.f14913y = (length - ak5Var.getPosition()) + ((long) this.f14914z);
            }
        }
        long j2 = this.f14913y;
        int i = this.f14914z;
        if (j2 < i) {
            throw yhc.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        if (this.f14891R != -1) {
            if (this.f14912x == 1936286840) {
                this.f14901m.reset((int) j2);
                System.arraycopy(this.f14904p.getData(), 0, this.f14901m.getData(), 0, 8);
                ak5Var.readFully(this.f14901m.getData(), 8, (int) (this.f14913y - ((long) this.f14914z)));
                this.f14909u.add((mz1) parseSidx(new y0b.C15367c(1936286840, this.f14901m).f99985W1, ak5Var.getPeekPosition()).second);
            } else {
                ak5Var.skipFully((int) (j2 - ((long) i)), true);
            }
            enterReadingAtomHeaderState();
            return true;
        }
        long position = ak5Var.getPosition() - ((long) this.f14914z);
        int i2 = this.f14912x;
        if ((i2 == 1836019558 || i2 == 1835295092) && !this.f14889P) {
            this.f14886M.seekMap(new gue.C6549b(this.f14878E, position));
            this.f14889P = true;
        }
        if (this.f14912x == 1836019558) {
            int size = this.f14896h.size();
            for (int i3 = 0; i3 < size; i3++) {
                d6h d6hVar = this.f14896h.valueAt(i3).f14920b;
                d6hVar.f28577b = position;
                d6hVar.f28579d = position;
                d6hVar.f28578c = position;
            }
        }
        int i4 = this.f14912x;
        if (i4 == 1835295092) {
            this.f14880G = null;
            this.f14875B = position + this.f14913y;
            this.f14911w = 2;
            return true;
        }
        if (shouldParseContainerAtom(i4)) {
            long position2 = ak5Var.getPosition();
            long j3 = this.f14913y;
            long j4 = (position2 + j3) - 8;
            if (j3 != this.f14914z && this.f14912x == 1835365473) {
                maybeSkipRemainingMetaAtomHeaderBytes(ak5Var);
            }
            this.f14905q.push(new y0b.C15366b(this.f14912x, j4));
            if (this.f14913y == this.f14914z) {
                processAtomEnded(j4);
            } else {
                enterReadingAtomHeaderState();
            }
        } else if (shouldParseLeafAtom(this.f14912x)) {
            if (this.f14914z != 8) {
                throw yhc.createForUnsupportedContainerFeature("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.f14913y > 2147483647L) {
                throw yhc.createForUnsupportedContainerFeature("Leaf atom with length > 2147483647 (unsupported).");
            }
            jhc jhcVar = new jhc((int) this.f14913y);
            System.arraycopy(this.f14904p.getData(), 0, jhcVar.getData(), 0, 8);
            this.f14874A = jhcVar;
            this.f14911w = 1;
        } else {
            if (this.f14913y > 2147483647L) {
                throw yhc.createForUnsupportedContainerFeature("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f14874A = null;
            this.f14911w = 1;
        }
        return true;
    }

    private void readAtomPayload(ak5 ak5Var) throws IOException {
        int i = (int) (this.f14913y - ((long) this.f14914z));
        jhc jhcVar = this.f14874A;
        if (jhcVar != null) {
            ak5Var.readFully(jhcVar.getData(), 8, i);
            onLeafAtomRead(new y0b.C15367c(this.f14912x, jhcVar), ak5Var);
        } else {
            ak5Var.skipFully(i);
        }
        processAtomEnded(ak5Var.getPosition());
    }

    private void readEncryptionData(ak5 ak5Var) throws IOException {
        int size = this.f14896h.size();
        long j = Long.MAX_VALUE;
        C2067c c2067cValueAt = null;
        for (int i = 0; i < size; i++) {
            d6h d6hVar = this.f14896h.valueAt(i).f14920b;
            if (d6hVar.f28591p) {
                long j2 = d6hVar.f28579d;
                if (j2 < j) {
                    c2067cValueAt = this.f14896h.valueAt(i);
                    j = j2;
                }
            }
        }
        if (c2067cValueAt == null) {
            this.f14911w = 3;
            return;
        }
        int position = (int) (j - ak5Var.getPosition());
        if (position < 0) {
            throw yhc.createForMalformedContainer("Offset to encryption data was negative.", null);
        }
        ak5Var.skipFully(position);
        c2067cValueAt.f14920b.fillEncryptionData(ak5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean readSample(p000.ak5 r17) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 573
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bv6.readSample(ak5):boolean");
    }

    private static boolean shouldParseContainerAtom(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227 || i == 1835365473;
    }

    private static boolean shouldParseLeafAtom(int i) {
        return i == 1751411826 || i == 1835296868 || i == 1836476516 || i == 1936286840 || i == 1937011556 || i == 1937011827 || i == 1668576371 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1937011571 || i == 1952867444 || i == 1952868452 || i == 1953196132 || i == 1953654136 || i == 1953658222 || i == 1886614376 || i == 1935763834 || i == 1935763823 || i == 1936027235 || i == 1970628964 || i == 1935828848 || i == 1936158820 || i == 1701606260 || i == 1835362404 || i == 1701671783 || i == 1969517665 || i == 1801812339 || i == 1768715124;
    }

    @hib
    /* JADX INFO: renamed from: d */
    public y5h m3433d(@hib y5h y5hVar) {
        return y5hVar;
    }

    @Override // p000.xj5
    public void init(bk5 bk5Var) {
        if ((this.f14893e & 32) == 0) {
            bk5Var = new reg(bk5Var, this.f14892d);
        }
        this.f14886M = bk5Var;
        enterReadingAtomHeaderState();
        initExtraTracks();
        y5h y5hVar = this.f14894f;
        if (y5hVar != null) {
            C1213a.b bVarBuildUpon = y5hVar.f100448g.buildUpon();
            bVarBuildUpon.setContainerMimeType(qva.getContainerMimeType(this.f14894f.f100448g));
            this.f14896h.put(0, new C2067c(this.f14886M.track(0, this.f14894f.f100443b), new t6h(this.f14894f, new long[0], new int[0], 0, new long[0], new int[0], 0L), new dz3(0, 0, 0, 0), bVarBuildUpon.build()));
            this.f14886M.endTracks();
        }
    }

    @Override // p000.xj5
    public int read(ak5 ak5Var, d5d d5dVar) throws IOException {
        while (true) {
            int i = this.f14911w;
            if (i != 0) {
                if (i == 1) {
                    readAtomPayload(ak5Var);
                } else if (i == 2) {
                    readEncryptionData(ak5Var);
                } else if (readSample(ak5Var)) {
                    return 0;
                }
            } else if (!readAtomHeader(ak5Var)) {
                long j = this.f14891R;
                if (j == -1) {
                    this.f14907s.flush();
                    return -1;
                }
                d5dVar.f28476a = j;
                this.f14891R = -1L;
                this.f14886M.seekMap(this.f14909u.merge());
                this.f14890Q = true;
                return 1;
            }
        }
    }

    @Override // p000.xj5
    public void release() {
    }

    @Override // p000.xj5
    public void seek(long j, long j2) {
        int size = this.f14896h.size();
        for (int i = 0; i < size; i++) {
            this.f14896h.valueAt(i).resetFragmentInfo();
        }
        this.f14906r.clear();
        this.f14876C = 0;
        this.f14907s.clear();
        this.f14877D = j2;
        this.f14905q.clear();
        enterReadingAtomHeaderState();
    }

    @Override // p000.xj5
    public boolean sniff(ak5 ak5Var) throws IOException {
        huf hufVarSniffFragmented = iuf.sniffFragmented(ak5Var);
        this.f14910v = hufVarSniffFragmented != null ? kx7.m15111of(hufVarSniffFragmented) : kx7.m15110of();
        return hufVarSniffFragmented == null;
    }

    private static void parseSenc(jhc jhcVar, int i, d6h d6hVar) throws yhc {
        jhcVar.setPosition(i + 8);
        int fullBoxFlags = rc1.parseFullBoxFlags(jhcVar.readInt());
        if ((fullBoxFlags & 1) != 0) {
            throw yhc.createForUnsupportedContainerFeature("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (fullBoxFlags & 2) != 0;
        int unsignedIntToInt = jhcVar.readUnsignedIntToInt();
        if (unsignedIntToInt == 0) {
            Arrays.fill(d6hVar.f28588m, 0, d6hVar.f28581f, false);
            return;
        }
        if (unsignedIntToInt == d6hVar.f28581f) {
            Arrays.fill(d6hVar.f28588m, 0, unsignedIntToInt, z);
            d6hVar.initEncryptionData(jhcVar.bytesLeft());
            d6hVar.fillEncryptionData(jhcVar);
        } else {
            throw yhc.createForMalformedContainer("Senc sample count " + unsignedIntToInt + " is different from fragment sample count" + d6hVar.f28581f, null);
        }
    }

    @Override // p000.xj5
    public kx7<huf> getSniffFailureDetails() {
        return this.f14910v;
    }

    public bv6(peg.InterfaceC10936a interfaceC10936a) {
        this(interfaceC10936a, 0, null, null, kx7.m15110of(), null);
    }

    @Deprecated
    public bv6(int i) {
        this(peg.InterfaceC10936a.f70575a, i | 32, null, null, kx7.m15110of(), null);
    }

    public bv6(peg.InterfaceC10936a interfaceC10936a, int i) {
        this(interfaceC10936a, i, null, null, kx7.m15110of(), null);
    }

    @Deprecated
    public bv6(int i, @hib h2h h2hVar) {
        this(peg.InterfaceC10936a.f70575a, i | 32, h2hVar, null, kx7.m15110of(), null);
    }

    @Deprecated
    public bv6(int i, @hib h2h h2hVar, @hib y5h y5hVar) {
        this(peg.InterfaceC10936a.f70575a, i | 32, h2hVar, y5hVar, kx7.m15110of(), null);
    }

    @Deprecated
    public bv6(int i, @hib h2h h2hVar, @hib y5h y5hVar, List<C1213a> list) {
        this(peg.InterfaceC10936a.f70575a, i | 32, h2hVar, y5hVar, list, null);
    }

    @Deprecated
    public bv6(int i, @hib h2h h2hVar, @hib y5h y5hVar, List<C1213a> list, @hib q6h q6hVar) {
        this(peg.InterfaceC10936a.f70575a, i | 32, h2hVar, y5hVar, list, q6hVar);
    }

    public bv6(peg.InterfaceC10936a interfaceC10936a, int i, @hib h2h h2hVar, @hib y5h y5hVar, List<C1213a> list, @hib q6h q6hVar) {
        this.f14892d = interfaceC10936a;
        this.f14893e = i;
        this.f14902n = h2hVar;
        this.f14894f = y5hVar;
        this.f14895g = Collections.unmodifiableList(list);
        this.f14908t = q6hVar;
        this.f14903o = new o65();
        this.f14904p = new jhc(16);
        this.f14897i = new jhc(n8b.f63496C);
        this.f14898j = new jhc(6);
        this.f14899k = new jhc();
        byte[] bArr = new byte[16];
        this.f14900l = bArr;
        this.f14901m = new jhc(bArr);
        this.f14905q = new ArrayDeque<>();
        this.f14906r = new ArrayDeque<>();
        this.f14896h = new SparseArray<>();
        this.f14910v = kx7.m15110of();
        this.f14878E = -9223372036854775807L;
        this.f14877D = -9223372036854775807L;
        this.f14879F = -9223372036854775807L;
        this.f14886M = bk5.f13929y;
        this.f14887N = new q6h[0];
        this.f14888O = new q6h[0];
        this.f14907s = new w1e(new w1e.InterfaceC14361b() { // from class: av6
            @Override // p000.w1e.InterfaceC14361b
            public final void consume(long j, jhc jhcVar) {
                this.f11918a.lambda$new$2(j, jhcVar);
            }
        });
        this.f14909u = new nz1();
        this.f14891R = -1L;
    }
}

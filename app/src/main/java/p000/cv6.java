package p000;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
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
import java.util.UUID;
import org.tensorflow.lite.schema.BuiltinOptions;
import p000.hue;
import p000.ib0;
import p000.kq6;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class cv6 implements yj5 {

    /* JADX INFO: renamed from: M */
    public static final int f27762M = 1;

    /* JADX INFO: renamed from: N */
    public static final int f27763N = 2;

    /* JADX INFO: renamed from: O */
    public static final int f27764O = 4;

    /* JADX INFO: renamed from: P */
    public static final int f27765P = 16;

    /* JADX INFO: renamed from: Q */
    public static final String f27766Q = "FragmentedMp4Extractor";

    /* JADX INFO: renamed from: R */
    public static final int f27767R = 1936025959;

    /* JADX INFO: renamed from: U */
    public static final int f27770U = 100;

    /* JADX INFO: renamed from: V */
    public static final int f27771V = 0;

    /* JADX INFO: renamed from: W */
    public static final int f27772W = 1;

    /* JADX INFO: renamed from: X */
    public static final int f27773X = 2;

    /* JADX INFO: renamed from: Y */
    public static final int f27774Y = 3;

    /* JADX INFO: renamed from: Z */
    public static final int f27775Z = 4;

    /* JADX INFO: renamed from: A */
    public long f27776A;

    /* JADX INFO: renamed from: B */
    public long f27777B;

    /* JADX INFO: renamed from: C */
    @hib
    public C4526c f27778C;

    /* JADX INFO: renamed from: D */
    public int f27779D;

    /* JADX INFO: renamed from: E */
    public int f27780E;

    /* JADX INFO: renamed from: F */
    public int f27781F;

    /* JADX INFO: renamed from: G */
    public boolean f27782G;

    /* JADX INFO: renamed from: H */
    public ck5 f27783H;

    /* JADX INFO: renamed from: I */
    public r6h[] f27784I;

    /* JADX INFO: renamed from: J */
    public r6h[] f27785J;

    /* JADX INFO: renamed from: K */
    public boolean f27786K;

    /* JADX INFO: renamed from: d */
    public final int f27787d;

    /* JADX INFO: renamed from: e */
    @hib
    public final z5h f27788e;

    /* JADX INFO: renamed from: f */
    public final List<kq6> f27789f;

    /* JADX INFO: renamed from: g */
    public final SparseArray<C4526c> f27790g;

    /* JADX INFO: renamed from: h */
    public final ihc f27791h;

    /* JADX INFO: renamed from: i */
    public final ihc f27792i;

    /* JADX INFO: renamed from: j */
    public final ihc f27793j;

    /* JADX INFO: renamed from: k */
    public final byte[] f27794k;

    /* JADX INFO: renamed from: l */
    public final ihc f27795l;

    /* JADX INFO: renamed from: m */
    @hib
    public final g2h f27796m;

    /* JADX INFO: renamed from: n */
    public final n65 f27797n;

    /* JADX INFO: renamed from: o */
    public final ihc f27798o;

    /* JADX INFO: renamed from: p */
    public final ArrayDeque<ib0.C7222a> f27799p;

    /* JADX INFO: renamed from: q */
    public final ArrayDeque<C4525b> f27800q;

    /* JADX INFO: renamed from: r */
    @hib
    public final r6h f27801r;

    /* JADX INFO: renamed from: s */
    public int f27802s;

    /* JADX INFO: renamed from: t */
    public int f27803t;

    /* JADX INFO: renamed from: u */
    public long f27804u;

    /* JADX INFO: renamed from: v */
    public int f27805v;

    /* JADX INFO: renamed from: w */
    @hib
    public ihc f27806w;

    /* JADX INFO: renamed from: x */
    public long f27807x;

    /* JADX INFO: renamed from: y */
    public int f27808y;

    /* JADX INFO: renamed from: z */
    public long f27809z;

    /* JADX INFO: renamed from: L */
    public static final hk5 f27761L = new hk5() { // from class: vu6
        @Override // p000.hk5
        public final yj5[] createExtractors() {
            return cv6.lambda$static$0();
        }
    };

    /* JADX INFO: renamed from: S */
    public static final byte[] f27768S = {-94, BuiltinOptions.ArgMinOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.AddNOptions, BuiltinOptions.MatrixSetDiagOptions, -101, BuiltinOptions.SplitVOptions, 20, -94, BuiltinOptions.FillOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.SquareOptions, BuiltinOptions.BitcastOptions, 100, -115, -12};

    /* JADX INFO: renamed from: T */
    public static final kq6 f27769T = new kq6.C8497b().setSampleMimeType("application/x-emsg").build();

    /* JADX INFO: renamed from: cv6$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC4524a {
    }

    /* JADX INFO: renamed from: cv6$b */
    public static final class C4525b {

        /* JADX INFO: renamed from: a */
        public final long f27810a;

        /* JADX INFO: renamed from: b */
        public final boolean f27811b;

        /* JADX INFO: renamed from: c */
        public final int f27812c;

        public C4525b(long j, boolean z, int i) {
            this.f27810a = j;
            this.f27811b = z;
            this.f27812c = i;
        }
    }

    /* JADX INFO: renamed from: cv6$c */
    public static final class C4526c {

        /* JADX INFO: renamed from: m */
        public static final int f27813m = 8;

        /* JADX INFO: renamed from: a */
        public final r6h f27814a;

        /* JADX INFO: renamed from: d */
        public s6h f27817d;

        /* JADX INFO: renamed from: e */
        public cz3 f27818e;

        /* JADX INFO: renamed from: f */
        public int f27819f;

        /* JADX INFO: renamed from: g */
        public int f27820g;

        /* JADX INFO: renamed from: h */
        public int f27821h;

        /* JADX INFO: renamed from: i */
        public int f27822i;

        /* JADX INFO: renamed from: l */
        public boolean f27825l;

        /* JADX INFO: renamed from: b */
        public final c6h f27815b = new c6h();

        /* JADX INFO: renamed from: c */
        public final ihc f27816c = new ihc();

        /* JADX INFO: renamed from: j */
        public final ihc f27823j = new ihc(1);

        /* JADX INFO: renamed from: k */
        public final ihc f27824k = new ihc();

        public C4526c(r6h r6hVar, s6h s6hVar, cz3 cz3Var) {
            this.f27814a = r6hVar;
            this.f27817d = s6hVar;
            this.f27818e = cz3Var;
            reset(s6hVar, cz3Var);
        }

        public int getCurrentSampleFlags() {
            int i = !this.f27825l ? this.f27817d.f80856g[this.f27819f] : this.f27815b.f15876k[this.f27819f] ? 1 : 0;
            return getEncryptionBoxIfEncrypted() != null ? i | 1073741824 : i;
        }

        public long getCurrentSampleOffset() {
            return !this.f27825l ? this.f27817d.f80852c[this.f27819f] : this.f27815b.f15872g[this.f27821h];
        }

        public long getCurrentSamplePresentationTimeUs() {
            return !this.f27825l ? this.f27817d.f80855f[this.f27819f] : this.f27815b.getSamplePresentationTimeUs(this.f27819f);
        }

        public int getCurrentSampleSize() {
            return !this.f27825l ? this.f27817d.f80853d[this.f27819f] : this.f27815b.f15874i[this.f27819f];
        }

        @hib
        public a6h getEncryptionBoxIfEncrypted() {
            if (!this.f27825l) {
                return null;
            }
            int i = ((cz3) x0i.castNonNull(this.f27815b.f15866a)).f28068a;
            a6h sampleDescriptionEncryptionBox = this.f27815b.f15879n;
            if (sampleDescriptionEncryptionBox == null) {
                sampleDescriptionEncryptionBox = this.f27817d.f80850a.getSampleDescriptionEncryptionBox(i);
            }
            if (sampleDescriptionEncryptionBox == null || !sampleDescriptionEncryptionBox.f514a) {
                return null;
            }
            return sampleDescriptionEncryptionBox;
        }

        public boolean next() {
            this.f27819f++;
            if (!this.f27825l) {
                return false;
            }
            int i = this.f27820g + 1;
            this.f27820g = i;
            int[] iArr = this.f27815b.f15873h;
            int i2 = this.f27821h;
            if (i != iArr[i2]) {
                return true;
            }
            this.f27821h = i2 + 1;
            this.f27820g = 0;
            return false;
        }

        public int outputSampleEncryptionData(int i, int i2) {
            ihc ihcVar;
            a6h encryptionBoxIfEncrypted = getEncryptionBoxIfEncrypted();
            if (encryptionBoxIfEncrypted == null) {
                return 0;
            }
            int length = encryptionBoxIfEncrypted.f517d;
            if (length != 0) {
                ihcVar = this.f27815b.f15880o;
            } else {
                byte[] bArr = (byte[]) x0i.castNonNull(encryptionBoxIfEncrypted.f518e);
                this.f27824k.reset(bArr, bArr.length);
                ihc ihcVar2 = this.f27824k;
                length = bArr.length;
                ihcVar = ihcVar2;
            }
            boolean zSampleHasSubsampleEncryptionTable = this.f27815b.sampleHasSubsampleEncryptionTable(this.f27819f);
            boolean z = zSampleHasSubsampleEncryptionTable || i2 != 0;
            this.f27823j.getData()[0] = (byte) ((z ? 128 : 0) | length);
            this.f27823j.setPosition(0);
            this.f27814a.sampleData(this.f27823j, 1, 1);
            this.f27814a.sampleData(ihcVar, length, 1);
            if (!z) {
                return length + 1;
            }
            if (!zSampleHasSubsampleEncryptionTable) {
                this.f27816c.reset(8);
                byte[] data = this.f27816c.getData();
                data[0] = 0;
                data[1] = 1;
                data[2] = (byte) ((i2 >> 8) & 255);
                data[3] = (byte) (i2 & 255);
                data[4] = (byte) ((i >> 24) & 255);
                data[5] = (byte) ((i >> 16) & 255);
                data[6] = (byte) ((i >> 8) & 255);
                data[7] = (byte) (i & 255);
                this.f27814a.sampleData(this.f27816c, 8, 1);
                return length + 9;
            }
            ihc ihcVar3 = this.f27815b.f15880o;
            int unsignedShort = ihcVar3.readUnsignedShort();
            ihcVar3.skipBytes(-2);
            int i3 = (unsignedShort * 6) + 2;
            if (i2 != 0) {
                this.f27816c.reset(i3);
                byte[] data2 = this.f27816c.getData();
                ihcVar3.readBytes(data2, 0, i3);
                int i4 = (((data2[2] & 255) << 8) | (data2[3] & 255)) + i2;
                data2[2] = (byte) ((i4 >> 8) & 255);
                data2[3] = (byte) (i4 & 255);
                ihcVar3 = this.f27816c;
            }
            this.f27814a.sampleData(ihcVar3, i3, 1);
            return length + 1 + i3;
        }

        public void reset(s6h s6hVar, cz3 cz3Var) {
            this.f27817d = s6hVar;
            this.f27818e = cz3Var;
            this.f27814a.format(s6hVar.f80850a.f104268f);
            resetFragmentInfo();
        }

        public void resetFragmentInfo() {
            this.f27815b.reset();
            this.f27819f = 0;
            this.f27821h = 0;
            this.f27820g = 0;
            this.f27822i = 0;
            this.f27825l = false;
        }

        public void seek(long j) {
            int i = this.f27819f;
            while (true) {
                c6h c6hVar = this.f27815b;
                if (i >= c6hVar.f15871f || c6hVar.getSamplePresentationTimeUs(i) > j) {
                    return;
                }
                if (this.f27815b.f15876k[i]) {
                    this.f27822i = i;
                }
                i++;
            }
        }

        public void skipSampleEncryptionData() {
            a6h encryptionBoxIfEncrypted = getEncryptionBoxIfEncrypted();
            if (encryptionBoxIfEncrypted == null) {
                return;
            }
            ihc ihcVar = this.f27815b.f15880o;
            int i = encryptionBoxIfEncrypted.f517d;
            if (i != 0) {
                ihcVar.skipBytes(i);
            }
            if (this.f27815b.sampleHasSubsampleEncryptionTable(this.f27819f)) {
                ihcVar.skipBytes(ihcVar.readUnsignedShort() * 6);
            }
        }

        public void updateDrmInitData(DrmInitData drmInitData) {
            a6h sampleDescriptionEncryptionBox = this.f27817d.f80850a.getSampleDescriptionEncryptionBox(((cz3) x0i.castNonNull(this.f27815b.f15866a)).f28068a);
            this.f27814a.format(this.f27817d.f80850a.f104268f.buildUpon().setDrmInitData(drmInitData.copyWithSchemeType(sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.f515b : null)).build());
        }
    }

    public cv6() {
        this(0);
    }

    private static int checkNonNegative(int i) throws xhc {
        if (i >= 0) {
            return i;
        }
        throw xhc.createForMalformedContainer("Unexpected negative value: " + i, null);
    }

    private void enterReadingAtomHeaderState() {
        this.f27802s = 0;
        this.f27805v = 0;
    }

    private cz3 getDefaultSampleValues(SparseArray<cz3> sparseArray, int i) {
        return sparseArray.size() == 1 ? sparseArray.valueAt(0) : (cz3) u80.checkNotNull(sparseArray.get(i));
    }

    @hib
    private static DrmInitData getDrmInitDataFromAtoms(List<ib0.C7223b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ib0.C7223b c7223b = list.get(i);
            if (c7223b.f46423a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] data = c7223b.f46427E1.getData();
                UUID uuid = fjd.parseUuid(data);
                if (uuid == null) {
                    yh9.m25919w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
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
    private static C4526c getNextTrackBundle(SparseArray<C4526c> sparseArray) {
        int size = sparseArray.size();
        C4526c c4526c = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            C4526c c4526cValueAt = sparseArray.valueAt(i);
            if ((c4526cValueAt.f27825l || c4526cValueAt.f27819f != c4526cValueAt.f27817d.f80851b) && (!c4526cValueAt.f27825l || c4526cValueAt.f27821h != c4526cValueAt.f27815b.f15870e)) {
                long currentSampleOffset = c4526cValueAt.getCurrentSampleOffset();
                if (currentSampleOffset < j) {
                    c4526c = c4526cValueAt;
                    j = currentSampleOffset;
                }
            }
        }
        return c4526c;
    }

    private void initExtraTracks() {
        int i;
        r6h[] r6hVarArr = new r6h[2];
        this.f27784I = r6hVarArr;
        r6h r6hVar = this.f27801r;
        int i2 = 0;
        if (r6hVar != null) {
            r6hVarArr[0] = r6hVar;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.f27787d & 4) != 0) {
            r6hVarArr[i] = this.f27783H.track(100, 5);
            i3 = 101;
            i++;
        }
        r6h[] r6hVarArr2 = (r6h[]) x0i.nullSafeArrayCopy(this.f27784I, i);
        this.f27784I = r6hVarArr2;
        for (r6h r6hVar2 : r6hVarArr2) {
            r6hVar2.format(f27769T);
        }
        this.f27785J = new r6h[this.f27789f.size()];
        while (i2 < this.f27785J.length) {
            r6h r6hVarTrack = this.f27783H.track(i3, 3);
            r6hVarTrack.format(this.f27789f.get(i2));
            this.f27785J[i2] = r6hVarTrack;
            i2++;
            i3++;
        }
    }

    private static boolean isEdtsListDurationForEntireMediaTimeline(z5h z5hVar) {
        long[] jArr;
        long[] jArr2 = z5hVar.f104270h;
        if (jArr2 == null || jArr2.length != 1 || (jArr = z5hVar.f104271i) == null) {
            return false;
        }
        long j = jArr2[0];
        return j == 0 || x0i.scaleLargeTimestamp(j + jArr[0], 1000000L, z5hVar.f104266d) >= z5hVar.f104267e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ yj5[] lambda$static$0() {
        return new yj5[]{new cv6()};
    }

    private void onContainerAtomRead(ib0.C7222a c7222a) throws xhc {
        int i = c7222a.f46423a;
        if (i == 1836019574) {
            onMoovContainerAtomRead(c7222a);
        } else if (i == 1836019558) {
            onMoofContainerAtomRead(c7222a);
        } else {
            if (this.f27799p.isEmpty()) {
                return;
            }
            this.f27799p.peek().add(c7222a);
        }
    }

    private void onEmsgLeafAtomRead(ihc ihcVar) {
        long jScaleLargeTimestamp;
        String str;
        long jScaleLargeTimestamp2;
        String str2;
        long unsignedInt;
        long jAdjustSampleTimestamp;
        if (this.f27784I.length == 0) {
            return;
        }
        ihcVar.setPosition(8);
        int fullAtomVersion = ib0.parseFullAtomVersion(ihcVar.readInt());
        if (fullAtomVersion == 0) {
            String str3 = (String) u80.checkNotNull(ihcVar.readNullTerminatedString());
            String str4 = (String) u80.checkNotNull(ihcVar.readNullTerminatedString());
            long unsignedInt2 = ihcVar.readUnsignedInt();
            jScaleLargeTimestamp = x0i.scaleLargeTimestamp(ihcVar.readUnsignedInt(), 1000000L, unsignedInt2);
            long j = this.f27777B;
            long j2 = j != -9223372036854775807L ? j + jScaleLargeTimestamp : -9223372036854775807L;
            str = str3;
            jScaleLargeTimestamp2 = x0i.scaleLargeTimestamp(ihcVar.readUnsignedInt(), 1000L, unsignedInt2);
            str2 = str4;
            unsignedInt = ihcVar.readUnsignedInt();
            jAdjustSampleTimestamp = j2;
        } else {
            if (fullAtomVersion != 1) {
                yh9.m25919w("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + fullAtomVersion);
                return;
            }
            long unsignedInt3 = ihcVar.readUnsignedInt();
            jAdjustSampleTimestamp = x0i.scaleLargeTimestamp(ihcVar.readUnsignedLongToLong(), 1000000L, unsignedInt3);
            long jScaleLargeTimestamp3 = x0i.scaleLargeTimestamp(ihcVar.readUnsignedInt(), 1000L, unsignedInt3);
            long unsignedInt4 = ihcVar.readUnsignedInt();
            str = (String) u80.checkNotNull(ihcVar.readNullTerminatedString());
            jScaleLargeTimestamp2 = jScaleLargeTimestamp3;
            unsignedInt = unsignedInt4;
            str2 = (String) u80.checkNotNull(ihcVar.readNullTerminatedString());
            jScaleLargeTimestamp = -9223372036854775807L;
        }
        byte[] bArr = new byte[ihcVar.bytesLeft()];
        ihcVar.readBytes(bArr, 0, ihcVar.bytesLeft());
        ihc ihcVar2 = new ihc(this.f27797n.encode(new EventMessage(str, str2, jScaleLargeTimestamp2, unsignedInt, bArr)));
        int iBytesLeft = ihcVar2.bytesLeft();
        for (r6h r6hVar : this.f27784I) {
            ihcVar2.setPosition(0);
            r6hVar.sampleData(ihcVar2, iBytesLeft);
        }
        if (jAdjustSampleTimestamp == -9223372036854775807L) {
            this.f27800q.addLast(new C4525b(jScaleLargeTimestamp, true, iBytesLeft));
            this.f27808y += iBytesLeft;
            return;
        }
        if (!this.f27800q.isEmpty()) {
            this.f27800q.addLast(new C4525b(jAdjustSampleTimestamp, false, iBytesLeft));
            this.f27808y += iBytesLeft;
            return;
        }
        g2h g2hVar = this.f27796m;
        if (g2hVar != null && !g2hVar.isInitialized()) {
            this.f27800q.addLast(new C4525b(jAdjustSampleTimestamp, false, iBytesLeft));
            this.f27808y += iBytesLeft;
            return;
        }
        g2h g2hVar2 = this.f27796m;
        if (g2hVar2 != null) {
            jAdjustSampleTimestamp = g2hVar2.adjustSampleTimestamp(jAdjustSampleTimestamp);
        }
        for (r6h r6hVar2 : this.f27784I) {
            r6hVar2.sampleMetadata(jAdjustSampleTimestamp, 1, iBytesLeft, 0, null);
        }
    }

    private void onLeafAtomRead(ib0.C7223b c7223b, long j) throws xhc {
        if (!this.f27799p.isEmpty()) {
            this.f27799p.peek().add(c7223b);
            return;
        }
        int i = c7223b.f46423a;
        if (i != 1936286840) {
            if (i == 1701671783) {
                onEmsgLeafAtomRead(c7223b.f46427E1);
            }
        } else {
            Pair<Long, lz1> sidx = parseSidx(c7223b.f46427E1, j);
            this.f27777B = ((Long) sidx.first).longValue();
            this.f27783H.seekMap((hue) sidx.second);
            this.f27786K = true;
        }
    }

    private void onMoofContainerAtomRead(ib0.C7222a c7222a) throws xhc {
        parseMoof(c7222a, this.f27790g, this.f27788e != null, this.f27787d, this.f27794k);
        DrmInitData drmInitDataFromAtoms = getDrmInitDataFromAtoms(c7222a.f46425F1);
        if (drmInitDataFromAtoms != null) {
            int size = this.f27790g.size();
            for (int i = 0; i < size; i++) {
                this.f27790g.valueAt(i).updateDrmInitData(drmInitDataFromAtoms);
            }
        }
        if (this.f27809z != -9223372036854775807L) {
            int size2 = this.f27790g.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f27790g.valueAt(i2).seek(this.f27809z);
            }
            this.f27809z = -9223372036854775807L;
        }
    }

    private void onMoovContainerAtomRead(ib0.C7222a c7222a) throws xhc {
        int i = 0;
        u80.checkState(this.f27788e == null, "Unexpected moov box.");
        DrmInitData drmInitDataFromAtoms = getDrmInitDataFromAtoms(c7222a.f46425F1);
        ib0.C7222a c7222a2 = (ib0.C7222a) u80.checkNotNull(c7222a.getContainerAtomOfType(1836475768));
        SparseArray<cz3> sparseArray = new SparseArray<>();
        int size = c7222a2.f46425F1.size();
        long mehd = -9223372036854775807L;
        for (int i2 = 0; i2 < size; i2++) {
            ib0.C7223b c7223b = c7222a2.f46425F1.get(i2);
            int i3 = c7223b.f46423a;
            if (i3 == 1953654136) {
                Pair<Integer, cz3> trex = parseTrex(c7223b.f46427E1);
                sparseArray.put(((Integer) trex.first).intValue(), (cz3) trex.second);
            } else if (i3 == 1835362404) {
                mehd = parseMehd(c7223b.f46427E1);
            }
        }
        List<s6h> traks = jb0.parseTraks(c7222a, new n27(), mehd, drmInitDataFromAtoms, (this.f27787d & 16) != 0, false, new lz6() { // from class: xu6
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return this.f99354a.m8727b((z5h) obj);
            }
        });
        int size2 = traks.size();
        if (this.f27790g.size() != 0) {
            u80.checkState(this.f27790g.size() == size2);
            while (i < size2) {
                s6h s6hVar = traks.get(i);
                z5h z5hVar = s6hVar.f80850a;
                this.f27790g.get(z5hVar.f104263a).reset(s6hVar, getDefaultSampleValues(sparseArray, z5hVar.f104263a));
                i++;
            }
            return;
        }
        while (i < size2) {
            s6h s6hVar2 = traks.get(i);
            z5h z5hVar2 = s6hVar2.f80850a;
            this.f27790g.put(z5hVar2.f104263a, new C4526c(this.f27783H.track(i, z5hVar2.f104264b), s6hVar2, getDefaultSampleValues(sparseArray, z5hVar2.f104263a)));
            this.f27776A = Math.max(this.f27776A, z5hVar2.f104267e);
            i++;
        }
        this.f27783H.endTracks();
    }

    private void outputPendingMetadataSamples(long j) {
        while (!this.f27800q.isEmpty()) {
            C4525b c4525bRemoveFirst = this.f27800q.removeFirst();
            this.f27808y -= c4525bRemoveFirst.f27812c;
            long jAdjustSampleTimestamp = c4525bRemoveFirst.f27810a;
            if (c4525bRemoveFirst.f27811b) {
                jAdjustSampleTimestamp += j;
            }
            g2h g2hVar = this.f27796m;
            if (g2hVar != null) {
                jAdjustSampleTimestamp = g2hVar.adjustSampleTimestamp(jAdjustSampleTimestamp);
            }
            for (r6h r6hVar : this.f27784I) {
                r6hVar.sampleMetadata(jAdjustSampleTimestamp, 1, c4525bRemoveFirst.f27812c, this.f27808y, null);
            }
        }
    }

    private static long parseMehd(ihc ihcVar) {
        ihcVar.setPosition(8);
        return ib0.parseFullAtomVersion(ihcVar.readInt()) == 0 ? ihcVar.readUnsignedInt() : ihcVar.readUnsignedLongToLong();
    }

    private static void parseMoof(ib0.C7222a c7222a, SparseArray<C4526c> sparseArray, boolean z, int i, byte[] bArr) throws xhc {
        int size = c7222a.f46426G1.size();
        for (int i2 = 0; i2 < size; i2++) {
            ib0.C7222a c7222a2 = c7222a.f46426G1.get(i2);
            if (c7222a2.f46423a == 1953653094) {
                parseTraf(c7222a2, sparseArray, z, i, bArr);
            }
        }
    }

    private static void parseSaio(ihc ihcVar, c6h c6hVar) throws xhc {
        ihcVar.setPosition(8);
        int i = ihcVar.readInt();
        if ((ib0.parseFullAtomFlags(i) & 1) == 1) {
            ihcVar.skipBytes(8);
        }
        int unsignedIntToInt = ihcVar.readUnsignedIntToInt();
        if (unsignedIntToInt == 1) {
            c6hVar.f15869d += ib0.parseFullAtomVersion(i) == 0 ? ihcVar.readUnsignedInt() : ihcVar.readUnsignedLongToLong();
        } else {
            throw xhc.createForMalformedContainer("Unexpected saio entry count: " + unsignedIntToInt, null);
        }
    }

    private static void parseSaiz(a6h a6hVar, ihc ihcVar, c6h c6hVar) throws xhc {
        int i;
        int i2 = a6hVar.f517d;
        ihcVar.setPosition(8);
        if ((ib0.parseFullAtomFlags(ihcVar.readInt()) & 1) == 1) {
            ihcVar.skipBytes(8);
        }
        int unsignedByte = ihcVar.readUnsignedByte();
        int unsignedIntToInt = ihcVar.readUnsignedIntToInt();
        if (unsignedIntToInt > c6hVar.f15871f) {
            throw xhc.createForMalformedContainer("Saiz sample count " + unsignedIntToInt + " is greater than fragment sample count" + c6hVar.f15871f, null);
        }
        if (unsignedByte == 0) {
            boolean[] zArr = c6hVar.f15878m;
            i = 0;
            for (int i3 = 0; i3 < unsignedIntToInt; i3++) {
                int unsignedByte2 = ihcVar.readUnsignedByte();
                i += unsignedByte2;
                zArr[i3] = unsignedByte2 > i2;
            }
        } else {
            i = unsignedByte * unsignedIntToInt;
            Arrays.fill(c6hVar.f15878m, 0, unsignedIntToInt, unsignedByte > i2);
        }
        Arrays.fill(c6hVar.f15878m, unsignedIntToInt, c6hVar.f15871f, false);
        if (i > 0) {
            c6hVar.initEncryptionData(i);
        }
    }

    private static void parseSampleGroups(ib0.C7222a c7222a, @hib String str, c6h c6hVar) throws xhc {
        byte[] bArr = null;
        ihc ihcVar = null;
        ihc ihcVar2 = null;
        for (int i = 0; i < c7222a.f46425F1.size(); i++) {
            ib0.C7223b c7223b = c7222a.f46425F1.get(i);
            ihc ihcVar3 = c7223b.f46427E1;
            int i2 = c7223b.f46423a;
            if (i2 == 1935828848) {
                ihcVar3.setPosition(12);
                if (ihcVar3.readInt() == 1936025959) {
                    ihcVar = ihcVar3;
                }
            } else if (i2 == 1936158820) {
                ihcVar3.setPosition(12);
                if (ihcVar3.readInt() == 1936025959) {
                    ihcVar2 = ihcVar3;
                }
            }
        }
        if (ihcVar == null || ihcVar2 == null) {
            return;
        }
        ihcVar.setPosition(8);
        int fullAtomVersion = ib0.parseFullAtomVersion(ihcVar.readInt());
        ihcVar.skipBytes(4);
        if (fullAtomVersion == 1) {
            ihcVar.skipBytes(4);
        }
        if (ihcVar.readInt() != 1) {
            throw xhc.createForUnsupportedContainerFeature("Entry count in sbgp != 1 (unsupported).");
        }
        ihcVar2.setPosition(8);
        int fullAtomVersion2 = ib0.parseFullAtomVersion(ihcVar2.readInt());
        ihcVar2.skipBytes(4);
        if (fullAtomVersion2 == 1) {
            if (ihcVar2.readUnsignedInt() == 0) {
                throw xhc.createForUnsupportedContainerFeature("Variable length description in sgpd found (unsupported)");
            }
        } else if (fullAtomVersion2 >= 2) {
            ihcVar2.skipBytes(4);
        }
        if (ihcVar2.readUnsignedInt() != 1) {
            throw xhc.createForUnsupportedContainerFeature("Entry count in sgpd != 1 (unsupported).");
        }
        ihcVar2.skipBytes(1);
        int unsignedByte = ihcVar2.readUnsignedByte();
        int i3 = (unsignedByte & 240) >> 4;
        int i4 = unsignedByte & 15;
        boolean z = ihcVar2.readUnsignedByte() == 1;
        if (z) {
            int unsignedByte2 = ihcVar2.readUnsignedByte();
            byte[] bArr2 = new byte[16];
            ihcVar2.readBytes(bArr2, 0, 16);
            if (unsignedByte2 == 0) {
                int unsignedByte3 = ihcVar2.readUnsignedByte();
                bArr = new byte[unsignedByte3];
                ihcVar2.readBytes(bArr, 0, unsignedByte3);
            }
            c6hVar.f15877l = true;
            c6hVar.f15879n = new a6h(z, str, unsignedByte2, bArr2, i3, i4, bArr);
        }
    }

    private static void parseSenc(ihc ihcVar, c6h c6hVar) throws xhc {
        parseSenc(ihcVar, 0, c6hVar);
    }

    private static Pair<Long, lz1> parseSidx(ihc ihcVar, long j) throws xhc {
        long unsignedLongToLong;
        long unsignedLongToLong2;
        ihcVar.setPosition(8);
        int fullAtomVersion = ib0.parseFullAtomVersion(ihcVar.readInt());
        ihcVar.skipBytes(4);
        long unsignedInt = ihcVar.readUnsignedInt();
        if (fullAtomVersion == 0) {
            unsignedLongToLong = ihcVar.readUnsignedInt();
            unsignedLongToLong2 = ihcVar.readUnsignedInt();
        } else {
            unsignedLongToLong = ihcVar.readUnsignedLongToLong();
            unsignedLongToLong2 = ihcVar.readUnsignedLongToLong();
        }
        long j2 = unsignedLongToLong;
        long j3 = j + unsignedLongToLong2;
        long jScaleLargeTimestamp = x0i.scaleLargeTimestamp(j2, 1000000L, unsignedInt);
        ihcVar.skipBytes(2);
        int unsignedShort = ihcVar.readUnsignedShort();
        int[] iArr = new int[unsignedShort];
        long[] jArr = new long[unsignedShort];
        long[] jArr2 = new long[unsignedShort];
        long[] jArr3 = new long[unsignedShort];
        long j4 = jScaleLargeTimestamp;
        int i = 0;
        long j5 = j2;
        while (i < unsignedShort) {
            int i2 = ihcVar.readInt();
            if ((i2 & Integer.MIN_VALUE) != 0) {
                throw xhc.createForMalformedContainer("Unhandled indirect reference", null);
            }
            long unsignedInt2 = ihcVar.readUnsignedInt();
            iArr[i] = i2 & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            long j6 = j5 + unsignedInt2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i3 = unsignedShort;
            int[] iArr2 = iArr;
            long jScaleLargeTimestamp2 = x0i.scaleLargeTimestamp(j6, 1000000L, unsignedInt);
            jArr4[i] = jScaleLargeTimestamp2 - jArr5[i];
            ihcVar.skipBytes(4);
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
        return Pair.create(Long.valueOf(jScaleLargeTimestamp), new lz1(iArr, jArr, jArr2, jArr3));
    }

    private static long parseTfdt(ihc ihcVar) {
        ihcVar.setPosition(8);
        return ib0.parseFullAtomVersion(ihcVar.readInt()) == 1 ? ihcVar.readUnsignedLongToLong() : ihcVar.readUnsignedInt();
    }

    @hib
    private static C4526c parseTfhd(ihc ihcVar, SparseArray<C4526c> sparseArray, boolean z) {
        ihcVar.setPosition(8);
        int fullAtomFlags = ib0.parseFullAtomFlags(ihcVar.readInt());
        C4526c c4526cValueAt = z ? sparseArray.valueAt(0) : sparseArray.get(ihcVar.readInt());
        if (c4526cValueAt == null) {
            return null;
        }
        if ((fullAtomFlags & 1) != 0) {
            long unsignedLongToLong = ihcVar.readUnsignedLongToLong();
            c6h c6hVar = c4526cValueAt.f27815b;
            c6hVar.f15868c = unsignedLongToLong;
            c6hVar.f15869d = unsignedLongToLong;
        }
        cz3 cz3Var = c4526cValueAt.f27818e;
        c4526cValueAt.f27815b.f15866a = new cz3((fullAtomFlags & 2) != 0 ? ihcVar.readInt() - 1 : cz3Var.f28068a, (fullAtomFlags & 8) != 0 ? ihcVar.readInt() : cz3Var.f28069b, (fullAtomFlags & 16) != 0 ? ihcVar.readInt() : cz3Var.f28070c, (fullAtomFlags & 32) != 0 ? ihcVar.readInt() : cz3Var.f28071d);
        return c4526cValueAt;
    }

    private static void parseTraf(ib0.C7222a c7222a, SparseArray<C4526c> sparseArray, boolean z, int i, byte[] bArr) throws xhc {
        C4526c tfhd = parseTfhd(((ib0.C7223b) u80.checkNotNull(c7222a.getLeafAtomOfType(1952868452))).f46427E1, sparseArray, z);
        if (tfhd == null) {
            return;
        }
        c6h c6hVar = tfhd.f27815b;
        long j = c6hVar.f15882q;
        boolean z2 = c6hVar.f15883r;
        tfhd.resetFragmentInfo();
        tfhd.f27825l = true;
        ib0.C7223b leafAtomOfType = c7222a.getLeafAtomOfType(1952867444);
        if (leafAtomOfType == null || (i & 2) != 0) {
            c6hVar.f15882q = j;
            c6hVar.f15883r = z2;
        } else {
            c6hVar.f15882q = parseTfdt(leafAtomOfType.f46427E1);
            c6hVar.f15883r = true;
        }
        parseTruns(c7222a, tfhd, i);
        a6h sampleDescriptionEncryptionBox = tfhd.f27817d.f80850a.getSampleDescriptionEncryptionBox(((cz3) u80.checkNotNull(c6hVar.f15866a)).f28068a);
        ib0.C7223b leafAtomOfType2 = c7222a.getLeafAtomOfType(1935763834);
        if (leafAtomOfType2 != null) {
            parseSaiz((a6h) u80.checkNotNull(sampleDescriptionEncryptionBox), leafAtomOfType2.f46427E1, c6hVar);
        }
        ib0.C7223b leafAtomOfType3 = c7222a.getLeafAtomOfType(1935763823);
        if (leafAtomOfType3 != null) {
            parseSaio(leafAtomOfType3.f46427E1, c6hVar);
        }
        ib0.C7223b leafAtomOfType4 = c7222a.getLeafAtomOfType(1936027235);
        if (leafAtomOfType4 != null) {
            parseSenc(leafAtomOfType4.f46427E1, c6hVar);
        }
        parseSampleGroups(c7222a, sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.f515b : null, c6hVar);
        int size = c7222a.f46425F1.size();
        for (int i2 = 0; i2 < size; i2++) {
            ib0.C7223b c7223b = c7222a.f46425F1.get(i2);
            if (c7223b.f46423a == 1970628964) {
                parseUuid(c7223b.f46427E1, c6hVar, bArr);
            }
        }
    }

    private static Pair<Integer, cz3> parseTrex(ihc ihcVar) {
        ihcVar.setPosition(12);
        return Pair.create(Integer.valueOf(ihcVar.readInt()), new cz3(ihcVar.readInt() - 1, ihcVar.readInt(), ihcVar.readInt(), ihcVar.readInt()));
    }

    private static int parseTrun(C4526c c4526c, int i, int i2, ihc ihcVar, int i3) throws xhc {
        boolean z;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        boolean z4;
        boolean z5;
        int i6;
        C4526c c4526c2 = c4526c;
        ihcVar.setPosition(8);
        int fullAtomFlags = ib0.parseFullAtomFlags(ihcVar.readInt());
        z5h z5hVar = c4526c2.f27817d.f80850a;
        c6h c6hVar = c4526c2.f27815b;
        cz3 cz3Var = (cz3) x0i.castNonNull(c6hVar.f15866a);
        c6hVar.f15873h[i] = ihcVar.readUnsignedIntToInt();
        long[] jArr = c6hVar.f15872g;
        long j = c6hVar.f15868c;
        jArr[i] = j;
        if ((fullAtomFlags & 1) != 0) {
            jArr[i] = j + ((long) ihcVar.readInt());
        }
        boolean z6 = (fullAtomFlags & 4) != 0;
        int i7 = cz3Var.f28071d;
        if (z6) {
            i7 = ihcVar.readInt();
        }
        boolean z7 = (fullAtomFlags & 256) != 0;
        boolean z8 = (fullAtomFlags & 512) != 0;
        boolean z9 = (fullAtomFlags & 1024) != 0;
        boolean z10 = (fullAtomFlags & 2048) != 0;
        long j2 = isEdtsListDurationForEntireMediaTimeline(z5hVar) ? ((long[]) x0i.castNonNull(z5hVar.f104271i))[0] : 0L;
        int[] iArr = c6hVar.f15874i;
        long[] jArr2 = c6hVar.f15875j;
        boolean[] zArr = c6hVar.f15876k;
        int i8 = i7;
        boolean z11 = z5hVar.f104264b == 2 && (i2 & 1) != 0;
        int i9 = i3 + c6hVar.f15873h[i];
        boolean z12 = z11;
        long j3 = z5hVar.f104265c;
        long j4 = c6hVar.f15882q;
        int i10 = i3;
        while (i10 < i9) {
            int iCheckNonNegative = checkNonNegative(z7 ? ihcVar.readInt() : cz3Var.f28069b);
            if (z8) {
                i4 = ihcVar.readInt();
                z = z7;
            } else {
                z = z7;
                i4 = cz3Var.f28070c;
            }
            int iCheckNonNegative2 = checkNonNegative(i4);
            if (z9) {
                z2 = z6;
                i5 = ihcVar.readInt();
            } else if (i10 == 0 && z6) {
                z2 = z6;
                i5 = i8;
            } else {
                z2 = z6;
                i5 = cz3Var.f28071d;
            }
            if (z10) {
                z3 = z10;
                z4 = z8;
                z5 = z9;
                i6 = ihcVar.readInt();
            } else {
                z3 = z10;
                z4 = z8;
                z5 = z9;
                i6 = 0;
            }
            long jScaleLargeTimestamp = x0i.scaleLargeTimestamp((((long) i6) + j4) - j2, 1000000L, j3);
            jArr2[i10] = jScaleLargeTimestamp;
            if (!c6hVar.f15883r) {
                jArr2[i10] = jScaleLargeTimestamp + c4526c2.f27817d.f80857h;
            }
            iArr[i10] = iCheckNonNegative2;
            zArr[i10] = ((i5 >> 16) & 1) == 0 && (!z12 || i10 == 0);
            j4 += (long) iCheckNonNegative;
            i10++;
            c4526c2 = c4526c;
            z7 = z;
            z6 = z2;
            z10 = z3;
            z8 = z4;
            z9 = z5;
        }
        c6hVar.f15882q = j4;
        return i9;
    }

    private static void parseTruns(ib0.C7222a c7222a, C4526c c4526c, int i) throws xhc {
        List<ib0.C7223b> list = c7222a.f46425F1;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            ib0.C7223b c7223b = list.get(i4);
            if (c7223b.f46423a == 1953658222) {
                ihc ihcVar = c7223b.f46427E1;
                ihcVar.setPosition(12);
                int unsignedIntToInt = ihcVar.readUnsignedIntToInt();
                if (unsignedIntToInt > 0) {
                    i3 += unsignedIntToInt;
                    i2++;
                }
            }
        }
        c4526c.f27821h = 0;
        c4526c.f27820g = 0;
        c4526c.f27819f = 0;
        c4526c.f27815b.initTables(i2, i3);
        int i5 = 0;
        int trun = 0;
        for (int i6 = 0; i6 < size; i6++) {
            ib0.C7223b c7223b2 = list.get(i6);
            if (c7223b2.f46423a == 1953658222) {
                trun = parseTrun(c4526c, i5, i, c7223b2.f46427E1, trun);
                i5++;
            }
        }
    }

    private static void parseUuid(ihc ihcVar, c6h c6hVar, byte[] bArr) throws xhc {
        ihcVar.setPosition(8);
        ihcVar.readBytes(bArr, 0, 16);
        if (Arrays.equals(bArr, f27768S)) {
            parseSenc(ihcVar, 16, c6hVar);
        }
    }

    private void processAtomEnded(long j) throws xhc {
        while (!this.f27799p.isEmpty() && this.f27799p.peek().f46424E1 == j) {
            onContainerAtomRead(this.f27799p.pop());
        }
        enterReadingAtomHeaderState();
    }

    private boolean readAtomHeader(zj5 zj5Var) throws IOException {
        if (this.f27805v == 0) {
            if (!zj5Var.readFully(this.f27798o.getData(), 0, 8, true)) {
                return false;
            }
            this.f27805v = 8;
            this.f27798o.setPosition(0);
            this.f27804u = this.f27798o.readUnsignedInt();
            this.f27803t = this.f27798o.readInt();
        }
        long j = this.f27804u;
        if (j == 1) {
            zj5Var.readFully(this.f27798o.getData(), 8, 8);
            this.f27805v += 8;
            this.f27804u = this.f27798o.readUnsignedLongToLong();
        } else if (j == 0) {
            long length = zj5Var.getLength();
            if (length == -1 && !this.f27799p.isEmpty()) {
                length = this.f27799p.peek().f46424E1;
            }
            if (length != -1) {
                this.f27804u = (length - zj5Var.getPosition()) + ((long) this.f27805v);
            }
        }
        if (this.f27804u < this.f27805v) {
            throw xhc.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        long position = zj5Var.getPosition() - ((long) this.f27805v);
        int i = this.f27803t;
        if ((i == 1836019558 || i == 1835295092) && !this.f27786K) {
            this.f27783H.seekMap(new hue.C7024b(this.f27776A, position));
            this.f27786K = true;
        }
        if (this.f27803t == 1836019558) {
            int size = this.f27790g.size();
            for (int i2 = 0; i2 < size; i2++) {
                c6h c6hVar = this.f27790g.valueAt(i2).f27815b;
                c6hVar.f15867b = position;
                c6hVar.f15869d = position;
                c6hVar.f15868c = position;
            }
        }
        int i3 = this.f27803t;
        if (i3 == 1835295092) {
            this.f27778C = null;
            this.f27807x = position + this.f27804u;
            this.f27802s = 2;
            return true;
        }
        if (shouldParseContainerAtom(i3)) {
            long position2 = (zj5Var.getPosition() + this.f27804u) - 8;
            this.f27799p.push(new ib0.C7222a(this.f27803t, position2));
            if (this.f27804u == this.f27805v) {
                processAtomEnded(position2);
            } else {
                enterReadingAtomHeaderState();
            }
        } else if (shouldParseLeafAtom(this.f27803t)) {
            if (this.f27805v != 8) {
                throw xhc.createForUnsupportedContainerFeature("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.f27804u > 2147483647L) {
                throw xhc.createForUnsupportedContainerFeature("Leaf atom with length > 2147483647 (unsupported).");
            }
            ihc ihcVar = new ihc((int) this.f27804u);
            System.arraycopy(this.f27798o.getData(), 0, ihcVar.getData(), 0, 8);
            this.f27806w = ihcVar;
            this.f27802s = 1;
        } else {
            if (this.f27804u > 2147483647L) {
                throw xhc.createForUnsupportedContainerFeature("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f27806w = null;
            this.f27802s = 1;
        }
        return true;
    }

    private void readAtomPayload(zj5 zj5Var) throws IOException {
        int i = ((int) this.f27804u) - this.f27805v;
        ihc ihcVar = this.f27806w;
        if (ihcVar != null) {
            zj5Var.readFully(ihcVar.getData(), 8, i);
            onLeafAtomRead(new ib0.C7223b(this.f27803t, ihcVar), zj5Var.getPosition());
        } else {
            zj5Var.skipFully(i);
        }
        processAtomEnded(zj5Var.getPosition());
    }

    private void readEncryptionData(zj5 zj5Var) throws IOException {
        int size = this.f27790g.size();
        long j = Long.MAX_VALUE;
        C4526c c4526cValueAt = null;
        for (int i = 0; i < size; i++) {
            c6h c6hVar = this.f27790g.valueAt(i).f27815b;
            if (c6hVar.f15881p) {
                long j2 = c6hVar.f15869d;
                if (j2 < j) {
                    c4526cValueAt = this.f27790g.valueAt(i);
                    j = j2;
                }
            }
        }
        if (c4526cValueAt == null) {
            this.f27802s = 3;
            return;
        }
        int position = (int) (j - zj5Var.getPosition());
        if (position < 0) {
            throw xhc.createForMalformedContainer("Offset to encryption data was negative.", null);
        }
        zj5Var.skipFully(position);
        c4526cValueAt.f27815b.fillEncryptionData(zj5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private boolean readSample(zj5 zj5Var) throws IOException {
        int iSampleData;
        C4526c nextTrackBundle = this.f27778C;
        Throwable th = null;
        if (nextTrackBundle == null) {
            nextTrackBundle = getNextTrackBundle(this.f27790g);
            if (nextTrackBundle == null) {
                int position = (int) (this.f27807x - zj5Var.getPosition());
                if (position < 0) {
                    throw xhc.createForMalformedContainer("Offset to end of mdat was negative.", null);
                }
                zj5Var.skipFully(position);
                enterReadingAtomHeaderState();
                return false;
            }
            int currentSampleOffset = (int) (nextTrackBundle.getCurrentSampleOffset() - zj5Var.getPosition());
            if (currentSampleOffset < 0) {
                yh9.m25919w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                currentSampleOffset = 0;
            }
            zj5Var.skipFully(currentSampleOffset);
            this.f27778C = nextTrackBundle;
        }
        int i = 4;
        int i2 = 1;
        if (this.f27802s == 3) {
            int currentSampleSize = nextTrackBundle.getCurrentSampleSize();
            this.f27779D = currentSampleSize;
            if (nextTrackBundle.f27819f < nextTrackBundle.f27822i) {
                zj5Var.skipFully(currentSampleSize);
                nextTrackBundle.skipSampleEncryptionData();
                if (!nextTrackBundle.next()) {
                    this.f27778C = null;
                }
                this.f27802s = 3;
                return true;
            }
            if (nextTrackBundle.f27817d.f80850a.f104269g == 1) {
                this.f27779D = currentSampleSize - 8;
                zj5Var.skipFully(8);
            }
            if ("audio/ac4".equals(nextTrackBundle.f27817d.f80850a.f104268f.f54989M)) {
                this.f27780E = nextTrackBundle.outputSampleEncryptionData(this.f27779D, 7);
                C0070a6.getAc4SampleHeader(this.f27779D, this.f27795l);
                nextTrackBundle.f27814a.sampleData(this.f27795l, 7);
                this.f27780E += 7;
            } else {
                this.f27780E = nextTrackBundle.outputSampleEncryptionData(this.f27779D, 0);
            }
            this.f27779D += this.f27780E;
            this.f27802s = 4;
            this.f27781F = 0;
        }
        z5h z5hVar = nextTrackBundle.f27817d.f80850a;
        r6h r6hVar = nextTrackBundle.f27814a;
        long currentSamplePresentationTimeUs = nextTrackBundle.getCurrentSamplePresentationTimeUs();
        g2h g2hVar = this.f27796m;
        if (g2hVar != null) {
            currentSamplePresentationTimeUs = g2hVar.adjustSampleTimestamp(currentSamplePresentationTimeUs);
        }
        long j = currentSamplePresentationTimeUs;
        if (z5hVar.f104272j == 0) {
            while (true) {
                int i3 = this.f27780E;
                int i4 = this.f27779D;
                if (i3 >= i4) {
                    break;
                }
                this.f27780E += r6hVar.sampleData((ah3) zj5Var, i4 - i3, false);
            }
        } else {
            byte[] data = this.f27792i.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i5 = z5hVar.f104272j;
            int i6 = i5 + 1;
            int i7 = 4 - i5;
            while (this.f27780E < this.f27779D) {
                int i8 = this.f27781F;
                if (i8 == 0) {
                    zj5Var.readFully(data, i7, i6);
                    this.f27792i.setPosition(0);
                    int i9 = this.f27792i.readInt();
                    if (i9 < i2) {
                        throw xhc.createForMalformedContainer("Invalid NAL length", th);
                    }
                    this.f27781F = i9 - 1;
                    this.f27791h.setPosition(0);
                    r6hVar.sampleData(this.f27791h, i);
                    r6hVar.sampleData(this.f27792i, i2);
                    this.f27782G = (this.f27785J.length <= 0 || !o8b.isNalUnitSei(z5hVar.f104268f.f54989M, data[i])) ? 0 : i2;
                    this.f27780E += 5;
                    this.f27779D += i7;
                } else {
                    if (this.f27782G) {
                        this.f27793j.reset(i8);
                        zj5Var.readFully(this.f27793j.getData(), 0, this.f27781F);
                        r6hVar.sampleData(this.f27793j, this.f27781F);
                        iSampleData = this.f27781F;
                        int iUnescapeStream = o8b.unescapeStream(this.f27793j.getData(), this.f27793j.limit());
                        this.f27793j.setPosition("video/hevc".equals(z5hVar.f104268f.f54989M) ? 1 : 0);
                        this.f27793j.setLimit(iUnescapeStream);
                        kt1.consume(j, this.f27793j, this.f27785J);
                    } else {
                        iSampleData = r6hVar.sampleData((ah3) zj5Var, i8, false);
                    }
                    this.f27780E += iSampleData;
                    this.f27781F -= iSampleData;
                    th = null;
                    i = 4;
                    i2 = 1;
                }
            }
        }
        int currentSampleFlags = nextTrackBundle.getCurrentSampleFlags();
        a6h encryptionBoxIfEncrypted = nextTrackBundle.getEncryptionBoxIfEncrypted();
        r6hVar.sampleMetadata(j, currentSampleFlags, this.f27779D, 0, encryptionBoxIfEncrypted != null ? encryptionBoxIfEncrypted.f516c : null);
        outputPendingMetadataSamples(j);
        if (!nextTrackBundle.next()) {
            this.f27778C = null;
        }
        this.f27802s = 3;
        return true;
    }

    private static boolean shouldParseContainerAtom(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227;
    }

    private static boolean shouldParseLeafAtom(int i) {
        return i == 1751411826 || i == 1835296868 || i == 1836476516 || i == 1936286840 || i == 1937011556 || i == 1937011827 || i == 1668576371 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1937011571 || i == 1952867444 || i == 1952868452 || i == 1953196132 || i == 1953654136 || i == 1953658222 || i == 1886614376 || i == 1935763834 || i == 1935763823 || i == 1936027235 || i == 1970628964 || i == 1935828848 || i == 1936158820 || i == 1701606260 || i == 1835362404 || i == 1701671783;
    }

    @hib
    /* JADX INFO: renamed from: b */
    public z5h m8727b(@hib z5h z5hVar) {
        return z5hVar;
    }

    @Override // p000.yj5
    public void init(ck5 ck5Var) {
        this.f27783H = ck5Var;
        enterReadingAtomHeaderState();
        initExtraTracks();
        z5h z5hVar = this.f27788e;
        if (z5hVar != null) {
            this.f27790g.put(0, new C4526c(ck5Var.track(0, z5hVar.f104264b), new s6h(this.f27788e, new long[0], new int[0], 0, new long[0], new int[0], 0L), new cz3(0, 0, 0, 0)));
            this.f27783H.endTracks();
        }
    }

    @Override // p000.yj5
    public int read(zj5 zj5Var, c5d c5dVar) throws IOException {
        while (true) {
            int i = this.f27802s;
            if (i != 0) {
                if (i == 1) {
                    readAtomPayload(zj5Var);
                } else if (i == 2) {
                    readEncryptionData(zj5Var);
                } else if (readSample(zj5Var)) {
                    return 0;
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
        int size = this.f27790g.size();
        for (int i = 0; i < size; i++) {
            this.f27790g.valueAt(i).resetFragmentInfo();
        }
        this.f27800q.clear();
        this.f27808y = 0;
        this.f27809z = j2;
        this.f27799p.clear();
        enterReadingAtomHeaderState();
    }

    @Override // p000.yj5
    public boolean sniff(zj5 zj5Var) throws IOException {
        return kuf.sniffFragmented(zj5Var);
    }

    public cv6(int i) {
        this(i, null);
    }

    private static void parseSenc(ihc ihcVar, int i, c6h c6hVar) throws xhc {
        ihcVar.setPosition(i + 8);
        int fullAtomFlags = ib0.parseFullAtomFlags(ihcVar.readInt());
        if ((fullAtomFlags & 1) != 0) {
            throw xhc.createForUnsupportedContainerFeature("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (fullAtomFlags & 2) != 0;
        int unsignedIntToInt = ihcVar.readUnsignedIntToInt();
        if (unsignedIntToInt == 0) {
            Arrays.fill(c6hVar.f15878m, 0, c6hVar.f15871f, false);
            return;
        }
        if (unsignedIntToInt == c6hVar.f15871f) {
            Arrays.fill(c6hVar.f15878m, 0, unsignedIntToInt, z);
            c6hVar.initEncryptionData(ihcVar.bytesLeft());
            c6hVar.fillEncryptionData(ihcVar);
        } else {
            throw xhc.createForMalformedContainer("Senc sample count " + unsignedIntToInt + " is different from fragment sample count" + c6hVar.f15871f, null);
        }
    }

    public cv6(int i, @hib g2h g2hVar) {
        this(i, g2hVar, null, Collections.emptyList());
    }

    public cv6(int i, @hib g2h g2hVar, @hib z5h z5hVar) {
        this(i, g2hVar, z5hVar, Collections.emptyList());
    }

    public cv6(int i, @hib g2h g2hVar, @hib z5h z5hVar, List<kq6> list) {
        this(i, g2hVar, z5hVar, list, null);
    }

    public cv6(int i, @hib g2h g2hVar, @hib z5h z5hVar, List<kq6> list, @hib r6h r6hVar) {
        this.f27787d = i;
        this.f27796m = g2hVar;
        this.f27788e = z5hVar;
        this.f27789f = Collections.unmodifiableList(list);
        this.f27801r = r6hVar;
        this.f27797n = new n65();
        this.f27798o = new ihc(16);
        this.f27791h = new ihc(o8b.f66670i);
        this.f27792i = new ihc(5);
        this.f27793j = new ihc();
        byte[] bArr = new byte[16];
        this.f27794k = bArr;
        this.f27795l = new ihc(bArr);
        this.f27799p = new ArrayDeque<>();
        this.f27800q = new ArrayDeque<>();
        this.f27790g = new SparseArray<>();
        this.f27776A = -9223372036854775807L;
        this.f27809z = -9223372036854775807L;
        this.f27777B = -9223372036854775807L;
        this.f27783H = ck5.f16800x;
        this.f27784I = new r6h[0];
        this.f27785J = new r6h[0];
    }
}

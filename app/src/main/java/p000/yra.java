package p000;

import com.google.android.exoplayer2.offline.StreamKey;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import p000.nja;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class yra implements nja, nja.InterfaceC9906a {

    /* JADX INFO: renamed from: F */
    public zye f102762F;

    /* JADX INFO: renamed from: a */
    public final nja[] f102763a;

    /* JADX INFO: renamed from: c */
    public final zm2 f102765c;

    /* JADX INFO: renamed from: f */
    @hib
    public nja.InterfaceC9906a f102768f;

    /* JADX INFO: renamed from: m */
    @hib
    public m6h f102769m;

    /* JADX INFO: renamed from: d */
    public final ArrayList<nja> f102766d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public final HashMap<g6h, g6h> f102767e = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public final IdentityHashMap<nle, Integer> f102764b = new IdentityHashMap<>();

    /* JADX INFO: renamed from: C */
    public nja[] f102761C = new nja[0];

    /* JADX INFO: renamed from: yra$a */
    public static final class C15782a implements pf5 {

        /* JADX INFO: renamed from: c */
        public final pf5 f102770c;

        /* JADX INFO: renamed from: d */
        public final g6h f102771d;

        public C15782a(pf5 pf5Var, g6h g6hVar) {
            this.f102770c = pf5Var;
            this.f102771d = g6hVar;
        }

        @Override // p000.pf5
        public void disable() {
            this.f102770c.disable();
        }

        @Override // p000.pf5
        public void enable() {
            this.f102770c.enable();
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15782a)) {
                return false;
            }
            C15782a c15782a = (C15782a) obj;
            return this.f102770c.equals(c15782a.f102770c) && this.f102771d.equals(c15782a.f102771d);
        }

        @Override // p000.pf5
        public int evaluateQueueSize(long j, List<? extends xca> list) {
            return this.f102770c.evaluateQueueSize(j, list);
        }

        @Override // p000.pf5
        public boolean excludeTrack(int i, long j) {
            return this.f102770c.excludeTrack(i, j);
        }

        @Override // p000.v6h
        public kq6 getFormat(int i) {
            return this.f102770c.getFormat(i);
        }

        @Override // p000.v6h
        public int getIndexInTrackGroup(int i) {
            return this.f102770c.getIndexInTrackGroup(i);
        }

        @Override // p000.pf5
        public long getLatestBitrateEstimate() {
            return this.f102770c.getLatestBitrateEstimate();
        }

        @Override // p000.pf5
        public kq6 getSelectedFormat() {
            return this.f102770c.getSelectedFormat();
        }

        @Override // p000.pf5
        public int getSelectedIndex() {
            return this.f102770c.getSelectedIndex();
        }

        @Override // p000.pf5
        public int getSelectedIndexInTrackGroup() {
            return this.f102770c.getSelectedIndexInTrackGroup();
        }

        @Override // p000.pf5
        @hib
        public Object getSelectionData() {
            return this.f102770c.getSelectionData();
        }

        @Override // p000.pf5
        public int getSelectionReason() {
            return this.f102770c.getSelectionReason();
        }

        @Override // p000.v6h
        public g6h getTrackGroup() {
            return this.f102771d;
        }

        @Override // p000.v6h
        public int getType() {
            return this.f102770c.getType();
        }

        public int hashCode() {
            return ((527 + this.f102771d.hashCode()) * 31) + this.f102770c.hashCode();
        }

        @Override // p000.v6h
        public int indexOf(kq6 kq6Var) {
            return this.f102770c.indexOf(kq6Var);
        }

        @Override // p000.pf5
        public boolean isTrackExcluded(int i, long j) {
            return this.f102770c.isTrackExcluded(i, j);
        }

        @Override // p000.v6h
        public int length() {
            return this.f102770c.length();
        }

        @Override // p000.pf5
        public void onDiscontinuity() {
            this.f102770c.onDiscontinuity();
        }

        @Override // p000.pf5
        public void onPlayWhenReadyChanged(boolean z) {
            this.f102770c.onPlayWhenReadyChanged(z);
        }

        @Override // p000.pf5
        public void onPlaybackSpeed(float f) {
            this.f102770c.onPlaybackSpeed(f);
        }

        @Override // p000.pf5
        public void onRebuffer() {
            this.f102770c.onRebuffer();
        }

        @Override // p000.pf5
        public boolean shouldCancelChunkLoad(long j, fz1 fz1Var, List<? extends xca> list) {
            return this.f102770c.shouldCancelChunkLoad(j, fz1Var, list);
        }

        @Override // p000.pf5
        public void updateSelectedTrack(long j, long j2, long j3, List<? extends xca> list, ada[] adaVarArr) {
            this.f102770c.updateSelectedTrack(j, j2, j3, list, adaVarArr);
        }

        @Override // p000.v6h
        public int indexOf(int i) {
            return this.f102770c.indexOf(i);
        }
    }

    /* JADX INFO: renamed from: yra$b */
    public static final class C15783b implements nja, nja.InterfaceC9906a {

        /* JADX INFO: renamed from: a */
        public final nja f102772a;

        /* JADX INFO: renamed from: b */
        public final long f102773b;

        /* JADX INFO: renamed from: c */
        public nja.InterfaceC9906a f102774c;

        public C15783b(nja njaVar, long j) {
            this.f102772a = njaVar;
            this.f102773b = j;
        }

        @Override // p000.nja, p000.zye
        public boolean continueLoading(long j) {
            return this.f102772a.continueLoading(j - this.f102773b);
        }

        @Override // p000.nja
        public void discardBuffer(long j, boolean z) {
            this.f102772a.discardBuffer(j - this.f102773b, z);
        }

        @Override // p000.nja
        public long getAdjustedSeekPositionUs(long j, iue iueVar) {
            return this.f102772a.getAdjustedSeekPositionUs(j - this.f102773b, iueVar) + this.f102773b;
        }

        @Override // p000.nja, p000.zye
        public long getBufferedPositionUs() {
            long bufferedPositionUs = this.f102772a.getBufferedPositionUs();
            if (bufferedPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f102773b + bufferedPositionUs;
        }

        @Override // p000.nja, p000.zye
        public long getNextLoadPositionUs() {
            long nextLoadPositionUs = this.f102772a.getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f102773b + nextLoadPositionUs;
        }

        @Override // p000.nja
        public List<StreamKey> getStreamKeys(List<pf5> list) {
            return this.f102772a.getStreamKeys(list);
        }

        @Override // p000.nja
        public m6h getTrackGroups() {
            return this.f102772a.getTrackGroups();
        }

        @Override // p000.nja, p000.zye
        public boolean isLoading() {
            return this.f102772a.isLoading();
        }

        @Override // p000.nja
        public void maybeThrowPrepareError() throws IOException {
            this.f102772a.maybeThrowPrepareError();
        }

        @Override // p000.nja.InterfaceC9906a
        public void onPrepared(nja njaVar) {
            ((nja.InterfaceC9906a) u80.checkNotNull(this.f102774c)).onPrepared(this);
        }

        @Override // p000.nja
        public void prepare(nja.InterfaceC9906a interfaceC9906a, long j) {
            this.f102774c = interfaceC9906a;
            this.f102772a.prepare(this, j - this.f102773b);
        }

        @Override // p000.nja
        public long readDiscontinuity() {
            long discontinuity = this.f102772a.readDiscontinuity();
            if (discontinuity == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f102773b + discontinuity;
        }

        @Override // p000.nja, p000.zye
        public void reevaluateBuffer(long j) {
            this.f102772a.reevaluateBuffer(j - this.f102773b);
        }

        @Override // p000.nja
        public long seekToUs(long j) {
            return this.f102772a.seekToUs(j - this.f102773b) + this.f102773b;
        }

        @Override // p000.nja
        public long selectTracks(pf5[] pf5VarArr, boolean[] zArr, nle[] nleVarArr, boolean[] zArr2, long j) {
            nle[] nleVarArr2 = new nle[nleVarArr.length];
            int i = 0;
            while (true) {
                nle childStream = null;
                if (i >= nleVarArr.length) {
                    break;
                }
                C15784c c15784c = (C15784c) nleVarArr[i];
                if (c15784c != null) {
                    childStream = c15784c.getChildStream();
                }
                nleVarArr2[i] = childStream;
                i++;
            }
            long jSelectTracks = this.f102772a.selectTracks(pf5VarArr, zArr, nleVarArr2, zArr2, j - this.f102773b);
            for (int i2 = 0; i2 < nleVarArr.length; i2++) {
                nle nleVar = nleVarArr2[i2];
                if (nleVar == null) {
                    nleVarArr[i2] = null;
                } else {
                    nle nleVar2 = nleVarArr[i2];
                    if (nleVar2 == null || ((C15784c) nleVar2).getChildStream() != nleVar) {
                        nleVarArr[i2] = new C15784c(nleVar, this.f102773b);
                    }
                }
            }
            return jSelectTracks + this.f102773b;
        }

        @Override // p000.zye.InterfaceC16321a
        public void onContinueLoadingRequested(nja njaVar) {
            ((nja.InterfaceC9906a) u80.checkNotNull(this.f102774c)).onContinueLoadingRequested(this);
        }
    }

    /* JADX INFO: renamed from: yra$c */
    public static final class C15784c implements nle {

        /* JADX INFO: renamed from: a */
        public final nle f102775a;

        /* JADX INFO: renamed from: b */
        public final long f102776b;

        public C15784c(nle nleVar, long j) {
            this.f102775a = nleVar;
            this.f102776b = j;
        }

        public nle getChildStream() {
            return this.f102775a;
        }

        @Override // p000.nle
        public boolean isReady() {
            return this.f102775a.isReady();
        }

        @Override // p000.nle
        public void maybeThrowError() throws IOException {
            this.f102775a.maybeThrowError();
        }

        @Override // p000.nle
        public int readData(nq6 nq6Var, sl3 sl3Var, int i) {
            int data = this.f102775a.readData(nq6Var, sl3Var, i);
            if (data == -4) {
                sl3Var.f82164f = Math.max(0L, sl3Var.f82164f + this.f102776b);
            }
            return data;
        }

        @Override // p000.nle
        public int skipData(long j) {
            return this.f102775a.skipData(j - this.f102776b);
        }
    }

    public yra(zm2 zm2Var, long[] jArr, nja... njaVarArr) {
        this.f102765c = zm2Var;
        this.f102763a = njaVarArr;
        this.f102762F = zm2Var.createCompositeSequenceableLoader(new zye[0]);
        for (int i = 0; i < njaVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f102763a[i] = new C15783b(njaVarArr[i], j);
            }
        }
    }

    @Override // p000.nja, p000.zye
    public boolean continueLoading(long j) {
        if (this.f102766d.isEmpty()) {
            return this.f102762F.continueLoading(j);
        }
        int size = this.f102766d.size();
        for (int i = 0; i < size; i++) {
            this.f102766d.get(i).continueLoading(j);
        }
        return false;
    }

    @Override // p000.nja
    public void discardBuffer(long j, boolean z) {
        for (nja njaVar : this.f102761C) {
            njaVar.discardBuffer(j, z);
        }
    }

    @Override // p000.nja
    public long getAdjustedSeekPositionUs(long j, iue iueVar) {
        nja[] njaVarArr = this.f102761C;
        return (njaVarArr.length > 0 ? njaVarArr[0] : this.f102763a[0]).getAdjustedSeekPositionUs(j, iueVar);
    }

    @Override // p000.nja, p000.zye
    public long getBufferedPositionUs() {
        return this.f102762F.getBufferedPositionUs();
    }

    public nja getChildPeriod(int i) {
        nja njaVar = this.f102763a[i];
        return njaVar instanceof C15783b ? ((C15783b) njaVar).f102772a : njaVar;
    }

    @Override // p000.nja, p000.zye
    public long getNextLoadPositionUs() {
        return this.f102762F.getNextLoadPositionUs();
    }

    @Override // p000.nja
    public m6h getTrackGroups() {
        return (m6h) u80.checkNotNull(this.f102769m);
    }

    @Override // p000.nja, p000.zye
    public boolean isLoading() {
        return this.f102762F.isLoading();
    }

    @Override // p000.nja
    public void maybeThrowPrepareError() throws IOException {
        for (nja njaVar : this.f102763a) {
            njaVar.maybeThrowPrepareError();
        }
    }

    @Override // p000.nja.InterfaceC9906a
    public void onPrepared(nja njaVar) {
        this.f102766d.remove(njaVar);
        if (!this.f102766d.isEmpty()) {
            return;
        }
        int i = 0;
        for (nja njaVar2 : this.f102763a) {
            i += njaVar2.getTrackGroups().f60034a;
        }
        g6h[] g6hVarArr = new g6h[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            nja[] njaVarArr = this.f102763a;
            if (i2 >= njaVarArr.length) {
                this.f102769m = new m6h(g6hVarArr);
                ((nja.InterfaceC9906a) u80.checkNotNull(this.f102768f)).onPrepared(this);
                return;
            }
            m6h trackGroups = njaVarArr[i2].getTrackGroups();
            int i4 = trackGroups.f60034a;
            int i5 = 0;
            while (i5 < i4) {
                g6h g6hVar = trackGroups.get(i5);
                g6h g6hVarCopyWithId = g6hVar.copyWithId(i2 + g1i.f38277c + g6hVar.f38908b);
                this.f102767e.put(g6hVarCopyWithId, g6hVar);
                g6hVarArr[i3] = g6hVarCopyWithId;
                i5++;
                i3++;
            }
            i2++;
        }
    }

    @Override // p000.nja
    public void prepare(nja.InterfaceC9906a interfaceC9906a, long j) {
        this.f102768f = interfaceC9906a;
        Collections.addAll(this.f102766d, this.f102763a);
        for (nja njaVar : this.f102763a) {
            njaVar.prepare(this, j);
        }
    }

    @Override // p000.nja
    public long readDiscontinuity() {
        long j = -9223372036854775807L;
        for (nja njaVar : this.f102761C) {
            long discontinuity = njaVar.readDiscontinuity();
            if (discontinuity == -9223372036854775807L) {
                if (j != -9223372036854775807L && njaVar.seekToUs(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (nja njaVar2 : this.f102761C) {
                    if (njaVar2 == njaVar) {
                        break;
                    }
                    if (njaVar2.seekToUs(discontinuity) != discontinuity) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = discontinuity;
            } else if (discontinuity != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // p000.nja, p000.zye
    public void reevaluateBuffer(long j) {
        this.f102762F.reevaluateBuffer(j);
    }

    @Override // p000.nja
    public long seekToUs(long j) {
        long jSeekToUs = this.f102761C[0].seekToUs(j);
        int i = 1;
        while (true) {
            nja[] njaVarArr = this.f102761C;
            if (i >= njaVarArr.length) {
                return jSeekToUs;
            }
            if (njaVarArr[i].seekToUs(jSeekToUs) != jSeekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.nja
    public long selectTracks(pf5[] pf5VarArr, boolean[] zArr, nle[] nleVarArr, boolean[] zArr2, long j) {
        Integer num;
        int[] iArr = new int[pf5VarArr.length];
        int[] iArr2 = new int[pf5VarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= pf5VarArr.length) {
                break;
            }
            nle nleVar = nleVarArr[i2];
            num = nleVar != null ? this.f102764b.get(nleVar) : null;
            iArr[i2] = num == null ? -1 : num.intValue();
            pf5 pf5Var = pf5VarArr[i2];
            if (pf5Var != null) {
                String str = pf5Var.getTrackGroup().f38908b;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(g1i.f38277c)));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        this.f102764b.clear();
        int length = pf5VarArr.length;
        nle[] nleVarArr2 = new nle[length];
        nle[] nleVarArr3 = new nle[pf5VarArr.length];
        Object[] objArr = new pf5[pf5VarArr.length];
        ArrayList arrayList = new ArrayList(this.f102763a.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.f102763a.length) {
            for (int i4 = i; i4 < pf5VarArr.length; i4++) {
                nleVarArr3[i4] = iArr[i4] == i3 ? nleVarArr[i4] : num;
                if (iArr2[i4] == i3) {
                    pf5 pf5Var2 = (pf5) u80.checkNotNull(pf5VarArr[i4]);
                    objArr[i4] = new C15782a(pf5Var2, (g6h) u80.checkNotNull(this.f102767e.get(pf5Var2.getTrackGroup())));
                } else {
                    objArr[i4] = num;
                }
            }
            int i5 = i3;
            ArrayList arrayList2 = arrayList;
            Object[] objArr2 = objArr;
            long jSelectTracks = this.f102763a[i3].selectTracks(objArr, zArr, nleVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jSelectTracks;
            } else if (jSelectTracks != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < pf5VarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    nle nleVar2 = (nle) u80.checkNotNull(nleVarArr3[i6]);
                    nleVarArr2[i6] = nleVarArr3[i6];
                    this.f102764b.put(nleVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    u80.checkState(nleVarArr3[i6] == 0);
                }
            }
            if (z) {
                arrayList2.add(this.f102763a[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            objArr = objArr2;
            i = 0;
            num = null;
        }
        int i7 = i;
        System.arraycopy(nleVarArr2, i7, nleVarArr, i7, length);
        nja[] njaVarArr = (nja[]) arrayList.toArray(new nja[i7]);
        this.f102761C = njaVarArr;
        this.f102762F = this.f102765c.createCompositeSequenceableLoader(njaVarArr);
        return j2;
    }

    @Override // p000.zye.InterfaceC16321a
    public void onContinueLoadingRequested(nja njaVar) {
        ((nja.InterfaceC9906a) u80.checkNotNull(this.f102768f)).onContinueLoadingRequested(this);
    }
}

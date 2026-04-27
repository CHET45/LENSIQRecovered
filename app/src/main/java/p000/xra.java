package p000;

import androidx.media3.common.C1213a;
import androidx.media3.exoplayer.C1233k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import p000.mja;

/* JADX INFO: loaded from: classes3.dex */
public final class xra implements mja, mja.InterfaceC9368a {

    /* JADX INFO: renamed from: C */
    @hib
    public n6h f99044C;

    /* JADX INFO: renamed from: H */
    public yye f99046H;

    /* JADX INFO: renamed from: a */
    public final mja[] f99047a;

    /* JADX INFO: renamed from: b */
    public final boolean[] f99048b;

    /* JADX INFO: renamed from: d */
    public final an2 f99050d;

    /* JADX INFO: renamed from: m */
    @hib
    public mja.InterfaceC9368a f99053m;

    /* JADX INFO: renamed from: e */
    public final ArrayList<mja> f99051e = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public final HashMap<h6h, h6h> f99052f = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public final IdentityHashMap<mle, Integer> f99049c = new IdentityHashMap<>();

    /* JADX INFO: renamed from: F */
    public mja[] f99045F = new mja[0];

    /* JADX INFO: renamed from: xra$a */
    public static final class C15261a extends au6 {

        /* JADX INFO: renamed from: d */
        public final h6h f99054d;

        public C15261a(of5 of5Var, h6h h6hVar) {
            super(of5Var);
            this.f99054d = h6hVar;
        }

        @Override // p000.au6
        public boolean equals(@hib Object obj) {
            if (super.equals(obj) && (obj instanceof C15261a)) {
                return this.f99054d.equals(((C15261a) obj).f99054d);
            }
            return false;
        }

        @Override // p000.au6, p000.u6h
        public C1213a getFormat(int i) {
            return this.f99054d.getFormat(getWrappedInstance().getIndexInTrackGroup(i));
        }

        @Override // p000.au6, p000.of5
        public C1213a getSelectedFormat() {
            return this.f99054d.getFormat(getWrappedInstance().getSelectedIndexInTrackGroup());
        }

        @Override // p000.au6, p000.u6h
        public h6h getTrackGroup() {
            return this.f99054d;
        }

        @Override // p000.au6
        public int hashCode() {
            return (super.hashCode() * 31) + this.f99054d.hashCode();
        }

        @Override // p000.au6, p000.u6h
        public int indexOf(C1213a c1213a) {
            return getWrappedInstance().indexOf(this.f99054d.indexOf(c1213a));
        }
    }

    public xra(an2 an2Var, long[] jArr, mja... mjaVarArr) {
        this.f99050d = an2Var;
        this.f99047a = mjaVarArr;
        this.f99046H = an2Var.empty();
        this.f99048b = new boolean[mjaVarArr.length];
        for (int i = 0; i < mjaVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f99048b[i] = true;
                this.f99047a[i] = new l0h(mjaVarArr[i], j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$selectTracks$0(mja mjaVar) {
        return mjaVar.getTrackGroups().getTrackTypes();
    }

    @Override // p000.mja, p000.yye
    public boolean continueLoading(C1233k c1233k) {
        if (this.f99051e.isEmpty()) {
            return this.f99046H.continueLoading(c1233k);
        }
        int size = this.f99051e.size();
        for (int i = 0; i < size; i++) {
            this.f99051e.get(i).continueLoading(c1233k);
        }
        return false;
    }

    @Override // p000.mja
    public void discardBuffer(long j, boolean z) {
        for (mja mjaVar : this.f99045F) {
            mjaVar.discardBuffer(j, z);
        }
    }

    @Override // p000.mja
    public long getAdjustedSeekPositionUs(long j, jue jueVar) {
        mja[] mjaVarArr = this.f99045F;
        return (mjaVarArr.length > 0 ? mjaVarArr[0] : this.f99047a[0]).getAdjustedSeekPositionUs(j, jueVar);
    }

    @Override // p000.mja, p000.yye
    public long getBufferedPositionUs() {
        return this.f99046H.getBufferedPositionUs();
    }

    public mja getChildPeriod(int i) {
        return this.f99048b[i] ? ((l0h) this.f99047a[i]).getWrappedMediaPeriod() : this.f99047a[i];
    }

    @Override // p000.mja, p000.yye
    public long getNextLoadPositionUs() {
        return this.f99046H.getNextLoadPositionUs();
    }

    @Override // p000.mja
    public n6h getTrackGroups() {
        return (n6h) v80.checkNotNull(this.f99044C);
    }

    @Override // p000.mja, p000.yye
    public boolean isLoading() {
        return this.f99046H.isLoading();
    }

    @Override // p000.mja
    public void maybeThrowPrepareError() throws IOException {
        for (mja mjaVar : this.f99047a) {
            mjaVar.maybeThrowPrepareError();
        }
    }

    @Override // p000.mja.InterfaceC9368a
    public void onPrepared(mja mjaVar) {
        this.f99051e.remove(mjaVar);
        if (!this.f99051e.isEmpty()) {
            return;
        }
        int i = 0;
        for (mja mjaVar2 : this.f99047a) {
            i += mjaVar2.getTrackGroups().f63418a;
        }
        h6h[] h6hVarArr = new h6h[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            mja[] mjaVarArr = this.f99047a;
            if (i2 >= mjaVarArr.length) {
                this.f99044C = new n6h(h6hVarArr);
                ((mja.InterfaceC9368a) v80.checkNotNull(this.f99053m)).onPrepared(this);
                return;
            }
            n6h trackGroups = mjaVarArr[i2].getTrackGroups();
            int i4 = trackGroups.f63418a;
            int i5 = 0;
            while (i5 < i4) {
                h6h h6hVar = trackGroups.get(i5);
                C1213a[] c1213aArr = new C1213a[h6hVar.f42518a];
                for (int i6 = 0; i6 < h6hVar.f42518a; i6++) {
                    C1213a format = h6hVar.getFormat(i6);
                    C1213a.b bVarBuildUpon = format.buildUpon();
                    StringBuilder sb = new StringBuilder();
                    sb.append(i2);
                    sb.append(g1i.f38277c);
                    String str = format.f8277a;
                    if (str == null) {
                        str = "";
                    }
                    sb.append(str);
                    c1213aArr[i6] = bVarBuildUpon.setId(sb.toString()).build();
                }
                h6h h6hVar2 = new h6h(i2 + g1i.f38277c + h6hVar.f42519b, c1213aArr);
                this.f99052f.put(h6hVar2, h6hVar);
                h6hVarArr[i3] = h6hVar2;
                i5++;
                i3++;
            }
            i2++;
        }
    }

    @Override // p000.mja
    public void prepare(mja.InterfaceC9368a interfaceC9368a, long j) {
        this.f99053m = interfaceC9368a;
        Collections.addAll(this.f99051e, this.f99047a);
        for (mja mjaVar : this.f99047a) {
            mjaVar.prepare(this, j);
        }
    }

    @Override // p000.mja
    public long readDiscontinuity() {
        long j = -9223372036854775807L;
        for (mja mjaVar : this.f99045F) {
            long discontinuity = mjaVar.readDiscontinuity();
            if (discontinuity == -9223372036854775807L) {
                if (j != -9223372036854775807L && mjaVar.seekToUs(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (mja mjaVar2 : this.f99045F) {
                    if (mjaVar2 == mjaVar) {
                        break;
                    }
                    if (mjaVar2.seekToUs(discontinuity) != discontinuity) {
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

    @Override // p000.mja, p000.yye
    public void reevaluateBuffer(long j) {
        this.f99046H.reevaluateBuffer(j);
    }

    @Override // p000.mja
    public long seekToUs(long j) {
        long jSeekToUs = this.f99045F[0].seekToUs(j);
        int i = 1;
        while (true) {
            mja[] mjaVarArr = this.f99045F;
            if (i >= mjaVarArr.length) {
                return jSeekToUs;
            }
            if (mjaVarArr[i].seekToUs(jSeekToUs) != jSeekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.mja
    public long selectTracks(of5[] of5VarArr, boolean[] zArr, mle[] mleVarArr, boolean[] zArr2, long j) {
        Integer num;
        int[] iArr = new int[of5VarArr.length];
        int[] iArr2 = new int[of5VarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= of5VarArr.length) {
                break;
            }
            mle mleVar = mleVarArr[i2];
            num = mleVar != null ? this.f99049c.get(mleVar) : null;
            iArr[i2] = num == null ? -1 : num.intValue();
            of5 of5Var = of5VarArr[i2];
            if (of5Var != null) {
                String str = of5Var.getTrackGroup().f42519b;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(g1i.f38277c)));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        this.f99049c.clear();
        int length = of5VarArr.length;
        mle[] mleVarArr2 = new mle[length];
        mle[] mleVarArr3 = new mle[of5VarArr.length];
        Object[] objArr = new of5[of5VarArr.length];
        ArrayList arrayList = new ArrayList(this.f99047a.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.f99047a.length) {
            for (int i4 = i; i4 < of5VarArr.length; i4++) {
                mleVarArr3[i4] = iArr[i4] == i3 ? mleVarArr[i4] : num;
                if (iArr2[i4] == i3) {
                    of5 of5Var2 = (of5) v80.checkNotNull(of5VarArr[i4]);
                    objArr[i4] = new C15261a(of5Var2, (h6h) v80.checkNotNull(this.f99052f.get(of5Var2.getTrackGroup())));
                } else {
                    objArr[i4] = num;
                }
            }
            int i5 = i3;
            ArrayList arrayList2 = arrayList;
            Object[] objArr2 = objArr;
            long jSelectTracks = this.f99047a[i3].selectTracks(objArr, zArr, mleVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jSelectTracks;
            } else if (jSelectTracks != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < of5VarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    mle mleVar2 = (mle) v80.checkNotNull(mleVarArr3[i6]);
                    mleVarArr2[i6] = mleVarArr3[i6];
                    this.f99049c.put(mleVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    v80.checkState(mleVarArr3[i6] == 0);
                }
            }
            if (z) {
                arrayList2.add(this.f99047a[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            objArr = objArr2;
            i = 0;
            num = null;
        }
        int i7 = i;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(mleVarArr2, i7, mleVarArr, i7, length);
        this.f99045F = (mja[]) arrayList3.toArray(new mja[i7]);
        this.f99046H = this.f99050d.create(arrayList3, eb9.transform(arrayList3, new lz6() { // from class: wra
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return xra.lambda$selectTracks$0((mja) obj);
            }
        }));
        return j2;
    }

    @Override // p000.yye.InterfaceC15893a
    public void onContinueLoadingRequested(mja mjaVar) {
        ((mja.InterfaceC9368a) v80.checkNotNull(this.f99053m)).onContinueLoadingRequested(this);
    }
}

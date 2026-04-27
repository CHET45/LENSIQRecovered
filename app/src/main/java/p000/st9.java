package p000;

import android.util.Pair;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class st9 extends p7h {

    /* JADX INFO: renamed from: c */
    @hib
    public C12776a f82825c;

    private static int findRenderer(p1e[] p1eVarArr, g6h g6hVar, int[] iArr, boolean z) throws ba5 {
        int length = p1eVarArr.length;
        int i = 0;
        boolean z2 = true;
        for (int i2 = 0; i2 < p1eVarArr.length; i2++) {
            p1e p1eVar = p1eVarArr[i2];
            int iMax = 0;
            for (int i3 = 0; i3 < g6hVar.f38907a; i3++) {
                iMax = Math.max(iMax, p1e.getFormatSupport(p1eVar.supportsFormat(g6hVar.getFormat(i3))));
            }
            boolean z3 = iArr[i2] == 0;
            if (iMax > i || (iMax == i && z && !z2 && z3)) {
                length = i2;
                z2 = z3;
                i = iMax;
            }
        }
        return length;
    }

    private static int[] getFormatSupport(p1e p1eVar, g6h g6hVar) throws ba5 {
        int[] iArr = new int[g6hVar.f38907a];
        for (int i = 0; i < g6hVar.f38907a; i++) {
            iArr[i] = p1eVar.supportsFormat(g6hVar.getFormat(i));
        }
        return iArr;
    }

    private static int[] getMixedMimeTypeAdaptationSupports(p1e[] p1eVarArr) throws ba5 {
        int length = p1eVarArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = p1eVarArr[i].supportsMixedMimeTypeAdaptation();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: d */
    public abstract Pair<r1e[], pf5[]> mo10432d(C12776a c12776a, int[][][] iArr, int[] iArr2, vna.C14175b c14175b, t1h t1hVar) throws ba5;

    @hib
    public final C12776a getCurrentMappedTrackInfo() {
        return this.f82825c;
    }

    @Override // p000.p7h
    public final void onSelectionActivated(@hib Object obj) {
        this.f82825c = (C12776a) obj;
    }

    @Override // p000.p7h
    public final q7h selectTracks(p1e[] p1eVarArr, m6h m6hVar, vna.C14175b c14175b, t1h t1hVar) throws ba5 {
        int[] iArr = new int[p1eVarArr.length + 1];
        int length = p1eVarArr.length + 1;
        g6h[][] g6hVarArr = new g6h[length][];
        int[][][] iArr2 = new int[p1eVarArr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i2 = m6hVar.f60034a;
            g6hVarArr[i] = new g6h[i2];
            iArr2[i] = new int[i2][];
        }
        int[] mixedMimeTypeAdaptationSupports = getMixedMimeTypeAdaptationSupports(p1eVarArr);
        for (int i3 = 0; i3 < m6hVar.f60034a; i3++) {
            g6h g6hVar = m6hVar.get(i3);
            int iFindRenderer = findRenderer(p1eVarArr, g6hVar, iArr, g6hVar.f38909c == 5);
            int[] formatSupport = iFindRenderer == p1eVarArr.length ? new int[g6hVar.f38907a] : getFormatSupport(p1eVarArr[iFindRenderer], g6hVar);
            int i4 = iArr[iFindRenderer];
            g6hVarArr[iFindRenderer][i4] = g6hVar;
            iArr2[iFindRenderer][i4] = formatSupport;
            iArr[iFindRenderer] = i4 + 1;
        }
        m6h[] m6hVarArr = new m6h[p1eVarArr.length];
        String[] strArr = new String[p1eVarArr.length];
        int[] iArr3 = new int[p1eVarArr.length];
        for (int i5 = 0; i5 < p1eVarArr.length; i5++) {
            int i6 = iArr[i5];
            m6hVarArr[i5] = new m6h((g6h[]) x0i.nullSafeArrayCopy(g6hVarArr[i5], i6));
            iArr2[i5] = (int[][]) x0i.nullSafeArrayCopy(iArr2[i5], i6);
            strArr[i5] = p1eVarArr[i5].getName();
            iArr3[i5] = p1eVarArr[i5].getTrackType();
        }
        C12776a c12776a = new C12776a(strArr, iArr3, m6hVarArr, mixedMimeTypeAdaptationSupports, iArr2, new m6h((g6h[]) x0i.nullSafeArrayCopy(g6hVarArr[p1eVarArr.length], iArr[p1eVarArr.length])));
        Pair<r1e[], pf5[]> pairMo10432d = mo10432d(c12776a, iArr2, mixedMimeTypeAdaptationSupports, c14175b, t1hVar);
        return new q7h((r1e[]) pairMo10432d.first, (pf5[]) pairMo10432d.second, l7h.buildTracks(c12776a, (v6h[]) pairMo10432d.second), c12776a);
    }

    /* JADX INFO: renamed from: st9$a */
    public static final class C12776a {

        /* JADX INFO: renamed from: h */
        public static final int f82826h = 0;

        /* JADX INFO: renamed from: i */
        public static final int f82827i = 1;

        /* JADX INFO: renamed from: j */
        public static final int f82828j = 2;

        /* JADX INFO: renamed from: k */
        public static final int f82829k = 3;

        /* JADX INFO: renamed from: a */
        public final int f82830a;

        /* JADX INFO: renamed from: b */
        public final String[] f82831b;

        /* JADX INFO: renamed from: c */
        public final int[] f82832c;

        /* JADX INFO: renamed from: d */
        public final m6h[] f82833d;

        /* JADX INFO: renamed from: e */
        public final int[] f82834e;

        /* JADX INFO: renamed from: f */
        public final int[][][] f82835f;

        /* JADX INFO: renamed from: g */
        public final m6h f82836g;

        /* JADX INFO: renamed from: st9$a$a */
        @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        @fdi
        public C12776a(String[] strArr, int[] iArr, m6h[] m6hVarArr, int[] iArr2, int[][][] iArr3, m6h m6hVar) {
            this.f82831b = strArr;
            this.f82832c = iArr;
            this.f82833d = m6hVarArr;
            this.f82835f = iArr3;
            this.f82834e = iArr2;
            this.f82836g = m6hVar;
            this.f82830a = iArr.length;
        }

        public int getAdaptiveSupport(int i, int i2, boolean z) {
            int i3 = this.f82833d[i].get(i2).f38907a;
            int[] iArr = new int[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int trackSupport = getTrackSupport(i, i2, i5);
                if (trackSupport == 4 || (z && trackSupport == 3)) {
                    iArr[i4] = i5;
                    i4++;
                }
            }
            return getAdaptiveSupport(i, i2, Arrays.copyOf(iArr, i4));
        }

        public int getCapabilities(int i, int i2, int i3) {
            return this.f82835f[i][i2][i3];
        }

        public int getRendererCount() {
            return this.f82830a;
        }

        public String getRendererName(int i) {
            return this.f82831b[i];
        }

        public int getRendererSupport(int i) {
            int iMax = 0;
            for (int[] iArr : this.f82835f[i]) {
                for (int i2 : iArr) {
                    int formatSupport = p1e.getFormatSupport(i2);
                    int i3 = 1;
                    if (formatSupport != 0 && formatSupport != 1 && formatSupport != 2) {
                        if (formatSupport != 3) {
                            if (formatSupport == 4) {
                                return 3;
                            }
                            throw new IllegalStateException();
                        }
                        i3 = 2;
                    }
                    iMax = Math.max(iMax, i3);
                }
            }
            return iMax;
        }

        public int getRendererType(int i) {
            return this.f82832c[i];
        }

        public m6h getTrackGroups(int i) {
            return this.f82833d[i];
        }

        public int getTrackSupport(int i, int i2, int i3) {
            return p1e.getFormatSupport(getCapabilities(i, i2, i3));
        }

        public int getTypeSupport(int i) {
            int iMax = 0;
            for (int i2 = 0; i2 < this.f82830a; i2++) {
                if (this.f82832c[i2] == i) {
                    iMax = Math.max(iMax, getRendererSupport(i2));
                }
            }
            return iMax;
        }

        public m6h getUnmappedTrackGroups() {
            return this.f82836g;
        }

        public int getAdaptiveSupport(int i, int i2, int[] iArr) {
            int i3 = 0;
            int iMin = 16;
            String str = null;
            boolean z = false;
            int i4 = 0;
            while (i3 < iArr.length) {
                String str2 = this.f82833d[i].get(i2).getFormat(iArr[i3]).f54989M;
                int i5 = i4 + 1;
                if (i4 == 0) {
                    str = str2;
                } else {
                    z |= !x0i.areEqual(str, str2);
                }
                iMin = Math.min(iMin, p1e.getAdaptiveSupport(this.f82835f[i][i2][i3]));
                i3++;
                i4 = i5;
            }
            return z ? Math.min(iMin, this.f82834e[i]) : iMin;
        }
    }
}

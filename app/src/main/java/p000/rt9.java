package p000;

import android.util.Pair;
import androidx.media3.exoplayer.InterfaceC1255s;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Objects;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class rt9 extends o7h {

    /* JADX INFO: renamed from: c */
    @hib
    public C12281a f79531c;

    private static int findRenderer(InterfaceC1255s[] interfaceC1255sArr, h6h h6hVar, int[] iArr, boolean z) throws aa5 {
        int length = interfaceC1255sArr.length;
        int i = 0;
        boolean z2 = true;
        for (int i2 = 0; i2 < interfaceC1255sArr.length; i2++) {
            InterfaceC1255s interfaceC1255s = interfaceC1255sArr[i2];
            int iMax = 0;
            for (int i3 = 0; i3 < h6hVar.f42518a; i3++) {
                iMax = Math.max(iMax, InterfaceC1255s.getFormatSupport(interfaceC1255s.supportsFormat(h6hVar.getFormat(i3))));
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

    private static int[] getFormatSupport(InterfaceC1255s interfaceC1255s, h6h h6hVar) throws aa5 {
        int[] iArr = new int[h6hVar.f42518a];
        for (int i = 0; i < h6hVar.f42518a; i++) {
            iArr[i] = interfaceC1255s.supportsFormat(h6hVar.getFormat(i));
        }
        return iArr;
    }

    private static int[] getMixedMimeTypeAdaptationSupports(InterfaceC1255s[] interfaceC1255sArr) throws aa5 {
        int length = interfaceC1255sArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = interfaceC1255sArr[i].supportsMixedMimeTypeAdaptation();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: d */
    public abstract Pair<s1e[], of5[]> mo19937d(C12281a c12281a, int[][][] iArr, int[] iArr2, una.C13612b c13612b, q1h q1hVar) throws aa5;

    @hib
    public final C12281a getCurrentMappedTrackInfo() {
        return this.f79531c;
    }

    @Override // p000.o7h
    public final void onSelectionActivated(@hib Object obj) {
        this.f79531c = (C12281a) obj;
    }

    @Override // p000.o7h
    public final r7h selectTracks(InterfaceC1255s[] interfaceC1255sArr, n6h n6hVar, una.C13612b c13612b, q1h q1hVar) throws aa5 {
        int[] iArr = new int[interfaceC1255sArr.length + 1];
        int length = interfaceC1255sArr.length + 1;
        h6h[][] h6hVarArr = new h6h[length][];
        int[][][] iArr2 = new int[interfaceC1255sArr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i2 = n6hVar.f63418a;
            h6hVarArr[i] = new h6h[i2];
            iArr2[i] = new int[i2][];
        }
        int[] mixedMimeTypeAdaptationSupports = getMixedMimeTypeAdaptationSupports(interfaceC1255sArr);
        for (int i3 = 0; i3 < n6hVar.f63418a; i3++) {
            h6h h6hVar = n6hVar.get(i3);
            int iFindRenderer = findRenderer(interfaceC1255sArr, h6hVar, iArr, h6hVar.f42520c == 5);
            int[] formatSupport = iFindRenderer == interfaceC1255sArr.length ? new int[h6hVar.f42518a] : getFormatSupport(interfaceC1255sArr[iFindRenderer], h6hVar);
            int i4 = iArr[iFindRenderer];
            h6hVarArr[iFindRenderer][i4] = h6hVar;
            iArr2[iFindRenderer][i4] = formatSupport;
            iArr[iFindRenderer] = i4 + 1;
        }
        n6h[] n6hVarArr = new n6h[interfaceC1255sArr.length];
        String[] strArr = new String[interfaceC1255sArr.length];
        int[] iArr3 = new int[interfaceC1255sArr.length];
        for (int i5 = 0; i5 < interfaceC1255sArr.length; i5++) {
            int i6 = iArr[i5];
            n6hVarArr[i5] = new n6h((h6h[]) t0i.nullSafeArrayCopy(h6hVarArr[i5], i6));
            iArr2[i5] = (int[][]) t0i.nullSafeArrayCopy(iArr2[i5], i6);
            strArr[i5] = interfaceC1255sArr[i5].getName();
            iArr3[i5] = interfaceC1255sArr[i5].getTrackType();
        }
        C12281a c12281a = new C12281a(strArr, iArr3, n6hVarArr, mixedMimeTypeAdaptationSupports, iArr2, new n6h((h6h[]) t0i.nullSafeArrayCopy(h6hVarArr[interfaceC1255sArr.length], iArr[interfaceC1255sArr.length])));
        Pair<s1e[], of5[]> pairMo19937d = mo19937d(c12281a, iArr2, mixedMimeTypeAdaptationSupports, c13612b, q1hVar);
        return new r7h((s1e[]) pairMo19937d.first, (of5[]) pairMo19937d.second, k7h.buildTracks(c12281a, (u6h[]) pairMo19937d.second), c12281a);
    }

    /* JADX INFO: renamed from: rt9$a */
    public static final class C12281a {

        /* JADX INFO: renamed from: h */
        public static final int f79532h = 0;

        /* JADX INFO: renamed from: i */
        public static final int f79533i = 1;

        /* JADX INFO: renamed from: j */
        public static final int f79534j = 2;

        /* JADX INFO: renamed from: k */
        public static final int f79535k = 3;

        /* JADX INFO: renamed from: a */
        public final int f79536a;

        /* JADX INFO: renamed from: b */
        public final String[] f79537b;

        /* JADX INFO: renamed from: c */
        public final int[] f79538c;

        /* JADX INFO: renamed from: d */
        public final n6h[] f79539d;

        /* JADX INFO: renamed from: e */
        public final int[] f79540e;

        /* JADX INFO: renamed from: f */
        public final int[][][] f79541f;

        /* JADX INFO: renamed from: g */
        public final n6h f79542g;

        /* JADX INFO: renamed from: rt9$a$a */
        @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        @fdi
        public C12281a(String[] strArr, int[] iArr, n6h[] n6hVarArr, int[] iArr2, int[][][] iArr3, n6h n6hVar) {
            this.f79537b = strArr;
            this.f79538c = iArr;
            this.f79539d = n6hVarArr;
            this.f79541f = iArr3;
            this.f79540e = iArr2;
            this.f79542g = n6hVar;
            this.f79536a = iArr.length;
        }

        public int getAdaptiveSupport(int i, int i2, boolean z) {
            int i3 = this.f79539d[i].get(i2).f42518a;
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
            return this.f79541f[i][i2][i3];
        }

        public int getRendererCount() {
            return this.f79536a;
        }

        public String getRendererName(int i) {
            return this.f79537b[i];
        }

        public int getRendererSupport(int i) {
            int iMax = 0;
            for (int[] iArr : this.f79541f[i]) {
                for (int i2 : iArr) {
                    int formatSupport = InterfaceC1255s.getFormatSupport(i2);
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
            return this.f79538c[i];
        }

        public n6h getTrackGroups(int i) {
            return this.f79539d[i];
        }

        public int getTrackSupport(int i, int i2, int i3) {
            return InterfaceC1255s.getFormatSupport(getCapabilities(i, i2, i3));
        }

        public int getTypeSupport(int i) {
            int iMax = 0;
            for (int i2 = 0; i2 < this.f79536a; i2++) {
                if (this.f79538c[i2] == i) {
                    iMax = Math.max(iMax, getRendererSupport(i2));
                }
            }
            return iMax;
        }

        public n6h getUnmappedTrackGroups() {
            return this.f79542g;
        }

        public int getAdaptiveSupport(int i, int i2, int[] iArr) {
            int i3 = 0;
            int iMin = 16;
            String str = null;
            boolean z = false;
            int i4 = 0;
            while (i3 < iArr.length) {
                String str2 = this.f79539d[i].get(i2).getFormat(iArr[i3]).f8291o;
                int i5 = i4 + 1;
                if (i4 == 0) {
                    str = str2;
                } else {
                    z |= !Objects.equals(str, str2);
                }
                iMin = Math.min(iMin, InterfaceC1255s.getAdaptiveSupport(this.f79541f[i][i2][i3]));
                i3++;
                i4 = i5;
            }
            return z ? Math.min(iMin, this.f79540e[i]) : iMin;
        }
    }
}

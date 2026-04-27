package p000;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import p000.hc9;
import p000.kx7;
import p000.of5;
import p000.q14;
import p000.rt9;
import p000.x7h;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class k7h {

    /* JADX INFO: renamed from: k7h$a */
    public interface InterfaceC8224a {
        of5 createAdaptiveTrackSelection(of5.C10355a c10355a);
    }

    private k7h() {
    }

    public static x7h buildTracks(rt9.C12281a c12281a, u6h[] u6hVarArr) {
        List[] listArr = new List[u6hVarArr.length];
        for (int i = 0; i < u6hVarArr.length; i++) {
            u6h u6hVar = u6hVarArr[i];
            listArr[i] = u6hVar != null ? kx7.m15111of(u6hVar) : kx7.m15110of();
        }
        return buildTracks(c12281a, (List<? extends u6h>[]) listArr);
    }

    public static hc9.C6792a createFallbackOptions(of5 of5Var) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = of5Var.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (of5Var.isTrackExcluded(i2, jElapsedRealtime)) {
                i++;
            }
        }
        return new hc9.C6792a(1, 0, length, i);
    }

    public static of5[] createTrackSelectionsForDefinitions(of5.C10355a[] c10355aArr, InterfaceC8224a interfaceC8224a) {
        of5[] of5VarArr = new of5[c10355aArr.length];
        boolean z = false;
        for (int i = 0; i < c10355aArr.length; i++) {
            of5.C10355a c10355a = c10355aArr[i];
            if (c10355a != null) {
                int[] iArr = c10355a.f67490b;
                if (iArr.length <= 1 || z) {
                    of5VarArr[i] = new k26(c10355a.f67489a, iArr[0], c10355a.f67491c);
                } else {
                    of5VarArr[i] = interfaceC8224a.createAdaptiveTrackSelection(c10355a);
                    z = true;
                }
            }
        }
        return of5VarArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Point getMaxVideoSizeInViewport(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto Lf
            r3 = 0
            r0 = 1
            if (r6 <= r7) goto L8
            r1 = r0
            goto L9
        L8:
            r1 = r3
        L9:
            if (r4 <= r5) goto Lc
            r3 = r0
        Lc:
            if (r1 == r3) goto Lf
            goto L12
        Lf:
            r2 = r5
            r5 = r4
            r4 = r2
        L12:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L22
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = p000.t0i.ceilDivide(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = p000.t0i.ceilDivide(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.k7h.getMaxVideoSizeInViewport(boolean, int, int, int, int):android.graphics.Point");
    }

    @Deprecated
    public static q14.C11255e updateParametersWithOverride(q14.C11255e c11255e, int i, n6h n6hVar, boolean z, @hib q14.C11257g c11257g) {
        q14.C11255e.a rendererDisabled = c11255e.buildUpon().clearSelectionOverrides(i).setRendererDisabled(i, z);
        if (c11257g != null) {
            rendererDisabled.setSelectionOverride(i, n6hVar, c11257g);
        }
        return rendererDisabled.build();
    }

    public static x7h buildTracks(rt9.C12281a c12281a, List<? extends u6h>[] listArr) {
        boolean z;
        kx7.C8541a c8541a = new kx7.C8541a();
        for (int i = 0; i < c12281a.getRendererCount(); i++) {
            n6h trackGroups = c12281a.getTrackGroups(i);
            List<? extends u6h> list = listArr[i];
            for (int i2 = 0; i2 < trackGroups.f63418a; i2++) {
                h6h h6hVar = trackGroups.get(i2);
                boolean z2 = c12281a.getAdaptiveSupport(i, i2, false) != 0;
                int i3 = h6hVar.f42518a;
                int[] iArr = new int[i3];
                boolean[] zArr = new boolean[i3];
                for (int i4 = 0; i4 < h6hVar.f42518a; i4++) {
                    iArr[i4] = c12281a.getTrackSupport(i, i2, i4);
                    int i5 = 0;
                    while (true) {
                        if (i5 >= list.size()) {
                            z = false;
                            break;
                        }
                        u6h u6hVar = list.get(i5);
                        if (u6hVar.getTrackGroup().equals(h6hVar) && u6hVar.indexOf(i4) != -1) {
                            z = true;
                            break;
                        }
                        i5++;
                    }
                    zArr[i4] = z;
                }
                c8541a.add(new x7h.C14971a(h6hVar, z2, iArr, zArr));
            }
        }
        n6h unmappedTrackGroups = c12281a.getUnmappedTrackGroups();
        for (int i6 = 0; i6 < unmappedTrackGroups.f63418a; i6++) {
            h6h h6hVar2 = unmappedTrackGroups.get(i6);
            int[] iArr2 = new int[h6hVar2.f42518a];
            Arrays.fill(iArr2, 0);
            c8541a.add(new x7h.C14971a(h6hVar2, false, iArr2, new boolean[h6hVar2.f42518a]));
        }
        return new x7h(c8541a.build());
    }
}

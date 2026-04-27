package p000;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import p000.f24;
import p000.ic9;
import p000.kx7;
import p000.pf5;
import p000.st9;
import p000.y7h;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class l7h {

    /* JADX INFO: renamed from: l7h$a */
    public interface InterfaceC8708a {
        pf5 createAdaptiveTrackSelection(pf5.C10940a c10940a);
    }

    private l7h() {
    }

    public static y7h buildTracks(st9.C12776a c12776a, v6h[] v6hVarArr) {
        List[] listArr = new List[v6hVarArr.length];
        for (int i = 0; i < v6hVarArr.length; i++) {
            v6h v6hVar = v6hVarArr[i];
            listArr[i] = v6hVar != null ? kx7.m15111of(v6hVar) : kx7.m15110of();
        }
        return buildTracks(c12776a, (List<? extends v6h>[]) listArr);
    }

    public static ic9.C7229a createFallbackOptions(pf5 pf5Var) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = pf5Var.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (pf5Var.isTrackExcluded(i2, jElapsedRealtime)) {
                i++;
            }
        }
        return new ic9.C7229a(1, 0, length, i);
    }

    public static pf5[] createTrackSelectionsForDefinitions(pf5.C10940a[] c10940aArr, InterfaceC8708a interfaceC8708a) {
        pf5[] pf5VarArr = new pf5[c10940aArr.length];
        boolean z = false;
        for (int i = 0; i < c10940aArr.length; i++) {
            pf5.C10940a c10940a = c10940aArr[i];
            if (c10940a != null) {
                int[] iArr = c10940a.f70595b;
                if (iArr.length <= 1 || z) {
                    pf5VarArr[i] = new j26(c10940a.f70594a, iArr[0], c10940a.f70596c);
                } else {
                    pf5VarArr[i] = interfaceC8708a.createAdaptiveTrackSelection(c10940a);
                    z = true;
                }
            }
        }
        return pf5VarArr;
    }

    public static f24.C5550e updateParametersWithOverride(f24.C5550e c5550e, int i, m6h m6hVar, boolean z, @hib f24.C5552g c5552g) {
        f24.C5550e.a rendererDisabled = c5550e.buildUpon().clearSelectionOverrides(i).setRendererDisabled(i, z);
        if (c5552g != null) {
            rendererDisabled.setSelectionOverride(i, m6hVar, c5552g);
        }
        return rendererDisabled.build();
    }

    public static y7h buildTracks(st9.C12776a c12776a, List<? extends v6h>[] listArr) {
        boolean z;
        kx7.C8541a c8541a = new kx7.C8541a();
        for (int i = 0; i < c12776a.getRendererCount(); i++) {
            m6h trackGroups = c12776a.getTrackGroups(i);
            List<? extends v6h> list = listArr[i];
            for (int i2 = 0; i2 < trackGroups.f60034a; i2++) {
                g6h g6hVar = trackGroups.get(i2);
                boolean z2 = c12776a.getAdaptiveSupport(i, i2, false) != 0;
                int i3 = g6hVar.f38907a;
                int[] iArr = new int[i3];
                boolean[] zArr = new boolean[i3];
                for (int i4 = 0; i4 < g6hVar.f38907a; i4++) {
                    iArr[i4] = c12776a.getTrackSupport(i, i2, i4);
                    int i5 = 0;
                    while (true) {
                        if (i5 >= list.size()) {
                            z = false;
                            break;
                        }
                        v6h v6hVar = list.get(i5);
                        if (v6hVar.getTrackGroup().equals(g6hVar) && v6hVar.indexOf(i4) != -1) {
                            z = true;
                            break;
                        }
                        i5++;
                    }
                    zArr[i4] = z;
                }
                c8541a.add(new y7h.C15542a(g6hVar, z2, iArr, zArr));
            }
        }
        m6h unmappedTrackGroups = c12776a.getUnmappedTrackGroups();
        for (int i6 = 0; i6 < unmappedTrackGroups.f60034a; i6++) {
            g6h g6hVar2 = unmappedTrackGroups.get(i6);
            int[] iArr2 = new int[g6hVar2.f38907a];
            Arrays.fill(iArr2, 0);
            c8541a.add(new y7h.C15542a(g6hVar2, false, iArr2, new boolean[g6hVar2.f38907a]));
        }
        return new y7h(c8541a.build());
    }
}

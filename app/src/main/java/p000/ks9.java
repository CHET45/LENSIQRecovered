package p000;

import androidx.compose.foundation.gestures.C0602a;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/MapDraggableAnchors\n+ 2 ObjectFloatMap.kt\nandroidx/collection/ObjectFloatMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1225:1\n401#2,4:1226\n373#2,6:1230\n383#2,3:1237\n386#2,2:1241\n406#2,2:1243\n389#2,6:1245\n408#2:1251\n401#2,4:1252\n373#2,6:1256\n383#2,3:1263\n386#2,2:1267\n406#2,2:1269\n389#2,6:1271\n408#2:1277\n401#2,4:1278\n373#2,6:1282\n383#2,3:1289\n386#2,2:1293\n406#2,2:1295\n389#2,6:1297\n408#2:1303\n1810#3:1236\n1672#3:1240\n1810#3:1262\n1672#3:1266\n1810#3:1288\n1672#3:1292\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/MapDraggableAnchors\n*L\n1147#1:1226,4\n1147#1:1230,6\n1147#1:1237,3\n1147#1:1241,2\n1147#1:1243,2\n1147#1:1245,6\n1147#1:1251\n1163#1:1252,4\n1163#1:1256,6\n1163#1:1263,3\n1163#1:1267,2\n1163#1:1269,2\n1163#1:1271,6\n1163#1:1277\n1193#1:1278,4\n1193#1:1282,6\n1193#1:1289,3\n1193#1:1293,2\n1193#1:1295,2\n1193#1:1297,6\n1193#1:1303\n1147#1:1236\n1147#1:1240\n1163#1:1262\n1163#1:1266\n1193#1:1288\n1193#1:1292\n*E\n"})
public final class ks9<T> implements ro4<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final vjb<T> f55233a;

    public ks9(@yfb vjb<T> vjbVar) {
        this.f55233a = vjbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052 A[PHI: r5 r6
  0x0052: PHI (r5v3 T) = (r5v2 T), (r5v4 T) binds: [B:6:0x0022, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r6v2 float) = (r6v1 float), (r6v3 float) binds: [B:6:0x0022, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.ro4
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T closestAnchor(float r19) {
        /*
            r18 = this;
            r0 = r18
            vjb<T> r1 = r0.f55233a
            java.lang.Object[] r2 = r1.f91398b
            float[] r3 = r1.f91399c
            long[] r1 = r1.f91397a
            int r4 = r1.length
            int r4 = r4 + (-2)
            r5 = 0
            if (r4 < 0) goto L57
            r6 = 2139095040(0x7f800000, float:Infinity)
            r7 = 0
            r8 = r7
        L14:
            r9 = r1[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L52
            int r11 = r8 - r4
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r7
        L2e:
            if (r13 >= r11) goto L50
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L4c
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            float r14 = r19 - r14
            float r14 = java.lang.Math.abs(r14)
            int r16 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r16 > 0) goto L4c
            r6 = r14
            r5 = r15
        L4c:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L2e
        L50:
            if (r11 != r12) goto L57
        L52:
            if (r8 == r4) goto L57
            int r8 = r8 + 1
            goto L14
        L57:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ks9.closestAnchor(float):java.lang.Object");
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ks9) {
            return md8.areEqual(this.f55233a, ((ks9) obj).f55233a);
        }
        return false;
    }

    @Override // p000.ro4
    public void forEach(@yfb gz6<? super T, ? super Float, bth> gz6Var) {
        vjb<T> vjbVar = this.f55233a;
        Object[] objArr = vjbVar.f91398b;
        float[] fArr = vjbVar.f91399c;
        long[] jArr = vjbVar.f91397a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        gz6Var.invoke(objArr[i4], Float.valueOf(fArr[i4]));
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // p000.ro4
    public int getSize() {
        return this.f55233a.getSize();
    }

    @Override // p000.ro4
    public boolean hasAnchorFor(T t) {
        return this.f55233a.containsKey(t);
    }

    public int hashCode() {
        return this.f55233a.hashCode() * 31;
    }

    @Override // p000.ro4
    public float maxAnchor() {
        return C0602a.maxValueOrNaN(this.f55233a);
    }

    @Override // p000.ro4
    public float minAnchor() {
        return C0602a.minValueOrNaN(this.f55233a);
    }

    @Override // p000.ro4
    public float positionOf(T t) {
        return this.f55233a.getOrDefault(t, Float.NaN);
    }

    @yfb
    public String toString() {
        return "MapDraggableAnchors(" + this.f55233a + ')';
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c A[PHI: r5 r9
  0x005c: PHI (r5v3 T) = (r5v2 T), (r5v4 T) binds: [B:6:0x0023, B:22:0x005a] A[DONT_GENERATE, DONT_INLINE]
  0x005c: PHI (r9v2 float) = (r9v1 float), (r9v3 float) binds: [B:6:0x0023, B:22:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.ro4
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T closestAnchor(float r20, boolean r21) {
        /*
            r19 = this;
            r0 = r19
            vjb<T> r1 = r0.f55233a
            java.lang.Object[] r2 = r1.f91398b
            float[] r3 = r1.f91399c
            long[] r1 = r1.f91397a
            int r4 = r1.length
            int r4 = r4 + (-2)
            r5 = 0
            if (r4 < 0) goto L61
            r6 = 2139095040(0x7f800000, float:Infinity)
            r7 = 0
            r9 = r6
            r8 = r7
        L15:
            r10 = r1[r8]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L5c
            int r12 = r8 - r4
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r7
        L2f:
            if (r14 >= r12) goto L5a
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L56
            int r15 = r8 << 3
            int r15 = r15 + r14
            r16 = r2[r15]
            r15 = r3[r15]
            if (r21 == 0) goto L46
            float r15 = r15 - r20
            goto L48
        L46:
            float r15 = r20 - r15
        L48:
            r17 = 0
            int r17 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r17 >= 0) goto L4f
            r15 = r6
        L4f:
            int r17 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r17 > 0) goto L56
            r9 = r15
            r5 = r16
        L56:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L2f
        L5a:
            if (r12 != r13) goto L61
        L5c:
            if (r8 == r4) goto L61
            int r8 = r8 + 1
            goto L15
        L61:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ks9.closestAnchor(float, boolean):java.lang.Object");
    }
}

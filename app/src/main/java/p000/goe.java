package p000;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nScatterSetWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n267#2,4:64\n237#2,7:68\n248#2,3:76\n251#2,2:80\n272#2,2:82\n254#2,6:84\n274#2:90\n296#2,2:93\n267#2,4:95\n237#2,7:99\n248#2,3:107\n251#2,2:111\n272#2:113\n298#2,2:114\n273#2:116\n254#2,6:117\n274#2:123\n300#2:124\n1810#3:75\n1672#3:79\n1810#3:106\n1672#3:110\n1855#4,2:91\n1747#4,3:125\n*S KotlinDebug\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n*L\n50#1:64,4\n50#1:68,7\n50#1:76,3\n50#1:80,2\n50#1:82,2\n50#1:84,6\n50#1:90\n59#1:93,2\n59#1:95,4\n59#1:99,7\n59#1:107,3\n59#1:111,2\n59#1:113\n59#1:114,2\n59#1:116\n59#1:117,6\n59#1:123\n59#1:124\n50#1:75\n50#1:79\n59#1:106\n59#1:110\n53#1:91,2\n61#1:125,3\n*E\n"})
public final class goe {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean fastAny(@p000.yfb java.util.Set<? extends java.lang.Object> r14, @p000.yfb p000.qy6<java.lang.Object, java.lang.Boolean> r15) {
        /*
            boolean r0 = r14 instanceof p000.foe
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L5a
            foe r14 = (p000.foe) r14
            doe r14 = r14.getSet$runtime_release()
            java.lang.Object[] r0 = r14.f30278b
            long[] r14 = r14.f30277a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L58
            r4 = r2
        L16:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L53
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L30:
            if (r9 >= r7) goto L51
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4d
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            java.lang.Object r10 = r15.invoke(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L4d
            goto L84
        L4d:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L30
        L51:
            if (r7 != r8) goto L58
        L53:
            if (r4 == r3) goto L58
            int r4 = r4 + 1
            goto L16
        L58:
            r1 = r2
            goto L84
        L5a:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            boolean r0 = r14 instanceof java.util.Collection
            if (r0 == 0) goto L6a
            r0 = r14
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6a
            goto L58
        L6a:
            java.util.Iterator r14 = r14.iterator()
        L6e:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L58
            java.lang.Object r0 = r14.next()
            java.lang.Object r0 = r15.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L6e
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.goe.fastAny(java.util.Set, qy6):boolean");
    }

    public static final <T> void fastForEach(@yfb Set<? extends T> set, @yfb qy6<? super T, bth> qy6Var) {
        if (!(set instanceof foe)) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                qy6Var.invoke(it.next());
            }
            return;
        }
        doe<T> set$runtime_release = ((foe) set).getSet$runtime_release();
        Object[] objArr = set$runtime_release.f30278b;
        long[] jArr = set$runtime_release.f30277a;
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
                        qy6Var.invoke(objArr[(i << 3) + i3]);
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

    @yfb
    public static final <T> Set<T> wrapIntoSet(@yfb doe<T> doeVar) {
        return new foe(doeVar);
    }
}

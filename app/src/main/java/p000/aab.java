package p000;

import androidx.compose.foundation.lazy.layout.InterfaceC0660b;
import p000.qz8;
import p000.wc8;

/* JADX INFO: loaded from: classes.dex */
@ah5
@dwf({"SMAP\nLazyLayoutKeyIndexMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutKeyIndexMap.kt\nandroidx/compose/foundation/lazy/layout/NearestRangeKeyIndexMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 4 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n*L\n1#1,103:1\n1#2:104\n26#3:105\n360#4,5:106\n*S KotlinDebug\n*F\n+ 1 LazyLayoutKeyIndexMap.kt\nandroidx/compose/foundation/lazy/layout/NearestRangeKeyIndexMap\n*L\n73#1:105\n98#1:106,5\n*E\n"})
@e0g(parameters = 0)
public final class aab implements InterfaceC0660b {

    /* JADX INFO: renamed from: e */
    public static final int f830e = 8;

    /* JADX INFO: renamed from: b */
    @yfb
    public final zjb<Object> f831b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Object[] f832c;

    /* JADX INFO: renamed from: d */
    public final int f833d;

    /* JADX INFO: renamed from: aab$a */
    public static final class C0120a extends tt8 implements qy6<wc8.C14548a<? extends qz8.InterfaceC11771a>, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f834a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f835b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ e6b<Object> f836c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ aab f837d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0120a(int i, int i2, e6b<Object> e6bVar, aab aabVar) {
            super(1);
            this.f834a = i;
            this.f835b = i2;
            this.f836c = e6bVar;
            this.f837d = aabVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(wc8.C14548a<? extends qz8.InterfaceC11771a> c14548a) {
            invoke2(c14548a);
            return bth.f14751a;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0039  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void invoke2(@p000.yfb p000.wc8.C14548a<? extends p000.qz8.InterfaceC11771a> r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r7.getValue()
                qz8$a r0 = (p000.qz8.InterfaceC11771a) r0
                qy6 r0 = r0.getKey()
                int r1 = r6.f834a
                int r2 = r7.getStartIndex()
                int r1 = java.lang.Math.max(r1, r2)
                int r2 = r6.f835b
                int r3 = r7.getStartIndex()
                int r4 = r7.getSize()
                int r3 = r3 + r4
                int r3 = r3 + (-1)
                int r2 = java.lang.Math.min(r2, r3)
                if (r1 > r2) goto L57
            L27:
                if (r0 == 0) goto L39
                int r3 = r7.getStartIndex()
                int r3 = r1 - r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r3 = r0.invoke(r3)
                if (r3 != 0) goto L3d
            L39:
                java.lang.Object r3 = androidx.compose.foundation.lazy.layout.C0663e.getDefaultLazyLayoutKey(r1)
            L3d:
                e6b<java.lang.Object> r4 = r6.f836c
                r4.set(r3, r1)
                aab r4 = r6.f837d
                java.lang.Object[] r4 = p000.aab.access$getKeys$p(r4)
                aab r5 = r6.f837d
                int r5 = p000.aab.access$getKeysStartIndex$p(r5)
                int r5 = r1 - r5
                r4[r5] = r3
                if (r1 == r2) goto L57
                int r1 = r1 + 1
                goto L27
            L57:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.aab.C0120a.invoke2(wc8$a):void");
        }
    }

    public aab(@yfb f78 f78Var, @yfb qz8<?> qz8Var) {
        wc8<Interval> intervals = qz8Var.getIntervals();
        int first = f78Var.getFirst();
        if (first < 0) {
            throw new IllegalStateException("negative nearestRange.first");
        }
        int iMin = Math.min(f78Var.getLast(), intervals.getSize() - 1);
        if (iMin < first) {
            this.f831b = akb.emptyObjectIntMap();
            this.f832c = new Object[0];
            this.f833d = 0;
        } else {
            int i = (iMin - first) + 1;
            this.f832c = new Object[i];
            this.f833d = first;
            e6b e6bVar = new e6b(i);
            intervals.forEach(first, iMin, new C0120a(first, iMin, e6bVar, this));
            this.f831b = e6bVar;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0660b
    public int getIndex(@yfb Object obj) {
        zjb<Object> zjbVar = this.f831b;
        int iFindKeyIndex = zjbVar.findKeyIndex(obj);
        if (iFindKeyIndex >= 0) {
            return zjbVar.f105300c[iFindKeyIndex];
        }
        return -1;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0660b
    @gib
    public Object getKey(int i) {
        Object[] objArr = this.f832c;
        int i2 = i - this.f833d;
        if (i2 < 0 || i2 > e80.getLastIndex(objArr)) {
            return null;
        }
        return objArr[i2];
    }
}

package p000;

import androidx.compose.foundation.lazy.layout.InterfaceC0660b;
import p000.wc8;

/* JADX INFO: loaded from: classes.dex */
public final class d29 implements c29 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final z29 f28263a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final a29 f28264b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final InterfaceC0660b f28265c;

    /* JADX INFO: renamed from: d29$a */
    @dwf({"SMAP\nLazyStaggeredGridItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridItemProvider.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProviderImpl$Item$1\n+ 2 LazyLayoutIntervalContent.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent\n*L\n1#1,100:1\n60#2,3:101\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridItemProvider.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProviderImpl$Item$1\n*L\n79#1:101,3\n*E\n"})
    public static final class C4586a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f28267b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4586a(int i) {
            super(2);
            this.f28267b = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        @hk2
        public final void invoke(@gib zl2 zl2Var, int i) {
            if ((i & 3) == 2 && zl2Var.getSkipping()) {
                zl2Var.skipToGroupEnd();
                return;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(608834466, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl.Item.<anonymous> (LazyStaggeredGridItemProvider.kt:78)");
            }
            a29 a29Var = d29.this.f28264b;
            int i2 = this.f28267b;
            wc8.C14548a<z19> c14548a = a29Var.getIntervals().get(i2);
            c14548a.getValue().getItem().invoke(g29.f38296a, Integer.valueOf(i2 - c14548a.getStartIndex()), zl2Var, 6);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: d29$b */
    public static final class C4587b extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f28269b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f28270c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f28271d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4587b(int i, Object obj, int i2) {
            super(2);
            this.f28269b = i;
            this.f28270c = obj;
            this.f28271d = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            d29.this.Item(this.f28269b, this.f28270c, zl2Var, tsd.updateChangedFlags(this.f28271d | 1));
        }
    }

    public d29(@yfb z29 z29Var, @yfb a29 a29Var, @yfb InterfaceC0660b interfaceC0660b) {
        this.f28263a = z29Var;
        this.f28264b = a29Var;
        this.f28265c = interfaceC0660b;
    }

    @Override // p000.vz8
    @hk2
    public void Item(int i, @yfb Object obj, @gib zl2 zl2Var, int i2) {
        int i3;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(89098518);
        if ((i2 & 6) == 0) {
            i3 = (zl2VarStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= zl2VarStartRestartGroup.changedInstance(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= zl2VarStartRestartGroup.changed(this) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(89098518, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl.Item (LazyStaggeredGridItemProvider.kt:76)");
            }
            g09.LazyLayoutPinnableItem(obj, i, this.f28263a.getPinnedItems$foundation_release(), mk2.rememberComposableLambda(608834466, true, new C4586a(i), zl2VarStartRestartGroup, 54), zl2VarStartRestartGroup, ((i3 >> 3) & 14) | kw1.f55470l | ((i3 << 3) & 112));
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C4587b(i, obj, i2));
        }
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d29) {
            return md8.areEqual(this.f28264b, ((d29) obj).f28264b);
        }
        return false;
    }

    @Override // p000.vz8
    @gib
    public Object getContentType(int i) {
        return this.f28264b.getContentType(i);
    }

    @Override // p000.vz8
    public int getIndex(@yfb Object obj) {
        return getKeyIndexMap().getIndex(obj);
    }

    @Override // p000.vz8
    public int getItemCount() {
        return this.f28264b.getItemCount();
    }

    @Override // p000.vz8
    @yfb
    public Object getKey(int i) {
        Object key = getKeyIndexMap().getKey(i);
        return key == null ? this.f28264b.getKey(i) : key;
    }

    @Override // p000.c29
    @yfb
    public InterfaceC0660b getKeyIndexMap() {
        return this.f28265c;
    }

    @Override // p000.c29
    @yfb
    public y29 getSpanProvider() {
        return this.f28264b.getSpanProvider();
    }

    public int hashCode() {
        return this.f28264b.hashCode();
    }
}

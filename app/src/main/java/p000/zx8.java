package p000;

import androidx.compose.foundation.lazy.layout.InterfaceC0660b;
import p000.wc8;

/* JADX INFO: loaded from: classes.dex */
@ah5
public final class zx8 implements yx8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final az8 f106324a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final wx8 f106325b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final InterfaceC0660b f106326c;

    /* JADX INFO: renamed from: zx8$a */
    @dwf({"SMAP\nLazyGridItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemProviderImpl$Item$1\n+ 2 LazyLayoutIntervalContent.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent\n*L\n1#1,101:1\n60#2,3:102\n*S KotlinDebug\n*F\n+ 1 LazyGridItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemProviderImpl$Item$1\n*L\n77#1:102,3\n*E\n"})
    public static final class C16299a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f106328b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16299a(int i) {
            super(2);
            this.f106328b = i;
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
                gm2.traceEventStart(726189336, i, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item.<anonymous> (LazyGridItemProvider.kt:76)");
            }
            wx8 wx8Var = zx8.this.f106325b;
            int i2 = this.f106328b;
            wc8.C14548a<vx8> c14548a = wx8Var.getIntervals().get(i2);
            c14548a.getValue().getItem().invoke(cy8.f28053a, Integer.valueOf(i2 - c14548a.getStartIndex()), zl2Var, 6);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: zx8$b */
    public static final class C16300b extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f106330b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f106331c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f106332d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16300b(int i, Object obj, int i2) {
            super(2);
            this.f106330b = i;
            this.f106331c = obj;
            this.f106332d = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            zx8.this.Item(this.f106330b, this.f106331c, zl2Var, tsd.updateChangedFlags(this.f106332d | 1));
        }
    }

    public zx8(@yfb az8 az8Var, @yfb wx8 wx8Var, @yfb InterfaceC0660b interfaceC0660b) {
        this.f106324a = az8Var;
        this.f106325b = wx8Var;
        this.f106326c = interfaceC0660b;
    }

    @Override // p000.vz8
    @hk2
    public void Item(int i, @yfb Object obj, @gib zl2 zl2Var, int i2) {
        int i3;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(1493551140);
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
                gm2.traceEventStart(1493551140, i3, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:74)");
            }
            g09.LazyLayoutPinnableItem(obj, i, this.f106324a.getPinnedItems$foundation_release(), mk2.rememberComposableLambda(726189336, true, new C16299a(i), zl2VarStartRestartGroup, 54), zl2VarStartRestartGroup, ((i3 >> 3) & 14) | kw1.f55470l | ((i3 << 3) & 112));
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C16300b(i, obj, i2));
        }
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zx8) {
            return md8.areEqual(this.f106325b, ((zx8) obj).f106325b);
        }
        return false;
    }

    @Override // p000.vz8
    @gib
    public Object getContentType(int i) {
        return this.f106325b.getContentType(i);
    }

    @Override // p000.vz8
    public int getIndex(@yfb Object obj) {
        return getKeyIndexMap().getIndex(obj);
    }

    @Override // p000.vz8
    public int getItemCount() {
        return this.f106325b.getItemCount();
    }

    @Override // p000.vz8
    @yfb
    public Object getKey(int i) {
        Object key = getKeyIndexMap().getKey(i);
        return key == null ? this.f106325b.getKey(i) : key;
    }

    @Override // p000.yx8
    @yfb
    public InterfaceC0660b getKeyIndexMap() {
        return this.f106326c;
    }

    @Override // p000.yx8
    @yfb
    public yy8 getSpanLayoutProvider() {
        return this.f106325b.getSpanLayoutProvider$foundation_release();
    }

    public int hashCode() {
        return this.f106325b.hashCode();
    }
}

package p000;

import androidx.compose.foundation.lazy.layout.InterfaceC0660b;
import p000.wc8;

/* JADX INFO: loaded from: classes.dex */
@ah5
@e0g(parameters = 1)
public final class qbc implements vz8 {

    /* JADX INFO: renamed from: e */
    public static final int f73865e = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final dcc f73866a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final qz8<kbc> f73867b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final InterfaceC0660b f73868c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final vbc f73869d = vbc.f90565a;

    /* JADX INFO: renamed from: qbc$a */
    @dwf({"SMAP\nLazyLayoutPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider$Item$1\n+ 2 LazyLayoutIntervalContent.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent\n*L\n1#1,397:1\n60#2,3:398\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider$Item$1\n*L\n209#1:398,3\n*E\n"})
    public static final class C11411a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f73871b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11411a(int i) {
            super(2);
            this.f73871b = i;
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
                gm2.traceEventStart(1142237095, i, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item.<anonymous> (LazyLayoutPager.kt:208)");
            }
            qz8 qz8Var = qbc.this.f73867b;
            int i2 = this.f73871b;
            qbc qbcVar = qbc.this;
            wc8.C14548a c14548a = qz8Var.getIntervals().get(i2);
            ((kbc) c14548a.getValue()).getItem().invoke(qbcVar.f73869d, Integer.valueOf(i2 - c14548a.getStartIndex()), zl2Var, 0);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: qbc$b */
    public static final class C11412b extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f73873b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f73874c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f73875d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11412b(int i, Object obj, int i2) {
            super(2);
            this.f73873b = i;
            this.f73874c = obj;
            this.f73875d = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            qbc.this.Item(this.f73873b, this.f73874c, zl2Var, tsd.updateChangedFlags(this.f73875d | 1));
        }
    }

    public qbc(@yfb dcc dccVar, @yfb qz8<kbc> qz8Var, @yfb InterfaceC0660b interfaceC0660b) {
        this.f73866a = dccVar;
        this.f73867b = qz8Var;
        this.f73868c = interfaceC0660b;
    }

    @Override // p000.vz8
    @hk2
    public void Item(int i, @yfb Object obj, @gib zl2 zl2Var, int i2) {
        int i3;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-1201380429);
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
                gm2.traceEventStart(-1201380429, i3, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item (LazyLayoutPager.kt:206)");
            }
            g09.LazyLayoutPinnableItem(obj, i, this.f73866a.getPinnedPages$foundation_release(), mk2.rememberComposableLambda(1142237095, true, new C11411a(i), zl2VarStartRestartGroup, 54), zl2VarStartRestartGroup, ((i3 >> 3) & 14) | kw1.f55470l | ((i3 << 3) & 112));
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C11412b(i, obj, i2));
        }
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qbc) {
            return md8.areEqual(this.f73867b, ((qbc) obj).f73867b);
        }
        return false;
    }

    @Override // p000.vz8
    public int getIndex(@yfb Object obj) {
        return this.f73868c.getIndex(obj);
    }

    @Override // p000.vz8
    public int getItemCount() {
        return this.f73867b.getItemCount();
    }

    @Override // p000.vz8
    @yfb
    public Object getKey(int i) {
        Object key = this.f73868c.getKey(i);
        return key == null ? this.f73867b.getKey(i) : key;
    }

    public int hashCode() {
        return this.f73867b.hashCode();
    }
}

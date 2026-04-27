package p000;

import androidx.compose.foundation.lazy.C0650a;
import androidx.compose.foundation.lazy.layout.InterfaceC0660b;
import java.util.List;
import p000.wc8;

/* JADX INFO: loaded from: classes.dex */
@ah5
public final class v09 implements u09 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final m19 f89608a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final s09 f89609b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final C0650a f89610c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final InterfaceC0660b f89611d;

    /* JADX INFO: renamed from: v09$a */
    @dwf({"SMAP\nLazyListItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListItemProvider.kt\nandroidx/compose/foundation/lazy/LazyListItemProviderImpl$Item$1\n+ 2 LazyLayoutIntervalContent.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent\n*L\n1#1,106:1\n60#2,3:107\n*S KotlinDebug\n*F\n+ 1 LazyListItemProvider.kt\nandroidx/compose/foundation/lazy/LazyListItemProviderImpl$Item$1\n*L\n78#1:107,3\n*E\n"})
    public static final class C13807a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f89613b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13807a(int i) {
            super(2);
            this.f89613b = i;
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
                gm2.traceEventStart(-824725566, i, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.<anonymous> (LazyListItemProvider.kt:77)");
            }
            s09 s09Var = v09.this.f89609b;
            int i2 = this.f89613b;
            v09 v09Var = v09.this;
            wc8.C14548a<r09> c14548a = s09Var.getIntervals().get(i2);
            c14548a.getValue().getItem().invoke(v09Var.getItemScope(), Integer.valueOf(i2 - c14548a.getStartIndex()), zl2Var, 0);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: v09$b */
    public static final class C13808b extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f89615b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f89616c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f89617d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13808b(int i, Object obj, int i2) {
            super(2);
            this.f89615b = i;
            this.f89616c = obj;
            this.f89617d = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            v09.this.Item(this.f89615b, this.f89616c, zl2Var, tsd.updateChangedFlags(this.f89617d | 1));
        }
    }

    public v09(@yfb m19 m19Var, @yfb s09 s09Var, @yfb C0650a c0650a, @yfb InterfaceC0660b interfaceC0660b) {
        this.f89608a = m19Var;
        this.f89609b = s09Var;
        this.f89610c = c0650a;
        this.f89611d = interfaceC0660b;
    }

    @Override // p000.vz8
    @hk2
    public void Item(int i, @yfb Object obj, @gib zl2 zl2Var, int i2) {
        int i3;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-462424778);
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
                gm2.traceEventStart(-462424778, i3, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:75)");
            }
            g09.LazyLayoutPinnableItem(obj, i, this.f89608a.getPinnedItems$foundation_release(), mk2.rememberComposableLambda(-824725566, true, new C13807a(i), zl2VarStartRestartGroup, 54), zl2VarStartRestartGroup, ((i3 >> 3) & 14) | kw1.f55470l | ((i3 << 3) & 112));
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C13808b(i, obj, i2));
        }
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v09) {
            return md8.areEqual(this.f89609b, ((v09) obj).f89609b);
        }
        return false;
    }

    @Override // p000.vz8
    @gib
    public Object getContentType(int i) {
        return this.f89609b.getContentType(i);
    }

    @Override // p000.u09
    @yfb
    public List<Integer> getHeaderIndexes() {
        return this.f89609b.getHeaderIndexes();
    }

    @Override // p000.vz8
    public int getIndex(@yfb Object obj) {
        return getKeyIndexMap().getIndex(obj);
    }

    @Override // p000.vz8
    public int getItemCount() {
        return this.f89609b.getItemCount();
    }

    @Override // p000.u09
    @yfb
    public C0650a getItemScope() {
        return this.f89610c;
    }

    @Override // p000.vz8
    @yfb
    public Object getKey(int i) {
        Object key = getKeyIndexMap().getKey(i);
        return key == null ? this.f89609b.getKey(i) : key;
    }

    @Override // p000.u09
    @yfb
    public InterfaceC0660b getKeyIndexMap() {
        return this.f89611d;
    }

    public int hashCode() {
        return this.f89609b.hashCode();
    }
}

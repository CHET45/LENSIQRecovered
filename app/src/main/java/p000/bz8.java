package p000;

import androidx.mediarouter.media.C1340j;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,566:1\n1223#2,6:567\n1223#2,6:573\n1223#2,6:579\n*S KotlinDebug\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridStateKt\n*L\n73#1:567,6\n98#1:573,6\n100#1:579,6\n*E\n"})
public final class bz8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final hy8 f15229a;

    /* JADX INFO: renamed from: bz8$a */
    public static final class C2108a implements vba {

        /* JADX INFO: renamed from: a */
        public final int f15230a;

        /* JADX INFO: renamed from: b */
        public final int f15231b;

        /* JADX INFO: renamed from: c */
        @yfb
        public final Map<AbstractC9938nm, Integer> f15232c = xt9.emptyMap();

        public static /* synthetic */ void getAlignmentLines$annotations() {
        }

        @Override // p000.vba
        @yfb
        public Map<AbstractC9938nm, Integer> getAlignmentLines() {
            return this.f15232c;
        }

        @Override // p000.vba
        public int getHeight() {
            return this.f15231b;
        }

        @Override // p000.vba
        public int getWidth() {
            return this.f15230a;
        }

        @Override // p000.vba
        public void placeChildren() {
        }
    }

    /* JADX INFO: renamed from: bz8$b */
    public static final class C2109b extends tt8 implements qy6<Integer, List<? extends scc<? extends Integer, ? extends ku2>>> {

        /* JADX INFO: renamed from: a */
        public static final C2109b f15233a = new C2109b();

        public C2109b() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ List<? extends scc<? extends Integer, ? extends ku2>> invoke(Integer num) {
            return invoke(num.intValue());
        }

        @yfb
        public final List<scc<Integer, ku2>> invoke(int i) {
            return l82.emptyList();
        }
    }

    /* JADX INFO: renamed from: bz8$c */
    public static final class C2110c extends tt8 implements ny6<az8> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f15234a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f15235b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2110c(int i, int i2) {
            super(0);
            this.f15234a = i;
            this.f15235b = i2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final az8 invoke() {
            return new az8(this.f15234a, this.f15235b);
        }
    }

    /* JADX INFO: renamed from: bz8$d */
    public static final class C2111d extends tt8 implements ny6<az8> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f15236a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f15237b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ oy8 f15238c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2111d(int i, int i2, oy8 oy8Var) {
            super(0);
            this.f15236a = i;
            this.f15237b = i2;
            this.f15238c = oy8Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final az8 invoke() {
            return new az8(this.f15236a, this.f15237b, this.f15238c);
        }
    }

    static {
        C2108a c2108a = new C2108a();
        List listEmptyList = l82.emptyList();
        t7c t7cVar = t7c.Vertical;
        f15229a = new hy8(null, 0, false, 0.0f, c2108a, false, y13.CoroutineScope(a05.f2a), e64.Density$default(1.0f, 0.0f, 2, null), 0, C2109b.f15233a, listEmptyList, 0, 0, 0, false, t7cVar, 0, 0);
    }

    @yfb
    @hk2
    public static final az8 rememberLazyGridState(int i, int i2, @gib zl2 zl2Var, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(29186956, i3, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:71)");
        }
        Object[] objArr = new Object[0];
        dme<az8, ?> saver = az8.f12241v.getSaver();
        boolean z = ((((i3 & 14) ^ 6) > 4 && zl2Var.changed(i)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && zl2Var.changed(i2)) || (i3 & 48) == 32);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (z || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new C2110c(i, i2);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        az8 az8Var = (az8) gyd.rememberSaveable(objArr, (dme) saver, (String) null, (ny6) objRememberedValue, zl2Var, 0, 4);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return az8Var;
    }

    @ah5
    @yfb
    @hk2
    public static final az8 rememberLazyGridState(int i, int i2, @gib oy8 oy8Var, @gib zl2 zl2Var, int i3, int i4) {
        oy8 oy8Var2;
        int i5 = (i4 & 1) != 0 ? 0 : i;
        int i6 = (i4 & 2) != 0 ? 0 : i2;
        if ((i4 & 4) != 0) {
            Object objRememberedValue = zl2Var.rememberedValue();
            if (objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = py8.LazyGridPrefetchStrategy$default(0, 1, null);
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            oy8Var2 = (oy8) objRememberedValue;
        } else {
            oy8Var2 = oy8Var;
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-20335728, i3, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:98)");
        }
        Object[] objArr = {oy8Var2};
        dme<az8, ?> dmeVarSaver$foundation_release = az8.f12241v.saver$foundation_release(oy8Var2);
        boolean z = ((((i3 & 14) ^ 6) > 4 && zl2Var.changed(i5)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && zl2Var.changed(i6)) || (i3 & 48) == 32) | ((((i3 & C1340j.f10444b) ^ 384) > 256 && zl2Var.changedInstance(oy8Var2)) || (i3 & 384) == 256);
        Object objRememberedValue2 = zl2Var.rememberedValue();
        if (z || objRememberedValue2 == zl2.f105372a.getEmpty()) {
            objRememberedValue2 = new C2111d(i5, i6, oy8Var2);
            zl2Var.updateRememberedValue(objRememberedValue2);
        }
        az8 az8Var = (az8) gyd.rememberSaveable(objArr, (dme) dmeVarSaver$foundation_release, (String) null, (ny6) objRememberedValue2, zl2Var, 0, 4);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return az8Var;
    }
}

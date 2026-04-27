package p000;

import androidx.mediarouter.media.C1340j;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,673:1\n1223#2,6:674\n1223#2,6:680\n1223#2,6:686\n148#3:692\n*S KotlinDebug\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListStateKt\n*L\n82#1:674,6\n107#1:680,6\n109#1:686,6\n642#1:692\n*E\n"})
public final class n19 {

    /* JADX INFO: renamed from: a */
    public static final float f62956a = kn4.m30705constructorimpl(1);

    /* JADX INFO: renamed from: b */
    @yfb
    public static final a19 f62957b = new a19(null, 0, false, 0.0f, new C9644a(), 0.0f, false, y13.CoroutineScope(a05.f2a), e64.Density$default(1.0f, 0.0f, 2, null), nu2.Constraints$default(0, 0, 0, 0, 15, null), l82.emptyList(), 0, 0, 0, false, t7c.Vertical, 0, 0, null);

    /* JADX INFO: renamed from: c */
    public static final int f62958c = 100;

    /* JADX INFO: renamed from: n19$a */
    public static final class C9644a implements vba {

        /* JADX INFO: renamed from: a */
        public final int f62959a;

        /* JADX INFO: renamed from: b */
        public final int f62960b;

        /* JADX INFO: renamed from: c */
        @yfb
        public final Map<AbstractC9938nm, Integer> f62961c = xt9.emptyMap();

        public static /* synthetic */ void getAlignmentLines$annotations() {
        }

        @Override // p000.vba
        @yfb
        public Map<AbstractC9938nm, Integer> getAlignmentLines() {
            return this.f62961c;
        }

        @Override // p000.vba
        public int getHeight() {
            return this.f62960b;
        }

        @Override // p000.vba
        public int getWidth() {
            return this.f62959a;
        }

        @Override // p000.vba
        public void placeChildren() {
        }
    }

    /* JADX INFO: renamed from: n19$b */
    public static final class C9645b extends tt8 implements ny6<m19> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f62962a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f62963b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9645b(int i, int i2) {
            super(0);
            this.f62962a = i;
            this.f62963b = i2;
        }

        @Override // p000.ny6
        @yfb
        public final m19 invoke() {
            return new m19(this.f62962a, this.f62963b);
        }
    }

    /* JADX INFO: renamed from: n19$c */
    public static final class C9646c extends tt8 implements ny6<m19> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f62964a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f62965b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ f19 f62966c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9646c(int i, int i2, f19 f19Var) {
            super(0);
            this.f62964a = i;
            this.f62965b = i2;
            this.f62966c = f19Var;
        }

        @Override // p000.ny6
        @yfb
        public final m19 invoke() {
            return new m19(this.f62964a, this.f62965b, this.f62966c);
        }
    }

    @yfb
    @hk2
    public static final m19 rememberLazyListState(int i, int i2, @gib zl2 zl2Var, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1470655220, i3, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:80)");
        }
        Object[] objArr = new Object[0];
        dme<m19, ?> saver = m19.f59574y.getSaver();
        boolean z = ((((i3 & 14) ^ 6) > 4 && zl2Var.changed(i)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && zl2Var.changed(i2)) || (i3 & 48) == 32);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (z || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new C9645b(i, i2);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        m19 m19Var = (m19) gyd.rememberSaveable(objArr, (dme) saver, (String) null, (ny6) objRememberedValue, zl2Var, 0, 4);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return m19Var;
    }

    @ah5
    @yfb
    @hk2
    public static final m19 rememberLazyListState(int i, int i2, @gib f19 f19Var, @gib zl2 zl2Var, int i3, int i4) {
        f19 f19Var2;
        int i5 = (i4 & 1) != 0 ? 0 : i;
        int i6 = (i4 & 2) != 0 ? 0 : i2;
        if ((i4 & 4) != 0) {
            Object objRememberedValue = zl2Var.rememberedValue();
            if (objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = g19.LazyListPrefetchStrategy$default(0, 1, null);
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            f19Var2 = (f19) objRememberedValue;
        } else {
            f19Var2 = f19Var;
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1287535208, i3, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:107)");
        }
        Object[] objArr = {f19Var2};
        dme<m19, ?> dmeVarSaver$foundation_release = m19.f59574y.saver$foundation_release(f19Var2);
        boolean z = ((((i3 & 14) ^ 6) > 4 && zl2Var.changed(i5)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && zl2Var.changed(i6)) || (i3 & 48) == 32) | ((((i3 & C1340j.f10444b) ^ 384) > 256 && zl2Var.changedInstance(f19Var2)) || (i3 & 384) == 256);
        Object objRememberedValue2 = zl2Var.rememberedValue();
        if (z || objRememberedValue2 == zl2.f105372a.getEmpty()) {
            objRememberedValue2 = new C9646c(i5, i6, f19Var2);
            zl2Var.updateRememberedValue(objRememberedValue2);
        }
        m19 m19Var = (m19) gyd.rememberSaveable(objArr, (dme) dmeVarSaver$foundation_release, (String) null, (ny6) objRememberedValue2, zl2Var, 0, 4);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return m19Var;
    }
}

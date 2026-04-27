package p000;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.p002ui.platform.AbstractComposeView;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,478:1\n81#2:479\n107#2,2:480\n26#3:482\n26#3:483\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout\n*L\n228#1:479\n228#1:480,2\n271#1:482\n277#1:483\n*E\n"})
public final class bb4 extends AbstractComposeView implements nc4 {

    /* JADX INFO: renamed from: H */
    @yfb
    public final Window f13223H;

    /* JADX INFO: renamed from: L */
    @yfb
    public final z6b f13224L;

    /* JADX INFO: renamed from: M */
    public boolean f13225M;

    /* JADX INFO: renamed from: N */
    public boolean f13226N;

    /* JADX INFO: renamed from: bb4$a */
    public static final class C1820a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f13228b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1820a(int i) {
            super(2);
            this.f13228b = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            bb4.this.Content(zl2Var, tsd.updateChangedFlags(this.f13228b | 1));
        }
    }

    public bb4(@yfb Context context, @yfb Window window) {
        super(context, null, 0, 6, null);
        this.f13223H = window;
        this.f13224L = xtf.mutableStateOf$default(tk2.f85095a.m32412getLambda1$ui_release(), null, 2, null);
    }

    private final gz6<zl2, Integer, bth> getContent() {
        return (gz6) this.f13224L.getValue();
    }

    private final int getDisplayHeight() {
        return Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final void setContent(gz6<? super zl2, ? super Integer, bth> gz6Var) {
        this.f13224L.setValue(gz6Var);
    }

    @Override // androidx.compose.p002ui.platform.AbstractComposeView
    @hk2
    public void Content(@gib zl2 zl2Var, int i) {
        int i2;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(1735448596);
        if ((i & 6) == 0) {
            i2 = (zl2VarStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(1735448596, i2, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:280)");
            }
            getContent().invoke(zl2VarStartRestartGroup, 0);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C1820a(i));
        }
    }

    @Override // androidx.compose.p002ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f13226N;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.f13225M;
    }

    @Override // p000.nc4
    @yfb
    public Window getWindow() {
        return this.f13223H;
    }

    @Override // androidx.compose.p002ui.platform.AbstractComposeView
    public void internalOnLayout$ui_release(boolean z, int i, int i2, int i3, int i4) {
        View childAt;
        super.internalOnLayout$ui_release(z, i, i2, i3, i4);
        if (this.f13225M || (childAt = getChildAt(0)) == null) {
            return;
        }
        getWindow().setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // androidx.compose.p002ui.platform.AbstractComposeView
    public void internalOnMeasure$ui_release(int i, int i2) {
        if (this.f13225M) {
            super.internalOnMeasure$ui_release(i, i2);
        } else {
            super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    public final void setUsePlatformDefaultWidth(boolean z) {
        this.f13225M = z;
    }

    public final void setContent(@yfb dn2 dn2Var, @yfb gz6<? super zl2, ? super Integer, bth> gz6Var) {
        setParentCompositionContext(dn2Var);
        setContent(gz6Var);
        this.f13226N = true;
        createComposition();
    }
}

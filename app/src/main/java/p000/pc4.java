package p000;

import android.R;
import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.compose.p002ui.C0693R;
import androidx.compose.p002ui.platform.AbstractComposeView;
import androidx.savedstate.C1414a;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogWrapper\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,478:1\n148#2:479\n1#3:480\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogWrapper\n*L\n314#1:479\n*E\n"})
public final class pc4 extends qj2 implements kbi {

    /* JADX INFO: renamed from: C */
    public final float f70302C;

    /* JADX INFO: renamed from: F */
    public final int f70303F;

    /* JADX INFO: renamed from: d */
    @yfb
    public ny6<bth> f70304d;

    /* JADX INFO: renamed from: e */
    @yfb
    public rb4 f70305e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final View f70306f;

    /* JADX INFO: renamed from: m */
    @yfb
    public final bb4 f70307m;

    /* JADX INFO: renamed from: pc4$a */
    public static final class C10896a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(@yfb View view, @yfb Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: pc4$b */
    public static final class C10897b extends tt8 implements qy6<v1c, bth> {
        public C10897b() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(v1c v1cVar) {
            invoke2(v1cVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb v1c v1cVar) {
            if (pc4.this.f70305e.getDismissOnBackPress()) {
                pc4.this.f70304d.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: pc4$c */
    public /* synthetic */ class C10898c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f70309a;

        static {
            int[] iArr = new int[ov8.values().length];
            try {
                iArr[ov8.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ov8.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f70309a = iArr;
        }
    }

    public pc4(@yfb ny6<bth> ny6Var, @yfb rb4 rb4Var, @yfb View view, @yfb ov8 ov8Var, @yfb c64 c64Var, @yfb UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), (Build.VERSION.SDK_INT >= 31 || rb4Var.getDecorFitsSystemWindows()) ? C0693R.style.DialogWindowTheme : C0693R.style.FloatingDialogWindowTheme), 0, 2, null);
        this.f70304d = ny6Var;
        this.f70305e = rb4Var;
        this.f70306f = view;
        float fM30705constructorimpl = kn4.m30705constructorimpl(8);
        this.f70302C = fM30705constructorimpl;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        this.f70303F = window.getAttributes().softInputMode & 240;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        oli.setDecorFitsSystemWindows(window, this.f70305e.getDecorFitsSystemWindows());
        bb4 bb4Var = new bb4(getContext(), window);
        bb4Var.setTag(C0693R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        bb4Var.setClipChildren(false);
        bb4Var.setElevation(c64Var.mo27173toPx0680j_4(fM30705constructorimpl));
        bb4Var.setOutlineProvider(new C10896a());
        this.f70307m = bb4Var;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            _init_$disableClipping(viewGroup);
        }
        setContentView(bb4Var);
        zbi.set(bb4Var, zbi.get(view));
        bci.set(bb4Var, bci.get(view));
        C1414a.set(bb4Var, C1414a.get(view));
        updateParameters(this.f70304d, this.f70305e, ov8Var);
        y1c.addCallback$default(getOnBackPressedDispatcher(), this, false, new C10897b(), 2, null);
    }

    private static final void _init_$disableClipping(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof bb4) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                _init_$disableClipping(viewGroup2);
            }
        }
    }

    private final void setLayoutDirection(ov8 ov8Var) {
        bb4 bb4Var = this.f70307m;
        int i = C10898c.f70309a[ov8Var.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new ceb();
        }
        bb4Var.setLayoutDirection(i2);
    }

    private final void setSecurePolicy(yte yteVar) {
        boolean zShouldApplySecureFlag = zte.shouldApplySecureFlag(yteVar, C11123pu.isFlagSecureEnabled(this.f70306f));
        Window window = getWindow();
        md8.checkNotNull(window);
        window.setFlags(zShouldApplySecureFlag ? 8192 : -8193, 8192);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    public final void disposeComposition() {
        this.f70307m.disposeComposition();
    }

    @Override // p000.kbi
    @yfb
    public AbstractComposeView getSubCompositionView() {
        return this.f70307m;
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(@yfb MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent && this.f70305e.getDismissOnClickOutside()) {
            this.f70304d.invoke();
        }
        return zOnTouchEvent;
    }

    public final void setContent(@yfb dn2 dn2Var, @yfb gz6<? super zl2, ? super Integer, bth> gz6Var) {
        this.f70307m.setContent(dn2Var, gz6Var);
    }

    public final void updateParameters(@yfb ny6<bth> ny6Var, @yfb rb4 rb4Var, @yfb ov8 ov8Var) {
        Window window;
        this.f70304d = ny6Var;
        this.f70305e = rb4Var;
        setSecurePolicy(rb4Var.getSecurePolicy());
        setLayoutDirection(ov8Var);
        if (rb4Var.getUsePlatformDefaultWidth() && !this.f70307m.getUsePlatformDefaultWidth() && (window = getWindow()) != null) {
            window.setLayout(-2, -2);
        }
        this.f70307m.setUsePlatformDefaultWidth(rb4Var.getUsePlatformDefaultWidth());
        if (Build.VERSION.SDK_INT < 31) {
            if (rb4Var.getDecorFitsSystemWindows()) {
                Window window2 = getWindow();
                if (window2 != null) {
                    window2.setSoftInputMode(this.f70303F);
                    return;
                }
                return;
            }
            Window window3 = getWindow();
            if (window3 != null) {
                window3.setSoftInputMode(16);
            }
        }
    }
}

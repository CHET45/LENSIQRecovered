package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.C3146R;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes5.dex */
public class bcf extends paf<acf> {

    /* JADX INFO: renamed from: X */
    public static final int f13361X = C3146R.attr.sideSheetDialogTheme;

    /* JADX INFO: renamed from: Y */
    public static final int f13362Y = C3146R.style.Theme_Material3_Light_SideSheetDialog;

    /* JADX INFO: renamed from: bcf$a */
    public class C1833a extends acf {
        public C1833a() {
        }

        @Override // p000.acf, p000.maf
        public void onSlide(@efb View view, float f) {
        }

        @Override // p000.acf, p000.maf
        public void onStateChanged(@efb View view, int i) {
            if (i == 5) {
                bcf.this.cancel();
            }
        }
    }

    public bcf(@efb Context context) {
        this(context, 0);
    }

    @Override // p000.paf, android.app.Dialog, android.content.DialogInterface
    public /* bridge */ /* synthetic */ void cancel() {
        super.cancel();
    }

    @Override // p000.paf
    /* JADX INFO: renamed from: d */
    public void mo3038d(laf<acf> lafVar) {
        lafVar.addCallback(new C1833a());
    }

    @Override // p000.paf
    @efb
    /* JADX INFO: renamed from: e */
    public laf<acf> mo3039e(@efb FrameLayout frameLayout) {
        return SideSheetBehavior.from(frameLayout);
    }

    @Override // p000.paf
    @kr7
    /* JADX INFO: renamed from: f */
    public int mo3040f() {
        return C3146R.id.m3_side_sheet;
    }

    @Override // p000.paf
    @uw8
    /* JADX INFO: renamed from: g */
    public int mo3041g() {
        return C3146R.layout.m3_side_sheet_dialog;
    }

    @Override // p000.paf
    /* JADX INFO: renamed from: h */
    public int mo3042h() {
        return 3;
    }

    @Override // p000.paf
    public /* bridge */ /* synthetic */ boolean isDismissWithSheetAnimationEnabled() {
        return super.isDismissWithSheetAnimationEnabled();
    }

    @Override // p000.paf, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCancelable(boolean z) {
        super.setCancelable(z);
    }

    @Override // p000.paf, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
    }

    @Override // p000.paf, p000.l20, p000.qj2, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@uw8 int i) {
        super.setContentView(i);
    }

    @Override // p000.paf
    public /* bridge */ /* synthetic */ void setDismissWithSheetAnimationEnabled(boolean z) {
        super.setDismissWithSheetAnimationEnabled(z);
    }

    public bcf(@efb Context context, @dbg int i) {
        super(context, i, f13361X, f13362Y);
    }

    @Override // p000.paf
    @efb
    public SideSheetBehavior<? extends View> getBehavior() {
        laf behavior = super.getBehavior();
        if (behavior instanceof SideSheetBehavior) {
            return (SideSheetBehavior) behavior;
        }
        throw new IllegalStateException("The view is not associated with SideSheetBehavior");
    }

    @Override // p000.paf, p000.l20, p000.qj2, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@hib View view) {
        super.setContentView(view);
    }

    @Override // p000.paf, p000.l20, p000.qj2, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@hib View view, @hib ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
    }
}

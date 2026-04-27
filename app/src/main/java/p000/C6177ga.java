package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eyevue.common.widget.toolbar.ToolBar;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: ga */
/* JADX INFO: loaded from: classes4.dex */
public final class C6177ga implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ToolBar f39073C;

    /* JADX INFO: renamed from: F */
    @efb
    public final TextView f39074F;

    /* JADX INFO: renamed from: H */
    @efb
    public final TextView f39075H;

    /* JADX INFO: renamed from: L */
    @efb
    public final TextView f39076L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f39077M;

    /* JADX INFO: renamed from: N */
    @efb
    public final TextView f39078N;

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f39079a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f39080b;

    /* JADX INFO: renamed from: c */
    @efb
    public final RelativeLayout f39081c;

    /* JADX INFO: renamed from: d */
    @efb
    public final RelativeLayout f39082d;

    /* JADX INFO: renamed from: e */
    @efb
    public final RelativeLayout f39083e;

    /* JADX INFO: renamed from: f */
    @efb
    public final RelativeLayout f39084f;

    /* JADX INFO: renamed from: m */
    @efb
    public final RelativeLayout f39085m;

    private C6177ga(@efb ConstraintLayout rootView, @efb TextView btnRecover, @efb RelativeLayout rlDoubleClick, @efb RelativeLayout rlSingleClick, @efb RelativeLayout rlSwpieBack, @efb RelativeLayout rlSwpieFront, @efb RelativeLayout rlThreeClick, @efb ToolBar toolbar, @efb TextView tvDoubleClickDesc, @efb TextView tvSingleClickDesc, @efb TextView tvSwpieBackDesc, @efb TextView tvSwpieFrontDesc, @efb TextView tvThreeClickDesc) {
        this.f39079a = rootView;
        this.f39080b = btnRecover;
        this.f39081c = rlDoubleClick;
        this.f39082d = rlSingleClick;
        this.f39083e = rlSwpieBack;
        this.f39084f = rlSwpieFront;
        this.f39085m = rlThreeClick;
        this.f39073C = toolbar;
        this.f39074F = tvDoubleClickDesc;
        this.f39075H = tvSingleClickDesc;
        this.f39076L = tvSwpieBackDesc;
        this.f39077M = tvSwpieFrontDesc;
        this.f39078N = tvThreeClickDesc;
    }

    @efb
    public static C6177ga bind(@efb View rootView) {
        int i = C2558R.id.btn_recover;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2558R.id.rl_double_click;
            RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
            if (relativeLayout != null) {
                i = C2558R.id.rl_single_click;
                RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                if (relativeLayout2 != null) {
                    i = C2558R.id.rl_swpie_back;
                    RelativeLayout relativeLayout3 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                    if (relativeLayout3 != null) {
                        i = C2558R.id.rl_swpie_front;
                        RelativeLayout relativeLayout4 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                        if (relativeLayout4 != null) {
                            i = C2558R.id.rl_three_click;
                            RelativeLayout relativeLayout5 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                            if (relativeLayout5 != null) {
                                i = C2558R.id.toolbar;
                                ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
                                if (toolBar != null) {
                                    i = C2558R.id.tv_double_click_desc;
                                    TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                                    if (textView2 != null) {
                                        i = C2558R.id.tv_single_click_desc;
                                        TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                        if (textView3 != null) {
                                            i = C2558R.id.tv_swpie_back_desc;
                                            TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                            if (textView4 != null) {
                                                i = C2558R.id.tv_swpie_front_desc;
                                                TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                                if (textView5 != null) {
                                                    i = C2558R.id.tv_three_click_desc;
                                                    TextView textView6 = (TextView) l8i.findChildViewById(rootView, i);
                                                    if (textView6 != null) {
                                                        return new C6177ga((ConstraintLayout) rootView, textView, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, toolBar, textView2, textView3, textView4, textView5, textView6);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C6177ga inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C6177ga inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_eyevue_gesture, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f39079a;
    }
}

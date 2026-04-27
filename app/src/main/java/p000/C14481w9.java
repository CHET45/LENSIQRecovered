package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.common.C2531R;
import com.eyevue.common.widget.toolbar.ToolBar;

/* JADX INFO: renamed from: w9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14481w9 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final TextView f93623C;

    /* JADX INFO: renamed from: F */
    @efb
    public final TextView f93624F;

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f93625a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f93626b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f93627c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f93628d;

    /* JADX INFO: renamed from: e */
    @efb
    public final RecyclerView f93629e;

    /* JADX INFO: renamed from: f */
    @efb
    public final ToolBar f93630f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f93631m;

    private C14481w9(@efb ConstraintLayout rootView, @efb ImageView btnAddAlarm, @efb LinearLayout emptyView, @efb LinearLayout llStateBar, @efb RecyclerView rvAlarmList, @efb ToolBar toolbar, @efb TextView tvEmptyAlarmTip, @efb TextView tvStateInprogress, @efb TextView tvStateOutofdate) {
        this.f93625a = rootView;
        this.f93626b = btnAddAlarm;
        this.f93627c = emptyView;
        this.f93628d = llStateBar;
        this.f93629e = rvAlarmList;
        this.f93630f = toolbar;
        this.f93631m = tvEmptyAlarmTip;
        this.f93623C = tvStateInprogress;
        this.f93624F = tvStateOutofdate;
    }

    @efb
    public static C14481w9 bind(@efb View rootView) {
        int i = C2531R.id.btn_add_alarm;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2531R.id.empty_view;
            LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
            if (linearLayout != null) {
                i = C2531R.id.ll_state_bar;
                LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                if (linearLayout2 != null) {
                    i = C2531R.id.rv_alarm_list;
                    RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
                    if (recyclerView != null) {
                        i = C2531R.id.toolbar;
                        ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
                        if (toolBar != null) {
                            i = C2531R.id.tv_empty_alarm_tip;
                            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView != null) {
                                i = C2531R.id.tv_state_inprogress;
                                TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                                if (textView2 != null) {
                                    i = C2531R.id.tv_state_outofdate;
                                    TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                    if (textView3 != null) {
                                        return new C14481w9((ConstraintLayout) rootView, imageView, linearLayout, linearLayout2, recyclerView, toolBar, textView, textView2, textView3);
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
    public static C14481w9 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C14481w9 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.activity_eyevue_alarm, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f93625a;
    }
}

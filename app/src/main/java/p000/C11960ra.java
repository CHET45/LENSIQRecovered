package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.common.widget.toolbar.ToolBar;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: ra */
/* JADX INFO: loaded from: classes4.dex */
public final class C11960ra implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f77498a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f77499b;

    /* JADX INFO: renamed from: c */
    @efb
    public final RecyclerView f77500c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ToolBar f77501d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f77502e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f77503f;

    private C11960ra(@efb LinearLayout rootView, @efb LinearLayout noNetLayout, @efb RecyclerView rvProblemType, @efb ToolBar titleBar, @efb TextView tvAgain, @efb TextView tvNoNetHint) {
        this.f77498a = rootView;
        this.f77499b = noNetLayout;
        this.f77500c = rvProblemType;
        this.f77501d = titleBar;
        this.f77502e = tvAgain;
        this.f77503f = tvNoNetHint;
    }

    @efb
    public static C11960ra bind(@efb View rootView) {
        int i = C2558R.id.no_net_layout;
        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = C2558R.id.rv_problem_type;
            RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
            if (recyclerView != null) {
                i = C2558R.id.title_bar;
                ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
                if (toolBar != null) {
                    i = C2558R.id.tv_again;
                    TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView != null) {
                        i = C2558R.id.tv_no_net_hint;
                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            return new C11960ra((LinearLayout) rootView, linearLayout, recyclerView, toolBar, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C11960ra inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C11960ra inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_eyevue_select_feedback_type, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f77498a;
    }
}

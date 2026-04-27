package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.common.C2531R;
import com.eyevue.common.widget.toolbar.ToolBar;

/* JADX INFO: renamed from: ad */
/* JADX INFO: loaded from: classes4.dex */
public final class C0176ad implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f1109a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f1110b;

    /* JADX INFO: renamed from: c */
    @efb
    public final RecyclerView f1111c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ToolBar f1112d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f1113e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f1114f;

    private C0176ad(@efb LinearLayout rootView, @efb LinearLayout noNetLayout, @efb RecyclerView rvProblemType, @efb ToolBar titleBar, @efb TextView tvAgain, @efb TextView tvNoNetHint) {
        this.f1109a = rootView;
        this.f1110b = noNetLayout;
        this.f1111c = rvProblemType;
        this.f1112d = titleBar;
        this.f1113e = tvAgain;
        this.f1114f = tvNoNetHint;
    }

    @efb
    public static C0176ad bind(@efb View rootView) {
        int i = C2531R.id.no_net_layout;
        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = C2531R.id.rv_problem_type;
            RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
            if (recyclerView != null) {
                i = C2531R.id.title_bar;
                ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
                if (toolBar != null) {
                    i = C2531R.id.tv_again;
                    TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView != null) {
                        i = C2531R.id.tv_no_net_hint;
                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            return new C0176ad((LinearLayout) rootView, linearLayout, recyclerView, toolBar, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C0176ad inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C0176ad inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.activity_select_feedback_type, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f1109a;
    }
}

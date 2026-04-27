package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.common.C2531R;
import com.eyevue.common.widget.toolbar.ToolBar;

/* JADX INFO: renamed from: bd */
/* JADX INFO: loaded from: classes4.dex */
public final class C1837bd implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f13372a;

    /* JADX INFO: renamed from: b */
    @efb
    public final EditText f13373b;

    /* JADX INFO: renamed from: c */
    @efb
    public final RecyclerView f13374c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ToolBar f13375d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f13376e;

    private C1837bd(@efb LinearLayout rootView, @efb EditText searchEdit, @efb RecyclerView selectTransRc, @efb ToolBar titleBar, @efb TextView tvNum) {
        this.f13372a = rootView;
        this.f13373b = searchEdit;
        this.f13374c = selectTransRc;
        this.f13375d = titleBar;
        this.f13376e = tvNum;
    }

    @efb
    public static C1837bd bind(@efb View rootView) {
        int i = C2531R.id.search_edit;
        EditText editText = (EditText) l8i.findChildViewById(rootView, i);
        if (editText != null) {
            i = C2531R.id.select_trans_rc;
            RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
            if (recyclerView != null) {
                i = C2531R.id.title_bar;
                ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
                if (toolBar != null) {
                    i = C2531R.id.tv_num;
                    TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView != null) {
                        return new C1837bd((LinearLayout) rootView, editText, recyclerView, toolBar, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C1837bd inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C1837bd inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.activity_select_tarns_language, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f13372a;
    }
}

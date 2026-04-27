package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.common.widget.toolbar.ToolBar;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: sa */
/* JADX INFO: loaded from: classes4.dex */
public final class C12496sa implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f81020a;

    /* JADX INFO: renamed from: b */
    @efb
    public final EditText f81021b;

    /* JADX INFO: renamed from: c */
    @efb
    public final RecyclerView f81022c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ToolBar f81023d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f81024e;

    private C12496sa(@efb LinearLayout rootView, @efb EditText searchEdit, @efb RecyclerView selectTransRc, @efb ToolBar titleBar, @efb TextView tvNum) {
        this.f81020a = rootView;
        this.f81021b = searchEdit;
        this.f81022c = selectTransRc;
        this.f81023d = titleBar;
        this.f81024e = tvNum;
    }

    @efb
    public static C12496sa bind(@efb View rootView) {
        int i = C2558R.id.search_edit;
        EditText editText = (EditText) l8i.findChildViewById(rootView, i);
        if (editText != null) {
            i = C2558R.id.select_trans_rc;
            RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
            if (recyclerView != null) {
                i = C2558R.id.title_bar;
                ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
                if (toolBar != null) {
                    i = C2558R.id.tv_num;
                    TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView != null) {
                        return new C12496sa((LinearLayout) rootView, editText, recyclerView, toolBar, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C12496sa inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C12496sa inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_eyevue_select_tarns_language, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f81020a;
    }
}

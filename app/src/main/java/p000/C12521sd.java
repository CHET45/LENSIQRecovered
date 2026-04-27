package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.common.widget.toolbar.ToolBar;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: sd */
/* JADX INFO: loaded from: classes4.dex */
public final class C12521sd implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f81243a;

    /* JADX INFO: renamed from: b */
    @efb
    public final RecyclerView f81244b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ToolBar f81245c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f81246d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f81247e;

    private C12521sd(@efb LinearLayout rootView, @efb RecyclerView recyclerView, @efb ToolBar toolbar, @efb TextView tvDescription, @efb TextView tvTitle) {
        this.f81243a = rootView;
        this.f81244b = recyclerView;
        this.f81245c = toolbar;
        this.f81246d = tvDescription;
        this.f81247e = tvTitle;
    }

    @efb
    public static C12521sd bind(@efb View rootView) {
        int i = C2558R.id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
        if (recyclerView != null) {
            i = C2558R.id.toolbar;
            ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
            if (toolBar != null) {
                i = C2558R.id.tv_description;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    i = C2558R.id.tv_title;
                    TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        return new C12521sd((LinearLayout) rootView, recyclerView, toolBar, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C12521sd inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C12521sd inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_voice_assistant, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f81243a;
    }
}

package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class eg8 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f32934a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f32935b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f32936c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f32937d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f32938e;

    private eg8(@efb RelativeLayout rootView, @efb TextView tvContent, @efb TextView tvDate, @efb TextView tvDuration, @efb TextView tvTitle) {
        this.f32934a = rootView;
        this.f32935b = tvContent;
        this.f32936c = tvDate;
        this.f32937d = tvDuration;
        this.f32938e = tvTitle;
    }

    @efb
    public static eg8 bind(@efb View rootView) {
        int i = C2531R.id.tv_content;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2531R.id.tv_date;
            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = C2531R.id.tv_duration;
                TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                if (textView3 != null) {
                    i = C2531R.id.tv_title;
                    TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView4 != null) {
                        return new eg8((RelativeLayout) rootView, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static eg8 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static eg8 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.item_meeting_info_layout_v1, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f32934a;
    }
}

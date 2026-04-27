package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class gg8 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f39766a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f39767b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f39768c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f39769d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f39770e;

    private gg8(@efb RelativeLayout rootView, @efb TextView tvContent, @efb TextView tvDate, @efb TextView tvDuration, @efb TextView tvTitle) {
        this.f39766a = rootView;
        this.f39767b = tvContent;
        this.f39768c = tvDate;
        this.f39769d = tvDuration;
        this.f39770e = tvTitle;
    }

    @efb
    public static gg8 bind(@efb View rootView) {
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
                        return new gg8((RelativeLayout) rootView, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static gg8 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static gg8 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.item_meeting_info_layout_v2, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f39766a;
    }
}

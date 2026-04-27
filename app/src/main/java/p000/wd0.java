package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class wd0 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f93963a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f93964b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f93965c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f93966d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f93967e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f93968f;

    private wd0(@efb LinearLayout rootView, @efb LinearLayout imgRecoder, @efb ImageView ivVoice, @efb LinearLayout layoutTest, @efb TextView tvDialogTip, @efb TextView tvDialogTxt) {
        this.f93963a = rootView;
        this.f93964b = imgRecoder;
        this.f93965c = ivVoice;
        this.f93966d = layoutTest;
        this.f93967e = tvDialogTip;
        this.f93968f = tvDialogTxt;
    }

    @efb
    public static wd0 bind(@efb View rootView) {
        int i = C2558R.id.img_recoder;
        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = C2558R.id.iv_voice;
            ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView != null) {
                i = C2558R.id.layout_test;
                LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                if (linearLayout2 != null) {
                    i = C2558R.id.tv_dialog_tip;
                    TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView != null) {
                        i = C2558R.id.tv_dialog_txt;
                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            return new wd0((LinearLayout) rootView, linearLayout, imageView, linearLayout2, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static wd0 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static wd0 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.audio_dialog, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f93963a;
    }
}

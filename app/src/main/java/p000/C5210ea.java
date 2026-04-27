package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.common.widget.MyEditText;
import com.eyevue.common.widget.toolbar.ToolBar;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: ea */
/* JADX INFO: loaded from: classes4.dex */
public final class C5210ea implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final TextView f32291C;

    /* JADX INFO: renamed from: F */
    @efb
    public final TextView f32292F;

    /* JADX INFO: renamed from: H */
    @efb
    public final TextView f32293H;

    /* JADX INFO: renamed from: L */
    @efb
    public final RelativeLayout f32294L;

    /* JADX INFO: renamed from: M */
    @efb
    public final View f32295M;

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f32296a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f32297b;

    /* JADX INFO: renamed from: c */
    @efb
    public final MyEditText f32298c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f32299d;

    /* JADX INFO: renamed from: e */
    @efb
    public final MyEditText f32300e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f32301f;

    /* JADX INFO: renamed from: m */
    @efb
    public final ToolBar f32302m;

    private C5210ea(@efb LinearLayout rootView, @efb TextView btnSubmit, @efb MyEditText contactTitle, @efb LinearLayout contentLayout, @efb MyEditText etComment, @efb TextView feedbackType, @efb ToolBar titleBar, @efb TextView tvAsterisk, @efb TextView tvMustBeTransmitted, @efb TextView tvTypeTip, @efb RelativeLayout typeLayout, @efb View viewLine) {
        this.f32296a = rootView;
        this.f32297b = btnSubmit;
        this.f32298c = contactTitle;
        this.f32299d = contentLayout;
        this.f32300e = etComment;
        this.f32301f = feedbackType;
        this.f32302m = titleBar;
        this.f32291C = tvAsterisk;
        this.f32292F = tvMustBeTransmitted;
        this.f32293H = tvTypeTip;
        this.f32294L = typeLayout;
        this.f32295M = viewLine;
    }

    @efb
    public static C5210ea bind(@efb View rootView) {
        View viewFindChildViewById;
        int i = C2558R.id.btn_submit;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2558R.id.contact_title;
            MyEditText myEditText = (MyEditText) l8i.findChildViewById(rootView, i);
            if (myEditText != null) {
                i = C2558R.id.content_layout;
                LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                if (linearLayout != null) {
                    i = C2558R.id.et_comment;
                    MyEditText myEditText2 = (MyEditText) l8i.findChildViewById(rootView, i);
                    if (myEditText2 != null) {
                        i = C2558R.id.feedback_type;
                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            i = C2558R.id.title_bar;
                            ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
                            if (toolBar != null) {
                                i = C2558R.id.tv_asterisk;
                                TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                if (textView3 != null) {
                                    i = C2558R.id.tv_must_be_transmitted;
                                    TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                    if (textView4 != null) {
                                        i = C2558R.id.tv_type_tip;
                                        TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                        if (textView5 != null) {
                                            i = C2558R.id.type_layout;
                                            RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                            if (relativeLayout != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C2558R.id.view_line))) != null) {
                                                return new C5210ea((LinearLayout) rootView, textView, myEditText, linearLayout, myEditText2, textView2, toolBar, textView3, textView4, textView5, relativeLayout, viewFindChildViewById);
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
    public static C5210ea inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C5210ea inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_eyevue_feedback, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f32296a;
    }
}

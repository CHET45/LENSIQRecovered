package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.eyevue.common.C2531R;
import com.eyevue.common.widget.MyEditText;
import com.eyevue.common.widget.toolbar.ToolBar;

/* JADX INFO: renamed from: ya */
/* JADX INFO: loaded from: classes4.dex */
public final class C15580ya implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ToolBar f100899C;

    /* JADX INFO: renamed from: F */
    @efb
    public final LinearLayout f100900F;

    /* JADX INFO: renamed from: H */
    @efb
    public final View f100901H;

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f100902a;

    /* JADX INFO: renamed from: b */
    @efb
    public final AppCompatButton f100903b;

    /* JADX INFO: renamed from: c */
    @efb
    public final MyEditText f100904c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f100905d;

    /* JADX INFO: renamed from: e */
    @efb
    public final MyEditText f100906e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f100907f;

    /* JADX INFO: renamed from: m */
    @efb
    public final RelativeLayout f100908m;

    private C15580ya(@efb LinearLayout rootView, @efb AppCompatButton btnSubmit, @efb MyEditText contactTitle, @efb LinearLayout contentLayout, @efb MyEditText etComment, @efb TextView feedbackType, @efb RelativeLayout otherSettingLayout, @efb ToolBar titleBar, @efb LinearLayout typeLayout, @efb View viewLine) {
        this.f100902a = rootView;
        this.f100903b = btnSubmit;
        this.f100904c = contactTitle;
        this.f100905d = contentLayout;
        this.f100906e = etComment;
        this.f100907f = feedbackType;
        this.f100908m = otherSettingLayout;
        this.f100899C = titleBar;
        this.f100900F = typeLayout;
        this.f100901H = viewLine;
    }

    @efb
    public static C15580ya bind(@efb View rootView) {
        View viewFindChildViewById;
        int i = C2531R.id.btn_submit;
        AppCompatButton appCompatButton = (AppCompatButton) l8i.findChildViewById(rootView, i);
        if (appCompatButton != null) {
            i = C2531R.id.contact_title;
            MyEditText myEditText = (MyEditText) l8i.findChildViewById(rootView, i);
            if (myEditText != null) {
                i = C2531R.id.content_layout;
                LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                if (linearLayout != null) {
                    i = C2531R.id.et_comment;
                    MyEditText myEditText2 = (MyEditText) l8i.findChildViewById(rootView, i);
                    if (myEditText2 != null) {
                        i = C2531R.id.feedback_type;
                        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView != null) {
                            i = C2531R.id.other_setting_layout;
                            RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                            if (relativeLayout != null) {
                                i = C2531R.id.title_bar;
                                ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
                                if (toolBar != null) {
                                    i = C2531R.id.type_layout;
                                    LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                    if (linearLayout2 != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C2531R.id.view_line))) != null) {
                                        return new C15580ya((LinearLayout) rootView, appCompatButton, myEditText, linearLayout, myEditText2, textView, relativeLayout, toolBar, linearLayout2, viewFindChildViewById);
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
    public static C15580ya inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C15580ya inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.activity_feedback, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f100902a;
    }
}

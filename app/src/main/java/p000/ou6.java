package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class ou6 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final TextView f68770C;

    /* JADX INFO: renamed from: F */
    @efb
    public final TextView f68771F;

    /* JADX INFO: renamed from: H */
    @efb
    public final TextView f68772H;

    /* JADX INFO: renamed from: L */
    @efb
    public final TextView f68773L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f68774M;

    /* JADX INFO: renamed from: M1 */
    @efb
    public final RelativeLayout f68775M1;

    /* JADX INFO: renamed from: N */
    @efb
    public final RelativeLayout f68776N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final TextView f68777Q;

    /* JADX INFO: renamed from: V1 */
    @efb
    public final TextView f68778V1;

    /* JADX INFO: renamed from: X */
    @efb
    public final TextView f68779X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final TextView f68780Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final TextView f68781Z;

    /* JADX INFO: renamed from: Z1 */
    @efb
    public final RelativeLayout f68782Z1;

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f68783a;

    /* JADX INFO: renamed from: a2 */
    @efb
    public final TextView f68784a2;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f68785b;

    /* JADX INFO: renamed from: b2 */
    @efb
    public final ImageView f68786b2;

    /* JADX INFO: renamed from: c */
    @efb
    public final RelativeLayout f68787c;

    /* JADX INFO: renamed from: c2 */
    @efb
    public final FrameLayout f68788c2;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f68789d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f68790e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f68791f;

    /* JADX INFO: renamed from: m */
    @efb
    public final ConstraintLayout f68792m;

    private ou6(@efb LinearLayout rootView, @efb TextView bindDevice, @efb RelativeLayout bindDeviceLayout, @efb TextView bindDeviceTip, @efb ImageView btnAlarm, @efb TextView languageText, @efb ConstraintLayout loginLayout, @efb TextView loginUserName, @efb TextView mineAbout, @efb TextView mineBeginnerGuide, @efb TextView minePermission, @efb TextView selectLanguage, @efb RelativeLayout titleLayout, @efb TextView tvPrivacyPolicy, @efb TextView tvTitle, @efb TextView tvUserAgreement, @efb TextView tvUserInfo, @efb RelativeLayout updateApp, @efb TextView updateAppMore, @efb RelativeLayout updateLanguage, @efb TextView userFeedback, @efb ImageView userIcon, @efb FrameLayout userIconView) {
        this.f68783a = rootView;
        this.f68785b = bindDevice;
        this.f68787c = bindDeviceLayout;
        this.f68789d = bindDeviceTip;
        this.f68790e = btnAlarm;
        this.f68791f = languageText;
        this.f68792m = loginLayout;
        this.f68770C = loginUserName;
        this.f68771F = mineAbout;
        this.f68772H = mineBeginnerGuide;
        this.f68773L = minePermission;
        this.f68774M = selectLanguage;
        this.f68776N = titleLayout;
        this.f68777Q = tvPrivacyPolicy;
        this.f68779X = tvTitle;
        this.f68780Y = tvUserAgreement;
        this.f68781Z = tvUserInfo;
        this.f68775M1 = updateApp;
        this.f68778V1 = updateAppMore;
        this.f68782Z1 = updateLanguage;
        this.f68784a2 = userFeedback;
        this.f68786b2 = userIcon;
        this.f68788c2 = userIconView;
    }

    @efb
    public static ou6 bind(@efb View rootView) {
        int i = C2531R.id.bind_device;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2531R.id.bind_device_layout;
            RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
            if (relativeLayout != null) {
                i = C2531R.id.bind_device_tip;
                TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                if (textView2 != null) {
                    i = C2531R.id.btn_alarm;
                    ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                    if (imageView != null) {
                        i = C2531R.id.language_text;
                        TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView3 != null) {
                            i = C2531R.id.login_layout;
                            ConstraintLayout constraintLayout = (ConstraintLayout) l8i.findChildViewById(rootView, i);
                            if (constraintLayout != null) {
                                i = C2531R.id.login_user_name;
                                TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                if (textView4 != null) {
                                    i = C2531R.id.mine_about;
                                    TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                    if (textView5 != null) {
                                        i = C2531R.id.mine_beginner_guide;
                                        TextView textView6 = (TextView) l8i.findChildViewById(rootView, i);
                                        if (textView6 != null) {
                                            i = C2531R.id.mine_permission;
                                            TextView textView7 = (TextView) l8i.findChildViewById(rootView, i);
                                            if (textView7 != null) {
                                                i = C2531R.id.select_language;
                                                TextView textView8 = (TextView) l8i.findChildViewById(rootView, i);
                                                if (textView8 != null) {
                                                    i = C2531R.id.title_layout;
                                                    RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                    if (relativeLayout2 != null) {
                                                        i = C2531R.id.tv_privacy_policy;
                                                        TextView textView9 = (TextView) l8i.findChildViewById(rootView, i);
                                                        if (textView9 != null) {
                                                            i = C2531R.id.tv_title;
                                                            TextView textView10 = (TextView) l8i.findChildViewById(rootView, i);
                                                            if (textView10 != null) {
                                                                i = C2531R.id.tv_user_agreement;
                                                                TextView textView11 = (TextView) l8i.findChildViewById(rootView, i);
                                                                if (textView11 != null) {
                                                                    i = C2531R.id.tv_user_info;
                                                                    TextView textView12 = (TextView) l8i.findChildViewById(rootView, i);
                                                                    if (textView12 != null) {
                                                                        i = C2531R.id.update_app;
                                                                        RelativeLayout relativeLayout3 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                        if (relativeLayout3 != null) {
                                                                            i = C2531R.id.update_app_more;
                                                                            TextView textView13 = (TextView) l8i.findChildViewById(rootView, i);
                                                                            if (textView13 != null) {
                                                                                i = C2531R.id.update_language;
                                                                                RelativeLayout relativeLayout4 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                                if (relativeLayout4 != null) {
                                                                                    i = C2531R.id.user_feedback;
                                                                                    TextView textView14 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                    if (textView14 != null) {
                                                                                        i = C2531R.id.user_icon;
                                                                                        ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                                                                                        if (imageView2 != null) {
                                                                                            i = C2531R.id.user_icon_view;
                                                                                            FrameLayout frameLayout = (FrameLayout) l8i.findChildViewById(rootView, i);
                                                                                            if (frameLayout != null) {
                                                                                                return new ou6((LinearLayout) rootView, textView, relativeLayout, textView2, imageView, textView3, constraintLayout, textView4, textView5, textView6, textView7, textView8, relativeLayout2, textView9, textView10, textView11, textView12, relativeLayout3, textView13, relativeLayout4, textView14, imageView2, frameLayout);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static ou6 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static ou6 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.fragment_mine, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f68783a;
    }
}

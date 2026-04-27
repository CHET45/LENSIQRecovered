package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.eyevue.common.widget.BatteryView;
import com.eyevue.common.widget.BvImageView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class mu6 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final LinearLayout f62144C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ImageView f62145F;

    /* JADX INFO: renamed from: H */
    @efb
    public final LinearLayout f62146H;

    /* JADX INFO: renamed from: L */
    @efb
    public final LinearLayout f62147L;

    /* JADX INFO: renamed from: M */
    @efb
    public final LinearLayout f62148M;

    /* JADX INFO: renamed from: M1 */
    @efb
    public final ImageView f62149M1;

    /* JADX INFO: renamed from: N */
    @efb
    public final LinearLayout f62150N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final LinearLayout f62151Q;

    /* JADX INFO: renamed from: V1 */
    @efb
    public final BvImageView f62152V1;

    /* JADX INFO: renamed from: X */
    @efb
    public final LinearLayout f62153X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final CardView f62154Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final ConstraintLayout f62155Z;

    /* JADX INFO: renamed from: Z1 */
    @efb
    public final ImageView f62156Z1;

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f62157a;

    /* JADX INFO: renamed from: a2 */
    @efb
    public final ImageView f62158a2;

    /* JADX INFO: renamed from: b */
    @efb
    public final BatteryView f62159b;

    /* JADX INFO: renamed from: b2 */
    @efb
    public final ImageView f62160b2;

    /* JADX INFO: renamed from: c */
    @efb
    public final CardView f62161c;

    /* JADX INFO: renamed from: c2 */
    @efb
    public final ImageView f62162c2;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f62163d;

    /* JADX INFO: renamed from: d2 */
    @efb
    public final ImageView f62164d2;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f62165e;

    /* JADX INFO: renamed from: e2 */
    @efb
    public final LinearLayout f62166e2;

    /* JADX INFO: renamed from: f */
    @efb
    public final LinearLayout f62167f;

    /* JADX INFO: renamed from: f2 */
    @efb
    public final LinearLayout f62168f2;

    /* JADX INFO: renamed from: g2 */
    @efb
    public final LinearLayout f62169g2;

    /* JADX INFO: renamed from: h2 */
    @efb
    public final RelativeLayout f62170h2;

    /* JADX INFO: renamed from: i2 */
    @efb
    public final RecyclerView f62171i2;

    /* JADX INFO: renamed from: j2 */
    @efb
    public final RelativeLayout f62172j2;

    /* JADX INFO: renamed from: k2 */
    @efb
    public final RecyclerView f62173k2;

    /* JADX INFO: renamed from: l2 */
    @efb
    public final TextView f62174l2;

    /* JADX INFO: renamed from: m */
    @efb
    public final ImageView f62175m;

    /* JADX INFO: renamed from: m2 */
    @efb
    public final TextView f62176m2;

    /* JADX INFO: renamed from: n2 */
    @efb
    public final TextView f62177n2;

    /* JADX INFO: renamed from: o2 */
    @efb
    public final TextView f62178o2;

    /* JADX INFO: renamed from: p2 */
    @efb
    public final TextView f62179p2;

    /* JADX INFO: renamed from: q2 */
    @efb
    public final TextView f62180q2;

    /* JADX INFO: renamed from: r2 */
    @efb
    public final TextView f62181r2;

    /* JADX INFO: renamed from: s2 */
    @efb
    public final TextView f62182s2;

    /* JADX INFO: renamed from: t2 */
    @efb
    public final ViewPager2 f62183t2;

    private mu6(@efb ConstraintLayout rootView, @efb BatteryView battery, @efb CardView btnAiSkill, @efb TextView btnConnectBt, @efb ImageView btnDeviceList, @efb LinearLayout btnDeviceName, @efb ImageView btnDeviceSetting, @efb LinearLayout btnFirstAddDevice, @efb ImageView btnGuide, @efb LinearLayout btnLive, @efb LinearLayout btnQuickVolume, @efb LinearLayout btnReconnect, @efb LinearLayout btnRecordAudio, @efb LinearLayout btnRecordVideo, @efb LinearLayout btnTakePhoto, @efb CardView btnUseSkill, @efb ConstraintLayout clMainLayout, @efb ImageView ivCharging, @efb BvImageView ivDeviceImg, @efb ImageView ivGreenPoint, @efb ImageView ivReconnectAnim, @efb ImageView ivRecordingAudio, @efb ImageView ivRecordingVideo, @efb ImageView ivRedPoint, @efb LinearLayout llCamera, @efb LinearLayout llConnectState, @efb LinearLayout llSoundLive, @efb RelativeLayout rlAdddeviceLayout, @efb RecyclerView rlFunctionList, @efb RelativeLayout rlTitleLayout, @efb RecyclerView rvPosition, @efb TextView tvBattery, @efb TextView tvConnectState, @efb TextView tvDeviceName, @efb TextView tvRecordAudio, @efb TextView tvRecordVideo, @efb TextView tvTip2, @efb TextView tvTool, @efb TextView tvUseSkill, @efb ViewPager2 viewPager) {
        this.f62157a = rootView;
        this.f62159b = battery;
        this.f62161c = btnAiSkill;
        this.f62163d = btnConnectBt;
        this.f62165e = btnDeviceList;
        this.f62167f = btnDeviceName;
        this.f62175m = btnDeviceSetting;
        this.f62144C = btnFirstAddDevice;
        this.f62145F = btnGuide;
        this.f62146H = btnLive;
        this.f62147L = btnQuickVolume;
        this.f62148M = btnReconnect;
        this.f62150N = btnRecordAudio;
        this.f62151Q = btnRecordVideo;
        this.f62153X = btnTakePhoto;
        this.f62154Y = btnUseSkill;
        this.f62155Z = clMainLayout;
        this.f62149M1 = ivCharging;
        this.f62152V1 = ivDeviceImg;
        this.f62156Z1 = ivGreenPoint;
        this.f62158a2 = ivReconnectAnim;
        this.f62160b2 = ivRecordingAudio;
        this.f62162c2 = ivRecordingVideo;
        this.f62164d2 = ivRedPoint;
        this.f62166e2 = llCamera;
        this.f62168f2 = llConnectState;
        this.f62169g2 = llSoundLive;
        this.f62170h2 = rlAdddeviceLayout;
        this.f62171i2 = rlFunctionList;
        this.f62172j2 = rlTitleLayout;
        this.f62173k2 = rvPosition;
        this.f62174l2 = tvBattery;
        this.f62176m2 = tvConnectState;
        this.f62177n2 = tvDeviceName;
        this.f62178o2 = tvRecordAudio;
        this.f62179p2 = tvRecordVideo;
        this.f62180q2 = tvTip2;
        this.f62181r2 = tvTool;
        this.f62182s2 = tvUseSkill;
        this.f62183t2 = viewPager;
    }

    @efb
    public static mu6 bind(@efb View rootView) {
        int i = C2558R.id.battery;
        BatteryView batteryView = (BatteryView) l8i.findChildViewById(rootView, i);
        if (batteryView != null) {
            i = C2558R.id.btn_ai_skill;
            CardView cardView = (CardView) l8i.findChildViewById(rootView, i);
            if (cardView != null) {
                i = C2558R.id.btn_connect_bt;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    i = C2558R.id.btn_device_list;
                    ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                    if (imageView != null) {
                        i = C2558R.id.btn_device_name;
                        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                        if (linearLayout != null) {
                            i = C2558R.id.btn_device_setting;
                            ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                            if (imageView2 != null) {
                                i = C2558R.id.btn_first_add_device;
                                LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                if (linearLayout2 != null) {
                                    i = C2558R.id.btn_guide;
                                    ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                                    if (imageView3 != null) {
                                        i = C2558R.id.btn_live;
                                        LinearLayout linearLayout3 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                        if (linearLayout3 != null) {
                                            i = C2558R.id.btn_quick_volume;
                                            LinearLayout linearLayout4 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                            if (linearLayout4 != null) {
                                                i = C2558R.id.btn_reconnect;
                                                LinearLayout linearLayout5 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                                if (linearLayout5 != null) {
                                                    i = C2558R.id.btn_record_audio;
                                                    LinearLayout linearLayout6 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                                    if (linearLayout6 != null) {
                                                        i = C2558R.id.btn_record_video;
                                                        LinearLayout linearLayout7 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                                        if (linearLayout7 != null) {
                                                            i = C2558R.id.btn_take_photo;
                                                            LinearLayout linearLayout8 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                                            if (linearLayout8 != null) {
                                                                i = C2558R.id.btn_use_skill;
                                                                CardView cardView2 = (CardView) l8i.findChildViewById(rootView, i);
                                                                if (cardView2 != null) {
                                                                    i = C2558R.id.cl_main_layout;
                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) l8i.findChildViewById(rootView, i);
                                                                    if (constraintLayout != null) {
                                                                        i = C2558R.id.iv_charging;
                                                                        ImageView imageView4 = (ImageView) l8i.findChildViewById(rootView, i);
                                                                        if (imageView4 != null) {
                                                                            i = C2558R.id.iv_device_img;
                                                                            BvImageView bvImageView = (BvImageView) l8i.findChildViewById(rootView, i);
                                                                            if (bvImageView != null) {
                                                                                i = C2558R.id.iv_green_point;
                                                                                ImageView imageView5 = (ImageView) l8i.findChildViewById(rootView, i);
                                                                                if (imageView5 != null) {
                                                                                    i = C2558R.id.iv_reconnect_anim;
                                                                                    ImageView imageView6 = (ImageView) l8i.findChildViewById(rootView, i);
                                                                                    if (imageView6 != null) {
                                                                                        i = C2558R.id.iv_recording_audio;
                                                                                        ImageView imageView7 = (ImageView) l8i.findChildViewById(rootView, i);
                                                                                        if (imageView7 != null) {
                                                                                            i = C2558R.id.iv_recording_video;
                                                                                            ImageView imageView8 = (ImageView) l8i.findChildViewById(rootView, i);
                                                                                            if (imageView8 != null) {
                                                                                                i = C2558R.id.iv_red_point;
                                                                                                ImageView imageView9 = (ImageView) l8i.findChildViewById(rootView, i);
                                                                                                if (imageView9 != null) {
                                                                                                    i = C2558R.id.ll_camera;
                                                                                                    LinearLayout linearLayout9 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                                                                                    if (linearLayout9 != null) {
                                                                                                        i = C2558R.id.ll_connect_state;
                                                                                                        LinearLayout linearLayout10 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                                                                                        if (linearLayout10 != null) {
                                                                                                            i = C2558R.id.ll_sound_live;
                                                                                                            LinearLayout linearLayout11 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                                                                                            if (linearLayout11 != null) {
                                                                                                                i = C2558R.id.rl_adddevice_layout;
                                                                                                                RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                                                                if (relativeLayout != null) {
                                                                                                                    i = C2558R.id.rl_function_list;
                                                                                                                    RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
                                                                                                                    if (recyclerView != null) {
                                                                                                                        i = C2558R.id.rl_title_layout;
                                                                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                                                                        if (relativeLayout2 != null) {
                                                                                                                            i = C2558R.id.rv_position;
                                                                                                                            RecyclerView recyclerView2 = (RecyclerView) l8i.findChildViewById(rootView, i);
                                                                                                                            if (recyclerView2 != null) {
                                                                                                                                i = C2558R.id.tv_battery;
                                                                                                                                TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                                                                if (textView2 != null) {
                                                                                                                                    i = C2558R.id.tv_connect_state;
                                                                                                                                    TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                                                                    if (textView3 != null) {
                                                                                                                                        i = C2558R.id.tv_device_name;
                                                                                                                                        TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                                                                        if (textView4 != null) {
                                                                                                                                            i = C2558R.id.tv_record_audio;
                                                                                                                                            TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                                                                            if (textView5 != null) {
                                                                                                                                                i = C2558R.id.tv_record_video;
                                                                                                                                                TextView textView6 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                                                                                if (textView6 != null) {
                                                                                                                                                    i = C2558R.id.tv_tip2;
                                                                                                                                                    TextView textView7 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                                                                                    if (textView7 != null) {
                                                                                                                                                        i = C2558R.id.tv_tool;
                                                                                                                                                        TextView textView8 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                                                                                        if (textView8 != null) {
                                                                                                                                                            i = C2558R.id.tv_use_skill;
                                                                                                                                                            TextView textView9 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                                                                                            if (textView9 != null) {
                                                                                                                                                                i = C2558R.id.view_pager;
                                                                                                                                                                ViewPager2 viewPager2 = (ViewPager2) l8i.findChildViewById(rootView, i);
                                                                                                                                                                if (viewPager2 != null) {
                                                                                                                                                                    return new mu6((ConstraintLayout) rootView, batteryView, cardView, textView, imageView, linearLayout, imageView2, linearLayout2, imageView3, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, cardView2, constraintLayout, imageView4, bvImageView, imageView5, imageView6, imageView7, imageView8, imageView9, linearLayout9, linearLayout10, linearLayout11, relativeLayout, recyclerView, relativeLayout2, recyclerView2, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, viewPager2);
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
    public static mu6 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static mu6 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.fragment_eyevue_home, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f62157a;
    }
}

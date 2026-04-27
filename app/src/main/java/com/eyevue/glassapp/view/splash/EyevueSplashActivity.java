package com.eyevue.glassapp.view.splash;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.C2473f;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.view.MainActivity;
import com.eyevue.glassapp.view.auth.EyevueLoginActivity;
import com.watchfun.base.BaseActivity;
import java.util.UUID;
import p000.C13425ua;
import p000.InterfaceC14278vw;
import p000.a77;
import p000.ck9;
import p000.e4e;
import p000.f4g;
import p000.hh3;
import p000.hib;
import p000.hu8;
import p000.jmg;
import p000.mcd;
import p000.ne4;
import p000.qt2;
import p000.vfe;
import p000.yp0;
import p000.ywd;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueSplashActivity extends BaseActivity<C13425ua> implements ck9.InterfaceC2359n {

    /* JADX INFO: renamed from: a */
    public ywd f19158a;

    /* JADX INFO: renamed from: b */
    public boolean f19159b;

    /* JADX INFO: renamed from: c */
    public boolean f19160c;

    /* JADX INFO: renamed from: d */
    public boolean f19161d;

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.splash.EyevueSplashActivity$a */
    public class C2922a implements e4e<GifDrawable> {

        /* JADX INFO: renamed from: com.eyevue.glassapp.view.splash.EyevueSplashActivity$a$a */
        public class a extends InterfaceC14278vw.a {
            public a() {
            }

            @Override // p000.InterfaceC14278vw.a
            public void onAnimationEnd(Drawable drawable) {
                super.onAnimationEnd(drawable);
                EyevueSplashActivity.this.f19160c = true;
                if (EyevueSplashActivity.this.f19161d) {
                    EyevueSplashActivity.this.toLoginActivity();
                }
                if (EyevueSplashActivity.this.f19159b) {
                    EyevueSplashActivity.this.toMainActivity();
                }
                C2473f.m4168e("GIF", "播放完成");
            }
        }

        public C2922a() {
        }

        @Override // p000.e4e
        public boolean onLoadFailed(@hib a77 e, Object model, jmg<GifDrawable> target, boolean isFirstResource) {
            return false;
        }

        @Override // p000.e4e
        public boolean onResourceReady(GifDrawable resource, Object model, jmg<GifDrawable> target, hh3 dataSource, boolean isFirstResource) {
            resource.setLoopCount(1);
            resource.start();
            resource.registerAnimationCallback(new a());
            return false;
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.splash.EyevueSplashActivity$b */
    public class C2923b implements mcd.InterfaceC9284f {
        public C2923b() {
        }

        @Override // p000.mcd.InterfaceC9284f
        public void onAgree() {
            vfe.getInstance().putBoolean("KEY_DEVICE_PRIVACY_POLICY", true);
            String string = vfe.getInstance().getString("KEY_UID");
            if (TextUtils.isEmpty(string)) {
                string = UUID.randomUUID().toString();
            }
            vfe.getInstance().putString("KEY_UID", string);
            EyevueSplashActivity.this.f19158a.requestData();
            f4g.initStatistics(EyevueSplashActivity.this);
            EyevueSplashActivity.this.updateView();
        }

        @Override // p000.mcd.InterfaceC9284f
        public void onDisagree() {
            EyevueSplashActivity.this.finish();
        }
    }

    private void showDialog() {
        new mcd(this, new C2923b()).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toLoginActivity() {
        this.f19161d = true;
        if (this.f19160c) {
            vfe.getInstance().putBoolean("SP_KEY_SUPPORT_AI", true);
            vfe.getInstance().putString("SP_KEY_CLASSIC_ADDRESS", "");
            vfe.getInstance().putString("SP_KEY_CLASSIC_NAME", "");
            Intent intent = new Intent(this, (Class<?>) EyevueLoginActivity.class);
            intent.putExtra(qt2.f75577a, 1);
            startActivity(intent);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toMainActivity() {
        this.f19159b = true;
        if (this.f19160c) {
            vfe.getInstance().putBoolean("SP_KEY_SUPPORT_AI", true);
            vfe.getInstance().putString("SP_KEY_CLASSIC_ADDRESS", "");
            vfe.getInstance().putString("SP_KEY_CLASSIC_NAME", "");
            startActivity(new Intent(this, (Class<?>) MainActivity.class));
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateView() {
        if (!vfe.getInstance().getBoolean("KEY_DEVICE_PRIVACY_POLICY", false)) {
            showDialog();
            return;
        }
        boolean z = vfe.getInstance().getBoolean("SP_KEY_LOGIN_SKIP", false);
        String string = vfe.getInstance().getString("KEY_TOKEN");
        if (z) {
            toMainActivity();
        } else if (TextUtils.isEmpty(string)) {
            toLoginActivity();
        } else {
            toMainActivity();
        }
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C2531R.drawable.splash)).diskCacheStrategy(ne4.f64120d).listener(new C2922a()).into(((C13425ua) this.binding).f87246b);
        this.f19158a = new ywd(this);
        updateView();
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C13425ua getViewBinding() {
        return C13425ua.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        yp0.setNavBarVisibility((Activity) this, false);
        hu8.setLanguage(this);
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // p000.ck9.InterfaceC2359n, p000.ck9.InterfaceC2355j
    public void onGetDataFail() {
    }

    @Override // p000.ck9.InterfaceC2359n
    public void onGetDataSuccess(String status, boolean isCache, boolean isRefresh) {
        vfe.getInstance().putBoolean("SP_KEY_REGISTER_TOURIST", true);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

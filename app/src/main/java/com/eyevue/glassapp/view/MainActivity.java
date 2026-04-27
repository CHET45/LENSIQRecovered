package com.eyevue.glassapp.view;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import com.eyevue.common.bean.adconfig.AdConfigDataBean;
import com.eyevue.common.bean.login.UserInfoBean;
import com.eyevue.common.bean.login.UserTokenBean;
import com.eyevue.common.widget.bottomnav.BottomBarItem;
import com.eyevue.common.widget.bottomnav.BottomBarLayout;
import com.eyevue.glassapp.helper.AiWebSocketManager;
import com.eyevue.glassapp.view.home.HomeFragment;
import com.eyevue.glassapp.view.mine.MineFragment;
import com.eyevue.glassapp.view.p007ai.EyevueAiFragment;
import com.eyevue.glassapp.view.photo.PhotoListFragment;
import com.watchfun.base.BaseActivity;
import com.watchfun.base.BaseFragment;
import java.util.ArrayList;
import java.util.List;
import p000.C14630wj;
import p000.C16155zj;
import p000.C6378gm;
import p000.C6908hm;
import p000.C7330im;
import p000.C7973jm;
import p000.C8840lk;
import p000.C9768nb;
import p000.ck9;
import p000.gkg;
import p000.hr9;
import p000.hu8;
import p000.kwd;
import p000.nc2;
import p000.phg;
import p000.pq0;
import p000.rc7;
import p000.t77;
import p000.tc8;
import p000.u77;
import p000.uc8;
import p000.vfe;
import p000.xcg;
import p000.yi9;
import p000.ywd;
import p000.zgb;

/* JADX INFO: loaded from: classes4.dex */
public class MainActivity extends BaseActivity<C9768nb> implements BottomBarLayout.InterfaceC2545b, tc8.InterfaceC12980d, ck9.InterfaceC2359n, ck9.InterfaceC2365t, ck9.InterfaceC2355j {

    /* JADX INFO: renamed from: M */
    public static final String f18345M = "MainActivity";

    /* JADX INFO: renamed from: a */
    public List<BaseFragment> f18350a;

    /* JADX INFO: renamed from: b */
    public ywd f18351b;

    /* JADX INFO: renamed from: d */
    public uc8 f18353d;

    /* JADX INFO: renamed from: e */
    public kwd f18354e;

    /* JADX INFO: renamed from: c */
    public boolean f18352c = false;

    /* JADX INFO: renamed from: f */
    public final xcg<C6378gm> f18355f = new xcg() { // from class: xq9
        @Override // p000.xcg
        public final void onEvent(Object obj) {
            this.f98975a.lambda$new$0((C6378gm) obj);
        }
    };

    /* JADX INFO: renamed from: m */
    public final xcg<C7330im> f18356m = new xcg() { // from class: yq9
        @Override // p000.xcg
        public final void onEvent(Object obj) {
            this.f102652a.lambda$new$1((C7330im) obj);
        }
    };

    /* JADX INFO: renamed from: C */
    public final xcg<gkg> f18346C = new xcg() { // from class: zq9
        @Override // p000.xcg
        public final void onEvent(Object obj) {
            this.f105745a.lambda$new$2((gkg) obj);
        }
    };

    /* JADX INFO: renamed from: F */
    public final xcg<C8840lk> f18347F = new xcg() { // from class: ar9
        @Override // p000.xcg
        public final void onEvent(Object obj) {
            this.f11680a.lambda$new$3((C8840lk) obj);
        }
    };

    /* JADX INFO: renamed from: H */
    public final xcg<C14630wj> f18348H = new xcg() { // from class: br9
        @Override // p000.xcg
        public final void onEvent(Object obj) {
            this.f14597a.lambda$new$4((C14630wj) obj);
        }
    };

    /* JADX INFO: renamed from: L */
    public final xcg<phg> f18349L = new xcg() { // from class: cr9
        @Override // p000.xcg
        public final void onEvent(Object obj) {
            this.f27131a.lambda$new$5((phg) obj);
        }
    };

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.MainActivity$a */
    public class ViewOnClickListenerC2689a implements View.OnClickListener {
        public ViewOnClickListenerC2689a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            C6908hm c6908hm = new C6908hm();
            c6908hm.f44099b = true;
            zgb.defaultCenter().publish(c6908hm);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.MainActivity$b */
    public class ViewOnClickListenerC2690b implements View.OnClickListener {
        public ViewOnClickListenerC2690b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            C6908hm c6908hm = new C6908hm();
            c6908hm.f44098a = true;
            zgb.defaultCenter().publish(c6908hm);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.MainActivity$c */
    public class ViewOnClickListenerC2691c implements View.OnClickListener {
        public ViewOnClickListenerC2691c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            C7973jm c7973jm = new C7973jm();
            c7973jm.f51130a = ((C9768nb) ((BaseActivity) MainActivity.this).binding).f63848m.isSelected();
            zgb.defaultCenter().publish(c7973jm);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.MainActivity$d */
    public class ViewOnClickListenerC2692d implements View.OnClickListener {
        public ViewOnClickListenerC2692d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            C16155zj c16155zj = new C16155zj();
            c16155zj.f105206a = true;
            zgb.defaultCenter().publish(c16155zj);
            ((C9768nb) ((BaseActivity) MainActivity.this).binding).f63847f.setVisibility(8);
            ((C9768nb) ((BaseActivity) MainActivity.this).binding).f63844c.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.MainActivity$e */
    public class ViewOnClickListenerC2693e implements View.OnClickListener {
        public ViewOnClickListenerC2693e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            C16155zj c16155zj = new C16155zj();
            c16155zj.f105207b = true;
            zgb.defaultCenter().publish(c16155zj);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.MainActivity$f */
    public class ViewOnClickListenerC2694f implements View.OnClickListener {
        public ViewOnClickListenerC2694f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            C16155zj c16155zj = new C16155zj();
            c16155zj.f105208c = true;
            zgb.defaultCenter().publish(c16155zj);
        }
    }

    private void initFragment() {
        this.f18352c = false;
        ((C9768nb) this.binding).f63846e.setVisibility(0);
        ArrayList arrayList = new ArrayList();
        this.f18350a = arrayList;
        arrayList.add(HomeFragment.newInstance());
        this.f18350a.add(EyevueAiFragment.newInstance());
        this.f18350a.add(PhotoListFragment.newInstance());
        this.f18350a.add(MineFragment.newInstance());
        setTransView();
        hr9 hr9Var = new hr9(this.f18350a, getSupportFragmentManager());
        ((C9768nb) this.binding).f63841Z.setOffscreenPageLimit(this.f18350a.size());
        ((C9768nb) this.binding).f63841Z.setAdapter(hr9Var);
        T t = this.binding;
        ((C9768nb) t).f63844c.setViewPager(((C9768nb) t).f63841Z);
        ((C9768nb) this.binding).f63844c.setOnItemSelectedListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(C6378gm c6378gm) {
        ((C9768nb) this.binding).f63848m.setSelected(c6378gm.f40160a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(C7330im c7330im) {
        ((C9768nb) this.binding).f63844c.setVisibility(c7330im.f47358a ? 8 : 0);
        ((C9768nb) this.binding).f63848m.setVisibility(c7330im.f47358a ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(gkg gkgVar) {
        if (gkgVar.f40039a == 1) {
            setTransView();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3(C8840lk c8840lk) {
        if (c8840lk.f57748a) {
            ((C9768nb) this.binding).f63847f.setVisibility(0);
            ((C9768nb) this.binding).f63844c.setVisibility(8);
        } else {
            ((C9768nb) this.binding).f63847f.setVisibility(8);
            ((C9768nb) this.binding).f63844c.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$4(C14630wj c14630wj) {
        ((C9768nb) this.binding).f63834H.setSelected(c14630wj.f94372a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$5(phg phgVar) {
        if (phgVar.f70840b) {
            if (((C9768nb) this.binding).f63843b.getVisibility() == 0) {
                ((C9768nb) this.binding).f63843b.performClick();
            }
        } else if (phgVar.f70839a) {
            ((C9768nb) this.binding).f63845d.performClick();
        }
    }

    private void setTransView() {
        boolean z = t77.f83926e;
        ((C9768nb) this.binding).f63843b.setVisibility(0);
        if (u77.f86958b.equals(u77.f86957a)) {
            ((C9768nb) this.binding).f63840Y.setVisibility(0);
        } else {
            ((C9768nb) this.binding).f63840Y.setVisibility(8);
        }
    }

    @Override // com.watchfun.base.BaseActivity
    public void initData() {
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        uc8 uc8Var = new uc8(this);
        this.f18353d = uc8Var;
        uc8Var.requestData();
        this.f18354e = new kwd(this);
        if (!vfe.getInstance().getBoolean("SP_KEY_REGISTER_TOURIST", true)) {
            this.f18351b.requestData();
        }
        initFragment();
        ((C9768nb) this.binding).f63835L.setOnClickListener(new ViewOnClickListenerC2689a());
        ((C9768nb) this.binding).f63836M.setOnClickListener(new ViewOnClickListenerC2690b());
        ((C9768nb) this.binding).f63837N.setOnClickListener(new ViewOnClickListenerC2691c());
        ((C9768nb) this.binding).f63832C.setOnClickListener(new ViewOnClickListenerC2692d());
        ((C9768nb) this.binding).f63833F.setOnClickListener(new ViewOnClickListenerC2693e());
        ((C9768nb) this.binding).f63834H.setOnClickListener(new ViewOnClickListenerC2694f());
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C9768nb getViewBinding() {
        return C9768nb.inflate(getLayoutInflater());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        moveTaskToBack(true);
    }

    @Override // com.watchfun.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hu8.setLanguage(this);
        this.f18351b = new ywd(this);
        zgb.defaultCenter().subscriber(gkg.class, this.f18346C);
        zgb.defaultCenter().subscriber(C6378gm.class, this.f18355f);
        zgb.defaultCenter().subscriber(C7330im.class, this.f18356m);
        zgb.defaultCenter().subscriber(C8840lk.class, this.f18347F);
        zgb.defaultCenter().subscriber(C14630wj.class, this.f18348H);
        zgb.defaultCenter().subscriber(phg.class, this.f18349L);
        yi9.m26092e(f18345M, "MainActivity  onCreate");
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        vfe.getInstance().putBoolean("KEY_RETRY_CONNECT_FIRST", true);
        zgb.defaultCenter().unsubscribe(gkg.class, this.f18346C);
        zgb.defaultCenter().unsubscribe(C6378gm.class, this.f18355f);
        zgb.defaultCenter().unsubscribe(C7330im.class, this.f18356m);
        zgb.defaultCenter().unsubscribe(C8840lk.class, this.f18347F);
        zgb.defaultCenter().unsubscribe(C14630wj.class, this.f18348H);
        zgb.defaultCenter().unsubscribe(phg.class, this.f18349L);
    }

    @Override // p000.tc8.InterfaceC12980d, p000.ck9.InterfaceC2359n, p000.ck9.InterfaceC2355j
    public void onGetDataFail() {
    }

    @Override // p000.ck9.InterfaceC2365t
    public void onGetDataSuccess(UserInfoBean userInfo, boolean isCache, boolean isRefresh) {
    }

    @Override // com.eyevue.common.widget.bottomnav.BottomBarLayout.InterfaceC2545b
    public void onItemSelected(BottomBarItem bottomBarItem, int previousPosition, int currentPosition) {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == 4 && this.f18352c) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        AiWebSocketManager.getInstance().setCanUseAi(true);
    }

    @Override // p000.ck9.InterfaceC2365t
    public void onGetDataFail(int code) {
        if (code == 401) {
            this.f18354e.requestData();
        }
    }

    @Override // p000.ck9.InterfaceC2359n
    public void onGetDataSuccess(String status, boolean isCache, boolean isRefresh) {
    }

    @Override // p000.tc8.InterfaceC12980d
    public void onGetDataSuccess(List<AdConfigDataBean> adConfigData, boolean isCache, boolean isRefresh) throws Throwable {
        if (nc2.isEmpty(adConfigData)) {
            return;
        }
        String json = rc7.toJson(adConfigData);
        Log.i("aaaaaaaa", "saveResultData:json:" + json);
        pq0.putToCache("SP_KEY_INTERSTITIAL_CONFIG", json);
    }

    @Override // p000.ck9.InterfaceC2355j
    public void onGetDataSuccess(UserTokenBean userTokenVO, boolean isCache, boolean isRefresh) {
        if (userTokenVO != null) {
            vfe.getInstance().putString("KEY_TOKEN", userTokenVO.getAccessToken());
            vfe.getInstance().putString("SP_KEY_REFRESH_TOKEN", userTokenVO.getRefreshToken());
        }
    }
}

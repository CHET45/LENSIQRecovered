package com.eyevue.glassapp.view.photo;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.viewpager2.widget.ViewPager2;
import com.eyevue.glassapp.EyevueApplication;
import com.eyevue.glassapp.view.photo.BaseMediaFragment;
import com.watchfun.base.BaseActivity;
import com.watchfun.theme.C4032a;
import java.util.ArrayList;
import p000.C10276oa;
import p000.gfa;
import p000.iei;
import p000.pb9;
import p000.qxb;
import p000.xcg;
import p000.yp0;
import p000.zgb;

/* JADX INFO: loaded from: classes4.dex */
public class EyevuePreviewActivity extends BaseActivity<C10276oa> {

    /* JADX INFO: renamed from: e */
    public static final String f18840e = "file_position";

    /* JADX INFO: renamed from: f */
    public static final String f18841f = "file_list";

    /* JADX INFO: renamed from: a */
    public int f18842a;

    /* JADX INFO: renamed from: b */
    public C2865a f18843b;

    /* JADX INFO: renamed from: c */
    public ArrayList<String> f18844c;

    /* JADX INFO: renamed from: d */
    public final xcg<gfa> f18845d = new xcg() { // from class: sn5
        @Override // p000.xcg
        public final void onEvent(Object obj) {
            this.f82364a.lambda$new$0((gfa) obj);
        }
    };

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.EyevuePreviewActivity$a */
    public class C2830a extends ViewPager2.OnPageChangeCallback {
        public C2830a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int state) {
            super.onPageScrollStateChanged(state);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            super.onPageScrolled(position, positionOffset, positionOffsetPixels);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            EyevuePreviewActivity.this.setDeleteListener(position);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.EyevuePreviewActivity$b */
    public class C2831b implements qxb<Object> {
        public C2831b() {
        }

        @Override // p000.qxb
        public void onChanged(Object o) {
            Pair pair = (Pair) o;
            if (((String) pair.first).isEmpty()) {
                return;
            }
            Log.e("xtest", "PreviewActivity读到图片地址更新，旧地址：" + ((String) pair.first) + ",新地址：" + ((String) pair.second));
            for (int i = 0; i < EyevuePreviewActivity.this.f18844c.size(); i++) {
                if (((String) EyevuePreviewActivity.this.f18844c.get(i)).contains(((String) pair.first).replace(iei.f46708b, ""))) {
                    EyevuePreviewActivity.this.f18844c.set(i, (String) pair.second);
                    EyevuePreviewActivity.this.f18843b.notifyItemChanged(i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.EyevuePreviewActivity$c */
    public class C2832c implements qxb<Object> {

        /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.EyevuePreviewActivity$c$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Object f18849a;

            public a(final Object val$o) {
                this.f18849a = val$o;
            }

            @Override // java.lang.Runnable
            public void run() {
                ((C10276oa) ((BaseActivity) EyevuePreviewActivity.this).binding).f66957b.setUserInputEnabled(((Boolean) this.f18849a).booleanValue());
            }
        }

        public C2832c() {
        }

        @Override // p000.qxb
        public void onChanged(Object o) {
            EyevuePreviewActivity.this.runOnUiThread(new a(o));
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.EyevuePreviewActivity$d */
    public class RunnableC2833d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f18851a;

        public RunnableC2833d(final int val$position) {
            this.f18851a = val$position;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0(int i) {
            Log.e("xtestdelete", "执行删除逻辑，下标：" + i);
            EyevuePreviewActivity.this.f18844c.remove(i);
            EyevuePreviewActivity.this.f18843b.setNewList(EyevuePreviewActivity.this.f18844c);
            if (i < EyevuePreviewActivity.this.f18843b.getItemCount()) {
                ((C10276oa) ((BaseActivity) EyevuePreviewActivity.this).binding).f66957b.setCurrentItem(i, true);
                EyevuePreviewActivity.this.setDeleteListener(i);
            } else if (EyevuePreviewActivity.this.f18843b.getItemCount() > 0) {
                int i2 = i == 0 ? 0 : i - 1;
                ((C10276oa) ((BaseActivity) EyevuePreviewActivity.this).binding).f66957b.setCurrentItem(i2, true);
                EyevuePreviewActivity.this.setDeleteListener(i2);
            }
            if (EyevuePreviewActivity.this.f18844c.isEmpty()) {
                EyevuePreviewActivity.this.finish();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseMediaFragment baseMediaFragment = (BaseMediaFragment) EyevuePreviewActivity.this.f18843b.getFragmentAt(this.f18851a);
            if (baseMediaFragment != null) {
                baseMediaFragment.setCurrentPosition(this.f18851a);
                baseMediaFragment.setOnDeleteListener(new BaseMediaFragment.InterfaceC2825e() { // from class: tn5
                    @Override // com.eyevue.glassapp.view.photo.BaseMediaFragment.InterfaceC2825e
                    public final void onDelete(int i) {
                        this.f85358a.lambda$run$0(i);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(gfa gfaVar) {
        if (TextUtils.isEmpty(gfaVar.f39676a) || TextUtils.isEmpty(gfaVar.f39677b)) {
            return;
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= this.f18844c.size()) {
                i = -1;
                break;
            }
            String str = this.f18844c.get(i);
            if (str != null && str.contains(gfaVar.f39676a)) {
                this.f18844c.set(i, gfaVar.f39677b);
                z = true;
                break;
            }
            i++;
        }
        if (!z || i < 0 || this.f18843b == null) {
            return;
        }
        this.f18844c.set(i, gfaVar.f39677b);
        this.f18843b.notifyItemChanged(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeleteListener(int position) {
        ((C10276oa) this.binding).f66957b.post(new RunnableC2833d(position));
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        this.f18842a = getIntent().getIntExtra(f18840e, 0);
        this.f18844c = EyevueApplication.getEyevueApplication().getMediaUris();
        this.f18843b = new C2865a(this, this.f18844c);
        zgb.defaultCenter().subscribeStrongly(gfa.class, this.f18845d);
        ((C10276oa) this.binding).f66957b.setAdapter(this.f18843b);
        ((C10276oa) this.binding).f66957b.setOffscreenPageLimit(2);
        ((C10276oa) this.binding).f66957b.setCurrentItem(this.f18842a, false);
        setDeleteListener(this.f18842a);
        ((C10276oa) this.binding).f66957b.setUserInputEnabled(true);
        ((C10276oa) this.binding).f66957b.registerOnPageChangeCallback(new C2830a());
        pb9.get("PHOTO_REFRESH").observe(this, new C2831b());
        pb9.get("ImageSlideEnable").observe(this, new C2832c());
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C10276oa getViewBinding() {
        return C10276oa.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        zgb.defaultCenter().unsubscribe(gfa.class, this.f18845d);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C4032a.setStatusBarDark(this, false, true, false, -16777216);
        yp0.setStatusBarLightMode((Activity) this, false);
    }
}

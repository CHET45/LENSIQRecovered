package com.eyevue.glassapp.view.batterypermissions;

import android.content.Intent;
import android.view.View;
import com.eyevue.common.C2531R;
import com.watchfun.base.BaseActivity;
import p000.C15567y9;

/* JADX INFO: loaded from: classes4.dex */
public class EyevuePhoneListActivity extends BaseActivity<C15567y9> {

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.batterypermissions.EyevuePhoneListActivity$a */
    public class ViewOnClickListenerC2762a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f18544a;

        public ViewOnClickListenerC2762a(final String val$languageCode) {
            this.f18544a = val$languageCode;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            Intent intent = new Intent(EyevuePhoneListActivity.this, (Class<?>) EyevuePhoneDetailActivity.class);
            intent.putExtra(EyevuePhoneDetailActivity.f18542a, C2531R.string.string_huawei);
            if (this.f18544a.contains("zh")) {
                intent.putExtra(EyevuePhoneDetailActivity.f18543b, C2531R.drawable.img_huawei);
            } else {
                intent.putExtra(EyevuePhoneDetailActivity.f18543b, C2531R.drawable.img_huawei_en);
            }
            EyevuePhoneListActivity.this.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.batterypermissions.EyevuePhoneListActivity$b */
    public class ViewOnClickListenerC2763b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f18546a;

        public ViewOnClickListenerC2763b(final String val$languageCode) {
            this.f18546a = val$languageCode;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            Intent intent = new Intent(EyevuePhoneListActivity.this, (Class<?>) EyevuePhoneDetailActivity.class);
            intent.putExtra(EyevuePhoneDetailActivity.f18542a, C2531R.string.string_xiaomi);
            if (this.f18546a.contains("zh")) {
                intent.putExtra(EyevuePhoneDetailActivity.f18543b, C2531R.drawable.img_xiaomi);
            } else {
                intent.putExtra(EyevuePhoneDetailActivity.f18543b, C2531R.drawable.img_xiaomi_en);
            }
            EyevuePhoneListActivity.this.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.batterypermissions.EyevuePhoneListActivity$c */
    public class ViewOnClickListenerC2764c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f18548a;

        public ViewOnClickListenerC2764c(final String val$languageCode) {
            this.f18548a = val$languageCode;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            Intent intent = new Intent(EyevuePhoneListActivity.this, (Class<?>) EyevuePhoneDetailActivity.class);
            intent.putExtra(EyevuePhoneDetailActivity.f18542a, C2531R.string.string_oppo_realme_oneplus);
            if (this.f18548a.contains("zh")) {
                intent.putExtra(EyevuePhoneDetailActivity.f18543b, C2531R.drawable.img_oppo);
            } else {
                intent.putExtra(EyevuePhoneDetailActivity.f18543b, C2531R.drawable.img_oppo_en);
            }
            EyevuePhoneListActivity.this.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.batterypermissions.EyevuePhoneListActivity$d */
    public class ViewOnClickListenerC2765d implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f18550a;

        public ViewOnClickListenerC2765d(final String val$languageCode) {
            this.f18550a = val$languageCode;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            Intent intent = new Intent(EyevuePhoneListActivity.this, (Class<?>) EyevuePhoneDetailActivity.class);
            intent.putExtra(EyevuePhoneDetailActivity.f18542a, C2531R.string.string_vivo_iqoo);
            if (this.f18550a.contains("zh")) {
                intent.putExtra(EyevuePhoneDetailActivity.f18543b, C2531R.drawable.img_vivo);
            } else {
                intent.putExtra(EyevuePhoneDetailActivity.f18543b, C2531R.drawable.img_vivo_en);
            }
            EyevuePhoneListActivity.this.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.batterypermissions.EyevuePhoneListActivity$e */
    public class ViewOnClickListenerC2766e implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f18552a;

        public ViewOnClickListenerC2766e(final String val$languageCode) {
            this.f18552a = val$languageCode;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            Intent intent = new Intent(EyevuePhoneListActivity.this, (Class<?>) EyevuePhoneDetailActivity.class);
            intent.putExtra(EyevuePhoneDetailActivity.f18542a, C2531R.string.string_samsung);
            if (this.f18552a.contains("zh")) {
                intent.putExtra(EyevuePhoneDetailActivity.f18543b, C2531R.drawable.img_samsung);
            } else {
                intent.putExtra(EyevuePhoneDetailActivity.f18543b, C2531R.drawable.img_samsung_en);
            }
            EyevuePhoneListActivity.this.startActivity(intent);
        }
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C15567y9 getViewBinding() {
        return C15567y9.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity
    public void initData() {
        super.initData();
        String string = getResources().getConfiguration().locale.toString();
        ((C15567y9) this.binding).f100808b.setTitle(getString(C2531R.string.string_allow_background_tip));
        ((C15567y9) this.binding).f100808b.hideBottomLine();
        ((C15567y9) this.binding).f100809c.setOnClickListener(new ViewOnClickListenerC2762a(string));
        ((C15567y9) this.binding).f100813m.setOnClickListener(new ViewOnClickListenerC2763b(string));
        ((C15567y9) this.binding).f100810d.setOnClickListener(new ViewOnClickListenerC2764c(string));
        ((C15567y9) this.binding).f100812f.setOnClickListener(new ViewOnClickListenerC2765d(string));
        ((C15567y9) this.binding).f100811e.setOnClickListener(new ViewOnClickListenerC2766e(string));
    }
}

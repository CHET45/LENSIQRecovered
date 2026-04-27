package p000;

import android.app.Dialog;
import androidx.fragment.app.FragmentActivity;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public class zq0 extends Dialog {

    /* JADX INFO: renamed from: a */
    public FragmentActivity f105735a;

    /* JADX INFO: renamed from: b */
    public kw3 f105736b;

    /* JADX INFO: renamed from: zq0$a */
    public class C16216a implements kw3 {
        public C16216a() {
        }

        @Override // p000.kw3
        public void onDestroy(@efb g59 owner) {
            super.onDestroy(owner);
            zq0.this.dismiss();
        }
    }

    public zq0(FragmentActivity activity) {
        super(activity, C2531R.style.EarjoyDialog);
        this.f105736b = new C16216a();
        this.f105735a = activity;
        activity.getLifecycle().addObserver(this.f105736b);
    }

    public FragmentActivity getActivity() {
        return this.f105735a;
    }
}

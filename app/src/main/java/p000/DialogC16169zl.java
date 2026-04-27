package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.eyevue.common.C2531R;

/* JADX INFO: renamed from: zl */
/* JADX INFO: loaded from: classes4.dex */
public class DialogC16169zl extends Dialog {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ boolean f105362c = false;

    /* JADX INFO: renamed from: a */
    public final Context f105363a;

    /* JADX INFO: renamed from: b */
    public c f105364b;

    /* JADX INFO: renamed from: zl$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (DialogC16169zl.this.f105364b != null) {
                DialogC16169zl.this.f105364b.onCopy();
            }
            DialogC16169zl.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: zl$b */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (DialogC16169zl.this.f105364b != null) {
                DialogC16169zl.this.f105364b.onDelete();
            }
            DialogC16169zl.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: zl$c */
    public interface c {
        void onCopy();

        void onDelete();
    }

    public DialogC16169zl(Context activity, final c listener) {
        super(activity, C2531R.style.custom_dialog);
        this.f105363a = activity;
        this.f105364b = listener;
        initView();
    }

    private void adjustWindow() {
        Window window = getWindow();
        window.setGravity(80);
        window.getDecorView().setSystemUiVisibility(260);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        window.setAttributes(attributes);
    }

    private void initView() {
        ga4 ga4VarInflate = ga4.inflate(getLayoutInflater());
        setContentView(ga4VarInflate.getRoot());
        ga4VarInflate.f39122b.setOnClickListener(new a());
        ga4VarInflate.f39123c.setOnClickListener(new b());
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adjustWindow();
        setCanceledOnTouchOutside(true);
    }
}

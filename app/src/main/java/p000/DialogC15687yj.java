package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import com.eyevue.common.C2531R;

/* JADX INFO: renamed from: yj */
/* JADX INFO: loaded from: classes4.dex */
public class DialogC15687yj extends Dialog {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ boolean f101762b = false;

    /* JADX INFO: renamed from: a */
    public Context f101763a;

    /* JADX INFO: renamed from: yj$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ c f101764a;

        public a(final c val$listener) {
            this.f101764a = val$listener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            DialogC15687yj.this.dismiss();
            c cVar = this.f101764a;
            if (cVar != null) {
                cVar.onAgree();
            }
        }
    }

    /* JADX INFO: renamed from: yj$b */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ c f101766a;

        public b(final c val$listener) {
            this.f101766a = val$listener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            DialogC15687yj.this.dismiss();
            c cVar = this.f101766a;
            if (cVar != null) {
                cVar.onDisagree();
            }
        }
    }

    /* JADX INFO: renamed from: yj$c */
    public interface c {
        void onAgree();

        void onDisagree();
    }

    public DialogC15687yj(@efb Context context, final c listener) {
        super(context, C2531R.style.custom_dialog);
        this.f101763a = context;
        initView(context, listener);
    }

    private void adjustWindow() {
        Window window = getWindow();
        window.setGravity(17);
        window.getAttributes().width = -1;
        setCancelable(false);
    }

    @igg({"StringFormatInvalid"})
    private void initView(final Context context, c listener) {
        setContentView(C2531R.layout.dialog_ai_permission);
        setCanceledOnTouchOutside(false);
        if (context == null) {
            return;
        }
        Button button = (Button) findViewById(C2531R.id.btn_disagree);
        ((Button) findViewById(C2531R.id.btn_agree)).setOnClickListener(new a(listener));
        button.setOnClickListener(new b(listener));
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adjustWindow();
    }
}

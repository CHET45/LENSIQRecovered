package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.common.C2531R;
import com.google.android.material.timepicker.TimeModel;

/* JADX INFO: renamed from: dm */
/* JADX INFO: loaded from: classes4.dex */
public class DialogC4854dm extends Dialog {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ boolean f30013f = false;

    /* JADX INFO: renamed from: a */
    public final Context f30014a;

    /* JADX INFO: renamed from: b */
    public e f30015b;

    /* JADX INFO: renamed from: c */
    public int f30016c;

    /* JADX INFO: renamed from: d */
    public int f30017d;

    /* JADX INFO: renamed from: e */
    public ia4 f30018e;

    /* JADX INFO: renamed from: dm$a */
    public class a extends twg<Long> {

        /* JADX INFO: renamed from: g */
        public long f30019g = 0;

        public a() {
        }

        @Override // p000.mki
        /* JADX INFO: renamed from: d */
        public int mo9239d() {
            return 24;
        }

        @Override // p000.mki
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public int mo9238c(Long aLong) {
            return aLong.intValue();
        }

        @Override // p000.mki
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public Long mo9240e(int position) {
            return Long.valueOf(this.f30019g + ((long) position));
        }

        @Override // p000.twg
        @igg({"DefaultLocale"})
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public String mo9242k(int position, Long aLong) {
            return String.format(TimeModel.f22867C, aLong);
        }

        @Override // p000.mki
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public void mo9241i(RecyclerView.ViewHolder holder, int position, Long aLong) {
            DialogC4854dm.this.f30016c = aLong.intValue();
        }
    }

    /* JADX INFO: renamed from: dm$b */
    public class b extends twg<Long> {

        /* JADX INFO: renamed from: g */
        public long f30021g = 0;

        public b() {
        }

        @Override // p000.mki
        /* JADX INFO: renamed from: d */
        public int mo9239d() {
            return 60;
        }

        @Override // p000.mki
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public int mo9238c(Long aLong) {
            return aLong.intValue();
        }

        @Override // p000.mki
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public Long mo9240e(int position) {
            return Long.valueOf(this.f30021g + ((long) position));
        }

        @Override // p000.twg
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public String mo9242k(int position, Long aLong) {
            return String.format(TimeModel.f22867C, aLong);
        }

        @Override // p000.mki
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public void mo9241i(RecyclerView.ViewHolder holder, int position, Long aLong) {
            DialogC4854dm.this.f30017d = aLong.intValue();
        }
    }

    /* JADX INFO: renamed from: dm$c */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            DialogC4854dm.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: dm$d */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (DialogC4854dm.this.f30015b != null) {
                DialogC4854dm.this.f30015b.onOk(DialogC4854dm.this.f30016c, DialogC4854dm.this.f30017d);
            }
            DialogC4854dm.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: dm$e */
    public interface e {
        void onOk(int hour, int minute);
    }

    public DialogC4854dm(Context activity, final e listener) {
        super(activity, C2531R.style.custom_dialog);
        this.f30014a = activity;
        this.f30015b = listener;
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
        ia4 ia4VarInflate = ia4.inflate(getLayoutInflater());
        this.f30018e = ia4VarInflate;
        setContentView(ia4VarInflate.getRoot());
        this.f30018e.f46187f.setAdapter(new a());
        this.f30018e.f46188m.setAdapter(new b());
        this.f30018e.f46184c.setOnClickListener(new c());
        this.f30018e.f46185d.setOnClickListener(new d());
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adjustWindow();
        setCanceledOnTouchOutside(true);
    }

    public void setTime(int hour, int minute) {
        this.f30016c = hour;
        this.f30017d = minute;
        this.f30018e.f46187f.scrollToPosition(hour);
        this.f30018e.f46188m.scrollToPosition(minute);
    }
}

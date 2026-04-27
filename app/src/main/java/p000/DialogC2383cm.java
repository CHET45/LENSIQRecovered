package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.eyevue.common.C2531R;
import com.eyevue.common.bean.RepeatBean;
import java.util.Arrays;
import java.util.List;
import p000.C1940bm;

/* JADX INFO: renamed from: cm */
/* JADX INFO: loaded from: classes4.dex */
public class DialogC2383cm extends Dialog {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ boolean f16913c = false;

    /* JADX INFO: renamed from: a */
    public final Context f16914a;

    /* JADX INFO: renamed from: b */
    public b f16915b;

    /* JADX INFO: renamed from: cm$a */
    public class a implements C1940bm.b {
        public a() {
        }

        @Override // p000.C1940bm.b
        public void click(RepeatBean repeatBean) {
            DialogC2383cm.this.dismiss();
            DialogC2383cm.this.f16915b.onOk(repeatBean);
        }
    }

    /* JADX INFO: renamed from: cm$b */
    public interface b {
        void onOk(RepeatBean repeatBean);
    }

    public DialogC2383cm(Context activity, final b listener) {
        super(activity, C2531R.style.custom_dialog);
        this.f16914a = activity;
        this.f16915b = listener;
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
        ha4 ha4VarInflate = ha4.inflate(getLayoutInflater());
        setContentView(ha4VarInflate.getRoot());
        List<RepeatBean> listAsList = Arrays.asList(new RepeatBean(0, getContext().getString(C2531R.string.string_alarm_repeat_type_none)), new RepeatBean(2, getContext().getString(C2531R.string.string_alarm_repeat_type_day)), new RepeatBean(3, getContext().getString(C2531R.string.string_alarm_repeat_type_week)), new RepeatBean(4, getContext().getString(C2531R.string.string_alarm_repeat_type_month)));
        C1940bm c1940bm = new C1940bm(this.f16914a);
        ha4VarInflate.f42997b.setAdapter(c1940bm);
        c1940bm.setData(listAsList);
        ha4VarInflate.f42997b.setLayoutManager(new LinearLayoutManager(this.f16914a, 1, false));
        c1940bm.setOnItemClickListener(new a());
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adjustWindow();
        setCanceledOnTouchOutside(true);
    }
}

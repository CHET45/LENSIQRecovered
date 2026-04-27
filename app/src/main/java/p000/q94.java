package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.eyevue.common.C2531R;
import com.eyevue.common.bean.DeviceSettingBean;
import com.eyevue.glassapp.utils.CustomDividerDecoration;
import java.util.List;
import p000.o94;

/* JADX INFO: loaded from: classes4.dex */
public class q94 extends Dialog {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ boolean f73680d = false;

    /* JADX INFO: renamed from: a */
    public final Context f73681a;

    /* JADX INFO: renamed from: b */
    public InterfaceC11390a f73682b;

    /* JADX INFO: renamed from: c */
    public jc4 f73683c;

    /* JADX INFO: renamed from: q94$a */
    public interface InterfaceC11390a {
        void onValue(int value);
    }

    public q94(Context activity, String title, List<DeviceSettingBean> list, int intValue, final InterfaceC11390a listener) {
        super(activity, C2531R.style.custom_dialog);
        this.f73681a = activity;
        this.f73682b = listener;
        initView(title, list, intValue);
    }

    private void adjustWindow() {
        Window window = getWindow();
        window.setGravity(17);
        window.getDecorView().setSystemUiVisibility(260);
        window.getAttributes().width = (int) (c40.getScreenWidth(this.f73681a) * 0.8f);
    }

    private void initView(String title, List<DeviceSettingBean> list, int intValue) {
        jc4 jc4VarInflate = jc4.inflate(getLayoutInflater());
        this.f73683c = jc4VarInflate;
        setContentView(jc4VarInflate.getRoot());
        this.f73683c.f50288c.setText(title);
        o94 o94Var = new o94(this.f73681a, list, intValue);
        this.f73683c.f50287b.setAdapter(o94Var);
        this.f73683c.f50287b.setLayoutManager(new LinearLayoutManager(this.f73681a, 1, true));
        this.f73683c.f50287b.addItemDecoration(new CustomDividerDecoration(this.f73681a, C2531R.color.color_line, 2));
        o94Var.setOnItemClickListener(new o94.InterfaceC10267c() { // from class: p94
            @Override // p000.o94.InterfaceC10267c
            public final void click(int i) {
                this.f70069a.lambda$initView$0(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(int i) {
        InterfaceC11390a interfaceC11390a = this.f73682b;
        if (interfaceC11390a != null) {
            interfaceC11390a.onValue(i);
        }
        dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adjustWindow();
        setCanceledOnTouchOutside(true);
    }
}

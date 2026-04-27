package p000;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public class ygi extends zq0 {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ boolean f101459d = false;

    /* JADX INFO: renamed from: c */
    public boolean f101460c;

    public ygi(FragmentActivity activity) {
        super(activity);
        initView();
    }

    private void adjustWindow() {
        Window window = getWindow();
        window.setGravity(80);
        window.getDecorView().setSystemUiVisibility(260);
        window.getAttributes().width = -1;
    }

    private void initView() {
        setContentView(C2558R.layout.dialog_voice_mode_list);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C2558R.layout.dialog_waiting);
    }

    @Override // android.app.Dialog
    public void setContentView(@efb View view) {
        super.setContentView(view);
        adjustWindow();
    }
}

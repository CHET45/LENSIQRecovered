package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public class s84 extends Dialog {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ boolean f80928d = false;

    /* JADX INFO: renamed from: a */
    public Context f80929a;

    /* JADX INFO: renamed from: b */
    public InterfaceC12485a f80930b;

    /* JADX INFO: renamed from: c */
    public va4 f80931c;

    /* JADX INFO: renamed from: s84$a */
    public interface InterfaceC12485a {
        void onNext();
    }

    public s84(@efb Context context, InterfaceC12485a listener) {
        super(context, C2531R.style.custom_dialog);
        this.f80930b = listener;
        this.f80929a = context;
    }

    private void adjustWindow() {
        Window window = getWindow();
        window.setGravity(80);
        window.getDecorView().setSystemUiVisibility(260);
        window.getAttributes().width = -1;
    }

    private void initList() {
        this.f80931c.f90460c.setAdapter(new q84(this.f80929a));
        this.f80931c.f90460c.setLayoutManager(new LinearLayoutManager(this.f80929a, 1, false));
    }

    private void initView() {
        Window window = getWindow();
        window.setGravity(80);
        window.setWindowAnimations(C2531R.style.BottomToTopAnim);
        window.getDecorView().setPadding(0, 0, 0, 0);
        va4 va4VarInflate = va4.inflate(getLayoutInflater());
        this.f80931c = va4VarInflate;
        setContentView(va4VarInflate.getRoot());
        this.f80931c.f90459b.setOnClickListener(new View.OnClickListener() { // from class: r84
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77379a.lambda$initView$0(view);
            }
        });
        initList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        adjustWindow();
    }
}

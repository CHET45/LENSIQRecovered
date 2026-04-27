package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.eyevue.common.C2531R;
import com.watchfun.voicenotes.CommonWebViewActivity;

/* JADX INFO: loaded from: classes4.dex */
@e0g(parameters = 0)
public final class ae3 extends Dialog {

    /* JADX INFO: renamed from: c */
    public static final int f1199c = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final C0191a f1200a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final ic4 f1201b;

    /* JADX INFO: renamed from: ae3$a */
    @e0g(parameters = 0)
    public static final class C0191a {

        /* JADX INFO: renamed from: h */
        public static final int f1202h = 8;

        /* JADX INFO: renamed from: a */
        @yfb
        public final Context f1203a;

        /* JADX INFO: renamed from: b */
        @gib
        public String f1204b;

        /* JADX INFO: renamed from: c */
        @gib
        public String f1205c;

        /* JADX INFO: renamed from: d */
        @gib
        public String f1206d;

        /* JADX INFO: renamed from: e */
        @gib
        public String f1207e;

        /* JADX INFO: renamed from: f */
        @gib
        public ny6<bth> f1208f;

        /* JADX INFO: renamed from: g */
        @gib
        public ny6<bth> f1209g;

        public C0191a(@yfb Context context) {
            md8.checkNotNullParameter(context, "context");
            this.f1203a = context;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C0191a setLeftButton$default(C0191a c0191a, String str, ny6 ny6Var, int i, Object obj) {
            if ((i & 2) != 0) {
                ny6Var = null;
            }
            return c0191a.setLeftButton(str, ny6Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C0191a setRightButton$default(C0191a c0191a, String str, ny6 ny6Var, int i, Object obj) {
            if ((i & 2) != 0) {
                ny6Var = null;
            }
            return c0191a.setRightButton(str, ny6Var);
        }

        @yfb
        public final ae3 create() {
            return new ae3(this.f1203a, this);
        }

        @gib
        public final String getContent() {
            return this.f1205c;
        }

        @yfb
        public final Context getContext() {
            return this.f1203a;
        }

        @gib
        public final String getLeftBtnText() {
            return this.f1206d;
        }

        @gib
        public final ny6<bth> getLeftClickListener() {
            return this.f1208f;
        }

        @gib
        public final String getRightBtnText() {
            return this.f1207e;
        }

        @gib
        public final ny6<bth> getRightClickListener() {
            return this.f1209g;
        }

        @gib
        public final String getTitle() {
            return this.f1204b;
        }

        /* JADX INFO: renamed from: setContent, reason: collision with other method in class */
        public final void m27220setContent(@gib String str) {
            this.f1205c = str;
        }

        public final void setLeftBtnText(@gib String str) {
            this.f1206d = str;
        }

        @yfb
        public final C0191a setLeftButton(@yfb String str, @gib ny6<bth> ny6Var) {
            md8.checkNotNullParameter(str, "text");
            this.f1206d = str;
            this.f1208f = ny6Var;
            return this;
        }

        public final void setLeftClickListener(@gib ny6<bth> ny6Var) {
            this.f1208f = ny6Var;
        }

        public final void setRightBtnText(@gib String str) {
            this.f1207e = str;
        }

        @yfb
        public final C0191a setRightButton(@yfb String str, @gib ny6<bth> ny6Var) {
            md8.checkNotNullParameter(str, "text");
            this.f1207e = str;
            this.f1209g = ny6Var;
            return this;
        }

        public final void setRightClickListener(@gib ny6<bth> ny6Var) {
            this.f1209g = ny6Var;
        }

        /* JADX INFO: renamed from: setTitle, reason: collision with other method in class */
        public final void m27221setTitle(@gib String str) {
            this.f1204b = str;
        }

        @yfb
        public final C0191a setContent(@yfb String str) {
            md8.checkNotNullParameter(str, "content");
            this.f1205c = str;
            return this;
        }

        @yfb
        public final C0191a setTitle(@yfb String str) {
            md8.checkNotNullParameter(str, CommonWebViewActivity.f26185L);
            this.f1204b = str;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae3(@yfb Context context, @yfb C0191a c0191a) {
        super(context, C2531R.style.CustomDialogTheme);
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(c0191a, "builder");
        this.f1200a = c0191a;
        ic4 ic4VarInflate = ic4.inflate(LayoutInflater.from(context));
        md8.checkNotNullExpressionValue(ic4VarInflate, "inflate(...)");
        this.f1201b = ic4VarInflate;
    }

    private final void initView() {
        this.f1201b.f46483e.setText(this.f1200a.getTitle());
        this.f1201b.f46481c.setText(this.f1200a.getContent());
        TextView textView = this.f1201b.f46480b;
        textView.setText(this.f1200a.getLeftBtnText());
        textView.setOnClickListener(new View.OnClickListener() { // from class: yd3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ae3.initView$lambda$1$lambda$0(this.f101223a, view);
            }
        });
        TextView textView2 = this.f1201b.f46482d;
        textView2.setText(this.f1200a.getRightBtnText());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: zd3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ae3.initView$lambda$3$lambda$2(this.f104823a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1$lambda$0(ae3 ae3Var, View view) {
        ny6<bth> leftClickListener = ae3Var.f1200a.getLeftClickListener();
        if (leftClickListener != null) {
            leftClickListener.invoke();
        }
        ae3Var.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3$lambda$2(ae3 ae3Var, View view) {
        ny6<bth> rightClickListener = ae3Var.f1200a.getRightClickListener();
        if (rightClickListener != null) {
            rightClickListener.invoke();
        }
        ae3Var.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(@gib Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f1201b.getRoot());
        initView();
        setCanceledOnTouchOutside(false);
    }
}

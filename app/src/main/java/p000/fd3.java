package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
@e0g(parameters = 0)
public final class fd3 extends Dialog {

    /* JADX INFO: renamed from: c */
    public static final int f36158c = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final C5725a f36159a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final cb4 f36160b;

    /* JADX INFO: renamed from: fd3$a */
    @e0g(parameters = 0)
    public static final class C5725a {

        /* JADX INFO: renamed from: b */
        public static final int f36161b = 8;

        /* JADX INFO: renamed from: a */
        @yfb
        public final Context f36162a;

        public C5725a(@yfb Context context) {
            md8.checkNotNullParameter(context, "context");
            this.f36162a = context;
        }

        @yfb
        public final fd3 create() {
            return new fd3(this.f36162a, this);
        }

        @yfb
        public final Context getContext() {
            return this.f36162a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd3(@yfb Context context, @yfb C5725a c5725a) {
        super(context, C2531R.style.CustomDialogTheme);
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(c5725a, "builder");
        this.f36159a = c5725a;
        cb4 cb4VarInflate = cb4.inflate(LayoutInflater.from(context));
        md8.checkNotNullExpressionValue(cb4VarInflate, "inflate(...)");
        this.f36160b = cb4VarInflate;
    }

    @Override // android.app.Dialog
    public void onCreate(@gib Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f36160b.getRoot());
        ComponentCallbacks2C2485a.with(getContext()).asGif().load(Integer.valueOf(C2531R.drawable.ic_loading)).into(this.f36160b.f16171b);
        setCanceledOnTouchOutside(false);
    }
}

package p000;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ol2 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static qy6<? super View, ? extends hl2> f68014a = C10450a.f68015a;

    /* JADX INFO: renamed from: ol2$a */
    public static final class C10450a extends tt8 implements qy6<View, hl2> {

        /* JADX INFO: renamed from: a */
        public static final C10450a f68015a = new C10450a();

        public C10450a() {
            super(1);
        }

        @Override // p000.qy6
        @yfb
        public final hl2 invoke(@yfb View view) {
            return Build.VERSION.SDK_INT >= 34 ? new nl2(view) : new kl2(view);
        }
    }

    @yfb
    public static final hl2 ComposeInputMethodManager(@yfb View view) {
        return f68014a.invoke(view);
    }

    @yfb
    @dpg
    @fdi
    public static final qy6<View, hl2> overrideComposeInputMethodManagerFactoryForTests(@yfb qy6<? super View, ? extends hl2> qy6Var) {
        qy6 qy6Var2 = f68014a;
        f68014a = qy6Var;
        return qy6Var2;
    }
}

package p000;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.emoji2.text.C1035c;

/* JADX INFO: loaded from: classes.dex */
public final class u39 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final String f86724a = "AndroidLegacyPlatformTextInputServiceAdapter";

    /* JADX INFO: renamed from: b */
    @yfb
    public static qy6<? super View, ? extends v38> f86725b = C13351a.f86726a;

    /* JADX INFO: renamed from: u39$a */
    public /* synthetic */ class C13351a extends n07 implements qy6<View, x38> {

        /* JADX INFO: renamed from: a */
        public static final C13351a f86726a = new C13351a();

        public C13351a() {
            super(1, x38.class, "<init>", "<init>(Landroid/view/View;)V", 0);
        }

        @Override // p000.qy6
        @yfb
        public final x38 invoke(@yfb View view) {
            return new x38(view);
        }
    }

    @yfb
    public static final t39 createLegacyPlatformTextInputServiceAdapter() {
        return new C9506mt();
    }

    @yfb
    public static final qy6<View, v38> getInputMethodManagerFactory() {
        return f86725b;
    }

    @fdi
    public static /* synthetic */ void getInputMethodManagerFactory$annotations() {
    }

    public static final void setInputMethodManagerFactory(@yfb qy6<? super View, ? extends v38> qy6Var) {
        f86725b = qy6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWithEmojiCompat(EditorInfo editorInfo) {
        if (C1035c.isConfigured()) {
            C1035c.get().updateEditorInfo(editorInfo);
        }
    }
}

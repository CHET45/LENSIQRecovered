package p000;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public final class yy4 {

    /* JADX INFO: renamed from: a */
    public final C15883b f103320a;

    /* JADX INFO: renamed from: b */
    public int f103321b;

    /* JADX INFO: renamed from: c */
    public int f103322c;

    /* JADX INFO: renamed from: yy4$a */
    @c5e(19)
    public static class C15882a extends C15883b {

        /* JADX INFO: renamed from: a */
        public final EditText f103323a;

        /* JADX INFO: renamed from: b */
        public final iz4 f103324b;

        public C15882a(@efb EditText editText, boolean z) {
            this.f103323a = editText;
            iz4 iz4Var = new iz4(editText, z);
            this.f103324b = iz4Var;
            editText.addTextChangedListener(iz4Var);
            editText.setEditableFactory(zy4.getInstance());
        }

        @Override // p000.yy4.C15883b
        /* JADX INFO: renamed from: a */
        public KeyListener mo26409a(@hib KeyListener keyListener) {
            if (keyListener instanceof ez4) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new ez4(keyListener);
        }

        @Override // p000.yy4.C15883b
        /* JADX INFO: renamed from: b */
        public boolean mo26410b() {
            return this.f103324b.isEnabled();
        }

        @Override // p000.yy4.C15883b
        /* JADX INFO: renamed from: c */
        public InputConnection mo26411c(@efb InputConnection inputConnection, @efb EditorInfo editorInfo) {
            return inputConnection instanceof cz4 ? inputConnection : new cz4(this.f103323a, inputConnection, editorInfo);
        }

        @Override // p000.yy4.C15883b
        /* JADX INFO: renamed from: d */
        public void mo26412d(int i) {
            this.f103324b.m13571d(i);
        }

        @Override // p000.yy4.C15883b
        /* JADX INFO: renamed from: e */
        public void mo26413e(boolean z) {
            this.f103324b.setEnabled(z);
        }

        @Override // p000.yy4.C15883b
        /* JADX INFO: renamed from: f */
        public void mo26414f(int i) {
            this.f103324b.m13572e(i);
        }
    }

    /* JADX INFO: renamed from: yy4$b */
    public static class C15883b {
        @hib
        /* JADX INFO: renamed from: a */
        public KeyListener mo26409a(@hib KeyListener keyListener) {
            return keyListener;
        }

        /* JADX INFO: renamed from: b */
        public boolean mo26410b() {
            return false;
        }

        /* JADX INFO: renamed from: c */
        public InputConnection mo26411c(@efb InputConnection inputConnection, @efb EditorInfo editorInfo) {
            return inputConnection;
        }

        /* JADX INFO: renamed from: d */
        public void mo26412d(int i) {
        }

        /* JADX INFO: renamed from: e */
        public void mo26413e(boolean z) {
        }

        /* JADX INFO: renamed from: f */
        public void mo26414f(int i) {
        }
    }

    public yy4(@efb EditText editText) {
        this(editText, true);
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public int getEmojiReplaceStrategy() {
        return this.f103322c;
    }

    @hib
    public KeyListener getKeyListener(@hib KeyListener keyListener) {
        return this.f103320a.mo26409a(keyListener);
    }

    public int getMaxEmojiCount() {
        return this.f103321b;
    }

    public boolean isEnabled() {
        return this.f103320a.mo26410b();
    }

    @hib
    public InputConnection onCreateInputConnection(@hib InputConnection inputConnection, @efb EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f103320a.mo26411c(inputConnection, editorInfo);
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public void setEmojiReplaceStrategy(int i) {
        this.f103322c = i;
        this.f103320a.mo26412d(i);
    }

    public void setEnabled(boolean z) {
        this.f103320a.mo26413e(z);
    }

    public void setMaxEmojiCount(@h78(from = 0) int i) {
        z7d.checkArgumentNonnegative(i, "maxEmojiCount should be greater than 0");
        this.f103321b = i;
        this.f103320a.mo26414f(i);
    }

    public yy4(@efb EditText editText, boolean z) {
        this.f103321b = Integer.MAX_VALUE;
        this.f103322c = 0;
        z7d.checkNotNull(editText, "editText cannot be null");
        this.f103320a = new C15882a(editText, z);
    }
}

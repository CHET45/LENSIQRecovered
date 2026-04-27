package p000;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.C1035c;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@c5e(19)
@p7e({p7e.EnumC10826a.f69934a})
public final class ez4 implements KeyListener {

    /* JADX INFO: renamed from: a */
    public final KeyListener f34539a;

    /* JADX INFO: renamed from: b */
    public final C5534a f34540b;

    /* JADX INFO: renamed from: ez4$a */
    public static class C5534a {
        public boolean handleKeyDown(@efb Editable editable, int i, @efb KeyEvent keyEvent) {
            return C1035c.handleOnKeyDown(editable, i, keyEvent);
        }
    }

    public ez4(KeyListener keyListener) {
        this(keyListener, new C5534a());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i) {
        this.f34539a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f34539a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f34540b.handleKeyDown(editable, i, keyEvent) || this.f34539a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f34539a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f34539a.onKeyUp(view, editable, i, keyEvent);
    }

    public ez4(KeyListener keyListener, C5534a c5534a) {
        this.f34539a = keyListener;
        this.f34540b = c5534a;
    }
}

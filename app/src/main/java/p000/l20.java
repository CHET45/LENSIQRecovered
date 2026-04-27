package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.C0392R;
import androidx.appcompat.app.AbstractC0428a;
import androidx.appcompat.app.AbstractC0432e;
import p000.AbstractC14467w8;
import p000.lq8;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
public class l20 extends qj2 implements z10 {

    /* JADX INFO: renamed from: d */
    public AbstractC0432e f55949d;

    /* JADX INFO: renamed from: e */
    public final lq8.InterfaceC8938a f55950e;

    public l20(@efb Context context) {
        this(context, 0);
    }

    private static int getThemeResId(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0392R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // p000.qj2, android.app.Dialog
    public void addContentView(@efb View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().addContentView(view, layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public boolean m15251b(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().onDestroy();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return lq8.dispatchKeyEvent(this.f55950e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    @hib
    public <T extends View> T findViewById(@kr7 int i) {
        return (T) getDelegate().findViewById(i);
    }

    @efb
    public AbstractC0432e getDelegate() {
        if (this.f55949d == null) {
            this.f55949d = AbstractC0432e.create(this, this);
        }
        return this.f55949d;
    }

    public AbstractC0428a getSupportActionBar() {
        return getDelegate().getSupportActionBar();
    }

    @Override // android.app.Dialog
    @p7e({p7e.EnumC10826a.f69936c})
    public void invalidateOptionsMenu() {
        getDelegate().invalidateOptionsMenu();
    }

    @Override // p000.qj2, android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().installViewFactory();
        super.onCreate(bundle);
        getDelegate().onCreate(bundle);
    }

    @Override // p000.qj2, android.app.Dialog
    public void onStop() {
        super.onStop();
        getDelegate().onStop();
    }

    @Override // p000.z10
    public void onSupportActionModeFinished(AbstractC14467w8 abstractC14467w8) {
    }

    @Override // p000.z10
    public void onSupportActionModeStarted(AbstractC14467w8 abstractC14467w8) {
    }

    @Override // p000.z10
    @hib
    public AbstractC14467w8 onWindowStartingSupportActionMode(AbstractC14467w8.a aVar) {
        return null;
    }

    @Override // p000.qj2, android.app.Dialog
    public void setContentView(@uw8 int i) {
        getDelegate().setContentView(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().setTitle(charSequence);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().requestWindowFeature(i);
    }

    public l20(@efb Context context, int i) {
        super(context, getThemeResId(context, i));
        this.f55950e = new lq8.InterfaceC8938a() { // from class: k20
            @Override // p000.lq8.InterfaceC8938a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f52398a.m15251b(keyEvent);
            }
        };
        AbstractC0432e delegate = getDelegate();
        delegate.setTheme(getThemeResId(context, i));
        delegate.onCreate(null);
    }

    @Override // p000.qj2, android.app.Dialog
    public void setContentView(@efb View view) {
        getDelegate().setContentView(view);
    }

    @Override // p000.qj2, android.app.Dialog
    public void setContentView(@efb View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().setTitle(getContext().getString(i));
    }

    public l20(@efb Context context, boolean z, @hib DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        this.f55950e = new lq8.InterfaceC8938a() { // from class: k20
            @Override // p000.lq8.InterfaceC8938a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f52398a.m15251b(keyEvent);
            }
        };
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }
}

package p000;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69936c})
public class lq8 {

    /* JADX INFO: renamed from: a */
    public static boolean f58459a;

    /* JADX INFO: renamed from: b */
    public static Method f58460b;

    /* JADX INFO: renamed from: c */
    public static boolean f58461c;

    /* JADX INFO: renamed from: d */
    public static Field f58462d;

    /* JADX INFO: renamed from: lq8$a */
    public interface InterfaceC8938a {
        boolean superDispatchKeyEvent(@efb KeyEvent keyEvent);
    }

    private lq8() {
    }

    private static boolean actionBarOnMenuKeyEventPre28(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f58459a) {
            try {
                f58460b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f58459a = true;
        }
        Method method = f58460b;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(actionBar, keyEvent);
                if (objInvoke == null) {
                    return false;
                }
                return ((Boolean) objInvoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    private static boolean activitySuperDispatchKeyEventPre28(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && actionBarOnMenuKeyEventPre28(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (o8i.m18427b(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    private static boolean dialogSuperDispatchKeyEventPre28(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener dialogKeyListenerPre28 = getDialogKeyListenerPre28(dialog);
        if (dialogKeyListenerPre28 != null && dialogKeyListenerPre28.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (o8i.m18427b(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    public static boolean dispatchBeforeHierarchy(@efb View view, @efb KeyEvent keyEvent) {
        return o8i.m18428c(view, keyEvent);
    }

    @igg({"LambdaLast"})
    public static boolean dispatchKeyEvent(@efb InterfaceC8938a interfaceC8938a, @hib View view, @hib Window.Callback callback, @efb KeyEvent keyEvent) {
        if (interfaceC8938a == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? interfaceC8938a.superDispatchKeyEvent(keyEvent) : callback instanceof Activity ? activitySuperDispatchKeyEventPre28((Activity) callback, keyEvent) : callback instanceof Dialog ? dialogSuperDispatchKeyEventPre28((Dialog) callback, keyEvent) : (view != null && o8i.m18427b(view, keyEvent)) || interfaceC8938a.superDispatchKeyEvent(keyEvent);
    }

    private static DialogInterface.OnKeyListener getDialogKeyListenerPre28(Dialog dialog) {
        if (!f58461c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f58462d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f58461c = true;
        }
        Field field = f58462d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}

package p000;

import android.R;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingComponent;

/* JADX INFO: loaded from: classes3.dex */
public class kf3 {

    /* JADX INFO: renamed from: a */
    public static jf3 f53862a = new DataBinderMapperImpl();

    /* JADX INFO: renamed from: b */
    public static DataBindingComponent f53863b = null;

    private kf3() {
    }

    /* JADX INFO: renamed from: a */
    public static <T extends y8i> T m14706a(DataBindingComponent dataBindingComponent, View view, int i) {
        return (T) f53862a.getDataBinder(dataBindingComponent, view, i);
    }

    /* JADX INFO: renamed from: b */
    public static <T extends y8i> T m14707b(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        return (T) f53862a.getDataBinder(dataBindingComponent, viewArr, i);
    }

    @hib
    public static <T extends y8i> T bind(@efb View view) {
        return (T) bind(view, f53863b);
    }

    private static <T extends y8i> T bindToAddedViews(DataBindingComponent dataBindingComponent, ViewGroup viewGroup, int i, int i2) {
        int childCount = viewGroup.getChildCount();
        int i3 = childCount - i;
        if (i3 == 1) {
            return (T) m14706a(dataBindingComponent, viewGroup.getChildAt(childCount - 1), i2);
        }
        View[] viewArr = new View[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            viewArr[i4] = viewGroup.getChildAt(i4 + i);
        }
        return (T) m14707b(dataBindingComponent, viewArr, i2);
    }

    @hib
    public static String convertBrIdToString(int i) {
        return f53862a.convertBrIdToString(i);
    }

    @hib
    public static <T extends y8i> T findBinding(@efb View view) {
        while (view != null) {
            T t = (T) y8i.m25744m(view);
            if (t != null) {
                return t;
            }
            Object tag = view.getTag();
            if (tag instanceof String) {
                String str = (String) tag;
                if (str.startsWith("layout") && str.endsWith("_0")) {
                    char cCharAt = str.charAt(6);
                    int iIndexOf = str.indexOf(47, 7);
                    if (cCharAt == '/') {
                        if (iIndexOf == -1) {
                            return null;
                        }
                    } else if (cCharAt == '-' && iIndexOf != -1 && str.indexOf(47, iIndexOf + 1) == -1) {
                        return null;
                    }
                }
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    @hib
    public static <T extends y8i> T getBinding(@efb View view) {
        return (T) y8i.m25744m(view);
    }

    @hib
    public static DataBindingComponent getDefaultComponent() {
        return f53863b;
    }

    public static <T extends y8i> T inflate(@efb LayoutInflater layoutInflater, int i, @hib ViewGroup viewGroup, boolean z) {
        return (T) inflate(layoutInflater, i, viewGroup, z, f53863b);
    }

    public static <T extends y8i> T setContentView(@efb Activity activity, int i) {
        return (T) setContentView(activity, i, f53863b);
    }

    public static void setDefaultComponent(@hib DataBindingComponent dataBindingComponent) {
        f53863b = dataBindingComponent;
    }

    @hib
    public static <T extends y8i> T bind(@efb View view, DataBindingComponent dataBindingComponent) {
        T t = (T) getBinding(view);
        if (t != null) {
            return t;
        }
        Object tag = view.getTag();
        if (!(tag instanceof String)) {
            throw new IllegalArgumentException("View is not a binding layout");
        }
        int layoutId = f53862a.getLayoutId((String) tag);
        if (layoutId != 0) {
            return (T) f53862a.getDataBinder(dataBindingComponent, view, layoutId);
        }
        throw new IllegalArgumentException("View is not a binding layout. Tag: " + tag);
    }

    public static <T extends y8i> T inflate(@efb LayoutInflater layoutInflater, int i, @hib ViewGroup viewGroup, boolean z, @hib DataBindingComponent dataBindingComponent) {
        boolean z2 = viewGroup != null && z;
        return z2 ? (T) bindToAddedViews(dataBindingComponent, viewGroup, z2 ? viewGroup.getChildCount() : 0, i) : (T) m14706a(dataBindingComponent, layoutInflater.inflate(i, viewGroup, z), i);
    }

    public static <T extends y8i> T setContentView(@efb Activity activity, int i, @hib DataBindingComponent dataBindingComponent) {
        activity.setContentView(i);
        return (T) bindToAddedViews(dataBindingComponent, (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content), 0, i);
    }
}

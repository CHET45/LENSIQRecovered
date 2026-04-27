package p000;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class pg1 {

    /* JADX INFO: renamed from: pg1$a */
    @c5e(33)
    public static class C10953a {
        private C10953a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static <T> T m19474a(@efb Bundle bundle, @hib String str, @efb Class<T> cls) {
            return (T) bundle.getParcelable(str, cls);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static <T> T[] m19475b(@efb Bundle bundle, @hib String str, @efb Class<T> cls) {
            return (T[]) bundle.getParcelableArray(str, cls);
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static <T> ArrayList<T> m19476c(@efb Bundle bundle, @hib String str, @efb Class<? extends T> cls) {
            return bundle.getParcelableArrayList(str, cls);
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static <T extends Serializable> T m19477d(@efb Bundle bundle, @hib String str, @efb Class<T> cls) {
            return (T) bundle.getSerializable(str, cls);
        }

        @ih4
        /* JADX INFO: renamed from: e */
        public static <T> SparseArray<T> m19478e(@efb Bundle bundle, @hib String str, @efb Class<? extends T> cls) {
            return bundle.getSparseParcelableArray(str, cls);
        }
    }

    private pg1() {
    }

    @hib
    @Deprecated
    public static IBinder getBinder(@efb Bundle bundle, @hib String str) {
        return bundle.getBinder(str);
    }

    @hib
    public static <T> T getParcelable(@efb Bundle bundle, @hib String str, @efb Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) C10953a.m19474a(bundle, str, cls);
        }
        T t = (T) bundle.getParcelable(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    @hib
    @igg({"ArrayReturn", "NullableCollection"})
    public static Parcelable[] getParcelableArray(@efb Bundle bundle, @hib String str, @efb Class<? extends Parcelable> cls) {
        return Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) C10953a.m19475b(bundle, str, cls) : bundle.getParcelableArray(str);
    }

    @hib
    @igg({"ConcreteCollection", "NullableCollection"})
    public static <T> ArrayList<T> getParcelableArrayList(@efb Bundle bundle, @hib String str, @efb Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? C10953a.m19476c(bundle, str, cls) : bundle.getParcelableArrayList(str);
    }

    @hib
    public static <T extends Serializable> T getSerializable(@efb Bundle bundle, @hib String str, @efb Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) C10953a.m19477d(bundle, str, cls);
        }
        T t = (T) bundle.getSerializable(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    @hib
    public static <T> SparseArray<T> getSparseParcelableArray(@efb Bundle bundle, @hib String str, @efb Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? C10953a.m19478e(bundle, str, cls) : bundle.getSparseParcelableArray(str);
    }

    @Deprecated
    public static void putBinder(@efb Bundle bundle, @hib String str, @hib IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}

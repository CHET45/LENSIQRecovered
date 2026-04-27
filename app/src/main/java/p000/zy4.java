package p000;

import android.text.Editable;

/* JADX INFO: loaded from: classes3.dex */
public final class zy4 extends Editable.Factory {

    /* JADX INFO: renamed from: a */
    public static final Object f106433a = new Object();

    /* JADX INFO: renamed from: b */
    @xc7("INSTANCE_LOCK")
    public static volatile Editable.Factory f106434b;

    /* JADX INFO: renamed from: c */
    @hib
    public static Class<?> f106435c;

    @igg({"PrivateApi"})
    private zy4() {
        try {
            f106435c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, zy4.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f106434b == null) {
            synchronized (f106433a) {
                try {
                    if (f106434b == null) {
                        f106434b = new zy4();
                    }
                } finally {
                }
            }
        }
        return f106434b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(@efb CharSequence charSequence) {
        Class<?> cls = f106435c;
        return cls != null ? xwf.create(cls, charSequence) : super.newEditable(charSequence);
    }
}

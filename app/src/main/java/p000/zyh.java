package p000;

import android.os.UserHandle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class zyh {

    /* JADX INFO: renamed from: a */
    @hib
    public static Method f106538a;

    /* JADX INFO: renamed from: b */
    @hib
    public static Constructor<UserHandle> f106539b;

    /* JADX INFO: renamed from: zyh$a */
    @c5e(24)
    public static class C16324a {
        private C16324a() {
        }

        @efb
        /* JADX INFO: renamed from: a */
        public static UserHandle m27158a(int i) {
            return UserHandle.getUserHandleForUid(i);
        }
    }

    private zyh() {
    }

    private static Method getGetUserIdMethod() throws NoSuchMethodException {
        if (f106538a == null) {
            Method declaredMethod = UserHandle.class.getDeclaredMethod("getUserId", Integer.TYPE);
            f106538a = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f106538a;
    }

    private static Constructor<UserHandle> getUserHandleConstructor() throws NoSuchMethodException {
        if (f106539b == null) {
            Constructor<UserHandle> declaredConstructor = UserHandle.class.getDeclaredConstructor(Integer.TYPE);
            f106539b = declaredConstructor;
            declaredConstructor.setAccessible(true);
        }
        return f106539b;
    }

    @efb
    public static UserHandle getUserHandleForUid(int i) {
        return C16324a.m27158a(i);
    }
}

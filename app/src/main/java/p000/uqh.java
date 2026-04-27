package p000;

import android.net.LocalSocketAddress;
import java.lang.reflect.InvocationTargetException;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes7.dex */
@lg5("A stopgap. Not intended to be stabilized")
public final class uqh {

    /* JADX INFO: renamed from: a */
    @eib
    public static final Class<? extends pr9> f88816a = findOkHttp();

    private uqh() {
    }

    private static Class<? extends pr9> findOkHttp() {
        try {
            return Class.forName("g0c").asSubclass(pr9.class);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static pr9<?> forPath(String str, LocalSocketAddress.Namespace namespace) {
        Class<? extends pr9> cls = f88816a;
        if (cls == null) {
            throw new UnsupportedOperationException("OkHttpChannelBuilder not found on the classpath");
        }
        try {
            pr9<?> pr9VarCast = cls.cast(cls.getMethod("forTarget", String.class, eu1.class).invoke(null, "dns:///localhost", n48.create()));
            cls.getMethod("socketFactory", SocketFactory.class).invoke(pr9VarCast, new wqh(str, namespace));
            return pr9VarCast;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to create OkHttpChannelBuilder", e);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("Failed to create OkHttpChannelBuilder", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("Failed to create OkHttpChannelBuilder", e3);
        }
    }
}

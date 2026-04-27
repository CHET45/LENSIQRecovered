package p000;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@yg8
@by4
public class uv5 implements Closeable {

    /* JADX INFO: renamed from: e */
    public static final String f89221e = "com.google.common.base.internal.Finalizer";

    /* JADX INFO: renamed from: a */
    public final ReferenceQueue<Object> f89223a;

    /* JADX INFO: renamed from: b */
    public final PhantomReference<Object> f89224b;

    /* JADX INFO: renamed from: c */
    public final boolean f89225c;

    /* JADX INFO: renamed from: d */
    public static final Logger f89220d = Logger.getLogger(uv5.class.getName());

    /* JADX INFO: renamed from: f */
    public static final Method f89222f = m23600c(loadFinalizer(new C13739d(), new C13736a(), new C13737b()));

    /* JADX INFO: renamed from: uv5$a */
    public static class C13736a implements InterfaceC13738c {

        /* JADX INFO: renamed from: a */
        public static final String f89226a = "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.";

        /* JADX INFO: renamed from: a */
        public URL m23602a() throws IOException {
            String str = uv5.f89221e.replace(a18.f100c, '/') + g12.f38200d;
            URL resource = getClass().getClassLoader().getResource(str);
            if (resource == null) {
                throw new FileNotFoundException(str);
            }
            String string = resource.toString();
            if (string.endsWith(str)) {
                return new URL(resource, string.substring(0, string.length() - str.length()));
            }
            throw new IOException("Unsupported path style: " + string);
        }

        /* JADX INFO: renamed from: b */
        public URLClassLoader m23603b(URL base) {
            return new URLClassLoader(new URL[]{base}, null);
        }

        @Override // p000.uv5.InterfaceC13738c
        @wx1
        public Class<?> loadFinalizer() {
            try {
                return m23603b(m23602a()).loadClass(uv5.f89221e);
            } catch (Exception e) {
                uv5.f89220d.log(Level.WARNING, f89226a, (Throwable) e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: uv5$b */
    public static class C13737b implements InterfaceC13738c {
        @Override // p000.uv5.InterfaceC13738c
        public Class<?> loadFinalizer() {
            try {
                return Class.forName("xv5");
            } catch (ClassNotFoundException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* JADX INFO: renamed from: uv5$c */
    public interface InterfaceC13738c {
        @wx1
        Class<?> loadFinalizer();
    }

    /* JADX INFO: renamed from: uv5$d */
    public static class C13739d implements InterfaceC13738c {

        /* JADX INFO: renamed from: a */
        @gdi
        public static boolean f89227a;

        @Override // p000.uv5.InterfaceC13738c
        @wx1
        public Class<?> loadFinalizer() {
            if (f89227a) {
                return null;
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (systemClassLoader != null) {
                    try {
                        return systemClassLoader.loadClass(uv5.f89221e);
                    } catch (ClassNotFoundException unused) {
                    }
                }
                return null;
            } catch (SecurityException unused2) {
                uv5.f89220d.info("Not allowed to access system class loader.");
                return null;
            }
        }
    }

    public uv5() {
        boolean z;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f89223a = referenceQueue;
        PhantomReference<Object> phantomReference = new PhantomReference<>(this, referenceQueue);
        this.f89224b = phantomReference;
        try {
            f89222f.invoke(null, tv5.class, referenceQueue, phantomReference);
            z = true;
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (Throwable th) {
            f89220d.log(Level.INFO, "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.", th);
            z = false;
        }
        this.f89225c = z;
    }

    /* JADX INFO: renamed from: c */
    public static Method m23600c(Class<?> finalizer) {
        try {
            return finalizer.getMethod("startFinalizer", Class.class, ReferenceQueue.class, PhantomReference.class);
        } catch (NoSuchMethodException e) {
            throw new AssertionError(e);
        }
    }

    private static Class<?> loadFinalizer(InterfaceC13738c... loaders) {
        for (InterfaceC13738c interfaceC13738c : loaders) {
            Class<?> clsLoadFinalizer = interfaceC13738c.loadFinalizer();
            if (clsLoadFinalizer != null) {
                return clsLoadFinalizer;
            }
        }
        throw new AssertionError();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public void m23601b() {
        if (this.f89225c) {
            return;
        }
        while (true) {
            Reference<? extends Object> referencePoll = this.f89223a.poll();
            if (referencePoll == 0) {
                return;
            }
            referencePoll.clear();
            try {
                ((tv5) referencePoll).finalizeReferent();
            } catch (Throwable th) {
                f89220d.log(Level.SEVERE, "Error cleaning up after reference.", th);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f89224b.enqueue();
        m23601b();
    }
}

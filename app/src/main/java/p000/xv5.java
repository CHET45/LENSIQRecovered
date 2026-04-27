package p000;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
public class xv5 implements Runnable {

    /* JADX INFO: renamed from: d */
    public static final Logger f99439d = Logger.getLogger(xv5.class.getName());

    /* JADX INFO: renamed from: e */
    public static final String f99440e = "com.google.common.base.FinalizableReference";

    /* JADX INFO: renamed from: f */
    @wx1
    public static final Constructor<Thread> f99441f;

    /* JADX INFO: renamed from: m */
    @wx1
    public static final Field f99442m;

    /* JADX INFO: renamed from: a */
    public final WeakReference<Class<?>> f99443a;

    /* JADX INFO: renamed from: b */
    public final PhantomReference<Object> f99444b;

    /* JADX INFO: renamed from: c */
    public final ReferenceQueue<Object> f99445c;

    static {
        Constructor<Thread> bigThreadConstructor = getBigThreadConstructor();
        f99441f = bigThreadConstructor;
        f99442m = bigThreadConstructor == null ? getInheritableThreadLocalsField() : null;
    }

    private xv5(Class<?> finalizableReferenceClass, ReferenceQueue<Object> queue, PhantomReference<Object> frqReference) {
        this.f99445c = queue;
        this.f99443a = new WeakReference<>(finalizableReferenceClass);
        this.f99444b = frqReference;
    }

    private boolean cleanUp(Reference<?> firstReference) {
        Reference<? extends Object> referencePoll;
        Method finalizeReferentMethod = getFinalizeReferentMethod();
        if (finalizeReferentMethod == null || !finalizeReference(firstReference, finalizeReferentMethod)) {
            return false;
        }
        do {
            referencePoll = this.f99445c.poll();
            if (referencePoll == null) {
                return true;
            }
        } while (finalizeReference(referencePoll, finalizeReferentMethod));
        return false;
    }

    private boolean finalizeReference(Reference<?> reference, Method finalizeReferentMethod) {
        reference.clear();
        if (reference == this.f99444b) {
            return false;
        }
        try {
            finalizeReferentMethod.invoke(reference, null);
            return true;
        } catch (Throwable th) {
            f99439d.log(Level.SEVERE, "Error cleaning up after reference.", th);
            return true;
        }
    }

    @wx1
    private static Constructor<Thread> getBigThreadConstructor() {
        try {
            return Thread.class.getConstructor(ThreadGroup.class, Runnable.class, String.class, Long.TYPE, Boolean.TYPE);
        } catch (Throwable unused) {
            return null;
        }
    }

    @wx1
    private Method getFinalizeReferentMethod() {
        Class<?> cls = this.f99443a.get();
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod("finalizeReferent", null);
        } catch (NoSuchMethodException e) {
            throw new AssertionError(e);
        }
    }

    @wx1
    private static Field getInheritableThreadLocalsField() {
        try {
            Field declaredField = Thread.class.getDeclaredField("inheritableThreadLocals");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            f99439d.log(Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
            return null;
        }
    }

    public static void startFinalizer(Class<?> finalizableReferenceClass, ReferenceQueue<Object> queue, PhantomReference<Object> frqReference) {
        Thread thread;
        if (!finalizableReferenceClass.getName().equals("tv5")) {
            throw new IllegalArgumentException("Expected com.google.common.base.FinalizableReference.");
        }
        xv5 xv5Var = new xv5(finalizableReferenceClass, queue, frqReference);
        String name = xv5.class.getName();
        Constructor<Thread> constructor = f99441f;
        if (constructor != null) {
            try {
                thread = constructor.newInstance(null, xv5Var, name, 0L, Boolean.FALSE);
            } catch (Throwable th) {
                f99439d.log(Level.INFO, "Failed to create a thread without inherited thread-local values", th);
                thread = null;
            }
        } else {
            thread = null;
        }
        if (thread == null) {
            thread = new Thread(null, xv5Var, name);
        }
        thread.setDaemon(true);
        try {
            Field field = f99442m;
            if (field != null) {
                field.set(thread, null);
            }
        } catch (Throwable th2) {
            f99439d.log(Level.INFO, "Failed to clear thread local values inherited by reference finalizer thread.", th2);
        }
        thread.start();
    }

    @Override // java.lang.Runnable
    public void run() {
        while (cleanUp(this.f99445c.remove())) {
        }
    }
}

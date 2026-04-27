package p000;

import com.google.j2objc.annotations.Weak;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@vx4
public class vcg {

    /* JADX INFO: renamed from: a */
    @Weak
    public r55 f90695a;

    /* JADX INFO: renamed from: b */
    @gdi
    public final Object f90696b;

    /* JADX INFO: renamed from: c */
    public final Method f90697c;

    /* JADX INFO: renamed from: d */
    public final Executor f90698d;

    /* JADX INFO: renamed from: vcg$b */
    @gdi
    public static final class C14002b extends vcg {
        @Override // p000.vcg
        /* JADX INFO: renamed from: d */
        public void mo23921d(Object event) throws InvocationTargetException {
            synchronized (this) {
                super.mo23921d(event);
            }
        }

        private C14002b(r55 bus, Object target, Method method) {
            super(bus, target, method);
        }
    }

    /* JADX INFO: renamed from: b */
    public static vcg m23919b(r55 bus, Object listener, Method method) {
        return isDeclaredThreadSafe(method) ? new vcg(bus, listener, method) : new C14002b(bus, listener, method);
    }

    private adg context(Object event) {
        return new adg(this.f90695a, event, this.f90696b, this.f90697c);
    }

    private static boolean isDeclaredThreadSafe(Method method) {
        return method.getAnnotation(InterfaceC6911hn.class) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispatchEvent$0(Object obj) {
        try {
            mo23921d(obj);
        } catch (InvocationTargetException e) {
            this.f90695a.m21019b(e.getCause(), context(obj));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m23920c(final Object event) {
        this.f90698d.execute(new Runnable() { // from class: ucg
            @Override // java.lang.Runnable
            public final void run() {
                this.f87596a.lambda$dispatchEvent$0(event);
            }
        });
    }

    @gdi
    /* JADX INFO: renamed from: d */
    public void mo23921d(Object event) throws InvocationTargetException {
        try {
            this.f90697c.invoke(this.f90696b, v7d.checkNotNull(event));
        } catch (IllegalAccessException e) {
            throw new Error("Method became inaccessible: " + event, e);
        } catch (IllegalArgumentException e2) {
            throw new Error("Method rejected target/argument: " + event, e2);
        } catch (InvocationTargetException e3) {
            if (!(e3.getCause() instanceof Error)) {
                throw e3;
            }
            throw ((Error) e3.getCause());
        }
    }

    public final boolean equals(@wx1 Object obj) {
        if (!(obj instanceof vcg)) {
            return false;
        }
        vcg vcgVar = (vcg) obj;
        return this.f90696b == vcgVar.f90696b && this.f90697c.equals(vcgVar.f90697c);
    }

    public final int hashCode() {
        return ((this.f90697c.hashCode() + 31) * 31) + System.identityHashCode(this.f90696b);
    }

    private vcg(r55 bus, Object target, Method method) {
        this.f90695a = bus;
        this.f90696b = v7d.checkNotNull(target);
        this.f90697c = method;
        method.setAccessible(true);
        this.f90698d = bus.m21018a();
    }
}

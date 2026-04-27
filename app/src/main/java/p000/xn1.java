package p000;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class xn1 implements no8, Serializable {

    @jjf(version = "1.1")
    public static final Object NO_RECEIVER = C15206a.f98557a;

    @jjf(version = "1.4")
    private final boolean isTopLevel;

    @jjf(version = "1.4")
    private final String name;

    @jjf(version = "1.4")
    private final Class owner;

    @jjf(version = "1.1")
    protected final Object receiver;
    private transient no8 reflected;

    @jjf(version = "1.4")
    private final String signature;

    /* JADX INFO: renamed from: xn1$a */
    @jjf(version = "1.2")
    public static class C15206a implements Serializable {

        /* JADX INFO: renamed from: a */
        public static final C15206a f98557a = new C15206a();

        private C15206a() {
        }

        private Object readResolve() throws ObjectStreamException {
            return f98557a;
        }
    }

    public xn1() {
        this(NO_RECEIVER);
    }

    @Override // p000.no8
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // p000.no8
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    @jjf(version = "1.1")
    public no8 compute() {
        no8 no8Var = this.reflected;
        if (no8Var != null) {
            return no8Var;
        }
        no8 no8VarComputeReflected = computeReflected();
        this.reflected = no8VarComputeReflected;
        return no8VarComputeReflected;
    }

    public abstract no8 computeReflected();

    @Override // p000.mo8
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @jjf(version = "1.1")
    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // p000.no8
    public String getName() {
        return this.name;
    }

    public so8 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? vvd.getOrCreateKotlinPackage(cls) : vvd.getOrCreateKotlinClass(cls);
    }

    @Override // p000.no8
    public List<gp8> getParameters() {
        return getReflected().getParameters();
    }

    @jjf(version = "1.1")
    public no8 getReflected() {
        no8 no8VarCompute = compute();
        if (no8VarCompute != this) {
            return no8VarCompute;
        }
        throw new xs8();
    }

    @Override // p000.no8
    public mp8 getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // p000.no8
    @jjf(version = "1.1")
    public List<op8> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // p000.no8
    @jjf(version = "1.1")
    public sp8 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // p000.no8
    @jjf(version = "1.1")
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // p000.no8
    @jjf(version = "1.1")
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // p000.no8
    @jjf(version = "1.1")
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // p000.no8, p000.to8
    @jjf(version = "1.3")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    @jjf(version = "1.1")
    public xn1(Object obj) {
        this(obj, null, null, null, false);
    }

    @jjf(version = "1.4")
    public xn1(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }
}

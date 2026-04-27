package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class dfg extends ehc<tde> {

    /* JADX INFO: renamed from: f */
    public final List<tde> f29574f;

    /* JADX INFO: renamed from: dfg$a */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC4779a {
        Class<?>[] value();
    }

    public dfg(Class<?> cls, ude udeVar) throws o18 {
        this(udeVar, cls, getAnnotatedClasses(cls));
    }

    public static tde emptySuite() {
        try {
            return new dfg((Class<?>) null, (Class<?>[]) new Class[0]);
        } catch (o18 unused) {
            throw new RuntimeException("This shouldn't be possible");
        }
    }

    private static Class<?>[] getAnnotatedClasses(Class<?> cls) throws o18 {
        InterfaceC4779a interfaceC4779a = (InterfaceC4779a) cls.getAnnotation(InterfaceC4779a.class);
        if (interfaceC4779a != null) {
            return interfaceC4779a.value();
        }
        throw new o18(String.format("class '%s' must have a SuiteClasses annotation", cls.getName()));
    }

    @Override // p000.ehc
    /* JADX INFO: renamed from: h */
    public List<tde> mo9126h() {
        return this.f29574f;
    }

    @Override // p000.ehc
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public j74 mo9125g(tde tdeVar) {
        return tdeVar.getDescription();
    }

    @Override // p000.ehc
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo9127l(tde tdeVar, bde bdeVar) {
        tdeVar.run(bdeVar);
    }

    public dfg(ude udeVar, Class<?>[] clsArr) throws o18 {
        this((Class<?>) null, udeVar.runners((Class<?>) null, clsArr));
    }

    public dfg(Class<?> cls, Class<?>[] clsArr) throws o18 {
        this(new C14677wm(true), cls, clsArr);
    }

    public dfg(ude udeVar, Class<?> cls, Class<?>[] clsArr) throws o18 {
        this(cls, udeVar.runners(cls, clsArr));
    }

    public dfg(Class<?> cls, List<tde> list) throws o18 {
        super(cls);
        this.f29574f = Collections.unmodifiableList(list);
    }
}

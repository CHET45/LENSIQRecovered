package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes8.dex */
public class tv6 extends nw6<tv6> {

    /* JADX INFO: renamed from: a */
    public final Field f86066a;

    public tv6(Field field) {
        if (field == null) {
            throw new NullPointerException("FrameworkField cannot be created without an underlying field.");
        }
        this.f86066a = field;
    }

    @Override // p000.nw6
    /* JADX INFO: renamed from: a */
    public int mo18167a() {
        return this.f86066a.getModifiers();
    }

    public Object get(Object obj) throws IllegalAccessException, IllegalArgumentException {
        return this.f86066a.get(obj);
    }

    @Override // p000.InterfaceC7667iz
    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        return (T) this.f86066a.getAnnotation(cls);
    }

    @Override // p000.InterfaceC7667iz
    public Annotation[] getAnnotations() {
        return this.f86066a.getAnnotations();
    }

    @Override // p000.nw6
    public Class<?> getDeclaringClass() {
        return this.f86066a.getDeclaringClass();
    }

    public Field getField() {
        return this.f86066a;
    }

    @Override // p000.nw6
    public String getName() {
        return getField().getName();
    }

    @Override // p000.nw6
    public Class<?> getType() {
        return this.f86066a.getType();
    }

    public String toString() {
        return this.f86066a.toString();
    }

    @Override // p000.nw6
    public boolean isShadowedBy(tv6 tv6Var) {
        return tv6Var.getName().equals(getName());
    }
}

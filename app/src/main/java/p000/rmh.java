package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@rh5
@dwf({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n1557#2:231\n1628#2,3:232\n37#3:235\n36#3,3:236\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n*L\n116#1:231\n116#1:232,3\n116#1:235\n116#1:236,3\n*E\n"})
public final class rmh implements TypeVariable<GenericDeclaration>, plh {

    /* JADX INFO: renamed from: a */
    @yfb
    public final op8 f78742a;

    public rmh(@yfb op8 op8Var) {
        md8.checkNotNullParameter(op8Var, "typeParameter");
        this.f78742a = op8Var;
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) obj;
            if (md8.areEqual(getName(), typeVariable.getName()) && md8.areEqual(getGenericDeclaration(), typeVariable.getGenericDeclaration())) {
                return true;
            }
        }
        return false;
    }

    @gib
    public final <T extends Annotation> T getAnnotation(@yfb Class<T> cls) {
        md8.checkNotNullParameter(cls, "annotationClass");
        return null;
    }

    @yfb
    public final Annotation[] getAnnotations() {
        return new Annotation[0];
    }

    @Override // java.lang.reflect.TypeVariable
    @yfb
    public Type[] getBounds() {
        List<mp8> upperBounds = this.f78742a.getUpperBounds();
        ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(wnh.computeJavaType((mp8) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @yfb
    public final Annotation[] getDeclaredAnnotations() {
        return new Annotation[0];
    }

    @Override // java.lang.reflect.TypeVariable
    @yfb
    public GenericDeclaration getGenericDeclaration() {
        throw new wfb("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f78742a));
    }

    @Override // java.lang.reflect.TypeVariable
    @yfb
    public String getName() {
        return this.f78742a.getName();
    }

    @Override // java.lang.reflect.Type, p000.plh
    @yfb
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    @yfb
    public String toString() {
        return getTypeName();
    }
}

package p000;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n1#2:231\n1557#3:232\n1628#3,3:233\n1557#3:236\n1628#3,3:237\n1557#3:240\n1628#3,3:241\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n*L\n69#1:232\n69#1:233,3\n71#1:236\n71#1:237,3\n77#1:240\n77#1:241,3\n*E\n"})
public final class wnh {

    /* JADX INFO: renamed from: wnh$a */
    public /* synthetic */ class C14711a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f94879a;

        static {
            int[] iArr = new int[rp8.values().length];
            try {
                iArr[rp8.f78979b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rp8.f78978a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rp8.f78980c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f94879a = iArr;
        }
    }

    /* JADX INFO: renamed from: wnh$b */
    public /* synthetic */ class C14712b extends n07 implements qy6<Class<?>, Class<?>> {

        /* JADX INFO: renamed from: a */
        public static final C14712b f94880a = new C14712b();

        public C14712b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // p000.qy6
        public final Class<?> invoke(Class<?> cls) {
            md8.checkNotNullParameter(cls, "p0");
            return cls.getComponentType();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Type m24675a(mp8 mp8Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return computeJavaType(mp8Var, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @rh5
    public static final Type computeJavaType(mp8 mp8Var, boolean z) {
        ro8 classifier = mp8Var.getClassifier();
        if (classifier instanceof op8) {
            return new rmh((op8) classifier);
        }
        if (!(classifier instanceof oo8)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + mp8Var);
        }
        oo8 oo8Var = (oo8) classifier;
        Class javaObjectType = z ? hn8.getJavaObjectType(oo8Var) : hn8.getJavaClass(oo8Var);
        List<pp8> arguments = mp8Var.getArguments();
        if (arguments.isEmpty()) {
            return javaObjectType;
        }
        if (!javaObjectType.isArray()) {
            return createPossiblyInnerType(javaObjectType, arguments);
        }
        if (javaObjectType.getComponentType().isPrimitive()) {
            return javaObjectType;
        }
        pp8 pp8Var = (pp8) v82.singleOrNull((List) arguments);
        if (pp8Var == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + mp8Var);
        }
        rp8 rp8VarComponent1 = pp8Var.component1();
        mp8 mp8VarComponent2 = pp8Var.component2();
        int i = rp8VarComponent1 == null ? -1 : C14711a.f94879a[rp8VarComponent1.ordinal()];
        if (i == -1 || i == 1) {
            return javaObjectType;
        }
        if (i != 2 && i != 3) {
            throw new ceb();
        }
        md8.checkNotNull(mp8VarComponent2);
        Type typeM24675a = m24675a(mp8VarComponent2, false, 1, null);
        return typeM24675a instanceof Class ? javaObjectType : new y27(typeM24675a);
    }

    @rh5
    private static final Type createPossiblyInnerType(Class<?> cls, List<pp8> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List<pp8> list2 = list;
            ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(getJavaType((pp8) it.next()));
            }
            return new qfc(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List<pp8> list3 = list;
            ArrayList arrayList2 = new ArrayList(m82.collectionSizeOrDefault(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(getJavaType((pp8) it2.next()));
            }
            return new qfc(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeCreatePossiblyInnerType = createPossiblyInnerType(declaringClass, list.subList(length, list.size()));
        List<pp8> listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(m82.collectionSizeOrDefault(listSubList, 10));
        Iterator<T> it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(getJavaType((pp8) it3.next()));
        }
        return new qfc(cls, typeCreatePossiblyInnerType, arrayList3);
    }

    @yfb
    public static final Type getJavaType(@yfb mp8 mp8Var) {
        Type javaType;
        md8.checkNotNullParameter(mp8Var, "<this>");
        return (!(mp8Var instanceof np8) || (javaType = ((np8) mp8Var).getJavaType()) == null) ? m24675a(mp8Var, false, 1, null) : javaType;
    }

    @rh5
    @ip9
    @jjf(version = "1.4")
    public static /* synthetic */ void getJavaType$annotations(mp8 mp8Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String typeToString(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            String name = cls.getName();
            md8.checkNotNullExpressionValue(name, "getName(...)");
            return name;
        }
        vye vyeVarGenerateSequence = ize.generateSequence(type, C14712b.f94880a);
        return ((Class) vze.last(vyeVarGenerateSequence)).getName() + h9g.repeat(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, vze.count(vyeVarGenerateSequence));
    }

    @rh5
    private static /* synthetic */ void getJavaType$annotations(pp8 pp8Var) {
    }

    private static final Type getJavaType(pp8 pp8Var) {
        rp8 variance = pp8Var.getVariance();
        if (variance == null) {
            return jli.f51126c.getSTAR();
        }
        mp8 type = pp8Var.getType();
        md8.checkNotNull(type);
        int i = C14711a.f94879a[variance.ordinal()];
        if (i == 1) {
            return new jli(null, computeJavaType(type, true));
        }
        if (i == 2) {
            return computeJavaType(type, true);
        }
        if (i == 3) {
            return new jli(computeJavaType(type, true), null);
        }
        throw new ceb();
    }
}

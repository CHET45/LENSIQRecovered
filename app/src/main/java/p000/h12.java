package p000;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000.ymh;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,205:1\n1567#2:206\n1598#2,4:207\n1261#2,4:211\n1246#2,4:217\n462#3:215\n412#3:216\n*S KotlinDebug\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n*L\n107#1:206\n107#1:207,4\n155#1:211,4\n163#1:217,4\n163#1:215\n163#1:216\n*E\n"})
public final class h12 implements oo8<Object>, u02 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C6672a f41973b = new C6672a(null);

    /* JADX INFO: renamed from: c */
    @yfb
    public static final Map<Class<? extends uy6<?>>, Integer> f41974c;

    /* JADX INFO: renamed from: d */
    @yfb
    public static final HashMap<String, String> f41975d;

    /* JADX INFO: renamed from: e */
    @yfb
    public static final HashMap<String, String> f41976e;

    /* JADX INFO: renamed from: f */
    @yfb
    public static final HashMap<String, String> f41977f;

    /* JADX INFO: renamed from: m */
    @yfb
    public static final Map<String, String> f41978m;

    /* JADX INFO: renamed from: a */
    @yfb
    public final Class<?> f41979a;

    /* JADX INFO: renamed from: h12$a */
    @dwf({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
    public static final class C6672a {
        public /* synthetic */ C6672a(jt3 jt3Var) {
            this();
        }

        @gib
        public final String getClassQualifiedName(@yfb Class<?> cls) {
            String str;
            md8.checkNotNullParameter(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return null;
            }
            if (!cls.isArray()) {
                String str3 = (String) h12.f41977f.get(cls.getName());
                return str3 == null ? cls.getCanonicalName() : str3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) h12.f41977f.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? u72.f86923a : str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
        
            if (r2 == null) goto L13;
         */
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String getClassSimpleName(@p000.yfb java.lang.Class<?> r7) {
            /*
                r6 = this;
                java.lang.String r0 = "jClass"
                p000.md8.checkNotNullParameter(r7, r0)
                boolean r0 = r7.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto Le
                goto Lb3
            Le:
                boolean r0 = r7.isLocalClass()
                if (r0 == 0) goto L6a
                java.lang.String r0 = r7.getSimpleName()
                java.lang.reflect.Method r2 = r7.getEnclosingMethod()
                r3 = 2
                r4 = 36
                if (r2 == 0) goto L41
                p000.md8.checkNotNull(r0)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r2 = r2.getName()
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                java.lang.String r2 = p000.m9g.substringAfter$default(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L3e
                goto L41
            L3e:
                r1 = r2
                goto Lb3
            L41:
                java.lang.reflect.Constructor r7 = r7.getEnclosingConstructor()
                if (r7 == 0) goto L62
                p000.md8.checkNotNull(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = r7.getName()
                r2.append(r7)
                r2.append(r4)
                java.lang.String r7 = r2.toString()
                java.lang.String r1 = p000.m9g.substringAfter$default(r0, r7, r1, r3, r1)
                goto Lb3
            L62:
                p000.md8.checkNotNull(r0)
                java.lang.String r1 = p000.m9g.substringAfter$default(r0, r4, r1, r3, r1)
                goto Lb3
            L6a:
                boolean r0 = r7.isArray()
                if (r0 == 0) goto L9e
                java.lang.Class r7 = r7.getComponentType()
                boolean r0 = r7.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L9b
                java.util.Map r0 = p000.h12.access$getSimpleNames$cp()
                java.lang.String r7 = r7.getName()
                java.lang.Object r7 = r0.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L9b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                r0.append(r2)
                java.lang.String r1 = r0.toString()
            L9b:
                if (r1 != 0) goto Lb3
                goto L3e
            L9e:
                java.util.Map r0 = p000.h12.access$getSimpleNames$cp()
                java.lang.String r1 = r7.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto Lb3
                java.lang.String r1 = r7.getSimpleName()
            Lb3:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.h12.C6672a.getClassSimpleName(java.lang.Class):java.lang.String");
        }

        public final boolean isInstance(@gib Object obj, @yfb Class<?> cls) {
            md8.checkNotNullParameter(cls, "jClass");
            Map map = h12.f41974c;
            md8.checkNotNull(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(cls);
            if (num != null) {
                return qlh.isFunctionOfArity(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = hn8.getJavaObjectType(hn8.getKotlinClass(cls));
            }
            return cls.isInstance(obj);
        }

        private C6672a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List listListOf = l82.listOf((Object[]) new Class[]{ny6.class, qy6.class, gz6.class, kz6.class, oz6.class, rz6.class, uz6.class, xz6.class, a07.class, d07.class, oy6.class, ry6.class, ty6.class, vy6.class, wy6.class, xy6.class, yy6.class, zy6.class, az6.class, bz6.class, dz6.class, ez6.class, fz6.class});
        ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(listListOf, 10));
        int i = 0;
        for (Object obj : listListOf) {
            int i2 = i + 1;
            if (i < 0) {
                l82.throwIndexOverflow();
            }
            arrayList.add(vkh.m24050to((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f41974c = xt9.toMap(arrayList);
        HashMap<String, String> map = new HashMap<>();
        map.put(ymh.InterfaceC15723b.f102128f, "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put(ymh.InterfaceC15723b.f102125c, "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f41975d = map;
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f41976e = map2;
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        md8.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            md8.checkNotNull(str);
            sb.append(m9g.substringAfterLast$default(str, a18.f100c, (String) null, 2, (Object) null));
            sb.append("CompanionObject");
            scc sccVarM24050to = vkh.m24050to(sb.toString(), str + ".Companion");
            map3.put(sccVarM24050to.getFirst(), sccVarM24050to.getSecond());
        }
        for (Map.Entry<Class<? extends uy6<?>>, Integer> entry : f41974c.entrySet()) {
            map3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f41977f = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(wt9.mapCapacity(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            md8.checkNotNull(str2);
            linkedHashMap.put(key, m9g.substringAfterLast$default(str2, a18.f100c, (String) null, 2, (Object) null));
        }
        f41978m = linkedHashMap;
    }

    public h12(@yfb Class<?> cls) {
        md8.checkNotNullParameter(cls, "jClass");
        this.f41979a = cls;
    }

    private final Void error() {
        throw new xs8();
    }

    @jjf(version = "1.3")
    public static /* synthetic */ void getSealedSubclasses$annotations() {
    }

    @jjf(version = "1.1")
    public static /* synthetic */ void getSupertypes$annotations() {
    }

    @jjf(version = "1.1")
    public static /* synthetic */ void getTypeParameters$annotations() {
    }

    @jjf(version = "1.1")
    public static /* synthetic */ void getVisibility$annotations() {
    }

    @jjf(version = "1.1")
    public static /* synthetic */ void isAbstract$annotations() {
    }

    @jjf(version = "1.1")
    public static /* synthetic */ void isCompanion$annotations() {
    }

    @jjf(version = "1.1")
    public static /* synthetic */ void isData$annotations() {
    }

    @jjf(version = "1.1")
    public static /* synthetic */ void isFinal$annotations() {
    }

    @jjf(version = "1.4")
    public static /* synthetic */ void isFun$annotations() {
    }

    @jjf(version = "1.1")
    public static /* synthetic */ void isInner$annotations() {
    }

    @jjf(version = "1.1")
    public static /* synthetic */ void isOpen$annotations() {
    }

    @jjf(version = "1.1")
    public static /* synthetic */ void isSealed$annotations() {
    }

    @jjf(version = "1.5")
    public static /* synthetic */ void isValue$annotations() {
    }

    @Override // p000.oo8
    public boolean equals(@gib Object obj) {
        return (obj instanceof h12) && md8.areEqual(hn8.getJavaObjectType(this), hn8.getJavaObjectType((oo8) obj));
    }

    @Override // p000.mo8
    @yfb
    public List<Annotation> getAnnotations() {
        error();
        throw new us8();
    }

    @Override // p000.oo8
    @yfb
    public Collection<to8<Object>> getConstructors() {
        error();
        throw new us8();
    }

    @Override // p000.u02
    @yfb
    public Class<?> getJClass() {
        return this.f41979a;
    }

    @Override // p000.oo8, p000.so8
    @yfb
    public Collection<no8<?>> getMembers() {
        error();
        throw new us8();
    }

    @Override // p000.oo8
    @yfb
    public Collection<oo8<?>> getNestedClasses() {
        error();
        throw new us8();
    }

    @Override // p000.oo8
    @gib
    public Object getObjectInstance() {
        error();
        throw new us8();
    }

    @Override // p000.oo8
    @gib
    public String getQualifiedName() {
        return f41973b.getClassQualifiedName(getJClass());
    }

    @Override // p000.oo8
    @yfb
    public List<oo8<? extends Object>> getSealedSubclasses() {
        error();
        throw new us8();
    }

    @Override // p000.oo8
    @gib
    public String getSimpleName() {
        return f41973b.getClassSimpleName(getJClass());
    }

    @Override // p000.oo8
    @yfb
    public List<mp8> getSupertypes() {
        error();
        throw new us8();
    }

    @Override // p000.oo8
    @yfb
    public List<op8> getTypeParameters() {
        error();
        throw new us8();
    }

    @Override // p000.oo8
    @gib
    public sp8 getVisibility() {
        error();
        throw new us8();
    }

    @Override // p000.oo8
    public int hashCode() {
        return hn8.getJavaObjectType(this).hashCode();
    }

    @Override // p000.oo8
    public boolean isAbstract() {
        error();
        throw new us8();
    }

    @Override // p000.oo8
    public boolean isCompanion() {
        error();
        throw new us8();
    }

    @Override // p000.oo8
    public boolean isData() {
        error();
        throw new us8();
    }

    @Override // p000.oo8
    public boolean isFinal() {
        error();
        throw new us8();
    }

    @Override // p000.oo8
    public boolean isFun() {
        error();
        throw new us8();
    }

    @Override // p000.oo8
    public boolean isInner() {
        error();
        throw new us8();
    }

    @Override // p000.oo8
    @jjf(version = "1.1")
    public boolean isInstance(@gib Object obj) {
        return f41973b.isInstance(obj, getJClass());
    }

    @Override // p000.oo8
    public boolean isOpen() {
        error();
        throw new us8();
    }

    @Override // p000.oo8
    public boolean isSealed() {
        error();
        throw new us8();
    }

    @Override // p000.oo8
    public boolean isValue() {
        error();
        throw new us8();
    }

    @yfb
    public String toString() {
        return getJClass() + vvd.f92391b;
    }
}

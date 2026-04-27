package p000;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/* JADX INFO: loaded from: classes7.dex */
public class npg implements pog {

    /* JADX INFO: renamed from: a */
    public String f65231a;

    /* JADX INFO: renamed from: b */
    public Vector<pog> f65232b;

    /* JADX INFO: renamed from: npg$a */
    public static class C9979a extends qog {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f65233b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9979a(String str, String str2) {
            super(str);
            this.f65233b = str2;
        }

        @Override // p000.qog
        /* JADX INFO: renamed from: b */
        public void mo18061b() {
            qog.fail(this.f65233b);
        }
    }

    public npg() {
        this.f65232b = new Vector<>(10);
    }

    private void addTestMethod(Method method, List<String> list, Class<?> cls) {
        String name = method.getName();
        if (list.contains(name)) {
            return;
        }
        if (isPublicTestMethod(method)) {
            list.add(name);
            addTest(createTest(cls, name));
        } else if (isTestMethod(method)) {
            addTest(warning("Test method isn't public: " + method.getName() + c0b.f15433c + cls.getCanonicalName() + c0b.f15434d));
        }
    }

    private void addTestsFromTestCase(Class<?> cls) {
        this.f65231a = cls.getName();
        try {
            getTestConstructor(cls);
            if (!Modifier.isPublic(cls.getModifiers())) {
                addTest(warning("Class " + cls.getName() + " is not public"));
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Class<?> superclass = cls; pog.class.isAssignableFrom(superclass); superclass = superclass.getSuperclass()) {
                for (Method method : xua.getDeclaredMethods(superclass)) {
                    addTestMethod(method, arrayList, cls);
                }
            }
            if (this.f65232b.size() == 0) {
                addTest(warning("No tests found in " + cls.getName()));
            }
        } catch (NoSuchMethodException unused) {
            addTest(warning("Class " + cls.getName() + " has no public constructor TestCase(String name) or TestCase()"));
        }
    }

    public static pog createTest(Class<?> cls, String str) {
        Object objNewInstance;
        try {
            Constructor<?> testConstructor = getTestConstructor(cls);
            try {
                if (testConstructor.getParameterTypes().length == 0) {
                    objNewInstance = testConstructor.newInstance(null);
                    if (objNewInstance instanceof qog) {
                        ((qog) objNewInstance).setName(str);
                    }
                } else {
                    objNewInstance = testConstructor.newInstance(str);
                }
                return (pog) objNewInstance;
            } catch (IllegalAccessException e) {
                return warning("Cannot access test case: " + str + " (" + exceptionToString(e) + c0b.f15434d);
            } catch (InstantiationException e2) {
                return warning("Cannot instantiate test case: " + str + " (" + exceptionToString(e2) + c0b.f15434d);
            } catch (InvocationTargetException e3) {
                return warning("Exception in constructor: " + str + " (" + exceptionToString(e3.getTargetException()) + c0b.f15434d);
            }
        } catch (NoSuchMethodException unused) {
            return warning("Class " + cls.getName() + " has no public constructor TestCase(String name) or TestCase()");
        }
    }

    private static String exceptionToString(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static Constructor<?> getTestConstructor(Class<?> cls) throws NoSuchMethodException {
        try {
            return cls.getConstructor(String.class);
        } catch (NoSuchMethodException unused) {
            return cls.getConstructor(null);
        }
    }

    private boolean isPublicTestMethod(Method method) {
        return isTestMethod(method) && Modifier.isPublic(method.getModifiers());
    }

    private boolean isTestMethod(Method method) {
        return method.getParameterTypes().length == 0 && method.getName().startsWith("test") && method.getReturnType().equals(Void.TYPE);
    }

    private pog testCaseForClass(Class<?> cls) {
        if (qog.class.isAssignableFrom(cls)) {
            return new npg(cls.asSubclass(qog.class));
        }
        return warning(cls.getCanonicalName() + " does not extend TestCase");
    }

    public static pog warning(String str) {
        return new C9979a("warning", str);
    }

    public void addTest(pog pogVar) {
        this.f65232b.add(pogVar);
    }

    public void addTestSuite(Class<? extends qog> cls) {
        addTest(new npg(cls));
    }

    @Override // p000.pog
    public int countTestCases() {
        Iterator<pog> it = this.f65232b.iterator();
        int iCountTestCases = 0;
        while (it.hasNext()) {
            iCountTestCases += it.next().countTestCases();
        }
        return iCountTestCases;
    }

    public String getName() {
        return this.f65231a;
    }

    @Override // p000.pog
    public void run(epg epgVar) {
        for (pog pogVar : this.f65232b) {
            if (epgVar.shouldStop()) {
                return;
            } else {
                runTest(pogVar, epgVar);
            }
        }
    }

    public void runTest(pog pogVar, epg epgVar) {
        pogVar.run(epgVar);
    }

    public void setName(String str) {
        this.f65231a = str;
    }

    public pog testAt(int i) {
        return this.f65232b.get(i);
    }

    public int testCount() {
        return this.f65232b.size();
    }

    public Enumeration<pog> tests() {
        return this.f65232b.elements();
    }

    public String toString() {
        return getName() != null ? getName() : super.toString();
    }

    public npg(Class<?> cls) {
        this.f65232b = new Vector<>(10);
        addTestsFromTestCase(cls);
    }

    public npg(Class<? extends qog> cls, String str) {
        this(cls);
        setName(str);
    }

    public npg(String str) {
        this.f65232b = new Vector<>(10);
        setName(str);
    }

    public npg(Class<?>... clsArr) {
        this.f65232b = new Vector<>(10);
        for (Class<?> cls : clsArr) {
            addTest(testCaseForClass(cls));
        }
    }

    public npg(Class<? extends qog>[] clsArr, String str) {
        this(clsArr);
        setName(str);
    }
}

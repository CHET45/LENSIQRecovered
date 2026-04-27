package p000;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public class j74 implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a */
    public final Collection<j74> f49693a;

    /* JADX INFO: renamed from: b */
    public final String f49694b;

    /* JADX INFO: renamed from: c */
    public final Serializable f49695c;

    /* JADX INFO: renamed from: d */
    public final Annotation[] f49696d;

    /* JADX INFO: renamed from: e */
    public volatile Class<?> f49697e;

    /* JADX INFO: renamed from: f */
    public static final Pattern f49691f = Pattern.compile("([\\s\\S]*)\\((.*)\\)");

    /* JADX INFO: renamed from: m */
    public static final j74 f49692m = new j74(null, "No Tests", new Annotation[0]);

    /* JADX INFO: renamed from: C */
    public static final j74 f49690C = new j74(null, "Test mechanism", new Annotation[0]);

    private j74(Class<?> cls, String str, Annotation... annotationArr) {
        this(cls, str, str, annotationArr);
    }

    public static j74 createSuiteDescription(String str, Annotation... annotationArr) {
        return new j74(null, str, annotationArr);
    }

    public static j74 createTestDescription(String str, String str2, Annotation... annotationArr) {
        return new j74(null, formatDisplayName(str2, str), annotationArr);
    }

    private static String formatDisplayName(String str, String str2) {
        return String.format("%s(%s)", str, str2);
    }

    private String methodAndClassNamePatternGroupOrDefault(int i, String str) {
        Matcher matcher = f49691f.matcher(toString());
        return matcher.matches() ? matcher.group(i) : str;
    }

    public void addChild(j74 j74Var) {
        this.f49693a.add(j74Var);
    }

    public j74 childlessCopy() {
        return new j74(this.f49697e, this.f49694b, this.f49696d);
    }

    public boolean equals(Object obj) {
        if (obj instanceof j74) {
            return this.f49695c.equals(((j74) obj).f49695c);
        }
        return false;
    }

    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        for (Annotation annotation : this.f49696d) {
            if (annotation.annotationType().equals(cls)) {
                return cls.cast(annotation);
            }
        }
        return null;
    }

    public Collection<Annotation> getAnnotations() {
        return Arrays.asList(this.f49696d);
    }

    public ArrayList<j74> getChildren() {
        return new ArrayList<>(this.f49693a);
    }

    public String getClassName() {
        return this.f49697e != null ? this.f49697e.getName() : methodAndClassNamePatternGroupOrDefault(2, toString());
    }

    public String getDisplayName() {
        return this.f49694b;
    }

    public String getMethodName() {
        return methodAndClassNamePatternGroupOrDefault(1, null);
    }

    public Class<?> getTestClass() {
        if (this.f49697e != null) {
            return this.f49697e;
        }
        String className = getClassName();
        if (className == null) {
            return null;
        }
        try {
            this.f49697e = Class.forName(className, false, getClass().getClassLoader());
            return this.f49697e;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public int hashCode() {
        return this.f49695c.hashCode();
    }

    public boolean isEmpty() {
        return equals(f49692m);
    }

    public boolean isSuite() {
        return !isTest();
    }

    public boolean isTest() {
        return this.f49693a.isEmpty();
    }

    public int testCount() {
        if (isTest()) {
            return 1;
        }
        Iterator<j74> it = this.f49693a.iterator();
        int iTestCount = 0;
        while (it.hasNext()) {
            iTestCount += it.next().testCount();
        }
        return iTestCount;
    }

    public String toString() {
        return getDisplayName();
    }

    private j74(Class<?> cls, String str, Serializable serializable, Annotation... annotationArr) {
        this.f49693a = new ConcurrentLinkedQueue();
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("The display name must not be empty.");
        }
        if (serializable == null) {
            throw new IllegalArgumentException("The unique id must not be null.");
        }
        this.f49697e = cls;
        this.f49694b = str;
        this.f49695c = serializable;
        this.f49696d = annotationArr;
    }

    public static j74 createSuiteDescription(String str, Serializable serializable, Annotation... annotationArr) {
        return new j74(null, str, serializable, annotationArr);
    }

    public static j74 createTestDescription(Class<?> cls, String str, Annotation... annotationArr) {
        return new j74(cls, formatDisplayName(str, cls.getName()), annotationArr);
    }

    public static j74 createSuiteDescription(Class<?> cls) {
        return new j74(cls, cls.getName(), cls.getAnnotations());
    }

    public static j74 createTestDescription(Class<?> cls, String str) {
        return new j74(cls, formatDisplayName(str, cls.getName()), new Annotation[0]);
    }

    public static j74 createTestDescription(String str, String str2, Serializable serializable) {
        return new j74(null, formatDisplayName(str2, str), serializable, new Annotation[0]);
    }
}

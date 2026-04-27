package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes7.dex */
public abstract class qog extends p80 implements pog {

    /* JADX INFO: renamed from: a */
    public String f75057a;

    public qog() {
        this.f75057a = null;
    }

    public static void assertEquals(String str, Object obj, Object obj2) {
        p80.assertEquals(str, obj, obj2);
    }

    public static void assertFalse(String str, boolean z) {
        p80.assertFalse(str, z);
    }

    public static void assertNotNull(Object obj) {
        p80.assertNotNull(obj);
    }

    public static void assertNotSame(String str, Object obj, Object obj2) {
        p80.assertNotSame(str, obj, obj2);
    }

    public static void assertNull(Object obj) {
        p80.assertNull(obj);
    }

    public static void assertSame(String str, Object obj, Object obj2) {
        p80.assertSame(str, obj, obj2);
    }

    public static void assertTrue(String str, boolean z) {
        p80.assertTrue(str, z);
    }

    public static void fail(String str) {
        p80.fail(str);
    }

    public static void failNotEquals(String str, Object obj, Object obj2) {
        p80.failNotEquals(str, obj, obj2);
    }

    public static void failNotSame(String str, Object obj, Object obj2) {
        p80.failNotSame(str, obj, obj2);
    }

    public static void failSame(String str) {
        p80.failSame(str);
    }

    public static String format(String str, Object obj, Object obj2) {
        return p80.format(str, obj, obj2);
    }

    /* JADX INFO: renamed from: a */
    public epg m20472a() {
        return new epg();
    }

    /* JADX INFO: renamed from: b */
    public void mo18061b() throws Throwable {
        Method method;
        assertNotNull("TestCase.fName cannot be null", this.f75057a);
        try {
            method = getClass().getMethod(this.f75057a, null);
        } catch (NoSuchMethodException unused) {
            fail("Method \"" + this.f75057a + "\" not found");
            method = null;
        }
        if (!Modifier.isPublic(method.getModifiers())) {
            fail("Method \"" + this.f75057a + "\" should be public");
        }
        try {
            method.invoke(this, null);
        } catch (IllegalAccessException e) {
            e.fillInStackTrace();
            throw e;
        } catch (InvocationTargetException e2) {
            e2.fillInStackTrace();
            throw e2.getTargetException();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m20473c() throws Exception {
    }

    @Override // p000.pog
    public int countTestCases() {
        return 1;
    }

    /* JADX INFO: renamed from: d */
    public void m20474d() throws Exception {
    }

    public String getName() {
        return this.f75057a;
    }

    public epg run() {
        epg epgVarM20472a = m20472a();
        run(epgVarM20472a);
        return epgVarM20472a;
    }

    public void runBare() throws Throwable {
        m20473c();
        try {
            mo18061b();
            try {
                m20474d();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                m20474d();
            } catch (Throwable unused) {
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public void setName(String str) {
        this.f75057a = str;
    }

    public String toString() {
        return getName() + c0b.f15433c + getClass().getName() + c0b.f15434d;
    }

    public static void assertEquals(Object obj, Object obj2) {
        p80.assertEquals(obj, obj2);
    }

    public static void assertFalse(boolean z) {
        p80.assertFalse(z);
    }

    public static void assertNotNull(String str, Object obj) {
        p80.assertNotNull(str, obj);
    }

    public static void assertNotSame(Object obj, Object obj2) {
        p80.assertNotSame(obj, obj2);
    }

    public static void assertNull(String str, Object obj) {
        p80.assertNull(str, obj);
    }

    public static void assertSame(Object obj, Object obj2) {
        p80.assertSame(obj, obj2);
    }

    public static void assertTrue(boolean z) {
        p80.assertTrue(z);
    }

    public static void fail() {
        p80.fail();
    }

    public qog(String str) {
        this.f75057a = str;
    }

    public static void assertEquals(String str, String str2, String str3) {
        p80.assertEquals(str, str2, str3);
    }

    @Override // p000.pog
    public void run(epg epgVar) {
        epgVar.m10185a(this);
    }

    public static void assertEquals(String str, String str2) {
        p80.assertEquals(str, str2);
    }

    public static void assertEquals(String str, double d, double d2, double d3) {
        p80.assertEquals(str, d, d2, d3);
    }

    public static void assertEquals(double d, double d2, double d3) {
        p80.assertEquals(d, d2, d3);
    }

    public static void assertEquals(String str, float f, float f2, float f3) {
        p80.assertEquals(str, f, f2, f3);
    }

    public static void assertEquals(float f, float f2, float f3) {
        p80.assertEquals(f, f2, f3);
    }

    public static void assertEquals(String str, long j, long j2) {
        p80.assertEquals(str, j, j2);
    }

    public static void assertEquals(long j, long j2) {
        p80.assertEquals(j, j2);
    }

    public static void assertEquals(String str, boolean z, boolean z2) {
        p80.assertEquals(str, z, z2);
    }

    public static void assertEquals(boolean z, boolean z2) {
        p80.assertEquals(z, z2);
    }

    public static void assertEquals(String str, byte b, byte b2) {
        p80.assertEquals(str, b, b2);
    }

    public static void assertEquals(byte b, byte b2) {
        p80.assertEquals(b, b2);
    }

    public static void assertEquals(String str, char c, char c2) {
        p80.assertEquals(str, c, c2);
    }

    public static void assertEquals(char c, char c2) {
        p80.assertEquals(c, c2);
    }

    public static void assertEquals(String str, short s, short s2) {
        p80.assertEquals(str, s, s2);
    }

    public static void assertEquals(short s, short s2) {
        p80.assertEquals(s, s2);
    }

    public static void assertEquals(String str, int i, int i2) {
        p80.assertEquals(str, i, i2);
    }

    public static void assertEquals(int i, int i2) {
        p80.assertEquals(i, i2);
    }
}

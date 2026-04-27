package p000;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class f1f {

    /* JADX INFO: renamed from: d */
    public static final f1f f34712d = new f1f();

    /* JADX INFO: renamed from: a */
    public final qr7<lkb> f34713a;

    /* JADX INFO: renamed from: b */
    public String f34714b = fh8.f36584c;

    /* JADX INFO: renamed from: c */
    public igd f34715c;

    public f1f() {
        qr7<lkb> qr7Var = new qr7<>(1024);
        this.f34713a = qr7Var;
        qr7Var.put(Boolean.class, ua1.f87249a);
        zva zvaVar = zva.f106146a;
        qr7Var.put(Character.class, zvaVar);
        qr7Var.put(Byte.class, b88.f12963a);
        qr7Var.put(Short.class, b88.f12963a);
        qr7Var.put(Integer.class, b88.f12963a);
        qr7Var.put(Long.class, b88.f12963a);
        xib xibVar = xib.f98087b;
        qr7Var.put(Float.class, xibVar);
        qr7Var.put(Double.class, xibVar);
        qr7Var.put(Number.class, xibVar);
        q11 q11Var = q11.f72739a;
        qr7Var.put(BigDecimal.class, q11Var);
        qr7Var.put(BigInteger.class, q11Var);
        qr7Var.put(String.class, k7g.f52747a);
        qr7Var.put(Object[].class, u50.f86828a);
        qr7Var.put(Class.class, zvaVar);
        qr7Var.put(SimpleDateFormat.class, zvaVar);
        qr7Var.put(Locale.class, zvaVar);
        qr7Var.put(Currency.class, zvaVar);
        qr7Var.put(TimeZone.class, zvaVar);
        qr7Var.put(UUID.class, zvaVar);
        qr7Var.put(URI.class, zvaVar);
        qr7Var.put(URL.class, zvaVar);
        qr7Var.put(Pattern.class, zvaVar);
        qr7Var.put(Charset.class, zvaVar);
    }

    public static final f1f getGlobalInstance() {
        return f34712d;
    }

    public lkb get(Class<?> cls) {
        Class<? super Object> superclass;
        boolean z = true;
        lkb lkbVar = this.f34713a.get(cls);
        if (lkbVar != null) {
            return lkbVar;
        }
        if (Map.class.isAssignableFrom(cls)) {
            this.f34713a.put(cls, new kt9());
        } else if (List.class.isAssignableFrom(cls)) {
            this.f34713a.put(cls, new r99());
        } else if (Collection.class.isAssignableFrom(cls)) {
            this.f34713a.put(cls, t72.f83919a);
        } else if (Date.class.isAssignableFrom(cls)) {
            this.f34713a.put(cls, cj3.f16683a);
        } else if (hh8.class.isAssignableFrom(cls) || oh8.class.isAssignableFrom(cls) || qh8.class.isAssignableFrom(cls)) {
            this.f34713a.put(cls, zva.f106146a);
        } else if (cls.isEnum() || !((superclass = cls.getSuperclass()) == null || superclass == Object.class || !superclass.isEnum())) {
            this.f34713a.put(cls, new g45());
        } else if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            this.f34713a.put(cls, new f70(componentType, get(componentType)));
        } else if (Throwable.class.isAssignableFrom(cls)) {
            pi8 pi8Var = new pi8(cls, this.f34715c);
            pi8Var.f70934c |= a2f.WriteClassName.f216a;
            this.f34713a.put(cls, pi8Var);
        } else if (TimeZone.class.isAssignableFrom(cls) || Charset.class.isAssignableFrom(cls) || Enumeration.class.isAssignableFrom(cls)) {
            this.f34713a.put(cls, zva.f106146a);
        } else if (Calendar.class.isAssignableFrom(cls)) {
            this.f34713a.put(cls, cj3.f16683a);
        } else {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            boolean z2 = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                Class<?> cls2 = interfaces[i];
                if (cls2.getName().equals("net.sf.cglib.proxy.Factory") || cls2.getName().equals("org.springframework.cglib.proxy.Factory")) {
                    break;
                }
                if (cls2.getName().equals("javassist.util.proxy.ProxyObject")) {
                    z2 = true;
                    z = false;
                    break;
                }
                i++;
            }
            if (z || z2) {
                lkb lkbVar2 = get(cls.getSuperclass());
                this.f34713a.put(cls, lkbVar2);
                return lkbVar2;
            }
            this.f34713a.put(cls, new pi8(cls, this.f34715c));
        }
        return this.f34713a.get(cls);
    }

    public String getTypeKey() {
        return this.f34714b;
    }

    public boolean put(Type type, lkb lkbVar) {
        return this.f34713a.put(type, lkbVar);
    }

    public lkb registerIfNotExists(Class<?> cls) {
        return registerIfNotExists(cls, cls.getModifiers(), false, true, true, true);
    }

    public void setTypeKey(String str) {
        this.f34714b = str;
    }

    public lkb registerIfNotExists(Class<?> cls, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        lkb lkbVar = this.f34713a.get(cls);
        if (lkbVar != null) {
            return lkbVar;
        }
        pi8 pi8Var = new pi8(cls, i, null, z, z2, z3, z4, this.f34715c);
        this.f34713a.put(cls, pi8Var);
        return pi8Var;
    }
}

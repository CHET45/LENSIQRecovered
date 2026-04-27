package p000;

import java.io.IOException;
import java.lang.reflect.Member;
import java.util.Collection;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes3.dex */
public final class yr5 implements Comparable<yr5> {

    /* JADX INFO: renamed from: a */
    public final kr5 f102749a;

    /* JADX INFO: renamed from: b */
    public final boolean f102750b;

    /* JADX INFO: renamed from: c */
    public final int f102751c;

    /* JADX INFO: renamed from: d */
    public final String f102752d;

    /* JADX INFO: renamed from: e */
    public C15777a f102753e;

    /* JADX INFO: renamed from: yr5$a */
    public static class C15777a {

        /* JADX INFO: renamed from: a */
        public lkb f102754a;

        /* JADX INFO: renamed from: b */
        public Class<?> f102755b;

        public C15777a(lkb lkbVar, Class<?> cls) {
            this.f102754a = lkbVar;
            this.f102755b = cls;
        }
    }

    public yr5(kr5 kr5Var) {
        this.f102749a = kr5Var;
        kh8 annotation = kr5Var.getAnnotation();
        boolean z = false;
        if (annotation != null) {
            boolean z2 = false;
            for (a2f a2fVar : annotation.serialzeFeatures()) {
                if (a2fVar == a2f.WriteMapNullValue) {
                    z2 = true;
                }
            }
            String strTrim = annotation.format().trim();
            str = strTrim.length() != 0 ? strTrim : null;
            this.f102751c = a2f.m60of(annotation.serialzeFeatures());
            z = z2;
        } else {
            this.f102751c = 0;
        }
        this.f102750b = z;
        this.f102752d = str;
    }

    public Object getPropertyValue(Object obj) throws Exception {
        try {
            return this.f102749a.get(obj);
        } catch (Exception e) {
            kr5 kr5Var = this.f102749a;
            Member member = kr5Var.f55105b;
            if (member == null) {
                member = kr5Var.f55106c;
            }
            throw new jh8("get property error。 " + (member.getDeclaringClass().getName() + "." + member.getName()), e);
        }
    }

    public void writePrefix(ph8 ph8Var) throws IOException {
        i1f i1fVar = ph8Var.f70792b;
        int i = i1fVar.f45448c;
        if ((a2f.QuoteFieldNames.f216a & i) == 0) {
            i1fVar.writeFieldName(this.f102749a.f55104a, true);
        } else if ((i & a2f.UseSingleQuotes.f216a) != 0) {
            i1fVar.writeFieldName(this.f102749a.f55104a, true);
        } else {
            char[] cArr = this.f102749a.f55101N;
            i1fVar.write(cArr, 0, cArr.length);
        }
    }

    public void writeValue(ph8 ph8Var, Object obj) throws Exception {
        String str = this.f102752d;
        if (str != null) {
            ph8Var.writeWithFormat(obj, str);
            return;
        }
        if (this.f102753e == null) {
            Class<?> cls = obj == null ? this.f102749a.f55110m : obj.getClass();
            this.f102753e = new C15777a(ph8Var.f70791a.get(cls), cls);
        }
        C15777a c15777a = this.f102753e;
        if (obj != null) {
            Class<?> cls2 = obj.getClass();
            if (cls2 == c15777a.f102755b) {
                lkb lkbVar = c15777a.f102754a;
                kr5 kr5Var = this.f102749a;
                lkbVar.write(ph8Var, obj, kr5Var.f55104a, kr5Var.f55096C);
                return;
            } else {
                lkb lkbVar2 = ph8Var.f70791a.get(cls2);
                kr5 kr5Var2 = this.f102749a;
                lkbVar2.write(ph8Var, obj, kr5Var2.f55104a, kr5Var2.f55096C);
                return;
            }
        }
        if ((this.f102751c & a2f.WriteNullNumberAsZero.f216a) != 0 && Number.class.isAssignableFrom(c15777a.f102755b)) {
            ph8Var.f70792b.write(48);
            return;
        }
        int i = this.f102751c;
        if ((a2f.WriteNullBooleanAsFalse.f216a & i) != 0 && Boolean.class == c15777a.f102755b) {
            ph8Var.f70792b.write("false");
        } else if ((i & a2f.WriteNullListAsEmpty.f216a) == 0 || !Collection.class.isAssignableFrom(c15777a.f102755b)) {
            c15777a.f102754a.write(ph8Var, null, this.f102749a.f55104a, c15777a.f102755b);
        } else {
            ph8Var.f70792b.write(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(yr5 yr5Var) {
        return this.f102749a.compareTo(yr5Var.f102749a);
    }
}

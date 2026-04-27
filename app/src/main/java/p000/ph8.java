package p000;

import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class ph8 {

    /* JADX INFO: renamed from: a */
    public final f1f f70791a;

    /* JADX INFO: renamed from: b */
    public final i1f f70792b;

    /* JADX INFO: renamed from: c */
    public List<mx0> f70793c;

    /* JADX INFO: renamed from: d */
    public List<AbstractC5848fj> f70794d;

    /* JADX INFO: renamed from: e */
    public List<cgd> f70795e;

    /* JADX INFO: renamed from: f */
    public List<i2i> f70796f;

    /* JADX INFO: renamed from: g */
    public List<p8b> f70797g;

    /* JADX INFO: renamed from: h */
    public List<kgd> f70798h;

    /* JADX INFO: renamed from: i */
    public int f70799i;

    /* JADX INFO: renamed from: j */
    public String f70800j;

    /* JADX INFO: renamed from: k */
    public DateFormat f70801k;

    /* JADX INFO: renamed from: l */
    public IdentityHashMap<Object, e0f> f70802l;

    /* JADX INFO: renamed from: m */
    public e0f f70803m;

    /* JADX INFO: renamed from: n */
    public TimeZone f70804n;

    /* JADX INFO: renamed from: o */
    public Locale f70805o;

    public ph8() {
        this(new i1f(null, fh8.f36587f, a2f.f212e2), f1f.f34712d);
    }

    public static Object processValue(ph8 ph8Var, Object obj, Object obj2, Object obj3) {
        List<i2i> list = ph8Var.f70796f;
        if (list != null) {
            if (obj2 != null && !(obj2 instanceof String)) {
                obj2 = fh8.toJSONString(obj2);
            }
            Iterator<i2i> it = list.iterator();
            while (it.hasNext()) {
                obj3 = it.next().process(obj, (String) obj2, obj3);
            }
        }
        return obj3;
    }

    public static final void write(Writer writer, Object obj) {
        i1f i1fVar = new i1f(null, fh8.f36587f, a2f.f212e2);
        try {
            try {
                new ph8(i1fVar, f1f.f34712d).write(obj);
                i1fVar.writeTo(writer);
            } catch (IOException e) {
                throw new jh8(e.getMessage(), e);
            }
        } finally {
            i1fVar.close();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m19493a(char c, String str, Object obj) {
        if (c != 0) {
            this.f70792b.write(c);
        }
        this.f70792b.writeFieldName(str, true);
        write(obj);
    }

    public boolean apply(Object obj, Object obj2, Object obj3) {
        List<cgd> list = this.f70795e;
        if (list == null) {
            return true;
        }
        if (obj2 != null && !(obj2 instanceof String)) {
            obj2 = fh8.toJSONString(obj2);
        }
        Iterator<cgd> it = list.iterator();
        while (it.hasNext()) {
            if (!it.next().apply(obj, (String) obj2, obj3)) {
                return false;
            }
        }
        return true;
    }

    public boolean applyName(Object obj, Object obj2) {
        List<kgd> list = this.f70798h;
        if (list == null) {
            return true;
        }
        for (kgd kgdVar : list) {
            if (obj2 != null && !(obj2 instanceof String)) {
                obj2 = fh8.toJSONString(obj2);
            }
            if (!kgdVar.apply(this, obj, (String) obj2)) {
                return false;
            }
        }
        return true;
    }

    public void close() {
        this.f70792b.close();
    }

    public void config(a2f a2fVar, boolean z) {
        this.f70792b.config(a2fVar, z);
    }

    public void decrementIdent() {
        this.f70799i--;
    }

    public List<AbstractC5848fj> getAfterFilters() {
        if (this.f70794d == null) {
            this.f70794d = new ArrayList();
        }
        return this.f70794d;
    }

    public List<mx0> getBeforeFilters() {
        if (this.f70793c == null) {
            this.f70793c = new ArrayList();
        }
        return this.f70793c;
    }

    public e0f getContext() {
        return this.f70803m;
    }

    public DateFormat getDateFormat() {
        if (this.f70801k == null && this.f70800j != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.f70800j, this.f70805o);
            this.f70801k = simpleDateFormat;
            simpleDateFormat.setTimeZone(this.f70804n);
        }
        return this.f70801k;
    }

    public String getDateFormatPattern() {
        DateFormat dateFormat = this.f70801k;
        return dateFormat instanceof SimpleDateFormat ? ((SimpleDateFormat) dateFormat).toPattern() : this.f70800j;
    }

    public List<p8b> getNameFilters() {
        if (this.f70797g == null) {
            this.f70797g = new ArrayList();
        }
        return this.f70797g;
    }

    public List<cgd> getPropertyFilters() {
        if (this.f70795e == null) {
            this.f70795e = new ArrayList();
        }
        return this.f70795e;
    }

    public List<kgd> getPropertyPreFilters() {
        if (this.f70798h == null) {
            this.f70798h = new ArrayList();
        }
        return this.f70798h;
    }

    public List<i2i> getValueFilters() {
        if (this.f70796f == null) {
            this.f70796f = new ArrayList();
        }
        return this.f70796f;
    }

    public i1f getWriter() {
        return this.f70792b;
    }

    public void incrementIndent() {
        this.f70799i++;
    }

    public void println() {
        this.f70792b.write(10);
        for (int i = 0; i < this.f70799i; i++) {
            this.f70792b.write(9);
        }
    }

    public Object processKey(Object obj, Object obj2, Object obj3) {
        List<p8b> list = this.f70797g;
        if (list != null) {
            if (obj2 != null && !(obj2 instanceof String)) {
                obj2 = fh8.toJSONString(obj2);
            }
            Iterator<p8b> it = list.iterator();
            while (it.hasNext()) {
                obj2 = it.next().process(obj, (String) obj2, obj3);
            }
        }
        return obj2;
    }

    public void setContext(e0f e0fVar, Object obj, Object obj2, int i) {
        if ((this.f70792b.f45448c & a2f.DisableCircularReferenceDetect.f216a) == 0) {
            this.f70803m = new e0f(e0fVar, obj, obj2, i);
            if (this.f70802l == null) {
                this.f70802l = new IdentityHashMap<>();
            }
            this.f70802l.put(obj, this.f70803m);
        }
    }

    public void setDateFormat(DateFormat dateFormat) {
        this.f70801k = dateFormat;
        if (this.f70800j != null) {
            this.f70800j = null;
        }
    }

    public String toString() {
        return this.f70792b.toString();
    }

    public void writeReference(Object obj) {
        e0f e0fVar = this.f70803m;
        if (obj == e0fVar.f31478b) {
            this.f70792b.write("{\"$ref\":\"@\"}");
            return;
        }
        e0f e0fVar2 = e0fVar.f31477a;
        if (e0fVar2 != null && obj == e0fVar2.f31478b) {
            this.f70792b.write("{\"$ref\":\"..\"}");
            return;
        }
        while (true) {
            e0f e0fVar3 = e0fVar.f31477a;
            if (e0fVar3 == null) {
                break;
            } else {
                e0fVar = e0fVar3;
            }
        }
        if (obj == e0fVar.f31478b) {
            this.f70792b.write("{\"$ref\":\"$\"}");
            return;
        }
        String string = this.f70802l.get(obj).toString();
        this.f70792b.write("{\"$ref\":\"");
        this.f70792b.write(string);
        this.f70792b.write("\"}");
    }

    public final void writeWithFieldName(Object obj, Object obj2) {
        writeWithFieldName(obj, obj2, null, 0);
    }

    public final void writeWithFormat(Object obj, String str) {
        if (!(obj instanceof Date)) {
            write(obj);
            return;
        }
        DateFormat dateFormat = getDateFormat();
        if (dateFormat == null) {
            dateFormat = new SimpleDateFormat(str, this.f70805o);
            dateFormat.setTimeZone(this.f70804n);
        }
        this.f70792b.writeString(dateFormat.format((Date) obj));
    }

    public ph8(i1f i1fVar) {
        this(i1fVar, f1f.f34712d);
    }

    public final void writeWithFieldName(Object obj, Object obj2, Type type, int i) {
        try {
            if (obj == null) {
                this.f70792b.writeNull();
            } else {
                this.f70791a.get(obj.getClass()).write(this, obj, obj2, type);
            }
        } catch (IOException e) {
            throw new jh8(e.getMessage(), e);
        }
    }

    public ph8(f1f f1fVar) {
        this(new i1f(null, fh8.f36587f, a2f.f212e2), f1fVar);
    }

    public ph8(i1f i1fVar, f1f f1fVar) {
        this.f70793c = null;
        this.f70794d = null;
        this.f70795e = null;
        this.f70796f = null;
        this.f70797g = null;
        this.f70798h = null;
        this.f70799i = 0;
        this.f70802l = null;
        this.f70804n = fh8.f36582a;
        this.f70805o = fh8.f36583b;
        this.f70792b = i1fVar;
        this.f70791a = f1fVar;
        this.f70804n = fh8.f36582a;
    }

    public void setDateFormat(String str) {
        this.f70800j = str;
        if (this.f70801k != null) {
            this.f70801k = null;
        }
    }

    public static final void write(i1f i1fVar, Object obj) {
        new ph8(i1fVar, f1f.f34712d).write(obj);
    }

    public final void write(Object obj) {
        if (obj == null) {
            this.f70792b.writeNull();
            return;
        }
        try {
            this.f70791a.get(obj.getClass()).write(this, obj, null, null);
        } catch (IOException e) {
            throw new jh8(e.getMessage(), e);
        }
    }

    public final void write(String str) {
        if (str == null) {
            i1f i1fVar = this.f70792b;
            if ((i1fVar.f45448c & a2f.WriteNullStringAsEmpty.f216a) != 0) {
                i1fVar.writeString("");
                return;
            } else {
                i1fVar.writeNull();
                return;
            }
        }
        i1f i1fVar2 = this.f70792b;
        if ((i1fVar2.f45448c & a2f.UseSingleQuotes.f216a) != 0) {
            i1fVar2.m12718d(str);
        } else {
            i1fVar2.m12717c(str, (char) 0, true);
        }
    }
}

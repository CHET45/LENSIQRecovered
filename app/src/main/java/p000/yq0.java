package p000;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public abstract class yq0 implements i74 {
    private String descriptionOf(Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Exception unused) {
            return obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode());
        }
    }

    private void toJavaSyntax(String str) {
        mo19313a('\"');
        for (int i = 0; i < str.length(); i++) {
            toJavaSyntax(str.charAt(i));
        }
        mo19313a('\"');
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo19313a(char c);

    @Override // p000.i74
    public i74 appendDescriptionOf(ixe ixeVar) {
        ixeVar.describeTo(this);
        return this;
    }

    @Override // p000.i74
    public i74 appendList(String str, String str2, String str3, Iterable<? extends ixe> iterable) {
        return appendList(str, str2, str3, iterable.iterator());
    }

    @Override // p000.i74
    public i74 appendText(String str) {
        mo19314b(str);
        return this;
    }

    @Override // p000.i74
    public i74 appendValue(Object obj) {
        if (obj == null) {
            mo19314b("null");
        } else if (obj instanceof String) {
            toJavaSyntax((String) obj);
        } else if (obj instanceof Character) {
            mo19313a('\"');
            toJavaSyntax(((Character) obj).charValue());
            mo19313a('\"');
        } else if (obj instanceof Short) {
            mo19313a('<');
            mo19314b(descriptionOf(obj));
            mo19314b("s>");
        } else if (obj instanceof Long) {
            mo19313a('<');
            mo19314b(descriptionOf(obj));
            mo19314b("L>");
        } else if (obj instanceof Float) {
            mo19313a('<');
            mo19314b(descriptionOf(obj));
            mo19314b("F>");
        } else if (obj.getClass().isArray()) {
            appendValueList("[", ", ", "]", new j60(obj));
        } else {
            mo19313a('<');
            mo19314b(descriptionOf(obj));
            mo19313a('>');
        }
        return this;
    }

    @Override // p000.i74
    public <T> i74 appendValueList(String str, String str2, String str3, T... tArr) {
        return appendValueList(str, str2, str3, Arrays.asList(tArr));
    }

    /* JADX INFO: renamed from: b */
    public void mo19314b(String str) {
        for (int i = 0; i < str.length(); i++) {
            mo19313a(str.charAt(i));
        }
    }

    private i74 appendList(String str, String str2, String str3, Iterator<? extends ixe> it) {
        mo19314b(str);
        boolean z = false;
        while (it.hasNext()) {
            if (z) {
                mo19314b(str2);
            }
            appendDescriptionOf(it.next());
            z = true;
        }
        mo19314b(str3);
        return this;
    }

    @Override // p000.i74
    public <T> i74 appendValueList(String str, String str2, String str3, Iterable<T> iterable) {
        return appendValueList(str, str2, str3, iterable.iterator());
    }

    private <T> i74 appendValueList(String str, String str2, String str3, Iterator<T> it) {
        return appendList(str, str2, str3, new kxe(it));
    }

    private void toJavaSyntax(char c) {
        if (c == '\t') {
            mo19314b("\\t");
            return;
        }
        if (c == '\n') {
            mo19314b("\\n");
            return;
        }
        if (c == '\r') {
            mo19314b("\\r");
        } else if (c != '\"') {
            mo19313a(c);
        } else {
            mo19314b("\\\"");
        }
    }
}

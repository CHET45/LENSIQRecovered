package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ic0 implements Map.Entry<String, String>, Cloneable {

    /* JADX INFO: renamed from: a */
    public String f46476a;

    /* JADX INFO: renamed from: b */
    public String f46477b;

    /* JADX INFO: renamed from: c */
    public rc0 f46478c;

    public ic0(String str, String str2) {
        this(str, str2, null);
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ic0 ic0Var = (ic0) obj;
        String str = this.f46476a;
        if (str == null ? ic0Var.f46476a != null : !str.equals(ic0Var.f46476a)) {
            return false;
        }
        String str2 = this.f46477b;
        String str3 = ic0Var.f46477b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        String str = this.f46476a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f46477b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public void setKey(String str) {
        int iM21117d;
        v1i.notNull(str);
        String strTrim = str.trim();
        v1i.notEmpty(strTrim);
        rc0 rc0Var = this.f46478c;
        if (rc0Var != null && (iM21117d = rc0Var.m21117d(this.f46476a)) != -1) {
            this.f46478c.f77702b[iM21117d] = strTrim;
        }
        this.f46476a = strTrim;
    }

    public ic0(String str, String str2, rc0 rc0Var) {
        v1i.notNull(str);
        this.f46476a = str.trim();
        v1i.notEmpty(str);
        this.f46477b = str2;
        this.f46478c = rc0Var;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public ic0 m30190clone() {
        try {
            return (ic0) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.util.Map.Entry
    public String getKey() {
        return this.f46476a;
    }

    @Override // java.util.Map.Entry
    public String getValue() {
        return this.f46477b;
    }

    @Override // java.util.Map.Entry
    public String setValue(String str) {
        int iM21117d;
        String str2 = this.f46478c.get(this.f46476a);
        rc0 rc0Var = this.f46478c;
        if (rc0Var != null && (iM21117d = rc0Var.m21117d(this.f46476a)) != -1) {
            this.f46478c.f77703c[iM21117d] = str;
        }
        this.f46477b = str;
        return str2;
    }
}

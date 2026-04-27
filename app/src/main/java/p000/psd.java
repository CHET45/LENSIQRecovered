package p000;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class psd {

    /* JADX INFO: renamed from: a */
    public String f71938a;

    /* JADX INFO: renamed from: b */
    public List<C11108a> f71939b;

    /* JADX INFO: renamed from: psd$a */
    public static class C11108a {

        /* JADX INFO: renamed from: a */
        public String f71940a;

        /* JADX INFO: renamed from: b */
        public String f71941b;

        /* JADX INFO: renamed from: c */
        public String f71942c;

        /* JADX INFO: renamed from: d */
        public String f71943d;

        /* JADX INFO: renamed from: e */
        public String f71944e;

        public String getBoundary() {
            return this.f71944e;
        }

        public String getLabel() {
            return this.f71942c;
        }

        public String getPinyin() {
            return this.f71943d;
        }

        public String getSc() {
            return this.f71940a;
        }

        public String getW() {
            return this.f71941b;
        }

        public void setBoundary(String str) {
            this.f71944e = str;
        }

        public void setLabel(String str) {
            this.f71942c = str;
        }

        public void setPinyin(String str) {
            this.f71943d = str;
        }

        public void setSc(String str) {
            this.f71940a = str;
        }

        public void setW(String str) {
            this.f71941b = str;
        }
    }

    public String getSc() {
        return this.f71938a;
    }

    public List<C11108a> getWs() {
        return this.f71939b;
    }

    public void setSc(String str) {
        this.f71938a = str;
    }

    public void setWs(List<C11108a> list) {
        this.f71939b = list;
    }
}

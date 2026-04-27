package p000;

import java.util.List;

/* JADX INFO: renamed from: c */
/* JADX INFO: loaded from: classes6.dex */
public class C2133c {

    /* JADX INFO: renamed from: a */
    public String f15392a;

    /* JADX INFO: renamed from: b */
    public a f15393b;

    /* JADX INFO: renamed from: c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public List<b> f15394a;

        /* JADX INFO: renamed from: b */
        public boolean f15395b;

        public List<b> getMessages() {
            return this.f15394a;
        }

        public boolean isEnableSearch() {
            return this.f15395b;
        }

        public void setEnableSearch(boolean z) {
            this.f15395b = z;
        }

        public void setMessages(List<b> list) {
            this.f15394a = list;
        }
    }

    /* JADX INFO: renamed from: c$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public String f15396a;

        /* JADX INFO: renamed from: b */
        public String f15397b;

        public String getContent() {
            return this.f15397b;
        }

        public String getRole() {
            return this.f15396a;
        }

        public void setContent(String str) {
            this.f15397b = str;
        }

        public void setRole(String str) {
            this.f15396a = str;
        }
    }

    public String getCommand() {
        return this.f15392a;
    }

    public a getData() {
        return this.f15393b;
    }

    public void setCommand(String str) {
        this.f15392a = str;
    }

    public void setData(a aVar) {
        this.f15393b = aVar;
    }
}

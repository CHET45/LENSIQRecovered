package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.nm7;

/* JADX INFO: loaded from: classes7.dex */
public abstract class om7 implements nm7 {

    /* JADX INFO: renamed from: b */
    public final String f68123b;

    /* JADX INFO: renamed from: c */
    public final int f68124c;

    /* JADX INFO: renamed from: d */
    public final Map<String, String> f68125d;

    /* JADX INFO: renamed from: e */
    public int f68126e = -1;

    /* JADX INFO: renamed from: om7$a */
    public static class C10467a extends om7 implements nm7.InterfaceC9940a {

        /* JADX INFO: renamed from: f */
        public final C10467a f68127f;

        /* JADX INFO: renamed from: g */
        public List<C10467a> f68128g;

        public C10467a(@efb String str, int i, @efb Map<String, String> map, @hib C10467a c10467a) {
            super(str, i, map);
            this.f68127f = c10467a;
        }

        @efb
        /* JADX INFO: renamed from: b */
        public static C10467a m18776b(@efb String str, int i, @efb Map<String, String> map, @hib C10467a c10467a) {
            return new C10467a(str, i, map, c10467a);
        }

        @efb
        /* JADX INFO: renamed from: c */
        public static C10467a m18777c() {
            return new C10467a("", 0, Collections.emptyMap(), null);
        }

        @Override // p000.om7
        /* JADX INFO: renamed from: a */
        public void mo18775a(int i) {
            if (isClosed()) {
                return;
            }
            this.f68126e = i;
            List<C10467a> list = this.f68128g;
            if (list != null) {
                Iterator<C10467a> it = list.iterator();
                while (it.hasNext()) {
                    it.next().mo18775a(i);
                }
            }
        }

        @Override // p000.om7, p000.nm7
        @efb
        public Map<String, String> attributes() {
            return this.f68125d;
        }

        @Override // p000.nm7.InterfaceC9940a
        @efb
        public List<nm7.InterfaceC9940a> children() {
            List<C10467a> list = this.f68128g;
            return list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        }

        @Override // p000.nm7
        @efb
        public nm7.InterfaceC9940a getAsBlock() {
            return this;
        }

        @Override // p000.nm7
        @efb
        public nm7.InterfaceC9941b getAsInline() {
            throw new ClassCastException("Cannot cast Block instance to Inline");
        }

        @Override // p000.nm7
        public boolean isBlock() {
            return true;
        }

        @Override // p000.nm7
        public boolean isInline() {
            return false;
        }

        @Override // p000.nm7.InterfaceC9940a
        public boolean isRoot() {
            return this.f68127f == null;
        }

        @Override // p000.nm7.InterfaceC9940a
        @hib
        public nm7.InterfaceC9940a parent() {
            return this.f68127f;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BlockImpl{name='");
            sb.append(this.f68123b);
            sb.append('\'');
            sb.append(", start=");
            sb.append(this.f68124c);
            sb.append(", end=");
            sb.append(this.f68126e);
            sb.append(", attributes=");
            sb.append(this.f68125d);
            sb.append(", parent=");
            C10467a c10467a = this.f68127f;
            sb.append(c10467a != null ? c10467a.f68123b : null);
            sb.append(", children=");
            sb.append(this.f68128g);
            sb.append('}');
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: om7$b */
    public static class C10468b extends om7 implements nm7.InterfaceC9941b {
        public C10468b(@efb String str, int i, @efb Map<String, String> map) {
            super(str, i, map);
        }

        @Override // p000.om7
        /* JADX INFO: renamed from: a */
        public void mo18775a(int i) {
            if (isClosed()) {
                return;
            }
            this.f68126e = i;
        }

        @Override // p000.nm7
        @efb
        public nm7.InterfaceC9940a getAsBlock() {
            throw new ClassCastException("Cannot cast Inline instance to Block");
        }

        @Override // p000.nm7
        @efb
        public nm7.InterfaceC9941b getAsInline() {
            return this;
        }

        @Override // p000.nm7
        public boolean isBlock() {
            return false;
        }

        @Override // p000.nm7
        public boolean isInline() {
            return true;
        }

        public String toString() {
            return "InlineImpl{name='" + this.f68123b + "', start=" + this.f68124c + ", end=" + this.f68126e + ", attributes=" + this.f68125d + '}';
        }
    }

    public om7(@efb String str, int i, @efb Map<String, String> map) {
        this.f68123b = str;
        this.f68124c = i;
        this.f68125d = map;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo18775a(int i);

    @Override // p000.nm7
    @efb
    public Map<String, String> attributes() {
        return this.f68125d;
    }

    @Override // p000.nm7
    public int end() {
        return this.f68126e;
    }

    @Override // p000.nm7
    public boolean isClosed() {
        return this.f68126e > -1;
    }

    @Override // p000.nm7
    public boolean isEmpty() {
        return this.f68124c == this.f68126e;
    }

    @Override // p000.nm7
    @efb
    public String name() {
        return this.f68123b;
    }

    @Override // p000.nm7
    public int start() {
        return this.f68124c;
    }
}

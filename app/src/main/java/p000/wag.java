package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@ay1
public final class wag implements ksa {

    /* JADX INFO: renamed from: a */
    public final hhd f93829a;

    /* JADX INFO: renamed from: b */
    public final boolean f93830b;

    /* JADX INFO: renamed from: c */
    public final int[] f93831c;

    /* JADX INFO: renamed from: d */
    public final lr5[] f93832d;

    /* JADX INFO: renamed from: e */
    public final qsa f93833e;

    public wag(hhd syntax, boolean messageSetWireFormat, int[] checkInitialized, lr5[] fields, Object defaultInstance) {
        this.f93829a = syntax;
        this.f93830b = messageSetWireFormat;
        this.f93831c = checkInitialized;
        this.f93832d = fields;
        this.f93833e = (qsa) w98.m24433b(defaultInstance, "defaultInstance");
    }

    public static C14531a newBuilder() {
        return new C14531a();
    }

    public int[] getCheckInitialized() {
        return this.f93831c;
    }

    @Override // p000.ksa
    public qsa getDefaultInstance() {
        return this.f93833e;
    }

    public lr5[] getFields() {
        return this.f93832d;
    }

    @Override // p000.ksa
    public hhd getSyntax() {
        return this.f93829a;
    }

    @Override // p000.ksa
    public boolean isMessageSetWireFormat() {
        return this.f93830b;
    }

    public static C14531a newBuilder(int numFields) {
        return new C14531a(numFields);
    }

    /* JADX INFO: renamed from: wag$a */
    public static final class C14531a {

        /* JADX INFO: renamed from: a */
        public final List<lr5> f93834a;

        /* JADX INFO: renamed from: b */
        public hhd f93835b;

        /* JADX INFO: renamed from: c */
        public boolean f93836c;

        /* JADX INFO: renamed from: d */
        public boolean f93837d;

        /* JADX INFO: renamed from: e */
        public int[] f93838e;

        /* JADX INFO: renamed from: f */
        public Object f93839f;

        public C14531a() {
            this.f93838e = null;
            this.f93834a = new ArrayList();
        }

        public wag build() {
            if (this.f93836c) {
                throw new IllegalStateException("Builder can only build once");
            }
            if (this.f93835b == null) {
                throw new IllegalStateException("Must specify a proto syntax");
            }
            this.f93836c = true;
            Collections.sort(this.f93834a);
            return new wag(this.f93835b, this.f93837d, this.f93838e, (lr5[]) this.f93834a.toArray(new lr5[0]), this.f93839f);
        }

        public void withCheckInitialized(int[] checkInitialized) {
            this.f93838e = checkInitialized;
        }

        public void withDefaultInstance(Object defaultInstance) {
            this.f93839f = defaultInstance;
        }

        public void withField(lr5 field) {
            if (this.f93836c) {
                throw new IllegalStateException("Builder can only build once");
            }
            this.f93834a.add(field);
        }

        public void withMessageSetWireFormat(boolean messageSetWireFormat) {
            this.f93837d = messageSetWireFormat;
        }

        public void withSyntax(hhd syntax) {
            this.f93835b = (hhd) w98.m24433b(syntax, "syntax");
        }

        public C14531a(int numFields) {
            this.f93838e = null;
            this.f93834a = new ArrayList(numFields);
        }
    }
}

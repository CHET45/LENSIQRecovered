package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ey1
public final class vag implements lsa {

    /* JADX INFO: renamed from: a */
    public final ihd f90486a;

    /* JADX INFO: renamed from: b */
    public final boolean f90487b;

    /* JADX INFO: renamed from: c */
    public final int[] f90488c;

    /* JADX INFO: renamed from: d */
    public final jr5[] f90489d;

    /* JADX INFO: renamed from: e */
    public final psa f90490e;

    public vag(ihd syntax, boolean messageSetWireFormat, int[] checkInitialized, jr5[] fields, Object defaultInstance) {
        this.f90486a = syntax;
        this.f90487b = messageSetWireFormat;
        this.f90488c = checkInitialized;
        this.f90489d = fields;
        this.f90490e = (psa) v98.m23882b(defaultInstance, "defaultInstance");
    }

    public static C13968a newBuilder() {
        return new C13968a();
    }

    public int[] getCheckInitialized() {
        return this.f90488c;
    }

    @Override // p000.lsa
    public psa getDefaultInstance() {
        return this.f90490e;
    }

    public jr5[] getFields() {
        return this.f90489d;
    }

    @Override // p000.lsa
    public ihd getSyntax() {
        return this.f90486a;
    }

    @Override // p000.lsa
    public boolean isMessageSetWireFormat() {
        return this.f90487b;
    }

    public static C13968a newBuilder(int numFields) {
        return new C13968a(numFields);
    }

    /* JADX INFO: renamed from: vag$a */
    public static final class C13968a {

        /* JADX INFO: renamed from: a */
        public final List<jr5> f90491a;

        /* JADX INFO: renamed from: b */
        public ihd f90492b;

        /* JADX INFO: renamed from: c */
        public boolean f90493c;

        /* JADX INFO: renamed from: d */
        public boolean f90494d;

        /* JADX INFO: renamed from: e */
        public int[] f90495e;

        /* JADX INFO: renamed from: f */
        public Object f90496f;

        public C13968a() {
            this.f90495e = null;
            this.f90491a = new ArrayList();
        }

        public vag build() {
            if (this.f90493c) {
                throw new IllegalStateException("Builder can only build once");
            }
            if (this.f90492b == null) {
                throw new IllegalStateException("Must specify a proto syntax");
            }
            this.f90493c = true;
            Collections.sort(this.f90491a);
            return new vag(this.f90492b, this.f90494d, this.f90495e, (jr5[]) this.f90491a.toArray(new jr5[0]), this.f90496f);
        }

        public void withCheckInitialized(int[] checkInitialized) {
            this.f90495e = checkInitialized;
        }

        public void withDefaultInstance(Object defaultInstance) {
            this.f90496f = defaultInstance;
        }

        public void withField(jr5 field) {
            if (this.f90493c) {
                throw new IllegalStateException("Builder can only build once");
            }
            this.f90491a.add(field);
        }

        public void withMessageSetWireFormat(boolean messageSetWireFormat) {
            this.f90494d = messageSetWireFormat;
        }

        public void withSyntax(ihd syntax) {
            this.f90492b = (ihd) v98.m23882b(syntax, "syntax");
        }

        public C13968a(int numFields) {
            this.f90495e = null;
            this.f90491a = new ArrayList(numFields);
        }
    }
}

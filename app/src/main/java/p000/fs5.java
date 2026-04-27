package p000;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class fs5 {

    /* JADX INFO: renamed from: a */
    public static final C5947c f37603a = new C5947c();

    /* JADX INFO: renamed from: b */
    public static final C5949e f37604b = new C5949e();

    /* JADX INFO: renamed from: fs5$a */
    public static class C5945a extends fs5 {

        /* JADX INFO: renamed from: c */
        public final List<Object> f37605c;

        public C5945a(List<Object> list) {
            this.f37605c = list;
        }

        @Override // p000.fs5
        /* JADX INFO: renamed from: a */
        public String mo11126a() {
            return "FieldValue.arrayRemove";
        }

        /* JADX INFO: renamed from: b */
        public List<Object> m11127b() {
            return this.f37605c;
        }
    }

    /* JADX INFO: renamed from: fs5$b */
    public static class C5946b extends fs5 {

        /* JADX INFO: renamed from: c */
        public final List<Object> f37606c;

        public C5946b(List<Object> list) {
            this.f37606c = list;
        }

        @Override // p000.fs5
        /* JADX INFO: renamed from: a */
        public String mo11126a() {
            return "FieldValue.arrayUnion";
        }

        /* JADX INFO: renamed from: b */
        public List<Object> m11128b() {
            return this.f37606c;
        }
    }

    /* JADX INFO: renamed from: fs5$c */
    public static class C5947c extends fs5 {
        @Override // p000.fs5
        /* JADX INFO: renamed from: a */
        public String mo11126a() {
            return "FieldValue.delete";
        }
    }

    /* JADX INFO: renamed from: fs5$d */
    public static class C5948d extends fs5 {

        /* JADX INFO: renamed from: c */
        public final Number f37607c;

        public C5948d(Number number) {
            this.f37607c = number;
        }

        @Override // p000.fs5
        /* JADX INFO: renamed from: a */
        public String mo11126a() {
            return "FieldValue.increment";
        }

        /* JADX INFO: renamed from: b */
        public Number m11129b() {
            return this.f37607c;
        }
    }

    /* JADX INFO: renamed from: fs5$e */
    public static class C5949e extends fs5 {
        @Override // p000.fs5
        /* JADX INFO: renamed from: a */
        public String mo11126a() {
            return "FieldValue.serverTimestamp";
        }
    }

    @efb
    public static fs5 arrayRemove(Object... objArr) {
        return new C5945a(Arrays.asList(objArr));
    }

    @efb
    public static fs5 arrayUnion(Object... objArr) {
        return new C5946b(Arrays.asList(objArr));
    }

    @efb
    public static fs5 delete() {
        return f37603a;
    }

    @efb
    public static fs5 increment(long j) {
        return new C5948d(Long.valueOf(j));
    }

    @efb
    public static fs5 serverTimestamp() {
        return f37604b;
    }

    @efb
    public static s3i vector(@efb double[] dArr) {
        return new s3i(dArr);
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo11126a();

    @efb
    public static fs5 increment(double d) {
        return new C5948d(Double.valueOf(d));
    }
}

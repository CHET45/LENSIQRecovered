package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class uyh {

    /* JADX INFO: renamed from: uyh$a */
    public static /* synthetic */ class C13795a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f89512a;

        static {
            int[] iArr = new int[EnumC13800f.values().length];
            f89512a = iArr;
            try {
                iArr[EnumC13800f.Set.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f89512a[EnumC13800f.MergeSet.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f89512a[EnumC13800f.Update.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f89512a[EnumC13800f.Argument.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f89512a[EnumC13800f.ArrayArgument.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: uyh$c */
    public static class C13797c {

        /* JADX INFO: renamed from: d */
        public static final String f89516d = "__";

        /* JADX INFO: renamed from: a */
        public final C13796b f89517a;

        /* JADX INFO: renamed from: b */
        @hib
        public final wr5 f89518b;

        /* JADX INFO: renamed from: c */
        public final boolean f89519c;

        public /* synthetic */ C13797c(C13796b c13796b, wr5 wr5Var, boolean z, C13795a c13795a) {
            this(c13796b, wr5Var, z);
        }

        private void validatePath() {
            if (this.f89518b == null) {
                return;
            }
            for (int i = 0; i < this.f89518b.length(); i++) {
                validatePathSegment(this.f89518b.getSegment(i));
            }
        }

        private void validatePathSegment(String str) {
            if (str.isEmpty()) {
                throw createError("Document fields must not be empty");
            }
            if (isWrite() && str.startsWith(f89516d) && str.endsWith(f89516d)) {
                throw createError("Document fields cannot begin and end with \"__\"");
            }
        }

        public void addToFieldMask(wr5 wr5Var) {
            this.f89517a.m23640b(wr5Var);
        }

        public void addToFieldTransforms(wr5 wr5Var, xdh xdhVar) {
            this.f89517a.m23641c(wr5Var, xdhVar);
        }

        public C13797c childContext(String str) {
            wr5 wr5Var = this.f89518b;
            C13797c c13797c = new C13797c(this.f89517a, wr5Var == null ? null : wr5Var.append(str), false);
            c13797c.validatePathSegment(str);
            return c13797c;
        }

        public RuntimeException createError(String str) {
            String str2;
            wr5 wr5Var = this.f89518b;
            if (wr5Var == null || wr5Var.isEmpty()) {
                str2 = "";
            } else {
                str2 = " (found in field " + this.f89518b.toString() + c0b.f15434d;
            }
            return new IllegalArgumentException("Invalid data. " + str + str2);
        }

        public EnumC13800f getDataSource() {
            return this.f89517a.f89513a;
        }

        @hib
        public wr5 getPath() {
            return this.f89518b;
        }

        public boolean isArrayElement() {
            return this.f89519c;
        }

        public boolean isWrite() {
            int i = C13795a.f89512a[this.f89517a.f89513a.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                return true;
            }
            if (i == 4 || i == 5) {
                return false;
            }
            throw r80.fail("Unexpected case for UserDataSource: %s", this.f89517a.f89513a.name());
        }

        private C13797c(C13796b c13796b, @hib wr5 wr5Var, boolean z) {
            this.f89517a = c13796b;
            this.f89518b = wr5Var;
            this.f89519c = z;
        }

        public C13797c childContext(wr5 wr5Var) {
            wr5 wr5Var2 = this.f89518b;
            C13797c c13797c = new C13797c(this.f89517a, wr5Var2 == null ? null : wr5Var2.append(wr5Var), false);
            c13797c.validatePath();
            return c13797c;
        }

        public C13797c childContext(int i) {
            return new C13797c(this.f89517a, null, true);
        }
    }

    /* JADX INFO: renamed from: uyh$d */
    public static class C13798d {

        /* JADX INFO: renamed from: a */
        public final nkb f89520a;

        /* JADX INFO: renamed from: b */
        @hib
        public final or5 f89521b;

        /* JADX INFO: renamed from: c */
        public final List<bs5> f89522c;

        public C13798d(nkb nkbVar, @hib or5 or5Var, List<bs5> list) {
            this.f89520a = nkbVar;
            this.f89521b = or5Var;
            this.f89522c = list;
        }

        public nkb getData() {
            return this.f89520a;
        }

        @hib
        public or5 getFieldMask() {
            return this.f89521b;
        }

        public List<bs5> getFieldTransforms() {
            return this.f89522c;
        }

        public m7b toMutation(ci4 ci4Var, n7d n7dVar) {
            or5 or5Var = this.f89521b;
            return or5Var != null ? new uic(ci4Var, this.f89520a, or5Var, n7dVar, this.f89522c) : new q6f(ci4Var, this.f89520a, n7dVar, this.f89522c);
        }
    }

    /* JADX INFO: renamed from: uyh$e */
    public static class C13799e {

        /* JADX INFO: renamed from: a */
        public final nkb f89523a;

        /* JADX INFO: renamed from: b */
        public final or5 f89524b;

        /* JADX INFO: renamed from: c */
        public final List<bs5> f89525c;

        public C13799e(nkb nkbVar, or5 or5Var, List<bs5> list) {
            this.f89523a = nkbVar;
            this.f89524b = or5Var;
            this.f89525c = list;
        }

        public nkb getData() {
            return this.f89523a;
        }

        public or5 getFieldMask() {
            return this.f89524b;
        }

        public List<bs5> getFieldTransforms() {
            return this.f89525c;
        }

        public m7b toMutation(ci4 ci4Var, n7d n7dVar) {
            return new uic(ci4Var, this.f89523a, this.f89524b, n7dVar, this.f89525c);
        }
    }

    /* JADX INFO: renamed from: uyh$f */
    public enum EnumC13800f {
        Set,
        MergeSet,
        Update,
        Argument,
        ArrayArgument
    }

    private uyh() {
    }

    /* JADX INFO: renamed from: uyh$b */
    public static class C13796b {

        /* JADX INFO: renamed from: a */
        public final EnumC13800f f89513a;

        /* JADX INFO: renamed from: b */
        public final Set<wr5> f89514b = new HashSet();

        /* JADX INFO: renamed from: c */
        public final ArrayList<bs5> f89515c = new ArrayList<>();

        public C13796b(EnumC13800f enumC13800f) {
            this.f89513a = enumC13800f;
        }

        /* JADX INFO: renamed from: b */
        public void m23640b(wr5 wr5Var) {
            this.f89514b.add(wr5Var);
        }

        /* JADX INFO: renamed from: c */
        public void m23641c(wr5 wr5Var, xdh xdhVar) {
            this.f89515c.add(new bs5(wr5Var, xdhVar));
        }

        public boolean contains(wr5 wr5Var) {
            Iterator<wr5> it = this.f89514b.iterator();
            while (it.hasNext()) {
                if (wr5Var.isPrefixOf(it.next())) {
                    return true;
                }
            }
            Iterator<bs5> it2 = this.f89515c.iterator();
            while (it2.hasNext()) {
                if (wr5Var.isPrefixOf(it2.next().getFieldPath())) {
                    return true;
                }
            }
            return false;
        }

        public EnumC13800f getDataSource() {
            return this.f89513a;
        }

        public List<bs5> getFieldTransforms() {
            return this.f89515c;
        }

        public C13797c rootContext() {
            return new C13797c(this, wr5.f95194c, false, null);
        }

        public C13798d toMergeData(nkb nkbVar) {
            return new C13798d(nkbVar, or5.fromSet(this.f89514b), Collections.unmodifiableList(this.f89515c));
        }

        public C13798d toSetData(nkb nkbVar) {
            return new C13798d(nkbVar, null, Collections.unmodifiableList(this.f89515c));
        }

        public C13799e toUpdateData(nkb nkbVar) {
            return new C13799e(nkbVar, or5.fromSet(this.f89514b), Collections.unmodifiableList(this.f89515c));
        }

        public C13798d toMergeData(nkb nkbVar, or5 or5Var) {
            ArrayList arrayList = new ArrayList();
            for (bs5 bs5Var : this.f89515c) {
                if (or5Var.covers(bs5Var.getFieldPath())) {
                    arrayList.add(bs5Var);
                }
            }
            return new C13798d(nkbVar, or5Var, Collections.unmodifiableList(arrayList));
        }
    }
}

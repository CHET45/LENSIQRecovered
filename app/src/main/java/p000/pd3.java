package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class pd3 {

    /* JADX INFO: renamed from: a */
    @g92
    @hib
    public final Integer f70429a;

    /* JADX INFO: renamed from: b */
    @g92
    @hib
    public final Integer f70430b;

    /* JADX INFO: renamed from: c */
    @g92
    @hib
    public final Integer f70431c;

    /* JADX INFO: renamed from: d */
    @g92
    @hib
    public final Integer f70432d;

    /* JADX INFO: renamed from: pd3$a */
    public static final class C10915a {

        /* JADX INFO: renamed from: a */
        @g92
        @hib
        public Integer f70433a;

        /* JADX INFO: renamed from: b */
        @g92
        @hib
        public Integer f70434b;

        /* JADX INFO: renamed from: c */
        @g92
        @hib
        public Integer f70435c;

        /* JADX INFO: renamed from: d */
        @g92
        @hib
        public Integer f70436d;

        @efb
        public pd3 build() {
            return new pd3(this.f70433a, this.f70434b, this.f70435c, this.f70436d);
        }

        @efb
        public C10915a setNavigationBarColor(@g92 int i) {
            this.f70435c = Integer.valueOf(i | (-16777216));
            return this;
        }

        @efb
        public C10915a setNavigationBarDividerColor(@g92 int i) {
            this.f70436d = Integer.valueOf(i);
            return this;
        }

        @efb
        public C10915a setSecondaryToolbarColor(@g92 int i) {
            this.f70434b = Integer.valueOf(i);
            return this;
        }

        @efb
        public C10915a setToolbarColor(@g92 int i) {
            this.f70433a = Integer.valueOf(i | (-16777216));
            return this;
        }
    }

    public pd3(@g92 @hib Integer num, @g92 @hib Integer num2, @g92 @hib Integer num3, @g92 @hib Integer num4) {
        this.f70429a = num;
        this.f70430b = num2;
        this.f70431c = num3;
        this.f70432d = num4;
    }

    @efb
    /* JADX INFO: renamed from: a */
    public static pd3 m19425a(@hib Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle(0);
        }
        return new pd3((Integer) bundle.get(sd3.f81277k), (Integer) bundle.get(sd3.f81285s), (Integer) bundle.get(sd3.f81264M), (Integer) bundle.get(sd3.f81265N));
    }

    @efb
    /* JADX INFO: renamed from: b */
    public Bundle m19426b() {
        Bundle bundle = new Bundle();
        Integer num = this.f70429a;
        if (num != null) {
            bundle.putInt(sd3.f81277k, num.intValue());
        }
        Integer num2 = this.f70430b;
        if (num2 != null) {
            bundle.putInt(sd3.f81285s, num2.intValue());
        }
        Integer num3 = this.f70431c;
        if (num3 != null) {
            bundle.putInt(sd3.f81264M, num3.intValue());
        }
        Integer num4 = this.f70432d;
        if (num4 != null) {
            bundle.putInt(sd3.f81265N, num4.intValue());
        }
        return bundle;
    }

    @efb
    /* JADX INFO: renamed from: c */
    public pd3 m19427c(@efb pd3 pd3Var) {
        Integer num = this.f70429a;
        if (num == null) {
            num = pd3Var.f70429a;
        }
        Integer num2 = this.f70430b;
        if (num2 == null) {
            num2 = pd3Var.f70430b;
        }
        Integer num3 = this.f70431c;
        if (num3 == null) {
            num3 = pd3Var.f70431c;
        }
        Integer num4 = this.f70432d;
        if (num4 == null) {
            num4 = pd3Var.f70432d;
        }
        return new pd3(num, num2, num3, num4);
    }
}

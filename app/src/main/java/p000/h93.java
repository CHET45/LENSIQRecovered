package p000;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class h93 {

    /* JADX INFO: renamed from: h93$b */
    public static class C6756b extends h93 {

        /* JADX INFO: renamed from: h93$b$a */
        public static class a implements Iterable<i93> {

            /* JADX INFO: renamed from: a */
            public final String f42941a;

            /* JADX INFO: renamed from: h93$b$a$a, reason: collision with other inner class name */
            public class C16451a implements Iterator<i93> {

                /* JADX INFO: renamed from: a */
                public final i93 f42942a;

                /* JADX INFO: renamed from: b */
                public final StringBuilder f42943b;

                /* JADX INFO: renamed from: c */
                public final int f42944c;

                /* JADX INFO: renamed from: d */
                public int f42945d;

                private C16451a() {
                    this.f42942a = new i93();
                    this.f42943b = new StringBuilder();
                    this.f42944c = a.this.f42941a.length();
                }

                private boolean hasNextPrepared() {
                    return hasValues(this.f42942a.key(), this.f42942a.value());
                }

                private boolean hasValues(@hib String str, @hib String str2) {
                    return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? false : true;
                }

                private void prepareNext() {
                    this.f42942a.m12872a("", "");
                    this.f42943b.setLength(0);
                    String strTrim = null;
                    boolean z = false;
                    String strTrim2 = null;
                    for (int i = this.f42945d; i < this.f42944c; i++) {
                        char cCharAt = a.this.f42941a.charAt(i);
                        if (strTrim == null) {
                            if (':' == cCharAt) {
                                if (this.f42943b.length() > 0) {
                                    strTrim = this.f42943b.toString().trim();
                                }
                                this.f42943b.setLength(0);
                            } else if (';' == cCharAt) {
                                this.f42943b.setLength(0);
                            } else if (Character.isWhitespace(cCharAt)) {
                                if (this.f42943b.length() > 0) {
                                    z = true;
                                }
                            } else if (z) {
                                this.f42943b.setLength(0);
                                this.f42943b.append(cCharAt);
                                z = false;
                            } else {
                                this.f42943b.append(cCharAt);
                            }
                        } else if (strTrim2 != null) {
                            continue;
                        } else if (Character.isWhitespace(cCharAt)) {
                            if (this.f42943b.length() > 0) {
                                this.f42943b.append(cCharAt);
                            }
                        } else if (';' == cCharAt) {
                            strTrim2 = this.f42943b.toString().trim();
                            this.f42943b.setLength(0);
                            if (hasValues(strTrim, strTrim2)) {
                                this.f42945d = i + 1;
                                this.f42942a.m12872a(strTrim, strTrim2);
                                return;
                            }
                        } else {
                            this.f42943b.append(cCharAt);
                        }
                    }
                    if (strTrim == null || this.f42943b.length() <= 0) {
                        return;
                    }
                    this.f42942a.m12872a(strTrim, this.f42943b.toString().trim());
                    this.f42945d = this.f42944c;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    prepareNext();
                    return hasNextPrepared();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.Iterator
                public i93 next() {
                    if (hasNextPrepared()) {
                        return this.f42942a;
                    }
                    throw new NoSuchElementException();
                }
            }

            public a(@efb String str) {
                this.f42941a = str;
            }

            @Override // java.lang.Iterable
            @efb
            public Iterator<i93> iterator() {
                return new C16451a();
            }
        }

        @Override // p000.h93
        @efb
        public Iterable<i93> parse(@efb String str) {
            return new a(str);
        }
    }

    @efb
    public static h93 create() {
        return new C6756b();
    }

    @efb
    public abstract Iterable<i93> parse(@efb String str);
}

package p000;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tw7
@nx4
public final class fc8 {

    /* JADX INFO: renamed from: e */
    public static final yv1 f36094e = yv1.anyOf(".。．｡");

    /* JADX INFO: renamed from: f */
    public static final azf f36095f = azf.m2775on(a18.f100c);

    /* JADX INFO: renamed from: g */
    public static final xj8 f36096g = xj8.m25234on(a18.f100c);

    /* JADX INFO: renamed from: h */
    public static final int f36097h = -1;

    /* JADX INFO: renamed from: i */
    public static final int f36098i = -2;

    /* JADX INFO: renamed from: j */
    public static final int f36099j = 127;

    /* JADX INFO: renamed from: k */
    public static final int f36100k = 253;

    /* JADX INFO: renamed from: l */
    public static final int f36101l = 63;

    /* JADX INFO: renamed from: m */
    public static final yv1 f36102m;

    /* JADX INFO: renamed from: n */
    public static final yv1 f36103n;

    /* JADX INFO: renamed from: o */
    public static final yv1 f36104o;

    /* JADX INFO: renamed from: p */
    public static final yv1 f36105p;

    /* JADX INFO: renamed from: a */
    public final String f36106a;

    /* JADX INFO: renamed from: b */
    public final kx7<String> f36107b;

    /* JADX INFO: renamed from: c */
    @ez8
    public int f36108c = -2;

    /* JADX INFO: renamed from: d */
    @ez8
    public int f36109d = -2;

    static {
        yv1 yv1VarAnyOf = yv1.anyOf("-_");
        f36102m = yv1VarAnyOf;
        yv1 yv1VarInRange = yv1.inRange('0', '9');
        f36103n = yv1VarInRange;
        yv1 yv1VarMo26362or = yv1.inRange(sjc.f82029s, sjc.f82011a).mo26362or(yv1.inRange(sjc.f82030t, sjc.f82012b));
        f36104o = yv1VarMo26362or;
        f36105p = yv1VarInRange.mo26362or(yv1VarMo26362or).mo26362or(yv1VarAnyOf);
    }

    public fc8(String name) {
        String lowerCase = i80.toLowerCase(f36094e.replaceFrom(name, a18.f100c));
        lowerCase = lowerCase.endsWith(".") ? lowerCase.substring(0, lowerCase.length() - 1) : lowerCase;
        v7d.checkArgument(lowerCase.length() <= 253, "Domain name too long: '%s':", lowerCase);
        this.f36106a = lowerCase;
        kx7<String> kx7VarCopyOf = kx7.copyOf(f36095f.split(lowerCase));
        this.f36107b = kx7VarCopyOf;
        v7d.checkArgument(kx7VarCopyOf.size() <= 127, "Domain has too many parts: '%s'", lowerCase);
        v7d.checkArgument(validateSyntax(kx7VarCopyOf), "Not a valid domain name: '%s'", lowerCase);
    }

    private fc8 ancestor(int levels) {
        xj8 xj8Var = f36096g;
        kx7<String> kx7Var = this.f36107b;
        return from(xj8Var.join(kx7Var.subList(levels, kx7Var.size())));
    }

    private int findSuffixOfType(z6c<sjd> desiredType) {
        int size = this.f36107b.size();
        for (int i = 0; i < size; i++) {
            String strJoin = f36096g.join(this.f36107b.subList(i, size));
            if (i > 0 && matchesType(desiredType, z6c.fromNullable(rjd.f78476b.get(strJoin)))) {
                return i - 1;
            }
            if (matchesType(desiredType, z6c.fromNullable(rjd.f78475a.get(strJoin)))) {
                return i;
            }
            if (rjd.f78477c.containsKey(strJoin)) {
                return i + 1;
            }
        }
        return -1;
    }

    @op1
    public static fc8 from(String domain) {
        return new fc8((String) v7d.checkNotNull(domain));
    }

    public static boolean isValid(String name) {
        try {
            from(name);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    private static boolean matchesType(z6c<sjd> desiredType, z6c<sjd> actualType) {
        return desiredType.isPresent() ? desiredType.equals(actualType) : actualType.isPresent();
    }

    private int publicSuffixIndex() {
        int i = this.f36108c;
        if (i != -2) {
            return i;
        }
        int iFindSuffixOfType = findSuffixOfType(z6c.absent());
        this.f36108c = iFindSuffixOfType;
        return iFindSuffixOfType;
    }

    private int registrySuffixIndex() {
        int i = this.f36109d;
        if (i != -2) {
            return i;
        }
        int iFindSuffixOfType = findSuffixOfType(z6c.m26593of(sjd.REGISTRY));
        this.f36109d = iFindSuffixOfType;
        return iFindSuffixOfType;
    }

    private static boolean validatePart(String part, boolean isFinalPart) {
        if (part.length() >= 1 && part.length() <= 63) {
            if (!f36105p.matchesAllOf(yv1.ascii().retainFrom(part))) {
                return false;
            }
            yv1 yv1Var = f36102m;
            if (!yv1Var.matches(part.charAt(0)) && !yv1Var.matches(part.charAt(part.length() - 1))) {
                return (isFinalPart && f36103n.matches(part.charAt(0))) ? false : true;
            }
        }
        return false;
    }

    private static boolean validateSyntax(List<String> parts) {
        int size = parts.size() - 1;
        if (!validatePart(parts.get(size), true)) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!validatePart(parts.get(i), false)) {
                return false;
            }
        }
        return true;
    }

    public fc8 child(String leftParts) {
        return from(((String) v7d.checkNotNull(leftParts)) + "." + this.f36106a);
    }

    public boolean equals(@wx1 Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof fc8) {
            return this.f36106a.equals(((fc8) object).f36106a);
        }
        return false;
    }

    public boolean hasParent() {
        return this.f36107b.size() > 1;
    }

    public boolean hasPublicSuffix() {
        return publicSuffixIndex() != -1;
    }

    public boolean hasRegistrySuffix() {
        return registrySuffixIndex() != -1;
    }

    public int hashCode() {
        return this.f36106a.hashCode();
    }

    public boolean isPublicSuffix() {
        return publicSuffixIndex() == 0;
    }

    public boolean isRegistrySuffix() {
        return registrySuffixIndex() == 0;
    }

    public boolean isTopDomainUnderRegistrySuffix() {
        return registrySuffixIndex() == 1;
    }

    public boolean isTopPrivateDomain() {
        return publicSuffixIndex() == 1;
    }

    public boolean isUnderPublicSuffix() {
        return publicSuffixIndex() > 0;
    }

    public boolean isUnderRegistrySuffix() {
        return registrySuffixIndex() > 0;
    }

    public fc8 parent() {
        v7d.checkState(hasParent(), "Domain '%s' has no parent", this.f36106a);
        return ancestor(1);
    }

    public kx7<String> parts() {
        return this.f36107b;
    }

    @wx1
    public fc8 publicSuffix() {
        if (hasPublicSuffix()) {
            return ancestor(publicSuffixIndex());
        }
        return null;
    }

    @wx1
    public fc8 registrySuffix() {
        if (hasRegistrySuffix()) {
            return ancestor(registrySuffixIndex());
        }
        return null;
    }

    public String toString() {
        return this.f36106a;
    }

    public fc8 topDomainUnderRegistrySuffix() {
        if (isTopDomainUnderRegistrySuffix()) {
            return this;
        }
        v7d.checkState(isUnderRegistrySuffix(), "Not under a registry suffix: %s", this.f36106a);
        return ancestor(registrySuffixIndex() - 1);
    }

    public fc8 topPrivateDomain() {
        if (isTopPrivateDomain()) {
            return this;
        }
        v7d.checkState(isUnderPublicSuffix(), "Not under a public suffix: %s", this.f36106a);
        return ancestor(publicSuffixIndex() - 1);
    }
}

package p000;

import java.net.InetAddress;
import java.text.ParseException;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@yg8
@nx4
public final class tl7 {

    /* JADX INFO: renamed from: a */
    public final String f85226a;

    private tl7(String canonicalForm) {
        this.f85226a = canonicalForm;
    }

    @op1
    public static tl7 from(String specifier) throws ParseException {
        try {
            return fromValid(specifier);
        } catch (IllegalArgumentException e) {
            ParseException parseException = new ParseException("Invalid host specifier: " + specifier, 0);
            parseException.initCause(e);
            throw parseException;
        }
    }

    public static tl7 fromValid(String specifier) {
        InetAddress inetAddressForString;
        sl7 sl7VarFromString = sl7.fromString(specifier);
        v7d.checkArgument(!sl7VarFromString.hasPort());
        String host = sl7VarFromString.getHost();
        try {
            inetAddressForString = a18.forString(host);
        } catch (IllegalArgumentException unused) {
            inetAddressForString = null;
        }
        if (inetAddressForString != null) {
            return new tl7(a18.toUriString(inetAddressForString));
        }
        fc8 fc8VarFrom = fc8.from(host);
        if (fc8VarFrom.hasPublicSuffix()) {
            return new tl7(fc8VarFrom.toString());
        }
        throw new IllegalArgumentException("Domain name does not have a recognized public suffix: " + host);
    }

    public static boolean isValid(String specifier) {
        try {
            fromValid(specifier);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public boolean equals(@wx1 Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof tl7) {
            return this.f85226a.equals(((tl7) other).f85226a);
        }
        return false;
    }

    public int hashCode() {
        return this.f85226a.hashCode();
    }

    public String toString() {
        return this.f85226a;
    }
}

package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class fwa extends RuntimeException {
    public fwa(final String library, final String[] wantedABIs, final String[] supportedABIs) {
        super("Could not find '" + library + "'. Looked for: " + Arrays.toString(wantedABIs) + ", but only found: " + Arrays.toString(supportedABIs) + ".");
    }
}

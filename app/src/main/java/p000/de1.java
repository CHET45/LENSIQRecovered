package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.browser.C0553R;
import androidx.browser.browseractions.BrowserServiceFileProvider;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class de1 extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final List<ce1> f29457a;

    /* JADX INFO: renamed from: b */
    public final Context f29458b;

    /* JADX INFO: renamed from: de1$a */
    public class RunnableC4761a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f29459a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C4763c f29460b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ja9 f29461c;

        public RunnableC4761a(String str, C4763c c4763c, ja9 ja9Var) {
            this.f29459a = str;
            this.f29460b = c4763c;
            this.f29461c = ja9Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmap;
            if (TextUtils.equals(this.f29459a, this.f29460b.f29465b.getText())) {
                try {
                    bitmap = (Bitmap) this.f29461c.get();
                } catch (InterruptedException | ExecutionException unused) {
                    bitmap = null;
                }
                if (bitmap != null) {
                    this.f29460b.f29464a.setVisibility(0);
                    this.f29460b.f29464a.setImageBitmap(bitmap);
                } else {
                    this.f29460b.f29464a.setVisibility(4);
                    this.f29460b.f29464a.setImageBitmap(null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: de1$b */
    public class ExecutorC4762b implements Executor {
        public ExecutorC4762b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@efb Runnable runnable) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: de1$c */
    public static class C4763c {

        /* JADX INFO: renamed from: a */
        public final ImageView f29464a;

        /* JADX INFO: renamed from: b */
        public final TextView f29465b;

        public C4763c(ImageView imageView, TextView textView) {
            this.f29464a = imageView;
            this.f29465b = textView;
        }
    }

    public de1(List<ce1> list, Context context) {
        this.f29457a = list;
        this.f29458b = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f29457a.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.f29457a.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C4763c c4763c;
        ce1 ce1Var = this.f29457a.get(i);
        if (view == null) {
            view = LayoutInflater.from(this.f29458b).inflate(C0553R.layout.browser_actions_context_menu_row, (ViewGroup) null);
            ImageView imageView = (ImageView) view.findViewById(C0553R.id.browser_actions_menu_item_icon);
            TextView textView = (TextView) view.findViewById(C0553R.id.browser_actions_menu_item_text);
            if (imageView == null || textView == null) {
                throw new IllegalStateException("Browser Actions fallback UI does not contain necessary Views.");
            }
            c4763c = new C4763c(imageView, textView);
            view.setTag(c4763c);
        } else {
            c4763c = (C4763c) view.getTag();
        }
        String title = ce1Var.getTitle();
        c4763c.f29465b.setText(title);
        if (ce1Var.getIconId() != 0) {
            c4763c.f29464a.setImageDrawable(f7e.getDrawable(this.f29458b.getResources(), ce1Var.getIconId(), null));
        } else if (ce1Var.getIconUri() != null) {
            ja9<Bitmap> ja9VarLoadBitmap = BrowserServiceFileProvider.loadBitmap(this.f29458b.getContentResolver(), ce1Var.getIconUri());
            ja9VarLoadBitmap.addListener(new RunnableC4761a(title, c4763c, ja9VarLoadBitmap), new ExecutorC4762b());
        } else {
            c4763c.f29464a.setImageBitmap(null);
            c4763c.f29464a.setVisibility(4);
        }
        return view;
    }
}
